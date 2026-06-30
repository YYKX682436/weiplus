package xw2;

/* loaded from: classes2.dex */
public final class f extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457690d;

    public f(xw2.s sVar) {
        this.f457690d = sVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/base/PagerRowView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kotlinx.coroutines.flow.h3 h3Var;
        java.lang.Object value;
        int i19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/base/PagerRowView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        xw2.s sVar = this.f457690d;
        int itemCount = sVar.f457721i.getItemCount();
        int y17 = sVar.f457721i.y();
        kotlinx.coroutines.flow.j2 j2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.h00) sVar.getViewModel()).f134568f;
        do {
            h3Var = (kotlinx.coroutines.flow.h3) j2Var;
            value = h3Var.getValue();
            xw2.t tVar = (xw2.t) value;
            i19 = tVar.f457726c;
            tVar.getClass();
        } while (!h3Var.j(value, new xw2.t(itemCount, y17, i19)));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
