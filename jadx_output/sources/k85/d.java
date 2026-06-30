package k85;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f305386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305387g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f305388h;

    public d(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f305384d = activity;
        this.f305385e = g0Var;
        this.f305386f = f0Var;
        this.f305387g = lVar;
        this.f305388h = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k85.t tVar = k85.t.f305439a;
        com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", "[showBusinessPermissionDialogUI] click close " + this.f305384d + ", permission:" + this.f305385e + ", business:" + this.f305386f);
        yz5.l lVar = this.f305387g;
        if (lVar != null) {
            lVar.invoke(2);
        }
        this.f305388h.q();
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
