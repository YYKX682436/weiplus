package vv4;

/* loaded from: classes12.dex */
public final class l0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI f440477d;

    public l0(com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI) {
        this.f440477d = webSearchImageLoadingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI.f181653s;
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI = this.f440477d;
        webSearchImageLoadingUI.T6();
        webSearchImageLoadingUI.finish();
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI2 = this.f440477d;
        webSearchImageLoadingUI2.U6(11, "", webSearchImageLoadingUI2.f181658h, 0, java.lang.System.currentTimeMillis());
        return false;
    }
}
