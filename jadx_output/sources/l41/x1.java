package l41;

/* loaded from: classes4.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um3.b f315960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f315962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(um3.b bVar, java.lang.String str, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f315960d = bVar;
        this.f315961e = str;
        this.f315962f = z17;
        this.f315963g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l41.x1(this.f315960d, this.f315961e, this.f315962f, this.f315963g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        l41.x1 x1Var = (l41.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.j26 j26Var = new r45.j26();
        j26Var.f377520d = this.f315961e;
        j26Var.f377521e = 8589934592L;
        j26Var.f377522f = this.f315962f ? 8589934592L : 0L;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11957;
        lVar.f70666c = "/cgi-bin/micromsg-bin/setopenimkefucontactflag";
        lVar.f70664a = j26Var;
        lVar.f70665b = new r45.k26();
        kotlinx.coroutines.flow.j a17 = o01.d.f341891a.a(lVar.a());
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = this.f315960d.O6();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.c(O6, kotlinx.coroutines.internal.b0.f310484a, kotlinx.coroutines.a1.DEFAULT, new l41.w1(a17, this.f315963g, null));
        return jz5.f0.f302826a;
    }
}
