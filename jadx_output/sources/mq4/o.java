package mq4;

/* loaded from: classes8.dex */
public class o extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f330804h = "MicroMsg.NetSceneVoipHeartBeat";

    public o(int i17, long j17, int i18, int i19, int i27) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s27();
        lVar.f70665b = new r45.t27();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipheartbeat";
        lVar.f70667d = 178;
        lVar.f70668e = 81;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.s27 s27Var = (r45.s27) a17.f70710a.f70684a;
        s27Var.f385449d = i17;
        s27Var.f385450e = j17;
        s27Var.f385452g = java.lang.System.currentTimeMillis();
        s27Var.f385453h = i18;
        s27Var.f385454i = i19;
        s27Var.f385455m = i27;
        vq4.d0.a("MicroMsg.NetSceneVoipHeartBeat", "send VoipHeartBeatReq audioDeviceOccupiedStatus: " + i19 + " channelSecondsNoData: " + i27);
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.n(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 178;
    }
}
