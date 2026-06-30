package com.tencent.mm.plugin.webview.model;

/* loaded from: classes9.dex */
public class q1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f183068d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f183069e;

    public q1(java.lang.String str, com.tencent.mm.opensdk.modelmsg.SendAuth.Req req, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, r45.u15 u15Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wv5();
        lVar.f70665b = new r45.xv5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize";
        lVar.f70667d = 1388;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183068d = a17;
        r45.wv5 wv5Var = (r45.wv5) a17.f70710a.f70684a;
        wv5Var.f389529d = str;
        wv5Var.f389530e = req.scope;
        wv5Var.f389531f = req.state;
        wv5Var.f389535m = req.extData;
        wv5Var.f389533h = str2;
        wv5Var.f389534i = str3;
        wv5Var.f389539q = req.isOption1;
        wv5Var.f389541s = req.nonAutomatic;
        if (str4 != null) {
            wv5Var.f389537o = str4;
        }
        wv5Var.f389538p = i17;
        try {
            wv5Var.f389540r = new com.tencent.mm.protobuf.g(u15Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSDKOauthAuthorize", "toByteArray ex %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSDKOauthAuthorize", "NetSceneSDKOauthAuthorize isOption1=%b, token=%s, authenticationResult= %d, nonAutomatic=%b", java.lang.Boolean.valueOf(req.isOption1), wv5Var.f389537o, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(wv5Var.f389541s));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f183069e = u0Var;
        return dispatch(sVar, this.f183068d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1388;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f183069e.onSceneEnd(i18, i19, str, this);
    }
}
