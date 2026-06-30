package qd1;

/* loaded from: classes7.dex */
public class n implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.k0 f361663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.l2 f361664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qd1.o f361665f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.j f361666g;

    public n(qd1.j jVar, com.tencent.mm.plugin.appbrand.widget.k0 k0Var, com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var, qd1.o oVar) {
        this.f361666g = jVar;
        this.f361663d = k0Var;
        this.f361664e = l2Var;
        this.f361665f = oVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        qd1.j jVar = this.f361666g;
        nf.o.a(jVar.f361641e.getF147807d());
        this.f361663d.f91748b.remove(jVar.f361647n);
        com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f361664e;
        if (l2Var != null) {
            l2Var.g(this.f361665f);
        }
    }
}
