package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class a2 extends l75.n0 implements p94.i0, fe0.g4 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.storage.y1 f165920g = new com.tencent.mm.plugin.sns.storage.y1(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f165921h = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.x1.U, "SnsCover")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f165922d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.l f165923e;

    /* renamed from: f, reason: collision with root package name */
    public final nb4.m f165924f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.sns.storage.x1.U, "SnsCover", null);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f165922d = db6;
        this.f165923e = new kk.l(5);
        this.f165924f = new nb4.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "createSnsCoverStorage " + db6 + "  " + java.lang.Thread.currentThread().getId());
    }

    public final void D0(com.tencent.mm.plugin.sns.storage.x1 x1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearDBData", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        x1Var.field_imageBgUrl = "";
        x1Var.field_thumbUrl = "";
        x1Var.field_videoBgUrl = "";
        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.sns.storage.z1(x1Var.field_localThumb, x1Var.field_localImage, x1Var.field_localVideo));
        x1Var.field_localVideo = "";
        x1Var.field_localImage = "";
        x1Var.field_localThumb = "";
        W0(x1Var, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearDBData", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
    }

    public final boolean J0(java.lang.String userName, long j17, java.lang.String path) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadBitmap", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.sns.storage.x1 L0 = L0(userName);
        boolean z17 = false;
        if (L0.getType() == 1 || L0.getType() == 6 || L0.getType() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadPhoto", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "downloadPhoto user:" + userName + " id:" + j17 + " path:" + path + " size:" + com.tencent.mm.vfs.w6.k(path));
            com.tencent.mm.plugin.sns.storage.x1 L02 = L0(userName);
            java.lang.Long u07 = L02.u0();
            if ((u07 != null && u07.longValue() == j17) && L02.field_success) {
                L02.field_localImage = path;
                z17 = W0(L02, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPhoto", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPhoto", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadThumb", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "downloadThumb user:" + userName + " id:" + j17 + " path:" + path + " size:" + com.tencent.mm.vfs.w6.k(path));
            com.tencent.mm.plugin.sns.storage.x1 L03 = L0(userName);
            java.lang.Long u08 = L03.u0();
            if ((u08 != null && u08.longValue() == j17) && L03.field_success) {
                L03.field_localThumb = path;
                z17 = W0(L03, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadThumb", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadThumb", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadBitmap", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return z17;
    }

    public final com.tencent.mm.plugin.sns.storage.x1 L0(java.lang.String userName) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        kk.l lVar = this.f165923e;
        if (lVar.get(userName) != null) {
            java.lang.Object obj = lVar.get(userName);
            kotlin.jvm.internal.o.f(obj, "getAndUptime(...)");
            com.tencent.mm.plugin.sns.storage.x1 x1Var = (com.tencent.mm.plugin.sns.storage.x1) obj;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return x1Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from SnsCover where userName=\"");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.tencent.mm.sdk.platformtools.t8.n(userName);
        sb6.append(userName);
        sb6.append('\"');
        android.database.Cursor f17 = this.f165922d.f(sb6.toString(), null, 2);
        com.tencent.mm.plugin.sns.storage.x1 x1Var2 = new com.tencent.mm.plugin.sns.storage.x1();
        if (f17.moveToFirst()) {
            x1Var2.convertFrom(f17);
            lVar.put(userName, x1Var2);
        } else {
            if (com.tencent.mm.storage.z3.m4(userName)) {
                com.tencent.mm.plugin.sns.storage.d2 J0 = com.tencent.mm.plugin.sns.model.l4.Ej().J0(userName);
                if ((((u41.j) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).wi()).z0(userName) & 2) == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverStorage", "openIM bg flag false, do not show bg");
                    x1Var2.field_type = 5;
                } else {
                    x1Var2.field_type = 6;
                }
                x1Var2.field_userName = userName;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                z17 = (J0.field_local_flag & 2) > 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                x1Var2.field_isLike = z17;
                x1Var2.field_snsBgId = J0.field_snsBgId;
                x1Var2.T = J0.field_bgId;
            } else {
                java.lang.String a17 = f165920g.a(userName);
                com.tencent.mm.plugin.sns.storage.d2 J02 = com.tencent.mm.plugin.sns.model.l4.Ej().J0(userName);
                x1Var2.field_userName = userName;
                long j17 = J02.field_snsBgId;
                x1Var2.field_snsBgId = j17;
                x1Var2.field_type = j17 == 0 ? 0 : 1;
                x1Var2.field_success = false;
                x1Var2.field_thumbUrl = J02.field_bgUrl;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                z17 = (2 & J02.field_local_flag) > 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                x1Var2.field_isLike = z17;
                x1Var2.S = "data from extra db,maybe not friend";
                if (com.tencent.mm.vfs.w6.j(a17)) {
                    x1Var2.field_localThumb = a17;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "snscover not value,load from ext info:" + J02.field_snsBgId);
                this.f165924f.P6(J02.field_snsBgId);
            }
        }
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return x1Var2;
    }

    public final boolean P0(java.lang.String userName, java.lang.String thumb, java.lang.String cover, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCoverImageInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(thumb, "thumb");
        kotlin.jvm.internal.o.g(cover, "cover");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "updateCoverImageInfoLocal :" + userName + " thumb:" + thumb);
        com.tencent.mm.plugin.sns.storage.x1 L0 = L0(userName);
        L0.field_userName = userName;
        L0.field_type = 1;
        z0(L0);
        if (!kotlin.jvm.internal.o.b(thumb, L0.field_localThumb)) {
            ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.sns.storage.z1(L0.field_localThumb));
            L0.field_localThumb = thumb;
        }
        if (!kotlin.jvm.internal.o.b(cover, L0.field_localImage) && !kotlin.jvm.internal.o.b(thumb, L0.field_localImage)) {
            ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.sns.storage.z1(L0.field_localImage));
            L0.field_localImage = cover;
        }
        L0.field_snsCoverOffset = pc4.d.f353410a.y() ? (int) (f17 * 10000) : 0;
        boolean W0 = W0(L0, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCoverImageInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return W0;
    }

    public final boolean W0(com.tencent.mm.plugin.sns.storage.x1 x1Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "updateCoverInfo:" + x1Var + " post:" + z17);
        if ((x1Var != null ? x1Var.field_userName : null) == null || kotlin.jvm.internal.o.b(x1Var.field_userName, "")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return false;
        }
        boolean replace = super.replace(x1Var);
        if (replace) {
            this.f165923e.put(x1Var.field_userName, x1Var);
        }
        if (z17) {
            nb4.m mVar = this.f165924f;
            mVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            androidx.lifecycle.j0 j0Var = mVar.f336087e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            j0Var.postValue(x1Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return replace;
    }

    public boolean b1(java.lang.String userName, long j17, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "updateFinderInfoFromDetail :".concat(userName));
        if ((finderObject != null ? finderObject.getObjectDesc() : null) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.x1 L0 = L0(userName);
        java.lang.Long u07 = L0.u0();
        if (u07 == null || u07.longValue() != j17 || !L0.field_success) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return false;
        }
        try {
            L0.field_finderObject = finderObject.toByteArray();
            L0.field_finderCheckTime = java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception unused) {
        }
        boolean W0 = W0(L0, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return W0;
    }

    public void y0(java.lang.String userName) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("blockCover", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "blockCover:".concat(userName));
        com.tencent.mm.plugin.sns.storage.x1 L0 = com.tencent.mm.plugin.sns.model.l4.Bj().L0(userName);
        L0.field_type = 5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCoverBlock", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct();
        snsCoverReportStruct.f60519f = snsCoverReportStruct.b("UserName", L0.getUserName(), true);
        snsCoverReportStruct.f60517d = 5;
        java.lang.String x1Var = L0.toString();
        kotlin.jvm.internal.o.f(x1Var, "toString(...)");
        snsCoverReportStruct.p(r26.i0.t(x1Var, ",", ";", false));
        snsCoverReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCoverBlock", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCoverInfo$default", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        W0(L0, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCoverInfo$default", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("blockCover", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
    }

    public final void z0(com.tencent.mm.plugin.sns.storage.x1 x1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCoverResource", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "clearCoverResource");
        x1Var.field_snsBgId = -1L;
        x1Var.field_imageBgUrl = "";
        x1Var.field_thumbUrl = "";
        x1Var.field_videoBgUrl = "";
        x1Var.field_finderObject = null;
        x1Var.field_success = false;
        x1Var.field_isLike = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCoverResource", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
    }
}
