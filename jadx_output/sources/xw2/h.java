package xw2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f457693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f457694f;

    public h(xw2.s sVar, int i17, int i18) {
        this.f457692d = sVar;
        this.f457693e = i17;
        this.f457694f = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xw2.s sVar = this.f457692d;
        ((com.tencent.mm.plugin.finder.viewmodel.component.h00) sVar.getViewModel()).getClass();
        java.util.List list = (java.util.List) ((kotlinx.coroutines.flow.h3) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d).getValue();
        int i17 = this.f457693e;
        int i18 = this.f457694f;
        java.lang.Object b17 = xw2.s.b(sVar, list, i17, i18);
        if (b17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xw2.u viewModel = sVar.getViewModel();
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = (com.tencent.mm.plugin.finder.viewmodel.component.h00) viewModel;
        h00Var.getClass();
        h00Var.T6(view, (com.tencent.mm.plugin.finder.viewmodel.component.lz) b17, i17, i18);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
