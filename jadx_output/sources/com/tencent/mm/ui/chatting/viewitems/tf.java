package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class tf extends com.tencent.mm.ui.chatting.viewitems.pf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f205583d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f205584e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f205585f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f205586g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205587h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205588i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f205589j;

    @Override // com.tencent.mm.ui.chatting.viewitems.pf
    public void a(android.view.View view) {
        android.view.ViewStub viewStub;
        if (this.f205263a == null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.p39)) != null) {
            viewStub.inflate();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bmf);
            this.f205263a = findViewById;
            this.f205583d = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.cki);
            this.f205584e = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.l3k);
            this.f205585f = this.f205263a.findViewById(com.tencent.mm.R.id.bqb);
            this.f205586g = (android.widget.TextView) this.f205263a.findViewById(com.tencent.mm.R.id.kvn);
            this.f205587h = (com.tencent.mm.ui.widget.MMNeat7extView) this.f205263a.findViewById(com.tencent.mm.R.id.mzp);
            this.f205588i = (com.tencent.mm.ui.widget.MMNeat7extView) this.f205263a.findViewById(com.tencent.mm.R.id.mz_);
            this.f205589j = this.f205263a.findViewById(com.tencent.mm.R.id.mzn);
        }
    }
}
