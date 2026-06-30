package com.tencent.mm.plugin.record.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class TranslateHelper$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TranslateMessageResultEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.l2 f155340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslateHelper$2(com.tencent.mm.plugin.record.ui.l2 l2Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f155340d = l2Var;
        this.__eventId = -1739498572;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent) {
        com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent2 = translateMessageResultEvent;
        if (translateMessageResultEvent2 instanceof com.tencent.mm.autogen.events.TranslateMessageResultEvent) {
            am.kz kzVar = translateMessageResultEvent2.f54905g;
            java.lang.String str = kzVar.f7196d;
            int i17 = kzVar.f7193a;
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.record.ui.k2(this, str, i17, translateMessageResultEvent2), i17 == 5 ? 2000 : 0);
        }
        return false;
    }
}
