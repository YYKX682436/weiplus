package com.tencent.mm.plugin.profile;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class NewContactWidgetNormal$25 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewContactWidgetNormal$25(com.tencent.mm.plugin.profile.e0 e0Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f153380d = e0Var;
        this.__eventId = 896186802;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent chatroomMemberInviteerUpdatedEvent) {
        com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent chatroomMemberInviteerUpdatedEvent2 = chatroomMemberInviteerUpdatedEvent;
        am.g2 g2Var = chatroomMemberInviteerUpdatedEvent2.f54042g;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "[ChatroomMemberInviterUpdatedEvent callback] username:%s inviter:%s", g2Var.f6729a, g2Var.f6730b);
        am.g2 g2Var2 = chatroomMemberInviteerUpdatedEvent2.f54042g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(g2Var2.f6729a) || !g2Var2.f6729a.equals(this.f153380d.f153421e.d1()) || com.tencent.mm.sdk.platformtools.t8.K0(g2Var2.f6730b)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.profile.z0(this, chatroomMemberInviteerUpdatedEvent2));
        return false;
    }
}
