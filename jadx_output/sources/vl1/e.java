package vl1;

/* loaded from: classes11.dex */
public class e implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f437790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f437791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vl1.g f437792f;

    public e(vl1.g gVar, androidx.recyclerview.widget.k3 k3Var, int i17) {
        this.f437792f = gVar;
        this.f437790d = k3Var;
        this.f437791e = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        vl1.q qVar = this.f437792f.f437800m;
        if (qVar == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f437790d;
        android.view.View view2 = k3Var.itemView;
        long itemId = k3Var.getItemId();
        int i17 = this.f437791e;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView = ((vl1.m) qVar).f437809a;
        vl1.o oVar = mRecyclerView.f92100d2;
        boolean a17 = oVar != null ? oVar.a(mRecyclerView, view2, i17, itemId) : false;
        yj0.a.i(a17, this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return a17;
    }
}
