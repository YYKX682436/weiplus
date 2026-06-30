package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class qf extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f205351b;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f205354e;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.uf f205352c = new com.tencent.mm.ui.chatting.viewitems.uf();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f205353d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.xf f205355f = new com.tencent.mm.ui.chatting.viewitems.xf();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.tf f205356g = new com.tencent.mm.ui.chatting.viewitems.tf();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.wf f205357h = new com.tencent.mm.ui.chatting.viewitems.wf();

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.yf f205358i = new com.tencent.mm.ui.chatting.viewitems.yf();

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.sf f205359j = new com.tencent.mm.ui.chatting.viewitems.sf();

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.vf f205360k = new com.tencent.mm.ui.chatting.viewitems.vf();

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.rf f205361l = new com.tencent.mm.ui.chatting.viewitems.rf();

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f205351b;
        com.tencent.mm.ui.chatting.viewitems.of ofVar = new com.tencent.mm.ui.chatting.viewitems.of();
        ofVar.f205188a = view;
        ofVar.f205189b = view.findViewById(com.tencent.mm.R.id.ofy);
        ofVar.f205190c = view.findViewById(com.tencent.mm.R.id.chj);
        ofVar.f205191d = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.obc);
        ofVar.f205192e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ns9);
        ofVar.f205193f = view.findViewById(com.tencent.mm.R.id.ckn);
        ofVar.f205194g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cki);
        ofVar.f205195h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kwm);
        ofVar.f205196i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bov);
        ofVar.f205197j = view.findViewById(com.tencent.mm.R.id.api);
        ofVar.f205199l = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kvi);
        ofVar.f205198k = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kvn);
        linearLayout.addView(view, linearLayout.getChildCount());
        ((java.util.ArrayList) this.f205353d).add(ofVar);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f205351b;
    }
}
