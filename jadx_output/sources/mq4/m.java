package mq4;

/* loaded from: classes12.dex */
public class m extends mq4.e0 {
    public m(int i17, long j17, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.q27();
        lVar.f70665b = new r45.r27();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipgetroominfo";
        lVar.f70667d = 303;
        lVar.f70668e = 119;
        lVar.f70669f = 1000000119;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.q27 q27Var = (r45.q27) a17.f70710a.f70684a;
        q27Var.f383610d = i17;
        q27Var.f383611e = j17;
        q27Var.f383612f = str;
        q27Var.f383613g = 1;
        q27Var.f383614h = java.lang.System.currentTimeMillis();
    }

    @Override // mq4.e0
    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.GetRoomInfo", "Get RoomInfo error");
            return;
        }
        r45.r27 r27Var = (r45.r27) K();
        if (r27Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.GetRoomInfo", "roomId:%d, roomKey:%s, memberCount:%d, inviteType:%d", java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384492g), java.lang.Integer.valueOf(r27Var.f384495m));
        }
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.l(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 303;
    }
}
