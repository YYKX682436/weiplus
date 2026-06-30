package com.tencent.mm.ui.chatting.component;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class RemittanceSearchComponent$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.sj f198566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemittanceSearchComponent$1(com.tencent.mm.ui.chatting.component.sj sjVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f198566d = sjVar;
        this.__eventId = -477523102;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent scrollChattingUIConversationListEvent) {
        com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent scrollChattingUIConversationListEvent2 = scrollChattingUIConversationListEvent;
        am.gt gtVar = scrollChattingUIConversationListEvent2.f54743g;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.RemittanceSearchComponent", "ScrollChattingUIConversationList: %s, %s", gtVar.f6788a, java.lang.Long.valueOf(gtVar.f6789b));
        com.tencent.mm.ui.chatting.component.sj sjVar = this.f198566d;
        sjVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = currentTimeMillis - sjVar.f199941e < 1200;
        sjVar.f199941e = currentTimeMillis;
        if (!z17) {
            sjVar.f198580d.f460721p = true;
            sb5.y yVar = new sb5.y();
            yVar.f405596a = true;
            sb5.z zVar = (sb5.z) sjVar.f198580d.f460708c.a(sb5.z.class);
            am.gt gtVar2 = scrollChattingUIConversationListEvent2.f54743g;
            ((com.tencent.mm.ui.chatting.adapter.k) zVar).T0(gtVar2.f6790c, gtVar2.f6789b, hd5.n.ACTION_POSITION, yVar);
            if (sjVar.f198580d.p() != null) {
                sjVar.f198580d.p().postDelayed(new com.tencent.mm.ui.chatting.component.rj(this), 220L);
            }
        }
        return false;
    }
}
