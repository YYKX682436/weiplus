package p53;

/* loaded from: classes8.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.tab.GameTabWidget f352066d;

    public m(com.tencent.mm.plugin.game.ui.tab.GameTabWidget gameTabWidget) {
        this.f352066d = gameTabWidget;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/tab/GameTabWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            com.tencent.mm.plugin.game.ui.tab.GameTabWidget.c(this.f352066d.f141772d, (com.tencent.mm.plugin.game.model.GameTabData.TabItem) view.getTag(), false, false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameTabWidget", "selectTab err:%s", e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/tab/GameTabWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
