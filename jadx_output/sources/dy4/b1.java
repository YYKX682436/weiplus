package dy4;

/* loaded from: classes15.dex */
public final class b1 implements sf.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244610a;

    public b1(dy4.f1 f1Var) {
        this.f244610a = f1Var;
    }

    @Override // sf.e
    public void a(int i17) {
        dy4.f1 f1Var = this.f244610a;
        if (1 != i17) {
            f1Var.y();
            return;
        }
        sf.f fVar = f1Var.F;
        dy4.d dVar = fVar instanceof dy4.d ? (dy4.d) fVar : null;
        nw4.k kVar = dVar != null ? dVar.f244613a : null;
        if (kVar != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kVar.f340860a = context;
        }
        dy4.w wVar = f1Var.U;
        if (wVar != null) {
            dy4.d dVar2 = wVar.f244716b;
            nw4.k kVar2 = dVar2 != null ? dVar2.f244613a : null;
            if (kVar2 == null) {
                return;
            }
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            kVar2.f340860a = context2;
        }
    }

    @Override // sf.e
    public void b() {
        r45.n23 n23Var;
        dy4.f1 f1Var = this.f244610a;
        if (f1Var.M) {
            java.lang.String str = f1Var.B;
            if (!(str == null || str.length() == 0) && (n23Var = f1Var.C) != null) {
                com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.u.a(1, n23Var);
            }
        }
        f1Var.M = false;
        f1Var.x();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f1Var.Y;
        boolean z17 = atomicBoolean != null ? atomicBoolean.get() : false;
        f1Var.Y = null;
        if (f1Var.f244627n != null && f1Var.f244635u && z17) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "handleWebViewForeground runnable, video playing when enter background");
            f1Var.A(false, false);
        }
    }

    @Override // sf.e
    public void onDestroy() {
        this.f244610a.C();
    }
}
