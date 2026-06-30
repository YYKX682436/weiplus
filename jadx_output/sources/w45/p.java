package w45;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442921a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442922b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442923c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f442924d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f442925e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f442926f;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(w45.p pVar) {
        pVar.getClass();
        if (gm0.j1.b().t()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (com.tencent.mm.ui.bk.A() && !c01.z1.x()) {
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                w45.d dVar = new w45.d(pVar);
                pVar.f442921a = dVar;
                d17.a(281, dVar);
                de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
                gm0.j1.d().g((com.tencent.mm.modelbase.m1) wi6);
                pVar.b();
                com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new w45.e(wi6, pVar), false);
                pVar.f442924d = b4Var;
                b4Var.c(5000L, 5000L);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                pVar.f442926f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l7z), true, true, new w45.f(wi6, pVar));
                return;
            }
        }
        pVar.b();
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new w45.g(pVar), false);
        pVar.f442925e = b4Var2;
        b4Var2.c(3000L, 3000L);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        pVar.f442926f = db5.e1.Q(context2, context2.getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490393tq), true, true, new w45.h(pVar));
    }

    public final void b() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        w45.j jVar = new w45.j(this);
        this.f442922b = jVar;
        d17.a(282, jVar);
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        gm0.j1.d().g(new com.tencent.mm.modelsimple.r0(4));
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChangeQQLoginType.LogoutHelper", "logout mm");
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.booter.q2.c();
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
        am.hj hjVar = logoutEvent.f54484g;
        hjVar.getClass();
        hjVar.f6836a = 0;
        logoutEvent.e();
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = true;
        backupProcessMgrExitEvent.e();
        com.tencent.mm.sdk.platformtools.c3.b("show_whatsnew");
        gm0.k2.a(com.tencent.mm.sdk.platformtools.x2.f193071a, true);
        com.tencent.mm.plugin.report.service.f0.e(8);
        gm0.j1.n().e();
        new com.tencent.mm.autogen.events.BackupCoreResetEvent().e();
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("Intro_Switch", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(intent, com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}
