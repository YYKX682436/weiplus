package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes15.dex */
public final class f9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f129126d;

    /* renamed from: e, reason: collision with root package name */
    public int f129127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f129129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129128f = finderLivePostHelperUI;
        this.f129129g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.f9(this.f129128f, this.f129129g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.f9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yl2.g1 g1Var;
        int i17;
        r45.j01 j01Var;
        r45.j01 j01Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f129127e;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yl2.g1 g1Var2 = new yl2.g1(this.f129128f, 0, 0L, 6, null);
            this.f129126d = g1Var2;
            this.f129127e = 1;
            java.lang.Object n17 = g1Var2.n(this);
            if (n17 == aVar) {
                return aVar;
            }
            g1Var = g1Var2;
            obj = n17;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g1Var = (yl2.g1) this.f129126d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.k kVar = (yl2.k) obj;
        boolean c17 = g1Var.c(kVar);
        com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI = this.f129128f;
        if (c17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh2 user_flag:");
            sb6.append((kVar == null || (j01Var2 = kVar.f463036c) == null) ? null : new java.lang.Integer(j01Var2.f377439f));
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", sb6.toString());
            com.tencent.mm.plugin.finder.live.widget.pr prVar = finderLivePostHelperUI.f128607w;
            if (prVar == null) {
                kotlin.jvm.internal.o.o("precheck");
                throw null;
            }
            if (kVar != null && (j01Var = kVar.f463036c) != null) {
                i17 = j01Var.f377439f;
            } else {
                if (prVar == null) {
                    kotlin.jvm.internal.o.o("precheck");
                    throw null;
                }
                i17 = prVar.f119408f;
            }
            prVar.f119408f = i17;
            if (prVar == null) {
                kotlin.jvm.internal.o.o("precheck");
                throw null;
            }
            prVar.c();
            com.tencent.mm.plugin.finder.live.widget.pr prVar2 = finderLivePostHelperUI.f128607w;
            if (prVar2 == null) {
                kotlin.jvm.internal.o.o("precheck");
                throw null;
            }
            prVar2.b();
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "refreshResp2 failed");
            com.tencent.mm.plugin.finder.live.widget.pr prVar3 = finderLivePostHelperUI.f128607w;
            if (prVar3 == null) {
                kotlin.jvm.internal.o.o("precheck");
                throw null;
            }
            prVar3.h(true, this.f129129g);
        }
        return jz5.f0.f302826a;
    }
}
