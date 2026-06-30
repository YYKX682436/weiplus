package r33;

/* loaded from: classes4.dex */
public final class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368982d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f368983e = jz5.h.a(jz5.i.f302831f, new r33.g(this));

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368982d = u0Var;
        java.lang.Object value = this.f368983e.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return dispatch(sVar, (com.tencent.mm.modelbase.o) value, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 9911;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiGetRecommendVideoList", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f368982d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
