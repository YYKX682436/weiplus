package jf5;

/* loaded from: classes14.dex */
public final class u implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299512a;

    public u(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        this.f299512a = nativeSelectableLayout;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299512a;
        if (nativeSelectableLayout.f204669p) {
            nativeSelectableLayout.removeCallbacks(nativeSelectableLayout.H);
            if (nativeSelectableLayout.f204673t == null) {
                nativeSelectableLayout.G = true;
                nativeSelectableLayout.k();
                nativeSelectableLayout.removeCallbacks(nativeSelectableLayout.V);
                nativeSelectableLayout.postDelayed(nativeSelectableLayout.V, 120L);
            }
            nativeSelectableLayout.v();
        }
    }
}
