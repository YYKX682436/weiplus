package rx3;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401028d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f401029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx3.h f401031g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List list, rx3.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401030f = list;
        this.f401031g = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rx3.g gVar = new rx3.g(this.f401030f, this.f401031g, continuation);
        gVar.f401029e = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.g) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f401028d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rx3.f fVar = new rx3.f(this.f401030f, (kotlinx.coroutines.flow.k) this.f401029e, this.f401031g, new java.util.ArrayList(), null);
            this.f401028d = 1;
            if (kotlinx.coroutines.a4.c(5000L, fVar, this) == aVar) {
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
