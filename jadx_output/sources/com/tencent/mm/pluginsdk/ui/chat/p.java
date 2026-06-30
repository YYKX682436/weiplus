package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.m f190548d;

    public p(com.tencent.mm.pluginsdk.ui.chat.m mVar) {
        this.f190548d = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7584b = true;
        talkRoomServerEvent.e();
        this.f190548d.f190476a.f189934m.n();
        dialogInterface.dismiss();
    }
}
