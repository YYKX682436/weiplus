package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class w0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f166153e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f166154d;

    static {
        l75.e0 e0Var = com.tencent.mm.plugin.sns.storage.v0.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getInfo$cp", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getInfo$cp", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
        l75.e0 e0Var2 = com.tencent.mm.plugin.sns.storage.v0.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo$Companion");
        java.lang.String createSQLs = l75.n0.getCreateSQLs(e0Var2, "AdPullRecordsInfo");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        f166153e = new java.lang.String[]{createSQLs};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w0(l75.k0 r5) {
        /*
            r4 = this;
            l75.e0 r0 = com.tencent.mm.plugin.sns.storage.v0.B
            java.lang.String r0 = "getInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "access$getInfo$cp"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            l75.e0 r2 = com.tencent.mm.plugin.sns.storage.v0.B
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r0 = 0
            java.lang.String r1 = "AdPullRecordsInfo"
            r4.<init>(r5, r2, r1, r0)
            r4.f166154d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.w0.<init>(l75.k0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r6.moveToFirst() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        r5 = new com.tencent.mm.plugin.sns.storage.v0();
        r5.convertFrom(r6);
        r7 = new org.json.JSONObject();
        r7.put("traceid", r5.field_traceid);
        r7.put("aid", r5.field_aid);
        r7.put("snsid", r5.field_snsid);
        r7.put("storeTime", r5.field_storeTime);
        r7.put("isAsync", r5.field_isAsync);
        r2.put(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0115, code lost:
    
        if (r6.moveToNext() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0117, code lost:
    
        r6.close();
        r4.put("records", r2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdRecordByBeginTime", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage$Companion");
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject y0() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.w0.y0():org.json.JSONObject");
    }

    public static final void z0(java.util.List list) {
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertTimelineAdObj", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertTimelineAdObj", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage$Companion");
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.g5 g5Var = (r45.g5) it.next();
                if (g5Var != null) {
                    com.tencent.mm.plugin.sns.storage.v0 v0Var = new com.tencent.mm.plugin.sns.storage.v0();
                    r45.f76 f76Var = g5Var.f374885d;
                    v0Var.field_snsid = ca4.z0.t0((f76Var == null || (snsObject = f76Var.f374076d) == null) ? 0L : snsObject.Id);
                    com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(x51.j1.g(g5Var.f374886e));
                    v0Var.field_aid = aDInfo.aid;
                    v0Var.field_storeTime = c01.id.e();
                    v0Var.field_isAsync = 0;
                    v0Var.field_isSelected = 1;
                    v0Var.field_sessionKey = aDInfo.sessionKeyAd;
                    v0Var.field_traceid = aDInfo.traceid;
                    com.tencent.mars.xlog.Log.i("AdPullRecordsInfoStorage", "insert called with: ad = " + v0Var.field_snsid);
                    com.tencent.mm.plugin.sns.model.l4.Ui().insert(v0Var);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertTimelineAdObj", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertTimelineAdObj", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
    }
}
