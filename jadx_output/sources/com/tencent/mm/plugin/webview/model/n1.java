package com.tencent.mm.plugin.webview.model;

/* loaded from: classes5.dex */
public final class n1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f183038d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f183039e;

    public n1(int i17, java.lang.String appId, java.lang.String nickname, java.lang.String fileId, java.lang.String oriAvatarUrl, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(oriAvatarUrl, "oriAvatarUrl");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.in4();
        lVar.f70665b = new r45.jn4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_modavatar";
        lVar.f70667d = 29251;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183038d = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModAvatarReq");
        r45.in4 in4Var = (r45.in4) fVar;
        in4Var.f377167d = i17;
        in4Var.f377170g = appId;
        in4Var.f377168e = nickname;
        if (z17) {
            in4Var.f377169f = fileId;
        }
        in4Var.f377171h = oriAvatarUrl;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f183039e = u0Var;
        return dispatch(sVar, this.f183038d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 29251;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f183039e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
