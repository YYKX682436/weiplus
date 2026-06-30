package ho2;

/* loaded from: classes2.dex */
public final class b extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final r45.sr0 f282864t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(r45.qt2 contextObj, java.lang.String str, java.lang.String str2, int i17) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        r45.sr0 sr0Var = new r45.sr0();
        this.f282864t = sr0Var;
        sr0Var.f385933d = db2.t4.f228171a.b(7023, contextObj);
        sr0Var.f385934e = str;
        sr0Var.f385935f = str2;
        sr0Var.f385936g = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = sr0Var;
        r45.tr0 tr0Var = new r45.tr0();
        tr0Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = tr0Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = tr0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/fetchfindermembershipdetailinfo";
        lVar.f70667d = 7023;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> linkedList;
        r45.tr0 resp = (r45.tr0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderFetchMemberShipDetailInfoCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + " memberStatus=" + resp.f386723d + " visitorStatus=" + java.lang.Integer.valueOf(resp.f386726g));
        r45.h07 h07Var = resp.f386728i;
        if (h07Var == null || (linkedList = h07Var.f375731e) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : linkedList) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) it.next();
            bu2.j jVar = bu2.j.f24534a;
            int i19 = this.f70646f.f70713d;
            r45.kv0 kv0Var = this.f282864t.f385933d;
            jVar.n(finderItem, new bu2.h(i19, kv0Var != null ? kv0Var.getLong(5) : 0L));
        }
    }
}
