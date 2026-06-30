package sc2;

/* loaded from: classes2.dex */
public final class o0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.b f406110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f406113g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(so2.b bVar, sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f406110d = bVar;
        this.f406111e = h1Var;
        this.f406112f = s0Var;
        this.f406113g = t01Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        sc2.o0 o0Var = new sc2.o0(this.f406110d, this.f406111e, this.f406112f, this.f406113g, (kotlin.coroutines.Continuation) obj3);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        so2.b bVar = this.f406110d;
        if (bVar != null) {
            bVar.f410266e = new java.lang.Long(0L);
        }
        sc2.h1 h1Var = this.f406111e;
        android.widget.TextView textView = h1Var.K;
        in5.s0 s0Var = this.f406112f;
        if (textView != null) {
            textView.setOnClickListener(new sc2.n0(h1Var, s0Var, this.f406113g));
        }
        android.widget.TextView textView2 = h1Var.K;
        if (textView2 != null) {
            textView2.setText(s0Var.f293121e.getString(com.tencent.mm.R.string.nhz));
        }
        android.widget.TextView textView3 = h1Var.K;
        if (textView3 != null) {
            textView3.setTextColor(s0Var.f293121e.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
        return jz5.f0.f302826a;
    }
}
