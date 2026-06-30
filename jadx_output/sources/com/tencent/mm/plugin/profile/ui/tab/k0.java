package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.l0 f154377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String str, com.tencent.mm.plugin.profile.ui.tab.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154376d = str;
        this.f154377e = l0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.tab.k0(this.f154376d, this.f154377e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.profile.ui.tab.k0 k0Var = (com.tencent.mm.plugin.profile.ui.tab.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String finderUserName = this.f154376d;
        com.tencent.mm.plugin.profile.ui.tab.l0 l0Var = this.f154377e;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "request full live notice list: username=" + finderUserName);
            kotlin.jvm.internal.o.f(finderUserName, "$finderUserName");
            com.tencent.mm.plugin.profile.ui.tab.l0.d(l0Var, finderUserName, new com.tencent.mm.plugin.profile.ui.tab.j0(l0Var, finderUserName));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "request full list exception: " + e17.getMessage());
            if (l0Var.f154396j != null) {
                zy2.ic icVar = l0Var.f154394h;
                kotlin.jvm.internal.o.d(icVar);
                r45.j32 j32Var = l0Var.f154396j;
                kotlin.jvm.internal.o.d(j32Var);
                ((com.tencent.mm.plugin.finder.profile.widget.s4) icVar).g(j32Var, "", false, "", -1, 0, l0Var.f154397k);
            }
        }
        return jz5.f0.f302826a;
    }
}
