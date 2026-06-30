package qr3;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f366097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f366098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qr3.o f366099g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlinx.coroutines.flow.j jVar, kotlinx.coroutines.flow.j jVar2, qr3.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366097e = jVar;
        this.f366098f = jVar2;
        this.f366099g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qr3.l(this.f366097e, this.f366098f, this.f366099g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qr3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f366096d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.f2 f2Var = new kotlinx.coroutines.flow.f2(this.f366097e, this.f366098f, new qr3.i(null));
            qr3.k kVar = new qr3.k(this.f366099g);
            this.f366096d = 1;
            if (f2Var.a(kVar, this) == aVar) {
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
