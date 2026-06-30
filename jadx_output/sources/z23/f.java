package z23;

/* loaded from: classes10.dex */
public final class f implements z23.a {

    /* renamed from: a, reason: collision with root package name */
    public final e60.g1 f469738a;

    /* renamed from: b, reason: collision with root package name */
    public int f469739b;

    /* renamed from: c, reason: collision with root package name */
    public int f469740c;

    public f(e60.g1 config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f469738a = config;
    }

    public final android.graphics.Rect b(int i17, int i18, android.graphics.Rect rect) {
        if (rect.left < 0) {
            rect.left = 0;
        }
        if (rect.top < 0) {
            rect.top = 0;
        }
        if (rect.bottom < 0) {
            rect.bottom = 0;
        }
        if (rect.right < 0) {
            rect.right = 0;
        }
        if (rect.bottom > i18) {
            rect.bottom = i18;
        }
        if (rect.right > i17) {
            rect.right = i17;
        }
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0205 A[Catch: IOException -> 0x021f, TryCatch #4 {IOException -> 0x021f, blocks: (B:33:0x019f, B:35:0x01c0, B:37:0x01d6, B:39:0x01de, B:41:0x0205, B:45:0x0210, B:46:0x0217, B:106:0x01f0, B:108:0x01f8), top: B:32:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0567  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // z23.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e60.h1 a(java.lang.String r34, int r35, android.graphics.Matrix r36, android.graphics.Rect r37, android.graphics.Rect r38, android.graphics.Rect r39) {
        /*
            Method dump skipped, instructions count: 1643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z23.f.a(java.lang.String, int, android.graphics.Matrix, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):e60.h1");
    }

    public final android.graphics.Point d(float f17, float f18, int i17, int i18, float f19) {
        float f27 = i17 / 2.0f;
        float f28 = i18 / 2.0f;
        double d17 = (f19 / 180.0f) * 3.141592653589793d;
        double sin = java.lang.Math.sin(d17);
        double cos = java.lang.Math.cos(d17);
        double d18 = f17 - f27;
        double d19 = f18 - f28;
        java.lang.Float valueOf = java.lang.Float.valueOf((float) ((d18 * cos) - (d19 * sin)));
        java.lang.Float valueOf2 = java.lang.Float.valueOf((float) ((d18 * sin) + (d19 * cos)));
        return !(((f19 % 180.0f) > 0.0f ? 1 : ((f19 % 180.0f) == 0.0f ? 0 : -1)) == 0) ? new android.graphics.Point(a06.d.b(valueOf.floatValue() + f28), a06.d.b(valueOf2.floatValue() + f27)) : new android.graphics.Point(a06.d.b(valueOf.floatValue() + f27), a06.d.b(valueOf2.floatValue() + f28));
    }
}
