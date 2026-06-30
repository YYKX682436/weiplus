package jj2;

/* loaded from: classes10.dex */
public final class c extends jj2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, jj2.d data) {
        super(context, data);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // jj2.a
    public void a(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        float circleRadius = getCircleRadius() - getPaint().getStrokeWidth();
        float f17 = 2;
        canvas.drawRoundRect(new android.graphics.RectF((getViewWidth() / f17) - circleRadius, (getViewHeight() / f17) - circleRadius, (getViewWidth() / f17) + circleRadius, (getViewHeight() / f17) + circleRadius), i65.a.a(getContext(), 6.0f), i65.a.a(getContext(), 6.0f), getPaint());
        canvas.restore();
    }
}
