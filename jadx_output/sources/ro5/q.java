package ro5;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.v {

    /* renamed from: d, reason: collision with root package name */
    public int f398277d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f398278e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int f398279f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f398280g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ int f398281h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f398282i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ boolean f398283m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ro5.b0 f398284n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ro5.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(8, continuation);
        this.f398284n = b0Var;
    }

    @Override // yz5.v
    public java.lang.Object D(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        int intValue3 = ((java.lang.Number) obj4).intValue();
        int intValue4 = ((java.lang.Number) obj5).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj6).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj7).booleanValue();
        ro5.q qVar = new ro5.q(this.f398284n, (kotlin.coroutines.Continuation) obj8);
        qVar.f398278e = intValue;
        qVar.f398279f = intValue2;
        qVar.f398280g = intValue3;
        qVar.f398281h = intValue4;
        qVar.f398282i = booleanValue;
        qVar.f398283m = booleanValue2;
        return qVar.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f398277d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = this.f398278e;
            int i19 = this.f398279f;
            int i27 = this.f398280g;
            int i28 = this.f398281h;
            boolean z17 = this.f398282i;
            boolean z18 = this.f398283m;
            ro5.b0 b0Var = this.f398284n;
            b0Var.f398155l = 0;
            ro5.m1 m1Var = b0Var.f398145b;
            if (m1Var != null) {
                er4.r rVar = b0Var.f398146c;
                this.f398277d = 1;
                if (m1Var.d(i18, i19, i27, i28, z17, rVar, z18, this) == aVar) {
                    return aVar;
                }
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
