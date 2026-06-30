package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class jm extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f204273b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f204274c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f204275d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f204276e;

    /* renamed from: f, reason: collision with root package name */
    public int f204277f;

    public final com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View convertView, boolean z17) {
        kotlin.jvm.internal.o.g(convertView, "convertView");
        super.create(convertView);
        this.f204273b = (android.widget.ImageView) convertView.findViewById(com.tencent.mm.R.id.f483643bk2);
        this.timeTV = (android.widget.TextView) convertView.findViewById(com.tencent.mm.R.id.f483696br1);
        this.f204274c = (android.widget.TextView) convertView.findViewById(com.tencent.mm.R.id.br9);
        this.f204275d = (android.widget.TextView) convertView.findViewById(com.tencent.mm.R.id.brd);
        this.f204276e = (android.widget.TextView) convertView.findViewById(com.tencent.mm.R.id.bpv);
        this.userTV = (android.widget.TextView) convertView.findViewById(com.tencent.mm.R.id.brc);
        this.clickArea = convertView.findViewById(com.tencent.mm.R.id.bkg);
        this.checkBox = (android.widget.CheckBox) convertView.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = convertView.findViewById(com.tencent.mm.R.id.bpa);
        if (!z17) {
            this.stateIV = (android.widget.ImageView) convertView.findViewById(com.tencent.mm.R.id.bqx);
            this.uploadingPB = (android.widget.ProgressBar) convertView.findViewById(com.tencent.mm.R.id.ott);
        }
        this.f204277f = com.tencent.mm.ui.chatting.w5.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        return this;
    }
}
