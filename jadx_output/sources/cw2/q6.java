package cw2;

/* loaded from: classes15.dex */
public final class q6 implements ek4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f223952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f223953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f223954d;

    public q6(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, int i17, cw2.s6 s6Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f223951a = finderThumbPlayerProxy;
        this.f223952b = i17;
        this.f223953c = s6Var;
        this.f223954d = countDownLatch;
    }

    @Override // ek4.v
    public void a(int i17) {
        cw2.s6 s6Var = this.f223953c;
        int i18 = this.f223952b;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f223951a;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.w(finderThumbPlayerProxy.getFTPPTag(), "requestedResource taskId:" + i18 + " requestVideoData fail, ret:" + i17 + ' ' + this);
            s6Var.c(false);
        } else {
            com.tencent.mars.xlog.Log.w(finderThumbPlayerProxy.getFTPPTag(), "requestedResource taskId:" + i18 + " requestVideoData success, ret:" + i17 + ' ' + this);
            s6Var.c(true);
        }
        this.f223954d.countDown();
    }
}
