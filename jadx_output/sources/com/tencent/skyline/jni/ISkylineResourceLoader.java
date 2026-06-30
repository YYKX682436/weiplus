package com.tencent.skyline.jni;

/* loaded from: classes7.dex */
public interface ISkylineResourceLoader {

    /* loaded from: classes7.dex */
    public interface BitmapLoadCallback {
        void onBitmapLoaded(android.graphics.Bitmap bitmap);
    }

    /* loaded from: classes7.dex */
    public interface ResourceLoadCallback {
        void onResourceLoaded(byte[] bArr);
    }

    android.graphics.Bitmap loadBitmap(java.lang.String str);

    void loadBitmapAsync(java.lang.String str, com.tencent.skyline.jni.ISkylineResourceLoader.BitmapLoadCallback bitmapLoadCallback);

    byte[] loadResource(java.lang.String str);

    void loadResourceAsync(java.lang.String str, com.tencent.skyline.jni.ISkylineResourceLoader.ResourceLoadCallback resourceLoadCallback);
}
