package yt2;

/* loaded from: classes.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f465323d;

    public s(android.graphics.Bitmap bitmap) {
        this.f465323d = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f465323d;
        if (bitmap.isRecycled()) {
            return;
        }
        try {
            bitmap.recycle();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("Finder.SubsidyPriceCrossFade", "recycle snapshot failed: " + th6.getMessage());
        }
    }
}
