package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class xf extends com.tencent.mm.ui.chatting.viewitems.pf {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205983d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f205984e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f205985f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f205986g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f205987h;

    @Override // com.tencent.mm.ui.chatting.viewitems.pf
    public void a(android.view.View view) {
        android.view.ViewStub viewStub;
        if (this.f205263a == null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.p3d)) != null) {
            viewStub.inflate();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bmx);
            this.f205263a = findViewById;
            this.f205985f = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.cki);
            this.f205265c = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.cl9);
            this.f205986g = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.l3k);
            this.f205983d = (com.tencent.mm.ui.widget.MMNeat7extView) this.f205263a.findViewById(com.tencent.mm.R.id.odf);
            this.f205984e = (android.widget.TextView) this.f205263a.findViewById(com.tencent.mm.R.id.o7z);
            this.f205987h = this.f205263a.findViewById(com.tencent.mm.R.id.bre);
        }
    }
}
