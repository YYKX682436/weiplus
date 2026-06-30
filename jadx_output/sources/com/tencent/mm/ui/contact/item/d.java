package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f206832a;

    /* renamed from: b, reason: collision with root package name */
    public final int f206833b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f206835d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f206836e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f206837f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f206838g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f206839h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f206840i;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f206848q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f206849r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f206850s;

    /* renamed from: t, reason: collision with root package name */
    public int f206851t;

    /* renamed from: u, reason: collision with root package name */
    public int f206852u;

    /* renamed from: v, reason: collision with root package name */
    public int f206853v;

    /* renamed from: w, reason: collision with root package name */
    public int f206854w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f206855x;

    /* renamed from: c, reason: collision with root package name */
    public boolean f206834c = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f206841j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f206842k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f206843l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f206844m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f206845n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f206846o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f206847p = false;

    static {
        int h17 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479897ia);
        int h18 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479853h2);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        textPaint.setTextSize(h17);
        textPaint2.setTextSize(h18);
    }

    public d(int i17, int i18) {
        this.f206832a = i17;
        this.f206833b = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseContactDataItem", "Create BaseContactDataItem viewType=%d | position=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public abstract void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar);

    public abstract com.tencent.mm.ui.contact.item.c b();

    public boolean c() {
        return false;
    }

    public boolean d() {
        return this.f206836e;
    }

    public android.text.SpannableString e(android.content.Context context, java.lang.String str, int i17) {
        return ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, i17);
    }
}
