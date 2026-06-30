package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f207644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207645e;

    public e3(com.tencent.mm.ui.conversation.ConversationListView conversationListView, android.content.res.Configuration configuration) {
        this.f207645e = conversationListView;
        this.f207644d = configuration;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207645e;
        android.content.res.Resources resources = conversationListView.getResources();
        if (com.tencent.mm.ui.bk.A() && (resources instanceof j65.j)) {
            ((j65.j) conversationListView.getResources()).i(this.f207644d);
            int i17 = com.tencent.mm.ui.conversation.ConversationListView.f207310x0;
            conversationListView.i(true);
            conversationListView.g();
        }
        if (com.tencent.mm.ui.bk.C()) {
            int color = conversationListView.getResources().getColor(com.tencent.mm.R.color.f478861j7);
            int color2 = conversationListView.getResources().getColor(com.tencent.mm.R.color.by);
            int i18 = com.tencent.mm.ui.conversation.ConversationListView.f207310x0;
            conversationListView.z(1.0f, color, color2);
        } else {
            int color3 = conversationListView.getResources().getColor(com.tencent.mm.R.color.a07);
            int color4 = conversationListView.getResources().getColor(com.tencent.mm.R.color.f478599bx);
            int i19 = com.tencent.mm.ui.conversation.ConversationListView.f207310x0;
            conversationListView.z(1.0f, color3, color4);
        }
        com.tencent.mm.plugin.taskbar.ui.r rVar = conversationListView.f207318m;
        if (rVar != null) {
            com.tencent.mm.plugin.taskbar.ui.z zVar = (com.tencent.mm.plugin.taskbar.ui.z) rVar;
            zVar.U = zVar.f172762d.getResources().getColor(com.tencent.mm.R.color.f478489a);
        }
        com.tencent.mm.plugin.taskbar.ui.s sVar = conversationListView.f207317i;
        if (sVar != null) {
            ((com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar).h();
        }
        conversationListView.setSelection(1);
        int childCount = conversationListView.getChildCount();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "resetListAlpha first: %d, last: %d", 1, java.lang.Integer.valueOf(childCount));
        for (int i27 = 1; i27 <= childCount; i27++) {
            android.view.View childAt = conversationListView.getChildAt(i27);
            if (childAt != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/conversation/ConversationListView", "resetListAlpha", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(childAt, "com/tencent/mm/ui/conversation/ConversationListView", "resetListAlpha", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }
}
