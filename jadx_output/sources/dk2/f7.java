package dk2;

/* loaded from: classes3.dex */
public final class f7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce2.i f233456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(ce2.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233456e = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.f7(this.f233456e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.f7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f233455d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f233456e.field_previewPagUrl;
            this.f233455d = 1;
            obj = dk2.o7.f(str, null, this, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue());
    }
}
