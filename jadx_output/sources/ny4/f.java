package ny4;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f341463a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f341464b = "";

    public final float[] a(java.nio.Buffer dataBuffer, int i17, int i18) {
        kotlin.jvm.internal.o.g(dataBuffer, "dataBuffer");
        long j17 = this.f341463a;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatImageFeatureManager", "applyReq but handler is null");
            return new float[0];
        }
        float[] nApply = com.tencent.mm.xeffect.WeImageFeature.nApply(j17, dataBuffer, i17, i18);
        kotlin.jvm.internal.o.f(nApply, "nApply(...)");
        return nApply;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatImageFeatureManager", "destroyFeatureEnv >> " + this.f341463a);
        long j17 = this.f341463a;
        if (j17 != 0) {
            com.tencent.mm.xeffect.WeImageFeature.nRelease(j17);
            this.f341463a = 0L;
        }
    }

    public final boolean c(java.lang.String str) {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.a3 a3Var = p05.a3.f350439a;
        if (str == null) {
            str = "MODEL_PRETRAIN_IMAGE_FEATURE_NEWLIFE";
        }
        java.lang.String g17 = a3Var.g(str);
        if (g17 == null) {
            g17 = "";
        }
        this.f341464b = g17;
        if (g17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeChatImageFeatureManager", "initFeatureEnv model path is empty");
            return false;
        }
        long nInit = com.tencent.mm.xeffect.WeImageFeature.nInit(this.f341464b, 2);
        this.f341463a = nInit;
        if (nInit == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeChatImageFeatureManager", "initFeatureEnv >> init error");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatImageFeatureManager", "init success >> " + this.f341463a);
        return true;
    }
}
