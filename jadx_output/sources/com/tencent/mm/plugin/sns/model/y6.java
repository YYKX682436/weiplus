package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class y6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f164773a = new com.tencent.mm.sdk.platformtools.r2(10);

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f164774b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_videoinfo_check, true);

    public static boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCanSnsOnlineVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        d11.s.fj();
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_VDIEO_PLAYTYPE_INT_SYNC, -1);
        boolean z17 = true;
        if (r17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "checkCanSnsOnlineVideo by local enable");
        } else {
            if (r17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "checkCanSnsOnlineVideo by local disable");
            } else {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_ONLINE_VIDEO_INT, -1)).intValue();
                d11.s.Ai();
                r6 = intValue != 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "check can sns online play video [%b] mmvideoplayer[%b] opcode[%d] abTestFlag[%d]", java.lang.Boolean.valueOf(r6), java.lang.Boolean.TRUE, java.lang.Integer.valueOf(intValue), 1);
            }
            z17 = r6;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanSnsOnlineVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return z17;
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.String str2;
        int indexOf;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fileNameToSnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "fileNameToSnsLocalId >> fileName: %s", str);
        java.lang.String str3 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileNameToSnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return "";
        }
        int indexOf2 = str.indexOf("SNS_");
        if (indexOf2 <= -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileNameToSnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return "";
        }
        try {
            str2 = str.substring(indexOf2 + 4);
        } catch (java.lang.Exception unused) {
        }
        try {
            if (str2.contains("ad_table_")) {
                int indexOf3 = str2.indexOf("ad_table_");
                if (indexOf3 <= -1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileNameToSnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return "";
                }
                indexOf = str2.indexOf("_", indexOf3 + 9 + 1);
            } else {
                int indexOf4 = str2.indexOf("sns_table_");
                if (indexOf4 <= -1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileNameToSnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return "";
                }
                indexOf = str2.indexOf("_", indexOf4 + 10 + 1);
            }
            if (indexOf > 0) {
                str2 = str2.substring(0, indexOf);
            }
        } catch (java.lang.Exception unused2) {
            str3 = str2;
            str2 = str3;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "fileNameToSnsLocalId >> fileName: %s, result: %s", str, str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileNameToSnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return str2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "fileNameToSnsLocalId >> fileName: %s, result: %s", str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileNameToSnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str2;
    }

    public static java.lang.String c(int i17, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genCdnMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        java.lang.String m17 = com.tencent.mm.modelcdntran.l3.m(i17, jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genCdnMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return m17;
    }

    public static java.lang.String d(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return "";
        }
        if (i17 == -1) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsVideoLogic", "genFileName >> mediaIndex is Error", new java.lang.Object[0]);
            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("genFileName >> mediaIndex is Illegal");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            throw illegalArgumentException;
        }
        java.lang.String str2 = "SNS_" + str + "_" + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str2;
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return "";
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            java.lang.String d17 = d(str, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return d17;
        }
        java.lang.String str3 = "SNS_" + str + "_" + str2 + "_" + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str3;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        java.util.ArrayList o17 = t21.d3.o(str2);
        if (o17 == null || o17.size() == 0) {
            java.lang.String e17 = e(str, str3, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return e17;
        }
        java.util.Iterator it = o17.iterator();
        while (it.hasNext()) {
            t21.v2 v2Var = (t21.v2) it.next();
            if (android.text.TextUtils.isEmpty(v2Var.B) || v2Var.B.contains(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getCurrentDownloadVideoInfoFlag for play mediaid:%s flag:%s path:%s", str2, v2Var.B, v2Var.C);
                java.lang.String d17 = v2Var.d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return d17;
            }
        }
        java.lang.String e18 = e(str, str3, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return e18;
    }

    public static java.lang.String g(java.lang.String str, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (android.text.TextUtils.isEmpty(jj4Var.U)) {
            java.lang.String d17 = d(str, jj4Var.Y);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return d17;
        }
        java.lang.String f17 = f(str, jj4Var.f377855d, jj4Var.U, jj4Var.Y);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return f17;
    }

    public static t21.v2 h(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            t21.v2 k17 = k(str, str2, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return k17;
        }
        java.util.ArrayList o17 = t21.d3.o(str2);
        if (o17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        java.util.Iterator it = o17.iterator();
        while (it.hasNext()) {
            t21.v2 v2Var = (t21.v2) it.next();
            java.lang.String str4 = v2Var.B;
            if (str4 != null && ca4.z0.E0(str4, str3)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return v2Var;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return null;
    }

    public static java.lang.String i(java.lang.String str, r45.jj4 jj4Var) {
        t21.v2 h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        java.lang.String str2 = jj4Var != null ? jj4Var.f377855d : "";
        java.lang.String str3 = jj4Var != null ? jj4Var.U : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "[%s]getDownloadVideoPath snsLocalId:%s videoFlag:%s", str2, str, str3);
        java.lang.String r17 = r(jj4Var);
        if (com.tencent.mm.vfs.w6.j(r17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "it needn't download video[%s] because of the video is self. %s", str, r17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return r17;
        }
        if (!android.text.TextUtils.isEmpty(str3) && (h17 = t21.d3.h(g(str, jj4Var))) != null) {
            if (android.text.TextUtils.isEmpty(h17.O) || android.text.TextUtils.isEmpty(str2) || h17.O.equals(str2) || !f164774b) {
                if (!h17.i() || !com.tencent.mm.vfs.w6.j(h17.C)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return null;
                }
                java.lang.String str4 = h17.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return str4;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoLogic", "video info not match,delete");
            t21.d3.e(h17.d());
        }
        java.util.ArrayList o17 = t21.d3.o(str2);
        if (o17 == null || o17.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getDownloadVideoPath info null");
            java.lang.String w17 = w(str, jj4Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return w17;
        }
        java.util.Iterator it = o17.iterator();
        while (it.hasNext()) {
            t21.v2 v2Var = (t21.v2) it.next();
            boolean j17 = com.tencent.mm.vfs.w6.j(v2Var.C);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getDownloadVideoPath snsLocalId:%s request-flag:%s dbflag:%s fileExists:%b path:%s", str, jj4Var.U, v2Var.B, java.lang.Boolean.valueOf(j17), v2Var.C);
            if (ca4.z0.E0(v2Var.B, jj4Var.U)) {
                if (!j17 || !v2Var.i()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return null;
                }
                java.lang.String str5 = v2Var.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return str5;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getDownloadVideoPath not find select videoFlag");
        java.lang.String w18 = w(str, jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return w18;
    }

    public static t21.v2 j(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        java.lang.String d17 = d(str, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        t21.v2 h17 = t21.d3.h(d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return h17;
    }

    public static t21.v2 k(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        if (i17 == -1) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsVideoLogic", "getInfoBySnsLocalIdOrMediaId mediaIndex is error", new java.lang.Object[0]);
            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("getInfoBySnsLocalIdOrMediaId >> mediaIndex is Illegal");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            throw illegalArgumentException;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            t21.v2 j17 = j(str, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return j17;
        }
        t21.v2 j18 = t21.d3.j(d(str, i17), str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return j18;
    }

    public static t21.v2 l(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (android.text.TextUtils.isEmpty(str3)) {
            t21.v2 k17 = k(str, str2, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return k17;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        t21.v2 i18 = t21.d3.i(f(str, str2, str3, i17), str2, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return i18;
    }

    public static java.lang.String m(java.lang.String str) {
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getRelocatedVideoPath >> localId: %s", str);
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
        if (timeLine == null || (a90Var = timeLine.ContentObj) == null || (linkedList = a90Var.f369840h) == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoLogic", "getRelocatedVideoPath but no valid media found");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        java.lang.String o17 = o(str, (r45.jj4) timeLine.ContentObj.f369840h.get(0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return o17;
    }

    public static java.lang.String n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoDir", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoDir", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "get sns video dir %s mediaId %s", d17, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoDir", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return d17;
    }

    public static java.lang.String o(java.lang.String str, r45.jj4 jj4Var) {
        java.util.ArrayList o17;
        t21.v2 t17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        java.lang.String r17 = r(jj4Var);
        if (com.tencent.mm.vfs.w6.j(r17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSnsVideoFullPath >> it needn't download video[%s] because of the video is self. %s", str, r17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return r17;
        }
        if (!android.text.TextUtils.isEmpty(jj4Var.U)) {
            t21.v2 t18 = t(jj4Var, "V2");
            if (t18 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSnsVideoFullPath have flag but result is null %s>>", jj4Var.f377855d);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSnsVideoFullPath have flag %s, %s >>", jj4Var.f377855d, t18);
            java.lang.String str2 = t18.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return str2;
        }
        java.lang.String i17 = i(str, jj4Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSnsVideoFullPath no have flag %s, %s >>", jj4Var.f377855d, i17);
        if (!android.text.TextUtils.isEmpty(i17) || (o17 = t21.d3.o(jj4Var.f377855d)) == null || o17.isEmpty() || (t17 = t(jj4Var, "V2")) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSnsVideoFullPath have flag %s, %s >>", jj4Var.f377855d, i17);
        java.lang.String str3 = t17.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str3;
    }

    public static java.lang.String p(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        com.tencent.mm.sdk.platformtools.r2 r2Var = f164773a;
        java.lang.String str = (java.lang.String) r2Var.get(jj4Var.f377855d + jj4Var.U);
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSnsVideoPath by cache:%s,[%s][%s]", str, jj4Var.f377855d, jj4Var.U);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "[%s]getSnsVideoPath flag:%s", jj4Var.f377855d, jj4Var.U);
        java.lang.String str2 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.R(jj4Var);
        if (android.text.TextUtils.isEmpty(jj4Var.U)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "get sns video path1 %s", str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return str2;
        }
        java.util.ArrayList o17 = t21.d3.o(jj4Var.f377855d);
        if (o17 != null) {
            java.util.Iterator it = o17.iterator();
            while (it.hasNext()) {
                t21.v2 v2Var = (t21.v2) it.next();
                java.lang.String str3 = v2Var.C;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "[%s]select dbflag:%s path:%s", jj4Var.f377855d, v2Var.B, str3);
                if (android.text.TextUtils.isEmpty(v2Var.B)) {
                    r2Var.put(jj4Var.f377855d + jj4Var.U, str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return str2;
                }
                if (ca4.z0.E0(v2Var.B, jj4Var.U)) {
                    r2Var.put(jj4Var.f377855d + jj4Var.U, str3);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return str3;
                }
            }
        }
        java.lang.String str4 = str2 + "_" + jj4Var.U;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "get sns video flag path3 %s", str4);
        r2Var.put(jj4Var.f377855d + jj4Var.U, str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str4;
    }

    public static java.lang.String q(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoThumbImagePath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoThumbImagePath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return "";
        }
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
        java.lang.String str = d17 + ca4.z0.U(jj4Var);
        if (!com.tencent.mm.vfs.w6.j(str)) {
            str = d17 + ca4.z0.a0(jj4Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "get sns video thumb path %s", str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoThumbImagePath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str;
    }

    public static java.lang.String r(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoTmpPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoTmpPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        java.lang.String str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.Y(jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoTmpPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str;
    }

    public static t21.v2 s(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSuggestPlayVideoInfo for play >> %s, %s", jj4Var.f377855d, jj4Var.U);
        java.util.ArrayList o17 = t21.d3.o(jj4Var.f377855d);
        if (o17 == null || o17.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        java.util.Iterator it = o17.iterator();
        while (it.hasNext()) {
            t21.v2 v2Var = (t21.v2) it.next();
            if (android.text.TextUtils.isEmpty(v2Var.B) || v2Var.B.contains("V2") || v2Var.B.contains("V1") || v2Var.B.contains("V0")) {
                if (com.tencent.mm.vfs.w6.j(v2Var.C) && v2Var.i()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSuggestPlayVideoInfo for play mediaid:%s flag:%s path:%s", jj4Var.f377855d, v2Var.B, v2Var.C);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return v2Var;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return null;
    }

    public static t21.v2 t(r45.jj4 jj4Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSuggestPlayVideoInfo >> %s, %s", jj4Var.f377855d, jj4Var.U);
        java.util.ArrayList o17 = t21.d3.o(jj4Var.f377855d);
        if (o17 == null || o17.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoLogic", "getSuggestPlayVideoInfo empty result>> %s, %s", jj4Var.f377855d, jj4Var.U);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        java.util.Iterator it = o17.iterator();
        while (it.hasNext()) {
            t21.v2 v2Var = (t21.v2) it.next();
            ik4.q qVar = ik4.q.f291967a;
            if (qVar.a(v2Var.B) >= qVar.a(str) && com.tencent.mm.vfs.w6.j(v2Var.C) && v2Var.i()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "getSuggestPlayVideoInfo mediaid:%s flag:%s path:%s", jj4Var.f377855d, v2Var.B, v2Var.C);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return v2Var;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return null;
    }

    public static boolean u(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoLogic", "init sns record, but snsLocalId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return false;
        }
        java.lang.String d17 = d(str, i18);
        t21.v2 v2Var = new t21.v2();
        v2Var.f415000a = d17;
        v2Var.f415012j = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var.f415011i = 130;
        v2Var.G = i17;
        v2Var.O = str2;
        v2Var.P = true;
        boolean x17 = t21.o2.Ui().x(v2Var, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "init sns Record filename %s, insert %b", d17, java.lang.Boolean.valueOf(x17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return x17;
    }

    public static boolean v(java.lang.String str, java.lang.String str2, int i17, r45.jj4 jj4Var, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoLogic", "init sns record, but snsLocalId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return false;
        }
        java.lang.String g17 = g(str, jj4Var);
        t21.v2 v2Var = new t21.v2();
        v2Var.f415000a = g17;
        v2Var.f415012j = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var.f415011i = 130;
        java.lang.String str4 = "x" + jj4Var.U;
        v2Var.B = str4;
        v2Var.G = i17;
        v2Var.O = str2;
        v2Var.P = true;
        v2Var.C = str3;
        boolean x17 = t21.o2.Ui().x(v2Var, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "init sns Record filename %s videoFlag:%s insert %b", g17, str4, java.lang.Boolean.valueOf(x17));
        if (!x17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            t21.v2 h17 = t21.d3.h(g17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsVideoLogic", "initSnsRecord error!insert info:%s exist info:%s", v2Var.toString(), h17 != null ? h17.toString() : "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return x17;
    }

    public static java.lang.String w(java.lang.String str, r45.jj4 jj4Var) {
        t21.v2 h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        java.lang.String r17 = r(jj4Var);
        if (com.tencent.mm.vfs.w6.j(r17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "it needn't download video[%s] because of the video is self. %s", str, r17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return r17;
        }
        if (jj4Var != null && !android.text.TextUtils.isEmpty(jj4Var.U) && (h17 = h(str, jj4Var.f377855d, jj4Var.U, jj4Var.Y)) != null) {
            java.lang.String str2 = h17.C;
            if (!com.tencent.mm.vfs.w6.j(str2) || !h17.i()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "isDownloadFinish return 1:%s", str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return str2;
        }
        java.lang.String p17 = p(jj4Var);
        boolean j17 = com.tencent.mm.vfs.w6.j(p17);
        t21.v2 k17 = k(str, jj4Var != null ? jj4Var.f377855d : null, jj4Var != null ? jj4Var.Y : -1);
        if (k17 == null) {
            if (!j17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "video info is null and file is no exists, return null.[%s]", str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "it old version already download video[%s]. path :%s", str, p17);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_disable_sns_video_info_fix, false)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return p17;
            }
            u(str, jj4Var != null ? jj4Var.f377855d : null, 30, jj4Var != null ? jj4Var.Y : -1);
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoLogic", "recreate VideoInfo for %s", str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        if (jj4Var.N || str.toLowerCase().contains("ad")) {
            if (j17 && k17.i() && (android.text.TextUtils.isEmpty(k17.B) || android.text.TextUtils.isEmpty(jj4Var.U))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "[ad]it had download sns video[%s]", k17.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return p17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "[ad]it don't download video[%s] finish. file[%b], return null.", k17.toString(), java.lang.Boolean.valueOf(j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        boolean j18 = com.tencent.mm.vfs.w6.j(k17.C);
        if (!j18 || !k17.i() || (!android.text.TextUtils.isEmpty(k17.B) && !android.text.TextUtils.isEmpty(jj4Var.U))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "it don't download video[%s] finish. file[%b], return null.", k17.toString(), java.lang.Boolean.valueOf(j18));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "it had download sns video[%s]", k17.toString());
        java.lang.String str3 = k17.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str3;
    }

    public static boolean x(java.lang.String str, java.lang.String str2, int i17) {
        boolean z17;
        boolean C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postSnsVideoWithIndex", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        t21.v2 j17 = j(str, i17);
        if (j17 == null) {
            j17 = new t21.v2();
            j17.f415000a = d(str, i17);
            z17 = true;
        } else {
            z17 = false;
        }
        j17.f415012j = com.tencent.mm.sdk.platformtools.t8.i1();
        j17.A = str2;
        j17.f415011i = 199;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "snsLocalId: %s, mediaIndex: %d info is insert", str, java.lang.Integer.valueOf(i17));
            C = t21.o2.Ui().x(j17, true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "snsLocalId: %s, mediaIndex: %d info is update", str, java.lang.Integer.valueOf(i17));
            j17.U = 33555200;
            C = t21.o2.Ui().C(j17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "post sns video snsLocalId %s, md5 %s ret %b mediaIndex: %d", str, str2, java.lang.Boolean.valueOf(C), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postSnsVideoWithIndex", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return C;
    }

    public static boolean y(t21.v2 v2Var, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        v2Var.f415011i = 130;
        v2Var.G = i17;
        v2Var.U = 268435712;
        v2Var.O = str;
        v2Var.P = true;
        boolean C = t21.o2.Ui().C(v2Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoLogic", "update sns Record filename %s, update %b", v2Var.d(), java.lang.Boolean.valueOf(C));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return C;
    }
}
