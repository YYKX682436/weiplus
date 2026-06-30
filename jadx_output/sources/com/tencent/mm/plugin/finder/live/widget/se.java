package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class se {

    /* renamed from: a */
    public final android.view.View f119753a;

    /* renamed from: b */
    public final java.lang.String f119754b;

    /* renamed from: c */
    public final java.lang.String f119755c;

    /* renamed from: d */
    public final com.tencent.mm.plugin.finder.live.plugin.po0 f119756d;

    /* renamed from: e */
    public yz5.l f119757e;

    /* renamed from: f */
    public yz5.l f119758f;

    /* renamed from: g */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f119759g;

    /* renamed from: h */
    public final android.widget.Button f119760h;

    /* renamed from: i */
    public final android.widget.Button f119761i;

    /* renamed from: j */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f119762j;

    /* renamed from: k */
    public final android.widget.TextView f119763k;

    /* renamed from: l */
    public final android.widget.TextView f119764l;

    /* renamed from: m */
    public final android.view.View f119765m;

    /* renamed from: n */
    public final android.widget.ImageView f119766n;

    /* renamed from: o */
    public final android.widget.TextView f119767o;

    /* renamed from: p */
    public final android.view.View f119768p;

    /* renamed from: q */
    public final android.widget.ImageView f119769q;

    /* renamed from: r */
    public final android.widget.TextView f119770r;

    /* renamed from: s */
    public int f119771s;

    /* renamed from: t */
    public r45.qp1 f119772t;

    /* renamed from: u */
    public int f119773u;

    /* renamed from: v */
    public long f119774v;

    public se(android.view.View root, java.lang.String anchorUsername, java.lang.String liveCoverUrl, com.tencent.mm.plugin.finder.live.plugin.po0 po0Var) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        kotlin.jvm.internal.o.g(liveCoverUrl, "liveCoverUrl");
        this.f119753a = root;
        this.f119754b = anchorUsername;
        this.f119755c = liveCoverUrl;
        this.f119756d = po0Var;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.did);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119759g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.dif);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById2;
        this.f119760h = button;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.die);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f119761i = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.dii);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        this.f119762j = weImageView;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.dig);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f119763k = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.dih);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById6;
        this.f119764l = textView;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.f483018fd0);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f119765m = findViewById7;
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.f482986tm);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f119766n = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.f483025fd4);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f119767o = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.qrf);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f119768p = findViewById10;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.qrd);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f119769q = (android.widget.ImageView) findViewById11;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.qrg);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f119770r = (android.widget.TextView) findViewById12;
        this.f119771s = 1;
        button.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ge(this));
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin += com.tencent.mm.ui.bl.h(root.getContext());
        weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.he(this));
        weImageView.post(new com.tencent.mm.plugin.finder.live.widget.ie(weImageView));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(button.getPaint(), 0.8f);
    }

    public static /* synthetic */ void d(com.tencent.mm.plugin.finder.live.widget.se seVar, int i17, r45.qp1 qp1Var, int i18, yz5.l lVar, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            qp1Var = null;
        }
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        seVar.c(i17, qp1Var, i18, lVar);
    }

    public static final void f(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.L1, jSONObject.toString(), null, 4, null);
    }

    public final android.text.SpannableString a(r45.qp1 qp1Var, int i17) {
        java.lang.String str;
        if (qp1Var != null) {
            java.lang.String string = qp1Var.getString(1);
            if (!(string == null || string.length() == 0)) {
                android.text.SpannableString hj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).hj(this.f119753a.getContext(), qp1Var.getString(1), i17, 1, null);
                kotlin.jvm.internal.o.f(hj6, "spanForSmileyAndLinkWithExtra(...)");
                return hj6;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLicenseText: error page is null, wording = ");
        sb6.append(qp1Var != null ? qp1Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveExceptionWidget", sb6.toString());
        if (qp1Var == null || (str = qp1Var.getString(1)) == null) {
            str = "";
        }
        return new android.text.SpannableString(str);
    }

    public final android.text.SpannableString b(java.lang.String str, java.lang.String str2) {
        int L = r26.n0.L(str, str2, 0, false, 6, null);
        int length = str2.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (L <= 0 || length > str.length()) {
            length = str.length();
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveExceptionWidget", "license text err,all string:" + str + ",license:" + str2);
            L = 0;
        }
        spannableString.setSpan(new com.tencent.mm.plugin.finder.live.widget.je(this), L, length, 33);
        return spannableString;
    }

    public final void c(int i17, r45.qp1 qp1Var, int i18, yz5.l lVar) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.le(this, i17, qp1Var, i18, lVar));
    }

    public final void e() {
        com.tencent.mm.plugin.finder.live.util.i.f115540a.b(this.f119754b, this.f119755c, this.f119753a, null);
    }

    public final void g() {
        android.view.View view = this.f119753a;
        view.setBackgroundColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
    }

    public /* synthetic */ se(android.view.View view, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.live.plugin.po0 po0Var, int i17, kotlin.jvm.internal.i iVar) {
        this(view, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? null : po0Var);
    }
}
