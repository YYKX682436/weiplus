package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes4.dex */
public class x3 extends com.tencent.mm.pluginsdk.model.app.u3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f189140e;

    public x3(java.util.List list) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.x93();
        lVar.f70665b = new r45.y93();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getappsetting";
        lVar.f70667d = zd.d.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f189090d = lVar.a();
        this.f189140e = list;
        list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (str != null && str.length() > 0) {
                r45.aa aaVar = new r45.aa();
                aaVar.f369862d = str;
                linkedList.add(aaVar);
            }
        }
        if (linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppSetting", "doScene fail, reqList is empty");
        }
        r45.x93 x93Var = (r45.x93) this.f189090d.f70710a.f70684a;
        x93Var.f389894e = linkedList;
        x93Var.f389893d = linkedList.size();
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppSetting", "buf is null");
            return;
        }
        try {
            this.f189090d.f70711b.fromProtoBuf(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppSetting", "bufToResp error: " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public int b() {
        return 1;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public byte[] c() {
        try {
            return ((com.tencent.mm.modelbase.m) this.f189090d.getReqObj()).toProtoBuf();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppSetting", "toProtBuf error: " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, errType = " + i18 + ", errCode = " + i19);
            return;
        }
        r45.y93 y93Var = (r45.y93) this.f189090d.f70711b.f70700a;
        int i27 = y93Var.f390884d;
        java.util.LinkedList linkedList = y93Var.f390885e;
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, settingList is empty");
            return;
        }
        com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.z9 z9Var = (r45.z9) it.next();
            com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(z9Var.f391792d, false, false);
            if (j17 != null) {
                j17.field_authFlag = z9Var.f391793e;
                j17.field_openId = z9Var.f391794f;
                Ri.update(j17, new java.lang.String[0]);
            }
        }
    }
}
