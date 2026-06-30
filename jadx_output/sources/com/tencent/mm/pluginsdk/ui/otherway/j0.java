package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class j0 implements vh0.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.l0 f190967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.w f190968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f190969c;

    public j0(com.tencent.mm.pluginsdk.ui.otherway.l0 l0Var, com.tencent.mm.pluginsdk.ui.otherway.w wVar, in5.s0 s0Var) {
        this.f190967a = l0Var;
        this.f190968b = wVar;
        this.f190969c = s0Var;
    }

    @Override // vh0.a1
    public void a() {
        com.tencent.mm.pluginsdk.ui.otherway.l0 l0Var = this.f190967a;
        kb0.g gVar = l0Var.f190975f;
        if (gVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbo_ad_component_promotion", "view_clk", gVar.f306201e, 35480);
        }
        com.tencent.mm.pluginsdk.ui.otherway.a aVar = l0Var.f190974e;
        if (aVar != null) {
            aVar.b(new java.lang.ref.WeakReference(l0Var.f190976g));
        }
    }

    @Override // vh0.a1
    public void b() {
        com.tencent.mm.pluginsdk.ui.otherway.l0 l0Var = this.f190967a;
        kb0.g gVar = l0Var.f190975f;
        if (gVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbo_ad_component_uninterested", "view_clk", gVar.f306201e, 35480);
        }
        com.tencent.mm.pluginsdk.ui.otherway.a aVar = l0Var.f190974e;
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = this.f190968b;
        if (aVar != null) {
            aVar.a(wVar);
        }
        this.f190969c.f293122f.notifyDataSetChanged();
        wVar.f191023p = true;
    }
}
