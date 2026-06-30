package mq4;

/* loaded from: classes14.dex */
public class w extends mq4.e0 {
    public w(long j17, long j18, int i17, java.lang.String str, java.lang.String str2, double d17, double d18, int i18, int i19, byte[] bArr) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.o37();
        lVar.f70665b = new r45.p37();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipspeedresult";
        lVar.f70667d = 901;
        lVar.f70668e = 901;
        lVar.f70669f = 1000000901;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.o37 o37Var = (r45.o37) a17.f70710a.f70684a;
        o37Var.f381885d = j17;
        o37Var.f381886e = j18;
        o37Var.f381887f = i17;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        o37Var.f381888g = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = str2;
        du5Var2.f372757e = true;
        o37Var.f381889h = du5Var2;
        o37Var.f381890i = d17;
        o37Var.f381891m = d18;
        o37Var.f381892n = i18;
        o37Var.f381893o = i19;
        try {
            r45.a37 a37Var = (r45.a37) new r45.a37().parseFrom(bArr);
            for (int i27 = 0; i27 < a37Var.f369708d.size(); i27++) {
                r45.vc6 vc6Var = new r45.vc6();
                java.util.LinkedList linkedList = a37Var.f369708d;
                vc6Var.f388099d = ((r45.z27) linkedList.get(i27)).f391639e;
                vc6Var.f388100e = ((r45.z27) linkedList.get(i27)).f391640f;
                vc6Var.f388101f = ((r45.z27) linkedList.get(i27)).f391641g;
                r45.b27 b27Var = new r45.b27();
                vc6Var.f388102g = b27Var;
                b27Var.f370485d = ((r45.z27) linkedList.get(i27)).f391642h;
                vc6Var.f388102g.f370486e = ((r45.z27) linkedList.get(i27)).f391643i;
                vc6Var.f388102g.f370487f = ((r45.z27) linkedList.get(i27)).f391653v;
                vc6Var.f388103h = ((r45.z27) linkedList.get(i27)).f391644m;
                vc6Var.f388104i = ((r45.z27) linkedList.get(i27)).f391645n;
                vc6Var.f388105m = ((r45.z27) linkedList.get(i27)).f391646o;
                vc6Var.f388106n = ((r45.z27) linkedList.get(i27)).f391648q.size();
                for (int i28 = 0; i28 < vc6Var.f388106n; i28++) {
                    vc6Var.f388107o.add((java.lang.Integer) ((r45.z27) linkedList.get(i27)).f391648q.get(i28));
                }
                vc6Var.f388108p = ((r45.z27) linkedList.get(i27)).f391649r;
                for (int i29 = 0; i29 < vc6Var.f388108p; i29++) {
                    vc6Var.f388109q.add((java.lang.Integer) ((r45.z27) linkedList.get(i27)).f391650s.get(i29));
                }
                vc6Var.f388110r = ((r45.z27) linkedList.get(i27)).f391651t;
                for (int i37 = 0; i37 < vc6Var.f388110r; i37++) {
                    vc6Var.f388111s.add((java.lang.Integer) ((r45.z27) linkedList.get(i27)).f391652u.get(i37));
                }
                vc6Var.f388112t = ((r45.z27) linkedList.get(i27)).f391654w;
                o37Var.f381894p.add(vc6Var);
                vq4.d0.c("MicroMsg.NetSceneVoipSpeedResult", "VoipContext NetSceneVoipSpeedResult testid:" + j17 + " roomkey=" + j18 + " ipstr=" + vc6Var.f388102g.f370487f + " client ipstr=" + vc6Var.f388112t);
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneVoipSpeedResult", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.v(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 901;
    }
}
