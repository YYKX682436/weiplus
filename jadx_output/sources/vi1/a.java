package vi1;

/* loaded from: classes7.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.f f437264d;

    public a(vi1.f fVar) {
        this.f437264d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.f fVar = this.f437264d;
        vi1.c cVar = fVar.f437315v;
        if (cVar != null) {
            vi1.c.a(cVar, 2, false, 2, null);
        }
        fl1.g2 g2Var = fVar.f437314u;
        if (g2Var != null) {
            g2Var.a(fVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
