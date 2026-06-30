package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class k4 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f204299b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f204300c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f204301d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f204302e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f204303f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f204304g;

    /* renamed from: h, reason: collision with root package name */
    public int f204305h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f204306i = 0;

    public com.tencent.mm.ui.chatting.viewitems.k4 a(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483696br1);
        this.checkBox = (android.widget.CheckBox) this.convertView.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = this.convertView.findViewById(com.tencent.mm.R.id.bpa);
        this.userTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.brc);
        this.f204299b = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.convertView.findViewById(com.tencent.mm.R.id.a3o);
        this.f204300c = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3u);
        this.f204301d = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3m);
        this.f204302e = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3y);
        this.clickArea = this.convertView.findViewById(com.tencent.mm.R.id.bkg);
        this.f204303f = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.bma);
        this.f204304g = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.bmb);
        this.f204305h = com.tencent.mm.ui.chatting.w5.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f204306i = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479597a7);
        i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479597a7);
        return this;
    }
}
