package com.thiraa.foodlabs.dapur_location.model;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.dapur_location.ListDapurAdapter;
import com.thiraa.foodlabs.dapur_location.connection.ApiCallback;
import com.thiraa.foodlabs.dapur_location.connection.ConnectionAPI;

import java.util.HashMap;
import java.util.Map;

public class FragmentBottomSheetLocation extends BottomSheetDialogFragment {

    TextView tvKitchenName, tvKitchenOpen, tvKitchenAddress;
    Button btnKitchenRating;
    ImageView ivKitchen;
    Context context;

    public FragmentBottomSheetLocation(){

    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_bottom_sheet_location,
                container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        context = getContext();

        setView(view);
        setEvent();
    }

    private void setEvent() {

    }

    private void setView(View view) {

        tvKitchenName = view.findViewById(R.id.tvKicthenName);
        tvKitchenOpen = view.findViewById(R.id.tvKitchenOpen);
        tvKitchenAddress = view.findViewById(R.id.tvKicthenAddress);
        btnKitchenRating = view.findViewById(R.id.btnKitchenRating);
        ivKitchen = view.findViewById(R.id.ivKitchen);
    }
}

