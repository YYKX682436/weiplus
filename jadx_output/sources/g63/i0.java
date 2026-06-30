package g63;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI f269125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI) {
        super(0);
        this.f269125d = gameLifeConversationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView gameLifeLoadingCoverView = this.f269125d.f141993i;
        if (gameLifeLoadingCoverView == null) {
            kotlin.jvm.internal.o.o("loadingCoverView");
            throw null;
        }
        android.view.View view = gameLifeLoadingCoverView.f141996d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = gameLifeLoadingCoverView.f141997e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
