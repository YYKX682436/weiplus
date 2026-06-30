package gk5;

/* loaded from: classes.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f272646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f272647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f272648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(gk5.k1 k1Var, wi5.o oVar, wi5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272646d = k1Var;
        this.f272647e = oVar;
        this.f272648f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gk5.e1(this.f272646d, this.f272647e, this.f272648f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gk5.e1 e1Var = (gk5.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gk5.k1 k1Var = this.f272646d;
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(k1Var.getActivity());
        wi5.o oVar = this.f272647e;
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.bik, (android.view.ViewGroup) oVar.f446332c, false);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(k1Var.getString(com.tencent.mm.R.string.f489925fo));
        inflate.setOnClickListener(new gk5.d1(k1Var, this.f272648f));
        oVar.f446331b.invoke(inflate);
        return jz5.f0.f302826a;
    }
}
