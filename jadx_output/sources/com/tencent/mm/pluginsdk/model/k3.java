package com.tencent.mm.pluginsdk.model;

/* loaded from: classes4.dex */
public class k3 extends com.tencent.mm.pluginsdk.model.app.u3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f189353e;

    public k3(java.lang.String str, java.util.LinkedList linkedList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUserInfoInApp", "appID: %s", str);
        this.f189353e = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mq3();
        lVar.f70665b = new r45.nq3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getuserinfoinapp";
        lVar.f70667d = 452;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f189090d = a17;
        r45.mq3 mq3Var = (r45.mq3) a17.f70710a.f70684a;
        mq3Var.f380743d = str;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    linkedList2.add(x51.j1.i(str2));
                }
            }
        }
        mq3Var.f380745f = linkedList2;
        mq3Var.f380744e = linkedList != null ? linkedList.size() : 0;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUserInfoInApp", "buf is null");
            return;
        }
        try {
            this.f189090d.f70711b.fromProtoBuf(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUserInfoInApp", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public int b() {
        return 14;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public byte[] c() {
        try {
            return ((com.tencent.mm.modelbase.m) this.f189090d.getReqObj()).toProtoBuf();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUserInfoInApp", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + i18 + ", errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + i18 + ", errCode = " + i19);
    }
}
