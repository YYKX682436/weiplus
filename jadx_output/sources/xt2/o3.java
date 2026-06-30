package xt2;

/* loaded from: classes2.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f456921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f456922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456922e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.o3(this.f456922e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.o3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456921d;
        java.lang.String str = this.f456922e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                rj.j a17 = nn2.d.f338671a.a();
                this.f456921d = 1;
                if (((b51.m) a17).h(str, "MicroMsg.FinderLiveShoppingCartAnimWidget", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "preloadPromotePag: preload done, url=" + str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FinderLiveShoppingCartAnimWidget", th6, "preloadPromotePag error", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
