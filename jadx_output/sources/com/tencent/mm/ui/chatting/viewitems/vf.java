package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class vf extends com.tencent.mm.ui.chatting.viewitems.pf {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205850d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205851e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f205852f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f205853g;

    @Override // com.tencent.mm.ui.chatting.viewitems.pf
    public void a(android.view.View view) {
        android.view.ViewStub viewStub;
        if (this.f205263a == null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.p3c)) != null) {
            viewStub.inflate();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bmv);
            this.f205263a = findViewById;
            this.f205850d = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById.findViewById(com.tencent.mm.R.id.s8a);
            this.f205851e = (com.tencent.mm.ui.widget.MMNeat7extView) this.f205263a.findViewById(com.tencent.mm.R.id.obc);
            this.f205852f = (android.widget.TextView) this.f205263a.findViewById(com.tencent.mm.R.id.o4c);
            this.f205853g = (android.widget.LinearLayout) this.f205263a.findViewById(com.tencent.mm.R.id.o4u);
        }
    }
}
