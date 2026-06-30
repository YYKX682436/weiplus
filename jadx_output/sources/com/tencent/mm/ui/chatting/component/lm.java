package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class lm implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f199449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.sm f199450e;

    public lm(com.tencent.mm.ui.chatting.component.sm smVar, java.lang.Runnable runnable) {
        this.f199450e = smVar;
        this.f199449d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f199449d.run();
        com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = new com.tencent.mm.autogen.events.ExitTrackRoomEvent();
        exitTrackRoomEvent.f54187g.f8176a = this.f199450e.f198580d.x();
        exitTrackRoomEvent.e();
    }
}
