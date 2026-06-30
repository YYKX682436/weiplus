package mq4;

/* loaded from: classes14.dex */
public class q extends mq4.e0 {
    public q(java.util.List list, byte[] bArr, byte[] bArr2, int i17, int i18, int i19, int i27, java.util.LinkedList linkedList, long j17, long j18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.w27();
        lVar.f70665b = new r45.x27();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipinvite";
        lVar.f70667d = 170;
        lVar.f70668e = 63;
        lVar.f70669f = 1000000063;
        this.f330793d = lVar.a();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voipinvite_retry_count, 0);
        if (Ni == 0) {
            this.f330793d.setIsUserCmd(true);
        }
        r45.w27 w27Var = (r45.w27) this.f330793d.f70710a.f70684a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (int i28 = 0; i28 < list.size(); i28++) {
            r45.du5 du5Var = new r45.du5();
            du5Var.f372756d = (java.lang.String) list.get(i28);
            du5Var.f372757e = true;
            linkedList2.add(du5Var);
        }
        w27Var.f388808d = c01.z1.r();
        w27Var.f388810f = linkedList2;
        w27Var.f388809e = linkedList2.size();
        w27Var.f388813i = i17;
        w27Var.f388814m = i18;
        w27Var.f388817p = i19;
        w27Var.f388820s = i27;
        r45.k37 k37Var = new r45.k37();
        k37Var.f378343d = 2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        k37Var.f378344e = cu5Var;
        w27Var.f388811g = k37Var;
        r45.k37 k37Var2 = new r45.k37();
        k37Var2.f378343d = 3;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(bArr2);
        k37Var2.f378344e = cu5Var2;
        w27Var.f388812h = k37Var2;
        w27Var.f388818q = java.lang.System.currentTimeMillis();
        w27Var.f388824w = this.f330796g.f176532x.getIpStack();
        int Ai = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(2);
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", "simType:" + Ai + " ipstack:" + w27Var.f388824w + " retry count:" + Ni);
        if (Ai == 0) {
            w27Var.f388821t = 0;
        } else if (Ai == 3) {
            w27Var.f388821t = 3;
        } else {
            w27Var.f388821t = Ai != 1 ? 2 : 1;
        }
        w27Var.f388822u = linkedList.size();
        w27Var.f388823v = linkedList;
        r45.n27 b17 = vq4.p0.b();
        w27Var.f388825x = b17;
        b17.f381040n = j17;
        b17.f381041o = j18;
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.p(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 170;
    }
}
