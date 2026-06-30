package com.tencent.mm.plugin.sport.model;

/* loaded from: classes2.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f171793d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f171794e;

    public j(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, int i27) {
        this.f171794e = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep %s, %s, %s, %s, %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tt6();
        lVar.f70665b = new r45.ut6();
        lVar.f70666c = "/cgi-bin/mmoc-bin/hardware/uploaddevicestep";
        lVar.f70667d = 1261;
        int i28 = 0;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f171794e = a17;
        r45.tt6 tt6Var = (r45.tt6) a17.f70710a.f70684a;
        tt6Var.f386791d = str;
        tt6Var.f386792e = str2;
        tt6Var.f386793f = i17;
        tt6Var.f386794g = i18;
        tt6Var.f386795h = i19;
        db5.d5 d5Var = com.tencent.mm.plugin.sport.model.c0.f171773a;
        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset() / 1000;
        if (timeZone.useDaylightTime() && timeZone.inDaylightTime(new java.util.Date(java.lang.System.currentTimeMillis()))) {
            i28 = 1;
        }
        tt6Var.f386796i = java.lang.String.valueOf((rawOffset / 3600) + i28);
        tt6Var.f386800p = str3;
        tt6Var.f386803s = i27;
        com.tencent.mm.autogen.events.UpdateDeviceStepReqEvent updateDeviceStepReqEvent = new com.tencent.mm.autogen.events.UpdateDeviceStepReqEvent();
        int i29 = tt6Var.f386795h;
        am.uz uzVar = updateDeviceStepReqEvent.f54915g;
        uzVar.f8147a = i29;
        uzVar.f8148b = tt6Var.f386803s;
        updateDeviceStepReqEvent.e();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f171793d = u0Var;
        return dispatch(sVar, this.f171794e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1261;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.ut6 ut6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep end: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.plugin.report.service.b1.f(10, 12);
        if (i18 == 0 && i19 == 0 && (ut6Var = (r45.ut6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "upload device step success, old_log_msg:%s, new_log_msg:%s", ut6Var.f387643e, ut6Var.f387644f);
        }
        this.f171793d.onSceneEnd(i18, i19, str, this);
    }
}
