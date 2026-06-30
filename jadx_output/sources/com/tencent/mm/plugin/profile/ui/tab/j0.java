package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.l0 f154367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154368e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.profile.ui.tab.l0 l0Var, java.lang.String str) {
        super(2);
        this.f154367d = l0Var;
        this.f154368e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.j32 j32Var = (r45.j32) obj2;
        com.tencent.mm.plugin.profile.ui.tab.l0 l0Var = this.f154367d;
        if (kotlinx.coroutines.z0.h(l0Var.f154400n)) {
            java.lang.String str = this.f154368e;
            if (!booleanValue || j32Var == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CGI failed, fallback to initial data: username=");
                sb6.append(str);
                sb6.append(", initCount=");
                r45.j32 j32Var2 = l0Var.f154396j;
                kotlin.jvm.internal.o.d(j32Var2);
                sb6.append(j32Var2.getList(0).size());
                com.tencent.mars.xlog.Log.w("ContactBizHeaderLiveNoticeLogicV2", sb6.toString());
                zy2.ic icVar = l0Var.f154394h;
                kotlin.jvm.internal.o.d(icVar);
                r45.j32 j32Var3 = l0Var.f154396j;
                kotlin.jvm.internal.o.d(j32Var3);
                ((com.tencent.mm.plugin.finder.profile.widget.s4) icVar).g(j32Var3, "", false, "", -1, 0, l0Var.f154397k);
            } else {
                com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "show more list with CGI data: username=" + str + ", count=" + j32Var.getList(0).size() + ", totalNotice=" + j32Var.getInteger(2) + ", totalReserve=" + j32Var.getInteger(3));
                zy2.ic icVar2 = l0Var.f154394h;
                kotlin.jvm.internal.o.d(icVar2);
                ((com.tencent.mm.plugin.finder.profile.widget.s4) icVar2).g(j32Var, "", false, "", -1, 0, l0Var.f154397k);
            }
        } else {
            com.tencent.mars.xlog.Log.w("ContactBizHeaderLiveNoticeLogicV2", "request callback: coroutine cancelled, skip UI update");
        }
        return jz5.f0.f302826a;
    }
}
