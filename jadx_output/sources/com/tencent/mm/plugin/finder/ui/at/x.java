package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class x extends com.tencent.mm.plugin.finder.ui.at.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i17, com.tencent.mm.storage.z3 contact, int i18, java.lang.String groupId) {
        super(i17, contact, i18);
        java.lang.String z07;
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(groupId, "groupId");
        if (i18 == 3) {
            jz5.f0 f0Var = null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(contact.w0())) {
                com.tencent.mm.storage.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(groupId);
                z07 = z08 != null ? z08.z0(contact.d1()) : null;
            } else {
                z07 = contact.w0();
            }
            java.lang.String str = "";
            z07 = z07 == null ? "" : z07;
            this.f128909o = z07;
            if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
                java.lang.String f27 = contact.f2();
                kotlin.jvm.internal.o.f(f27, "getDisplayNick(...)");
                this.f128909o = f27;
            }
            java.lang.String str2 = this.f128909o;
            if (str2 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                str = str2.toUpperCase(locale);
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
                java.lang.String concat = upperCase.concat("\u007f");
                kotlin.jvm.internal.o.g(concat, "<set-?>");
                this.f128910p = concat;
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
            }
            if (f0Var == null) {
                java.lang.String concat2 = str.concat("\u007f");
                kotlin.jvm.internal.o.g(concat2, "<set-?>");
                this.f128910p = concat2;
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
            java.lang.String str3 = this.f128910p + str;
            kotlin.jvm.internal.o.g(str3, "<set-?>");
            this.f128910p = str3;
            int i19 = this.f128907m;
            java.lang.String valueOf = (i19 < 65 || i19 > 90) ? "#" : java.lang.String.valueOf((char) i19);
            kotlin.jvm.internal.o.g(valueOf, "<set-?>");
            this.f128908n = valueOf;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderGroupAtSomeoneLiveItem", "displayName:" + str + " showHeadCode:" + ((char) this.f128907m) + " compareContent:" + this.f128910p);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.t, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.t
    public void n() {
    }
}
