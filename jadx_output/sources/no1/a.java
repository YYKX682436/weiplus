package no1;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final no1.a f338734d = new no1.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start: ");
        sb6.append(com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92725g == null);
        com.tencent.mars.xlog.Log.i("MircoMsg.RoamForegroundService", sb6.toString());
        if (com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92725g == null) {
            com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92725g = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.class);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.startForegroundService(com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92725g);
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.startService(com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92725g);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MircoMsg.RoamForegroundService", "already started");
        }
        return jz5.f0.f302826a;
    }
}
