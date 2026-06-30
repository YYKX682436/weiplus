package rj5;

/* loaded from: classes10.dex */
public final class d extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rj5.e f396379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f396380e;

    public d(rj5.e eVar, kotlin.jvm.internal.f0 f0Var) {
        this.f396379d = eVar;
        this.f396380e = f0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController$installListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f396380e.f310116d = i17;
        rj5.e eVar = this.f396379d;
        if (i17 == 0) {
            eVar.getClass();
            eVar.c(rj5.a.f396371d);
        } else {
            eVar.getClass();
            eVar.c(rj5.a.f396372e);
        }
        yj0.a.h(this, "com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController$installListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController$installListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        rj5.e eVar = this.f396379d;
        float currentPosition = eVar.getCurrentPosition();
        java.util.Iterator it = eVar.f396378c.f209788d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView) it.next()).b(currentPosition);
        }
        if (this.f396380e.f310116d != 0) {
            eVar.c(rj5.a.f396372e);
        }
        yj0.a.h(this, "com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController$installListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
