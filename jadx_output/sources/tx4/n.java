package tx4;

/* loaded from: classes8.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView f422704d;

    public n(com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView gameMenuView) {
        this.f422704d = gameMenuView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView gameMenuView = this.f422704d;
        if (gameMenuView.f184773m != null) {
            gameMenuView.f184773m.a((db5.h4) view.getTag());
        }
        tx4.d dVar = gameMenuView.f184774n;
        if (dVar != null) {
            ((tx4.k) dVar).f422691a.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
