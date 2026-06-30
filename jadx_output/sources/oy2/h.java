package oy2;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy2.i f349955d;

    public h(oy2.i iVar) {
        this.f349955d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/ad/FinderScrollDialog$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout centerScrollFrameLayout = (com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout) ((oy2.g) this.f349955d).c();
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(centerScrollFrameLayout, centerScrollFrameLayout.peekHeight, false, 0, new oy2.a(centerScrollFrameLayout), 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/ad/FinderScrollDialog$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
