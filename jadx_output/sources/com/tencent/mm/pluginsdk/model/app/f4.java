package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes4.dex */
public class f4 extends com.tencent.mm.pluginsdk.model.app.u3 {
    public f4(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.n16();
        lVar.f70665b = new r45.o16();
        lVar.f70666c = "/cgi-bin/micromsg-bin/setappsetting";
        lVar.f70667d = 396;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f189090d = a17;
        r45.n16 n16Var = (r45.n16) a17.f70710a.f70684a;
        n16Var.f380995d = str;
        n16Var.f380996e = i17;
        n16Var.f380997f = str2;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSetAppSetting", "buf is null");
            return;
        }
        try {
            this.f189090d.f70711b.fromProtoBuf(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSetAppSetting", "parse error: " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSetAppSetting", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public int b() {
        return 2;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public byte[] c() {
        try {
            return ((com.tencent.mm.modelbase.m) this.f189090d.getReqObj()).toProtoBuf();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSetAppSetting", "toProtBuf failed: " + e17.getMessage());
            return null;
        }
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.o16 o16Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSetAppSetting", "errType = " + i18 + ", errCode = " + i19);
        if (i18 == 0 && i18 == 0 && (o16Var = (r45.o16) this.f189090d.f70711b.f70700a) != null) {
            ((kt.a) ap3.e.a()).getClass();
            com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = o16Var.f381825d;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str2, false, false);
            if (j17 != null) {
                j17.field_authFlag = o16Var.f381826e;
                Ri.update(j17, new java.lang.String[0]);
            }
        }
    }
}
