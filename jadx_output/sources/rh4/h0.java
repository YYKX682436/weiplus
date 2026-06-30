package rh4;

/* loaded from: classes8.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl1.a f395732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl1.n0 f395733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rh4.i0 f395734f;

    public h0(rh4.i0 i0Var, cl1.a aVar, cl1.n0 n0Var) {
        this.f395734f = i0Var;
        this.f395732d = aVar;
        this.f395733e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rh4.i0 i0Var = this.f395734f;
        if (i0Var.f395741d.f172715j2 != null) {
            if (!com.tencent.mm.sdk.platformtools.f9.HomeAppbrandDrawer.k(view.getContext(), null)) {
                yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (i0Var.f395741d.t1()) {
                com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = i0Var.f395741d;
                cl1.n0 n0Var = this.f395733e;
                cl1.a aVar = this.f395732d;
                taskBarSectionWeAppRecyclerView.n1(aVar, view, n0Var, aVar.getAdapterPosition());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
