package vv4;

/* loaded from: classes12.dex */
public final class v0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI f440515d;

    public v0(com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
        this.f440515d = webSearchSnsImageLoadingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI = this.f440515d;
        webSearchSnsImageLoadingUI.finish();
        webSearchSnsImageLoadingUI.T6(11, "", webSearchSnsImageLoadingUI.f181670g, 0, java.lang.System.currentTimeMillis());
        return false;
    }
}
