package qn2;

/* loaded from: classes3.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f365154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f365156g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(qn2.v0 v0Var, java.lang.String str, r45.cz1 cz1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f365154e = v0Var;
        this.f365155f = str;
        this.f365156g = cz1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qn2.t0(this.f365154e, this.f365155f, this.f365156g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f365153d;
        qn2.v0 v0Var = this.f365154e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            on2.l3 l3Var = on2.l3.f346966a;
            long j17 = ((mm2.e1) v0Var.f365176a.S0().a(mm2.e1.class)).f328983m;
            byte[] bArr = ((mm2.e1) v0Var.f365176a.S0().a(mm2.e1.class)).f328985o;
            android.content.Context context = v0Var.f365177b.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("claimByCustomize: ");
            java.lang.String str = this.f365155f;
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            r45.p30 p30Var = new r45.p30();
            p30Var.set(3, str);
            r45.cz1 cz1Var = this.f365156g;
            this.f365153d = 1;
            obj = l3Var.h(j17, bArr, context, sb7, p30Var, cz1Var, this);
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
            pm0.v.X(new qn2.s0(v0Var, yy1Var));
        }
        return jz5.f0.f302826a;
    }
}
