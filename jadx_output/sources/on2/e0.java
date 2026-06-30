package on2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f346885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f346887g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(on2.v0 v0Var, java.lang.String str, r45.cz1 cz1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f346885e = v0Var;
        this.f346886f = str;
        this.f346887g = cz1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new on2.e0(this.f346885e, this.f346886f, this.f346887g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((on2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f346884d;
        on2.v0 v0Var = this.f346885e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            on2.l3 l3Var = on2.l3.f346966a;
            long j17 = v0Var.f347028J;
            androidx.appcompat.app.AppCompatActivity activity = v0Var.getActivity();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("claimByCustomize: ");
            java.lang.String str = this.f346886f;
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            r45.p30 p30Var = new r45.p30();
            p30Var.set(3, str);
            r45.cz1 cz1Var = this.f346887g;
            this.f346884d = 1;
            obj = l3Var.h(j17, null, activity, sb7, p30Var, cz1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.yy1 yy1Var = (r45.yy1) obj;
        if (yy1Var != null) {
            pm0.v.X(new on2.d0(v0Var, yy1Var));
        }
        return jz5.f0.f302826a;
    }
}
