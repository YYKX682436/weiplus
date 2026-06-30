package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class o90 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gk2 f127298a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f127299b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f127300c;

    public o90(r45.gk2 section) {
        java.util.List list;
        kotlin.jvm.internal.o.g(section, "section");
        this.f127298a = section;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f127299b = linkedList;
        java.util.LinkedList list2 = section.getList(1);
        if (list2 != null) {
            java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderObject> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list2) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                if ((finderObject != null ? finderObject.getObjectDesc() : null) != null) {
                    arrayList.add(obj);
                }
            }
            list = new java.util.ArrayList();
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject2 : arrayList) {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject2);
                list.add(cu2.u.f222441a.p(h90Var.a(finderObject2, 1)));
            }
        } else {
            list = kz5.p0.f313996d;
        }
        linkedList.addAll(list);
        this.f127300c = jz5.h.b(new com.tencent.mm.plugin.finder.storage.n90(this));
    }

    public final int a() {
        return c().getInteger(4);
    }

    public final java.lang.String b() {
        java.lang.String string = c().getString(1);
        return string == null ? "" : string;
    }

    public final r45.xu2 c() {
        r45.xu2 xu2Var = (r45.xu2) this.f127298a.getCustom(0);
        if (xu2Var != null) {
            return xu2Var;
        }
        r45.xu2 xu2Var2 = new r45.xu2();
        xu2Var2.set(0, "");
        xu2Var2.set(1, "");
        xu2Var2.set(2, "");
        xu2Var2.set(3, 0);
        xu2Var2.set(4, 0);
        xu2Var2.set(5, "");
        xu2Var2.set(6, "");
        xu2Var2.set(7, "");
        xu2Var2.set(8, 0);
        return xu2Var2;
    }

    public final java.lang.String d() {
        java.lang.String string = c().getString(0);
        return string == null ? "" : string;
    }
}
