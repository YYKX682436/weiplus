package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class kp extends com.tencent.mm.ui.widget.dialog.g2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.dp f132523e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f132524f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f132525g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f132526h;

    public kp(com.tencent.mm.plugin.finder.view.dp callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f132523e = callback;
        this.f132525g = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488822ak0, (android.view.ViewGroup) null, false);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) inflate.findViewById(com.tencent.mm.R.id.mzi);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$getView$1$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.view.kp kpVar = com.tencent.mm.plugin.finder.view.kp.this;
                return new com.tencent.mm.plugin.finder.view.fp(kpVar, new com.tencent.mm.plugin.finder.view.gp(kpVar));
            }
        }, this.f132525g, false);
        this.f132526h = wxRecyclerAdapter;
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f132526h;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.finder.view.hp(this);
        }
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.enx)).setOnClickListener(new com.tencent.mm.plugin.finder.view.ip(this));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f4n)).setOnClickListener(new com.tencent.mm.plugin.finder.view.jp(this));
        this.f132524f = inflate;
        return inflate;
    }
}
