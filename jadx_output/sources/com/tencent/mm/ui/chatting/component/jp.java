package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class jp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.qp f199321d;

    public jp(com.tencent.mm.ui.chatting.component.qp qpVar) {
        this.f199321d = qpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.qp qpVar = this.f199321d;
        qpVar.f199805q = null;
        java.lang.Long l17 = qpVar.f199804p;
        if (l17 != null) {
            long longValue = l17.longValue();
            qpVar.f199804p = null;
            java.lang.String x17 = qpVar.f198580d.x();
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.ChattingComponent", "[STREAM_TRACE] doPublishMessageUpdate: publishing ChatMsgNotifyEvent, msgId=%d, talker=%s, thread=%s", java.lang.Long.valueOf(longValue), x17, java.lang.Thread.currentThread().getName());
            com.tencent.mm.autogen.events.ChatMsgNotifyEvent chatMsgNotifyEvent = new com.tencent.mm.autogen.events.ChatMsgNotifyEvent();
            am.a2 a2Var = chatMsgNotifyEvent.f54036g;
            a2Var.f6117a = longValue;
            a2Var.f6118b = x17;
            a2Var.f6119c = false;
            chatMsgNotifyEvent.e();
        }
    }
}
