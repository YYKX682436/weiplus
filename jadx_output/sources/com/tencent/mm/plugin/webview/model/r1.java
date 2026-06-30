package com.tencent.mm.plugin.webview.model;

/* loaded from: classes9.dex */
public class r1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f183085d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f183086e;

    /* renamed from: f, reason: collision with root package name */
    public long f183087f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f183088g;

    public r1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList, int i18, java.lang.String str4, com.tencent.mm.protobuf.g gVar, java.lang.String str5, int i19, com.tencent.mm.protobuf.g gVar2, java.lang.Boolean bool, boolean z17) {
        java.lang.String str6 = str5;
        this.f183087f = 0L;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f183088g = linkedList2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.uv5();
        lVar.f70665b = new r45.vv5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize_confirm";
        lVar.f70667d = 1346;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183085d = a17;
        r45.uv5 uv5Var = (r45.uv5) a17.f70710a.f70684a;
        uv5Var.f387672d = i17;
        uv5Var.f387674f = str;
        uv5Var.f387673e = linkedList;
        uv5Var.f387675g = str2;
        uv5Var.f387676h = str3;
        uv5Var.f387677i = i18;
        uv5Var.f387678m = str4;
        uv5Var.f387683r = gVar2;
        uv5Var.f387684s = bool.booleanValue();
        uv5Var.f387685t = z17;
        this.f183087f = java.lang.System.currentTimeMillis();
        uv5Var.f387680o = gVar;
        if (linkedList != null) {
            linkedList2.addAll(linkedList);
        }
        if (str6 != null) {
            uv5Var.f387681p = str6;
        }
        uv5Var.f387682q = i19;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = str;
        objArr[1] = str3;
        objArr[2] = java.lang.Integer.valueOf(gVar != null ? gVar.f192156a.length : 0);
        objArr[3] = str6 == null ? "" : str6;
        objArr[4] = java.lang.Integer.valueOf(i19);
        objArr[5] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSDKOauthAuthorizeConfirm", "do sdk confirm appId=%s, packageName=%s, oauthContextBuffer size=%d, token=%s, authenticationResult=%d, isOption1=%b", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f183087f = java.lang.System.currentTimeMillis();
        this.f183086e = u0Var;
        return dispatch(sVar, this.f183085d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1346;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f183086e.onSceneEnd(i18, i19, str, this);
        hy4.b.INSTANCE.b(4, (int) (java.lang.System.currentTimeMillis() - this.f183087f), i19);
    }

    public r1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList, int i18, java.lang.String str4, com.tencent.mm.protobuf.g gVar, java.lang.String str5, int i19, boolean z17) {
        this(i17, str, str2, str3, linkedList, i18, str4, gVar, str5, i19, null, java.lang.Boolean.FALSE, z17);
    }
}
