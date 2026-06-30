package mq4;

/* loaded from: classes13.dex */
public class z implements com.tencent.mm.modelbase.u0 {
    public z(mq4.a0 a0Var) {
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        vq4.d0.a("MicroMsg.NetSceneVoipStatReport", "onSceneEnd type:" + m1Var.getType() + " errType:" + i17 + " errCode:" + i18);
    }
}
