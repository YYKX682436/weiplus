package ow;

/* loaded from: classes11.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ow.u f349269d = new ow.u();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr] Timer triggered");
        com.tencent.mars.xlog.Log.i("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr]performUpdate onUpdateMainSession...");
        dw.f.f244070a.a();
    }
}
