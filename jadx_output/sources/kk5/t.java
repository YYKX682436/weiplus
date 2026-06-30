package kk5;

/* loaded from: classes.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f308684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk5.w f308685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.o f308686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f308687g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z17, kk5.w wVar, wi5.o oVar, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308684d = z17;
        this.f308685e = wVar;
        this.f308686f = oVar;
        this.f308687g = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kk5.t(this.f308684d, this.f308685e, this.f308686f, this.f308687g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk5.t tVar = (kk5.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f308684d;
        wi5.o oVar = this.f308686f;
        kk5.w wVar = this.f308685e;
        if (z17) {
            android.view.View inflate = com.tencent.mm.ui.id.b(wVar.getActivity()).inflate(com.tencent.mm.R.layout.bik, (android.view.ViewGroup) oVar.f446332c, false);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(wVar.getString(com.tencent.mm.R.string.f489910f6));
            inflate.setOnClickListener(new kk5.r(wVar));
            oVar.f446331b.invoke(inflate);
        }
        if (this.f308687g) {
            android.view.View inflate2 = com.tencent.mm.ui.id.b(wVar.getActivity()).inflate(com.tencent.mm.R.layout.bik, (android.view.ViewGroup) oVar.f446332c, false);
            ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(wVar.getString(com.tencent.mm.R.string.jbu));
            inflate2.setOnClickListener(new kk5.s(wVar));
            oVar.f446331b.invoke(inflate2);
        }
        return jz5.f0.f302826a;
    }
}
