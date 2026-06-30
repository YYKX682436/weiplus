package ho1;

/* loaded from: classes5.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f282797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.o0 f282798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f282800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282801h;

    public r0(com.tencent.wechat.aff.affroam.g gVar, com.tencent.wechat.aff.affroam.o0 o0Var, ho1.a1 a1Var, com.tencent.wechat.aff.affroam.n0 n0Var, java.lang.String str) {
        this.f282797d = gVar;
        this.f282798e = o0Var;
        this.f282799f = a1Var;
        this.f282800g = n0Var;
        this.f282801h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        po1.c cVar = po1.d.f357294i;
        com.tencent.wechat.aff.affroam.u uVar = this.f282797d.f215832g;
        kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
        po1.d a17 = cVar.a(uVar);
        po1.g gVar = a17.f357296b;
        po1.g gVar2 = po1.g.f357310h;
        com.tencent.wechat.aff.affroam.o0 o0Var = com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
        if (gVar != gVar2 && this.f282798e == o0Var) {
            com.tencent.mars.xlog.Log.i(this.f282799f.f282622a, "Skip force notify. pkgId=" + this.f282797d.f215829d + " deviceType=" + a17.f357296b + ", taskType=" + this.f282798e);
            return;
        }
        com.tencent.wechat.aff.affroam.n0 n0Var = this.f282800g;
        com.tencent.wechat.aff.affroam.n0 n0Var2 = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PREPARING;
        com.tencent.wechat.aff.affroam.n0 n0Var3 = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_COMPLETED;
        if (n0Var == n0Var2 || n0Var == n0Var3 || n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PAUSED || n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_ERROR) {
            long j17 = this.f282797d.f215829d;
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity.f92622v;
            java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity.f92622v;
            com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity roamBackupActivity = weakReference2 != null ? (com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity) weakReference2.get() : null;
            boolean z17 = true;
            boolean z18 = (roamBackupActivity == null || roamBackupActivity.isFinishing() || roamBackupActivity.isDestroyed()) ? false : true;
            java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
            boolean z19 = com.tencent.matrix.lifecycle.owners.f0.f52739u;
            if (z19) {
                if (ho1.c.f282633b > 0) {
                    com.tencent.mars.xlog.Log.i(this.f282799f.f282622a, "Skip force notify, because RoamUI on foreground. pkgId=" + j17);
                    return;
                }
            }
            if (roamBackupActivity == null) {
                java.lang.String str2 = this.f282799f.f282622a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uiInstance==null, isProcessForeground=");
                sb6.append(z19);
                sb6.append(" activityRunning=");
                sb6.append(ho1.c.f282633b > 0);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            } else {
                java.lang.String str3 = this.f282799f.f282622a;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isFinish=");
                sb7.append(roamBackupActivity.isFinishing());
                sb7.append(", isDestroyed=");
                sb7.append(roamBackupActivity.isDestroyed());
                sb7.append(", uiIsShowing=");
                sb7.append(z18);
                sb7.append(", isProcessForeground=");
                sb7.append(z19);
                sb7.append(", activityRunning=");
                sb7.append(ho1.c.f282633b > 0);
                com.tencent.mars.xlog.Log.i(str3, sb7.toString());
            }
            com.tencent.mars.xlog.Log.i(this.f282799f.f282622a, "[begin] do force notify, packageId=" + j17 + ", deviceId=" + a17.f357295a + ", state: " + this.f282800g + ", title=" + this.f282801h);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int ordinal = this.f282798e.ordinal();
            java.lang.String string2 = ordinal != 1 ? ordinal != 3 ? com.tencent.mm.plugin.backup.roambackup.w1.f92923a : com.tencent.mm.plugin.backup.roambackup.w1.f92924b : context.getString(com.tencent.mm.R.string.mvf);
            kotlin.jvm.internal.o.d(string2);
            com.tencent.wechat.aff.affroam.n0 n0Var4 = this.f282800g;
            if (n0Var4 == n0Var2) {
                string = context.getString(com.tencent.mm.R.string.oeo, string2);
            } else if (n0Var4 == n0Var3) {
                string = this.f282798e == o0Var ? context.getString(com.tencent.mm.R.string.f492847mw2) : context.getString(com.tencent.mm.R.string.mw9, string2);
            } else {
                if (a17.f357296b != gVar2) {
                    return;
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) ro1.v.f398014a.b();
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.o.b(((po1.d) it.next()).f357300f, a17.f357300f)) {
                            break;
                        }
                    }
                }
                z17 = false;
                com.tencent.mars.xlog.Log.i(this.f282799f.f282622a, "[error] force notify, packageId=" + j17 + ", state=" + this.f282800g + ", deviceId=" + a17.f357295a + ", deviceOnline=" + z17);
                if (z17) {
                    return;
                } else {
                    string = context.getString(com.tencent.mm.R.string.mw8, string2);
                }
            }
            java.lang.String str4 = string;
            kotlin.jvm.internal.o.d(str4);
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            i13.q qVar = new i13.q(uuid, this.f282801h, str4, java.lang.System.currentTimeMillis(), new ho1.q0(this.f282799f, j17));
            k13.l1 l1Var = (k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi();
            l1Var.f(qVar);
            l1Var.c();
            ((ku5.t0) ku5.t0.f312615d).k(new ho1.p0(l1Var, qVar), 5000L);
        }
    }
}
