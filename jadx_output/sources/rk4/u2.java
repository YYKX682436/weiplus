package rk4;

/* loaded from: classes.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f397002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oe5.a f397003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.ContactInfoWrap f397004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n13.t f397005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(android.app.Activity activity, oe5.a aVar, com.tencent.pigeon.ting.ContactInfoWrap contactInfoWrap, n13.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397002e = activity;
        this.f397003f = aVar;
        this.f397004g = contactInfoWrap;
        this.f397005h = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.u2(this.f397002e, this.f397003f, this.f397004g, this.f397005h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.u2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397001d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f397001d = 1;
                ((com.tencent.mm.plugin.ting.TingFlutterActivity) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        ((dk5.y) a0Var).wi(this.f397002e, this.f397003f, this.f397004g.getContactId(), this.f397005h);
        return f0Var;
    }
}
