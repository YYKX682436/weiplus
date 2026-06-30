package db2;

/* loaded from: classes2.dex */
public final class g0 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f227978t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.z11 f227979u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g0(r45.qt2 r28, com.tencent.mm.protocal.protobuf.FinderObject r29, com.tencent.mm.protobuf.g r30, java.util.List r31, java.util.List r32, int r33, int r34, int r35, long r36, com.tencent.mm.protobuf.g r38) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.g0.<init>(r45.qt2, com.tencent.mm.protocal.protobuf.FinderObject, com.tencent.mm.protobuf.g, java.util.List, java.util.List, int, int, int, long, com.tencent.mm.protobuf.g):void");
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.a21 resp = (r45.a21) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(' ');
        java.util.LinkedList object = resp.f369656d;
        kotlin.jvm.internal.o.f(object, "object");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(object, 10));
        java.util.Iterator it = object.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Cgi.FinderEnhanceStream", sb6.toString());
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.a21 resp = (r45.a21) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> object = resp.f369656d;
        kotlin.jvm.internal.o.f(object, "object");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(object, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : object) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var = this.f227979u.f391583d;
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }
}
