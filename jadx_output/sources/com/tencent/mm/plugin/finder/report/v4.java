package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class v4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f125404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f125405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f125406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f125407d;

    public v4(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, r45.qt2 qt2Var, int i17) {
        this.f125404a = linkedList;
        this.f125405b = linkedList2;
        this.f125406c = qt2Var;
        this.f125407d = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        com.tencent.mm.plugin.finder.report.w4 w4Var = com.tencent.mm.plugin.finder.report.w4.f125422a;
        r45.qt2 qt2Var = this.f125406c;
        java.util.LinkedList linkedList = this.f125405b;
        java.util.LinkedList linkedList2 = this.f125404a;
        if (i17 == 0 && fVar.f70615a == 0) {
            com.tencent.mars.xlog.Log.i("Finder.StatLogicReporter", "successfully! size=" + linkedList2.size());
            w4Var.b(linkedList, qt2Var, 0);
        } else {
            int i18 = this.f125407d;
            if (i18 <= 2) {
                linkedList.addAll(0, linkedList2);
                com.tencent.mars.xlog.Log.i("Finder.StatLogicReporter", "failure! try next time, size=" + linkedList2.size());
                w4Var.b(linkedList, qt2Var, i18 + 1);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryCount=");
                sb6.append(i18);
                sb6.append(", throw this sendList=");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(pm0.v.u(((r45.vd6) it.next()).getLong(0)));
                }
                sb6.append(arrayList);
                com.tencent.mars.xlog.Log.e("Finder.StatLogicReporter", sb6.toString());
            }
        }
        return jz5.f0.f302826a;
    }
}
