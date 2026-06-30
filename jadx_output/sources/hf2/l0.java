package hf2;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.lowerthird.MJLowerThirdImageGenerator f281098a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f281099b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f281100c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.y0 f281101d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f281102e;

    public final void a(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" release initJob is activate:");
            kotlinx.coroutines.r2 r2Var = this.f281102e;
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorStickerMaasLogic", sb6.toString());
            kotlinx.coroutines.r2 r2Var2 = this.f281102e;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            com.tencent.maas.lowerthird.MJLowerThirdImageGenerator mJLowerThirdImageGenerator = this.f281098a;
            if (mJLowerThirdImageGenerator != null) {
                mJLowerThirdImageGenerator.e();
            }
            kotlinx.coroutines.y0 y0Var = this.f281101d;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new hf2.k0(null), 3, null);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "Finder.LiveAnchorStickerMaasLogic release");
        }
    }
}
