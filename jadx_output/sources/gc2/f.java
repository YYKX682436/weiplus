package gc2;

/* loaded from: classes10.dex */
public final class f implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView f270406a;

    public f(com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView) {
        this.f270406a = finderRecyclerView;
    }

    @Override // gc2.c
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = this.f270406a;
        int i18 = finderRecyclerView.f105310m2;
        finderRecyclerView.getClass();
        boolean z17 = (i18 == -1 && i17 == 0) ? false : true;
        com.tencent.mars.xlog.Log.i("FinderRecyclerView", "onPageSelected position:" + i17 + ", currentItem:" + finderRecyclerView.f105310m2 + ", needNotify:" + z17);
        if (finderRecyclerView.f105310m2 != i17) {
            finderRecyclerView.f105310m2 = i17;
            gc2.c cVar = finderRecyclerView.f105308k2;
            if (cVar == null || !z17 || cVar == null) {
                return;
            }
            cVar.a(recyclerView, i17);
        }
    }

    @Override // gc2.c
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("FinderRecyclerView", "onPageScrollStateChanged state = " + i17);
        gc2.c cVar = this.f270406a.f105308k2;
        if (cVar != null) {
            cVar.b(recyclerView, i17);
        }
    }

    @Override // gc2.c
    public void c(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, float f17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        gc2.c cVar = this.f270406a.f105308k2;
        if (cVar != null) {
            cVar.c(recyclerView, i17, f17, i18);
        }
    }
}
