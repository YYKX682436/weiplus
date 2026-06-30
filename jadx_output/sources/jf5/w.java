package jf5;

/* loaded from: classes14.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299514d;

    public w(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        this.f299514d = nativeSelectableLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jf5.h hVar;
        yz5.l lVar;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299514d;
        nativeSelectableLayout.B = false;
        jf5.r0 selectionMenuHost = nativeSelectableLayout.getSelectionMenuHost();
        if (selectionMenuHost == null || (lVar = (hVar = (jf5.h) selectionMenuHost).f299459c) == null) {
            return;
        }
        hVar.a();
        lVar.invoke(nativeSelectableLayout);
    }
}
