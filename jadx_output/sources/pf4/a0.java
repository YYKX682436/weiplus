package pf4;

/* loaded from: classes4.dex */
public final class a0 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f353836d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f353837e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f353838f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f353839g;

    /* renamed from: h, reason: collision with root package name */
    public nf4.j f353840h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f353841i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f353842m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f353843n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f353844o;

    public a0(boolean z17, java.util.ArrayList visitors, java.util.ArrayList comments, java.util.ArrayList pages, int i17, kotlin.jvm.internal.i iVar) {
        visitors = (i17 & 2) != 0 ? new java.util.ArrayList() : visitors;
        comments = (i17 & 4) != 0 ? new java.util.ArrayList() : comments;
        pages = (i17 & 8) != 0 ? new java.util.ArrayList() : pages;
        kotlin.jvm.internal.o.g(visitors, "visitors");
        kotlin.jvm.internal.o.g(comments, "comments");
        kotlin.jvm.internal.o.g(pages, "pages");
        this.f353836d = z17;
        this.f353837e = visitors;
        this.f353838f = comments;
        this.f353839g = pages;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object view) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(view, "view");
        container.removeView((android.view.View) view);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f353839g.size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        boolean z17 = this.f353836d;
        java.util.ArrayList arrayList = this.f353837e;
        java.util.ArrayList arrayList2 = this.f353838f;
        java.util.ArrayList arrayList3 = this.f353839g;
        if (z17) {
            if (i17 == 0) {
                com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17);
                int i18 = com.tencent.mm.plugin.story.ui.view.StoryMsgListView.f172000o;
                storyMsgListView.b(0, arrayList2, arrayList, this.f353840h);
                ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnBlankClick(this.f353842m);
                ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnContentTopOverScroll(this.f353843n);
                ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnContentTopOverScrollStop(this.f353844o);
            } else {
                ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnCommentItemClick(this.f353841i);
                ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnBlankClick(this.f353842m);
                ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnContentTopOverScroll(this.f353843n);
                ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnContentTopOverScrollStop(this.f353844o);
                com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView2 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17);
                int i19 = com.tencent.mm.plugin.story.ui.view.StoryMsgListView.f172000o;
                storyMsgListView2.b(1, arrayList2, arrayList, this.f353840h);
            }
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView3 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17);
            int c17 = com.tencent.mm.ui.bl.c(container.getContext()) + com.tencent.mm.ui.zk.a(container.getContext(), 48) + com.tencent.mm.ui.zk.a(container.getContext(), 24);
            android.view.ViewGroup.LayoutParams layoutParams = storyMsgListView3.f172001d.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c17;
            storyMsgListView3.requestLayout();
        } else {
            ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnCommentItemClick(this.f353841i);
            ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnBlankClick(this.f353842m);
            ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnContentTopOverScroll(this.f353843n);
            ((com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17)).setOnContentTopOverScrollStop(this.f353844o);
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView4 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17);
            int i27 = com.tencent.mm.plugin.story.ui.view.StoryMsgListView.f172000o;
            storyMsgListView4.b(1, arrayList2, arrayList, this.f353840h);
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView5 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(i17);
            int c18 = com.tencent.mm.ui.bl.c(container.getContext()) + com.tencent.mm.ui.zk.a(container.getContext(), 24);
            android.view.ViewGroup.LayoutParams layoutParams2 = storyMsgListView5.f172001d.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = c18;
            storyMsgListView5.requestLayout();
        }
        container.addView((android.view.View) arrayList3.get(i17));
        java.lang.Object obj = arrayList3.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return obj;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(obj, "obj");
        return kotlin.jvm.internal.o.b(view, obj);
    }
}
