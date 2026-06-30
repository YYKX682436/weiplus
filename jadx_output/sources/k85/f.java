package k85;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f305396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305397g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f305398h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f305399i;

    public f(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f305394d = activity;
        this.f305395e = g0Var;
        this.f305396f = f0Var;
        this.f305397g = lVar;
        this.f305398h = c0Var;
        this.f305399i = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k85.t tVar = k85.t.f305439a;
        com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", "[showBusinessPermissionDialogUI] click confirm " + this.f305394d + ", permission:" + this.f305395e + ", business:" + this.f305396f);
        yz5.l lVar = this.f305397g;
        if (lVar != null) {
            lVar.invoke(4);
        }
        this.f305398h.f310112d = true;
        this.f305399i.q();
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
