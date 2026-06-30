package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190198d;

    public b9(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var) {
        this.f190198d = h9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190198d;
        android.view.View view = h9Var.f190373s;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = h9Var.f190373s;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view3 = h9Var.f190371q;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
