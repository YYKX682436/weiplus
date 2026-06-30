package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190299d;

    public e9(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var) {
        this.f190299d = h9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190299d;
        android.view.View view = h9Var.f190373s;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$3$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$3$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = h9Var.f190369o;
        if (weImageView != null) {
            weImageView.setIconColor(h9Var.f190360f.getResources().getColor(com.tencent.mm.R.color.aby));
        }
        android.widget.TextView textView = h9Var.f190376v;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = h9Var.f190375u;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }
}
