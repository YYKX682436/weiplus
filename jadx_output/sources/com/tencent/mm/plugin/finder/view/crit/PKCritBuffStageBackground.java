package com.tencent.mm.plugin.finder.view.crit;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/crit/PKCritBuffStageBackground;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PKCritBuffStageBackground extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f131855d;

    /* renamed from: e, reason: collision with root package name */
    public final int f131856e;

    /* renamed from: f, reason: collision with root package name */
    public final int f131857f;

    /* renamed from: g, reason: collision with root package name */
    public int f131858g;

    /* renamed from: h, reason: collision with root package name */
    public long f131859h;

    /* renamed from: i, reason: collision with root package name */
    public int f131860i;

    /* renamed from: m, reason: collision with root package name */
    public final float f131861m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKCritBuffStageBackground(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131855d = new android.graphics.Paint();
        this.f131856e = android.graphics.Color.parseColor("#00ffffff");
        this.f131857f = android.graphics.Color.parseColor("#26ffffff");
        this.f131861m = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        a();
    }

    public final void a() {
        android.graphics.Paint paint = this.f131855d;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f131861m);
        this.f131860i = i65.a.b(getContext(), 43);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int i17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.draw(canvas);
        int height = getHeight();
        int i18 = this.f131858g;
        android.graphics.Paint paint = this.f131855d;
        if (height != i18) {
            int i19 = this.f131856e;
            paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, getHeight() / 0.93f, new int[]{i19, this.f131857f, i19}, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        }
        this.f131858g = getHeight();
        float f17 = this.f131861m;
        int height2 = ((int) (getHeight() / 2.74f)) + ((int) f17);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f131859h;
        if (j17 > 0) {
            i17 = (int) (((((float) (currentTimeMillis - j17)) / 1000.0f) * this.f131860i) % height2);
        } else {
            this.f131859h = currentTimeMillis;
            i17 = 0;
        }
        float f18 = height2;
        float f19 = (0.0f - f18) + i17;
        while (f19 < getWidth()) {
            float f27 = f19 + f18;
            canvas.drawLine(f19, getHeight(), f27 - f17, 0.0f, paint);
            f19 = f27;
        }
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKCritBuffStageBackground(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131855d = new android.graphics.Paint();
        this.f131856e = android.graphics.Color.parseColor("#00ffffff");
        this.f131857f = android.graphics.Color.parseColor("#26ffffff");
        this.f131861m = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        a();
    }
}
