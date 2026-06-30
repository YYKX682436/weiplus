package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class j6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f117165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f117166g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117164e = b8Var;
        this.f117165f = i17;
        this.f117166g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.j6(this.f117164e, this.f117165f, this.f117166g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.j6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117163d;
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = this.f117164e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b8Var.f116943n = az2.c.a(az2.f.f16125d, b8Var.getContext(), null, 0L, null, 10, null);
            az2.f fVar = b8Var.f116943n;
            if (fVar != null) {
                fVar.a();
            }
            com.tencent.mm.plugin.finder.live.util.j2 j2Var = com.tencent.mm.plugin.finder.live.util.j2.f115579a;
            this.f117163d = 1;
            obj = j2Var.a(this.f117165f, this.f117166g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        wl2.b bVar = (wl2.b) obj;
        az2.f fVar2 = b8Var.f116943n;
        if (fVar2 != null) {
            fVar2.b();
        }
        boolean z17 = bVar.f447045a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            b8Var.h7();
            return f0Var;
        }
        db5.t7.m(b8Var.getContext(), b8Var.getContext().getString(com.tencent.mm.R.string.mkq));
        return f0Var;
    }
}
