package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public interface TencentMapResource {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ResourceFrom {
        public static final int ASSET = -1;
        public static final int FILE = 2;
        public static final int JSON = 3;
        public static final int RAW = 1;
    }

    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(float f17, int i17);

    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(int i17);

    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(int i17, int i18);

    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(android.graphics.Bitmap bitmap, int i17);

    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(android.os.Parcelable parcelable, int i17);

    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(java.lang.String str, int i17);

    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(android.graphics.Bitmap[] bitmapArr, int i17);

    com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle getDefaultMyLocationStyle();

    int getScreenPixels();

    android.graphics.Typeface getTypeface();
}
