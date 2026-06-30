package un;

/* loaded from: classes.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.p0 f429309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f429310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f429312g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(un.p0 p0Var, wi5.o oVar, java.lang.String str, wi5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429309d = p0Var;
        this.f429310e = oVar;
        this.f429311f = str;
        this.f429312g = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new un.m0(this.f429309d, this.f429310e, this.f429311f, this.f429312g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        un.m0 m0Var = (un.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        un.p0 p0Var = this.f429309d;
        androidx.appcompat.app.AppCompatActivity activity = p0Var.getActivity();
        wi5.o oVar = this.f429310e;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.c5m, (android.view.ViewGroup) oVar.f446332c, false);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(this.f429311f);
        inflate.setOnClickListener(new un.l0(p0Var, this.f429312g));
        yz5.l lVar = oVar.f446331b;
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        lVar.invoke(inflate);
        return jz5.f0.f302826a;
    }
}
