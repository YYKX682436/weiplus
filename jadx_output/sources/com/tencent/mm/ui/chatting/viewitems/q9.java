package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class q9 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205329b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f205330c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f205331d;

    /* renamed from: e, reason: collision with root package name */
    public rl5.r f205332e;

    /* renamed from: f, reason: collision with root package name */
    public wl5.x f205333f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.y f205334g;

    /* renamed from: h, reason: collision with root package name */
    public wl5.u f205335h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f205336i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f205337j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.ViewStub f205338k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate f205339l;

    public com.tencent.mm.ui.chatting.viewitems.q9 a(android.view.View view, boolean z17) {
        super.create(view);
        this.f205329b = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.bkl);
        this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        this.f205330c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bjp);
        this.f205331d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bix);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.f205337j = view.findViewById(com.tencent.mm.R.id.bkj);
        this.f205338k = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.ojd);
        this.f205334g = new com.tencent.mm.pluginsdk.ui.span.y(this.f205329b, new com.tencent.mm.pluginsdk.ui.span.y0(this.f205329b.getContext()));
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f205329b;
    }
}
