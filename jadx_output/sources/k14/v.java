package k14;

/* loaded from: classes2.dex */
public class v extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303388d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f303389e;

    public v(java.util.List list) {
        this.f303389e = list;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303388d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.z4 z4Var = new r45.z4();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f303389e;
        if (list != null) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                r45.fq6 fq6Var = new r45.fq6();
                fq6Var.f374554d = (java.lang.String) list.get(i17);
                arrayList.add(fq6Var);
            }
        }
        z4Var.f391684d.addAll(arrayList);
        lVar.f70664a = z4Var;
        lVar.f70665b = new r45.a5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/addtrustedfriends";
        lVar.f70667d = 583;
        lVar.f70668e = 0;
        return dispatch(sVar, lVar.a(), this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 583;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchIdNew(i17);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        this.f303388d.onSceneEnd(i18, i19, str, this);
    }
}
