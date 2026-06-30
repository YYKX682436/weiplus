package cy2;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView f224745d;

    public e(com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView finderWhatsNewView) {
        this.f224745d = finderWhatsNewView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/whatnews/FinderWhatsNewView$onAttachedToWindow$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView finderWhatsNewView = this.f224745d;
        finderWhatsNewView.animate().alpha(0.0f).setDuration(300L).setListener(new cy2.d(finderWhatsNewView, view)).start();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/whatnews/FinderWhatsNewView$onAttachedToWindow$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
