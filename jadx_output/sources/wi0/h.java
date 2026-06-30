package wi0;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446149f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446148e = str;
        this.f446149f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wi0.h(this.f446148e, this.f446149f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f446147d;
        yz5.l lVar = this.f446149f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = this.f446148e;
                this.f446147d = 1;
                obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new yi0.e(str, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            byte[] byteArray = ((com.tencent.mm.flutter.plugin.proto.f) obj).toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.flutter_voip_status.ProtoBuffer(byteArray))));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterPluginTextStatusDataSource", "Failed to get status: " + e17);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
        }
        return jz5.f0.f302826a;
    }
}
