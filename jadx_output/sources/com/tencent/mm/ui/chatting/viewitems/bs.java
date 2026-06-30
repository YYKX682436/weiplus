package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class bs extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f203512b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.RelativeLayout f203513c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f203514d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f203515e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f203516f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f203517g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f203518h;

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view) {
        super.create(view);
        this.f203512b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bia);
        this.f203513c = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.bhz);
        this.f203514d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bht);
        this.f203515e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bi8);
        this.f203516f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bi9);
        this.f203517g = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.bhu);
        this.f203518h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bi_);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f203513c;
    }
}
