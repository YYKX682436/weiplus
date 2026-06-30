package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent f154745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.NewContactWidgetNormal$25 f154746e;

    public z0(com.tencent.mm.plugin.profile.NewContactWidgetNormal$25 newContactWidgetNormal$25, com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent chatroomMemberInviteerUpdatedEvent) {
        this.f154746e = newContactWidgetNormal$25;
        this.f154745d = chatroomMemberInviteerUpdatedEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent chatroomMemberInviteerUpdatedEvent = this.f154745d;
        java.lang.String str = chatroomMemberInviteerUpdatedEvent.f54042g.f6730b;
        com.tencent.mm.plugin.profile.NewContactWidgetNormal$25 newContactWidgetNormal$25 = this.f154746e;
        newContactWidgetNormal$25.f153380d.f153420d.getIntent().putExtra("inviteer", str);
        java.lang.String f17 = com.tencent.mm.plugin.profile.n2.f(newContactWidgetNormal$25.f153380d.f153431r, chatroomMemberInviteerUpdatedEvent.f54042g.f6730b);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "[ChatroomMemberInviterUpdatedEvent callback] inviter:%s inviterDisplayName:%s", str, f17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            com.tencent.mm.plugin.profile.e0 e0Var = newContactWidgetNormal$25.f153380d;
            e0Var.r(e0Var.f153422f, e0Var.f153420d, str, f17, e0Var.f153421e, e0Var.f153431r);
            return;
        }
        ((java.util.LinkedList) newContactWidgetNormal$25.f153380d.f153435v).add(str);
        c01.p8 a17 = c01.n8.a();
        com.tencent.mm.plugin.profile.e0 e0Var2 = newContactWidgetNormal$25.f153380d;
        ((c01.k7) a17).g(str, e0Var2.f153432s, r35.s.a(java.lang.Integer.valueOf(e0Var2.f153423g)), new com.tencent.mm.plugin.profile.y0(this, str));
    }
}
