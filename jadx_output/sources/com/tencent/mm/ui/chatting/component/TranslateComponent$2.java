package com.tencent.mm.ui.chatting.component;

/* loaded from: classes4.dex */
class TranslateComponent$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TranslateMessageResultEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ym f198569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslateComponent$2(com.tencent.mm.ui.chatting.component.ym ymVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f198569d = ymVar;
        this.__eventId = -1739498572;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent) {
        com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent2 = translateMessageResultEvent;
        if (translateMessageResultEvent2 instanceof com.tencent.mm.autogen.events.TranslateMessageResultEvent) {
            am.kz kzVar = translateMessageResultEvent2.f54905g;
            java.lang.String str = kzVar.f7196d;
            int i17 = kzVar.f7193a;
            java.lang.String str2 = kzVar.f7198f;
            int i18 = i17 == 5 ? 2000 : 0;
            int i19 = kzVar.f7197e;
            if (i19 == 1 || i19 == 0) {
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.ui.chatting.component.bn(this, i17, translateMessageResultEvent2, str, str2), i18);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.TranslateComponent", "type error, %s", java.lang.Integer.valueOf(i19));
            }
        }
        return false;
    }
}
