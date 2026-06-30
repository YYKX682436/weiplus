package ob4;

/* loaded from: classes4.dex */
public final class a extends ob4.e {
    public a(long j17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.m96 m96Var = new r45.m96();
        m96Var.f380285d = j17;
        lVar.f70664a = m96Var;
        lVar.f70665b = new r45.n96();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsobjectdetail";
        lVar.f70667d = 210;
        lVar.f70668e = 101;
        lVar.f70669f = 1000000101;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.GetSnsObjectDetailCgi", "req snsId " + ca4.z0.t0(j17));
    }
}
