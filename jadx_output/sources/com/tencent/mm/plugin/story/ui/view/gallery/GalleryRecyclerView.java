package com.tencent.mm.plugin.story.ui.view.gallery;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001.B!\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b+\u0010,B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b+\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR@\u0010\u0015\u001a \u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R6\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "enabled", "Ljz5/f0;", "setScrollEnable", "Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "b2", "Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "getLayoutManager", "()Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "layoutManager", "Lkotlin/Function3;", "", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "e2", "Lyz5/q;", "getOnRowSelected", "()Lyz5/q;", "setOnRowSelected", "(Lyz5/q;)V", "onRowSelected", "Lkotlin/Function2;", "", "f2", "Lyz5/p;", "getOnScrollCallback", "()Lyz5/p;", "setOnScrollCallback", "(Lyz5/p;)V", "onScrollCallback", "value", "g2", "Z", "isActive", "()Z", "setActive", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sf4/k", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GalleryRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager layoutManager;

    /* renamed from: c2, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f172048c2;

    /* renamed from: d2, reason: collision with root package name */
    public int f172049d2;

    /* renamed from: e2, reason: collision with root package name and from kotlin metadata */
    public yz5.q onRowSelected;

    /* renamed from: f2, reason: collision with root package name and from kotlin metadata */
    public yz5.p onScrollCallback;

    /* renamed from: g2, reason: collision with root package name and from kotlin metadata */
    public boolean isActive;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager galleryLayoutManager = new com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager(context, 1);
        this.layoutManager = galleryLayoutManager;
        setLayoutManager(galleryLayoutManager);
        galleryLayoutManager.f171878y = new sf4.i(this);
        galleryLayoutManager.f171879z = new sf4.j(this);
        N(new sf4.e(1));
        setItemAnimator(null);
        setItemViewCacheSize(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    public final yz5.q getOnRowSelected() {
        return this.onRowSelected;
    }

    public final yz5.p getOnScrollCallback() {
        return this.onScrollCallback;
    }

    public final void setActive(boolean z17) {
        this.isActive = z17;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f172048c2;
        if ((recyclerView != null ? recyclerView.getAdapter() : null) instanceof pf4.x) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f172048c2;
            androidx.recyclerview.widget.f2 adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.adapter.StoryGalleryAdapter");
            ((pf4.x) adapter).f353909g = z17;
        }
    }

    public final void setOnRowSelected(yz5.q qVar) {
        this.onRowSelected = qVar;
    }

    public final void setOnScrollCallback(yz5.p pVar) {
        this.onScrollCallback = pVar;
    }

    public final void setScrollEnable(boolean z17) {
        this.layoutManager.A = z17;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f172048c2;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager) {
            ((com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager) layoutManager).A = z17;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
