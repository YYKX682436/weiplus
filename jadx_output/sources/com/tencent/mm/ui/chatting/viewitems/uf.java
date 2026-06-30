package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class uf extends com.tencent.mm.ui.chatting.viewitems.pf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f205680d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f205681e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f205682f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205683g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205684h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f205685i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f205686j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f205687k;

    @Override // com.tencent.mm.ui.chatting.viewitems.pf
    public void a(android.view.View view) {
        android.view.ViewStub viewStub;
        if (this.f205263a == null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.p3b)) != null) {
            viewStub.inflate();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f487367of5);
            this.f205263a = findViewById;
            this.f205684h = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById.findViewById(com.tencent.mm.R.id.obc);
            this.f205680d = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.cki);
            this.f205681e = this.f205263a.findViewById(com.tencent.mm.R.id.cks);
            this.f205682f = this.f205263a.findViewById(com.tencent.mm.R.id.f483436au4);
            this.f205683g = (com.tencent.mm.ui.widget.MMNeat7extView) this.f205263a.findViewById(com.tencent.mm.R.id.odc);
            this.f205685i = (android.widget.TextView) this.f205263a.findViewById(com.tencent.mm.R.id.f484095d02);
            this.f205686j = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.l3k);
            this.f205687k = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.cle);
        }
    }
}
