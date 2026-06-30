package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class e2 extends l75.n0 implements p94.j0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f165969g = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.d2.f165965p1, "snsExtInfo3")};

    /* renamed from: d, reason: collision with root package name */
    public boolean f165970d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f165971e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.i1 f165972f;

    public e2(l75.k0 k0Var, com.tencent.mm.plugin.sns.storage.i1 i1Var) {
        super(k0Var, com.tencent.mm.plugin.sns.storage.d2.f165965p1, "snsExtInfo3", null);
        boolean z17 = false;
        this.f165970d = false;
        this.f165972f = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( snsExtInfo3 )", null, 2);
        int columnIndex = f17.getColumnIndex(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        boolean z18 = false;
        boolean z19 = false;
        boolean z27 = false;
        while (f17.moveToNext()) {
            if (columnIndex >= 0) {
                java.lang.String string = f17.getString(columnIndex);
                z17 = "imBGaeskey".equalsIgnoreCase(string) ? true : z17;
                z18 = "imBGauthkey".equalsIgnoreCase(string) ? true : z18;
                z19 = "imBGmd5sum".equalsIgnoreCase(string) ? true : z19;
                if ("imBGfileid".equalsIgnoreCase(string)) {
                    z27 = true;
                }
            }
        }
        f17.close();
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (!z17) {
            k0Var.A("snsExtInfo3", "Alter table snsExtInfo3 add imBGaeskey STRING");
        }
        if (!z18) {
            k0Var.A("snsExtInfo3", "Alter table snsExtInfo3 add imBGauthkey STRING");
        }
        if (!z19) {
            k0Var.A("snsExtInfo3", "Alter table snsExtInfo3 add imBGmd5sum STRING");
        }
        if (!z27) {
            k0Var.A("snsExtInfo3", "Alter table snsExtInfo3 add imBGfileid STRING");
        }
        k0Var.w(java.lang.Long.valueOf(F));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        this.f165971e = k0Var;
        this.f165972f = i1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsExtStorage", "createExtStorage " + k0Var + "  " + java.lang.Thread.currentThread().getId());
    }

    public boolean C1(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        int i17 = J0.field_iFlag;
        J0.field_iFlag = z17 ? i17 | 1 : i17 & (-2);
        u1(J0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return true;
    }

    public void D0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detchCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        this.f165970d = false;
        com.tencent.mm.plugin.sns.model.o5 o5Var = (com.tencent.mm.plugin.sns.model.o5) this.f165972f;
        o5Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushAll", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.m5(o5Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushAll", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detchCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    public com.tencent.mm.plugin.sns.storage.d2 J0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 d2Var = new com.tencent.mm.plugin.sns.storage.d2();
        com.tencent.mm.plugin.sns.storage.i1 i1Var = this.f165972f;
        if (i1Var != null && this.f165970d) {
            com.tencent.mm.plugin.sns.model.o5 o5Var = (com.tencent.mm.plugin.sns.model.o5) i1Var;
            o5Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExt", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            com.tencent.mm.plugin.sns.storage.d2 d2Var2 = (com.tencent.mm.plugin.sns.storage.d2) o5Var.f164549a.get(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExt", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            if (d2Var2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                return d2Var2;
            }
            d2Var = new com.tencent.mm.plugin.sns.storage.d2();
        }
        d2Var.field_userName = str;
        super.get(d2Var, getPrimaryKey());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return d2Var;
    }

    public boolean K1(java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27) {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        int i19 = J0.field_iFlag | 4096;
        int i27 = (J0.u0() != null ? J0.u0().f371431g : 0) | 4096;
        int i28 = z17 ? 4320 : -1;
        if (z18) {
            i28 = 72;
        }
        if (z27) {
            i28 = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
        }
        if (z19) {
            i17 = i19 | 2048;
            i18 = i27 | 2048;
        } else {
            i17 = i19 & (-2049);
            i18 = i27 & (-2049);
        }
        J0.field_iFlag = i17;
        r45.cb6 u07 = J0.u0();
        if (u07 != null) {
            u07.f371431g = i18;
            u07.f371432h = i28;
            J0.w0(u07);
        }
        u1(J0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return true;
    }

    public r45.k53 L0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFault", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFaultEnter", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        java.lang.String u17 = com.tencent.mm.sdk.platformtools.o4.L().u("Anr.SnsFaultKey", "");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_fix_fault_oom_error, 1) == 1;
        if (!android.text.TextUtils.isEmpty(u17) && z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsExtStorage", "delete username:%s", u17);
            z0(u17);
        }
        com.tencent.mm.sdk.platformtools.o4.L().D("Anr.SnsFaultKey", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFaultEnter", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        r45.k53 k53Var = new r45.k53();
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.M0(J0.field_faultS)) {
                k53Var = (r45.k53) new r45.k53().parseFrom(J0.field_faultS);
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsExtStorage", "parser field_faultS error");
        }
        if (k53Var == null) {
            k53Var = new r45.k53();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFaultOut", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.sdk.platformtools.o4.L().D("Anr.SnsFaultKey", "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFaultOut", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFault", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return k53Var;
    }

    public r45.cb6 P0(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        r45.cb6 u07 = J0(str).u0();
        if (u07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsExtStorage", "userinfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return null;
        }
        int i17 = u07.f371431g;
        u07.f371431g = z17 ? i17 | 1 : i17 & (-2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return u07;
    }

    public void P1(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsYearMonthInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (list == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsExtStorage", "updateSnsYearMonthInfo info is null");
            list = new java.util.ArrayList();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsExtStorage", "updateSnsYearMonthInfo size:%s", java.lang.Integer.valueOf(list.size()));
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        r45.bb6 v07 = J0.v0();
        java.util.LinkedList linkedList = v07.f370660d;
        linkedList.clear();
        linkedList.addAll(list);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        try {
            J0.field_snsYearMonthInfo = v07.toByteArray();
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        u1(J0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsYearMonthInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    public r45.cb6 W0(java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        r45.cb6 u07 = J0(str).u0();
        if (u07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsExtStorage", "userinfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return null;
        }
        int i17 = u07.f371431g | 4096;
        int i18 = z17 ? 4320 : -1;
        if (z18) {
            i18 = 72;
        }
        if (z27) {
            i18 = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
        }
        u07.f371431g = z19 ? i17 | 2048 : i17 & (-2049);
        u07.f371432h = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return u07;
    }

    public r45.cb6 b1(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUserInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        r45.cb6 u07 = J0(str).u0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUserInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return u07;
    }

    public int d1(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        J0.field_albumMd5 = str2;
        J0.field_lastFirstPageRequestErrType = i17;
        J0.field_lastFirstPageRequestErrCode = i18;
        super.replace(J0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    public int f1(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        J0.field_md5 = str2;
        J0.field_lastFirstPageRequestErrType = i17;
        J0.field_lastFirstPageRequestErrCode = i18;
        super.replace(J0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    public int i1(java.lang.String str, java.lang.String str2, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        J0.field_md5 = str2;
        J0.field_adsession = bArr;
        super.replace(J0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    public boolean k1(com.tencent.mm.plugin.sns.storage.d2 d2Var) {
        com.tencent.mm.plugin.sns.storage.i1 i1Var;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (!this.f165970d || (i1Var = this.f165972f) == null) {
            boolean n17 = n1(d2Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return n17;
        }
        com.tencent.mm.plugin.sns.model.o5 o5Var = (com.tencent.mm.plugin.sns.model.o5) i1Var;
        o5Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        if (d2Var == null || com.tencent.mm.sdk.platformtools.t8.K0(d2Var.field_userName)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            z17 = false;
        } else {
            com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.n5(o5Var, d2Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH, "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (i1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH, "com.tencent.mm.plugin.sns.model.SnsExtCache");
            com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.l5((com.tencent.mm.plugin.sns.model.o5) i1Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH, "com.tencent.mm.plugin.sns.model.SnsExtCache");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH, "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return z17;
    }

    public boolean n1(com.tencent.mm.plugin.sns.storage.d2 d2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceImp", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        boolean replace = super.replace(d2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceImp", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return replace;
    }

    public boolean o1(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceNewerIds", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        J0.field_newerIds = str2;
        boolean replace = super.replace(J0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceNewerIds", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return replace;
    }

    public void p1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTimeLineMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0("@__weixintimtline");
        J0.field_md5 = "";
        J0.field_albumMd5 = "";
        k1(J0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTimeLineMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    @Override // l75.n0
    public /* bridge */ /* synthetic */ boolean replace(l75.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        boolean k17 = k1((com.tencent.mm.plugin.sns.storage.d2) f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return k17;
    }

    public boolean u1(com.tencent.mm.plugin.sns.storage.d2 d2Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (d2Var == null || (str = d2Var.field_userName) == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return false;
        }
        boolean replace = super.replace(d2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return replace;
    }

    public void y0(com.tencent.mm.plugin.sns.storage.d2 d2Var, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearBackgroundImageIfBanned", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsExtStorage", "clear cached background image as it has been banned: username=%s", str2);
            java.lang.String Di = com.tencent.mm.plugin.sns.model.l4.Di();
            com.tencent.mm.vfs.w6.h(com.tencent.mm.plugin.sns.model.f6.d(Di, str2) + (str2 + "tbg_"));
            com.tencent.mm.vfs.w6.h(com.tencent.mm.plugin.sns.model.f6.d(Di, str2) + (str2 + "bg_"));
            d2Var.field_older_bgId = null;
            d2Var.field_bgId = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearBackgroundImageIfBanned", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    public void z0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        J0.field_userName = str;
        super.delete(J0, getPrimaryKey());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    public boolean z1(java.lang.String str, r45.cb6 cb6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (cb6Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.d2 J0 = J0(str);
        java.lang.String t07 = ca4.z0.t0(cb6Var.f371430f);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cb6Var.f371429e) && (J0.field_bgUrl == null || !J0.field_bgId.equals(t07))) {
            J0.field_older_bgId = J0.field_bgId;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setChnage", "com.tencent.mm.plugin.sns.storage.SnsExt");
            J0.field_local_flag |= 1;
            J0.y0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setChnage", "com.tencent.mm.plugin.sns.storage.SnsExt");
        }
        J0.field_bgId = t07;
        java.lang.String str2 = cb6Var.f371429e;
        J0.field_bgUrl = str2;
        y0(J0, str2, str);
        J0.field_iFlag = cb6Var.f371428d;
        J0.field_snsBgId = cb6Var.f371430f;
        J0.field_local_flag |= 4;
        int i17 = cb6Var.f371431g;
        if ((i17 & 4096) == 0) {
            if ((i17 & 512) > 0) {
                cb6Var.f371431g = i17 | 4096;
                cb6Var.f371432h = 4320;
            } else if ((i17 & 1024) > 0) {
                cb6Var.f371431g = i17 | 4096;
                cb6Var.f371432h = 72;
            }
        }
        J0.w0(cb6Var);
        k1(J0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return true;
    }
}
