package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f154144g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        super(1);
        this.f154141d = h0Var;
        this.f154142e = h0Var2;
        this.f154143f = i0Var;
        this.f154144g = wxRecyclerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List data = (java.util.List) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f154141d.f310123d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f154142e.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        ((java.util.ArrayList) this.f154143f.f154072s).addAll(data);
        ((java.util.ArrayList) this.f154143f.f154071r).addAll(data);
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var = this.f154143f;
        if (i0Var.f154074u) {
            int intValue = ((java.lang.Number) ((jz5.n) i0Var.f311486q).getValue()).intValue();
            this.f154143f.getClass();
            if (intValue == 42 && (!data.isEmpty())) {
                sa5.d.e(this.f154144g, i65.a.h(this.f154143f.getActivity(), com.tencent.mm.R.dimen.f479672c9), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.v(this.f154143f, this.f154144g));
        return jz5.f0.f302826a;
    }
}
