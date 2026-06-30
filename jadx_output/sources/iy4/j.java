package iy4;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final iy4.j f295971a = new iy4.j();

    public static final void a(long j17, java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            f295971a.b(j17, talker);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoDownloadIPCHelper", "forwarding addTask via IPC: msgId=" + j17);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webwx.model.AutoDownloadAddTaskData(j17, talker), iy4.i.class, null);
    }

    public final void b(final long j17, final java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        pz.e eVar = (pz.e) i95.n0.c(pz.e.class);
        boolean z17 = false;
        if (eVar != null) {
            if (j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigNewAutoDownload()) == 1) {
                z17 = true;
            }
        }
        if (z17) {
            kotlin.jvm.internal.o.d(eVar);
            ((oz.s) eVar).bj(j17, talker, "auto_sync", true, false);
            return;
        }
        iy4.e1 e1Var = (iy4.e1) i95.n0.c(iy4.e1.class);
        if (e1Var != null) {
            gm0.j1.b().c();
            if (e1Var.f295958d == null) {
                e1Var.f295958d = new iy4.r0();
            }
            final iy4.r0 r0Var = e1Var.f295958d;
            if (r0Var != null) {
                if (((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue()) {
                    ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: iy4.r0$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            iy4.r0 r0Var2 = iy4.r0.this;
                            r0Var2.getClass();
                            com.tencent.mm.storage.y9 y9Var = new com.tencent.mm.storage.y9();
                            y9Var.f196384d = j17;
                            y9Var.f196386f = com.tencent.mm.sdk.platformtools.t8.i1();
                            y9Var.f196387g = talker;
                            r0Var2.f295989d.f196336d.add(y9Var);
                            r0Var2.d();
                            r0Var2.b();
                        }
                    }, "MultiTerminalSyncMgr");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoSyncState close");
                }
            }
        }
    }
}
