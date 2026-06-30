package n61;

/* loaded from: classes2.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f335185d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f335186e;

    public e(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fr6();
        lVar.f70665b = new r45.gr6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/unbindqq";
        lVar.f70667d = com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f335186e = a17;
        ((r45.fr6) a17.f70710a.f70684a).f374576d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f335185d = u0Var;
        return dispatch(sVar, this.f335186e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        this.f335185d.onSceneEnd(i18, i19, str, this);
    }
}
