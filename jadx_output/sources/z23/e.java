package z23;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final z23.a f469729d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f469730e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469731f;

    /* renamed from: g, reason: collision with root package name */
    public int f469732g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Matrix f469733h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f469734i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f469735m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Rect f469736n;

    /* renamed from: o, reason: collision with root package name */
    public e60.h1 f469737o;

    public e(z23.h hVar, z23.a generate, int i17, yz5.p callback) {
        kotlin.jvm.internal.o.g(generate, "generate");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f469729d = generate;
        this.f469730e = callback;
        this.f469737o = new e60.h1(0);
    }

    @Override // java.lang.Runnable
    public void run() {
        z23.d dVar;
        long currentTimeMillis;
        z23.a aVar;
        java.lang.String str;
        try {
            try {
                try {
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                    aVar = this.f469729d;
                    str = this.f469731f;
                } catch (java.lang.Exception e17) {
                    this.f469737o.f249707a = -1;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MediaTailor", e17, "", new java.lang.Object[0]);
                    this.f469737o.getClass();
                    dVar = new z23.d(this);
                }
            } catch (java.lang.Error e18) {
                this.f469737o.f249707a = -1;
                com.tencent.mars.xlog.Log.printErrStackTrace("MediaTailor", e18, "", new java.lang.Object[0]);
                this.f469737o.getClass();
                dVar = new z23.d(this);
            }
            if (str == null) {
                kotlin.jvm.internal.o.o("input");
                throw null;
            }
            int i17 = this.f469732g;
            android.graphics.Matrix matrix = this.f469733h;
            if (matrix == null) {
                kotlin.jvm.internal.o.o("matrix");
                throw null;
            }
            android.graphics.Rect rect = this.f469734i;
            if (rect == null) {
                kotlin.jvm.internal.o.o("clipRect");
                throw null;
            }
            android.graphics.Rect rect2 = this.f469736n;
            if (rect2 == null) {
                kotlin.jvm.internal.o.o("contentRect");
                throw null;
            }
            android.graphics.Rect rect3 = this.f469735m;
            if (rect3 == null) {
                kotlin.jvm.internal.o.o("viewRect");
                throw null;
            }
            this.f469737o = (e60.h1) aVar.a(str, i17, matrix, rect, rect2, rect3);
            com.tencent.mars.xlog.Log.i("MediaTailor", "generate image cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            this.f469737o.getClass();
            dVar = new z23.d(this);
            pm0.v.X(dVar);
        } catch (java.lang.Throwable th6) {
            this.f469737o.getClass();
            pm0.v.X(new z23.d(this));
            throw th6;
        }
    }
}
