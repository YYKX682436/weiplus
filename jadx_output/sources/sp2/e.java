package sp2;

/* loaded from: classes2.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f411017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI f411018e;

    public e(android.view.View view, com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI finderLiveSquareNewEntranceUI) {
        this.f411017d = view;
        this.f411018e = finderLiveSquareNewEntranceUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f411017d.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = com.tencent.mm.ui.bl.h(this.f411018e);
        }
    }
}
