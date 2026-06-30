package db2;

/* loaded from: classes.dex */
public final class f4 extends com.tencent.mm.modelbase.i {
    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.ArrayList arrayList;
        r45.l51 resp = (r45.l51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" resp=");
        java.util.LinkedList list = resp.getList(1);
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.protocal.protobuf.FinderContact) it.next()).getUsername());
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.CgiGetFinderContact", sb6.toString());
    }
}
