package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public abstract class o0 {
    public static final com.tencent.mm.plugin.finder.viewmodel.component.u a(com.tencent.mm.modelbase.f fVar) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        com.tencent.mm.protobuf.f resp = fVar.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        com.tencent.mm.plugin.finder.viewmodel.component.u uVar = new com.tencent.mm.plugin.finder.viewmodel.component.u(i17, i18, str, (r45.dt0) resp);
        uVar.setHasMore(((r45.dt0) fVar.f70618d).getInteger(2) != 0);
        uVar.setLastBuffer(((r45.dt0) fVar.f70618d).getByteString(3));
        java.util.LinkedList list = ((r45.dt0) fVar.f70618d).getList(1);
        if (list != null) {
            java.util.ArrayList<r45.bt0> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!(((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.bt0) obj).getCustom(0)) == null)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            for (r45.bt0 bt0Var : arrayList2) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) bt0Var.getCustom(0);
                kotlin.jvm.internal.o.d(finderContact);
                java.lang.String string = bt0Var.getString(2);
                if (string == null) {
                    string = "";
                }
                java.util.LinkedList list2 = bt0Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getObject(...)");
                arrayList.add(new com.tencent.mm.plugin.finder.viewmodel.component.t(finderContact, string, list2));
            }
        } else {
            arrayList = null;
        }
        uVar.setIncrementList(arrayList);
        return uVar;
    }
}
