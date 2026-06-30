package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyAutoScrollView extends android.widget.RelativeLayout implements com.tencent.mm.plugin.luckymoney.ui.i {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f145954d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f145955e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f145956f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f145957g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem f145958h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem f145959i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem f145960m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f145961n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.RelativeLayout f145962o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f145963p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f145964q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f145965r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f145966s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f145967t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f145968u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f145969v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f145970w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.l f145971x;

    public LuckyMoneyAutoScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f145967t = "0";
        this.f145968u = "0";
        this.f145969v = "0";
        this.f145970w = false;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.btz, this);
        this.f145954d = inflate;
        this.f145958h = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem) inflate.findViewById(com.tencent.mm.R.id.f482953sq);
        this.f145959i = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem) inflate.findViewById(com.tencent.mm.R.id.f482954sr);
        this.f145960m = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem) inflate.findViewById(com.tencent.mm.R.id.f482955ss);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem luckyMoneyAutoScrollItem = this.f145958h;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.s(luckyMoneyAutoScrollItem, 2);
        n3.u0.s(this.f145959i, 2);
        n3.u0.s(this.f145960m, 2);
        this.f145961n = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f482957su);
        this.f145962o = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f482958sw);
        this.f145963p = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f482959sx);
        this.f145964q = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.o4m);
        this.f145965r = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.o4n);
        this.f145966s = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.o4o);
        this.f145955e = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f485382hi2);
        this.f145956f = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f485383hi3);
        this.f145957g = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f485384hi4);
    }

    public void a() {
        this.f145958h.setVisibility(8);
        this.f145959i.setVisibility(8);
        this.f145960m.setVisibility(8);
        this.f145964q.setVisibility(0);
        this.f145965r.setVisibility(0);
        this.f145966s.setVisibility(0);
    }

    public void b() {
        this.f145970w = false;
        this.f145958h.setVisibility(0);
        this.f145959i.setVisibility(0);
        this.f145960m.setVisibility(0);
        this.f145964q.setVisibility(4);
        this.f145965r.setVisibility(4);
        this.f145966s.setVisibility(4);
    }

    public void c(int i17, int i18) {
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f145954d.getLayoutParams();
        layoutParams.height = i18;
        this.f145954d.setLayoutParams(layoutParams);
        this.f145954d.invalidate();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f145955e.getLayoutParams();
        layoutParams2.height = i18;
        layoutParams2.width = i17;
        this.f145955e.setLayoutParams(layoutParams2);
        this.f145955e.invalidate();
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f145956f.getLayoutParams();
        layoutParams3.height = i18;
        layoutParams3.width = i17;
        this.f145956f.setLayoutParams(layoutParams3);
        this.f145956f.invalidate();
        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.f145957g.getLayoutParams();
        layoutParams4.height = i18;
        layoutParams4.width = i17;
        layoutParams4.leftMargin = i65.a.b(getContext(), 3);
        this.f145957g.setLayoutParams(layoutParams4);
        this.f145957g.invalidate();
    }

    public void setFinalText(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: setting text: %s", str);
        this.f145967t = str.substring(0, 1);
        this.f145968u = str.substring(2, 3);
        this.f145969v = str.substring(3, 4);
        this.f145958h.setFinalNumber(com.tencent.mm.sdk.platformtools.t8.P(this.f145967t, 0));
        this.f145959i.setFinalNumber(com.tencent.mm.sdk.platformtools.t8.P(this.f145968u, 0));
        this.f145960m.setFinalNumber(com.tencent.mm.sdk.platformtools.t8.P(this.f145969v, 0));
        android.widget.ImageView imageView = this.f145964q;
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem.f145947m;
        imageView.setImageResource(((java.lang.Integer) sparseArray.get(com.tencent.mm.sdk.platformtools.t8.P(this.f145967t, 0))).intValue());
        this.f145965r.setImageResource(((java.lang.Integer) sparseArray.get(com.tencent.mm.sdk.platformtools.t8.P(this.f145968u, 0))).intValue());
        this.f145966s.setImageResource(((java.lang.Integer) sparseArray.get(com.tencent.mm.sdk.platformtools.t8.P(this.f145969v, 0))).intValue());
        this.f145964q.setVisibility(4);
        this.f145965r.setVisibility(4);
        this.f145966s.setVisibility(4);
        this.f145958h.setOnScrollEndListener(this);
        this.f145959i.setOnScrollEndListener(this);
        this.f145960m.setOnScrollEndListener(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: first: %s, second :%s, third: %s", this.f145967t, this.f145968u, this.f145969v);
    }

    public LuckyMoneyAutoScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
