package ha4;

/* loaded from: classes4.dex */
public class i implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        r45.j4 j4Var;
        r45.du5 du5Var;
        java.lang.String str;
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        if (p0Var == null || (j4Var = p0Var.f70726a) == null || (du5Var = j4Var.f377561h) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SimpleExperimentLsn", "recv null msg");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        java.lang.String g17 = x51.j1.g(du5Var);
        java.lang.String b17 = b(g17, "<TimelineObject", "</TimelineObject>");
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  timelineObj tag");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        java.lang.String b18 = b(g17, "<RecXml", "</RecXml>");
        if (com.tencent.mm.sdk.platformtools.t8.K0(b18)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  RecXml tag");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        java.lang.String b19 = b(g17, "<ADInfo", "</ADInfo>");
        if (com.tencent.mm.sdk.platformtools.t8.K0(b19)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  ADInfo tag");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject q17 = m21.y.q(b17);
        r45.ck5 ck5Var = new r45.ck5();
        ck5Var.f371621e = x51.j1.i(b19);
        r45.ca6 ca6Var = new r45.ca6();
        ck5Var.f371620d = ca6Var;
        ca6Var.f371403e = x51.j1.i(b18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
        snsObject.Id = new java.math.BigInteger(q17.Id).longValue();
        snsObject.CreateTime = q17.CreateTime;
        snsObject.Username = q17.UserName;
        snsObject.ObjectDesc = x51.j1.a(b17.getBytes());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        ca6Var.f371402d = snsObject;
        java.lang.Object obj = com.tencent.mm.plugin.sns.model.x.f164745a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        r45.g5 c17 = com.tencent.mm.plugin.sns.model.x.c(ck5Var);
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        } else {
            com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(x51.j1.g(c17.f374886e));
            l44.h3.f(aDInfo.adIPv4Url);
            int i19 = aDInfo.ad_sns_pos;
            int i27 = i19 <= 0 ? 1 : i19 + 1;
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            Fj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            Fj.o2();
            if (Fj.b3("")) {
                str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 )  AND " + Fj.p1("");
            } else {
                str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
            }
            java.lang.String str2 = (str + " AND  (snsId != 0 ) ") + com.tencent.mm.plugin.sns.storage.f2.f165983p + " limit 1";
            android.database.Cursor f17 = Fj.f165994d.f(str2, null, 2);
            if (f17.moveToFirst()) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                snsInfo.convertFrom(f17);
                i17 = snsInfo.field_createTime;
            } else {
                i17 = 0;
            }
            f17.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "getLastTime " + str2 + " createtime " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "ad.pos = %d, dbLimit = %d, createTime.limit = %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17));
            android.database.Cursor d17 = com.tencent.mm.plugin.sns.model.l4.Fj().d1("", i17, i27);
            if (d17 == null || d17.getCount() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "db return nothing");
                i18 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "db return %d feeds", java.lang.Integer.valueOf(d17.getCount()));
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                if (i19 < 0) {
                    i19 = 0;
                }
                if (d17.moveToPosition(i19)) {
                    snsInfo2.convertFrom(d17);
                } else {
                    d17.moveToLast();
                    snsInfo2.convertFrom(d17);
                }
                i18 = snsInfo2.getCreateTime() + 1;
            }
            d17.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "inserting snsid  " + c17.f374885d.f374076d.Id + " ,createTime " + i18);
            com.tencent.mm.plugin.sns.model.x.o(c17, i18, (int) com.tencent.mm.sdk.platformtools.t8.i1());
            com.tencent.mm.plugin.sns.model.x.u(c17.f374885d.f374076d.Id, aDInfo);
            try {
                y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(c17.f374885d.f374076d.Id);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdSnsInfoStorageLogic", "adVideoPreload, preload test timeline online video,  exp=" + th6.toString());
                ca4.q.c("adVideoPreloadInStorage", th6);
            }
            if (y07 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            } else {
                y07.setLocalVisible();
                try {
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = y07.getTimeLine();
                    r45.a90 a90Var = timeLine.ContentObj;
                    if (a90Var != null && (linkedList = a90Var.f369840h) != null && linkedList.size() > 0) {
                        java.util.Iterator it = timeLine.ContentObj.f369840h.iterator();
                        while (it.hasNext()) {
                            ((r45.jj4) it.next()).N = true;
                        }
                        y07.setTimeLine(timeLine);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "onRecieveMsg, exp=" + e17.toString());
                }
                com.tencent.mm.plugin.sns.model.l4.Vi().W0(y07.field_snsId, y07);
                java.lang.String t07 = ca4.z0.t0(c17.f374885d.f374076d.Id);
                if (!n74.c1.b(aDInfo, t07)) {
                    n74.c1.c(1, t07, aDInfo, c17.f374885d.f374076d, y07.convertToSnsInfo());
                }
                com.tencent.mm.plugin.sns.storage.ADXml adXml = y07.getAdXml();
                com.tencent.mm.plugin.sns.storage.ADInfo adInfo = y07.getAdInfo();
                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adXml.usePreferedInfo" + adXml.usePreferedInfo);
                n74.v1.d(y07.getTimeLine(), adXml, adInfo, 2);
                com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = y07.convertToSnsInfo();
                if (n74.l0.a(convertToSnsInfo)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adVideoPreload, preload test timeline online video, snsId=" + t07);
                    com.tencent.mm.plugin.sns.model.l4.Pj().k(convertToSnsInfo);
                    com.tencent.mm.plugin.sns.model.l4.Pj().t();
                }
                za4.f1.b(c17, true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return "";
        }
        int indexOf = str.indexOf(str2);
        int indexOf2 = indexOf >= 0 ? str.indexOf(str3) : -1;
        if (indexOf < 0 || indexOf2 <= indexOf) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return "";
        }
        java.lang.String substring = str.substring(indexOf, indexOf2 + str3.length());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        return substring;
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDeleteMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDeleteMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
    }
}
