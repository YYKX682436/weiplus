package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class b7 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f203459b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f203460c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f203461d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f203462e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f203463f;

    public com.tencent.mm.ui.chatting.viewitems.b7 a(android.view.View view, boolean z17) {
        super.create(view);
        this.f203459b = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.f483643bk2);
        this.timeTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483696br1);
        this.f203460c = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.br9);
        this.f203461d = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.brd);
        this.f203462e = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.bpv);
        this.userTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.brc);
        this.clickArea = this.convertView.findViewById(com.tencent.mm.R.id.bkg);
        this.maskView = this.convertView.findViewById(com.tencent.mm.R.id.bpa);
        if (z17) {
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
            this.f203463f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqz);
        }
        com.tencent.mm.ui.chatting.w5.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        return this;
    }
}
