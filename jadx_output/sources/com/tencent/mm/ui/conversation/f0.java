package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f207658d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f207659e;

    /* renamed from: f, reason: collision with root package name */
    public int f207660f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Intent f207661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f207662h;

    public f0(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI, com.tencent.mm.ui.conversation.s sVar) {
        this.f207662h = baseConversationUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "on post select image job, acc has ready, retry count %d", java.lang.Integer.valueOf(this.f207658d));
            com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f207662h;
            str = baseConversationUI.lastRestoreTalker;
            baseConversationUI.startChatting(str);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.e0(this));
            return;
        }
        int i17 = this.f207658d;
        if (i17 >= 3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseConversationUI", "on post select image job, match max retry count");
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseConversationUI", "on post select image job, acc not ready, cur retry count %d", java.lang.Integer.valueOf(i17));
        this.f207658d++;
        com.tencent.mm.sdk.platformtools.u3.i(this, 300L);
    }

    public java.lang.String toString() {
        return super.toString() + "|PostSelectImageJob";
    }
}
