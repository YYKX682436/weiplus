package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190245d;

    public c9(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var) {
        this.f190245d = h9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190245d;
        android.view.View view = h9Var.f190374t;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$triggerModelChange$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = h9Var.f190369o;
        if (weImageView != null) {
            weImageView.setIconColor(h9Var.f190360f.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        android.widget.TextView textView = h9Var.f190376v;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = h9Var.f190376v;
        if (textView2 != null) {
            textView2.setText(h9Var.f190360f.getString(com.tencent.mm.R.string.nku));
        }
        android.widget.TextView textView3 = h9Var.f190376v;
        if (textView3 != null) {
            textView3.setTextColor(h9Var.f190360f.getColor(com.tencent.mm.R.color.Red_100));
        }
        android.widget.TextView textView4 = h9Var.f190375u;
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(8);
    }
}
