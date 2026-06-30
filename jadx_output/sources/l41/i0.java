package l41;

/* loaded from: classes4.dex */
public class i0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315834d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315835e;

    public i0(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.h15();
        lVar.f70665b = new r45.i15();
        lVar.f70666c = "/cgi-bin/micromsg-bin/openimsync";
        lVar.f70667d = 810;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315835e = a17;
        ((r45.h15) a17.f70710a.f70684a).f375761d = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "opim sync init:%d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        byte[] a17 = w11.c2.f441991a.a();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(a17);
        com.tencent.mm.modelbase.o oVar = this.f315835e;
        ((r45.h15) oVar.f70710a.f70684a).f375762e = cu5Var;
        this.f315834d = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 810;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "netId :%d errType: %d, errCode: %d, errMsg:%s, hashcode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(hashCode()));
        if (i18 != 0 || i19 != 0) {
            this.f315834d.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mm.modelbase.o oVar = this.f315835e;
        r45.h15 h15Var = (r45.h15) oVar.f70710a.f70684a;
        r45.i15 i15Var = (r45.i15) oVar.f70711b.f70700a;
        r45.c50 c50Var = i15Var.f376665d;
        if (c50Var != null && c50Var.f371295e.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "onGYNetEnd, cmd size:%d", java.lang.Integer.valueOf(i15Var.f376665d.f371295e.size()));
            java.util.Iterator it = i15Var.f376665d.f371295e.iterator();
            while (it.hasNext()) {
                ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Bi((r45.b50) it.next());
            }
        }
        r45.cu5 cu5Var = i15Var.f376667f;
        if (cu5Var != null) {
            byte[] g17 = cu5Var.f371841f.g();
            w11.b2 b2Var = w11.c2.f441991a;
            byte[] c17 = o45.qi.c(b2Var.a(), g17);
            if (c17 != null && c17.length > 0) {
                b2Var.d(c17, true);
            }
        }
        if ((i15Var.f376666e & h15Var.f375761d) != 0) {
            doScene(dispatcher(), this.f315834d);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "onGYNetEnd end");
            this.f315834d.onSceneEnd(0, 0, "", this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 20;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
