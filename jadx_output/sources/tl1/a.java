package tl1;

/* loaded from: classes15.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl1.b f420198d;

    public a(tl1.b bVar) {
        this.f420198d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/picker/AppBrandBottomPicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f420198d.d(true);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandBottomPicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
