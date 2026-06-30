package ui1;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ui1.e0 f428040d;

    public c0(ui1.e0 e0Var) {
        this.f428040d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/permission/jsauth/WMPFVoipCallInScopeAuthNotifyBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f428040d.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/permission/jsauth/WMPFVoipCallInScopeAuthNotifyBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
