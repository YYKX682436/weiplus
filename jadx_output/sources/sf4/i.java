package sf4;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView f407491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView galleryRecyclerView) {
        super(2);
        this.f407491d = galleryRecyclerView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View child = (android.view.View) obj2;
        kotlin.jvm.internal.o.g(child, "child");
        com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView galleryRecyclerView = this.f407491d;
        galleryRecyclerView.getClass();
        int i17 = galleryRecyclerView.f172049d2;
        galleryRecyclerView.f172049d2 = intValue;
        androidx.recyclerview.widget.RecyclerView recyclerView = galleryRecyclerView.f172048c2;
        sf4.k2 k2Var = (sf4.k2) galleryRecyclerView.w0(child);
        galleryRecyclerView.f172048c2 = k2Var != null ? k2Var.f407521d : null;
        yz5.q qVar = galleryRecyclerView.onRowSelected;
        if (qVar != null) {
            qVar.invoke(java.lang.Integer.valueOf(intValue), galleryRecyclerView.f172048c2, k2Var != null ? k2Var.f407523f : null);
        }
        com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager galleryLayoutManager = (com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager) (recyclerView != null ? recyclerView.getLayoutManager() : null);
        if (galleryRecyclerView.getAdapter() instanceof sf4.k) {
            androidx.recyclerview.widget.f2 adapter = galleryRecyclerView.getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView.VerticalAdapter");
            sf4.k kVar = (sf4.k) adapter;
            int i18 = galleryLayoutManager != null ? galleryLayoutManager.f171877x : 0;
            kVar.f407514f = i17;
            kVar.f407515g = i18;
        }
        return jz5.f0.f302826a;
    }
}
