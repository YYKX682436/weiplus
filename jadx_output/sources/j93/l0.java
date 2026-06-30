package j93;

/* loaded from: classes.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f298432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f298433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j93.r0 r0Var, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298432d = r0Var;
        this.f298433e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j93.l0(this.f298432d, this.f298433e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        j93.l0 l0Var = (j93.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        j93.r0 r0Var = this.f298432d;
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(r0Var.getActivity());
        wi5.o oVar = this.f298433e;
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.bik, (android.view.ViewGroup) oVar.f446332c, false);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(r0Var.getString(com.tencent.mm.R.string.f492312mb2));
        inflate.setOnClickListener(new j93.k0(r0Var));
        oVar.f446331b.invoke(inflate);
        return jz5.f0.f302826a;
    }
}
