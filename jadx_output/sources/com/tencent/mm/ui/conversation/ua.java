package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ServiceNotifyConversationUI f208106d;

    public ua(com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI) {
        this.f208106d = serviceNotifyConversationUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.ya yaVar;
        com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI = this.f208106d;
        if (serviceNotifyConversationUI.activityHasDestroyed() || serviceNotifyConversationUI.isFinishing() || (yaVar = serviceNotifyConversationUI.f207417f) == null || serviceNotifyConversationUI.f207416e == null || yaVar.getCount() <= 0) {
            return;
        }
        serviceNotifyConversationUI.f207416e.setSelection(0);
    }
}
