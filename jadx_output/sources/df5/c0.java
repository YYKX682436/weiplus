package df5;

/* loaded from: classes11.dex */
public final class c0 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f232057d;

    /* renamed from: e, reason: collision with root package name */
    public final int f232058e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f232059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, v11.e0 renderConfig) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(renderConfig, "renderConfig");
        v11.y yVar = renderConfig.f432373l;
        int i17 = yVar.f432488a;
        this.f232057d = i17;
        int i18 = yVar.f432490c;
        this.f232058e = i18;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(yVar.f432489b);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f232059f = paint;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, (i18 * 2) + i17));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float f17 = this.f232058e;
        canvas.drawRect(0.0f, f17, getWidth(), f17 + this.f232057d, this.f232059f);
    }
}
