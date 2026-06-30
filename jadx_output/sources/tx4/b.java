package tx4;

/* loaded from: classes5.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx4.c f422685d;

    public b(com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton gameMenuImageButton, tx4.c cVar) {
        this.f422685d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuImageButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tx4.c cVar = this.f422685d;
        if (cVar != null) {
            cVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuImageButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
