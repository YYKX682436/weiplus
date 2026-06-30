package ly3;

/* loaded from: classes13.dex */
public final class l implements com.tencent.mm.modelbase.u0, com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f322264n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f322265o;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f322266d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f322268f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322272m;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f322267e = "";

    /* renamed from: g, reason: collision with root package name */
    public final ky3.a f322269g = new ky3.a();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f322270h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f322271i = new java.util.concurrent.locks.ReentrantLock();

    static {
        java.lang.String str = ly3.g.f322254a;
        f322264n = "wechat_rtos_service";
        f322265o = ly3.g.f322254a;
    }

    public l(boolean z17) {
        this.f322266d = z17;
    }

    public final void a() {
        java.lang.String valueOf = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.L().getString("patch_id", ""));
        this.f322267e = valueOf;
        ly3.m mVar = ly3.m.f322273a;
        java.lang.String str = f322264n;
        java.lang.String a17 = mVar.a(str, valueOf);
        java.lang.String str2 = mVar.b(str, this.f322267e) + "config.json";
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "checkLocalResource patchId:" + this.f322267e + ", so:" + a17 + ", config:" + str2);
        ((ku5.t0) ku5.t0.f312615d).g(new ly3.j(a17, str2, this));
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        java.lang.Long l17 = this.f322268f;
        if (l17 != null && l17.longValue() == j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskFailed taskId:" + j17 + ", errCode" + i17);
            e(-4);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        java.lang.Long l17 = this.f322268f;
        if (l17 != null && l17.longValue() == j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskFinished taskId:" + j17 + ", savedFilePath" + str);
            ((ku5.t0) ku5.t0.f312615d).g(new ly3.k(this, str));
        }
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "checkRemoteUpdateFail");
        if (this.f322266d) {
            g(-1);
        } else {
            a();
        }
    }

    public final void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "downloadFail. errorCode:" + i17);
        if (this.f322266d) {
            g(i17);
        } else {
            a();
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
        java.lang.Long l17 = this.f322268f;
        if (l17 != null && l17.longValue() == j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskMd5Checking taskId:" + j17);
        }
    }

    public final void g(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onCheckCallback errorCode:%d", java.lang.Integer.valueOf(i17));
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f322271i;
        reentrantLock.lock();
        gm0.j1.d().q(3899, this);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().s(this);
        ky3.a aVar = this.f322269g;
        aVar.f313612h = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "report " + aVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26515, java.lang.Integer.valueOf(aVar.f313605a), aVar.f313606b, java.lang.Integer.valueOf(aVar.f313607c), java.lang.Integer.valueOf(aVar.f313608d), java.lang.Integer.valueOf(aVar.f313609e), java.lang.Integer.valueOf(aVar.f313610f), aVar.f313611g, java.lang.Integer.valueOf(aVar.f313612h), aVar.f313613i);
        java.util.ArrayList arrayList = this.f322270h;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onSoResCheck errCode " + i17);
            my3.q qVar = ((my3.i) ((fy3.h) next)).f332807a;
            if (i17 == 0) {
                fy3.f fVar = qVar.f332833s;
                if (fVar != null) {
                    ((oy3.t) fVar).a(true);
                }
                my3.q.Di(qVar, qVar.f332838x);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosServiceImpl", "onSoResCheck Fail");
                qVar.Ri(fy3.i.f267246e);
                fy3.f fVar2 = qVar.f332833s;
                if (fVar2 != null) {
                    ((oy3.t) fVar2).a(false);
                }
            }
        }
        arrayList.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "isChecking = false");
        this.f322272m = false;
        reentrantLock.unlock();
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        java.lang.Long l17 = this.f322268f;
        if (l17 != null && l17.longValue() == j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskProgressChanged taskId:" + j17 + " recvLen:" + j18 + " totalLen:" + j19);
            int i17 = (int) ((j18 * ((long) 100)) / j19);
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onCheckCallback process:%d", java.lang.Integer.valueOf(i17));
            java.util.Iterator it = this.f322270h.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "so download progress " + i17);
                fy3.f fVar = ((my3.i) ((fy3.h) next)).f332807a.f332833s;
                if (fVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "so download progress " + i17);
                    com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = ((oy3.t) fVar).f350044a;
                    rtosWatchLoginUI.D.postUI(new oy3.s(rtosWatchLoginUI, i17));
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        java.lang.Long l17 = this.f322268f;
        if (l17 != null && l17.longValue() == j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskResumed taskId:" + j17);
        }
    }

    public final void j(fy3.h hVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f322271i;
        reentrantLock.lock();
        if (this.f322272m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "isChecking ignore add listener and check remote update.");
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.r0.i().a(this);
            gm0.j1.d().a(3899, this);
            this.f322267e = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.L().getString("patch_id", ""));
            ky3.a aVar = this.f322269g;
            aVar.getClass();
            java.lang.String str = f322265o;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            aVar.f313606b = str;
            java.lang.String str2 = this.f322267e;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            aVar.f313613i = str2;
            boolean z17 = this.f322266d;
            aVar.f313605a = !z17 ? 1 : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "checkRemoteUpdate baseId:" + str + " patchId:" + this.f322267e + " scene:" + aVar.f313605a);
            xv.g0 g0Var = (xv.g0) i95.n0.c(xv.g0.class);
            java.lang.String str3 = this.f322267e;
            ((wv.a) g0Var).getClass();
            gm0.j1.d().g(new ly3.f(str, str3, z17));
            if (hVar != null) {
                this.f322270h.add(hVar);
            }
            this.f322272m = true;
        }
        reentrantLock.unlock();
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        java.lang.Long l17 = this.f322268f;
        if (l17 != null && l17.longValue() == j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskPaused taskId:" + j17);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        java.lang.Long l17 = this.f322268f;
        if (l17 != null && l17.longValue() == j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskStarted taskId:" + j17 + ", savedFilePath" + str);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        java.lang.Long l17 = this.f322268f;
        if (l17 != null && l17.longValue() == j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskRemoved taskId:" + j17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String Url;
        if (!(m1Var instanceof ly3.e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "ignore other check scene");
            return;
        }
        ky3.a aVar = this.f322269g;
        aVar.f313607c = i17;
        aVar.f313608d = i18;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "check fail");
            d();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "check so cgi success");
        r45.g35 g35Var = (r45.g35) ((ly3.f) ((ly3.e) m1Var)).f470567d.f70711b.f70700a;
        r45.j35 j35Var = g35Var.f374853d;
        aVar.f313610f = g35Var.f374858i;
        java.lang.String str2 = str == null ? "" : str;
        aVar.getClass();
        aVar.f313611g = str2;
        if (j35Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "check error code:" + g35Var.f374858i + ", error msg:" + str);
            d();
            return;
        }
        int i19 = j35Var.f377534e;
        aVar.f313609e = i19;
        if (i19 != 1) {
            if (i19 == 2) {
                r45.bs5 bs5Var = j35Var.f377538i;
                if (bs5Var == null || (Url = bs5Var.f371027f) == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "node url is null.");
                    d();
                    return;
                }
                kotlin.jvm.internal.o.f(Url, "Url");
                java.lang.String MD5 = j35Var.f377538i.f371025d;
                kotlin.jvm.internal.o.f(MD5, "MD5");
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "checkRemoteUpdateSuccessAndStartDownload and start download:".concat(Url));
                com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
                t0Var.f97150a = Url;
                ly3.m mVar = ly3.m.f322273a;
                java.lang.String soName = f322264n;
                kotlin.jvm.internal.o.g(soName, "soName");
                t0Var.f97153d = com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH + soName + ".so";
                t0Var.f97154e = MD5;
                t0Var.f97158i = false;
                t0Var.f97160k = true;
                t0Var.f97155f = 2;
                t0Var.f97159j = false;
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                this.f322268f = java.lang.Long.valueOf(com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var));
                return;
            }
            if (i19 != 3 && i19 != 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "unknown state: " + j35Var.f377534e);
                d();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "node state: " + j35Var.f377534e);
        d();
    }
}
