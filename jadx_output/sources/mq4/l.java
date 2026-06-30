package mq4;

/* loaded from: classes14.dex */
public class l implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.m f330802d;

    public l(mq4.m mVar) {
        this.f330802d = mVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        vq4.d0.b("MicroMsg.Voip.GetRoomInfo", "Voip onSceneEnd type:" + m1Var.getType() + " errType:" + i17 + " errCode:" + i18);
        if (i17 == 0 && i18 == 0) {
            r45.r27 r27Var = (r45.r27) this.f330802d.K();
            if (r27Var.BaseResponse.f376959d != 0 || gq4.v.Bi().f176558a.i()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.GetRoomInfo", "doTaskCallin in NetSceneVoipGetRoomInfo, roomid:%d, roomkey:%s, time:%d", java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384491f));
            gq4.v.Bi().h(r27Var);
        }
    }
}
