package y83;

/* loaded from: classes14.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI f460003d;

    public w(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
        this.f460003d = kidsWatchLoginFirstChooseSceneUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI = this.f460003d;
        java.lang.String str = kidsWatchLoginFirstChooseSceneUI.f143132g;
        kotlin.jvm.internal.o.d(str);
        kidsWatchLoginFirstChooseSceneUI.T6(str, kidsWatchLoginFirstChooseSceneUI.f143134i, kidsWatchLoginFirstChooseSceneUI.f143131f);
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
