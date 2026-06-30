package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class j implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197966d;

    public j(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f197966d = bizChatConversationFmUI;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        r01.x cj6 = r01.q3.cj();
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197966d;
        bizChatConversationFmUI.f197904n = cj6.b1(bizChatConversationFmUI.f197903m).y0();
        int intExtra = bizChatConversationFmUI.thisActivity().getIntent().getIntExtra("biz_chat_from_scene", 7);
        hb5.m mVar = bizChatConversationFmUI.f197901h;
        int count = mVar != null ? mVar.getCount() : -1;
        r01.m y07 = r01.q3.bj().y0(bizChatConversationFmUI.f197904n);
        int i17 = y07 != null ? y07.field_qyUin : 0;
        int i18 = y07 != null ? y07.field_userUin : 0;
        r01.m y08 = r01.q3.bj().y0(bizChatConversationFmUI.f197903m);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12648, bizChatConversationFmUI.f197904n, bizChatConversationFmUI.f197903m, java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(y08 == null ? 0 : y08.field_qyUin), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(y07 != null ? y07.field_wwCorpId : 0L), java.lang.Long.valueOf(y07 != null ? y07.field_wwUserVid : 0L));
        return false;
    }
}
