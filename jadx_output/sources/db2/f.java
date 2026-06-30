package db2;

/* loaded from: classes.dex */
public final class f extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f227965t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.sx0 f227966u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(java.util.List unreadList, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(unreadList, "unreadList");
        this.f227965t = unreadList;
        r45.sx0 sx0Var = new r45.sx0();
        this.f227966u = sx0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        db2.t4 t4Var = db2.t4.f228171a;
        sx0Var.set(1, t4Var.b(3980, qt2Var));
        sx0Var.getList(2).addAll(unreadList);
        lVar.f70664a = sx0Var;
        r45.kv0 kv0Var = (r45.kv0) sx0Var.getCustom(1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(unreadList, 10));
        java.util.Iterator it = unreadList.iterator();
        while (it.hasNext()) {
            r45.e13 e13Var = (r45.e13) it.next();
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(e13Var.getLong(0)), e13Var.getString(4)));
        }
        t4Var.h(kv0Var, null, arrayList);
        r45.tx0 tx0Var = new r45.tx0();
        tx0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tx0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = tx0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercollectunread";
        lVar.f70667d = 3980;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unreadList=");
        java.util.List list = this.f227965t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(pm0.v.u(((r45.e13) it6.next()).getLong(0)));
        }
        sb6.append(arrayList2);
        com.tencent.mars.xlog.Log.i("Finder.CgiCollectUnreadItem", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.tx0 resp = (r45.tx0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiCollectUnreadItem", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
