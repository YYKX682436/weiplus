package te2;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f417913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f417914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f417915g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(te2.p1 p1Var, boolean z17, dk2.vg vgVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417913e = p1Var;
        this.f417914f = z17;
        this.f417915g = vgVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.c1(this.f417913e, this.f417914f, this.f417915g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417912d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            te2.p1 p1Var = this.f417913e;
            int i18 = this.f417914f ? 3 : 1;
            dk2.vg vgVar = this.f417915g;
            java.lang.Integer num = new java.lang.Integer(vgVar.f234254a.getInteger(0));
            r45.rm1 g17 = dk2.q.g(vgVar.f234254a);
            this.f417912d = 1;
            if (te2.p1.A(p1Var, i18, num, g17, 0, this, 8, null) == aVar) {
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
