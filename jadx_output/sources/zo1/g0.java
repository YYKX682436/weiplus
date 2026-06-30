package zo1;

/* loaded from: classes5.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474616d;

    public g0(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        this.f474616d = checkPackageContentUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean a17;
        po1.c cVar = po1.d.f357294i;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474616d;
        com.tencent.wechat.aff.affroam.g gVar = checkPackageContentUI.f92808q;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        com.tencent.wechat.aff.affroam.u uVar = gVar.f215832g;
        kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
        po1.d a18 = cVar.a(uVar);
        boolean z17 = true;
        if (a18.f357296b != po1.g.f357310h) {
            a17 = true;
        } else {
            po1.d e17 = ro1.v.f398014a.e(a18.f357295a);
            a17 = ((e17 == null || so1.b.f410226a.h(e17)) ? so1.g.f410238a : to1.g.f420911a).a(checkPackageContentUI, a18);
        }
        if (!a17) {
            com.tencent.mars.xlog.Log.i(checkPackageContentUI.f92799e, "Check permission failed.");
            nf.e.f(new zo1.y(checkPackageContentUI, a18));
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
            com.tencent.wechat.aff.affroam.g gVar2 = checkPackageContentUI.f92808q;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            java.lang.String str = gVar2.f215832g.f215989e;
            kotlin.jvm.internal.o.f(str, "getDeviceId(...)");
            boolean m17 = r0Var.m(str);
            java.lang.String str2 = checkPackageContentUI.f92799e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Connectivity of Device=");
            com.tencent.wechat.aff.affroam.g gVar3 = checkPackageContentUI.f92808q;
            if (gVar3 == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            sb6.append(gVar3.f215832g.f215989e);
            sb6.append(" is ");
            sb6.append(m17);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            if (checkPackageContentUI.isFinishing() || checkPackageContentUI.isDestroyed()) {
                return;
            }
            if (!m17) {
                nf.e.f(new zo1.f0(checkPackageContentUI));
            } else {
                checkPackageContentUI.getClass();
                r0Var.l(checkPackageContentUI.f92800f, new zo1.k0(java.lang.System.currentTimeMillis(), checkPackageContentUI));
            }
        }
    }
}
