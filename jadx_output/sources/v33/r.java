package v33;

/* loaded from: classes8.dex */
public final class r extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f433141d;

    /* renamed from: e, reason: collision with root package name */
    public final long f433142e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433143f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f433144g;

    public r(java.lang.String chatroomName, long j17) {
        kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
        this.f433141d = chatroomName;
        this.f433142e = j17;
        this.f433144g = jz5.h.a(jz5.i.f302831f, new v33.q(this));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433143f = u0Var;
        java.lang.Object value = this.f433144g.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return dispatch(sVar, (com.tencent.mm.modelbase.o) value, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4565;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiPublishChatroomMsg", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f433143f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
