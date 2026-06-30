package qx5;

/* loaded from: classes12.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367497d;

    public i0(java.lang.String str) {
        this.f367497d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.Thread.sleep(5000L);
        } catch (java.lang.InterruptedException e17) {
            by5.c4.d("XWebSavePageHelper", "savePage, sleep error:", e17);
        }
        java.lang.String str = this.f367497d;
        by5.f4.d(new java.io.File[]{new java.io.File(str)}, str + ".zip", -1);
    }
}
