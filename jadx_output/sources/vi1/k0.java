package vi1;

/* loaded from: classes7.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.l0 f437380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem f437381e;

    public k0(vi1.l0 l0Var, com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem) {
        this.f437380d = l0Var;
        this.f437381e = phoneItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.l0 l0Var = this.f437380d;
        java.util.Iterator it = l0Var.f437398e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it.next()).f87407o = false;
        }
        this.f437381e.f87407o = true;
        l0Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
