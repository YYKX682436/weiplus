package sg0;

/* loaded from: classes.dex */
public final class h2 implements su4.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f407721a = jz5.h.b(sg0.g2.f407716d);

    public java.util.List a(java.lang.String query, long j17, int i17) {
        kotlin.jvm.internal.o.g(query, "query");
        java.util.ArrayList<dv4.p> arrayList = new java.util.ArrayList(((dv4.q) ((dv4.f) ((dv4.k) ((jz5.n) this.f407721a).getValue())).b(query, j17, i17)).f244034c);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (dv4.p pVar : arrayList) {
            java.lang.String userName = pVar.f244028a;
            kotlin.jvm.internal.o.f(userName, "userName");
            java.lang.String matchWord = pVar.f244029b;
            kotlin.jvm.internal.o.f(matchWord, "matchWord");
            java.lang.String nickName = pVar.f244030c;
            kotlin.jvm.internal.o.f(nickName, "nickName");
            java.lang.String remark = pVar.f244031d;
            kotlin.jvm.internal.o.f(remark, "remark");
            java.lang.String alias = pVar.f244032e;
            kotlin.jvm.internal.o.f(alias, "alias");
            java.lang.String desc = pVar.f244033f;
            kotlin.jvm.internal.o.f(desc, "desc");
            arrayList2.add(new su4.r0(userName, matchWord, nickName, remark, alias, desc));
        }
        return arrayList2;
    }
}
