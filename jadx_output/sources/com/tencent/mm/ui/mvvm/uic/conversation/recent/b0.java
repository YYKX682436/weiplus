package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 f209267d;

    public b0(com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var) {
        this.f209267d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC$updateView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var = this.f209267d;
        switch (e0Var.f209307m) {
            case 1:
                j75.f Q6 = e0Var.Q6();
                if (Q6 != null) {
                    Q6.B3(new xi5.e(1));
                    break;
                }
                break;
            case 2:
                j75.f Q62 = e0Var.Q6();
                if (Q62 != null) {
                    Q62.B3(new xi5.e(2));
                    break;
                }
                break;
            case 3:
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) e0Var.getContext(), 1, false);
                k0Var.f211872n = new com.tencent.mm.ui.mvvm.uic.conversation.recent.x(e0Var);
                k0Var.f211881s = new com.tencent.mm.ui.mvvm.uic.conversation.recent.y(e0Var);
                k0Var.v();
                break;
            case 4:
                j75.f Q63 = e0Var.Q6();
                if (Q63 != null) {
                    Q63.B3(new xi5.f());
                    break;
                }
                break;
            case 5:
                j75.f Q64 = e0Var.Q6();
                if (Q64 != null) {
                    Q64.B3(new xi5.d());
                    break;
                }
                break;
            case 6:
                j75.f Q65 = e0Var.Q6();
                if (Q65 != null) {
                    Q65.B3(new xi5.c());
                    break;
                }
                break;
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC$updateView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
