package q61;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f360249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f360250g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, byte[] bArr, kotlinx.coroutines.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360248e = str;
        this.f360249f = bArr;
        this.f360250g = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q61.g(this.f360248e, this.f360249f, this.f360250g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q61.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f360247d;
        kotlinx.coroutines.z zVar = this.f360250g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                int i18 = com.tencent.mm.sdk.platformtools.o4.L().getInt("TestFastSwitchTime", 2000);
                q61.j jVar = q61.j.f360261a;
                java.lang.String str = this.f360248e;
                byte[] decodedaak = this.f360249f;
                kotlin.jvm.internal.o.f(decodedaak, "$decodedaak");
                q61.f fVar = new q61.f(currentTimeMillis, i18, zVar);
                this.f360247d = 1;
                if (jVar.c(10, str, decodedaak, fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception unused) {
            ((kotlinx.coroutines.a0) zVar).U(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
