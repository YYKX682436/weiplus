package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.u0 f190989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.pluginsdk.ui.otherway.u0 u0Var) {
        super(1);
        this.f190989d = u0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        com.tencent.mm.pluginsdk.ui.otherway.u0 u0Var = this.f190989d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = u0Var.f190997p;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.E0(u0Var.g());
        }
        com.tencent.mm.pluginsdk.model.n2 n2Var = u0Var.f190998q;
        if (n2Var != null) {
            n2Var.a(u0Var.f191005f.size());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = u0Var.f190997p;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
