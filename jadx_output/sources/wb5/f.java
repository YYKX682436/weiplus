package wb5;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f444442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f444443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f444445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wb5.i iVar, wi5.o oVar, java.lang.String str, wi5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444442d = iVar;
        this.f444443e = oVar;
        this.f444444f = str;
        this.f444445g = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wb5.f(this.f444442d, this.f444443e, this.f444444f, this.f444445g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wb5.f fVar = (wb5.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wb5.i iVar = this.f444442d;
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(iVar.getActivity());
        wi5.o oVar = this.f444443e;
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.bik, (android.view.ViewGroup) oVar.f446332c, false);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(this.f444444f);
        inflate.setOnClickListener(new wb5.e(iVar, this.f444445g));
        oVar.f446331b.invoke(inflate);
        return jz5.f0.f302826a;
    }
}
