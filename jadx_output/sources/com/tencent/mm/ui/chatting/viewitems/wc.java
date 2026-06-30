package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class wc extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f205918b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f205919c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f205920d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f205921e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f205922f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f205923g;

    /* renamed from: h, reason: collision with root package name */
    public int f205924h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f205925i = false;

    public com.tencent.mm.ui.chatting.viewitems.wc a(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483696br1);
        this.checkBox = (android.widget.CheckBox) this.convertView.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = this.convertView.findViewById(com.tencent.mm.R.id.bpa);
        this.userTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.brc);
        this.f205921e = this.convertView.findViewById(com.tencent.mm.R.id.gbh);
        this.f205922f = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483268a46);
        this.f205923g = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a47);
        this.f205918b = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.f483267a45);
        this.f205919c = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483266a44);
        this.f205920d = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a48);
        this.f205924h = com.tencent.mm.ui.chatting.w5.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.ui.bk.r0(this.f205920d.getPaint(), 0.8f);
        return this;
    }
}
