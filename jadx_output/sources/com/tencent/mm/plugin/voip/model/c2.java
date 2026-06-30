package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class c2 implements android.content.DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        voipEvent.f54945g.f8415b = 8;
        voipEvent.e();
        com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent = new com.tencent.mm.autogen.events.VoipCallingStatusEvent();
        voipCallingStatusEvent.f54942g.f8161d = 8;
        voipCallingStatusEvent.e();
    }
}
