package vi1;

/* loaded from: classes5.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.y1 f437418d;

    public o1(vi1.y1 y1Var) {
        this.f437418d = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.y1 y1Var = this.f437418d;
        if (y1Var.A.size() == 1) {
            y1Var.F.invoke();
        } else {
            y1Var.G.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
