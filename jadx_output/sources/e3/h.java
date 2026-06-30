package e3;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final e3.p f247051a;

    /* renamed from: b, reason: collision with root package name */
    public static final x.g f247052b;

    static {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            f247051a = new e3.m();
        } else if (i17 >= 28) {
            f247051a = new e3.l();
        } else if (i17 >= 26) {
            f247051a = new e3.k();
        } else {
            if (e3.j.f247060c != null) {
                f247051a = new e3.j();
            } else {
                f247051a = new e3.i();
            }
        }
        f247052b = new x.g(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r0.equals(r4) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r6, d3.f r7, android.content.res.Resources r8, int r9, java.lang.String r10, int r11, int r12, d3.p r13, android.os.Handler r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.h.a(android.content.Context, d3.f, android.content.res.Resources, int, java.lang.String, int, int, d3.p, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static java.lang.String b(android.content.res.Resources resources, int i17, java.lang.String str, int i18, int i19) {
        return resources.getResourcePackageName(i17) + '-' + str + '-' + i18 + '-' + i17 + '-' + i19;
    }
}
