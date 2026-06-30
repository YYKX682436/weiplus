package g95;

/* loaded from: classes.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.List a(java.util.List usernameList) {
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        p75.i0 i17 = dm.x1.N.i();
        i17.f352657d = dm.x1.Q.l(usernameList);
        p75.l0 a17 = i17.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.storage.a3 a3Var : a17.k(gm0.j1.u().f273153f, com.tencent.mm.storage.a3.class)) {
            java.lang.String field_chatroomname = a3Var.field_chatroomname;
            kotlin.jvm.internal.o.f(field_chatroomname, "field_chatroomname");
            hashMap.put(field_chatroomname, a3Var);
        }
        java.util.Iterator it = usernameList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.a3 a3Var2 = (com.tencent.mm.storage.a3) hashMap.get((java.lang.String) it.next());
            if (a3Var2 != null) {
                arrayList.add(a3Var2);
            }
        }
        return arrayList;
    }
}
