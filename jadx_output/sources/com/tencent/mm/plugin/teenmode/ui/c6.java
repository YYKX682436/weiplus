package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class c6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f172952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f172953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f172955g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(kotlinx.coroutines.flow.j jVar, com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f172953e = jVar;
        this.f172954f = teenModePrivatePwdUI;
        this.f172955g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.teenmode.ui.c6(this.f172953e, this.f172954f, this.f172955g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.teenmode.ui.c6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f172952d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.teenmode.ui.b6 b6Var = new com.tencent.mm.plugin.teenmode.ui.b6(this.f172954f, this.f172955g);
            this.f172952d = 1;
            if (this.f172953e.a(b6Var, this) == aVar) {
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
