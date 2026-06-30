package ky;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f313436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f313437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f313438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313439g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, boolean z17, long j17, java.lang.String str) {
        super(1);
        this.f313436d = context;
        this.f313437e = z17;
        this.f313438f = j17;
        this.f313439g = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        kotlin.jvm.internal.o.g(Canvas, "$this$Canvas");
        float b17 = d1.k.b(Canvas.a()) * 5;
        boolean z17 = this.f313437e;
        int i17 = z17 ? com.tencent.mm.R.color.f478856aj4 : com.tencent.mm.R.color.f478855aj3;
        android.content.Context context = this.f313436d;
        float f17 = 2;
        g1.h.b(Canvas, e1.a0.b(b3.l.getColor(context, i17)), b17, d1.f.a(d1.k.d(Canvas.a()) / f17, b17), 0.0f, null, null, 0, 120, null);
        g1.h.b(Canvas, this.f313438f, b17, d1.f.a(d1.k.d(Canvas.a()) / f17, b17), 0.0f, new g1.n(Canvas.R(f17), 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
        e1.u a17 = ((g1.b) Canvas.p()).a();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(context.getColor(z17 ? com.tencent.mm.R.color.aay : com.tencent.mm.R.color.aik));
        paint.setTextSize(Canvas.H(p2.u.b(14)));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setAntiAlias(true);
        float d17 = d1.k.d(Canvas.a()) / f17;
        float b18 = (d1.k.b(Canvas.a()) / f17) - ((paint.descent() + paint.ascent()) / f17);
        android.graphics.Canvas canvas = e1.c.f246229a;
        kotlin.jvm.internal.o.g(a17, "<this>");
        ((e1.b) a17).f246225a.drawText(this.f313439g, d17, b18, paint);
        return jz5.f0.f302826a;
    }
}
