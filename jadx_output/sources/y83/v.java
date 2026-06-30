package y83;

/* loaded from: classes.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI f460002d;

    public v(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
        this.f460002d = kidsWatchLoginFirstChooseSceneUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent(this.f460002d, (java.lang.Class<?>) com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseHelpUI.class);
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI = this.f460002d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(kidsWatchLoginFirstChooseSceneUI, arrayList2.toArray(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        kidsWatchLoginFirstChooseSceneUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(kidsWatchLoginFirstChooseSceneUI, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
