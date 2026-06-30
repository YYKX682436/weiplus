package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class e implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f197960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197961e;

    public e(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI, long j17) {
        this.f197961e = bizChatConversationFmUI;
        this.f197960d = j17;
    }

    @Override // c01.da
    public boolean a() {
        return this.f197961e.f197907q;
    }

    @Override // c01.da
    public void c() {
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197961e;
        if (bizChatConversationFmUI.f197900g != null) {
            s01.m Ui = r01.q3.Ui();
            long j17 = this.f197960d;
            Ui.y0(j17);
            r01.q3.aj().D0(j17);
            if (r01.q3.aj().P0(bizChatConversationFmUI.f197903m) <= 0) {
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(bizChatConversationFmUI.f197903m);
            }
            bizChatConversationFmUI.f197900g.dismiss();
        }
    }
}
