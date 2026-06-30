package qf2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f362432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.l f362433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f362434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f362435h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f362436i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f362437m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, qf2.l lVar, long j18, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362432e = j17;
        this.f362433f = lVar;
        this.f362434g = j18;
        this.f362435h = i17;
        this.f362436i = i18;
        this.f362437m = i19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.k(this.f362432e, this.f362433f, this.f362434g, this.f362435h, this.f362436i, this.f362437m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362431d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f362431d = 1;
            if (kotlinx.coroutines.k1.b(this.f362432e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f362433f.c7(this.f362434g, this.f362435h, this.f362436i, this.f362437m);
        return jz5.f0.f302826a;
    }
}
