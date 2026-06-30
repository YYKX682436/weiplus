package z81;

/* loaded from: classes13.dex */
public class i implements z81.a {

    /* renamed from: a, reason: collision with root package name */
    public e91.b f470711a;

    /* renamed from: b, reason: collision with root package name */
    public e91.b f470712b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Stack f470713c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Stack f470714d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f470715e;

    /* renamed from: f, reason: collision with root package name */
    public z81.k f470716f;

    /* renamed from: g, reason: collision with root package name */
    public final z81.a f470717g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f470718h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f470719i;

    public i(z81.a aVar) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f470715e = paint;
        new c01.k2(null);
        this.f470719i = true;
        this.f470717g = aVar;
        this.f470711a = d91.c.f227451b.a();
        this.f470712b = this.f470719i ? d91.b.f227450b.a() : new e91.b();
        this.f470711a.setStyle(android.graphics.Paint.Style.STROKE);
        this.f470712b.setStyle(android.graphics.Paint.Style.FILL);
        this.f470711a.setAntiAlias(true);
        this.f470712b.setAntiAlias(true);
        this.f470711a.setStrokeWidth(ik1.w.c(1));
        this.f470712b.setStrokeWidth(ik1.w.c(1));
        this.f470713c = new java.util.Stack();
        this.f470714d = new java.util.Stack();
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
    }

    public void a() {
        this.f470713c.clear();
        this.f470714d.clear();
        this.f470711a.reset();
        this.f470712b.reset();
        this.f470711a.setStyle(android.graphics.Paint.Style.STROKE);
        this.f470712b.setStyle(android.graphics.Paint.Style.FILL);
        this.f470711a.setAntiAlias(true);
        this.f470712b.setAntiAlias(true);
        this.f470711a.setStrokeWidth(ik1.w.c(1));
        this.f470712b.setStrokeWidth(ik1.w.c(1));
    }

    @Override // z81.a
    public void invalidate() {
        this.f470717g.invalidate();
    }
}
