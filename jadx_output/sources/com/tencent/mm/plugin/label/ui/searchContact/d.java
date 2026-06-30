package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class d extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f143348d;

    /* renamed from: e, reason: collision with root package name */
    public p13.y f143349e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143350f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f143351g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f143352h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143353i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f143354m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f143355n;

    /* renamed from: o, reason: collision with root package name */
    public p13.r f143356o;

    public d(int i17) {
        this.f143348d = i17;
        java.util.regex.Pattern.compile(",");
        int h17 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479897ia);
        int h18 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479853h2);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        textPaint.setTextSize(h17);
        textPaint2.setTextSize(h18);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.tencent.mm.plugin.label.ui.searchContact.d other = (com.tencent.mm.plugin.label.ui.searchContact.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        com.tencent.mm.storage.z3 z3Var = this.f143354m;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.tencent.mm.storage.z3 z3Var2 = other.f143354m;
        return r26.i0.q(d17, z3Var2 != null ? z3Var2.d1() : null, false, 2, null);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.label.ui.searchContact.d other = (com.tencent.mm.plugin.label.ui.searchContact.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 2;
    }

    public final android.text.SpannableString n(android.content.Context context, java.lang.String str, int i17) {
        return ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, i17);
    }

    @Override // xm3.d
    public java.lang.String v() {
        com.tencent.mm.storage.z3 z3Var = this.f143354m;
        return java.lang.String.valueOf(z3Var != null ? z3Var.d1() : null);
    }
}
