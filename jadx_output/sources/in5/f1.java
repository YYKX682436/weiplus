package in5;

/* loaded from: classes.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.c f293047g;

    public f1(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, int i17, android.view.View view, in5.c cVar) {
        this.f293044d = wxRecyclerAdapter;
        this.f293045e = i17;
        this.f293046f = view;
        this.f293047g = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f293044d;
        androidx.recyclerview.widget.k3 m07 = wxRecyclerAdapter.b0().m0(view);
        int adapterPosition = m07 != null ? m07.getAdapterPosition() : this.f293045e;
        in5.u uVar = wxRecyclerAdapter.B;
        if (uVar != null) {
            uVar.g(this.f293046f, this.f293047g, adapterPosition);
        }
        yj0.a.h(this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
