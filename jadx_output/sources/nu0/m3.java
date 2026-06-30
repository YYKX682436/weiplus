package nu0;

/* loaded from: classes5.dex */
public final class m3 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f340028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f340029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(nu0.b4 b4Var, int i17, int[] iArr, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f340027d = b4Var;
        this.f340028e = i17;
        this.f340029f = iArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new nu0.m3(this.f340027d, this.f340028e, this.f340029f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        nu0.m3 m3Var = (nu0.m3) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.app.Activity context = this.f340027d.getContext();
        int[] iArr = this.f340029f;
        by0.t.a(context, this.f340028e, java.util.Arrays.copyOf(iArr, iArr.length));
        return jz5.f0.f302826a;
    }
}
