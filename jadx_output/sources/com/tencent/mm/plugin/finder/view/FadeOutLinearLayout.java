package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FadeOutLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/graphics/Paint;", "f", "Ljz5/g;", "getGradientPaint", "()Landroid/graphics/Paint;", "gradientPaint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FadeOutLinearLayout extends android.widget.LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f130852n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.ComposeShader f130853d;

    /* renamed from: e, reason: collision with root package name */
    public final int f130854e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g gradientPaint;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f130856g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Canvas f130857h;

    /* renamed from: i, reason: collision with root package name */
    public int f130858i;

    /* renamed from: m, reason: collision with root package name */
    public int f130859m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadeOutLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f130854e = -16777216;
        this.gradientPaint = jz5.h.b(com.tencent.mm.plugin.finder.view.u1.f133153d);
    }

    private final android.graphics.Paint getGradientPaint() {
        return (android.graphics.Paint) this.gradientPaint.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r16, boolean r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            android.graphics.Bitmap r1 = r0.f130856g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 == 0) goto L15
            int r1 = r1.getWidth()
            int r4 = r15.getWidth()
            if (r1 != r4) goto L15
            r1 = r2
            goto L16
        L15:
            r1 = r3
        L16:
            if (r1 == 0) goto L30
            android.graphics.Bitmap r1 = r0.f130856g
            if (r1 == 0) goto L28
            int r1 = r1.getHeight()
            int r4 = r15.getHeight()
            if (r1 != r4) goto L28
            r1 = r2
            goto L29
        L28:
            r1 = r3
        L29:
            if (r1 != 0) goto L2c
            goto L30
        L2c:
            r2 = r17
            goto Lac
        L30:
            int r1 = r15.getWidth()
            int r4 = r15.getHeight()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r5)
            java.lang.ThreadLocal r5 = zj0.c.f473285a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.add(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.add(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            java.util.Collections.reverse(r6)
            java.lang.Object[] r8 = r6.toArray()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/view/FadeOutLinearLayout"
            java.lang.String r10 = "checkInitShader"
            java.lang.String r11 = "(IZI)V"
            java.lang.String r12 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r13 = "createBitmap"
            java.lang.String r14 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r7 = r1
            yj0.a.d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = r6.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r4 = r6.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 2
            java.lang.Object r5 = r6.get(r5)
            android.graphics.Bitmap$Config r5 = (android.graphics.Bitmap.Config) r5
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/view/FadeOutLinearLayout"
            java.lang.String r10 = "checkInitShader"
            java.lang.String r11 = "(IZI)V"
            java.lang.String r12 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r13 = "createBitmap"
            java.lang.String r14 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r7 = r1
            r8 = r3
            yj0.a.e(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.f130856g = r3
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r3 = r0.f130856g
            kotlin.jvm.internal.o.d(r3)
            r1.<init>(r3)
            r0.f130857h = r1
        Lac:
            if (r2 == 0) goto Lde
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            int r2 = r15.getWidth()
            int r2 = r2 - r16
            float r4 = (float) r2
            r5 = 0
            int r2 = r15.getWidth()
            int r2 = r2 - r18
            float r6 = (float) r2
            r7 = 0
            int r8 = r0.f130854e
            r9 = 0
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.BitmapShader r2 = new android.graphics.BitmapShader
            android.graphics.Bitmap r3 = r0.f130856g
            kotlin.jvm.internal.o.d(r3)
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r2.<init>(r3, r4, r4)
            android.graphics.ComposeShader r3 = new android.graphics.ComposeShader
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.<init>(r1, r2, r4)
            r0.f130853d = r3
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.FadeOutLinearLayout.a(int, boolean, int):void");
    }

    public final void b(int i17, long j17, int i18) {
        com.tencent.mars.xlog.Log.i("FadeOutLinearLayout", "setRightFadingLength: feedId = " + pm0.v.u(j17) + ", fadingLen = " + i17 + ", width = " + getWidth());
        if (i17 <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            this.f130853d = null;
        } else {
            a(i17 > getWidth() ? getWidth() : i17, true, i18);
        }
        this.f130858i = i17;
        this.f130859m = i18;
        setWillNotDraw(i17 == 0);
        invalidate();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (getWidth() <= 0 || getHeight() <= 0) {
            super.draw(canvas);
            return;
        }
        if (this.f130853d != null) {
            a(this.f130858i, false, this.f130859m);
            android.graphics.Canvas canvas2 = this.f130857h;
            if (canvas2 != null) {
                canvas2.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            }
            android.graphics.Canvas canvas3 = this.f130857h;
            if (canvas3 != null) {
                super.draw(canvas3);
            }
            canvas.save();
            getGradientPaint().setShader(this.f130853d);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), getGradientPaint());
            canvas.restore();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.draw(canvas);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadeOutLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f130854e = -16777216;
        this.gradientPaint = jz5.h.b(com.tencent.mm.plugin.finder.view.u1.f133153d);
    }
}
