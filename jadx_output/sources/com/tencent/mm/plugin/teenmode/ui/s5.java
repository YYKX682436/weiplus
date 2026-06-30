package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f173134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f173135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f173136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI f173137g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(kotlinx.coroutines.flow.j jVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f173135e = jVar;
        this.f173136f = u3Var;
        this.f173137g = teenModeGuardianInfoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.teenmode.ui.s5(this.f173135e, this.f173136f, this.f173137g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.teenmode.ui.s5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f173134d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.teenmode.ui.r5 r5Var = new com.tencent.mm.plugin.teenmode.ui.r5(this.f173136f, this.f173137g);
            this.f173134d = 1;
            if (this.f173135e.a(r5Var, this) == aVar) {
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
