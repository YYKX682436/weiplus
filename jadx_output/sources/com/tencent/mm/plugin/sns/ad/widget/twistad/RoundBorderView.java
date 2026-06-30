package com.tencent.mm.plugin.sns.ad.widget.twistad;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/twistad/RoundBorderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RoundBorderView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f163912d;

    /* renamed from: e, reason: collision with root package name */
    public int f163913e;

    /* renamed from: f, reason: collision with root package name */
    public float f163914f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f163915g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundBorderView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163915g = new android.graphics.Paint();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
        int i17 = this.f163913e;
        android.graphics.Paint paint = this.f163915g;
        paint.setColor(i17);
        paint.setStrokeWidth(this.f163914f * 2);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        float f17 = this.f163912d;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundBorderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163915g = new android.graphics.Paint();
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundBorderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163915g = new android.graphics.Paint();
        setWillNotDraw(false);
    }
}
