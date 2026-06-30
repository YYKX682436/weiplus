package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f202796d;

    public v5(android.view.View view) {
        this.f202796d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f202796d;
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.bpk);
        if (tag != null && !((java.lang.Boolean) tag).booleanValue()) {
            android.view.View view2 = this.f202796d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/ChattingItemHelper$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f202796d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/ChattingItemHelper$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setTag(com.tencent.mm.R.id.bpk, java.lang.Boolean.TRUE);
    }
}
