package com.tencent.mm.ui.chatting.component;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class VoiceComponent$3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ro f198577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceComponent$3(com.tencent.mm.ui.chatting.component.ro roVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f198577d = roVar;
        this.__eventId = -1397503360;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent voiceMsgDownloadFinishEvent) {
        java.lang.Object valueOf;
        com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent voiceMsgDownloadFinishEvent2 = voiceMsgDownloadFinishEvent;
        if (voiceMsgDownloadFinishEvent2 != null) {
            if (this.f198577d.f199871n.containsKey(java.lang.Long.valueOf(voiceMsgDownloadFinishEvent2.f54936g.f7590a))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "voice msg(%s) download finish, success:%s, isReDownload:%s", java.lang.Long.valueOf(voiceMsgDownloadFinishEvent2.f54936g.f7590a), java.lang.Boolean.valueOf(voiceMsgDownloadFinishEvent2.f54936g.f7591b), java.lang.Boolean.valueOf(voiceMsgDownloadFinishEvent2.f54936g.f7592c));
                this.f198577d.f199871n.put(java.lang.Long.valueOf(voiceMsgDownloadFinishEvent2.f54936g.f7590a), java.lang.Boolean.FALSE);
                am.p00 p00Var = voiceMsgDownloadFinishEvent2.f54936g;
                boolean z17 = false;
                if (p00Var.f7591b && !p00Var.f7592c) {
                    long j17 = p00Var.f7590a;
                    com.tencent.mm.ui.chatting.component.ro roVar = this.f198577d;
                    long j18 = roVar.f199869i;
                    if (j17 == j18 && roVar.f199868h) {
                        java.lang.ref.WeakReference weakReference = roVar.f199870m;
                        if (weakReference == null || weakReference.get() == null) {
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            objArr[0] = java.lang.Boolean.valueOf(this.f198577d.f199870m == null);
                            java.lang.ref.WeakReference weakReference2 = this.f198577d.f199870m;
                            if (weakReference2 == null) {
                                valueOf = "null";
                            } else {
                                valueOf = java.lang.Boolean.valueOf(weakReference2.get() == null);
                            }
                            objArr[1] = valueOf;
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.VoiceComponent", "autoPlayDownloadView:%s view:%s", objArr);
                        } else {
                            int j19 = this.f198577d.f198580d.j() - this.f198577d.f198580d.m();
                            int o17 = this.f198577d.f198580d.o() - this.f198577d.f198580d.m();
                            sb5.z zVar = (sb5.z) this.f198577d.f198580d.f460708c.a(sb5.z.class);
                            while (true) {
                                if (j19 <= o17) {
                                    com.tencent.mm.storage.f9 item = ((com.tencent.mm.ui.chatting.adapter.k) zVar).getItem(j19);
                                    if (item != null && item.getMsgId() == voiceMsgDownloadFinishEvent2.f54936g.f7590a) {
                                        z17 = true;
                                        break;
                                    }
                                    j19++;
                                } else {
                                    break;
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "msgId:%s showInScreen:%s", java.lang.Long.valueOf(voiceMsgDownloadFinishEvent2.f54936g.f7590a), java.lang.Boolean.valueOf(z17));
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.VoiceComponent", "autoPlayDownloadMsgId:%s canAutoPlayDownloadVoice:%s", java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(this.f198577d.f199868h));
                    }
                }
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.component.wo(this, z17));
            } else if (voiceMsgDownloadFinishEvent2.f54936g.f7591b) {
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.VoiceComponent$3$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.ui.chatting.component.VoiceComponent$3.this.f198577d.f198580d.J();
                    }
                });
            }
        }
        return true;
    }
}
