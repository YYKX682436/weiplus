package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class kk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f132506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f132507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(java.util.ArrayList arrayList, int i17) {
        super(0);
        this.f132506d = arrayList;
        this.f132507e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f132507e;
        java.util.ArrayList arrayList = this.f132506d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.finder.report.w4 w4Var = com.tencent.mm.plugin.finder.report.w4.f125422a;
            if (!hasNext) {
                r45.qt2 qt2Var = new r45.qt2();
                qt2Var.set(5, java.lang.Integer.valueOf(this.f132507e));
                w4Var.b(arrayList2, qt2Var, 0);
                return jz5.f0.f302826a;
            }
            so2.j1 j1Var = (so2.j1) it.next();
            long itemId = j1Var.getItemId();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = j1Var.f410439d;
            r45.dm2 object_extend = finderObject.getObject_extend();
            arrayList2.add(w4Var.a(itemId, object_extend != null ? object_extend.getString(62) : null, 2004, finderObject.getSessionBuffer(), i17));
        }
    }
}
