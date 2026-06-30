package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002R*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderEdgeTransparentView;", "Lcom/tencent/mm/view/HardTouchableLayout;", "", "width", "Ljz5/f0;", "setEdgeWidth", "", "position", "setEdgePosition", "fix", "setHorizontalShaderOffsetFix", "", "value", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Z", "isEnable", "()Z", "setEnable", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderEdgeTransparentView extends com.tencent.mm.view.HardTouchableLayout {
    public final int A;
    public int B;
    public int C;
    public float D;

    /* renamed from: E, reason: from kotlin metadata */
    public boolean isEnable;
    public final int[] F;
    public final float[] G;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f131002s;

    /* renamed from: t, reason: collision with root package name */
    public int f131003t;

    /* renamed from: u, reason: collision with root package name */
    public int f131004u;

    /* renamed from: v, reason: collision with root package name */
    public int f131005v;

    /* renamed from: w, reason: collision with root package name */
    public float f131006w;

    /* renamed from: x, reason: collision with root package name */
    public final int f131007x;

    /* renamed from: y, reason: collision with root package name */
    public final int f131008y;

    /* renamed from: z, reason: collision with root package name */
    public final int f131009z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderEdgeTransparentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(child, "child");
        if (!this.isEnable) {
            return super.drawChild(canvas, child, j17);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, child, j17);
        int i17 = this.f131003t;
        if (i17 == 0 || (i17 & this.f131007x) != 0) {
            float f17 = this.B;
            float f18 = this.f131006w;
            android.graphics.Paint paint = this.f131002s;
            kotlin.jvm.internal.o.d(paint);
            canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        }
        int i18 = this.f131003t;
        if (i18 == 0 || (i18 & this.f131008y) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, this.B / 2.0f, this.C / 2.0f);
            float f19 = this.B;
            float f27 = this.f131006w;
            android.graphics.Paint paint2 = this.f131002s;
            kotlin.jvm.internal.o.d(paint2);
            canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
            canvas.restoreToCount(save);
        }
        int i19 = (this.C - this.B) / 2;
        int i27 = this.f131003t;
        if (i27 == 0 || (i27 & this.f131009z) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, this.B / 2.0f, this.C / 2.0f);
            float f28 = i19;
            canvas.translate(0.0f, this.D + f28);
            float f29 = this.f131006w;
            android.graphics.Paint paint3 = this.f131002s;
            kotlin.jvm.internal.o.d(paint3);
            canvas.drawRect(0 - f28, 0.0f, this.B + f28, f29, paint3);
            canvas.restoreToCount(save2);
        }
        int i28 = this.f131003t;
        if (i28 == 0 || (i28 & this.A) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, this.B / 2.0f, this.C / 2.0f);
            float f37 = i19;
            canvas.translate(0.0f, this.D + f37);
            float f38 = this.f131006w;
            android.graphics.Paint paint4 = this.f131002s;
            kotlin.jvm.internal.o.d(paint4);
            canvas.drawRect(0 - f37, 0.0f, this.B + f37, f38, paint4);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.Paint paint = this.f131002s;
        if (paint != null) {
            paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f131006w, this.F, this.G, android.graphics.Shader.TileMode.CLAMP));
        }
        this.B = getWidth();
        this.C = getHeight();
    }

    public final void setEdgePosition(int i17) {
        this.f131003t = i17;
    }

    public final void setEdgeWidth(float f17) {
        this.f131006w = f17;
        android.graphics.Paint paint = this.f131002s;
        if (paint != null) {
            paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f131006w, this.F, this.G, android.graphics.Shader.TileMode.CLAMP));
        }
        postInvalidate();
    }

    public final void setEnable(boolean z17) {
        this.isEnable = z17;
        postInvalidate();
    }

    public final void setHorizontalShaderOffsetFix(float f17) {
        this.D = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderEdgeTransparentView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131007x = 1;
        this.f131008y = 1 << 1;
        this.f131009z = 1 << 2;
        this.A = 1 << 3;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f131002s = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.f131002s;
        kotlin.jvm.internal.o.d(paint2);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f18545b);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f131003t = obtainStyledAttributes.getInt(0, 0);
        this.f131004u = obtainStyledAttributes.getColor(3, android.graphics.Color.parseColor("#d9d9d9"));
        this.f131005v = obtainStyledAttributes.getColor(2, 0);
        this.f131006w = obtainStyledAttributes.getDimension(1, i65.a.a(context, 20.0f));
        obtainStyledAttributes.recycle();
        this.F = new int[]{this.f131004u, this.f131005v};
        this.G = new float[]{0.3f, 1.0f};
    }
}
