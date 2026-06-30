package kn;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.modelbase.i {
    public c(java.lang.String str, java.util.LinkedList linkedList) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (linkedList != null) {
            linkedList.size();
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            r45.az azVar = new r45.az();
            azVar.f370372d = str2;
            linkedList2.add(azVar);
        }
        r45.j7 j7Var = new r45.j7();
        j7Var.f377617d = str == null ? "" : str;
        j7Var.f377618e = linkedList2.size();
        j7Var.f377619f = linkedList2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = j7Var;
        lVar.f70665b = new r45.k7();
        lVar.f70666c = "/cgi-bin/micromsg-bin/alterchatroomwatchmembers";
        lVar.f70667d = 447;
        p(lVar.a());
    }
}
