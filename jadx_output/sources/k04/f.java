package k04;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k04.h f303135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.PowerManager f303136e;

    public f(k04.h hVar, android.os.PowerManager powerManager) {
        this.f303135d = hVar;
        this.f303136e = powerManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long c17 = c01.id.c();
        int myPid = android.os.Process.myPid();
        boolean isBackground = com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.isBackground();
        boolean isForeground = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
        boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
        boolean isInteractive = this.f303136e.isInteractive();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c17);
        sb6.append(';');
        sb6.append(myPid);
        sb6.append(';');
        sb6.append(isBackground ? 1 : 0);
        sb6.append(';');
        sb6.append(isForeground ? 1 : 0);
        sb6.append(';');
        sb6.append(isConnected ? 1 : 0);
        sb6.append(';');
        sb6.append(isInteractive ? 1 : 0);
        java.lang.String sb7 = sb6.toString();
        k04.h hVar = this.f303135d;
        hVar.aj().A("lastTickIndex", hVar.f303140o);
        hVar.aj().D("index_" + hVar.f303140o, sb7);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessStatusFeatureService", "tick index_" + hVar.f303140o + ' ' + sb7);
        int i17 = hVar.f303140o + 1;
        hVar.f303140o = i17;
        if (i17 > 30) {
            hVar.f303140o = 0;
        }
    }
}
