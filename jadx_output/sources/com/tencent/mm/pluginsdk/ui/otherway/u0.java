package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class u0 extends com.tencent.mm.pluginsdk.ui.otherway.v implements com.tencent.mm.pluginsdk.model.o2 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f190996o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f190997p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.n2 f190998q;

    /* renamed from: r, reason: collision with root package name */
    public final in5.u f190999r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Context context, com.tencent.mm.pluginsdk.model.g2 params, com.tencent.mm.pluginsdk.model.n3 n3Var) {
        super(context, params);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f190996o = "MicroMsg.OtherOpenWayAdapterBuilder";
        this.f190999r = new com.tencent.mm.pluginsdk.ui.otherway.t0(params, n3Var, this);
    }

    @Override // com.tencent.mm.pluginsdk.ui.otherway.v, w35.a
    public void a(java.util.ArrayList openWayList) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        kotlin.jvm.internal.o.g(openWayList, "openWayList");
        super.a(openWayList);
        if (!(!openWayList.isEmpty()) || (wxRecyclerAdapter = this.f190997p) == null) {
            return;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.pluginsdk.ui.otherway.v
    public java.lang.String h() {
        return this.f190996o;
    }

    public void m() {
        java.util.ArrayList arrayList = this.f191004e;
        if (arrayList != null) {
            this.f191005f = com.tencent.mm.pluginsdk.ui.otherway.h0.f190945a.f(arrayList, this.f191003d);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f190997p;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.E0(g());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f190997p;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
    }

    public void n(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f191001b.f189319l = null;
        l(context);
    }
}
