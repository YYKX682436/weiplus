package jf5;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299509d;

    public t(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        this.f299509d = nativeSelectableLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299509d;
        if (nativeSelectableLayout.f204669p && nativeSelectableLayout.f204673t == null && nativeSelectableLayout.G && nativeSelectableLayout.C == 0) {
            nativeSelectableLayout.G = false;
            nativeSelectableLayout.z();
        }
    }
}
