package wi0;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f446136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446137g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, long j17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446135e = str;
        this.f446136f = j17;
        this.f446137g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wi0.b(this.f446135e, this.f446136f, this.f446137g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f446134d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f446137g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                vi0.i iVar = new vi0.i();
                java.lang.String str = this.f446135e;
                long j17 = this.f446136f;
                this.f446134d = 1;
                obj = iVar.a(str, j17, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            byte[] byteArray = ((com.tencent.mm.flutter.plugin.proto.d) obj).toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.flutter_voip_status.ProtoBuffer(byteArray))));
            return f0Var;
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
            return f0Var;
        }
    }
}
