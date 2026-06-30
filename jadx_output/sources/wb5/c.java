package wb5;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f444436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f444437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wb5.i iVar, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444436d = iVar;
        this.f444437e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wb5.c(this.f444436d, this.f444437e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wb5.c cVar = (wb5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wb5.i iVar = this.f444436d;
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(iVar.getActivity());
        wi5.o oVar = this.f444437e;
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.bik, (android.view.ViewGroup) oVar.f446332c, false);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(iVar.getString(com.tencent.mm.R.string.f489922fj));
        inflate.setOnClickListener(new wb5.a(iVar));
        yz5.l lVar = oVar.f446331b;
        lVar.invoke(inflate);
        android.view.View inflate2 = com.tencent.mm.ui.id.b(iVar.getActivity()).inflate(com.tencent.mm.R.layout.bik, (android.view.ViewGroup) oVar.f446332c, false);
        ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(iVar.getString(com.tencent.mm.R.string.me9));
        inflate2.setOnClickListener(new wb5.b(iVar));
        lVar.invoke(inflate2);
        return jz5.f0.f302826a;
    }
}
