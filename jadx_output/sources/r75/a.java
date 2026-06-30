package r75;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f393251d;

    public a(android.content.Context context) {
        this.f393251d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.NetworkInfo activeNetworkInfo = com.tencent.mars.comm.NetStatusUtil.getActiveNetworkInfo(this.f393251d);
        r75.d.f393256c = activeNetworkInfo;
        if (activeNetworkInfo != null) {
            r75.d.f393257d = com.tencent.mars.comm.NetStatusUtil.getNetType(activeNetworkInfo);
            r75.d.f393258e = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(r75.d.f393256c);
            com.tencent.mars.xlog.Log.i("NetWorkCache", "initCache onReceive, networkType = " + r75.d.f393257d + ", iosNetworkType = " + r75.d.f393258e);
        }
    }
}
