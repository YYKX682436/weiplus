package rc2;

/* loaded from: classes2.dex */
public final class b extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f393928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f393929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.graphics.Rect rect, android.view.View view, android.content.Context context) {
        super(context);
        this.f393929e = rect;
        this.f393930f = view;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-65536);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setAntiAlias(true);
        this.f393928d = paint;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Rect rect = this.f393929e;
        int i17 = rect.left;
        android.view.View view = this.f393930f;
        canvas.drawRect(new android.graphics.Rect(i17 - ((android.view.ViewGroup) view).getLeft(), rect.top - ((android.view.ViewGroup) view).getTop(), rect.right - ((android.view.ViewGroup) view).getLeft(), rect.bottom - ((android.view.ViewGroup) view).getTop()), this.f393928d);
    }
}
