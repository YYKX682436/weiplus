package com.tencent.tencentmap.mapsdk.map;

/* loaded from: classes13.dex */
public abstract class MapActivity extends androidx.fragment.app.FragmentActivity {
    private java.util.List<com.tencent.tencentmap.mapsdk.map.MapView> mapViewList = new java.util.ArrayList();
    private android.os.Bundle mysavedInstanceState;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.sdk.platformtools.t8.s(this, bundle);
        super.onCreate(bundle);
        this.mysavedInstanceState = bundle;
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        for (com.tencent.tencentmap.mapsdk.map.MapView mapView : this.mapViewList) {
            if (mapView != null) {
                mapView.onDestroy();
            }
        }
        this.mapViewList.clear();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        for (com.tencent.tencentmap.mapsdk.map.MapView mapView : this.mapViewList) {
            if (mapView != null) {
                mapView.onPause();
            }
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        for (com.tencent.tencentmap.mapsdk.map.MapView mapView : this.mapViewList) {
            if (mapView != null) {
                mapView.onRestart();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        for (com.tencent.tencentmap.mapsdk.map.MapView mapView : this.mapViewList) {
            if (mapView != null) {
                mapView.onResume();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        for (com.tencent.tencentmap.mapsdk.map.MapView mapView : this.mapViewList) {
            if (mapView != null) {
                mapView.onStart();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        for (com.tencent.tencentmap.mapsdk.map.MapView mapView : this.mapViewList) {
            if (mapView != null) {
                mapView.onStop();
            }
        }
    }

    public void setMapView(com.tencent.tencentmap.mapsdk.map.MapView mapView) {
        if (mapView != null) {
            this.mapViewList.add(mapView);
        }
    }
}
