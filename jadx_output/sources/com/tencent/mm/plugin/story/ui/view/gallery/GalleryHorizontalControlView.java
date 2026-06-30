package com.tencent.mm.plugin.story.ui.view.gallery;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "Landroid/widget/FrameLayout;", "", "position", "Ljz5/f0;", "setSelection", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GalleryHorizontalControlView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f172044d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f172045e;

    /* renamed from: f, reason: collision with root package name */
    public final pf4.b f172046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryHorizontalControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f172044d = new java.util.ArrayList();
        android.view.View.inflate(context, com.tencent.mm.R.layout.cwj, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nnt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f172045e = recyclerView;
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.story.ui.layout.IndicatorLayoutManager(context, 0, false));
        pf4.b bVar = new pf4.b();
        this.f172046f = bVar;
        recyclerView.setAdapter(bVar);
        recyclerView.setFocusable(false);
        recyclerView.setVisibility(8);
        setPadding(0, 0, 0, com.tencent.mm.ui.bl.c(context));
    }

    public final void a(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        java.util.ArrayList items2 = this.f172044d;
        items2.clear();
        items2.addAll(items);
        pf4.b bVar = this.f172046f;
        bVar.getClass();
        kotlin.jvm.internal.o.g(items2, "items");
        java.util.ArrayList arrayList = bVar.f353846e;
        arrayList.clear();
        arrayList.addAll(items2);
        bVar.notifyDataSetChanged();
        int size = items2.size();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f172045e;
        if (size <= 1) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
        }
    }

    public final void setSelection(int i17) {
        pf4.b bVar = this.f172046f;
        int i18 = bVar.f353845d;
        if (i18 != i17) {
            bVar.notifyItemChanged(i18);
            bVar.f353845d = i17;
            bVar.notifyItemChanged(i17);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f172045e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryHorizontalControlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
