package zk3;

/* loaded from: classes8.dex */
public final class p0 implements kk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f473488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f473489b;

    public p0(java.lang.Object obj, zk3.w0 w0Var) {
        this.f473488a = obj;
        this.f473489b = w0Var;
    }

    @Override // kk3.d
    public void b(android.graphics.Bitmap bitmap, int i17) {
        zk3.w0 w0Var = this.f473489b;
        zk3.o0 o0Var = w0Var.f473521h;
        int i18 = w0Var.f473520g;
        o0Var.removeMessages(i18);
        o0Var.sendEmptyMessageDelayed(i18, i18);
        o0Var.removeMessages(0);
        o0Var.sendEmptyMessageDelayed(0, w0Var.f473519f);
        java.lang.Object obj = this.f473488a;
        if (obj instanceof kk3.d) {
            kk3.d.a((kk3.d) obj, bitmap, 0, 2, null);
        }
    }

    @Override // kk3.d
    public void d(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        java.lang.Object obj = this.f473488a;
        if (obj instanceof kk3.d) {
            kk3.d.c((kk3.d) obj, bitmap, false, 0, 6, null);
        }
        zk3.w0 w0Var = this.f473489b;
        w0Var.X6();
        w0Var.getRootView().setTranslationX(0.0f);
        android.content.Context context = w0Var.getRootView().getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).T6(false);
    }

    @Override // kk3.d
    public void e(int i17) {
        java.lang.Object obj = this.f473488a;
        if (obj instanceof kk3.d) {
            kk3.d.f((kk3.d) obj, 0, 1, null);
        }
        zk3.w0 w0Var = this.f473489b;
        w0Var.X6();
        android.content.Context context = w0Var.getRootView().getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).T6(true);
    }
}
