package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;
    private static final java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMapContext> sTencentMapContextList = new java.util.concurrent.CopyOnWriteArrayList();
    private static final java.util.concurrent.atomic.AtomicInteger sAttachIndex = new java.util.concurrent.atomic.AtomicInteger(0);

    private BitmapDescriptorFactory() {
    }

    public static void attachMapContext(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext) {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMapContext> list = sTencentMapContextList;
        if (list.contains(tencentMapContext)) {
            return;
        }
        list.add(tencentMapContext);
        sAttachIndex.incrementAndGet();
    }

    private static android.graphics.Bitmap createBitmapFromBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            if (bitmap.isRecycled()) {
                return null;
            }
            return bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static android.graphics.Bitmap[] createBitmapFromBitmaps(android.graphics.Bitmap... bitmapArr) {
        int length = bitmapArr.length;
        android.graphics.Bitmap[] bitmapArr2 = new android.graphics.Bitmap[length];
        for (int i17 = 0; i17 < length; i17++) {
            try {
                bitmapArr2[i17] = createBitmapFromBitmap(bitmapArr[i17]);
            } catch (java.lang.Throwable unused) {
            }
        }
        return bitmapArr2;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor defaultMarker() {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return defaultMarker(activeMapContext);
        }
        return null;
    }

    public static void detachMapContext(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext) {
        if (sTencentMapContextList.remove(tencentMapContext)) {
            sAttachIndex.decrementAndGet();
        }
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromAsset(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromAsset(activeMapContext, str);
        }
        return null;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromBitmap(android.graphics.Bitmap bitmap) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromBitmap(activeMapContext, bitmap);
        }
        return null;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromBitmaps(android.graphics.Bitmap... bitmapArr) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromBitmaps(activeMapContext, bitmapArr);
        }
        return null;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromFile(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromFile(activeMapContext, str);
        }
        return null;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromPath(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromPath(activeMapContext, str);
        }
        return null;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromResource(int i17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromResource(activeMapContext, i17);
        }
        return null;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromView(android.view.View view) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromView(activeMapContext, view);
        }
        return null;
    }

    private static com.tencent.tencentmap.mapsdk.maps.TencentMapContext getActiveMapContext() {
        int i17 = sAttachIndex.get();
        if (i17 <= 0) {
            return null;
        }
        java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMapContext> list = sTencentMapContextList;
        if (i17 <= list.size()) {
            return list.get(i17 - 1);
        }
        return null;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor defaultMarker(float f17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return defaultMarker(activeMapContext, f17);
        }
        return null;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromAsset(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, java.lang.String str) {
        return tencentMapContext.createBitmapDescriptor(str, 2);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromBitmap(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return tencentMapContext.createBitmapDescriptor(createBitmapFromBitmap(bitmap), 7);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromBitmaps(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, android.graphics.Bitmap... bitmapArr) {
        if (tencentMapContext == null || bitmapArr == null) {
            return null;
        }
        return tencentMapContext.createBitmapDescriptor(createBitmapFromBitmaps(bitmapArr), 10);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromFile(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, java.lang.String str) {
        return tencentMapContext.createBitmapDescriptor(str, 3);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromPath(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, java.lang.String str) {
        return tencentMapContext.createBitmapDescriptor(str, 4);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromResource(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, int i17) {
        return tencentMapContext.createBitmapDescriptor(i17, 1);
    }

    public static synchronized com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromView(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, android.view.View view) {
        synchronized (com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.class) {
            if (view == null) {
                return null;
            }
            try {
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.buildDrawingCache();
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromBitmap = fromBitmap(tencentMapContext, view.getDrawingCache());
                view.destroyDrawingCache();
                return fromBitmap;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor defaultMarker(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext) {
        return tencentMapContext.createBitmapDescriptor(5);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor defaultMarker(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, float f17) {
        return tencentMapContext.createBitmapDescriptor(f17, 6);
    }
}
