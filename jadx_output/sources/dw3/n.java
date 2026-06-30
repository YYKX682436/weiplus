package dw3;

/* loaded from: classes4.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244237d;

    public n(java.lang.String str) {
        this.f244237d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exec delete filePath:");
        java.lang.String str = this.f244237d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", sb6.toString());
        com.tencent.mm.vfs.w6.f(str);
    }
}
