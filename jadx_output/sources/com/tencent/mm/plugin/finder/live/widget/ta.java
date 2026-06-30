package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ta {
    public ta(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        boolean P6 = n0Var != null ? n0Var.P6(xy2.c.e(context)) : true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openFromCurrentLive: hasSlice=");
        sb6.append(n0Var != null);
        sb6.append(", isInCoLive=");
        sb6.append(n0Var != null ? java.lang.Boolean.valueOf(n0Var.O6()) : null);
        sb6.append(", isInitiator=");
        sb6.append(P6);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", sb6.toString());
        re2.j1.f394437a.a();
        if (!P6) {
            com.tencent.mm.plugin.finder.live.widget.ra raVar = new com.tencent.mm.plugin.finder.live.widget.ra(context);
            raVar.H = n0Var;
            com.tencent.mm.plugin.finder.live.widget.e0.W(raVar, null, false, 0, 7, null);
        } else {
            com.tencent.mm.plugin.finder.live.widget.nb nbVar = new com.tencent.mm.plugin.finder.live.widget.nb(context);
            nbVar.H = n0Var;
            nbVar.V = com.tencent.mm.plugin.finder.live.widget.sa.f119745d;
            com.tencent.mm.plugin.finder.live.widget.e0.W(nbVar, null, false, 0, 7, null);
        }
    }
}
