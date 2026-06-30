package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f154002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f154003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        super(1);
        this.f154000d = h0Var;
        this.f154001e = h0Var2;
        this.f154002f = j0Var;
        this.f154003g = wxRecyclerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List data = (java.util.List) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f154000d.f310123d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f154001e.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        ((java.util.ArrayList) this.f154002f.f153931s).addAll(data);
        ((java.util.ArrayList) this.f154002f.f153930r).addAll(data);
        com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f154002f;
        if (j0Var.f153933u) {
            int intValue = ((java.lang.Number) ((jz5.n) j0Var.f311399q).getValue()).intValue();
            this.f154002f.getClass();
            if (intValue == 42 && (!data.isEmpty())) {
                sa5.d.e(this.f154003g, i65.a.h(this.f154002f.getActivity(), com.tencent.mm.R.dimen.f479672c9), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.profile.ui.mod.components.w(this.f154002f, this.f154003g));
        return jz5.f0.f302826a;
    }
}
