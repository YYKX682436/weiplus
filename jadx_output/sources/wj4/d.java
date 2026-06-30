package wj4;

/* loaded from: classes13.dex */
public final class d extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f446763a;

    /* renamed from: b, reason: collision with root package name */
    public final bi4.i1 f446764b;

    /* renamed from: c, reason: collision with root package name */
    public final float f446765c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f446766d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f446767e;

    /* renamed from: f, reason: collision with root package name */
    public int f446768f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f446769g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f446770h;

    /* renamed from: i, reason: collision with root package name */
    public long f446771i;

    /* renamed from: j, reason: collision with root package name */
    public wj4.b f446772j;

    public d(android.view.View view, bi4.i1 config, float f17) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f446763a = view;
        this.f446764b = config;
        this.f446765c = f17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setDither(true);
        this.f446766d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setDither(true);
        this.f446767e = paint2;
        this.f446768f = 255;
    }

    public static final void b(android.graphics.Bitmap bitmap, int i17, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.g0 g0Var2, kotlin.jvm.internal.g0 g0Var3, kotlin.jvm.internal.g0 g0Var4, int i18, int i19) {
        int g17 = e3.b.g(bitmap.getPixel(i18, i19), i17);
        g0Var.f310121d += android.graphics.Color.red(g17);
        g0Var2.f310121d += android.graphics.Color.green(g17);
        g0Var3.f310121d += android.graphics.Color.blue(g17);
        g0Var4.f310121d++;
    }

    public final java.lang.Integer a(android.graphics.Bitmap bitmap, boolean z17) {
        int i17 = z17 ? -16777216 : -1;
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
        kotlin.jvm.internal.g0 g0Var3 = new kotlin.jvm.internal.g0();
        kotlin.jvm.internal.g0 g0Var4 = new kotlin.jvm.internal.g0();
        int i18 = 3;
        int width = bitmap.getWidth() - 3;
        int height = bitmap.getHeight() - 3;
        int i19 = 3;
        while (true) {
            int i27 = 2;
            if (i19 >= width) {
                break;
            }
            int i28 = 0;
            while (i28 < i27) {
                int i29 = i17;
                int i37 = i28;
                int i38 = i19;
                b(bitmap, i29, g0Var, g0Var2, g0Var3, g0Var4, i19, i18 + i28);
                b(bitmap, i29, g0Var, g0Var2, g0Var3, g0Var4, i38, (height - 1) - i37);
                i28 = i37 + 1;
                i27 = i27;
                i19 = i38;
                i18 = 3;
            }
            i19++;
            i18 = 3;
        }
        int i39 = height - 2;
        for (int i47 = 5; i47 < i39; i47++) {
            int i48 = 0;
            while (i48 < 2) {
                int i49 = i17;
                int i57 = i48;
                b(bitmap, i49, g0Var, g0Var2, g0Var3, g0Var4, 3 + i48, i47);
                b(bitmap, i49, g0Var, g0Var2, g0Var3, g0Var4, (width - 1) - i57, i47);
                i48 = i57 + 1;
            }
        }
        long j17 = g0Var4.f310121d;
        if (j17 <= 0) {
            return null;
        }
        return java.lang.Integer.valueOf(android.graphics.Color.rgb((int) (g0Var.f310121d / j17), (int) (g0Var2.f310121d / j17), (int) (g0Var3.f310121d / j17)));
    }

    public final void c(android.graphics.Canvas canvas, float f17, int i17, android.graphics.Paint paint) {
        if (f17 <= 0.0f || android.graphics.Color.alpha(i17) <= 0) {
            return;
        }
        kotlin.jvm.internal.o.f(getBounds(), "getBounds(...)");
        float f18 = f17 / 2.0f;
        float f19 = r1.left + f18;
        float f27 = r1.top + f18;
        float f28 = r1.right - f18;
        float f29 = r1.bottom - f18;
        android.graphics.RectF rectF = (f28 <= f19 || f29 <= f27) ? null : new android.graphics.RectF(f19, f27, f28, f29);
        if (rectF == null) {
            return;
        }
        kotlin.jvm.internal.o.f(getBounds(), "getBounds(...)");
        float min = java.lang.Math.min(r1.width(), r1.height()) - f17;
        if (min < 0.0f) {
            min = 0.0f;
        }
        float f37 = min / 2.0f;
        float f38 = this.f446765c - f18;
        float min2 = java.lang.Math.min(f38 >= 0.0f ? f38 : 0.0f, f37);
        paint.setStrokeWidth(f17);
        if (this.f446768f < 255) {
            i17 = e3.b.i(i17, (android.graphics.Color.alpha(i17) * this.f446768f) / 255);
        }
        paint.setColor(i17);
        canvas.drawRoundRect(rectF, min2, min2, paint);
    }

    public final java.lang.String d(int i17) {
        java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "#%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        e(r0, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            bi4.i1 r0 = r6.f446764b
            java.lang.String r1 = "canvas"
            kotlin.jvm.internal.o.g(r7, r1)
            android.graphics.Rect r1 = r6.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            return
        L12:
            r1 = 0
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L58
            float r2 = r6.f446765c     // Catch: java.lang.Throwable -> L58
            wj4.b r3 = r6.f()     // Catch: java.lang.Throwable -> L58
            wj4.c r2 = r6.g(r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            int r3 = com.tencent.mm.sdk.platformtools.z.f193112h     // Catch: java.lang.Throwable -> L58
            r4 = 788529167(0x2f00000f, float:1.1641553E-10)
            r5 = 1
            if (r3 == r4) goto L2f
            r4 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r3 != r4) goto L2d
            goto L2f
        L2d:
            r3 = r1
            goto L30
        L2f:
            r3 = r5
        L30:
            if (r3 != 0) goto L3a
            boolean r3 = z65.c.a()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L39
            goto L3a
        L39:
            r5 = r1
        L3a:
            if (r5 == 0) goto L3f
            r6.e(r0, r2)     // Catch: java.lang.Throwable -> L58
        L3f:
            float r0 = r2.f446758f     // Catch: java.lang.Throwable -> L58
            int r3 = r2.f446759g     // Catch: java.lang.Throwable -> L58
            android.graphics.Paint r4 = r6.f446767e     // Catch: java.lang.Throwable -> L58
            r6.c(r7, r0, r3, r4)     // Catch: java.lang.Throwable -> L58
            float r0 = r2.f446756d     // Catch: java.lang.Throwable -> L58
            int r2 = r2.f446757e     // Catch: java.lang.Throwable -> L58
            android.graphics.Paint r3 = r6.f446766d     // Catch: java.lang.Throwable -> L58
            r6.c(r7, r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            jz5.f0 r7 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r7)     // Catch: java.lang.Throwable -> L58
            goto L63
        L58:
            r7 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r7)
        L63:
            java.lang.Throwable r7 = kotlin.Result.m524exceptionOrNullimpl(r7)
            if (r7 == 0) goto L72
            java.lang.String r0 = "applyCardStroke: draw foreground failed, skip this frame"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "StatusCardStrokeForegroundDrawable"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r7, r0, r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj4.d.draw(android.graphics.Canvas):void");
    }

    public final void e(bi4.i1 i1Var, wj4.c cVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(cVar.f446753a);
        sb6.append('|');
        boolean z17 = cVar.f446754b;
        sb6.append(z17);
        sb6.append('|');
        float f17 = cVar.f446756d;
        sb6.append(f17);
        sb6.append('|');
        float f18 = cVar.f446758f;
        sb6.append(f18);
        sb6.append('|');
        int i17 = cVar.f446757e;
        sb6.append(i17);
        sb6.append('|');
        int i18 = cVar.f446759g;
        sb6.append(i18);
        sb6.append('|');
        float f19 = cVar.f446755c;
        sb6.append(f19);
        sb6.append('|');
        java.util.Locale locale = java.util.Locale.ROOT;
        double d17 = cVar.f446761i;
        java.lang.String format = java.lang.String.format(locale, "%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append('|');
        int i19 = cVar.f446760h;
        sb6.append(i19);
        sb6.append('|');
        java.lang.String str = cVar.f446762j;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        if (kotlin.jvm.internal.o.b(sb7, this.f446769g)) {
            return;
        }
        this.f446769g = sb7;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("applyCardStroke: branch=");
        sb8.append(cVar.f446753a);
        sb8.append(", widthPx=");
        sb8.append(f17);
        sb8.append(", supportWidthPx=");
        sb8.append(f18);
        sb8.append(", primaryColor=");
        sb8.append(d(i17));
        sb8.append(", supportColor=");
        sb8.append(d(i18));
        sb8.append(", edgeColor=");
        sb8.append(d(i19));
        sb8.append(", contrast=");
        java.lang.String format2 = java.lang.String.format(locale, "%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d17)}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        sb8.append(format2);
        sb8.append(", source=");
        sb8.append(str);
        sb8.append(", cornerRadiusPx=");
        sb8.append(f19);
        sb8.append(", darkMode=");
        sb8.append(z17);
        com.tencent.mars.xlog.Log.i("StatusCardStrokeForegroundDrawable", sb8.toString());
    }

    public final wj4.b f() {
        java.lang.Object m521constructorimpl;
        wj4.b bVar;
        android.view.View view = this.f446763a;
        if (view == null) {
            return this.f446772j;
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return this.f446772j;
        }
        boolean C = com.tencent.mm.ui.bk.C();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(view.hashCode());
        sb6.append('|');
        sb6.append(view.getWidth());
        sb6.append('|');
        sb6.append(view.getHeight());
        sb6.append('|');
        sb6.append(C);
        java.lang.String sb7 = sb6.toString();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (kotlin.jvm.internal.o.b(sb7, this.f446770h) && (bVar = this.f446772j) != null && uptimeMillis - this.f446771i < 250) {
            return bVar;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(h(view, C));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        wj4.b bVar2 = (wj4.b) m521constructorimpl;
        if (bVar2 == null) {
            return this.f446772j;
        }
        this.f446770h = sb7;
        this.f446771i = uptimeMillis;
        this.f446772j = bVar2;
        return bVar2;
    }

    public final wj4.c g(bi4.i1 i1Var, float f17, wj4.b bVar) {
        java.lang.String str;
        java.lang.String str2;
        float f18 = i1Var.f21056a;
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        boolean z17 = false;
        boolean z18 = (i17 == 788529167 || i17 == 788529166) || z65.c.a();
        int i18 = i1Var.f21057b;
        if (z18) {
            bm5.o1 o1Var = bm5.o1.f22719a;
            java.lang.Float f19 = r26.g0.f(o1Var.l(new com.tencent.mm.repairer.config.textstatus.v4.RepairerConfigTextStatusCardDialogStrokeWidth()));
            if (f19 != null) {
                f18 = f19.floatValue();
            }
            java.lang.String l17 = o1Var.l(new com.tencent.mm.repairer.config.textstatus.v4.RepairerConfigTextStatusCardDialogStrokeColor());
            if (kotlin.jvm.internal.o.b(l17, "FG2")) {
                i18 = com.tencent.mm.R.color.FG_2;
            } else if (kotlin.jvm.internal.o.b(l17, "FG3")) {
                i18 = com.tencent.mm.R.color.FG_3;
            }
        }
        if (r2 < 1) {
            r2 = 1;
        }
        float f27 = r2;
        int color = b3.l.getColor(com.tencent.mm.sdk.platformtools.x2.f193071a, i18);
        boolean C = com.tencent.mm.ui.bk.C();
        int i19 = C ? -16777216 : -1;
        if (bVar != null) {
            i19 = bVar.f446751a;
        }
        int i27 = i19;
        int i28 = e3.b.i(color, 255);
        double d17 = e3.b.d(i28, i27);
        if (C && d17 < 2.4d) {
            z17 = true;
        }
        if (!z17) {
            return new wj4.c(bVar != null ? "base_sampled" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE, C, f17, f27, color, 0.0f, 0, i27, d17, (bVar == null || (str2 = bVar.f446752b) == null) ? "fallback_theme" : str2);
        }
        double d18 = e06.p.d((2.4d - d17) / 1.2d, 0.0d, 1.0d);
        float f28 = (float) d18;
        float f29 = f27 + 0.75f + (0.75f * f28);
        int a17 = a06.d.a(24 + (44 * d18));
        if (a17 > 80) {
            a17 = 80;
        }
        float f37 = (f28 * 0.3f) + 0.46f;
        if (f37 > 0.82f) {
            f37 = 0.82f;
        }
        return new wj4.c(bVar != null ? "boost_sampled" : "boost", true, f17, f27, color, f29, e3.b.i(e3.b.c(i28, -1, f37), a17), i27, d17, (bVar == null || (str = bVar.f446752b) == null) ? "fallback_theme" : str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final wj4.b h(android.view.View view, boolean z17) {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(24);
        arrayList.add(24);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/drawable/StatusCardStrokeForegroundDrawable", "sampleCardStrokeContentSnapshot", "(Landroid/view/View;Z)Lcom/tencent/mm/plugin/textstatus/ui/drawable/StatusCardStrokeForegroundDrawable$CardStrokeContentSnapshot;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        int i17 = 1;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/textstatus/ui/drawable/StatusCardStrokeForegroundDrawable", "sampleCardStrokeContentSnapshot", "(Landroid/view/View;Z)Lcom/tencent/mm/plugin/textstatus/ui/drawable/StatusCardStrokeForegroundDrawable$CardStrokeContentSnapshot;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            int width = view.getWidth();
            if (width < 1) {
                width = 1;
            }
            float f17 = 24.0f / width;
            int height = view.getHeight();
            if (height >= 1) {
                i17 = height;
            }
            canvas.scale(f17, 24.0f / i17);
            view.draw(canvas);
            java.lang.Integer a17 = a(createBitmap, z17);
            return a17 != null ? new wj4.b(a17.intValue(), "sampled") : null;
        } finally {
            createBitmap.recycle();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f446768f = e06.p.f(i17, 0, 255);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f446766d.setColorFilter(colorFilter);
        this.f446767e.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
