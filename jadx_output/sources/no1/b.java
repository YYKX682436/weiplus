package no1;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final no1.b f338735d = new no1.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92725g;
        if (intent != null) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(intent);
            com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92725g = null;
        }
        return jz5.f0.f302826a;
    }
}
