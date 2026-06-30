package yw0;

/* loaded from: classes5.dex */
public final class p extends yw0.s {

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f466579b;

    /* renamed from: c, reason: collision with root package name */
    public yw0.o f466580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context, yw0.r drawerAction) {
        super(drawerAction);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(drawerAction, "drawerAction");
        int color = j65.q.a(context).getColor(com.tencent.mm.R.color.f479429ad5, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setColor(color);
        paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        paint.setStrokeWidth(j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 2.0f);
        this.f466579b = paint;
        this.f466580c = yw0.o.f466576d;
    }

    @Override // yw0.s
    public void a() {
    }

    @Override // yw0.s
    public void b(android.graphics.Canvas canvas, int i17, int i18) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.f466580c.ordinal() != 1) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, i17, i18, this.f466579b);
    }
}
