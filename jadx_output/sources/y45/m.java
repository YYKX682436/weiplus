package y45;

/* loaded from: classes11.dex */
public abstract class m {
    public static void a(final android.content.Context context, final r45.f35 f35Var, final m3.a aVar, final boolean z17, final boolean z18, boolean z19) {
        d55.u.b("MicroMsg.recovery.operator", "doFetchTinkerPatch() called. apply_path: %s, force_using_https_channel: %s, peak_shaving: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: y45.m$$b
            @Override // java.lang.Runnable
            public final void run() {
                boolean z27 = z18;
                d55.u.b("MicroMsg.recovery.operator", "doFetchTinkerPatch: actually do fetch task, use_https_channel: %s", java.lang.Boolean.valueOf(z27));
                r45.f35 f35Var2 = f35Var;
                android.content.Context context2 = context;
                m3.a aVar2 = aVar;
                boolean z28 = z17;
                if (z27) {
                    z45.a.b(f35Var2, new y45.p(context2, 2, aVar2, z28));
                    return;
                }
                final b55.c cVar = new b55.c(f35Var2, new y45.p(context2, 1, aVar2, z28));
                r45.lk0 lk0Var = new r45.lk0();
                final com.tencent.mm.modelbase.o oVar = cVar.f18103d;
                lk0Var.BaseRequest = o45.bh.a(oVar.getReqObj());
                lk0Var.f379541d = cVar.f18105f;
                r45.nk0 nk0Var = new r45.nk0();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
                nk0Var.f381457d = cu5Var;
                r45.mk0 mk0Var = (r45.mk0) oVar.f70710a.f70684a;
                mk0Var.f380601e = lk0Var;
                mk0Var.f380600d = nk0Var;
                oVar.setRsaInfo(o45.pi.d());
                final com.tencent.mm.modelbase.v2 v2Var = new com.tencent.mm.modelbase.v2(oVar, android.os.Looper.myLooper() == null ? new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()) : new com.tencent.mm.sdk.platformtools.n3(), null);
                final b55.d dVar = new b55.d(oVar, cVar);
                y45.u.a().post(new java.lang.Runnable() { // from class: b55.c$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        a55.e eVar;
                        b55.c cVar2 = b55.c.this;
                        com.tencent.mm.modelbase.v2 v2Var2 = v2Var;
                        b55.d dVar2 = dVar;
                        com.tencent.mm.network.v0 v0Var = oVar;
                        cVar2.getClass();
                        d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "Before startTask.", new java.lang.Object[0]);
                        a55.g gVar = a55.g.f1614b;
                        b55.a aVar3 = new b55.a();
                        gVar.getClass();
                        if (v2Var2 == null) {
                            d55.u.d("MicroMsg.MarsNetTasks", "startTask  rr is null", new java.lang.Object[0]);
                            eVar = a55.g.f1615c;
                        } else {
                            com.tencent.mars.stn.StnManager.Task task = new com.tencent.mars.stn.StnManager.Task(com.tencent.mars.MarsContext.getContext());
                            try {
                                task.cmdID = ((com.tencent.mm.modelbase.r2) v2Var2.f70829f).f70792g.getCmdId();
                                task.cgi = v2Var2.getUri();
                                if (v2Var2.f70827d.keepAlive()) {
                                    d55.u.b("MicroMsg.MarsNetTasks", "keep-alive for cgi=" + task.cgi, new java.lang.Object[0]);
                                    task.headers.put("Connection", "Keep-Alive");
                                }
                                int type = v2Var2.getType();
                                task.needAuthed = (v2Var2.f70827d.getOptions() & 1) != 1;
                                task.limitFlow = true;
                                task.channelStrategy = 0;
                                task.sendOnly = false;
                                if (((com.tencent.mm.modelbase.r2) v2Var2.f70829f).f70792g.getShortSupport() && v2Var2.getUri() != null && v2Var2.getUri().length() > 0) {
                                    task.channelSelect |= 1;
                                }
                                if (task.cmdID != 0) {
                                    task.channelSelect |= 2;
                                }
                                task.cgiID = type;
                                task.retryCount = 0;
                                task.extraInfo = new java.util.HashMap();
                                d55.u.b("MicroMsg.MarsNetTasks", "mmcgi startTask inQueue hash[%d,%d] net:%d cgi:%s needAuthed:%b", java.lang.Integer.valueOf(task.taskID), java.lang.Integer.valueOf(v2Var2.o2()), java.lang.Integer.valueOf(task.channelSelect), task.cgi, java.lang.Boolean.valueOf(task.needAuthed));
                            } catch (android.os.RemoteException e17) {
                                boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                d55.u.d("MicroMsg.MarsNetTasks", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                            }
                            a55.f fVar = new a55.f(null);
                            fVar.f1609a = v2Var2;
                            fVar.f1610b = dVar2;
                            fVar.f1611c = aVar3;
                            boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            fVar.f1612d = java.lang.System.currentTimeMillis();
                            fVar.f1613e = task.taskID;
                            synchronized (gVar.f1616a) {
                                gVar.f1616a.put(task.taskID, fVar);
                            }
                            ((com.tencent.mars.stn.StnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.stn.StnManager.class)).startTask(task);
                            eVar = new a55.e(fVar.f1613e, 0);
                        }
                        a55.e eVar2 = eVar;
                        if (eVar2.f1608b < 0) {
                            cVar2.onGYNetEnd(-1, 3, -1, "send to network failed", v0Var, null);
                            d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "Send, %s, ThreadID:%s, getType:%s", java.lang.Integer.valueOf(eVar2.f1607a), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Integer.valueOf(v0Var.getType()));
                        }
                    }
                });
            }
        };
        if (!z19) {
            runnable.run();
            return;
        }
        long nextInt = new java.util.Random().nextInt(3600) * 1000;
        d55.u.b("MicroMsg.recovery.operator", "doFetchTinkerPatch: delay %sms to do patch fetching logic for peak shaving.", java.lang.Long.valueOf(nextInt));
        y45.u.a().postDelayed(runnable, nextInt);
    }

    public static void b(android.content.Context context, java.lang.String str, long j17, java.lang.String str2, m3.a aVar, boolean z17) {
        d55.u.b("MicroMsg.recovery.operator", "#downloadTinkerPatch, file size = " + j17 + ", url = " + str, new java.lang.Object[0]);
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        w95.d dVar = new w95.d(str);
        java.io.File file = new java.io.File(context.getCacheDir(), "recovery/tinker_path_file_" + java.lang.System.currentTimeMillis());
        dVar.f444083g = file;
        dVar.f444082f = new java.io.File(file.getAbsolutePath() + ".tmp");
        dVar.f444091r = new y45.o(z17, context, atomicInteger, aVar);
        if (j17 > 0) {
            dVar.f444087n = j17;
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            dVar.f444089p = new w95.g(str2);
        }
        d55.u.b("MicroMsg.recovery.operator", "#downloadTinkerPatch start sync downloading", new java.lang.Object[0]);
        w95.a aVar2 = new w95.a();
        w95.c cVar = new w95.c(aVar2);
        cVar.f444078a = context;
        cVar.b(dVar);
        while (dVar.f444080d == 2030) {
            try {
                java.lang.Thread.sleep(((x95.c) dVar.h()).f452741a);
                cVar.b(dVar);
            } catch (java.lang.InterruptedException e17) {
                dVar.f444080d = 2040;
                aVar2.b(dVar, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, e17.getLocalizedMessage());
            }
        }
    }

    public static void c(android.content.Context context, m3.a aVar, java.lang.String str, boolean z17, boolean z18) {
        boolean z19;
        if (z17) {
            d55.u.b("MicroMsg.recovery.operator", "force using HTTPS channel, skip mars init.", new java.lang.Object[0]);
        } else {
            try {
                a55.h.f1617a.a();
            } catch (java.lang.Throwable th6) {
                d55.u.c("MicroMsg.recovery.operator", "Mars init failed, force using https to fetch tinker patch configs.", th6, new java.lang.Object[0]);
                z17 = true;
            }
        }
        if (!z17 || z65.c.a() || y45.r.a(context).getBoolean("sk_enable_https_patch_channel", false)) {
            z19 = z17;
        } else {
            d55.u.d("MicroMsg.recovery.operator", "https channel was not enabled, do not use it.", new java.lang.Object[0]);
            z19 = false;
        }
        java.lang.String str2 = lp0.a.f320256j;
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            d55.u.b("MicroMsg.recovery.operator", "baseTinkerId = " + str, new java.lang.Object[0]);
            r45.f35 f35Var = new r45.f35();
            f35Var.f373987d = str;
            f35Var.f373988e = lp0.a.a();
            java.util.LinkedList b17 = b55.b.b();
            f35Var.f373989f = b17;
            b17.add(b55.b.a("biz-scene", "recovery"));
            f35Var.f373994n = 1;
            a(context, f35Var, aVar, true, z19, z18);
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        str = str2;
        d55.u.b("MicroMsg.recovery.operator", "baseTinkerId = " + str, new java.lang.Object[0]);
        r45.f35 f35Var2 = new r45.f35();
        f35Var2.f373987d = str;
        f35Var2.f373988e = lp0.a.a();
        java.util.LinkedList b172 = b55.b.b();
        f35Var2.f373989f = b172;
        b172.add(b55.b.a("biz-scene", "recovery"));
        f35Var2.f373994n = 1;
        a(context, f35Var2, aVar, true, z19, z18);
    }
}
