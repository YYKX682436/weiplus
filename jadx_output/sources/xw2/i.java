package xw2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f457696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f457697f;

    public i(xw2.s sVar, int i17, int i18) {
        this.f457695d = sVar;
        this.f457696e = i17;
        this.f457697f = i18;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        xw2.s sVar = this.f457695d;
        ((com.tencent.mm.plugin.finder.viewmodel.component.h00) sVar.getViewModel()).getClass();
        java.util.List list = (java.util.List) ((kotlinx.coroutines.flow.h3) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d).getValue();
        int i17 = this.f457696e;
        int i18 = this.f457697f;
        java.lang.Object b17 = xw2.s.b(sVar, list, i17, i18);
        if (b17 == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        xw2.u viewModel = sVar.getViewModel();
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = (com.tencent.mm.plugin.finder.viewmodel.component.h00) viewModel;
        h00Var.getClass();
        h00Var.U6(view, (com.tencent.mm.plugin.finder.viewmodel.component.lz) b17, i17, i18);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
