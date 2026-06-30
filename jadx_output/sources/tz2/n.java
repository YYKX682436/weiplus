package tz2;

/* loaded from: classes14.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f423307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tz2.q f423309f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, tz2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f423308e = str;
        this.f423309f = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tz2.n(this.f423308e, this.f423309f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tz2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f423307d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String it = this.f423308e;
            long k17 = com.tencent.mm.vfs.w6.k(it);
            tz2.q qVar = this.f423309f;
            if (k17 <= qVar.f423324h) {
                kotlin.jvm.internal.o.f(it, "$it");
                this.f423307d = 1;
                if (tz2.q.b(qVar, it, this) == aVar) {
                    return aVar;
                }
            } else {
                tz2.q.a(qVar);
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashRecordManagerForPay", "file size too big, cancel upload");
                qVar.c("", "");
                h72.s.e().d();
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
