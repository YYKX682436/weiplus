package mx2;

/* loaded from: classes2.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332504d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332506f = finderImageBanner;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mx2.m mVar = new mx2.m(this.f332506f, continuation);
        mVar.f332505e = obj;
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332504d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f332505e;
            this.f332505e = y0Var2;
            this.f332504d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f332505e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (kotlinx.coroutines.z0.h(y0Var)) {
            com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = this.f332506f;
            if (finderImageBanner.f132324v) {
                com.tencent.mm.plugin.finder.view.image.FinderImageBanner.d(finderImageBanner);
            }
        }
        return jz5.f0.f302826a;
    }
}
