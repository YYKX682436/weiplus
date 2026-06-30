package o11;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f342050c;

    /* renamed from: n, reason: collision with root package name */
    public java.util.concurrent.Executor f342061n;

    /* renamed from: a, reason: collision with root package name */
    public final int f342048a = o11.d.f342062o;

    /* renamed from: b, reason: collision with root package name */
    public final int f342049b = 5;

    /* renamed from: d, reason: collision with root package name */
    public o11.g f342051d = null;

    /* renamed from: e, reason: collision with root package name */
    public p11.o f342052e = null;

    /* renamed from: f, reason: collision with root package name */
    public p11.b f342053f = null;

    /* renamed from: g, reason: collision with root package name */
    public p11.c f342054g = null;

    /* renamed from: h, reason: collision with root package name */
    public p11.g f342055h = null;

    /* renamed from: i, reason: collision with root package name */
    public p11.l f342056i = null;

    /* renamed from: j, reason: collision with root package name */
    public p11.m f342057j = null;

    /* renamed from: k, reason: collision with root package name */
    public p11.f f342058k = null;

    /* renamed from: l, reason: collision with root package name */
    public p11.p f342059l = null;

    /* renamed from: m, reason: collision with root package name */
    public p11.j f342060m = null;

    public c(android.content.Context context) {
        this.f342050c = context.getApplicationContext();
    }

    public o11.d a() {
        if (this.f342051d == null) {
            this.f342051d = new o11.f().a();
        }
        if (this.f342052e == null) {
            this.f342052e = new com.tencent.mm.modelimage.loader.impr.g();
        }
        if (this.f342053f == null) {
            this.f342053f = new com.tencent.mm.modelimage.loader.impr.a();
        }
        if (this.f342054g == null) {
            this.f342054g = new com.tencent.mm.modelimage.loader.impr.c();
        }
        if (this.f342055h == null) {
            this.f342055h = new com.tencent.mm.modelimage.loader.impr.e();
        }
        if (this.f342056i == null) {
            this.f342056i = new com.tencent.mm.modelimage.loader.impr.j();
        }
        if (this.f342060m == null) {
            this.f342060m = o11.b.a(this.f342048a, this.f342049b);
        }
        if (this.f342061n == null) {
            this.f342061n = ((ku5.t0) ku5.t0.f312615d).p("image_loader_ImageTempFile");
        }
        if (this.f342057j == null) {
            this.f342057j = new com.tencent.mm.modelimage.loader.impr.f();
        }
        if (this.f342058k == null) {
            this.f342058k = new com.tencent.mm.modelimage.loader.impr.d();
        }
        if (this.f342059l == null) {
            this.f342059l = new com.tencent.mm.modelimage.loader.impr.h();
        }
        return new o11.d(this);
    }
}
