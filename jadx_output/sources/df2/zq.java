package df2;

/* loaded from: classes3.dex */
public final class zq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f231985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f231986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(r45.lv1 lv1Var, r45.lv1 lv1Var2, df2.ar arVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231985d = lv1Var;
        this.f231986e = lv1Var2;
        this.f231987f = arVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.zq(this.f231985d, this.f231986e, this.f231987f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.zq zqVar = (df2.zq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zqVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.lv1 lv1Var = this.f231985d;
        this.f231987f.g7(lv1Var == null || !kotlin.jvm.internal.o.b(lv1Var.getString(8), this.f231986e.getString(8)));
        return jz5.f0.f302826a;
    }
}
