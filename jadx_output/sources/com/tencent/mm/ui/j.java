package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f208968a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f208969b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f208970c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f208971d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f208972e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f208973f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f208974g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f208975h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f208976i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.ViewGroup f208977j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f208978k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.ImageView f208979l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f208980m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f208981n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f208982o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f208983p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f208984q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f208985r;

    /* renamed from: t, reason: collision with root package name */
    public final int f208987t;

    /* renamed from: s, reason: collision with root package name */
    public int f208986s = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f208988u = true;

    public j(android.view.View view) {
        this.f208987t = 0;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        view.setLayoutParams(layoutParams);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obn);
        this.f208971d = textView;
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.osp);
        this.f208972e = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obr);
        this.f208973f = textView3;
        this.f208974g = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.obp);
        this.f208975h = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.obo);
        android.widget.TextView textView4 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nqs);
        this.f208976i = textView4;
        this.f208977j = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.nqu);
        this.f208978k = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.nqt);
        this.f208980m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nxp);
        this.f208979l = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486060k10);
        this.f208981n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486298ku4);
        this.f208982o = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ld9);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.actionbar_up_indicator);
        this.f208968a = findViewById;
        this.f208969b = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.a4p);
        android.widget.TextView textView5 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482487fv);
        this.f208970c = textView5;
        this.f208983p = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.lst);
        this.f208984q = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ova);
        this.f208987t = i65.a.f(findViewById.getContext(), com.tencent.mm.R.dimen.ajt);
        findViewById.post(new com.tencent.mm.ui.g(this));
        this.f208985r = view;
        com.tencent.mm.ui.f.b(textView, com.tencent.mm.R.dimen.f479559b);
        com.tencent.mm.ui.f.b(textView4, com.tencent.mm.R.dimen.f479853h2);
        com.tencent.mm.ui.f.b(textView3, com.tencent.mm.R.dimen.f479628b3);
        com.tencent.mm.ui.f.b(textView5, com.tencent.mm.R.dimen.f479559b);
        if (textView2 != null) {
            com.tencent.mm.ui.f.b(textView2, com.tencent.mm.R.dimen.f479628b3);
            com.tencent.mm.ui.bk.s0(textView2.getPaint());
        }
    }

    public void a(int i17) {
        if (i17 == 0) {
            i17 = com.tencent.mm.R.raw.arrow_left_regular;
        }
        android.widget.TextView textView = this.f208970c;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f208969b;
        if (weImageView != null && i17 != 0) {
            weImageView.s(i17, com.tencent.mm.R.color.FG_0);
            weImageView.setVisibility(0);
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        textView.setVisibility(8);
        weImageView.setVisibility(0);
    }

    public void b(int i17) {
        if (i17 == 0) {
            i17 = com.tencent.mm.R.string.f490356so;
        }
        android.widget.TextView textView = this.f208970c;
        if (textView != null) {
            textView.setText(i17);
            textView.setVisibility(0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f208969b;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
        }
    }

    public void c(android.view.View.OnClickListener onClickListener) {
        this.f208968a.setOnClickListener(onClickListener);
    }

    public void d(boolean z17, boolean z18) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f208978k;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f208975h;
        if (z17) {
            weImageView2.setVisibility(8);
            weImageView.setVisibility(z18 ? 0 : 8);
            weImageView.setIconColor(this.f208976i.getCurrentTextColor());
        } else {
            weImageView2.setVisibility(z18 ? 0 : 8);
            weImageView.setVisibility(8);
            weImageView2.setIconColor(this.f208971d.getCurrentTextColor());
        }
    }

    public void e(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f208976i;
        if (charSequence == null || com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString())) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (i65.a.D(textView.getContext())) {
            textView.setTextSize(1, 14.0f);
            this.f208971d.setTextSize(1, 18.0f);
        }
    }

    public void f(int i17) {
        android.widget.TextView textView = this.f208971d;
        textView.setText(i17);
        if (com.tencent.mm.ui.f.a()) {
            com.tencent.mm.ui.f.b(textView, com.tencent.mm.R.dimen.f479559b);
        } else if (i65.a.D(textView.getContext())) {
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f479559b) * i65.a.m(textView.getContext()));
        }
    }

    public void g(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f208971d;
        textView.setText(charSequence);
        if (com.tencent.mm.ui.f.a()) {
            com.tencent.mm.ui.f.b(textView, com.tencent.mm.R.dimen.f479559b);
        } else if (i65.a.D(textView.getContext())) {
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f479559b) * i65.a.m(textView.getContext()));
        }
    }

    public void h(int i17) {
        android.widget.TextView textView = this.f208972e;
        if (textView != null) {
            if (i17 <= 0) {
                textView.setVisibility(8);
                return;
            }
            this.f208986s = i17;
            if (this.f208988u) {
                textView.setVisibility(0);
                textView.setText(java.lang.Integer.toString(i17));
            }
        }
    }
}
