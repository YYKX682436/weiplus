package vl1;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f437781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f437782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vl1.g f437783f;

    public b(vl1.g gVar, androidx.recyclerview.widget.k3 k3Var, int i17) {
        this.f437783f = gVar;
        this.f437781d = k3Var;
        this.f437782e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vl1.p pVar = this.f437783f.f437799i;
        if (pVar != null) {
            androidx.recyclerview.widget.k3 k3Var = this.f437781d;
            pVar.a(k3Var.itemView, this.f437782e, k3Var.getItemId());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
