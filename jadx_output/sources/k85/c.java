package k85;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f305377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f305378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f305381i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305382m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305383n;

    public c(yz5.l lVar, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var, android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar2, java.lang.String str) {
        this.f305376d = lVar;
        this.f305377e = c0Var;
        this.f305378f = y1Var;
        this.f305379g = activity;
        this.f305380h = g0Var;
        this.f305381i = f0Var;
        this.f305382m = lVar2;
        this.f305383n = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f305376d;
        if (lVar != null) {
            lVar.invoke(1);
        }
        this.f305377e.f310112d = true;
        this.f305378f.q();
        k85.t tVar = k85.t.f305439a;
        android.app.Activity activity = this.f305379g;
        d85.g0 g0Var = this.f305380h;
        d85.f0 f0Var = this.f305381i;
        k85.t.a(tVar, activity, g0Var, f0Var, new k85.b(activity, g0Var, f0Var, this.f305382m, this.f305376d, this.f305383n));
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
