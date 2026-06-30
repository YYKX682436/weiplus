package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public final class i6 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.k6 f208906d;

    public i6(com.tencent.mm.ui.k6 k6Var) {
        this.f208906d = k6Var;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        ra0.b0 state = (ra0.b0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        boolean z17 = this.f208906d.f209033a.f196653t.f420461g;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreTopStoryRedLogic", "isExpose: " + z17 + ", action: " + state.f298066d);
        com.tencent.mm.ui.k6 k6Var = this.f208906d;
        j75.d dVar = state.f298066d;
        if (dVar == null || !(dVar instanceof sa0.i)) {
            return;
        }
        sa0.i iVar = (sa0.i) dVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start process ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("NewLifeShowFindRedDotAction(redDotCacheData=");
        r45.fv4 fv4Var = iVar.f405251b;
        sb7.append(fv4Var != null ? fv4Var.toJSON() : null);
        sb7.append(", isNewLifeRedDot=");
        sb7.append(iVar.f405252c);
        sb7.append(", tipsInfo=");
        r45.qv4 qv4Var = iVar.f405253d;
        sb7.append(qv4Var != null ? qv4Var.toJSON() : null);
        sb7.append(", source='");
        sb7.append(iVar.f405254e);
        sb7.append("')");
        sb6.append(sb7.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreTopStoryRedLogic", sb6.toString());
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.h6(k6Var, iVar, false, ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri(), z17));
    }
}
