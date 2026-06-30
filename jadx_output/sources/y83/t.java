package y83;

/* loaded from: classes14.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI f460000d;

    public t(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
        this.f460000d = kidsWatchLoginFirstChooseSceneUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI = this.f460000d;
        kidsWatchLoginFirstChooseSceneUI.f143131f = 0;
        kidsWatchLoginFirstChooseSceneUI.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
