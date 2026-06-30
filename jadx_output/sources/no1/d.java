package no1;

/* loaded from: classes5.dex */
public final class d implements mv.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService f338736a;

    public d(com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService roamForegroundService) {
        this.f338736a = roamForegroundService;
    }

    @Override // mv.z
    public void a(mv.e0 e0Var) {
        com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService roamForegroundService = this.f338736a;
        if (e0Var != null) {
            if (e0Var.f331496c != mv.f0.f331501d) {
                java.lang.String str = e0Var.f331497d;
                if (!(str.length() == 0)) {
                    if (e0Var.f331495b == mv.h0.f331510f) {
                        return;
                    }
                    if (((nv.v1) com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92727i).f340403f) {
                        roamForegroundService.b(str);
                        return;
                    }
                    if (e0Var.f331499f.length() == 0) {
                        roamForegroundService.b(str + ' ' + e0Var.f331498e + '%');
                        return;
                    }
                    roamForegroundService.b(str + ' ' + e0Var.f331498e + "%, " + e0Var.f331499f);
                    return;
                }
            }
        }
        roamForegroundService.b("");
    }
}
