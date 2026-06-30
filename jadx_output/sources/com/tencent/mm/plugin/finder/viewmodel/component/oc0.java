package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes4.dex */
public final class oc0 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f135463d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f135464e;

    /* renamed from: f, reason: collision with root package name */
    public float f135465f;

    /* renamed from: g, reason: collision with root package name */
    public final float f135466g;

    /* renamed from: h, reason: collision with root package name */
    public final float f135467h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(android.content.Context context, java.lang.Float f17, java.lang.Float f18, int i17, kotlin.jvm.internal.i iVar) {
        super(context);
        f17 = (i17 & 2) != 0 ? null : f17;
        f18 = (i17 & 4) != 0 ? null : f18;
        kotlin.jvm.internal.o.g(context, "context");
        this.f135463d = new android.graphics.Paint(1);
        this.f135464e = new android.graphics.Path();
        this.f135466g = f17 != null ? f17.floatValue() : 3.0f;
        this.f135467h = f18 != null ? f18.floatValue() : 4.0f;
        setWillNotDraw(false);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float width;
        int height;
        float f17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f135463d;
        paint.setColor(-16777216);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (this.f135465f >= 0.5f) {
            boolean z17 = getWidth() > getHeight();
            float f18 = this.f135466g;
            float f19 = this.f135467h;
            if (!z17) {
                float width2 = getWidth();
                float width3 = ((f19 * getWidth()) / f18) * (this.f135465f - 0.5f);
                float f27 = 2;
                float height2 = (width3 * f27) + (getHeight() * (1 - ((this.f135465f - 0.5f) * f27)));
                width = width2;
                f17 = height2;
                float f28 = 2;
                float f29 = width / f28;
                float f37 = f17 / f28;
                android.graphics.RectF rectF = new android.graphics.RectF((getWidth() / 2.0f) - f29, (getHeight() / 2.0f) - f37, (getWidth() / 2.0f) + f29, (getHeight() / 2.0f) + f37);
                paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
                android.graphics.Path path = this.f135464e;
                path.reset();
                path.addRoundRect(rectF, 40.0f, 40.0f, android.graphics.Path.Direction.CW);
                canvas.drawPath(path, paint);
                paint.setXfermode(null);
            }
            float f38 = 2;
            width = (((f19 * getHeight()) / f18) * (this.f135465f - 0.5f) * f38) + (getWidth() * (1 - ((this.f135465f - 0.5f) * f38)));
            height = getHeight();
        } else {
            width = getWidth();
            height = getHeight();
        }
        f17 = height;
        float f282 = 2;
        float f292 = width / f282;
        float f372 = f17 / f282;
        android.graphics.RectF rectF2 = new android.graphics.RectF((getWidth() / 2.0f) - f292, (getHeight() / 2.0f) - f372, (getWidth() / 2.0f) + f292, (getHeight() / 2.0f) + f372);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        android.graphics.Path path2 = this.f135464e;
        path2.reset();
        path2.addRoundRect(rectF2, 40.0f, 40.0f, android.graphics.Path.Direction.CW);
        canvas.drawPath(path2, paint);
        paint.setXfermode(null);
    }
}
