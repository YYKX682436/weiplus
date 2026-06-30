package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class b40 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f117830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c40 f117831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(int i17, com.tencent.mm.plugin.finder.live.widget.c40 c40Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117830e = i17;
        this.f117831f = c40Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.b40(this.f117830e, this.f117831f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.b40) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117829d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f117830e * 1000;
            this.f117829d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.live.widget.c40 c40Var = this.f117831f;
        kotlinx.coroutines.y0 y0Var = c40Var.f117959o;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.a40(c40Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
