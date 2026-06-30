package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class MyLocationConfig {
    private boolean myLocationEnabled = false;
    private com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource = null;
    private com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle = null;
    private com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener myLocationClickListener = null;
    private com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener myLocationChangeListener = null;

    /* loaded from: classes13.dex */
    public static class Builder {
        private final com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig myLocationConfig;

        public Builder(com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig myLocationConfig) {
            if (myLocationConfig != null) {
                this.myLocationConfig = myLocationConfig;
            } else {
                this.myLocationConfig = new com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig();
            }
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig build() {
            return this.myLocationConfig;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.Builder setLocationSource(com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource) {
            this.myLocationConfig.locationSource = locationSource;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.Builder setMyLocationChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
            this.myLocationConfig.myLocationChangeListener = onMyLocationChangeListener;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.Builder setMyLocationClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
            this.myLocationConfig.myLocationClickListener = onMyLocationClickListener;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.Builder setMyLocationEnabled(boolean z17) {
            this.myLocationConfig.myLocationEnabled = z17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.Builder setMyLocationStyle(com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle) {
            this.myLocationConfig.myLocationStyle = myLocationStyle;
            return this;
        }
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.Builder newBuilder() {
        return new com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.Builder(null);
    }

    public com.tencent.tencentmap.mapsdk.maps.LocationSource getLocationSource() {
        return this.locationSource;
    }

    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener getMyLocationChangeListener() {
        return this.myLocationChangeListener;
    }

    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener getMyLocationClickListener() {
        return this.myLocationClickListener;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle getMyLocationStyle() {
        return this.myLocationStyle;
    }

    public boolean isMyLocationEnabled() {
        return this.myLocationEnabled;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MyLocationConfig{myLocationEnabled=");
        sb6.append(this.myLocationEnabled);
        sb6.append(", locationSource=");
        sb6.append(this.locationSource != null);
        sb6.append(", myLocationStyle=");
        sb6.append(this.myLocationStyle != null);
        sb6.append(", myLocationClickListener=");
        sb6.append(this.myLocationClickListener != null);
        sb6.append(", myLocationChangeListener=");
        sb6.append(this.myLocationChangeListener != null);
        sb6.append('}');
        return sb6.toString();
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.Builder newBuilder(com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig myLocationConfig) {
        return new com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.Builder(myLocationConfig);
    }
}
