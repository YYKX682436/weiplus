package v33;

/* loaded from: classes2.dex */
public final class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f433130d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433131e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f433132f;

    public n(java.lang.String chatroomName) {
        kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
        this.f433130d = chatroomName;
        this.f433132f = jz5.h.a(jz5.i.f302831f, new v33.m(this));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433131e = u0Var;
        return dispatch(sVar, getCommReqResp(), this);
    }

    public final com.tencent.mm.modelbase.o getCommReqResp() {
        java.lang.Object value = this.f433132f.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.modelbase.o) value;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5069;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiGetUserAtMemberList", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f433131e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
