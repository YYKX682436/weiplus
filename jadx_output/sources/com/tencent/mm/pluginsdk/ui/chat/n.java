package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f190491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f190492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.m f190493f;

    public n(com.tencent.mm.pluginsdk.ui.chat.m mVar, int i17, int i18) {
        this.f190493f = mVar;
        this.f190491d = i17;
        this.f190492e = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7584b = true;
        talkRoomServerEvent.e();
        this.f190493f.f190476a.f189934m.u(this.f190491d, this.f190492e);
        dialogInterface.dismiss();
    }
}
