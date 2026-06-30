package mq4;

/* loaded from: classes14.dex */
public class v implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.w f330809d;

    public v(mq4.w wVar) {
        this.f330809d = wVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        vq4.d0.c("MicroMsg.NetSceneVoipSpeedResult", "VoipContext onVoipSpeedResultResp errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        this.f330809d.f330796g.h();
    }
}
