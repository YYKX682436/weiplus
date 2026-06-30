package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class sf extends com.tencent.mm.ui.chatting.viewitems.pf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f205519d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f205520e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f205521f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f205522g;

    @Override // com.tencent.mm.ui.chatting.viewitems.pf
    public void a(android.view.View view) {
        android.view.ViewStub viewStub;
        if (this.f205263a == null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.p38)) != null) {
            viewStub.inflate();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bmd);
            this.f205263a = findViewById;
            this.f205520e = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.cki);
            this.f205264b = (android.widget.TextView) this.f205263a.findViewById(com.tencent.mm.R.id.obc);
            this.f205519d = (android.widget.TextView) this.f205263a.findViewById(com.tencent.mm.R.id.kxo);
            this.f205521f = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.kwm);
            this.f205522g = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.f487685pg1);
            this.f205265c = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.cl9);
        }
    }
}
