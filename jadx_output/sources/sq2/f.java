package sq2;

/* loaded from: classes2.dex */
public final class f implements at.e {
    @Override // at.e
    public void a(java.lang.String reddotId, int i17, float f17) {
        kotlin.jvm.internal.o.g(reddotId, "reddotId");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = i17;
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        e0Var.f310115d = f17;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", "finderLiveHomeEntranceExposePredict: start preload, op=" + f0Var.f310116d + ", reddotId=" + reddotId + ", predictScore=" + e0Var.f310115d + ", isMock=false");
        pm0.v.X(new sq2.e(f0Var, e0Var, i17));
    }

    @Override // at.e
    public void start(java.lang.String reddotId) {
        kotlin.jvm.internal.o.g(reddotId, "reddotId");
        com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", "finderLiveHomeEntranceExposePredict: start kara predict");
    }
}
