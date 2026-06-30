package g63;

/* loaded from: classes8.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI f269140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI) {
        super(0);
        this.f269140d = gameLifeConversationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        int i17 = com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI.f141988o;
        com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI = this.f269140d;
        android.view.View f213435x = gameLifeConversationUI.T6().f1753e.getF213435x();
        android.view.View findViewById2 = f213435x != null ? f213435x.findViewById(com.tencent.mm.R.id.ilp) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View f213435x2 = gameLifeConversationUI.T6().f1753e.getF213435x();
        if (f213435x2 != null && (findViewById = f213435x2.findViewById(com.tencent.mm.R.id.f485681im2)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new g63.k0(gameLifeConversationUI));
        }
        return jz5.f0.f302826a;
    }
}
