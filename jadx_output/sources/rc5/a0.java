package rc5;

/* loaded from: classes.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC f394147d;

    public a0(com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC notificationHalfScreenChattingUIC) {
        this.f394147d = notificationHalfScreenChattingUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC notificationHalfScreenChattingUIC = this.f394147d;
        notificationHalfScreenChattingUIC.getIntent().setClass(notificationHalfScreenChattingUIC.getContext(), com.tencent.mm.ui.chatting.ChattingUI.class);
        android.app.Activity context = notificationHalfScreenChattingUIC.getContext();
        android.content.Intent intent = notificationHalfScreenChattingUIC.getIntent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/half/NotificationHalfScreenChattingUIC$getMenuItemClickListener$1$onRealClick$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/half/NotificationHalfScreenChattingUIC$getMenuItemClickListener$1$onRealClick$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
