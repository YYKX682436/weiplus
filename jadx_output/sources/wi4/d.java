package wi4;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446275d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f446276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f446277f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.widget.EditText editText, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446277f = editText;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wi4.d dVar = new wi4.d(this.f446277f, continuation);
        dVar.f446276e = obj;
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi4.d) create((u26.r0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f446275d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            u26.r0 r0Var = (u26.r0) this.f446276e;
            wi4.c cVar = new wi4.c(r0Var);
            android.widget.EditText editText = this.f446277f;
            editText.addTextChangedListener(cVar);
            wi4.b bVar = new wi4.b(editText, cVar);
            this.f446275d = 1;
            if (u26.p0.a(r0Var, bVar, this) == aVar) {
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
