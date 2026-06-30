package fm3;

/* loaded from: classes2.dex */
public abstract class h0 {
    public static final java.lang.String a(r45.ss4 ss4Var) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.ef2 mvInfo;
        java.util.LinkedList list;
        if (ss4Var == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0)) == null || (objectDesc = finderObject.getObjectDesc()) == null || (mvInfo = objectDesc.getMvInfo()) == null || (list = mvInfo.getList(0)) == null) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = ((r45.jf2) it.next()).getString(3);
            arrayList.add(java.lang.Integer.valueOf(((string == null || string.length() == 0) ? 1 : 0) ^ 1));
        }
        return kz5.n0.g0(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
