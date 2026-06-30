package o41;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        com.tencent.mm.sdk.platformtools.t8.G1(str3);
        r45.va vaVar = new r45.va();
        vaVar.f388020g = str3;
        vaVar.f388017d = str2;
        r45.xz4 xz4Var = new r45.xz4();
        xz4Var.f390630d = str;
        vaVar.f388018e = xz4Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str4 = (java.lang.String) it.next();
            r45.xz4 xz4Var2 = new r45.xz4();
            xz4Var2.f390630d = str4;
            linkedList.add(xz4Var2);
        }
        vaVar.f388019f = linkedList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = vaVar;
        lVar.f70665b = new r45.wa();
        lVar.f70666c = "/cgi-bin/micromsg-bin/approveaddopenimchatroommember";
        lVar.f70667d = 941;
        p(lVar.a());
    }
}
