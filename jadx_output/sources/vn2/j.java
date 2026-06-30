package vn2;

/* loaded from: classes2.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.l03 f438310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v65.n f438311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f438312d;

    public j(java.lang.String str, r45.l03 l03Var, v65.n nVar, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        this.f438309a = str;
        this.f438310b = l03Var;
        this.f438311c = nVar;
        this.f438312d = jbVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        vn2.u0 u0Var = vn2.u0.f438387a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchImpl result,resp size=");
        boolean z17 = true;
        sb6.append(((r45.m03) fVar.f70618d).getList(1).size());
        sb6.append(",tabTYpe=");
        r45.l03 l03Var = this.f438310b;
        sb6.append(l03Var.getInteger(10));
        sb6.append(", pullType=");
        sb6.append(l03Var.getInteger(5));
        sb6.append(",errType=");
        sb6.append(fVar.f70615a);
        sb6.append(",errCode=");
        sb6.append(fVar.f70616b);
        sb6.append(",errMsg=");
        sb6.append(fVar.f70617c);
        sb6.append('!');
        u0Var.m(this.f438309a, sb6.toString());
        r45.l03 l03Var2 = this.f438310b;
        com.tencent.mm.protobuf.f resp = fVar.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.c(l03Var2, (r45.m03) resp, fVar.f70615a, fVar.f70616b, fVar.f70617c);
        if (fVar.b()) {
            yr2.a aVar = yr2.a.f464659a;
            r45.m03 m03Var = cVar.f120906b;
            r45.sq2 sq2Var = (r45.sq2) m03Var.getCustom(5);
            java.util.LinkedList list = m03Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            aVar.b(sq2Var, list, 7017);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList list2 = m03Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getObject(...)");
            java.util.Iterator it = list2.iterator();
            while (true) {
                boolean z18 = false;
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject, 2097152);
                int integer = l03Var.getInteger(10);
                if (integer == 23) {
                    linkedList.add(cu2.u.f222441a.o(a17, 4));
                } else if (integer == 24) {
                    linkedList.add(cu2.u.f222441a.o(a17, 11003));
                } else if (integer == 28) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f438312d;
                    if (jbVar != null && jbVar.getType() == 400000) {
                        linkedList.add(cu2.u.f222441a.o(a17, 4));
                    } else {
                        if (jbVar != null && jbVar.getType() == 400001) {
                            z18 = true;
                        }
                        if (z18) {
                            linkedList.add(cu2.u.f222441a.o(a17, 11003));
                        }
                    }
                }
            }
            cVar.setIncrementList(linkedList);
            cVar.setLastBuffer(m03Var.getByteString(2));
            cVar.setPullType(l03Var.getInteger(5));
            if (cVar.getErrType() == 0 && cVar.getErrCode() == 0 && m03Var.getInteger(3) == 0) {
                z17 = false;
            }
            cVar.setHasMore(z17);
            cVar.setRequest(l03Var);
        }
        this.f438311c.a(cVar);
        return jz5.f0.f302826a;
    }
}
