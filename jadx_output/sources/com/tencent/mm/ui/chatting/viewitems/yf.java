package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class yf extends com.tencent.mm.ui.chatting.viewitems.pf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f206081d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f206082e;

    @Override // com.tencent.mm.ui.chatting.viewitems.pf
    public void a(android.view.View view) {
        android.view.ViewStub viewStub;
        if (this.f205263a == null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.p3e)) != null) {
            viewStub.inflate();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bmz);
            this.f205263a = findViewById;
            this.f205264b = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.obc);
            this.f206082e = (android.widget.TextView) this.f205263a.findViewById(com.tencent.mm.R.id.o7z);
            this.f206081d = (android.widget.ImageView) this.f205263a.findViewById(com.tencent.mm.R.id.kwm);
        }
    }
}
