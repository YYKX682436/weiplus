package db2;

/* loaded from: classes2.dex */
public final class v1 extends az2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(java.lang.String username, int i17, long j17, long j18, java.lang.String sessionBuffer, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(sessionBuffer, "sessionBuffer");
        r45.mb1 mb1Var = new r45.mb1();
        mb1Var.f380319d = username;
        mb1Var.f380321f = i17;
        mb1Var.f380323h = j17;
        mb1Var.f380324i = j18;
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 a17 = t4Var.a(11847);
        mb1Var.f380320e = a17;
        t4Var.j(a17, j17, sessionBuffer);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        t70Var.j1().l();
        if (((java.lang.Boolean) t70Var.j1().r()).booleanValue()) {
            mb1Var.f380326n = 4L;
        }
        if (((java.lang.Boolean) t70Var.s0().r()).booleanValue()) {
            mb1Var.f380326n |= 8;
        }
        r45.nb1 nb1Var = new r45.nb1();
        nb1Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = nb1Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = mb1Var;
        lVar.f70665b = nb1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderhomepage";
        lVar.f70667d = 11847;
        p(lVar.a());
    }

    @Override // az2.o
    public boolean B() {
        return true;
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        java.util.LinkedList<r45.ob1> linkedList;
        r45.h72 h72Var;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> linkedList2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> linkedList3;
        r45.nb1 resp = (r45.nb1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.pb1 pb1Var = resp.f381227d;
        if (pb1Var != null && (linkedList = pb1Var.f382920d) != null) {
            for (r45.ob1 ob1Var : linkedList) {
                int i17 = ob1Var.f382110d;
                if (i17 == 2) {
                    r45.o23 o23Var = ob1Var.f382113g;
                    if (o23Var != null && (linkedList3 = o23Var.f381842d) != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
                        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : linkedList3) {
                            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                            kotlin.jvm.internal.o.d(finderObject);
                            arrayList2.add(h90Var.a(finderObject, 0));
                        }
                        arrayList.addAll(arrayList2);
                    }
                } else if (i17 == 6 && (h72Var = ob1Var.f382120q) != null && (linkedList2 = h72Var.f375913d) != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                    for (com.tencent.mm.protocal.protobuf.FinderObject finderObject2 : linkedList2) {
                        com.tencent.mm.plugin.finder.storage.h90 h90Var2 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                        kotlin.jvm.internal.o.d(finderObject2);
                        arrayList3.add(h90Var2.a(finderObject2, 0));
                    }
                    arrayList.addAll(arrayList3);
                }
            }
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderHomePageRequest");
        r45.kv0 kv0Var = ((r45.mb1) fVar).f380320e;
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }
}
