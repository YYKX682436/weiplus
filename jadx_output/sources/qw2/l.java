package qw2;

/* loaded from: classes10.dex */
public final class l extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f367135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.sticker.StickerEffectView f367136e;

    public l(com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView) {
        this.f367136e = stickerEffectView;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        this.f367135d = arrayList;
        arrayList.add(null);
        arrayList.add(null);
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(obj, "obj");
        container.removeView((android.view.View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView = this.f367136e;
        return i17 == 0 ? stickerEffectView.getContext().getString(com.tencent.mm.R.string.hu_) : stickerEffectView.getContext().getString(com.tencent.mm.R.string.hua);
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        boolean z17 = i17 == 1;
        android.view.View inflate = android.view.LayoutInflater.from(container.getContext()).inflate(com.tencent.mm.R.layout.agd, container, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView = this.f367136e;
        qw2.k kVar = new qw2.k(stickerEffectView, inflate, z17);
        if (z17) {
            stickerEffectView.getMoreDiffCallback();
        } else {
            stickerEffectView.getHistoryDiffCallback();
        }
        this.f367135d.set(i17, kVar);
        androidx.recyclerview.widget.RecyclerView recyclerView = kVar.f367133b;
        container.addView(recyclerView);
        return recyclerView;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(obj, "obj");
        return kotlin.jvm.internal.o.b(view, obj);
    }
}
