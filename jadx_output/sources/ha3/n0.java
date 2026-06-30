package ha3;

/* loaded from: classes15.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.o0 f279906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279907e;

    public n0(ha3.o0 o0Var, java.lang.String str) {
        this.f279906d = o0Var;
        this.f279907e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ha3.o0 o0Var = this.f279906d;
        if (com.tencent.mm.vfs.w6.j(o0Var.f279911e)) {
            com.tencent.mm.vfs.w6.x(o0Var.f279911e, o0Var.f279912f, true);
            java.lang.String str = o0Var.f279913g;
            try {
                o0Var.f279910d.onM3U8Ready(this.f279907e, com.tencent.mm.vfs.w6.M(o0Var.f279912f));
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e(o0Var.f279913g, "unable to parse m3u8 content");
            }
        }
    }
}
