package s65;

/* loaded from: classes11.dex */
public final class a1 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.sandbox.updater.UpdaterService updaterService = com.tencent.mm.sandbox.updater.UpdaterService.f192331p;
        if (updaterService != null) {
            boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
            java.util.HashMap hashMap = (java.util.HashMap) updaterService.f192333i;
            if (hashMap.size() <= 0) {
                return;
            }
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((s65.w) it.next()).g(isWifi);
            }
        }
    }
}
