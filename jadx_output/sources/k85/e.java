package k85;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f305391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305392g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f305393h;

    public e(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f305389d = activity;
        this.f305390e = g0Var;
        this.f305391f = f0Var;
        this.f305392g = lVar;
        this.f305393h = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k85.t tVar = k85.t.f305439a;
        com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", "[showBusinessPermissionDialogUI] click cancel " + this.f305389d + ", permission:" + this.f305390e + ", business:" + this.f305391f);
        yz5.l lVar = this.f305392g;
        if (lVar != null) {
            lVar.invoke(3);
        }
        this.f305393h.q();
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
