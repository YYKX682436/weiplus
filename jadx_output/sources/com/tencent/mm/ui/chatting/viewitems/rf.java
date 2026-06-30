package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class rf extends com.tencent.mm.ui.chatting.viewitems.pf {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f205425d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f205426e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f205427f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f205428g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f205429h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f205430i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget f205431j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget f205432k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f205433l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f205434m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f205435n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f205436o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f205437p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f205438q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f205439r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f205440s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f205441t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget f205442u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget f205443v;

    @Override // com.tencent.mm.ui.chatting.viewitems.pf
    public void a(android.view.View view) {
        android.view.ViewStub viewStub;
        if (this.f205263a == null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f487589p36)) != null) {
            viewStub.inflate();
            this.f205263a = view.findViewById(com.tencent.mm.R.id.bmc);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bmu);
            this.f205425d = findViewById;
            this.f205426e = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.boo);
            this.f205427f = (android.widget.ImageView) this.f205425d.findViewById(com.tencent.mm.R.id.bos);
            this.f205428g = (android.widget.TextView) this.f205425d.findViewById(com.tencent.mm.R.id.bot);
            this.f205429h = (android.widget.TextView) this.f205425d.findViewById(com.tencent.mm.R.id.bou);
            this.f205430i = (android.widget.TextView) this.f205425d.findViewById(com.tencent.mm.R.id.bor);
            this.f205431j = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) this.f205425d.findViewById(com.tencent.mm.R.id.f4x);
            this.f205432k = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) this.f205425d.findViewById(com.tencent.mm.R.id.exa);
            this.f205433l = view.findViewById(com.tencent.mm.R.id.bmt);
            this.f205434m = view.findViewById(com.tencent.mm.R.id.bmm);
            this.f205435n = (android.widget.ImageView) this.f205433l.findViewById(com.tencent.mm.R.id.bml);
            this.f205436o = this.f205433l.findViewById(com.tencent.mm.R.id.bmq);
            this.f205437p = (android.widget.TextView) this.f205433l.findViewById(com.tencent.mm.R.id.bmr);
            this.f205438q = (android.widget.TextView) this.f205433l.findViewById(com.tencent.mm.R.id.bms);
            this.f205439r = this.f205433l.findViewById(com.tencent.mm.R.id.bmn);
            this.f205440s = (android.widget.TextView) this.f205433l.findViewById(com.tencent.mm.R.id.bmo);
            this.f205441t = (android.widget.TextView) this.f205433l.findViewById(com.tencent.mm.R.id.bmp);
            this.f205442u = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) this.f205433l.findViewById(com.tencent.mm.R.id.f4x);
            this.f205443v = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) this.f205433l.findViewById(com.tencent.mm.R.id.exa);
        }
    }
}
