package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class n1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122376b;

    public n1(com.tencent.mm.plugin.finder.playlist.s1 s1Var, boolean z17) {
        this.f122375a = s1Var;
        this.f122376b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f122375a.f122437q = ((r45.aa1) fVar.f70618d).getByteString(2);
        if (this.f122376b) {
            this.f122375a.p(((r45.aa1) fVar.f70618d).getInteger(3) == 1);
        } else {
            this.f122375a.q(((r45.aa1) fVar.f70618d).getInteger(3) == 1);
        }
        java.util.LinkedList list = ((r45.aa1) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            r45.dm2 object_extend = ((com.tencent.mm.protocal.protobuf.FinderObject) next).getObject_extend();
            if ((object_extend != null ? (r45.vx0) object_extend.getCustom(0) : null) != null) {
                arrayList.add(next);
            }
        }
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122375a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it6.next();
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            com.tencent.mm.plugin.finder.playlist.z1 z1Var = new com.tencent.mm.plugin.finder.playlist.z1(h90Var.a(finderObject, 64));
            z1Var.f122509e = s1Var.h().f122281a;
            z1Var.f122508d = false;
            arrayList2.add(z1Var);
        }
        java.util.List V0 = kz5.n0.V0(arrayList2);
        kz5.h0.B(V0, new com.tencent.mm.plugin.finder.playlist.m1(this.f122375a));
        if (this.f122376b) {
            int size = this.f122375a.f122422b.f122296a.size();
            this.f122375a.f122422b.f122296a.addAll(V0);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f122375a.f122426f;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyItemRangeInserted(size, ((java.util.ArrayList) V0).size());
        } else {
            this.f122375a.f122422b.f122296a.addAll(0, V0);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f122375a.f122426f;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        this.f122375a.g(this.f122376b, ((java.util.ArrayList) V0).size());
        return jz5.f0.f302826a;
    }
}
