package sc2;

/* loaded from: classes2.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f406065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.b f406068g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(sc2.h1 h1Var, in5.s0 s0Var, so2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406066e = h1Var;
        this.f406067f = s0Var;
        this.f406068g = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sc2.m0 m0Var = new sc2.m0(this.f406066e, this.f406067f, this.f406068g, continuation);
        m0Var.f406065d = ((java.lang.Number) obj).longValue();
        return m0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sc2.m0 m0Var = (sc2.m0) create(java.lang.Long.valueOf(((java.lang.Number) obj).longValue()), (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long j17 = this.f406065d;
        android.widget.TextView textView = this.f406066e.K;
        if (textView != null) {
            textView.setText(this.f406067f.f293121e.getString(com.tencent.mm.R.string.f491264ni0, new java.lang.Long(j17)));
        }
        so2.b bVar = this.f406068g;
        if (bVar != null) {
            bVar.f410266e = new java.lang.Long(j17 * 1000);
        }
        return jz5.f0.f302826a;
    }
}
