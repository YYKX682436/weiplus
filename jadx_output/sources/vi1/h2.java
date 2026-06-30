package vi1;

/* loaded from: classes7.dex */
public final class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.i2 f437327d;

    public h2(vi1.i2 i2Var) {
        this.f437327d = i2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.h0 h0Var = this.f437327d.f437331a;
        if (h0Var != null) {
            vi1.b2 b2Var = (vi1.b2) h0Var;
            vi1.l2 l2Var = vi1.l2.f437401a;
            java.lang.String str = b2Var.f437278b;
            vi1.j2 a17 = l2Var.a(str);
            if (a17 != null) {
                vi1.j2 a18 = l2Var.a(str);
                java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.f437371t) : null;
                kotlin.jvm.internal.o.d(valueOf);
                a17.f437371t = valueOf.longValue() + 1;
            }
            vi1.l1.f437399a.a().Ha(b2Var.f437277a, str, vi1.z1.f437514d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
