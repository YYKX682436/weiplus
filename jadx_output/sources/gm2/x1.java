package gm2;

/* loaded from: classes3.dex */
public final class x1 extends gm2.q {

    /* renamed from: g, reason: collision with root package name */
    public gm2.u1 f273525g;

    /* renamed from: h, reason: collision with root package name */
    public gm2.v1 f273526h;

    /* renamed from: i, reason: collision with root package name */
    public float f273527i;

    /* renamed from: m, reason: collision with root package name */
    public long f273528m;

    /* renamed from: n, reason: collision with root package name */
    public long f273529n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f273530o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        kotlin.jvm.internal.o.g(drawable, "drawable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if ((r5 == 0.0f) == false) goto L23;
     */
    @Override // gm2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.graphics.Canvas r26, float r27, int r28, int r29, int r30, android.graphics.Paint r31) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gm2.x1.b(android.graphics.Canvas, float, int, int, int, android.graphics.Paint):void");
    }

    @Override // gm2.q
    public void c(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        if (h().f273507f == null) {
            return;
        }
        float measureText = paint.measureText(this.f273462d.f273445j.toString());
        float f18 = r2.f273436a + f17;
        float f19 = r2.f273438c + f18 + r2.f273450o + r2.f273440e + measureText + r2.f273439d;
        int i27 = i19 - i17;
        int i28 = this.f273462d.f273443h;
        boolean z17 = false;
        float f27 = (i27 > i28 ? (i27 - i28) / 2 : 0) + i17;
        float f28 = f27 + i28;
        float f29 = f19 - f18;
        g();
        float f37 = 2;
        g();
        new android.graphics.Matrix();
        kotlin.jvm.internal.o.d(h().f273507f);
        float width = f18 - (r2.getWidth() / 2);
        kotlin.jvm.internal.o.d(h().f273507f);
        float height = r2.getHeight() / 2.0f;
        float f38 = (i17 + ((f28 - f27) / f37)) - height;
        int i29 = h().f273508g;
        if (80 <= i29 && i29 < 90) {
            f(canvas, paint, width + (g().f273492a * 0.35f), ((g().f273492a * 0.25f) + f27) - height, 0.9f, 0L);
            f(canvas, paint, width + (g().f273492a * 0.1f), ((g().f273492a * 0.55f) + f27) - height, 0.9f, 266L);
            float f39 = f28 - height;
            f(canvas, paint, g().f273492a + width + 20, f39, 1.2f, 532L);
            float f47 = width + f29;
            f(canvas, paint, (f47 - g().f273492a) - 18, (f27 - height) + f37, 1.0f, 798L);
            f(canvas, paint, (f47 - g().f273492a) - 5, f39, 1.2f, 1064L);
            return;
        }
        if (90 <= i29 && i29 < 100) {
            float f48 = f27 - height;
            f(canvas, paint, g().f273492a + width + 30, f48, 1.2f, 0L);
            float f49 = f29 + width;
            f(canvas, paint, (f49 - g().f273492a) - 15, f48, 1.2f, 266L);
            f(canvas, paint, width + (g().f273492a * 0.1f), f38 + 10, 1.2f, 532L);
            float f57 = f28 - height;
            f(canvas, paint, g().f273492a + width + 20, f57, 1.2f, 798L);
            float f58 = 5;
            f(canvas, paint, (f49 - g().f273492a) - f58, f57, 1.2f, 1064L);
            f(canvas, paint, (g().f273492a + width) - f58, f48 + (g().f273492a * 0.3f), 0.9f, 1330L);
            float f59 = 6;
            f(canvas, paint, width + g().f273492a + f59, (f48 + g().f273492a) - f59, 1.2f, 1596L);
            return;
        }
        if (100 <= i29 && i29 <= Integer.MAX_VALUE) {
            z17 = true;
        }
        if (z17) {
            float f66 = 5;
            float f67 = f38 - f66;
            f(canvas, paint, width + 3, f67, 0.9f, 0L);
            f(canvas, paint, width, f38, 1.2f, 266L);
            float f68 = f28 - height;
            f(canvas, paint, g().f273492a + width + f66, f68, 1.2f, 532L);
            float f69 = 15;
            f(canvas, paint, g().f273492a + width + f69, f68, 0.9f, 798L);
            float f76 = width + f29;
            f(canvas, paint, f76 - g().f273492a, f68, 1.2f, 1064L);
            float f77 = f27 - height;
            f(canvas, paint, f76 - g().f273492a, f77, 1.2f, 1330L);
            f(canvas, paint, (f76 - g().f273492a) - f69, f77, 1.2f, 1596L);
            float f78 = 10;
            f(canvas, paint, g().f273492a + width + f78, f38 - 8, 0.9f, 1862L);
            f(canvas, paint, g().f273492a + width + f78, f38, 1.2f, 2128L);
            f(canvas, paint, g().f273492a + width + 25, f38 + f66, 0.9f, 2394L);
            f(canvas, paint, width + (f29 / f37), f67, 0.8f, 2660L);
        }
    }

    public final void f(android.graphics.Canvas canvas, android.graphics.Paint paint, float f17, float f18, float f19, long j17) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate(f17, f18);
        long j18 = (this.f273528m - j17) % h().f273502a;
        if (j18 < 0) {
            j18 = 0;
        }
        float f27 = ((float) j18) / h().f273502a;
        if (f27 > 0.0f) {
            canvas.save();
            if (f27 < 0.5f) {
                float f28 = f19 * (f27 / 0.5f);
                kotlin.jvm.internal.o.d(h().f273507f);
                kotlin.jvm.internal.o.d(h().f273507f);
                matrix.preScale(f28, f28, r5.getWidth() / 2.0f, r6.getHeight() / 2.0f);
            } else {
                float f29 = f19 - ((int) (((f27 - 0.5f) / 0.5f) * f19));
                kotlin.jvm.internal.o.d(h().f273507f);
                kotlin.jvm.internal.o.d(h().f273507f);
                matrix.preScale(f29, f29, r5.getWidth() / 2.0f, r6.getHeight() / 2.0f);
            }
            android.graphics.Bitmap bitmap = h().f273507f;
            kotlin.jvm.internal.o.d(bitmap);
            canvas.drawBitmap(bitmap, matrix, paint);
            canvas.restore();
        }
    }

    public final gm2.u1 g() {
        gm2.u1 u1Var = this.f273525g;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.o.o("bgParams");
        throw null;
    }

    public final gm2.v1 h() {
        gm2.v1 v1Var = this.f273526h;
        if (v1Var != null) {
            return v1Var;
        }
        kotlin.jvm.internal.o.o("fgParams");
        throw null;
    }
}
