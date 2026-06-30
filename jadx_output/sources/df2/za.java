package df2;

/* loaded from: classes3.dex */
public final class za extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d22 f231938f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(df2.zb zbVar, r45.d22 d22Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231937e = zbVar;
        this.f231938f = d22Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.za(this.f231937e, this.f231938f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.za) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231936d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f231936d = 1;
            if (kotlinx.coroutines.k1.b(800L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        df2.zb zbVar = this.f231937e;
        ((mm2.c1) zbVar.business(mm2.c1.class)).Z6().a(new dk2.vg(this.f231938f, 0, 0, 0, false, 0L, 56, null), true);
        if2.b.Y6(zbVar, qo0.b.f365387n2, null, 2, null);
        long j17 = ((mm2.e1) zbVar.business(mm2.e1.class)).f328988r.getLong(0);
        byte[] bArr = ((mm2.e1) zbVar.business(mm2.e1.class)).f328985o;
        java.lang.String e17 = xy2.c.e(zbVar.O6());
        long j18 = ((mm2.e1) zbVar.business(mm2.e1.class)).f328983m;
        r45.xl1 f17 = ((mm2.c1) zbVar.business(mm2.c1.class)).Z6().f();
        new ek2.p1(j17, bArr, e17, j18, f17, 3, new xl2.a(j17, bArr, e17, j18, f17)).l();
        return jz5.f0.f302826a;
    }
}
