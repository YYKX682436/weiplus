package k14;

/* loaded from: classes4.dex */
public class f0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303330d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f303331e;

    public f0(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vy5();
        lVar.f70665b = new r45.wy5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendfeedback";
        lVar.f70667d = com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f303331e = a17;
        r45.vy5 vy5Var = (r45.vy5) a17.f70710a.f70684a;
        vy5Var.f388674d = str;
        vy5Var.f388675e = str2;
        vy5Var.f388676f = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303330d = u0Var;
        return dispatch(sVar, this.f303331e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f303330d.onSceneEnd(i18, i19, str, this);
    }
}
