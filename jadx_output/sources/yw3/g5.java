package yw3;

/* loaded from: classes11.dex */
public final class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f466752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f466753e;

    public g5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI, r45.mm6 mm6Var) {
        this.f466752d = repairerPatchDemoUI;
        this.f466753e = mm6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        r45.mm6 mm6Var;
        uk.c cVar;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f466752d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        repairerPatchDemoUI.getClass();
        java.lang.String str2 = null;
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            kotlin.jvm.internal.o.d(applicationInfo);
            str = applicationInfo.sourceDir;
        } catch (java.lang.Exception unused) {
            str = null;
        }
        if (str != null) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                uk.b b17 = uk.b.b(str);
                str2 = (b17 == null || (cVar = b17.f428482b) == null) ? com.tencent.mm.vfs.w6.p(str) : cVar.f428483d;
            }
        }
        r45.mm6 mm6Var2 = this.f466753e;
        if ((mm6Var2 == null || !mm6Var2.f380672h.equals(str2)) && ((mm6Var = this.f466753e) == null || mm6Var.f380681t != 4)) {
            return;
        }
        r45.mm6 mm6Var3 = this.f466753e;
        if (mm6Var3 != null && mm6Var3.f380681t == 4) {
            com.tencent.mars.xlog.Log.i(this.f466752d.d, "checkTinkerBoostInstall, HdiffApk, oldApkMd5 is equal?: %s， dialogInfo.newApkPath = %s, oldApkMd5  = %s.", java.lang.Boolean.valueOf(r26.i0.p(mm6Var3.f380672h, str2, true)), this.f466753e.f380669e, str2);
        }
        if (com.tencent.mm.vfs.w6.j(this.f466753e.f380669e) && uk.b.a(this.f466753e.f380669e)) {
            ((ku5.t0) ku5.t0.f312615d).B(new yw3.c5(this.f466752d, this.f466753e));
        } else {
            ((un4.e) i95.n0.c(un4.e.class)).getClass();
            ((ku5.t0) ku5.t0.f312615d).B(new yw3.f5(this.f466752d, this.f466753e));
        }
    }
}
