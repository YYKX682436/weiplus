package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes2.dex */
public class r3 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190596d;

    public r3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190596d = chatFooter;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.View contentView = this.f190596d.M3.getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$70", "onDismiss", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        contentView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(contentView, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$70", "onDismiss", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
