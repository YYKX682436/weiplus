package ow;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f349271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349272e;

    public w(long j17, java.lang.String str) {
        this.f349271d = j17;
        this.f349272e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() + (this.f349271d * 60 * 1000);
        java.lang.String str = this.f349272e;
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr] Invalid IDs in nativeLocalIdList.");
        } else {
            com.tencent.wechat.aff.brand_service.v.f216049c.x(java.lang.Long.parseLong(str), currentTimeMillis, ow.v.f349270a);
        }
    }
}
