package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r30 f113703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.r30 r30Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113702e = viewGroup;
        this.f113703f = r30Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.o30(this.f113702e, this.f113703f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.o30) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113701d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ld2.i iVar = ld2.i.f318103a;
            android.content.Context context = this.f113702e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gk2.e S0 = this.f113703f.S0();
            this.f113701d = 1;
            if (iVar.a(context, S0, false, this) == aVar) {
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
