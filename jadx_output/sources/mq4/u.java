package mq4;

/* loaded from: classes8.dex */
public class u extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f330808h = "MicroMsg.NetSceneVoipShutDown";

    public u(int i17, long j17, java.lang.String str, int i18, int i19, int i27) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.m37();
        lVar.f70665b = new r45.n37();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipshutdown";
        lVar.f70667d = ib1.t.CTRL_INDEX;
        lVar.f70668e = 66;
        lVar.f70669f = 1000000066;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.m37 m37Var = (r45.m37) a17.f70710a.f70684a;
        m37Var.f380127e = i17;
        m37Var.f380128f = j17;
        m37Var.f380126d = c01.z1.r();
        m37Var.f380131i = i27;
        m37Var.f380132m = i18;
        m37Var.f380133n = i19;
        r45.s37 s37Var = new r45.s37();
        r45.du5 du5Var = new r45.du5();
        du5Var.c(str);
        s37Var.f385485d = du5Var;
        m37Var.f380129g = s37Var;
        m37Var.f380130h = java.lang.System.currentTimeMillis();
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.t(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return ib1.t.CTRL_INDEX;
    }
}
