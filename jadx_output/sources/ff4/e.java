package ff4;

/* loaded from: classes4.dex */
public final class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f261680d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f261681e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f261682f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f261683g;

    public e(java.util.List opList, java.util.List localIdList) {
        kotlin.jvm.internal.o.g(opList, "opList");
        kotlin.jvm.internal.o.g(localIdList, "localIdList");
        this.f261680d = opList;
        this.f261681e = localIdList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ff6();
        lVar.f70665b = new r45.gf6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmstoryobjectop";
        lVar.f70667d = 764;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f261682f = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryOpRequest");
        r45.ff6 ff6Var = (r45.ff6) fVar;
        ff6Var.f374289d = opList.size();
        java.util.Iterator it = opList.iterator();
        while (it.hasNext()) {
            ff4.a aVar = (ff4.a) it.next();
            r45.ef6 ef6Var = new r45.ef6();
            ef6Var.f373408d = aVar.f261659a;
            int i17 = aVar.f261660b;
            ef6Var.f373409e = i17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("op.id:");
            long j17 = aVar.f261659a;
            sb6.append(j17);
            sb6.append(" op.type:");
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryObjectOp", sb6.toString());
            if (aVar instanceof ff4.p) {
                r45.bf6 bf6Var = new r45.bf6();
                bf6Var.f370730d = j17;
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(bf6Var.toByteArray());
                ef6Var.f373410f = cu5Var;
            } else if (aVar instanceof ff4.n) {
                r45.ze6 ze6Var = new r45.ze6();
                ze6Var.f391960d = ((ff4.n) aVar).f261708c;
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(ze6Var.toByteArray());
                ef6Var.f373410f = cu5Var2;
            } else if (aVar instanceof ff4.q) {
                r45.cf6 cf6Var = new r45.cf6();
                cf6Var.f371528e = ((ff4.q) aVar).f261710c;
                cf6Var.f371527d = j17;
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(cf6Var.toByteArray());
                ef6Var.f373410f = cu5Var3;
            } else if (aVar instanceof ff4.o) {
                r45.af6 af6Var = new r45.af6();
                af6Var.f369984e = ((ff4.o) aVar).f261709c;
                af6Var.f369983d = j17;
                r45.cu5 cu5Var4 = new r45.cu5();
                cu5Var4.d(af6Var.toByteArray());
                ef6Var.f373410f = cu5Var4;
            }
            ff6Var.f374290e.add(ef6Var);
        }
    }

    public final ff4.a H() {
        java.util.List list = this.f261680d;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return (ff4.a) list.get(0);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f261683g = callback;
        return dispatch(dispatcher, this.f261682f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 764;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryObjectOp", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        com.tencent.mm.protobuf.f fVar = this.f261682f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryOpResponse");
        int i27 = ((r45.gf6) fVar).f375202d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("respCount=");
        sb6.append(i27);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryObjectOp", sb6.toString());
        com.tencent.mm.modelbase.u0 u0Var = this.f261683g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }
}
