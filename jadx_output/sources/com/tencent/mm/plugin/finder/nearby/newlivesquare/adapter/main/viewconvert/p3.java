package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class p3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.e0 f121880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121881b;

    public p3(vp2.e0 e0Var, in5.s0 s0Var) {
        this.f121880a = e0Var;
        this.f121881b = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.h32 h32Var = (r45.h32) this.f121880a.f438917d.getCustom(0);
        int i17 = h32Var != null ? h32Var.getInteger(1) == 0 ? 0 : 1 : -1;
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        in5.s0 s0Var = this.f121881b;
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
        lVarArr[3] = new jz5.l("live_square_notice_action_type", java.lang.Integer.valueOf(i17));
        return kz5.c1.k(lVarArr);
    }
}
