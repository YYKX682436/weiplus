package com.tencent.mm.ui.conversation;

/* loaded from: classes5.dex */
public final class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f207484d;

    public b9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f207484d = openImKefuServiceConversationFmUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "clearKefuServiceConversationUnReadCount");
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).b0(this.f207484d.f207399d);
    }
}
