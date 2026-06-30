package fn5;

/* loaded from: classes.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264678d = str;
        this.f264679e = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn5.i0(this.f264678d, this.f264679e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isOcrResultSame >> queryText: ");
        java.lang.String str = this.f264678d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", sb6.toString());
        java.lang.String str2 = this.f264679e;
        boolean z17 = true;
        if (str2.length() > 0) {
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17 && r26.n0.D(str2, str, false, 2, null)) {
                return java.lang.Boolean.TRUE;
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
