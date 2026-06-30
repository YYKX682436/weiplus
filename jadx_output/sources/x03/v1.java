package x03;

/* loaded from: classes15.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.w1 f451152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451153e;

    public v1(x03.w1 w1Var, java.lang.String str) {
        this.f451152d = w1Var;
        this.f451153e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x03.w1 w1Var = this.f451152d;
        if (com.tencent.mm.vfs.w6.j(w1Var.f451157e)) {
            com.tencent.mm.vfs.w6.x(w1Var.f451157e, w1Var.f451158f, true);
            java.lang.String str = w1Var.f451159g;
            try {
                w1Var.f451156d.onM3U8Ready(this.f451153e, com.tencent.mm.vfs.w6.M(w1Var.f451158f));
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e(w1Var.f451159g, "unable to parse m3u8 content");
            }
        }
    }
}
