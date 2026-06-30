package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class z8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f130083d;

    /* renamed from: e, reason: collision with root package name */
    public int f130084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f130085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f130085f = finderLivePostHelperUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.z8(this.f130085f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.z8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yl2.g1 g1Var;
        java.lang.String str;
        r45.j01 j01Var;
        r45.v25 v25Var;
        r45.j01 j01Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f130084e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "handleAuthResultForExternal: calling prepare to refresh userFlag");
            yl2.g1 g1Var2 = new yl2.g1(this.f130085f, 0, 0L, 6, null);
            this.f130083d = g1Var2;
            this.f130084e = 1;
            java.lang.Object n17 = g1Var2.n(this);
            if (n17 == aVar) {
                return aVar;
            }
            g1Var = g1Var2;
            obj = n17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g1Var = (yl2.g1) this.f130083d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.k kVar = (yl2.k) obj;
        if (g1Var.c(kVar)) {
            int i18 = (kVar == null || (j01Var2 = kVar.f463036c) == null) ? 0 : j01Var2.f377439f;
            if (kVar == null || (j01Var = kVar.f463036c) == null || (v25Var = j01Var.K) == null || (str = v25Var.getString(4)) == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "handleAuthResultForExternal: prepare success, newUserFlag=" + i18 + ", newRealnameAuthUrl=" + str);
            int i19 = com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.C;
            this.f130085f.n7(true, i18, str);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAuthResultForExternal: prepare failed, errCode=");
            sb6.append(kVar != null ? new java.lang.Integer(kVar.f463034a) : null);
            sb6.append(", errMsg=");
            sb6.append(kVar != null ? kVar.f463035b : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", sb6.toString());
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.o7(this.f130085f, false, 0, null, 6, null);
        }
        return jz5.f0.f302826a;
    }
}
