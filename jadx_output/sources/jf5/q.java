package jf5;

/* loaded from: classes14.dex */
public final class q implements ul5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299497d;

    public q(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        this.f299497d = nativeSelectableLayout;
    }

    @Override // ul5.j
    public void c(int i17) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299497d;
        nativeSelectableLayout.C = i17;
        if (nativeSelectableLayout.f204669p) {
            nativeSelectableLayout.removeCallbacks(nativeSelectableLayout.H);
            if (nativeSelectableLayout.f204673t == null) {
                nativeSelectableLayout.G = true;
                nativeSelectableLayout.k();
                nativeSelectableLayout.removeCallbacks(nativeSelectableLayout.V);
                if (i17 == 0) {
                    nativeSelectableLayout.postDelayed(nativeSelectableLayout.V, 120L);
                }
            }
            nativeSelectableLayout.v();
        }
    }

    @Override // ul5.j
    public void w(int i17) {
    }
}
