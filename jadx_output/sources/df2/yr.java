package df2;

/* loaded from: classes10.dex */
public final class yr implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f231890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f231891e;

    public yr(java.util.HashMap hashMap, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f231890d = hashMap;
        this.f231891e = countDownLatch;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.u0 u0Var = (com.tencent.mm.modelbase.u0) this.f231890d.get(m1Var);
        if (u0Var != null) {
            u0Var.onSceneEnd(i17, i18, str, m1Var);
            java.util.concurrent.CountDownLatch countDownLatch = this.f231891e;
            countDownLatch.countDown();
            java.lang.String str2 = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "countdown " + m1Var.hashCode() + ", remain" + countDownLatch.getCount());
        }
    }
}
