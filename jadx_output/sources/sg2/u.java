package sg2;

/* loaded from: classes3.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ir1 f407940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f407941f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r45.ir1 ir1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407940e = ir1Var;
        this.f407941f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sg2.u(this.f407940e, this.f407941f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sg2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407939d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.ir1 ir1Var = this.f407940e;
            sb6.append(ir1Var.getInteger(0));
            sb6.append("-tips_icon_url");
            java.lang.String sb7 = sb6.toString();
            java.lang.String string = ir1Var.getString(5);
            this.f407939d = 1;
            obj = sg2.x.a(sb7, string, this.f407941f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
