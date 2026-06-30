package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class pf extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(2);
        this.f124130d = finderProfileTabUIC;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.ArrayList arrayList;
        java.lang.String finderUsername = (java.lang.String) obj;
        r45.go2 resp = (r45.go2) obj2;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124130d;
        if (kotlin.jvm.internal.o.b(finderUsername, finderProfileTabUIC.F7())) {
            java.util.LinkedList<r45.do2> list = resp.getList(1);
            if (list != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (r45.do2 do2Var : list) {
                    kotlin.jvm.internal.o.d(do2Var);
                    arrayList.add(new nr2.m(do2Var));
                }
            } else {
                arrayList = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPaidCollectionTab feedList size :");
            sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
            sb6.append('!');
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", sb6.toString());
            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.nf(finderProfileTabUIC, arrayList, resp));
            } else {
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.of(finderProfileTabUIC));
            }
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkPaidCollectionTab targetUsername:" + finderProfileTabUIC.F7() + " but cgi's:" + finderUsername + '!');
        }
        return jz5.f0.f302826a;
    }
}
