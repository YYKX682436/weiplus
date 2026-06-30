package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class gf extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(2);
        this.f123741d = finderProfileTabUIC;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String finderUsername = (java.lang.String) obj;
        r45.yz0 resp = (r45.yz0) obj2;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123741d;
        if (kotlin.jvm.internal.o.b(finderUsername, finderProfileTabUIC.F7())) {
            java.util.LinkedList<r45.uz0> list = resp.getList(1);
            kotlin.jvm.internal.o.f(list, "getCourse_info(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.uz0 uz0Var : list) {
                cu2.g0 g0Var = cu2.g0.f222404a;
                kotlin.jvm.internal.o.d(uz0Var);
                arrayList.add(g0Var.d(uz0Var));
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkCourseTab feedList size :" + arrayList.size() + '!');
            pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ff(arrayList, finderProfileTabUIC, resp));
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkCourseTab targetUsername:" + finderProfileTabUIC.F7() + " but cgi's:" + finderUsername + '!');
        }
        return jz5.f0.f302826a;
    }
}
