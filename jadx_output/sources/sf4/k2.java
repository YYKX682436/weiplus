package sf4;

/* loaded from: classes4.dex */
public final class k2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f407521d;

    /* renamed from: e, reason: collision with root package name */
    public final pf4.x f407522e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView f407523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(android.view.View itemView, int i17, int i18) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f487145no2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f407521d = recyclerView;
        pf4.x xVar = new pf4.x(i17, i18);
        this.f407522e = xVar;
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager galleryLayoutManager = new com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager(context, 0);
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.no6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f407523f = (com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView) findViewById2;
        recyclerView.setAdapter(xVar);
        recyclerView.setLayoutManager(galleryLayoutManager);
        recyclerView.setFocusable(false);
        recyclerView.N(new sf4.e(0));
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
        if (o3Var != null) {
            o3Var.f12182g = false;
        }
        recyclerView.setItemViewCacheSize(0);
    }
}
