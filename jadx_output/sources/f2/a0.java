package f2;

/* loaded from: classes14.dex */
public final class a0 implements f2.y {
    @Override // f2.y
    public android.graphics.Typeface a(f2.r fontWeight, int i17) {
        kotlin.jvm.internal.o.g(fontWeight, "fontWeight");
        return c(null, fontWeight, i17);
    }

    @Override // f2.y
    public android.graphics.Typeface b(f2.s name, f2.r fontWeight, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(fontWeight, "fontWeight");
        java.lang.String name2 = name.f258826b;
        kotlin.jvm.internal.o.g(name2, "name");
        int i18 = fontWeight.f258825d / 100;
        boolean z17 = false;
        if (i18 >= 0 && i18 < 2) {
            str = name2.concat("-thin");
        } else {
            if (2 <= i18 && i18 < 4) {
                str = name2.concat("-light");
            } else {
                if (i18 != 4) {
                    if (i18 == 5) {
                        str = name2.concat("-medium");
                    } else {
                        if (!(6 <= i18 && i18 < 8)) {
                            if (8 <= i18 && i18 < 11) {
                                str = name2.concat("-black");
                            }
                        }
                    }
                }
                str = name2;
            }
        }
        android.graphics.Typeface typeface = null;
        if (!(str.length() == 0)) {
            android.graphics.Typeface c17 = c(str, fontWeight, i17);
            if (!kotlin.jvm.internal.o.b(c17, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, f2.c.a(fontWeight, i17))) && !kotlin.jvm.internal.o.b(c17, c(null, fontWeight, i17))) {
                z17 = true;
            }
            if (z17) {
                typeface = c17;
            }
        }
        return typeface == null ? c(name2, fontWeight, i17) : typeface;
    }

    public final android.graphics.Typeface c(java.lang.String str, f2.r rVar, int i17) {
        boolean z17 = true;
        if (i17 == 0) {
            f2.r rVar2 = f2.r.f258818e;
            if (kotlin.jvm.internal.o.b(rVar, f2.r.f258822i)) {
                if (str == null || str.length() == 0) {
                    android.graphics.Typeface DEFAULT = android.graphics.Typeface.DEFAULT;
                    kotlin.jvm.internal.o.f(DEFAULT, "DEFAULT");
                    return DEFAULT;
                }
            }
        }
        int a17 = f2.c.a(rVar, i17);
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            android.graphics.Typeface defaultFromStyle = android.graphics.Typeface.defaultFromStyle(a17);
            kotlin.jvm.internal.o.f(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        android.graphics.Typeface create = android.graphics.Typeface.create(str, a17);
        kotlin.jvm.internal.o.f(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }
}
