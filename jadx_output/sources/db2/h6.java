package db2;

/* loaded from: classes2.dex */
public final class h6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f228011g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f228012h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228013i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228014m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(java.util.LinkedList sendMarkReadList) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(sendMarkReadList, "sendMarkReadList");
        this.f228011g = sendMarkReadList;
        this.f228012h = "Finder.NetSceneMarkRead";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3520;
        r45.qf2 qf2Var = new r45.qf2();
        qf2Var.set(2, sendMarkReadList);
        r45.kv0 a17 = db2.t4.f228171a.a(3520);
        java.util.Iterator it = sendMarkReadList.iterator();
        while (it.hasNext()) {
            r45.ni4 ni4Var = (r45.ni4) it.next();
            java.util.LinkedList list = a17.getList(7);
            if (list != null) {
                r45.fl2 fl2Var = new r45.fl2();
                fl2Var.set(1, ni4Var.getString(4));
                fl2Var.set(0, java.lang.Long.valueOf(ni4Var.getLong(0)));
                list.add(fl2Var);
            }
        }
        qf2Var.set(1, a17);
        lVar.f70664a = qf2Var;
        r45.rf2 rf2Var = new r45.rf2();
        rf2Var.set(0, new r45.ie());
        lVar.f70665b = rf2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findermarkread";
        this.f228013i = lVar.a();
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228012h, "onGYNetEnd " + i17 + ' ' + i18 + ' ' + i19 + ' ' + str + ' ' + this.f228011g.size());
        com.tencent.mm.modelbase.u0 u0Var = this.f228014m;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228014m = u0Var;
        return dispatch(sVar, this.f228013i, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3520;
    }
}
