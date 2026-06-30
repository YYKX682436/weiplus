package q61;

/* loaded from: classes11.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f360259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q61.k f360260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, byte[] bArr, q61.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360258e = str;
        this.f360259f = bArr;
        this.f360260g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q61.i(this.f360258e, this.f360259f, this.f360260g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q61.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f360257d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                q61.j jVar = q61.j.f360261a;
                java.lang.String str = this.f360258e;
                byte[] bArr = this.f360259f;
                q61.k kVar = this.f360260g;
                this.f360257d = 1;
                if (jVar.c(9, str, bArr, kVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception unused) {
        }
        return jz5.f0.f302826a;
    }
}
