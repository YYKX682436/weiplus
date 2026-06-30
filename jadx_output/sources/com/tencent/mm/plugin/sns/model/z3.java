package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class z3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f164796a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f164797b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.l2 f164798c;

    /* renamed from: d, reason: collision with root package name */
    public final int f164799d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.y3 f164800e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f164801f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f164803h;

    /* renamed from: i, reason: collision with root package name */
    public r45.mj4 f164804i;

    /* renamed from: j, reason: collision with root package name */
    public int f164805j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f164806k;

    /* renamed from: g, reason: collision with root package name */
    public long f164802g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final dn.k f164807l = new com.tencent.mm.plugin.sns.model.x3(this);

    public z3(java.lang.String str, int i17, com.tencent.mm.plugin.sns.storage.l2 l2Var, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.sns.model.y3 y3Var) {
        this.f164801f = "";
        this.f164803h = "";
        this.f164804i = new r45.mj4();
        java.lang.System.currentTimeMillis();
        this.f164796a = str2;
        this.f164797b = str3;
        this.f164800e = y3Var;
        this.f164799d = i17;
        this.f164798c = l2Var;
        this.f164806k = str;
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().parseFrom(l2Var.h());
            this.f164804i = mj4Var;
            java.lang.String str4 = mj4Var.f380572p;
            this.f164801f = str4;
            this.f164803h = mj4Var.f380579w;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
                this.f164801f = g17;
                r45.mj4 mj4Var2 = this.f164804i;
                mj4Var2.f380572p = g17;
                try {
                    l2Var.m(mj4Var2.toByteArray());
                    com.tencent.mm.plugin.sns.model.l4.Hj().Y2(l2Var.c(), l2Var);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightCdnUpload", e17, "", new java.lang.Object[0]);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "sightupload %d videopath %s sightFileSize %d md5 %s", java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf((int) com.tencent.mm.vfs.w6.k(str2)), this.f164803h);
            com.tencent.mm.plugin.sns.statistics.v0.c(this.f164799d);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
        }
    }

    public static void a(com.tencent.mm.plugin.sns.model.z3 z3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        java.lang.String str = z3Var.f164796a;
        com.tencent.mm.plugin.sns.storage.l2 l2Var = z3Var.f164798c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMd5Info", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        try {
            z3Var.f164804i = (r45.mj4) new r45.mj4().parseFrom(l2Var.h());
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
            z3Var.f164803h = p17;
            r45.mj4 mj4Var = z3Var.f164804i;
            mj4Var.f380579w = p17;
            l2Var.m(mj4Var.toByteArray());
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "new md5 is %s %s", str, z3Var.f164803h);
            com.tencent.mm.plugin.sns.model.l4.Hj().Y2(l2Var.c(), l2Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in updateMd5Info %s", e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMd5Info", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.l2 b(com.tencent.mm.plugin.sns.model.z3 z3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.tencent.mm.plugin.sns.storage.l2 l2Var = z3Var.f164798c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return l2Var;
    }

    public static /* synthetic */ java.lang.String c(com.tencent.mm.plugin.sns.model.z3 z3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        z3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return null;
    }

    public static /* synthetic */ int d(com.tencent.mm.plugin.sns.model.z3 z3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        int i17 = z3Var.f164799d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return i17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.model.y3 e(com.tencent.mm.plugin.sns.model.z3 z3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.tencent.mm.plugin.sns.model.y3 y3Var = z3Var.f164800e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return y3Var;
    }

    public final boolean f(r45.vh4 vh4Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        if (this.f164802g == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f164802g = java.lang.System.currentTimeMillis();
        }
        java.lang.String str2 = this.f164801f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SightCdnUpload", "cdntra genClientId failed not use cdn");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return false;
        }
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_NetSceneSnsUpload_2";
        mVar.f241787f = this.f164807l;
        mVar.field_mediaId = str2;
        java.lang.String str3 = this.f164796a;
        mVar.field_fullpath = str3;
        java.lang.String str4 = this.f164797b;
        mVar.field_thumbpath = str4;
        if (com.tencent.mm.plugin.sns.storage.m2.D2(str4)) {
            mVar.f241793n = 20251;
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "upload sight with wxam thumb, %s", str4);
        }
        mVar.field_fileType = 20202;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = true;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 102;
        mVar.field_bzScene = 1;
        if (pc4.d.f353410a.v(false)) {
            mVar.field_largesvideo = 0;
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            mVar.field_largesvideo = com.tencent.mm.sdk.platformtools.o4.R("OpenSdkVideoTime").o(str, 10);
        } else if (vh4Var.f388243p) {
            mVar.field_largesvideo = d11.s.fj().Bi(d11.s.fj().qj());
        } else {
            mVar.field_largesvideo = d11.s.fj().Bi(vh4Var.f388235e ? d11.s.fj().pj() : d11.s.fj().nj());
        }
        if (com.tencent.mm.pluginsdk.model.e4.c(str3)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(106L, 31L, 1L, false);
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f164803h) && !this.f164803h.equals(p17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "isNotSafeSightVideo old srcmd5 %s newmd5 %s ", this.f164803h, p17);
            h(-2);
            ((com.tencent.mm.plugin.sns.model.u7) this.f164800e).a(false, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return false;
        }
        if (pc4.f.f353435a.b() && vh4Var != null && !vh4Var.f388235e && !vh4Var.f388243p) {
            try {
                r45.u76 u76Var = new r45.u76();
                u76Var.f387130d = 2;
                mVar.P = u76Var.toByteArray();
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightCdnUpload", "set cdnUploadInfo error");
            }
        }
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            this.f164805j = (vh4Var == null || !vh4Var.f388235e) ? 5 : 4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SightCdnUpload", "cdntra addSendTask failed. clientid:%s", str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return false;
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
        com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
        int i17 = this.f164799d;
        com.tencent.mm.plugin.sns.storage.l2 n17 = Hj.n1(i17);
        n17.j(0);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().parseFrom(n17.h());
            mj4Var.f380572p = "";
            r45.vh4 vh4Var = mj4Var.B;
            if (vh4Var != null) {
                vh4Var.f388236f = 0;
            }
            n17.m(mj4Var.toByteArray());
            com.tencent.mm.plugin.sns.model.l4.Hj().Y2(i17, n17);
            com.tencent.mm.plugin.sns.model.l4.xj().A(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        }
    }

    public final void h(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
        com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
        int i18 = this.f164799d;
        com.tencent.mm.plugin.sns.storage.l2 n17 = Hj.n1(i18);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().parseFrom(n17.h());
            mj4Var.f380570n = 1;
            mj4Var.f380575s = i17;
            r45.vh4 vh4Var = this.f164804i.B;
            if (vh4Var != null) {
                vh4Var.f388236f = 0;
            }
            n17.m(mj4Var.toByteArray());
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.model.l4.xj().A(i18);
        com.tencent.mm.plugin.sns.model.l4.Hj().Y2(i18, n17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
    }
}
