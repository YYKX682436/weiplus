package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class BitmapDescriptor {
    private final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator bitmapFormator;

    /* loaded from: classes13.dex */
    public interface BitmapFormator {

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes6.dex */
        public @interface BitmapFormatType {
            public static final int FORMAT_ASSET = 2;
            public static final int FORMAT_BITMAP = 7;
            public static final int FORMAT_BITMAPS = 10;
            public static final int FORMAT_DEFAULT = 5;
            public static final int FORMAT_DEFAULT_F = 6;
            public static final int FORMAT_FILE = 3;
            public static final int FORMAT_FONT_TEXT = 9;
            public static final int FORMAT_NONE = -1;
            public static final int FORMAT_PATH = 4;
            public static final int FORMAT_RESOURCE = 1;
            public static final int FORMAT_URL = 8;
        }

        int activeSize();

        android.graphics.Bitmap getBitmap(android.content.Context context);

        java.lang.String getBitmapId();

        int getFormateType();

        int getHeight();

        int getWidth();

        int nextActiveIndex();

        void recycle();

        void setScale(int i17);
    }

    public BitmapDescriptor(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator bitmapFormator) {
        this.bitmapFormator = bitmapFormator;
    }

    public final java.lang.String getBDId() {
        return this.bitmapFormator.getBitmapId();
    }

    public final android.graphics.Bitmap getBitmap(android.content.Context context) {
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator bitmapFormator = this.bitmapFormator;
        if (bitmapFormator == null) {
            return null;
        }
        return bitmapFormator.getBitmap(context);
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator getFormater() {
        return this.bitmapFormator;
    }

    public final int getHeight() {
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator bitmapFormator = this.bitmapFormator;
        if (bitmapFormator == null) {
            return 0;
        }
        return bitmapFormator.getHeight();
    }

    public final int getWidth() {
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator bitmapFormator = this.bitmapFormator;
        if (bitmapFormator == null) {
            return 0;
        }
        return bitmapFormator.getWidth();
    }
}
