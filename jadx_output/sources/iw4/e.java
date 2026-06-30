package iw4;

/* loaded from: classes12.dex */
public final class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI f295252d;

    public e(com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI) {
        this.f295252d = sosSimilarUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f295252d.finish();
        return false;
    }
}
