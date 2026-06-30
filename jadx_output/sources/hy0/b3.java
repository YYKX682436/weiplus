package hy0;

/* loaded from: classes5.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f285795a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f285796b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Path f285797c;

    /* renamed from: d, reason: collision with root package name */
    public float f285798d;

    /* renamed from: e, reason: collision with root package name */
    public float f285799e;

    public b3(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285795a = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(b3.l.getColor(context, com.tencent.mm.R.color.ac9));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f285796b = paint;
        this.f285797c = new android.graphics.Path();
    }
}
