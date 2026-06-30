package yf2;

/* loaded from: classes3.dex */
public final class m implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f461744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.o f461745e;

    public m(kotlin.jvm.internal.c0 c0Var, yf2.o oVar) {
        this.f461744d = c0Var;
        this.f461745e = oVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean G1 = zl2.r4.f473950a.G1((r45.q12) obj);
        kotlin.jvm.internal.c0 c0Var = this.f461744d;
        if (!c0Var.f310112d && G1) {
            yf2.o oVar = this.f461745e;
            mm2.y6 y6Var = (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) oVar.business(mm2.g1.class)).f329078s).getValue();
            if (y6Var.d() || pm0.v.z(y6Var.f329581e, 152)) {
                com.tencent.mars.xlog.Log.i("Finder.CoLiveController", "adjustVisibilityToPublicIfNeeded: visibilityMode=" + y6Var.f329581e + ", isChargeLive=" + y6Var.d() + ", force reset to Public");
                y6Var.i(null);
                y6Var.f329588l = java.lang.Boolean.FALSE;
                y6Var.f329589m = 0;
                y6Var.f329581e = 0;
                y6Var.f329583g.clear();
                y6Var.f329584h.clear();
                y6Var.f329585i.clear();
                java.util.List list = y6Var.f329580d;
                if (list != null) {
                    list.clear();
                }
                y6Var.j(null);
                android.content.Context O6 = oVar.O6();
                pf5.z zVar = pf5.z.f353948a;
                if (!(O6 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = (com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a((androidx.appcompat.app.AppCompatActivity) O6).e(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
                if (b8Var != null) {
                    b8Var.c7(false);
                }
                android.content.Context O62 = oVar.O6();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O62);
                e4Var.f211776c = oVar.O6().getString(com.tencent.mm.R.string.f493711oq4);
                e4Var.c();
            }
        }
        c0Var.f310112d = G1;
        return jz5.f0.f302826a;
    }
}
