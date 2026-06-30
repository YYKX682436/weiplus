package g05;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g05.r f267481d;

    public o(g05.r rVar) {
        this.f267481d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        g05.r rVar = this.f267481d;
        java.util.List y57 = cj6.y5("gh_25d9ac85a4bc", ((java.lang.Number) ((jz5.n) rVar.f267487g).getValue()).intValue());
        kotlin.jvm.internal.o.f(y57, "getLastMsg(...)");
        java.util.Iterator it = y57.iterator();
        while (it.hasNext()) {
            ot0.q v17 = ot0.q.v(((com.tencent.mm.storage.f9) it.next()).U1());
            com.tencent.mm.pluginsdk.ui.tools.j0 j0Var = v17 != null ? (com.tencent.mm.pluginsdk.ui.tools.j0) v17.y(com.tencent.mm.pluginsdk.ui.tools.j0.class) : null;
            if ((j0Var != null ? j0Var.f191722c : null) != null && j0Var.f191721b != null) {
                java.lang.String frameSetName = j0Var.f191722c;
                kotlin.jvm.internal.o.f(frameSetName, "frameSetName");
                java.lang.String mbCardData = j0Var.f191721b;
                kotlin.jvm.internal.o.f(mbCardData, "mbCardData");
                rVar.Ni(frameSetName, mbCardData, new android.graphics.Rect(0, 0, rVar.wi(), 0), hq0.m0.f283032d);
            }
        }
    }
}
