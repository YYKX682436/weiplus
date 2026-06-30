package f2;

/* loaded from: classes14.dex */
public final class z implements f2.y {
    @Override // f2.y
    public android.graphics.Typeface a(f2.r fontWeight, int i17) {
        kotlin.jvm.internal.o.g(fontWeight, "fontWeight");
        return c(null, fontWeight, i17);
    }

    @Override // f2.y
    public android.graphics.Typeface b(f2.s name, f2.r fontWeight, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(fontWeight, "fontWeight");
        return c(name.f258826b, fontWeight, i17);
    }

    public final android.graphics.Typeface c(java.lang.String str, f2.r rVar, int i17) {
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
        android.graphics.Typeface create = android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), rVar.f258825d, i17 == 1);
        kotlin.jvm.internal.o.f(create, "create(\n            fami…ontStyle.Italic\n        )");
        return create;
    }
}
