package com.tencent.wechat.aff.affroam;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ZIDL_esFfH6f8KE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215732a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_FI(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215732a;
        com.tencent.wechat.zlog.Zlog.a("RoamDeviceManagerKE", "onConnectivityChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("RoamDeviceManagerKE", "onConnectivityChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.mm.plugin.backup.roambackup.o oVar = (com.tencent.mm.plugin.backup.roambackup.o) ((com.tencent.wechat.aff.affroam.k1) entry.getValue());
            oVar.getClass();
            com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
            boolean Ui = ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConnectivityChanged] deviceId=");
            java.lang.String str = oVar.f92665a;
            sb6.append(str);
            sb6.append(", isConnect=");
            sb6.append(z17);
            sb6.append(", isRoamEnable=");
            sb6.append(Ui);
            com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
            lo1.i.f320102a.b(str, z17);
        }
    }
}
