package ow;

/* loaded from: classes11.dex */
public final class r implements com.tencent.wechat.aff.brand_service.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ow.r f349263a = new ow.r();

    @Override // com.tencent.wechat.aff.brand_service.b
    public final void complete(boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("BrandEcsNotifyCacheMgr", "[BRS]cleanUnExpiredNotifyMsg success, starting data fetch.");
            com.tencent.wechat.aff.brand_service.v.f216049c.f(2147483647L, 100, ow.q.f349262a);
        } else {
            com.tencent.mars.xlog.Log.w("BrandEcsNotifyCacheMgr", "[BRS]cleanUnExpiredNotifyMsg failed, starting data fetch anyway.");
            ow.t.f349268d = false;
        }
    }
}
