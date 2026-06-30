package zw1;

/* loaded from: classes15.dex */
public class d2 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476604d;

    public d2(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476604d = collectMainUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectMainUI$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476604d;
        collectMainUI.r7(collectMainUI.H1);
        if (collectMainUI.H1 != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20032, "wxface2face", "LongClick", "", "", "", "", 3, java.lang.Integer.valueOf(collectMainUI.H1.f388187d), 0, collectMainUI.g7(), java.lang.Integer.valueOf(collectMainUI.i7()), collectMainUI.h7());
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/collect/ui/CollectMainUI$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
