package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class c7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f116974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f116975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f116976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(yl2.g1 g1Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116975e = g1Var;
        this.f116976f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.c7(this.f116975e, this.f116976f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.c7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        r45.j01 j01Var;
        r45.v25 v25Var;
        r45.j01 j01Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f116974d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "refreshUserFlagAndHandle: calling prepare to refresh userFlag");
            this.f116974d = 1;
            obj = this.f116975e.n(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.k kVar = (yl2.k) obj;
        mm2.s1 s1Var = (mm2.s1) dk2.ef.f233372a.i(mm2.s1.class);
        int i18 = (kVar == null || (j01Var2 = kVar.f463036c) == null) ? -1 : j01Var2.f377439f;
        if (kVar == null || (j01Var = kVar.f463036c) == null || (v25Var = j01Var.K) == null || (str = v25Var.getString(4)) == null) {
            str = "";
        }
        if (s1Var != null) {
            s1Var.f329392o = i18;
        }
        if (s1Var != null) {
            s1Var.f329393p = str;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "refreshUserFlagAndHandle: cache updated, userFlag=" + i18 + ", url=" + str);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.b7(this.f116976f));
        return jz5.f0.f302826a;
    }
}
