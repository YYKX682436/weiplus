package db2;

/* loaded from: classes2.dex */
public final class w0 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final int f228204t;

    /* renamed from: u, reason: collision with root package name */
    public final int f228205u;

    /* renamed from: v, reason: collision with root package name */
    public final yz5.s f228206v;

    /* renamed from: w, reason: collision with root package name */
    public final db2.v3 f228207w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f228208x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i17, int i18, yz5.s callback, db2.v3 v3Var, com.tencent.mm.protobuf.g gVar, boolean z17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f228204t = i17;
        this.f228205u = i18;
        this.f228206v = callback;
        this.f228207w = v3Var;
        this.f228208x = z17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.u61 u61Var = new r45.u61();
        u61Var.set(1, xy2.c.f(qt2Var));
        u61Var.set(4, java.lang.Integer.valueOf(i18));
        if (z17) {
            java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(i18), "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            u61Var.set(2, com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17)));
        } else {
            u61Var.set(2, gVar);
        }
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetHistory", "[request] tabType=" + i18 + " pullType=" + i17 + " useGlobalLastBuffer=" + z17);
        db2.t4 t4Var = db2.t4.f228171a;
        u61Var.set(3, t4Var.b(3814, qt2Var));
        u61Var.set(5, t4Var.n());
        lVar.f70664a = u61Var;
        r45.v61 v61Var = new r45.v61();
        v61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v61Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = v61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergethistory";
        lVar.f70667d = 3814;
        p(lVar.a());
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.v61 resp = (r45.v61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        db2.v3 v3Var = this.f228207w;
        if (v3Var != null && v3Var.a(i17, i18, str, resp)) {
            com.tencent.mars.xlog.Log.w("Finder.CgiFinderGetHistory", "has consume.");
            return;
        }
        java.util.LinkedList list = resp.getList(1);
        kotlin.jvm.internal.o.d(list);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetHistory", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " pullType=" + this.f228204t + " list=" + list.size() + " last_buffer=" + resp.getByteString(2));
        if (i17 == 0 && i18 == 0 && this.f228208x) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 c18 = hc2.d0.c(this.f228205u);
            java.lang.String str2 = null;
            if (resp.getByteString(2) != null) {
                com.tencent.mm.protobuf.g byteString = resp.getByteString(2);
                str2 = com.tencent.mm.sdk.platformtools.t8.l(byteString != null ? byteString.g() : null);
            }
            c17.x(c18, str2);
        }
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetHistory", hc2.o0.k(list));
        this.f228206v.v(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, resp, m1Var);
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.v61 resp = (r45.v61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetHistoryRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.u61) fVar).getCustom(3);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }
}
