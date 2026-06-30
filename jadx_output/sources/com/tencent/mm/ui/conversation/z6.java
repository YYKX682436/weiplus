package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f208306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f208307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b7 f208308f;

    public z6(com.tencent.mm.ui.conversation.b7 b7Var, int i17, int i18) {
        this.f208308f = b7Var;
        this.f208306d = i17;
        this.f208307e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f208306d;
        int i18 = this.f208307e;
        if (i17 != i18) {
            com.tencent.mm.ui.conversation.b7 b7Var = this.f208308f;
            if (b7Var.f207482f != i18) {
                return;
            }
            int firstVisiblePosition = b7Var.f207483g.f207372o.getFirstVisiblePosition();
            if (i17 == firstVisiblePosition && java.lang.Math.abs(i18 - i17) > 2) {
                b7Var.f207483g.f207372o.setSelection(i18);
            } else if (java.lang.Math.abs(firstVisiblePosition - i18) > 2) {
                com.tencent.mm.ui.conversation.ConversationListView conversationListView = b7Var.f207483g.f207372o;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(conversationListView, arrayList.toArray(), "com/tencent/mm/ui/conversation/MainUI$3$1", "run", "()V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
                conversationListView.smoothScrollToPositionFromTop(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(conversationListView, "com/tencent/mm/ui/conversation/MainUI$3$1", "run", "()V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "auto pos result:%d, %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(firstVisiblePosition));
        }
    }
}
