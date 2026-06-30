package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class wf extends com.tencent.mm.ui.chatting.viewitems.pf {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f205932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f205933e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f205934f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f205935g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f205936h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f205937i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205938j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205939k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f205940l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205941m;

    @Override // com.tencent.mm.ui.chatting.viewitems.pf
    public void a(android.view.View view) {
        android.view.ViewStub viewStub;
        if (this.f205263a == null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.s_o)) != null) {
            viewStub.inflate();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.rfg);
            this.f205263a = findViewById;
            this.f205932d = findViewById.findViewById(com.tencent.mm.R.id.rf8);
            java.util.List list = this.f205933e;
            if (((java.util.ArrayList) list).isEmpty()) {
                ((java.util.ArrayList) list).add((android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.rf_));
                ((java.util.ArrayList) list).add((android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.rfa));
                ((java.util.ArrayList) list).add((android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.rfb));
            }
            this.f205934f = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.l3k);
            this.f205935g = this.f205263a.findViewById(com.tencent.mm.R.id.rfc);
            this.f205936h = (android.widget.TextView) this.f205263a.findViewById(com.tencent.mm.R.id.cbj);
            this.f205937i = this.f205263a.findViewById(com.tencent.mm.R.id.rfe);
            this.f205938j = (com.tencent.mm.ui.widget.MMNeat7extView) this.f205263a.findViewById(com.tencent.mm.R.id.rfd);
            this.f205939k = (com.tencent.mm.ui.widget.MMNeat7extView) this.f205263a.findViewById(com.tencent.mm.R.id.rff);
            this.f205940l = this.f205263a.findViewById(com.tencent.mm.R.id.dy9);
            this.f205941m = (com.tencent.mm.ui.widget.MMNeat7extView) this.f205263a.findViewById(com.tencent.mm.R.id.s8g);
        }
    }
}
