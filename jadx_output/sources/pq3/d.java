package pq3;

/* loaded from: classes12.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pq3.j f357617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17, pq3.j jVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357616e = z17;
        this.f357617f = jVar;
        this.f357618g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pq3.d(this.f357616e, this.f357617f, this.f357618g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pq3.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357615d;
        pq3.j jVar = this.f357617f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f357616e) {
                pq3.q f17 = jVar.f();
                this.f357615d = 2;
                if (f17.b(this.f357618g, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f357615d = 1;
                if (jVar.e(this) == aVar) {
                    return aVar;
                }
                jVar.h(false);
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            jVar.h(false);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
