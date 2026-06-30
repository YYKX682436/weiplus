package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class ac0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc0 f133769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var) {
        super(2);
        this.f133769d = nc0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String suggestion = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(suggestion, "suggestion");
        com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var = this.f133769d;
        com.tencent.mars.xlog.Log.i(nc0Var.f135309d, "onSuggestion Click :".concat(suggestion));
        ((com.tencent.mm.plugin.ringtone.uic.c3) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Di(nc0Var.getActivity())).P6(2L, intValue);
        nc0Var.R6().getFtsEditText().n(suggestion, null);
        nc0Var.R6().getFtsEditText().d();
        com.tencent.mm.plugin.finder.search.m5 m5Var = nc0Var.f135316n;
        if (m5Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        m5Var.a(suggestion);
        nc0Var.T6(suggestion);
        return jz5.f0.f302826a;
    }
}
