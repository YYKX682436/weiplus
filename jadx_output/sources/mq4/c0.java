package mq4;

/* loaded from: classes8.dex */
public class c0 extends mq4.e0 {
    public c0(int i17, r45.k27 k27Var, byte[] bArr, long j17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.w37();
        lVar.f70665b = new r45.x37();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipsync";
        lVar.f70667d = 174;
        lVar.f70668e = 62;
        lVar.f70669f = 1000000062;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.w37 w37Var = (r45.w37) a17.f70710a.f70684a;
        w37Var.f388862e = i17;
        w37Var.f388864g = k27Var;
        w37Var.f388865h = j17;
        w37Var.f388861d = c01.z1.r();
        w37Var.f388866i = i18;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        w37Var.f388863f = cu5Var;
        w37Var.f388867m = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVoipSync", "sync timestamp: " + w37Var.f388867m);
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.b0(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 174;
    }
}
