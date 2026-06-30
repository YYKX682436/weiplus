package e93;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f250348d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f250349e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f250350f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f250351g;

    public a(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f250350f = linkedList;
        this.f250351g = new java.util.LinkedList();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.b4();
        lVar.f70665b = new r45.c4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/addcontactlabel";
        lVar.f70667d = kd1.c.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f250348d = lVar.a();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        r45.f54 f54Var = new r45.f54();
        f54Var.f374021d = str;
        linkedList.add(f54Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f250349e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f250348d;
        r45.b4 b4Var = (r45.b4) oVar.f70710a.f70684a;
        java.util.LinkedList linkedList = this.f250350f;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene] label list is null.");
            u0Var.onSceneEnd(3, -1, "[doScene]empty contact list.", this);
            return 0;
        }
        b4Var.f370506e = linkedList;
        b4Var.f370505d = linkedList.size();
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return kd1.c.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.c4 c4Var = (r45.c4) this.f250348d.f70711b.f70700a;
        if (c4Var != null) {
            java.util.LinkedList linkedList = c4Var.f371260e;
            java.util.LinkedList linkedList2 = this.f250351g;
            linkedList2.clear();
            linkedList2.addAll(linkedList);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = linkedList.size();
            for (int i27 = 0; i27 < size; i27++) {
                r45.f54 f54Var = (r45.f54) linkedList.get(i27);
                com.tencent.mm.storage.d4 d4Var = new com.tencent.mm.storage.d4();
                d4Var.field_labelID = f54Var.f374022e;
                java.lang.String str2 = f54Var.f374021d;
                d4Var.field_labelName = str2;
                d4Var.field_labelPYFull = x51.k.a(str2);
                d4Var.field_labelPYShort = x51.k.b(f54Var.f374021d);
                d4Var.field_isTemporary = false;
                arrayList.add(d4Var);
            }
            b93.r.wi().W0(arrayList);
            b93.r.wi().T1(arrayList);
        }
        this.f250349e.onSceneEnd(i18, i19, str, this);
    }

    public a(java.util.List list) {
        this.f250350f = new java.util.LinkedList();
        this.f250351g = new java.util.LinkedList();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.b4();
        lVar.f70665b = new r45.c4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/addcontactlabel";
        lVar.f70667d = kd1.c.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f250348d = lVar.a();
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.f54 f54Var = new r45.f54();
            f54Var.f374021d = (java.lang.String) list.get(i17);
            this.f250350f.add(f54Var);
        }
    }
}
