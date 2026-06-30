package r75;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f393253d;

    public c(android.content.Context context) {
        this.f393253d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            android.net.NetworkInfo activeNetworkInfo = com.tencent.mars.comm.NetStatusUtil.getActiveNetworkInfo(this.f393253d);
            r75.d.f393256c = activeNetworkInfo;
            if (activeNetworkInfo != null) {
                r75.d.f393257d = com.tencent.mars.comm.NetStatusUtil.getNetType(activeNetworkInfo);
                r75.d.f393258e = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(r75.d.f393256c);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("NetWorkCache", "UpdateNetWorkCache error : " + th6.getMessage());
        }
        com.tencent.mars.xlog.Log.i("NetWorkCache", "UpdateNetWorkCache updateCache, networkType = " + r75.d.f393257d + ", iosNetworkType = " + r75.d.f393258e);
    }
}
