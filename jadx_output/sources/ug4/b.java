package ug4;

/* loaded from: classes3.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "reportLiveAdsAction";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        oe0.v vVar;
        xu2.u uVar;
        xu2.v vVar2;
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt("liveAdAction", 0);
        if (optInt <= 0) {
            h(-1, "liveAdAction is null");
            return;
        }
        xg4.p pVar = (xg4.p) this.f317890a;
        if (pVar != null && (vVar = pVar.C) != null) {
            com.tencent.mm.plugin.finder.live.plugin.cj cjVar = ((com.tencent.mm.plugin.finder.live.plugin.bj) vVar).f112041a;
            com.tencent.mars.xlog.Log.i(cjVar.f112160h, "[setFinderBubbleCallback] action=" + optInt);
            qo0.c cVar = cjVar.f112158f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.getPlugin(xu2.u.class)) != null && (vVar2 = uVar.f457232r) != null) {
                vVar2.c(optInt);
            }
        }
        k();
    }
}
