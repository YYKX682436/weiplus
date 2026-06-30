package nz0;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f341517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f341519f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f341518e = str;
        this.f341519f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nz0.k(this.f341518e, this.f341519f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nz0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f341517d;
        java.lang.String str = this.f341518e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.HashSet hashSet = nz0.o.f341533d;
            if (hashSet.contains(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Maas.CreationSameInfoHolder", str + " was added");
                return jz5.f0.f302826a;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.CreationSameInfoHolder", "add " + str + " to pool");
            hashSet.add(str);
            nz0.o oVar = nz0.o.f341530a;
            this.f341517d = 1;
            if (oVar.g(str, this.f341519f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        nz0.o.f341536g.remove(str);
        return jz5.f0.f302826a;
    }
}
