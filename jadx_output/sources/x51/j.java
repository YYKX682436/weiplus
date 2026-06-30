package x51;

/* loaded from: classes10.dex */
public class j implements java.lang.Runnable {
    public j(com.tencent.mm.platformtools.BroadcastHelper broadcastHelper) {
    }

    @Override // java.lang.Runnable
    public void run() {
        r75.d dVar = r75.d.f393254a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("NetWorkCache", "initCache error ctx is null");
        } else {
            synchronized (dVar) {
                com.tencent.mars.xlog.Log.i("NetWorkCache", "registerNetWorkBroadCastReceiver = " + r75.d.f393255b);
                if (!r75.d.f393255b) {
                    ((ku5.t0) ku5.t0.f312615d).g(new r75.b(context));
                    r75.d.f393255b = true;
                }
            }
        }
        boolean i17 = com.tencent.mm.sdk.platformtools.o4.L().i("clicfg_network_cache_wifi", true);
        boolean i18 = com.tencent.mm.sdk.platformtools.o4.L().i("clicfg_network_cache_wap", true);
        boolean i19 = com.tencent.mm.sdk.platformtools.o4.L().i("clicfg_get_active_network_cache", true);
        r75.d.f393259f = i17;
        r75.d.f393260g = i18;
        r75.d.f393261h = i19;
    }
}
