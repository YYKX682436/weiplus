package mq4;

/* loaded from: classes14.dex */
public class g extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f330798h = "MicroMsg.NetSceneVoipAnswer";

    public g(int i17, int i18, int i19, byte[] bArr, byte[] bArr2, long j17, boolean z17, boolean z18, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.d27();
        lVar.f70665b = new r45.e27();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipanswer";
        lVar.f70667d = 172;
        lVar.f70668e = 65;
        lVar.f70669f = 1000000065;
        this.f330793d = lVar.a();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voipanswer_retry_count, 1);
        if (Ni == 0) {
            this.f330793d.setIsUserCmd(true);
        }
        r45.d27 d27Var = (r45.d27) this.f330793d.f70710a.f70684a;
        d27Var.f372017f = i17;
        d27Var.f372016e = i19;
        d27Var.f372021m = i18;
        r45.k37 k37Var = new r45.k37();
        k37Var.f378343d = 2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        k37Var.f378344e = cu5Var;
        d27Var.f372018g = k37Var;
        r45.k37 k37Var2 = new r45.k37();
        k37Var2.f378343d = 3;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(bArr2);
        k37Var2.f378344e = cu5Var2;
        d27Var.f372019h = k37Var2;
        d27Var.f372027s = this.f330796g.f176532x.getIpStack();
        d27Var.f372020i = j17;
        if (z18) {
            d27Var.f372023o = z17 ? 1 : 0;
        }
        d27Var.f372022n = java.lang.System.currentTimeMillis();
        int Ai = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(2);
        vq4.d0.c("MicroMsg.NetSceneVoipAnswer", "simType:" + Ai + " ipstack:" + d27Var.f372027s + " retry count:" + Ni);
        if (Ai == 0) {
            d27Var.f372024p = 0;
        } else if (Ai == 3) {
            d27Var.f372024p = 3;
        } else {
            d27Var.f372024p = Ai != 1 ? 2 : 1;
        }
        if (linkedList != null) {
            d27Var.f372025q = linkedList.size();
            d27Var.f372026r = linkedList;
        }
        d27Var.f372028t = vq4.p0.b();
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.f(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 172;
    }
}
