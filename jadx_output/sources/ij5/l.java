package ij5;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f291781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ij5.t tVar, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291780d = tVar;
        this.f291781e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ij5.l(this.f291780d, this.f291781e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ij5.l lVar = (ij5.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ij5.t tVar = this.f291780d;
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(tVar.getActivity());
        wi5.o oVar = this.f291781e;
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.ccg, (android.view.ViewGroup) oVar.f446332c, false);
        kotlin.jvm.internal.o.d(inflate);
        oVar.f446331b.invoke(inflate);
        java.lang.String str = (java.lang.String) ((jz5.n) tVar.f291806n).getValue();
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_g);
                textView.setVisibility(0);
                textView.setText(str);
            }
        }
        return jz5.f0.f302826a;
    }
}
