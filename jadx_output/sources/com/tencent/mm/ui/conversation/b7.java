package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class b7 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public long f207480d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f207481e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f207482f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f207483g;

    public b7(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f207483g = mainUI;
    }

    public static void a(com.tencent.mm.ui.conversation.b7 b7Var, int i17) {
        com.tencent.mm.ui.conversation.MainUI mainUI = b7Var.f207483g;
        int firstVisiblePosition = mainUI.f207372o.getFirstVisiblePosition();
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = mainUI.f207372o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(conversationListView, arrayList.toArray(), "com/tencent/mm/ui/conversation/MainUI$3", "scrollToFromTop", "(I)V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
        conversationListView.smoothScrollToPositionFromTop(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(conversationListView, "com/tencent/mm/ui/conversation/MainUI$3", "scrollToFromTop", "(I)V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
        b7Var.f207482f = i17;
        mainUI.f207372o.postOnAnimationDelayed(new com.tencent.mm.ui.conversation.z6(b7Var, firstVisiblePosition, i17), 250L);
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        zr.a aVar = (zr.a) obj;
        int i17 = aVar.f475103a;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.conversation.RepairerConfigConvUnreadMode()) == 1;
        com.tencent.mm.ui.conversation.MainUI mainUI = this.f207483g;
        int i18 = aVar.f475103a;
        int i19 = aVar.f475104b;
        if (!z17) {
            if (i18 == 1) {
                mainUI.f207372o.postDelayed(new com.tencent.mm.ui.conversation.a7(this, java.lang.Integer.valueOf(i19)), 100L);
                return;
            }
            return;
        }
        if (i18 != 2) {
            if (i18 == 1) {
                mainUI.f207372o.postDelayed(new com.tencent.mm.ui.conversation.a7(this, java.lang.Integer.valueOf(i19)), 100L);
                return;
            }
            return;
        }
        fg5.c.f262501a.a(3L, i19, null, mainUI.f207379v);
        yf5.w0 w0Var = (yf5.w0) mainUI.f207379v;
        w0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = w0Var.f461984p;
        if (mvvmList == null) {
            kotlin.jvm.internal.o.o("mvvmList");
            throw null;
        }
        java.util.Iterator it = mvvmList.f152065o.iterator();
        while (it.hasNext()) {
            yf5.x xVar = (yf5.x) it.next();
            if (xVar.f462014z == 2) {
                arrayList.add(xVar);
            }
        }
        yf5.w conversationDataSource = w0Var.d();
        yf5.d dVar = w0Var.f461993y;
        androidx.fragment.app.FragmentActivity context = w0Var.f461975d;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(conversationDataSource, "conversationDataSource");
        com.tencent.mars.xlog.Log.i("MicroMsg.UnreadModeHelper", "openUnreadModeActivity, unreadList count: " + arrayList.size());
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.class);
        ok5.d.b(intent, "conversation_datasource", conversationDataSource, new ok5.f());
        ok5.d.b(intent, "conversation_unread_list", arrayList, new ok5.f());
        com.tencent.mm.ui.conversation.unreadmode.e0.f208129a = new java.lang.ref.WeakReference(dVar);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/conversation/unreadmode/UnreadModeHelper", "openUnreadModeActivity", "(Landroid/content/Context;Lcom/tencent/mm/ui/conversation/adapter/ConversationDataSource;Ljava/util/List;Lcom/tencent/mm/ui/conversation/adapter/ConvListViewPool;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/conversation/unreadmode/UnreadModeHelper", "openUnreadModeActivity", "(Landroid/content/Context;Lcom/tencent/mm/ui/conversation/adapter/ConversationDataSource;Ljava/util/List;Lcom/tencent/mm/ui/conversation/adapter/ConvListViewPool;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
