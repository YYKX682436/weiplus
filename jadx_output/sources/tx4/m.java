package tx4;

/* loaded from: classes8.dex */
public class m extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView f422703a;

    public m(com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView gameMenuView) {
        this.f422703a = gameMenuView;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView.a(this.f422703a);
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView.a(this.f422703a);
    }
}
