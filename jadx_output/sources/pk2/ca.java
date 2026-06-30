package pk2;

/* loaded from: classes3.dex */
public final class ca implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f355636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.da f355637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355638c;

    public ca(kotlin.jvm.internal.c0 c0Var, pk2.da daVar, pk2.o9 o9Var) {
        this.f355636a = c0Var;
        this.f355637b = daVar;
        this.f355638c = o9Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        pk2.d9 d9Var;
        pk2.g8 g8Var;
        il2.r rVar;
        boolean z17 = this.f355636a.f310112d;
        pk2.da daVar = this.f355637b;
        if (z17 && daVar.f355682j && (d9Var = this.f355638c.f356082f) != null && (g8Var = d9Var.f355658a) != null && (rVar = (il2.r) ((pk2.k9) g8Var).f355924a.R6(il2.r.class)) != null) {
            if (rVar.f292083q == null) {
                android.content.Context context = rVar.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                rVar.f292083q = new kl2.n(context, rVar);
            }
            kl2.n nVar = rVar.f292083q;
            if (nVar != null) {
                nVar.w();
            }
        }
        daVar.d();
    }
}
