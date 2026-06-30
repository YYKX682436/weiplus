package hu3;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285193e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.s(this.f285193e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285192d;
        hu3.n0 n0Var = this.f285193e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xr0.j jVar = n0Var.f285168o.f285200b;
            int i18 = jVar.f456173a;
            int i19 = jVar.f456174b;
            this.f285192d = 1;
            if (n0Var.e(i18, i19, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bs0.h hVar = n0Var.f285166m;
        if (hVar != null) {
            android.media.ImageReader imageReader = n0Var.f285169p;
            kotlin.jvm.internal.o.d(imageReader);
            android.view.Surface surface = imageReader.getSurface();
            kotlin.jvm.internal.o.f(surface, "getSurface(...)");
            hVar.A(surface, new java.lang.Integer(n0Var.f285168o.f285200b.f456173a), new java.lang.Integer(n0Var.f285168o.f285200b.f456174b));
        }
        return jz5.f0.f302826a;
    }
}
