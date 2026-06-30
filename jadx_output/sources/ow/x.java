package ow;

/* loaded from: classes9.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final ow.x f349273a = new ow.x();

    public final void a(long j17, java.lang.String latestNotifyMsgId) {
        kotlin.jvm.internal.o.g(latestNotifyMsgId, "latestNotifyMsgId");
        if (latestNotifyMsgId.length() == 0) {
            com.tencent.mars.xlog.Log.i("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr] scheduleNotifyMsg latestNotifyMsgId exception");
            return;
        }
        java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis() + (j17 * 60 * 1000));
        long time = date.getTime() - java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr] interval: " + time + "，newFireDate: " + date + " , latestNotifyMsgId: " + latestNotifyMsgId);
        ((ku5.t0) ku5.t0.f312615d).A("BrandEcsNotifyTimerMgrUpdateDigest");
        ((ku5.t0) ku5.t0.f312615d).l(ow.u.f349269d, time, "BrandEcsNotifyTimerMgrUpdateDigest");
    }
}
