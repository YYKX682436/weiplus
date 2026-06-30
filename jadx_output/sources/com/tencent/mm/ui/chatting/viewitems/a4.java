package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class a4 extends com.tencent.mm.ui.chatting.viewitems.g0 {
    public java.lang.String A;
    public int B;
    public ym5.w1 C;
    public java.lang.String F;
    public android.view.ViewGroup G;
    public android.view.ViewGroup H;
    public com.tencent.mm.chatting.component.ListScrollPAGView I;

    /* renamed from: J, reason: collision with root package name */
    public ym5.w1 f203257J;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f203258b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f203259c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f203260d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f203261e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f203262f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f203263g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f203264h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f203265i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f203266j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f203267k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f203268l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f203269m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f203270n;

    /* renamed from: r, reason: collision with root package name */
    public int f203274r;

    /* renamed from: s, reason: collision with root package name */
    public long f203275s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f203276t;

    /* renamed from: u, reason: collision with root package name */
    public int f203277u;

    /* renamed from: v, reason: collision with root package name */
    public int f203278v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.chatting.component.ListScrollPAGView f203279w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f203280x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f203281y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f203282z;

    /* renamed from: o, reason: collision with root package name */
    public int f203271o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f203272p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f203273q = 0;
    public boolean D = true;
    public boolean E = true;
    public boolean K = true;

    public com.tencent.mm.ui.chatting.viewitems.a4 a(android.view.View view, boolean z17) {
        super.create(view);
        this.f203268l = this.convertView.findViewById(com.tencent.mm.R.id.f483645bk4);
        this.timeTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483696br1);
        this.checkBox = (android.widget.CheckBox) this.convertView.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = this.convertView.findViewById(com.tencent.mm.R.id.bpa);
        this.userTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.brc);
        this.f203269m = this.convertView.findViewById(com.tencent.mm.R.id.gbh);
        this.f203258b = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.a3o);
        this.f203259c = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3u);
        this.f203260d = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3m);
        this.f203261e = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3y);
        this.clickArea = this.convertView.findViewById(com.tencent.mm.R.id.bkg);
        this.f203270n = this.convertView.findViewById(com.tencent.mm.R.id.bkj);
        this.f203263g = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.bn_);
        this.f203281y = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.bnb);
        this.f203280x = this.convertView.findViewById(com.tencent.mm.R.id.bnd);
        this.f203279w = (com.tencent.mm.chatting.component.ListScrollPAGView) this.convertView.findViewById(com.tencent.mm.R.id.bnc);
        this.G = (android.view.ViewGroup) this.convertView.findViewById(com.tencent.mm.R.id.jla);
        this.H = (android.view.ViewGroup) this.convertView.findViewById(com.tencent.mm.R.id.i3r);
        this.I = (com.tencent.mm.chatting.component.ListScrollPAGView) this.convertView.findViewById(com.tencent.mm.R.id.hxt);
        this.f203264h = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3x);
        this.f203262f = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3v);
        this.f203265i = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.bna);
        this.f203266j = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.a3w);
        this.f203267k = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.f483705bs4);
        this.f203271o = com.tencent.mm.ui.chatting.w5.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f203272p = (int) (i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479575r) * i65.a.m(com.tencent.mm.sdk.platformtools.x2.f193071a));
        this.f203273q = (int) (i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479628b3) * i65.a.m(com.tencent.mm.sdk.platformtools.x2.f193071a));
        this.f203274r = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f203270n;
    }
}
