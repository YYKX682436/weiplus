package ir1;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI f293982d;

    public i(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI) {
        this.f293982d = bizFansBlackListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI = this.f293982d;
        android.view.View view2 = bizFansBlackListUI.f93939n;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ListView listView = bizFansBlackListUI.f93932d;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView.setVisibility(4);
        android.view.View view3 = bizFansBlackListUI.f93941p;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bizFansBlackListUI.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
