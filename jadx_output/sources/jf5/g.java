package jf5;

/* loaded from: classes14.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jf5.h f299454e;

    public g(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout, jf5.h hVar) {
        this.f299453d = nativeSelectableLayout;
        this.f299454e = hVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299453d;
        java.lang.String selectedText = nativeSelectableLayout.getSelectedText();
        if (menuItem != null) {
            this.f299454e.b(nativeSelectableLayout, menuItem.getItemId(), selectedText);
        }
    }
}
