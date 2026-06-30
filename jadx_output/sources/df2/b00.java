package df2;

/* loaded from: classes3.dex */
public final class b00 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b35 f229766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f229767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b00(r45.b35 b35Var, df2.m00 m00Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229766e = b35Var;
        this.f229767f = m00Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.b00(this.f229766e, this.f229767f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.b00) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229765d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean a17 = ae2.in.f3688a.a(ym5.f6.I1);
            df2.m00 m00Var = this.f229767f;
            r45.b35 b35Var = this.f229766e;
            if (a17) {
                rj.j a18 = nn2.d.f338671a.a();
                java.lang.String string = b35Var.getString(0);
                str = string != null ? string : "";
                java.lang.String str2 = m00Var.f230740m;
                this.f229765d = 1;
                obj = ((b51.m) a18).j(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                rj.j a19 = nn2.d.f338671a.a();
                java.lang.String string2 = b35Var.getString(0);
                str = string2 != null ? string2 : "";
                java.lang.String str3 = m00Var.f230740m;
                this.f229765d = 2;
                obj = ((b51.m) a19).h(str, str3, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
