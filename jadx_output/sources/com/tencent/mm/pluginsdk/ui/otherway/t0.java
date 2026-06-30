package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class t0 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.g2 f190991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.n3 f190992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.u0 f190993f;

    public t0(com.tencent.mm.pluginsdk.model.g2 g2Var, com.tencent.mm.pluginsdk.model.n3 n3Var, com.tencent.mm.pluginsdk.ui.otherway.u0 u0Var) {
        this.f190991d = g2Var;
        this.f190992e = n3Var;
        this.f190993f = u0Var;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        com.tencent.mm.pluginsdk.ui.otherway.w data = (com.tencent.mm.pluginsdk.ui.otherway.w) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f191018h) {
            this.f190991d.f189319l = null;
            com.tencent.mm.pluginsdk.model.n3 n3Var = this.f190992e;
            if (n3Var != null) {
                n3Var.a();
            }
        }
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f190993f.c(context, data);
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        com.tencent.mm.pluginsdk.ui.otherway.w data = (com.tencent.mm.pluginsdk.ui.otherway.w) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.pluginsdk.ui.otherway.u0 u0Var = this.f190993f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = u0Var.f190997p;
        u0Var.k(wxRecyclerAdapter != null ? wxRecyclerAdapter.b0() : null, i17, com.tencent.mm.R.id.e1s, data.b(), new com.tencent.mm.pluginsdk.ui.otherway.s0(u0Var));
        return true;
    }
}
