package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f121769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f121770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 f121771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f121773h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vp2.l f121774i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(r45.h32 h32Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var, in5.s0 s0Var, yz5.p pVar, vp2.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f121770e = h32Var;
        this.f121771f = p1Var;
        this.f121772g = s0Var;
        this.f121773h = pVar;
        this.f121774i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l1(this.f121770e, this.f121771f, this.f121772g, this.f121773h, this.f121774i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f121769d;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var = this.f121771f;
        in5.s0 s0Var = this.f121772g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.h32 noticeInfo = this.f121770e;
            r45.q65 q65Var = (r45.q65) noticeInfo.getCustom(10);
            boolean z17 = false;
            if (q65Var != null && q65Var.getBoolean(0)) {
                z17 = true;
            }
            tx2.k kVar = tx2.k.f422602a;
            if (z17) {
                p1Var.q().a();
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                kotlin.jvm.internal.o.f(noticeInfo, "$noticeInfo");
                yz5.p pVar = this.f121773h;
                this.f121769d = 1;
                if (kVar.d(context, 0, noticeInfo, pVar, this) == aVar) {
                    return aVar;
                }
                com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1.n(p1Var, s0Var, this.f121774i);
            } else {
                android.content.Context context2 = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                kotlin.jvm.internal.o.f(noticeInfo, "$noticeInfo");
                yz5.p pVar2 = this.f121773h;
                this.f121769d = 2;
                if (kVar.d(context2, 0, noticeInfo, pVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1.n(p1Var, s0Var, this.f121774i);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
