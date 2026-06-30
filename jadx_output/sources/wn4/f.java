package wn4;

/* loaded from: classes11.dex */
public final class f implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.hp.util.TinkerSyncResponse f447538d;

    /* renamed from: e, reason: collision with root package name */
    public final long f447539e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f447540f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f447541g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f447542h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f447543i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f447544m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f447545n;

    public f(com.tencent.mm.plugin.hp.util.TinkerSyncResponse response, long j17, java.util.HashMap patchDownLoadProgress, java.util.HashMap isDelatMakeFinish, java.util.HashMap patchId2FileNameProgress) {
        kotlin.jvm.internal.o.g(response, "response");
        kotlin.jvm.internal.o.g(patchDownLoadProgress, "patchDownLoadProgress");
        kotlin.jvm.internal.o.g(isDelatMakeFinish, "isDelatMakeFinish");
        kotlin.jvm.internal.o.g(patchId2FileNameProgress, "patchId2FileNameProgress");
        this.f447538d = response;
        this.f447539e = j17;
        this.f447540f = patchDownLoadProgress;
        this.f447541g = isDelatMakeFinish;
        this.f447542h = patchId2FileNameProgress;
        this.f447543i = "MicroMsg.Updater.DownloadCallbackListener";
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f447543i, "onTaskFailed cdnUrl:" + this.f447538d.f142412h + " downloadId:" + this.f447539e + " id:" + j17 + " errCode:" + i17 + " hasChangeUrl:" + z17);
        if (this.f447539e == j17) {
            jx3.f.INSTANCE.idkeyStat(1429L, 13L, 1L, false);
            com.tencent.mm.plugin.downloader.model.r0.i().s(this);
            ((ku5.t0) ku5.t0.f312615d).B(new wn4.a(this));
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        java.lang.Integer num;
        com.tencent.mars.xlog.Log.i(this.f447543i, "onTaskFinished cdnUrl:" + this.f447538d.f142412h + " downloadId:" + this.f447539e + " id:" + j17 + " hasChangeUrl:" + z17 + " savedFilePath:" + str);
        if (this.f447539e == j17) {
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = this.f447538d;
            if (tinkerSyncResponse != null && (num = tinkerSyncResponse.f142410f) != null && num.intValue() == 4 && str != null) {
                r45.bw3 k17 = c83.e.k();
                if (k17 == null) {
                    k17 = new r45.bw3();
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f447538d.f142412h) && !com.tencent.mm.sdk.platformtools.t8.K0(k17.f371094e) && this.f447538d.f142412h.equals(k17.f371094e)) {
                    com.tencent.mars.xlog.Log.i(this.f447543i, "HdiffApk onDownloadFinish, funck is equals, response.cdnUrl: " + this.f447538d.f142412h + ", status.cdnUrl = " + k17.f371094e);
                }
                k17.f371096g = "3";
                k17.f371098i = java.lang.System.currentTimeMillis();
                c83.e.s(k17);
            }
            com.tencent.mm.plugin.downloader.model.r0.i().s(this);
            ((ku5.t0) ku5.t0.f312615d).B(wn4.b.f447530d);
            if (str != null) {
                wn4.x xVar = wn4.x.f447571a;
                com.tencent.mm.plugin.hp.util.TinkerSyncResponse response = this.f447538d;
                kotlin.jvm.internal.o.g(response, "response");
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "onDownloadFinish savePath:".concat(str));
                java.lang.Integer num2 = response.f142410f;
                if (num2 != null && num2.intValue() == 3) {
                    jx3.f.INSTANCE.idkeyStat(1429L, 8L, 1L, false);
                    ((ku5.t0) ku5.t0.f312615d).h(new wn4.m(response, str), "Updater");
                    return;
                }
                java.lang.Integer num3 = response.f142410f;
                if (num3 != null && num3.intValue() == 4) {
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
                    wn4.f fVar = wn4.x.f447575e;
                    if (fVar == null) {
                        kotlin.jvm.internal.o.o("downloadCallbackListener");
                        throw null;
                    }
                    if (fVar == null) {
                        kotlin.jvm.internal.o.o("downloadCallbackListener");
                        throw null;
                    }
                    fVar.f447545n = true;
                    xVar.d(r6Var, j17, response);
                    return;
                }
                java.lang.Integer num4 = response.f142410f;
                if (num4 != null && num4.intValue() == 2) {
                    jx3.f.INSTANCE.idkeyStat(1429L, 9L, 1L, false);
                    b83.e eVar = new b83.e(lp0.a.f320249c, response.f142419r);
                    android.content.SharedPreferences b17 = eVar.b();
                    java.lang.String a17 = eVar.a(5);
                    if (b17.contains(a17)) {
                        eVar.c(5, java.lang.System.currentTimeMillis() - b17.getLong(a17, 0L));
                        b17.edit().remove(a17).commit();
                    }
                    if (!com.tencent.mm.vfs.w6.j(str)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "HOT PATCH !fileExists ");
                        return;
                    }
                    java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(str)));
                    try {
                        long readLong = dataInputStream.readLong();
                        vz5.b.a(dataInputStream, null);
                        if (!(readLong == 96093072812398L)) {
                            xVar.a(str, response);
                            return;
                        }
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Bi();
                        java.lang.String i17 = c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("TPCFile");
                        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
                        java.lang.String str2 = a18.f213279f;
                        if (str2 != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                            if (!a18.f213279f.equals(l17)) {
                                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                            }
                        }
                        java.lang.String str3 = a18.f213279f;
                        int lastIndexOf = str3.lastIndexOf("/");
                        if (lastIndexOf >= 0) {
                            str3 = str3.substring(lastIndexOf + 1);
                        }
                        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(h07, str3);
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        kotlin.jvm.internal.o.d(i17);
                        java.lang.String o17 = r6Var2.o();
                        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                        ((ku5.t0) ku5.t0.f312615d).q(new wn4.v(i17, str, o17, new wn4.n(response, currentTimeMillis, r6Var2)));
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(dataInputStream, th6);
                            throw th7;
                        }
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
        com.tencent.mars.xlog.Log.i(this.f447543i, "onTaskMd5Checking cdnUrl:" + this.f447538d.f142412h + " downloadId:" + this.f447539e + " id:" + j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String url, long j18, long j19) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i(this.f447543i, "onTaskProgressChanged cdnUrl:" + this.f447538d.f142412h + " downloadId:" + this.f447539e + " id:" + j17 + " revcLeng:" + j18 + " totalLen:" + j19);
        if (this.f447539e == j17) {
            ((ku5.t0) ku5.t0.f312615d).B(new wn4.c(j18, j19));
        }
        if (this.f447538d.e() == 4) {
            this.f447540f.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            java.lang.String str = (java.lang.String) this.f447542h.get(java.lang.Long.valueOf(j17));
            try {
                kotlin.jvm.internal.o.d(str);
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
                java.lang.String str2 = this.f447543i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTaskProgressChanged = filePath = ");
                sb6.append(str);
                sb6.append("， is file exist = ");
                sb6.append(r6Var.m());
                sb6.append("， 长度 ");
                sb6.append(r6Var.C());
                sb6.append(", recvLen = ");
                long j27 = 1024;
                sb6.append((j18 / j27) / j27);
                sb6.append("MB");
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                long j28 = 2;
                if (j19 > w73.a.f443491a * j28) {
                    w73.a.f443491a = j19 / j28;
                }
                if (this.f447544m || j18 <= w73.a.f443491a || !r6Var.m()) {
                    return;
                }
                this.f447544m = true;
                this.f447541g.put(str, java.lang.Boolean.FALSE);
                w73.a.a(r6Var.o(), new wn4.d(this, str, r6Var, j17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(this.f447543i, "onTaskProgressChanged = filePath = " + str + "， is file exist = " + e17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f447543i, "onTaskResumed cdnUrl:" + this.f447538d.f142412h + " downloadId:" + this.f447539e + " id:" + j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        com.tencent.mars.xlog.Log.i(this.f447543i, "onTaskPaused cdnUrl:" + this.f447538d.f142412h + " downloadId:" + this.f447539e + " id:" + j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        java.lang.String str2 = this.f447543i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTaskStarted cdnUrl:");
        sb6.append(this.f447538d.f142412h);
        sb6.append(" downloadId:");
        sb6.append(this.f447539e);
        sb6.append(" id:");
        sb6.append(j17);
        sb6.append(" savedFilePath:");
        sb6.append(str == null ? "" : str);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        if (this.f447539e == j17) {
            jx3.f.INSTANCE.idkeyStat(1429L, 12L, 1L, false);
            ((ku5.t0) ku5.t0.f312615d).B(wn4.e.f447537d);
        }
        com.tencent.mars.xlog.Log.i(this.f447543i, "HdiffApk, onTaskStarted taskId: savedFilePath = " + str);
        if (this.f447538d.e() != 4 || str == null) {
            return;
        }
        this.f447542h.put(java.lang.Long.valueOf(j17), str);
        this.f447540f.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.Long.parseLong("0")));
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTaskRemoved cdnUrl:");
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = this.f447538d;
        sb6.append(tinkerSyncResponse.f142412h);
        sb6.append(" downloadId:");
        long j18 = this.f447539e;
        sb6.append(j18);
        sb6.append(" id:");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(this.f447543i, sb6.toString());
        if (j18 == j17) {
            com.tencent.mm.plugin.downloader.model.r0.i().s(this);
            java.lang.Integer packageType = tinkerSyncResponse.f142410f;
            kotlin.jvm.internal.o.f(packageType, "packageType");
            w73.f.i(10, packageType.intValue(), 102);
        }
    }
}
