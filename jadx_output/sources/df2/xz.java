package df2;

/* loaded from: classes3.dex */
public final class xz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xb2 f231830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f231831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(r45.xb2 xb2Var, df2.a00 a00Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231830e = xb2Var;
        this.f231831f = a00Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.xz(this.f231830e, this.f231831f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.xz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231829d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rj.j a17 = nn2.d.f338671a.a();
            r45.bb7 bb7Var = (r45.bb7) this.f231830e.getCustom(0);
            if (bb7Var == null || (str = bb7Var.getString(1)) == null) {
                str = "";
            }
            java.lang.String str2 = this.f231831f.f229648m;
            this.f231829d = 1;
            obj = ((b51.m) a17).j(str, str2, this);
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
