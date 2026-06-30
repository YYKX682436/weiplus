package jf5;

/* loaded from: classes14.dex */
public final class e implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf5.h f299447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299448e;

    public e(jf5.h hVar, com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        this.f299447d = hVar;
        this.f299448e = nativeSelectableLayout;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        jf5.h hVar = this.f299447d;
        hVar.f299460d = null;
        if (hVar.f299461e == this.f299448e) {
            hVar.f299461e = null;
        }
        if (hVar.f299462f) {
            hVar.f299462f = false;
            return;
        }
        yz5.a aVar = hVar.f299463g;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
