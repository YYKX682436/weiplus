package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class t4 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f205554b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f205555c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f205556d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f205557e;

    /* renamed from: f, reason: collision with root package name */
    public int f205558f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f205559g = 0;

    public com.tencent.mm.ui.chatting.viewitems.t4 a(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483696br1);
        this.checkBox = (android.widget.CheckBox) this.convertView.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = this.convertView.findViewById(com.tencent.mm.R.id.bpa);
        this.userTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.brc);
        this.f205554b = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.a3o);
        this.f205555c = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3u);
        this.f205556d = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3m);
        this.f205557e = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3y);
        this.clickArea = this.convertView.findViewById(com.tencent.mm.R.id.bkg);
        this.f205558f = com.tencent.mm.ui.chatting.w5.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f205559g = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479597a7);
        i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479597a7);
        return this;
    }
}
