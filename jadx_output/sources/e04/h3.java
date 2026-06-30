package e04;

/* loaded from: classes9.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f245953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f245954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f245955f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(kotlin.jvm.internal.h0 h0Var, android.graphics.Bitmap bitmap, yz5.l lVar) {
        super(0);
        this.f245953d = h0Var;
        this.f245954e = bitmap;
        this.f245955f = lVar;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f245953d.f310123d = com.tencent.mm.sdk.platformtools.x.W(this.f245954e, 0.1f, 10, true, 200L);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanViewUtils", "blurBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanViewUtils", e17, "blurBitmap exception", new java.lang.Object[0]);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f245953d.f310123d;
        if (bitmap != null) {
            bitmap.getWidth();
        }
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) this.f245953d.f310123d;
        if (bitmap2 != null) {
            bitmap2.getHeight();
        }
        if (!kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            return ((ku5.t0) ku5.t0.f312615d).B(new e04.g3(this.f245955f, this.f245953d));
        }
        this.f245955f.invoke(this.f245953d.f310123d);
        return jz5.f0.f302826a;
    }
}
