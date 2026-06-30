package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class l6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f173064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f173065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f173066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(kotlinx.coroutines.flow.j jVar, com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f173065e = jVar;
        this.f173066f = teenModePrivatePwdUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.teenmode.ui.l6(this.f173065e, this.f173066f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.teenmode.ui.l6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f173064d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.flow.j n17 = kotlinx.coroutines.flow.l.n(this.f173065e, kotlinx.coroutines.internal.b0.f310484a);
            com.tencent.mm.plugin.teenmode.ui.k6 k6Var = new com.tencent.mm.plugin.teenmode.ui.k6(this.f173066f);
            this.f173064d = 1;
            if (n17.a(k6Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
