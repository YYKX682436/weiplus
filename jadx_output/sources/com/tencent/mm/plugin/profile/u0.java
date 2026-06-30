package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class u0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153619e;

    public u0(com.tencent.mm.plugin.profile.e0 e0Var, com.tencent.mm.storage.z3 z3Var) {
        this.f153619e = e0Var;
        this.f153618d = z3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7584b = true;
        talkRoomServerEvent.e();
        com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = new com.tencent.mm.autogen.events.ExitTrackRoomEvent();
        exitTrackRoomEvent.f54187g.f8176a = ((va3.v0) q21.d.b()).f434364v;
        exitTrackRoomEvent.e();
        com.tencent.mm.plugin.profile.e0 e0Var = this.f153619e;
        e0Var.s(this.f153618d, e0Var.f153420d);
        dialogInterface.dismiss();
    }
}
