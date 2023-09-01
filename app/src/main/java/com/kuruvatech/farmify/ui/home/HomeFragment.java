package com.kuruvatech.farmify.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kuruvatech.farmify.R;
import com.kuruvatech.farmify.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        List<HomeItem> phoneList = new ArrayList<>();
        phoneList.add(new HomeItem("Phone 1", "Brand 1", R.drawable.ic_menu_camera));
        phoneList.add(new HomeItem("Phone 2", "Brand 2", R.drawable.ic_menu_gallery));
        phoneList.add(new HomeItem("Phone 3", "Brand 3", R.drawable.ic_menu_camera));
        phoneList.add(new HomeItem("Phone 4", "Brand 4", R.drawable.ic_menu_gallery));
        phoneList.add(new HomeItem("Phone 5", "Brand 5", R.drawable.ic_menu_camera));
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
        HomeItemAdapter adapter = new HomeItemAdapter(phoneList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2)); // Set the number of columns in the grid
        recyclerView.setAdapter(adapter);
//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}