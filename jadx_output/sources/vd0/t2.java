package vd0;

/* loaded from: classes4.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f435511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f435514g;

    public t2(android.graphics.Bitmap bitmap, java.lang.String str, android.content.Context context, yz5.a aVar) {
        this.f435511d = bitmap;
        this.f435512e = str;
        this.f435513f = context;
        this.f435514g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (this.f435511d != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            this.f435511d.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            h0Var.f310123d = byteArrayOutputStream.toByteArray();
        }
        java.lang.Object obj = h0Var.f310123d;
        if (obj != null) {
            if (!(((byte[]) obj).length == 0)) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f435512e);
                try {
                    vd0.r2 r2Var = new vd0.r2(h0Var);
                    boolean z17 = com.tencent.mm.sdk.platformtools.x.f193064a;
                    com.tencent.mm.sdk.platformtools.x.o0(r6Var.o(), r2Var);
                    ((ku5.t0) ku5.t0.f312615d).B(new vd0.s2(this.f435514g));
                    vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                    java.lang.String o17 = r6Var.o();
                    android.content.Context context = this.f435513f;
                    ((ub0.r) oVar).getClass();
                    q75.c.f(o17, context);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingQRCodeService", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}
