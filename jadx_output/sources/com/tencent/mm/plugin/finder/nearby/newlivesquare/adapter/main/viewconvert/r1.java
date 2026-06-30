package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class r1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121912a;

    public r1(in5.s0 s0Var) {
        this.f121912a = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        in5.s0 s0Var = this.f121912a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context2);
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context3);
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
        return kz5.c1.k(lVarArr);
    }
}
