package df2;

/* loaded from: classes10.dex */
public final class tn extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.un f231458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(df2.un unVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231458e = unVar;
        this.f231459f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.tn(this.f231458e, this.f231459f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.tn) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231457d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f231457d = 1;
            if (this.f231458e.a7(this.f231459f, false, this) == aVar) {
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
