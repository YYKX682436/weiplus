package in5;

/* loaded from: classes.dex */
public final class g1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.c f293056g;

    public g1(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, int i17, android.view.View view, in5.c cVar) {
        this.f293053d = wxRecyclerAdapter;
        this.f293054e = i17;
        this.f293055f = view;
        this.f293056g = cVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f293053d;
        androidx.recyclerview.widget.k3 m07 = wxRecyclerAdapter.b0().m0(view);
        int adapterPosition = m07 != null ? m07.getAdapterPosition() : this.f293054e;
        in5.u uVar = wxRecyclerAdapter.B;
        boolean v17 = uVar != null ? uVar.v(this.f293055f, this.f293056g, adapterPosition) : false;
        yj0.a.i(v17, this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return v17;
    }
}
