package yx0;

/* loaded from: classes5.dex */
public final class h6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bs0.h f467366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f467367g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(yx0.b8 b8Var, bs0.h hVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467365e = b8Var;
        this.f467366f = hVar;
        this.f467367g = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.h6(this.f467365e, this.f467366f, this.f467367g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.h6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467364d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f467364d = 1;
            if (yx0.b8.f(this.f467365e, this.f467366f, this.f467367g, this) == aVar) {
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
