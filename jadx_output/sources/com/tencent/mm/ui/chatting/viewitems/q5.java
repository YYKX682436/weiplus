package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class q5 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f205315b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f205316c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f205317d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f205318e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f205319f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f205320g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f205321h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f205322i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f205323j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f205324k;

    public com.tencent.mm.ui.chatting.viewitems.q5 a(android.view.View view) {
        super.create(view);
        this.f205315b = view.findViewById(com.tencent.mm.R.id.f486260kp1);
        this.f205316c = view.findViewById(com.tencent.mm.R.id.che);
        this.f205317d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483228a15);
        this.f205318e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a1o);
        this.f205319f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a1w);
        this.f205320g = view.findViewById(com.tencent.mm.R.id.pl6);
        this.f205321h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486338ky4);
        this.f205322i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kxt);
        this.f205323j = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487726pl3);
        this.f205324k = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ata);
        this.checkBox = (android.widget.CheckBox) this.convertView.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = this.convertView.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f205316c;
    }
}
