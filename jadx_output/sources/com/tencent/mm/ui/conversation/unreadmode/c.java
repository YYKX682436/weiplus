package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208114d;

    public c(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI) {
        this.f208114d = unreadConversationFmUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = this.f208114d;
        androidx.fragment.app.FragmentActivity activity = unreadConversationFmUI.getActivity();
        if ((activity == null || activity.isFinishing()) ? false : true) {
            androidx.fragment.app.FragmentActivity activity2 = unreadConversationFmUI.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            androidx.fragment.app.FragmentActivity activity3 = unreadConversationFmUI.getActivity();
            if (activity3 != null) {
                activity3.overridePendingTransition(0, 0);
            }
        }
    }
}
