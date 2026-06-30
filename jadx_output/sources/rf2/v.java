package rf2;

/* loaded from: classes10.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f394911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xg2.h hVar, kotlin.coroutines.Continuation continuation, r45.f02 f02Var, rf2.v0 v0Var) {
        super(2, continuation);
        this.f394911d = hVar;
        this.f394912e = f02Var;
        this.f394913f = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.v(this.f394911d, continuation, this.f394912e, this.f394913f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rf2.v vVar = (rf2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.f02 f02Var = this.f394912e;
        int i17 = f02Var.f373881g;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        f02Var.f373881g = i17 | 1;
        r45.tl4 tl4Var = f02Var.f373879e;
        java.lang.Integer num = tl4Var != null ? new java.lang.Integer(tl4Var.f386550i) : null;
        rf2.v0 v0Var = this.f394913f;
        ((mm2.v4) v0Var.f394915b.business(mm2.v4.class)).S6(f02Var.f373878d, null);
        r45.tl4 tl4Var2 = f02Var.f373879e;
        if (tl4Var2 != null) {
            int i18 = tl4Var2.f386550i;
            if (num != null && i18 == num.intValue()) {
                tl4Var2.f386550i++;
                com.tencent.mars.xlog.Log.i(v0Var.f394916c, "modify ui data, participate_count++, " + tl4Var2.f386550i);
            }
        }
        return jz5.f0.f302826a;
    }
}
