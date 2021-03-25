package com.example.android.delhiguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MonumentFragment extends Fragment {

    int colorId = R.color.category_monuments;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.list,container,false);

        final ArrayList<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination("India Gate","Near Rajpath","Pragati Maidan","24 Hours Open","Nil","The India Gate (formerly known as the All India War Memorial) is a war memorial located astride the Rajpath, on the eastern edge of the \"ceremonial axis\" of New Delhi,[1] formerly called Kingsway. It stands as a memorial to 70,000 soldiers of the British Indian Army who died in between 1914 and 1921 in the First World War, in France, Flanders, Mesopotamia, Persia, East Africa, Gallipoli and elsewhere in the Near and the Far East, and the third Anglo-Afghan War. 13,300 servicemen's names, including some soldiers and officers from the United Kingdom, are inscribed on the gate.[2] Designed by Sir Edwin Lutyens, the gate evokes the architectural style of the triumphal arch such as the Arch of Constantine, in Rome, and is often compared to the Arc de Triomphe in Paris, and the Gateway of India in Mumbai","Following the Bangladesh Liberation war in 1972, a structure consisting of a black marble plinth with a reversed rifle, capped by a war helmet and bounded by four eternal flames, was built beneath the archway. This structure, called Amar Jawan Jyoti (Flame of the Immortal Soldier), has since 1971 served as India's tomb of the unknown soldier. India Gate is counted amongst the largest war memorials in India and every Republic Day, the Prime Minister visits the gate to pay their tributes to the Amar Jawan Jyoti, following which the Republic Day parade starts. The memorial-gate is also a popular spot for protests by the civil society in New Delhi.",R.drawable.india_gate));

        ListView listView = (ListView)fragmentView.findViewById(R.id.list);

        DestinationFragmentAdapter destinationAdapter = new DestinationFragmentAdapter(getActivity(),destinations);

        listView.setAdapter(destinationAdapter);
        listView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.category_monuments));

        return fragmentView;
    }
}
