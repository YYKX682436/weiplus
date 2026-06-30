package com.tencent.mm.plugin.walletlock.gesture.ui.widget;

/* loaded from: classes13.dex */
public class PatternLockView extends android.view.View {
    public float A;
    public float B;
    public boolean C;
    public long D;
    public final int E;
    public final int F;
    public float G;
    public float H;
    public com.tencent.mm.plugin.walletlock.gesture.ui.widget.a I;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f181327d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f181328e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f181329f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Matrix f181330g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f181331h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f181332i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f181333m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[][] f181334n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.walletlock.gesture.ui.widget.d f181335o;

    /* renamed from: p, reason: collision with root package name */
    public final int f181336p;

    /* renamed from: q, reason: collision with root package name */
    public final float f181337q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f181338r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f181339s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f181340t;

    /* renamed from: u, reason: collision with root package name */
    public int f181341u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.walletlock.gesture.ui.widget.b f181342v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Bitmap f181343w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Bitmap f181344x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Bitmap f181345y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Bitmap f181346z;

    public PatternLockView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f181327d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f181328e = paint2;
        this.f181329f = new android.graphics.Path();
        this.f181330g = new android.graphics.Matrix();
        this.f181331h = new android.graphics.Rect();
        this.f181332i = new android.graphics.Rect();
        this.f181333m = new java.util.ArrayList(9);
        this.f181334n = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, 3, 3);
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.d dVar = com.tencent.mm.plugin.walletlock.gesture.ui.widget.d.Square;
        this.f181335o = dVar;
        this.f181336p = 6;
        this.f181337q = 0.66f;
        this.f181338r = false;
        this.f181339s = true;
        this.f181340t = false;
        this.f181341u = isInEditMode() ? -1 : getResources().getColor(com.tencent.mm.R.color.f478502m);
        this.f181342v = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Correct;
        this.f181343w = null;
        this.f181344x = null;
        this.f181345y = null;
        this.f181346z = null;
        this.A = -1.0f;
        this.B = -1.0f;
        this.C = false;
        this.D = 0L;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu4.l.f24630a);
        this.f181339s = obtainStyledAttributes.getBoolean(4, this.f181339s);
        int i17 = obtainStyledAttributes.getInt(1, 200);
        int i18 = obtainStyledAttributes.getInt(2, 6);
        this.f181336p = i18;
        this.f181338r = obtainStyledAttributes.getBoolean(0, this.f181338r);
        int i19 = obtainStyledAttributes.getInt(3, 0);
        if (i19 == 0) {
            this.f181335o = dVar;
        } else if (i19 != 1) {
            this.f181335o = dVar;
        } else {
            this.f181335o = com.tencent.mm.plugin.walletlock.gesture.ui.widget.d.Rectangle;
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setDither(false);
        paint2.setAlpha(i17);
        paint.setAntiAlias(true);
        paint.setDither(true);
        if (isInEditMode()) {
            return;
        }
        android.graphics.Bitmap e17 = e(i65.a.i(getContext(), com.tencent.mm.R.drawable.afe));
        this.f181343w = e17;
        android.graphics.Bitmap e18 = e(i65.a.i(getContext(), j65.e.b() ? com.tencent.mm.R.drawable.afg : com.tencent.mm.R.drawable.aff));
        this.f181344x = e18;
        this.f181345y = e18;
        android.graphics.Bitmap e19 = e(i65.a.i(getContext(), j65.e.b() ? com.tencent.mm.R.drawable.afi : com.tencent.mm.R.drawable.afh));
        this.f181346z = e19;
        this.f181336p = (int) (i18 * com.tencent.mm.sdk.platformtools.x.l0().density);
        android.graphics.Bitmap[] bitmapArr = {e17, e18, e18, e19};
        for (int i27 = 0; i27 < 4; i27++) {
            android.graphics.Bitmap bitmap = bitmapArr[i27];
            this.E = java.lang.Math.max(bitmap.getWidth(), this.E);
            this.F = java.lang.Math.max(bitmap.getHeight(), this.F);
        }
    }

    public final void a() {
        for (int i17 = 0; i17 < 3; i17++) {
            for (int i18 = 0; i18 < 3; i18++) {
                this.f181334n[i17][i18] = false;
            }
        }
    }

    public void b() {
        this.f181333m.clear();
        a();
        this.f181342v = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Correct;
        invalidate();
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.a aVar = this.I;
        if (aVar != null) {
            aVar.onPatternCleared(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final hu4.k c(float r12, float r13) {
        /*
            r11 = this;
            float r0 = r11.H
            float r1 = r11.f181337q
            float r2 = r1 * r0
            int r3 = r11.getPaddingTop()
            float r3 = (float) r3
            float r4 = r0 - r2
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = r3 + r4
            r4 = 0
            r6 = r4
        L13:
            r7 = -1
            r8 = 3
            if (r6 >= r8) goto L27
            float r9 = (float) r6
            float r9 = r9 * r0
            float r9 = r9 + r3
            int r10 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r10 < 0) goto L24
            float r9 = r9 + r2
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 > 0) goto L24
            goto L28
        L24:
            int r6 = r6 + 1
            goto L13
        L27:
            r6 = r7
        L28:
            boolean[][] r13 = r11.f181334n
            r0 = 0
            if (r6 < 0) goto L59
            float r2 = r11.G
            float r1 = r1 * r2
            int r3 = r11.getPaddingLeft()
            float r3 = (float) r3
            float r9 = r2 - r1
            float r9 = r9 / r5
            float r3 = r3 + r9
        L39:
            if (r4 >= r8) goto L4c
            float r5 = (float) r4
            float r5 = r5 * r2
            float r5 = r5 + r3
            int r9 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r9 < 0) goto L49
            float r5 = r5 + r1
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 > 0) goto L49
            r7 = r4
            goto L4c
        L49:
            int r4 = r4 + 1
            goto L39
        L4c:
            if (r7 < 0) goto L59
            r12 = r13[r6]
            boolean r12 = r12[r7]
            if (r12 != 0) goto L59
            hu4.k r12 = hu4.k.a(r6, r7)
            goto L5a
        L59:
            r12 = r0
        L5a:
            if (r12 == 0) goto L7e
            int r0 = r12.f285232a
            r13 = r13[r0]
            int r0 = r12.f285233b
            r1 = 1
            r13[r0] = r1
            java.util.ArrayList r13 = r11.f181333m
            r13.add(r12)
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.a r0 = r11.I
            if (r0 == 0) goto L76
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r13)
            r0.onPatternGestureNodeJoin(r11, r2)
        L76:
            boolean r13 = r11.f181338r
            if (r13 == 0) goto L7d
            r11.performHapticFeedback(r1, r8)
        L7d:
            return r12
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.c(float, float):hu4.k");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.graphics.Canvas r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L3e
            boolean r12 = r8.f181339s
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r0 = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Wrong
            if (r12 != 0) goto Ld
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r12 = r8.f181342v
            if (r12 == r0) goto Ld
            goto L3e
        Ld:
            boolean r12 = r8.C
            if (r12 == 0) goto L14
            android.graphics.Bitmap r12 = r8.f181344x
            goto L40
        L14:
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r12 = r8.f181342v
            if (r12 != r0) goto L1b
            android.graphics.Bitmap r12 = r8.f181346z
            goto L40
        L1b:
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r0 = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Correct
            if (r12 == r0) goto L3b
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r0 = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Animate
            if (r12 != r0) goto L24
            goto L3b
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "unknown display mode "
            r10.<init>(r11)
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r11 = r8.f181342v
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L3b:
            android.graphics.Bitmap r12 = r8.f181345y
            goto L40
        L3e:
            android.graphics.Bitmap r12 = r8.f181343w
        L40:
            float r0 = r8.G
            float r1 = r8.H
            int r2 = r8.E
            float r3 = (float) r2
            float r0 = r0 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r3
            int r0 = (int) r0
            int r4 = r8.F
            float r5 = (float) r4
            float r1 = r1 - r5
            float r1 = r1 * r3
            int r1 = (int) r1
            android.content.res.Resources r3 = r8.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r5 = r8.G
            r6 = 1107558400(0x42040000, float:33.0)
            float r3 = r3 * r6
            float r5 = r5 - r3
            float r6 = (float) r2
            float r5 = r5 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r6)
            float r7 = r8.H
            float r7 = r7 - r3
            float r3 = (float) r4
            float r7 = r7 / r3
            float r3 = java.lang.Math.min(r7, r6)
            android.graphics.Matrix r6 = r8.f181330g
            int r10 = r10 + r0
            float r10 = (float) r10
            int r11 = r11 + r1
            float r11 = (float) r11
            r6.setTranslate(r10, r11)
            int r10 = r2 / 2
            float r10 = (float) r10
            int r11 = r4 / 2
            float r11 = (float) r11
            r6.preTranslate(r10, r11)
            r6.preScale(r5, r3)
            int r10 = -r2
            int r10 = r10 / 2
            float r10 = (float) r10
            int r11 = -r4
            int r11 = r11 / 2
            float r11 = (float) r11
            r6.preTranslate(r10, r11)
            boolean r10 = r8.isInEditMode()
            if (r10 != 0) goto L9e
            android.graphics.Paint r10 = r8.f181327d
            r9.drawBitmap(r12, r6, r10)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.d(android.graphics.Canvas, int, int, boolean):void");
    }

    public final android.graphics.Bitmap e(android.graphics.drawable.Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        android.graphics.Bitmap.Config config = drawable.getOpacity() != -1 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGB_565;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
        arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/gesture/ui/widget/PatternLockView", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/walletlock/gesture/ui/widget/PatternLockView", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final float f(int i17) {
        float paddingLeft = getPaddingLeft();
        float f17 = this.G;
        return paddingLeft + (i17 * f17) + (f17 * 0.5f);
    }

    public final float g(int i17) {
        float paddingTop = getPaddingTop();
        float f17 = this.H;
        return paddingTop + (i17 * f17) + (f17 * 0.5f);
    }

    public boolean getDisplayLine() {
        return this.f181339s;
    }

    public boolean getEnableHapticFeedback() {
        return this.f181338r;
    }

    public boolean getEnableInput() {
        return this.f181340t;
    }

    public java.util.List<hu4.k> getPattern() {
        return new java.util.ArrayList(this.f181333m);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return (int) ((this.F * 3.0d) / getResources().getDisplayMetrics().density);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return (int) ((this.E * 3.0d) / getResources().getDisplayMetrics().density);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        java.util.ArrayList arrayList = this.f181333m;
        int size = arrayList.size();
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.b bVar = this.f181342v;
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.b bVar2 = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Animate;
        boolean[][] zArr = this.f181334n;
        if (bVar == bVar2) {
            int elapsedRealtime = (((int) (android.os.SystemClock.elapsedRealtime() - this.D)) % ((size + 1) * 700)) / 700;
            a();
            for (int i17 = 0; i17 < elapsedRealtime; i17++) {
                hu4.k kVar = (hu4.k) arrayList.get(i17);
                zArr[kVar.f285232a][kVar.f285233b] = true;
            }
            if (elapsedRealtime > 0 && elapsedRealtime < size) {
                float f18 = (r9 % 700) / 700.0f;
                hu4.k kVar2 = (hu4.k) arrayList.get(elapsedRealtime - 1);
                float f19 = f(kVar2.f285233b);
                float g17 = g(kVar2.f285232a);
                hu4.k kVar3 = (hu4.k) arrayList.get(elapsedRealtime);
                float f27 = (f(kVar3.f285233b) - f19) * f18;
                float g18 = f18 * (g(kVar3.f285232a) - g17);
                this.A = f19 + f27;
                this.B = g17 + g18;
            }
            invalidate();
        }
        android.graphics.Paint paint = this.f181328e;
        paint.setColor(this.f181341u);
        paint.setStrokeWidth(this.f181336p);
        android.graphics.Path path = this.f181329f;
        path.rewind();
        boolean z17 = this.f181339s || this.f181342v == com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Wrong;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        float f28 = this.G;
        float f29 = this.H;
        android.graphics.Paint paint2 = this.f181327d;
        boolean z18 = (paint2.getFlags() & 2) != 0;
        paint2.setFilterBitmap(true);
        boolean z19 = z18;
        int i18 = 0;
        while (i18 < 3) {
            android.graphics.Paint paint3 = paint2;
            float f37 = paddingTop + (i18 * f29);
            float f38 = f29;
            int i19 = 0;
            for (int i27 = 3; i19 < i27; i27 = 3) {
                int i28 = paddingLeft;
                float f39 = paddingLeft + (i19 * f28);
                boolean z27 = zArr[i18][i19];
                if (z27) {
                    f17 = f28;
                } else {
                    f17 = f28;
                    d(canvas, (int) f39, (int) f37, z27);
                }
                i19++;
                paddingLeft = i28;
                f28 = f17;
            }
            i18++;
            paint2 = paint3;
            f29 = f38;
        }
        int i29 = paddingLeft;
        float f47 = f28;
        float f48 = f29;
        android.graphics.Paint paint4 = paint2;
        if (z17) {
            int i37 = 0;
            boolean z28 = false;
            while (i37 < size) {
                hu4.k kVar4 = (hu4.k) arrayList.get(i37);
                boolean[] zArr2 = zArr[kVar4.f285232a];
                int i38 = kVar4.f285233b;
                if (!zArr2[i38]) {
                    break;
                }
                float f49 = f(i38);
                float g19 = g(kVar4.f285232a);
                if (i37 == 0) {
                    path.moveTo(f49, g19);
                } else {
                    path.lineTo(f49, g19);
                }
                i37++;
                z28 = true;
            }
            if ((this.C || this.f181342v == bVar2) && z28) {
                path.lineTo(this.A, this.B);
            }
            canvas.drawPath(path, paint);
        }
        for (int i39 = 0; i39 < 3; i39++) {
            float f57 = paddingTop + (i39 * f48);
            int i47 = 0;
            while (i47 < 3) {
                int i48 = i29;
                float f58 = i48 + (i47 * f47);
                boolean z29 = zArr[i39][i47];
                if (z29) {
                    d(canvas, (int) f58, (int) f57, z29);
                }
                i47++;
                i29 = i48;
            }
        }
        paint4.setFilterBitmap(z19);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = java.lang.Math.max(size, suggestedMinimumWidth);
        } else if (mode != 0) {
            suggestedMinimumWidth = size;
        }
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = java.lang.Math.max(size2, suggestedMinimumHeight);
        } else if (mode2 != 0) {
            suggestedMinimumHeight = size2;
        }
        if (this.f181335o == com.tencent.mm.plugin.walletlock.gesture.ui.widget.d.Square) {
            suggestedMinimumWidth = java.lang.Math.min(suggestedMinimumWidth, suggestedMinimumHeight);
            suggestedMinimumHeight = suggestedMinimumWidth;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.SavedState savedState = (com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.b bVar = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Correct;
        java.lang.String str = savedState.f181347d;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Serialized pattern is null");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (byte b17 : str.getBytes()) {
            arrayList.add(hu4.k.a(b17 / 3, b17 % 3));
        }
        java.util.ArrayList arrayList2 = this.f181333m;
        arrayList2.clear();
        a();
        arrayList2.addAll(arrayList);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hu4.k kVar = (hu4.k) it.next();
            this.f181334n[kVar.f285232a][kVar.f285233b] = true;
        }
        setDisplayMode(bVar);
        this.f181342v = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.values()[savedState.f181348e];
        this.f181339s = savedState.f181349f;
        this.f181340t = savedState.f181350g;
        this.f181338r = savedState.f181351h;
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        java.util.ArrayList arrayList = this.f181333m;
        if (arrayList == null) {
            throw new java.lang.IllegalArgumentException("pattern is null");
        }
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i17 = 0; i17 < size; i17++) {
            hu4.k kVar = (hu4.k) arrayList.get(i17);
            bArr[i17] = (byte) ((kVar.f285232a * 3) + kVar.f285233b);
        }
        return new com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.SavedState(onSaveInstanceState, new java.lang.String(bArr), this.f181342v.ordinal(), this.f181339s, this.f181340t, this.f181338r);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        this.G = ((i17 - getPaddingLeft()) - getPaddingRight()) / 3.0f;
        this.H = ((i18 - getPaddingTop()) - getPaddingBottom()) / 3.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        float f17;
        android.view.MotionEvent motionEvent2 = motionEvent;
        int i17 = 0;
        if (!this.f181340t || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        float f18 = 0.5f;
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.b bVar = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Correct;
        java.util.ArrayList arrayList = this.f181333m;
        boolean z17 = true;
        if (action == 0) {
            arrayList.clear();
            a();
            this.f181342v = bVar;
            invalidate();
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            hu4.k c17 = c(x17, y17);
            if (c17 != null) {
                this.C = true;
                this.f181342v = bVar;
                com.tencent.mm.plugin.walletlock.gesture.ui.widget.a aVar = this.I;
                if (aVar != null) {
                    aVar.onPatternStart(this);
                }
            } else {
                this.C = false;
            }
            if (c17 != null) {
                float f19 = f(c17.f285233b);
                float g17 = g(c17.f285232a);
                float f27 = this.G * 0.5f;
                float f28 = this.H * 0.5f;
                invalidate((int) (f19 - f27), (int) (g17 - f28), (int) (f19 + f27), (int) (g17 + f28));
            }
            this.A = x17;
            this.B = y17;
            return true;
        }
        if (action == 1) {
            if (arrayList.isEmpty()) {
                return true;
            }
            this.C = false;
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.a aVar2 = this.I;
            if (aVar2 != null) {
                aVar2.onPatternCompleted(this, new java.util.ArrayList(arrayList));
            }
            invalidate();
            return true;
        }
        if (action != 2) {
            if (action != 3) {
                return false;
            }
            if (this.C) {
                this.C = false;
                arrayList.clear();
                a();
                this.f181342v = bVar;
                invalidate();
                com.tencent.mm.plugin.walletlock.gesture.ui.widget.a aVar3 = this.I;
                if (aVar3 != null) {
                    aVar3.onPatternCleared(this);
                }
            }
            return true;
        }
        float f29 = this.f181336p;
        int historySize = motionEvent.getHistorySize();
        android.graphics.Rect rect = this.f181331h;
        rect.setEmpty();
        boolean z18 = false;
        while (i17 < historySize + 1) {
            float historicalX = i17 < historySize ? motionEvent2.getHistoricalX(i17) : motionEvent.getX();
            float historicalY = i17 < historySize ? motionEvent2.getHistoricalY(i17) : motionEvent.getY();
            hu4.k c18 = c(historicalX, historicalY);
            int size = arrayList.size();
            if (c18 != null && size == z17) {
                this.C = z17;
                com.tencent.mm.plugin.walletlock.gesture.ui.widget.a aVar4 = this.I;
                if (aVar4 != null) {
                    aVar4.onPatternStart(this);
                }
            }
            float abs = java.lang.Math.abs(historicalX - this.A);
            float abs2 = java.lang.Math.abs(historicalY - this.B);
            if (abs > 0.0f || abs2 > 0.0f) {
                z18 = true;
            }
            if (!this.C || size <= 0) {
                f17 = f29;
            } else {
                hu4.k kVar = (hu4.k) arrayList.get(size - 1);
                float f37 = f(kVar.f285233b);
                float g18 = g(kVar.f285232a);
                float min = java.lang.Math.min(f37, historicalX) - f29;
                float max = java.lang.Math.max(f37, historicalX) + f29;
                float min2 = java.lang.Math.min(g18, historicalY) - f29;
                float max2 = java.lang.Math.max(g18, historicalY) + f29;
                if (c18 != null) {
                    float f38 = this.G * f18;
                    float f39 = this.H * f18;
                    float f47 = f(c18.f285233b);
                    float g19 = g(c18.f285232a);
                    f17 = f29;
                    min = java.lang.Math.min(f47 - f38, min);
                    max = java.lang.Math.max(f47 + f38, max);
                    min2 = java.lang.Math.min(g19 - f39, min2);
                    max2 = java.lang.Math.max(g19 + f39, max2);
                } else {
                    f17 = f29;
                }
                rect.union(java.lang.Math.round(min), java.lang.Math.round(min2), java.lang.Math.round(max), java.lang.Math.round(max2));
            }
            i17++;
            motionEvent2 = motionEvent;
            f29 = f17;
            f18 = 0.5f;
            z17 = true;
        }
        float x18 = motionEvent.getX();
        this.A = x18;
        if (x18 < getPaddingLeft() + r2) {
            this.A = getPaddingLeft() + r2;
        } else if (this.A > ((getPaddingLeft() + getWidth()) - getPaddingRight()) - r2) {
            this.A = ((getPaddingLeft() + getWidth()) - getPaddingRight()) - r2;
        }
        float y18 = motionEvent.getY();
        this.B = y18;
        if (y18 < getPaddingTop() + r2) {
            this.B = getPaddingTop() + r2;
        } else if (this.B > ((getPaddingTop() + getHeight()) - getPaddingRight()) - r2) {
            this.B = ((getPaddingTop() + getHeight()) - getPaddingBottom()) - r2;
        }
        if (!z18) {
            return true;
        }
        android.graphics.Rect rect2 = this.f181332i;
        rect2.union(rect);
        invalidate(rect2);
        rect2.set(rect);
        return true;
    }

    public void setDisplayLine(boolean z17) {
        this.f181339s = z17;
        invalidate();
    }

    public void setDisplayMode(com.tencent.mm.plugin.walletlock.gesture.ui.widget.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.f181341u = getResources().getColor(com.tencent.mm.R.color.f478502m);
        } else if (ordinal == 1) {
            this.f181341u = getResources().getColor(com.tencent.mm.R.color.f479205st);
        } else if (ordinal == 2) {
            java.util.ArrayList arrayList = this.f181333m;
            if (arrayList.size() == 0) {
                throw new java.lang.IllegalStateException("You should set a pattern before animating.");
            }
            this.f181340t = false;
            this.f181341u = getResources().getColor(com.tencent.mm.R.color.f478502m);
            hu4.k kVar = (hu4.k) arrayList.get(0);
            this.A = f(kVar.f285233b);
            this.B = g(kVar.f285232a);
            a();
            this.D = android.os.SystemClock.elapsedRealtime();
        }
        this.f181342v = bVar;
        invalidate();
    }

    public void setEnableHapticFeedback(boolean z17) {
        this.f181338r = z17;
    }

    public void setEnableInput(boolean z17) {
        this.f181340t = z17;
    }

    public void setOnPatternListener(com.tencent.mm.plugin.walletlock.gesture.ui.widget.a aVar) {
        this.I = aVar;
    }

    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.SavedState> CREATOR = new com.tencent.mm.plugin.walletlock.gesture.ui.widget.c();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f181347d;

        /* renamed from: e, reason: collision with root package name */
        public final int f181348e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f181349f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f181350g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f181351h;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f181347d = parcel.readString();
            this.f181348e = parcel.readInt();
            this.f181349f = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
            this.f181350g = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
            this.f181351h = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f181347d);
            parcel.writeInt(this.f181348e);
            parcel.writeValue(java.lang.Boolean.valueOf(this.f181349f));
            parcel.writeValue(java.lang.Boolean.valueOf(this.f181350g));
            parcel.writeValue(java.lang.Boolean.valueOf(this.f181351h));
        }

        public SavedState(android.os.Parcelable parcelable, java.lang.String str, int i17, boolean z17, boolean z18, boolean z19) {
            super(parcelable);
            this.f181347d = str;
            this.f181348e = i17;
            this.f181349f = z17;
            this.f181350g = z18;
            this.f181351h = z19;
        }
    }
}
