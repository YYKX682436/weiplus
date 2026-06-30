package com.tencent.mm.plugin.finder.ui.slideprofile.debug;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/slideprofile/debug/SlideProfileDebugHudView;", "Landroid/view/View;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SlideProfileDebugHudView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f129844d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f129845e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f129846f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f129847g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f129848h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f129849i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f129850m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f129851n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlideProfileDebugHudView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = bv2.e.f24718a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = bv2.e.f24718a;
        if (!copyOnWriteArrayList2.contains(this)) {
            copyOnWriteArrayList2.add(this);
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = bv2.e.f24719b;
        if (copyOnWriteArrayList3.contains(this)) {
            return;
        }
        copyOnWriteArrayList3.add(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = bv2.e.f24718a;
        bv2.e.f24718a.remove(this);
        bv2.e.f24719b.remove(this);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float width = (getWidth() - 380.0f) - 16.0f;
        float f17 = 380.0f + width;
        canvas.drawRoundRect(new android.graphics.RectF(width, 76.0f, f17, 502.0f), 14.0f, 14.0f, this.f129844d);
        float f18 = width + 14.0f;
        canvas.drawText("Slide Debug HUD", f18, 112.0f, this.f129845e);
        canvas.drawText("pressing=".concat("no"), f18, 144.0f, this.f129846f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dx=");
        java.lang.String format = java.lang.String.format("%+.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(0.0f)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append("px");
        canvas.drawText(sb6.toString(), f18, 174.0f, this.f129846f);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dy=");
        java.lang.String format2 = java.lang.String.format("%+.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(0.0f)}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        sb7.append(format2);
        sb7.append("px");
        canvas.drawText(sb7.toString(), f18, 204.0f, this.f129846f);
        float abs = java.lang.Math.abs(0.0f);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = bv2.e.f24718a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = bv2.e.f24718a;
        canvas.drawText("|dx|>th? ".concat(abs > ((float) 0) ? "✓" : "✗"), f18, 234.0f, this.f129846f);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("v=");
        java.lang.String format3 = java.lang.String.format("%+.0f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(0.0f)}, 1));
        kotlin.jvm.internal.o.f(format3, "format(...)");
        sb8.append(format3);
        sb8.append("px/s");
        canvas.drawText(sb8.toString(), f18, 264.0f, this.f129846f);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("a=");
        java.lang.String format4 = java.lang.String.format("%+.0f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(0.0f)}, 1));
        kotlin.jvm.internal.o.f(format4, "format(...)");
        sb9.append(format4);
        sb9.append("px/s²");
        canvas.drawText(sb9.toString(), f18, 294.0f, this.f129846f);
        canvas.drawLine(f18, 312.0f, f17 - 14.0f, 312.0f, this.f129847g);
        canvas.drawText("Pager 判定", f18, 340.0f, this.f129845e);
        canvas.drawText("(等待手势)", f18, 370.0f, this.f129846f);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public /* synthetic */ SlideProfileDebugHudView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideProfileDebugHudView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(-1442840576);
        this.f129844d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(-256);
        paint2.setTextSize(28.0f);
        paint2.setFakeBoldText(true);
        this.f129845e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setColor(-1);
        paint3.setTextSize(26.0f);
        this.f129846f = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        paint4.setColor(1442840575);
        paint4.setStrokeWidth(1.0f);
        this.f129847g = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint(1);
        paint5.setColor(android.graphics.Color.parseColor("#69F0AE"));
        paint5.setTextSize(26.0f);
        paint5.setFakeBoldText(true);
        this.f129848h = paint5;
        android.graphics.Paint paint6 = new android.graphics.Paint(1);
        paint6.setColor(android.graphics.Color.parseColor("#FF8A80"));
        paint6.setTextSize(26.0f);
        paint6.setFakeBoldText(true);
        this.f129849i = paint6;
        android.graphics.Paint paint7 = new android.graphics.Paint(1);
        paint7.setColor(android.graphics.Color.parseColor("#69F0AE"));
        paint7.setTextSize(26.0f);
        this.f129850m = paint7;
        android.graphics.Paint paint8 = new android.graphics.Paint(1);
        paint8.setColor(android.graphics.Color.parseColor("#FF8A80"));
        paint8.setTextSize(26.0f);
        this.f129851n = paint8;
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }
}
