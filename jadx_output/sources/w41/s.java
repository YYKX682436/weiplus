package w41;

/* loaded from: classes4.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f442884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f442885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f442886f;

    public s(android.view.ViewGroup viewGroup, k41.g0 g0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f442884d = viewGroup;
        this.f442885e = g0Var;
        this.f442886f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewGroup viewGroup = this.f442884d;
        android.content.Context context = viewGroup.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            j35.u.j(activity, 0, new w41.r(viewGroup, this.f442885e, this.f442886f), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}, null, null);
        }
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
