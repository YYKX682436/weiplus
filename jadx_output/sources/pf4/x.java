package pf4;

/* loaded from: classes4.dex */
public final class x extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f353906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f353907e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f353908f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f353909g;

    public x(int i17, int i18) {
        this.f353906d = i17;
        this.f353907e = i18;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f353908f.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0362 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[LOOP:1: B:110:0x033f->B:121:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r28, int r29) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pf4.x.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryAdapter", "onCreateViewHolder " + this);
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView storyGalleryItemView = new com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView(context, null, 0);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        layoutParams.width = this.f353906d;
        layoutParams.height = this.f353907e;
        storyGalleryItemView.setLayoutParams(layoutParams);
        return new pf4.y(storyGalleryItemView);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 k3Var) {
        pf4.y holder = (pf4.y) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryAdapter", "onViewAttachedToWindow " + this);
        super.onViewAttachedToWindow(holder);
        holder.i();
    }
}
