package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class wb0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc0 f136334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var) {
        super(2);
        this.f136334d = nc0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String history = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(history, "history");
        ed0.a1 a1Var = (ed0.a1) i95.n0.c(ed0.a1.class);
        com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var = this.f136334d;
        ((com.tencent.mm.plugin.ringtone.uic.c3) ((dd0.m0) a1Var).Di(nc0Var.getActivity())).P6(3L, intValue);
        com.tencent.mm.plugin.finder.search.u5 u5Var = nc0Var.f135315m;
        if (u5Var == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        u5Var.f125900m = history;
        nc0Var.R6().getFtsEditText().n(history, null);
        nc0Var.R6().getFtsEditText().d();
        nc0Var.T6(history);
        return jz5.f0.f302826a;
    }
}
