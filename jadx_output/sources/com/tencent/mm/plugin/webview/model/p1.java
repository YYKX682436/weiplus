package com.tencent.mm.plugin.webview.model;

/* loaded from: classes4.dex */
public class p1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f183056d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f183057e;

    /* renamed from: f, reason: collision with root package name */
    public long f183058f;

    public p1(int i17, java.lang.String str, java.util.LinkedList linkedList, int i18) {
        this(i17, str, linkedList, i18, null, false);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f183058f = java.lang.System.currentTimeMillis();
        this.f183057e = u0Var;
        return dispatch(sVar, this.f183056d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1137;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f183057e.onSceneEnd(i18, i19, str, this);
        hy4.b.INSTANCE.b(4, (int) (java.lang.System.currentTimeMillis() - this.f183058f), i19);
    }

    public p1(int i17, java.lang.String str, java.util.LinkedList linkedList, int i18, com.tencent.mm.protobuf.g gVar, boolean z17) {
        this.f183058f = 0L;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ag5();
        lVar.f70665b = new r45.bg5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/qrconnect_authorize_confirm";
        lVar.f70667d = 1137;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183056d = a17;
        r45.ag5 ag5Var = (r45.ag5) a17.f70710a.f70684a;
        ag5Var.f369998e = i17;
        ag5Var.f369997d = str;
        ag5Var.f369999f = linkedList;
        ag5Var.f370000g = i18;
        ag5Var.f370001h = gVar;
        ag5Var.f370002i = z17;
    }
}
