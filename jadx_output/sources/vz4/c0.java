package vz4;

/* loaded from: classes8.dex */
public final class c0 implements com.tencent.mm.plugin.wepkg.utils.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f441723c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.j f441724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f441725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgVersion f441726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f441727g;

    public c0(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.c0 c0Var, vz4.j jVar, boolean z17, com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion, long j17) {
        this.f441721a = str;
        this.f441722b = str2;
        this.f441723c = c0Var;
        this.f441724d = jVar;
        this.f441725e = z17;
        this.f441726f = wepkgVersion;
        this.f441727g = j17;
    }

    @Override // com.tencent.mm.plugin.wepkg.utils.i
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.sa7 sa7Var;
        r45.sa7 sa7Var2;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi error errType = " + i17 + " errCode = " + i18 + " pkgId = " + this.f441721a + " appId = " + this.f441722b);
            java.lang.Object obj = vz4.d0.f441730b;
            kotlin.jvm.internal.c0 c0Var = this.f441723c;
            vz4.j jVar = this.f441724d;
            synchronized (obj) {
                if (!c0Var.f310112d) {
                    c0Var.f310112d = true;
                    jVar.a("checkwepkgversion cgi error errType = " + i17 + " errCode = " + i18);
                }
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckWepkgVersionResponse");
        r45.d30 d30Var = (r45.d30) fVar;
        java.util.LinkedList linkedList = d30Var.f372031d;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi response.PkgList isNullOrEmpty() pkgId = " + this.f441721a + " appId = " + this.f441722b);
            java.lang.Object obj2 = vz4.d0.f441730b;
            kotlin.jvm.internal.c0 c0Var2 = this.f441723c;
            vz4.j jVar2 = this.f441724d;
            synchronized (obj2) {
                if (!c0Var2.f310112d) {
                    c0Var2.f310112d = true;
                    jVar2.a("checkwepkgversion cgi response.PkgList isNullOrEmpty()");
                }
            }
            return;
        }
        java.util.LinkedList<r45.k85> PkgList = d30Var.f372031d;
        kotlin.jvm.internal.o.f(PkgList, "PkgList");
        java.lang.String str2 = this.f441721a;
        boolean z17 = this.f441725e;
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = this.f441726f;
        java.lang.String str3 = this.f441722b;
        long j17 = this.f441727g;
        kotlin.jvm.internal.c0 c0Var3 = this.f441723c;
        vz4.j jVar3 = this.f441724d;
        for (r45.k85 k85Var : PkgList) {
            if (kotlin.jvm.internal.o.b(str2, k85Var.f378490d)) {
                if (!z17 && wepkgVersion != null) {
                    r45.va7 va7Var = k85Var.f378491e;
                    if (kotlin.jvm.internal.o.b((va7Var == null || (sa7Var2 = va7Var.f388057e) == null) ? null : sa7Var2.f385601d, wepkgVersion.f188376f)) {
                        com.tencent.liteapp.storage.WxaLiteAppInfo Bj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str3);
                        if (Bj != null) {
                            vz4.d0.a(vz4.d0.f441729a, wepkgVersion, str3, Bj.patchId);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,callBack.onSuccess()");
                            synchronized (vz4.d0.f441730b) {
                                if (!c0Var3.f310112d) {
                                    c0Var3.f310112d = true;
                                    jVar3.onSuccess(str3);
                                }
                            }
                            return;
                        }
                        vz4.d0.a(vz4.d0.f441729a, wepkgVersion, str3, null);
                        com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi response.PkgList isNullOrEmpty() pkgId = " + str2 + " appId = " + str3);
                        synchronized (vz4.d0.f441730b) {
                            if (!c0Var3.f310112d) {
                                c0Var3.f310112d = true;
                                jVar3.a("version is same dont have liteAppInfo appid =" + str3);
                            }
                        }
                        return;
                    }
                }
                r45.ra7 ra7Var = k85Var.f378493g;
                if (ra7Var != null && ra7Var.f384700d) {
                    com.tencent.mm.plugin.wepkg.model.i.c().e(k85Var.f378490d, 2, 3);
                }
                r45.va7 va7Var2 = k85Var.f378491e;
                if ((va7Var2 != null ? va7Var2.f388057e : null) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi call back PkgConfig is null pkgId = " + str2 + " appId = " + str3);
                    synchronized (vz4.d0.f441730b) {
                        if (!c0Var3.f310112d) {
                            c0Var3.f310112d = true;
                            jVar3.a("checkwepkgversion cgi call back PkgConfig is null");
                        }
                    }
                    return;
                }
                java.lang.String str4 = (va7Var2 == null || (sa7Var = va7Var2.f388057e) == null) ? null : sa7Var.f385601d;
                if (str4 == null || str4.length() == 0) {
                    com.tencent.mm.plugin.wepkg.model.o0.f(k85Var.f378490d, null);
                    com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,CurrentEnabledVersion is null ,disable Wepkg pkgId = " + str2 + " appId = " + str3);
                    synchronized (vz4.d0.f441730b) {
                        if (!c0Var3.f310112d) {
                            c0Var3.f310112d = true;
                            jVar3.a("checkwepkgversion CurrentEnabledVersion is null ,disable Wepkg");
                        }
                    }
                    return;
                }
                com.tencent.mm.plugin.wepkg.model.o0.i(str2, k85Var.f378491e.f388057e.f385602e, r0.f385603f, r0.f385604g);
                com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
                wepkgCrossProcessTask.f188343h = 3009;
                wepkgCrossProcessTask.f188344i.f188374d = str2;
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    wepkgCrossProcessTask.z();
                } else {
                    wepkgCrossProcessTask.s();
                }
                com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask2 = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
                wepkgCrossProcessTask2.f188343h = com.google.android.gms.wearable.WearableStatusCodes.DUPLICATE_CAPABILITY;
                wepkgCrossProcessTask2.f188347o.f188363e = str2;
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    wepkgCrossProcessTask2.z();
                } else {
                    wepkgCrossProcessTask2.s();
                }
                r45.ra7 ra7Var2 = k85Var.f378493g;
                if (ra7Var2 != null && ra7Var2.f384701e) {
                    ((java.util.HashSet) com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify.f188328e).add(k85Var.f378490d);
                    com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify.a();
                }
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                vz4.z zVar = new vz4.z(str2, h0Var, c0Var3, jVar3, str3);
                h0Var.f310123d = zVar;
                com.tencent.mm.plugin.wepkg.event.h.f188332a.add(new java.lang.ref.WeakReference(zVar));
                ((ku5.t0) ku5.t0.f312615d).l(new vz4.a0(h0Var, c0Var3, str2, str3, jVar3), j17 * 1000, "MicroMsg.WePkgUpdateManager");
                ((ku5.t0) ku5.t0.f312615d).g(new vz4.b0(k85Var));
                return;
            }
        }
    }
}
