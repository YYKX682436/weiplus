package com.tencent.mm.ui.chatting.atsomeone;

/* loaded from: classes.dex */
public final class b extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f198467d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f198468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f198469f;

    /* renamed from: g, reason: collision with root package name */
    public p13.r f198470g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f198471h;

    /* renamed from: i, reason: collision with root package name */
    public final int f198472i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f198473m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f198474n;

    public b(int i17, com.tencent.mm.storage.z3 contact, int i18, com.tencent.mm.storage.a3 a3Var, int i19, kotlin.jvm.internal.i iVar) {
        jz5.f0 f0Var = null;
        a3Var = (i19 & 8) != 0 ? null : a3Var;
        kotlin.jvm.internal.o.g(contact, "contact");
        this.f198467d = i17;
        this.f198468e = contact;
        this.f198469f = i18;
        this.f198472i = 127;
        java.lang.String str = "";
        this.f198473m = "";
        this.f198474n = "";
        if (i18 == 2) {
            java.lang.String w07 = !com.tencent.mm.sdk.platformtools.t8.K0(contact.w0()) ? contact.w0() : a3Var != null ? a3Var.z0(contact.d1()) : null;
            w07 = com.tencent.mm.sdk.platformtools.t8.K0(w07) ? contact.f2() : w07;
            if (w07 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                str = w07.toUpperCase(locale);
                kotlin.jvm.internal.o.f(str, "toUpperCase(...)");
            }
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String k17 = o13.n.k(str);
            char c17 = '{';
            if (k17 != null) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale2, "getDefault(...)");
                java.lang.String upperCase = k17.toUpperCase(locale2);
                kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
                this.f198474n = upperCase.concat("\u007f");
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
                this.f198472i = charValue;
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                this.f198474n = str.concat("\u007f");
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
                this.f198472i = c17;
            }
            java.lang.String str2 = this.f198474n + str;
            this.f198474n = str2;
            int i27 = this.f198472i;
            this.f198473m = (i27 < 65 || i27 > 90) ? "#" : java.lang.String.valueOf((char) i27);
            com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeoneLiveItem", "uiDisplayName:" + str + " showHeadCode:" + ((char) this.f198472i) + " compareContent:" + str2);
        }
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.atsomeone.b other = (com.tencent.mm.ui.chatting.atsomeone.b) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f198468e, other.f198468e) && kotlin.jvm.internal.o.b(this.f198470g, other.f198470g) && this.f198471h == other.f198471h;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.atsomeone.b other = (com.tencent.mm.ui.chatting.atsomeone.b) obj;
        kotlin.jvm.internal.o.g(other, "other");
        int i17 = other.f198469f;
        int i18 = this.f198469f;
        int i19 = kotlin.jvm.internal.o.i(i18, i17);
        if (i19 != 0) {
            return i19;
        }
        if (i18 == 1) {
            return kotlin.jvm.internal.o.i(this.f198467d, other.f198467d);
        }
        int i27 = kotlin.jvm.internal.o.i(this.f198472i, other.f198472i);
        return i27 == 0 ? this.f198474n.compareTo(other.f198474n) : i27;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f198469f;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f198468e.d1() + '-' + this.f198469f;
    }
}
