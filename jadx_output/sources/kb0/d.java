package kb0;

/* loaded from: classes8.dex */
public final class d extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb0.g f306194d;

    public d(kb0.g gVar) {
        this.f306194d = gVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openway/report/OpenWayListReporter$attach$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        yj0.a.h(this, "com/tencent/mm/feature/openway/report/OpenWayListReporter$attach$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kb0.h hVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openway/report/OpenWayListReporter$attach$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        int w17 = linearLayoutManager != null ? linearLayoutManager.w() : 0;
        int y17 = linearLayoutManager != null ? linearLayoutManager.y() : 0;
        kb0.g gVar = this.f306194d;
        if (w17 <= y17) {
            while (true) {
                com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) kz5.n0.a0(gVar.f306199c, w17);
                if (wVar != null) {
                    gVar.f306205i.add(wVar);
                    if (wVar.f191019i) {
                        gVar.f306206j.add(wVar);
                    }
                }
                if (w17 == y17) {
                    break;
                } else {
                    w17++;
                }
            }
        }
        java.lang.ref.WeakReference weakReference = gVar.f306208l;
        if (weakReference != null && (hVar = (kb0.h) weakReference.get()) != null) {
            ((com.tencent.mm.pluginsdk.ui.otherway.k0) hVar).f190972a.getClass();
        }
        yj0.a.h(this, "com/tencent/mm/feature/openway/report/OpenWayListReporter$attach$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
