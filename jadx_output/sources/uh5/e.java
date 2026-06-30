package uh5;

/* loaded from: classes3.dex */
public final class e implements kk.h {
    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ChatMultiTypeCacheManager", "recycle thumb bitmap: " + bitmap + " path: " + str);
        bitmap.recycle();
    }
}
