package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class i1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f122324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f122325c;

    public i1(com.tencent.mm.plugin.finder.playlist.s1 s1Var, yz5.l lVar, long j17) {
        this.f122323a = s1Var;
        this.f122324b = lVar;
        this.f122325c = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestFirstDataWithRel enterType=");
        r45.vx0 vx0Var = this.f122323a.h().f122285e;
        sb6.append(vx0Var != null ? java.lang.Integer.valueOf(vx0Var.getInteger(10)) : null);
        sb6.append(" list=[");
        java.util.LinkedList list = ((r45.aa1) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        sb6.append(kz5.n0.g0(list, null, null, null, 0, null, com.tencent.mm.plugin.finder.playlist.f1.f122302d, 31, null));
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawerPresenter", sb6.toString());
        this.f122323a.f122437q = ((r45.aa1) fVar.f70618d).getByteString(2);
        this.f122323a.p(((r45.aa1) fVar.f70618d).getInteger(3) == 1);
        java.util.LinkedList list2 = ((r45.aa1) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list2, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            r45.dm2 object_extend = ((com.tencent.mm.protocal.protobuf.FinderObject) obj2).getObject_extend();
            if ((object_extend != null ? (r45.vx0) object_extend.getCustom(0) : null) != null) {
                arrayList.add(obj2);
            }
        }
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122323a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            com.tencent.mm.plugin.finder.playlist.z1 z1Var = new com.tencent.mm.plugin.finder.playlist.z1(h90Var.a(finderObject, 64));
            z1Var.f122509e = s1Var.h().f122281a;
            if (z1Var.getItemId() == s1Var.h().f122281a) {
                z1Var.f122508d = true;
            }
            arrayList2.add(z1Var);
        }
        java.util.List V0 = kz5.n0.V0(arrayList2);
        kz5.h0.B(V0, new com.tencent.mm.plugin.finder.playlist.g1(this.f122323a));
        if (this.f122324b == null) {
            this.f122323a.f122422b.f122296a.addAll(V0);
            com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122323a.f122425e;
            if (l0Var == null) {
                kotlin.jvm.internal.o.o("viewCallBack");
                throw null;
            }
            l0Var.v();
            if (this.f122323a.f122422b.f122296a.isEmpty()) {
                com.tencent.mm.plugin.finder.playlist.l0 l0Var2 = this.f122323a.f122425e;
                if (l0Var2 == null) {
                    kotlin.jvm.internal.o.o("viewCallBack");
                    throw null;
                }
                l0Var2.A();
            } else {
                this.f122323a.r(true);
            }
        } else {
            this.f122323a.f122422b.f122296a.clear();
            this.f122323a.f122422b.f122296a.addAll(V0);
            this.f122323a.r(false);
            if (((java.util.ArrayList) V0).isEmpty()) {
                com.tencent.mm.plugin.finder.playlist.s1 s1Var2 = this.f122323a;
                com.tencent.mm.plugin.finder.playlist.l0 l0Var3 = s1Var2.f122425e;
                if (l0Var3 == null) {
                    kotlin.jvm.internal.o.o("viewCallBack");
                    throw null;
                }
                l0Var3.B(new com.tencent.mm.plugin.finder.playlist.h1(s1Var2, this.f122325c, this.f122324b));
                this.f122324b.invoke(java.lang.Boolean.FALSE);
            } else {
                this.f122324b.invoke(java.lang.Boolean.TRUE);
            }
        }
        return jz5.f0.f302826a;
    }
}
