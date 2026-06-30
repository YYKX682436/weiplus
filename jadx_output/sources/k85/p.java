package k85;

/* loaded from: classes5.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f305427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f305428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f305431h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305432i;

    public p(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var, android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar) {
        this.f305427d = c0Var;
        this.f305428e = y1Var;
        this.f305429f = activity;
        this.f305430g = g0Var;
        this.f305431h = f0Var;
        this.f305432i = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f305427d.f310112d = true;
        this.f305428e.q();
        k85.t tVar = k85.t.f305439a;
        d85.f0 f0Var = this.f305431h;
        yz5.l lVar = this.f305432i;
        android.app.Activity activity = this.f305429f;
        d85.g0 g0Var = this.f305430g;
        k85.t.a(tVar, activity, g0Var, null, new k85.o(activity, g0Var, f0Var, lVar));
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
