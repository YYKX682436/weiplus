package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f115129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f115130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115130e = ivVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.xu(this.f115130e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.xu) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f115129d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zl2.r4 r4Var = zl2.r4.f473950a;
            com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f115130e;
            if (r4Var.X1(ivVar.S0()) && ((mm2.c1) ivVar.P0(mm2.c1.class)).f328929z6) {
                vl2.s sVar = vl2.s.f437868a;
                vl2.h hVar = vl2.h.f437832t;
                android.widget.ImageView imageView = ivVar.E;
                this.f115129d = 1;
                if (sVar.c(hVar, imageView, this) == aVar) {
                    return aVar;
                }
            } else {
                vl2.s sVar2 = vl2.s.f437868a;
                vl2.h hVar2 = vl2.h.f437833u;
                android.widget.ImageView imageView2 = ivVar.E;
                this.f115129d = 2;
                if (sVar2.c(hVar2, imageView2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
