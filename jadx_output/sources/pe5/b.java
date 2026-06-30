package pe5;

/* loaded from: classes9.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f353729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k70.i0 f353730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlinx.coroutines.flow.j jVar, k70.i0 i0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353729e = jVar;
        this.f353730f = i0Var;
        this.f353731g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pe5.b(this.f353729e, this.f353730f, this.f353731g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe5.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f353728d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pe5.a aVar2 = new pe5.a(this.f353730f, this.f353731g);
            this.f353728d = 1;
            if (this.f353729e.a(aVar2, this) == aVar) {
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
