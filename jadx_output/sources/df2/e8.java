package df2;

/* loaded from: classes3.dex */
public final class e8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d42 f230042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f230043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(df2.s8 s8Var, r45.d42 d42Var, r45.ch1 ch1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230041d = s8Var;
        this.f230042e = d42Var;
        this.f230043f = ch1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.e8(this.f230041d, this.f230042e, this.f230043f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.e8 e8Var = (df2.e8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        kotlinx.coroutines.a1 a1Var = kotlinx.coroutines.a1.UNDISPATCHED;
        r45.ch1 ch1Var = this.f230043f;
        r45.d42 d42Var = this.f230042e;
        df2.s8 s8Var = this.f230041d;
        com.tencent.mm.plugin.finder.live.util.y.b(s8Var, p0Var, a1Var, new df2.d8(d42Var, ch1Var, s8Var, null));
        return jz5.f0.f302826a;
    }
}
