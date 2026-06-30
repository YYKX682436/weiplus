package so5;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uo5.q f410913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f410914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f410915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so5.y f410916h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(uo5.q qVar, int i17, boolean z17, so5.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410913e = qVar;
        this.f410914f = i17;
        this.f410915g = z17;
        this.f410916h = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so5.v(this.f410913e, this.f410914f, this.f410915g, this.f410916h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((so5.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410912d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.f3 b17 = kotlinx.coroutines.flow.l.b(((uo5.l) this.f410913e).f429727d);
            so5.u uVar = new so5.u(this.f410914f, this.f410915g, this.f410916h);
            this.f410912d = 1;
            if (((kotlinx.coroutines.flow.l2) b17).a(uVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
