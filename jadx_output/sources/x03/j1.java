package x03;

/* loaded from: classes15.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f451062d;

    public j1(x03.p1 p1Var) {
        this.f451062d = p1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        x03.r1 u0Var;
        x03.p1 p1Var = this.f451062d;
        android.content.Context context = p1Var.f451088a;
        java.lang.String dataSource = p1Var.f451089b;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        if (r26.i0.y(dataSource, "preview://", false)) {
            u0Var = new x03.i0(context, dataSource);
        } else {
            java.lang.String o17 = new com.tencent.mm.vfs.r6(context.getCacheDir().toString() + "/flutter/MMVideo-" + dataSource.hashCode() + ".mp4").o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            u0Var = new x03.u0(context, o17);
        }
        p1Var.f451093f = u0Var;
        p1Var.f451093f.h(p1Var.f451090c);
        p1Var.f451093f.d(p1Var.f451092e);
        p1Var.f451094g = new android.view.Surface(p1Var.f451095h.surfaceTexture());
        p1Var.f451093f.setSurface(p1Var.f451094g);
        p1Var.f451093f.i();
        p1Var.f451093f.f(new x03.i1(this));
        p1Var.f451093f.prepare();
        x03.x0.f451161d.a().f451164b.e(p1Var.f451093f.getVideoPath(), kk.k.g(p1Var.f451093f.getVideoPath().getBytes()));
    }
}
