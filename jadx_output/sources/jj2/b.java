package jj2;

/* loaded from: classes10.dex */
public final class b extends jj2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, jj2.d data) {
        super(context, data);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // jj2.a
    public void a(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        float f17 = 2;
        canvas.drawCircle(getViewWidth() / f17, getViewHeight() / f17, getCircleRadius() - getPaint().getStrokeWidth(), getPaint());
        canvas.restore();
    }
}
