package pk2;

/* loaded from: classes3.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f356414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.b3 f356416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f356417g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(pk2.o9 o9Var, pk2.b3 b3Var, com.tencent.mm.plugin.finder.view.e3 e3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356415e = o9Var;
        this.f356416f = b3Var;
        this.f356417g = e3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.z2(this.f356415e, this.f356416f, this.f356417g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((pk2.z2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f356414d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) this.f356415e.c(mm2.g1.class)).f329074o;
            pk2.y2 y2Var = new pk2.y2(this.f356416f, this.f356417g);
            this.f356414d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(y2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
