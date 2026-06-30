package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public class t extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f128901d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f128902e;

    /* renamed from: f, reason: collision with root package name */
    public final int f128903f;

    /* renamed from: g, reason: collision with root package name */
    public p13.y f128904g;

    /* renamed from: h, reason: collision with root package name */
    public p13.r f128905h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f128906i;

    /* renamed from: m, reason: collision with root package name */
    public int f128907m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f128908n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f128909o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f128910p;

    public t(int i17, com.tencent.mm.storage.z3 contact, int i18) {
        kotlin.jvm.internal.o.g(contact, "contact");
        this.f128901d = i17;
        this.f128902e = contact;
        this.f128903f = i18;
        this.f128907m = 127;
        this.f128908n = "";
        this.f128909o = "";
        this.f128910p = "";
        n();
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.ui.at.t other = (com.tencent.mm.plugin.finder.ui.at.t) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f128902e, other.f128902e) && kotlin.jvm.internal.o.b(this.f128905h, other.f128905h) && this.f128906i == other.f128906i;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.ui.at.t other = (com.tencent.mm.plugin.finder.ui.at.t) obj;
        kotlin.jvm.internal.o.g(other, "other");
        int i17 = other.f128903f;
        int i18 = this.f128903f;
        int i19 = kotlin.jvm.internal.o.i(i18, i17);
        if (i19 != 0) {
            return i19;
        }
        if (i18 == 2) {
            return kotlin.jvm.internal.o.i(this.f128901d, other.f128901d);
        }
        int i27 = kotlin.jvm.internal.o.i(this.f128907m, other.f128907m);
        return i27 == 0 ? this.f128910p.compareTo(other.f128910p) : i27;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f128903f;
    }

    public void n() {
        java.lang.String str;
        jz5.f0 f0Var;
        if (this.f128903f == 1) {
            com.tencent.mm.storage.z3 z3Var = this.f128902e;
            java.lang.String w07 = !com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0()) ? z3Var.w0() : z3Var.f2();
            if (w07 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                str = w07.toUpperCase(locale);
                kotlin.jvm.internal.o.f(str, "toUpperCase(...)");
            } else {
                str = "";
            }
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String k17 = o13.n.k(str);
            char c17 = '{';
            if (k17 != null) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale2, "getDefault(...)");
                java.lang.String upperCase = k17.toUpperCase(locale2);
                kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
                this.f128910p = upperCase.concat("\u007f");
                char[] charArray = upperCase.toCharArray();
                kotlin.jvm.internal.o.f(charArray, "toCharArray(...)");
                java.lang.Character R = kz5.z.R(charArray, 0);
                char charValue = R != null ? R.charValue() : ' ';
                if ('a' <= charValue && charValue < '{') {
                    charValue = (char) (charValue - ' ');
                } else {
                    if (!('A' <= charValue && charValue < '[')) {
                        charValue = '{';
                    }
                }
                this.f128907m = charValue;
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                this.f128910p = str.concat("\u007f");
                char[] charArray2 = str.toCharArray();
                kotlin.jvm.internal.o.f(charArray2, "toCharArray(...)");
                java.lang.Character R2 = kz5.z.R(charArray2, 0);
                char charValue2 = R2 != null ? R2.charValue() : ' ';
                if ('a' <= charValue2 && charValue2 < '{') {
                    c17 = (char) (charValue2 - ' ');
                } else {
                    if ('A' <= charValue2 && charValue2 < '[') {
                        c17 = charValue2;
                    }
                }
                this.f128907m = c17;
            }
            this.f128910p += str;
            int i17 = this.f128907m;
            this.f128908n = (i17 < 65 || i17 > 90) ? "#" : java.lang.String.valueOf((char) i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderAtSomeoneLiveItem", "uiDisplayName:" + str + " showHeadCode:" + ((char) this.f128907m) + " compareContent:" + this.f128910p);
        }
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f128902e.d1() + '-' + this.f128903f;
    }
}
