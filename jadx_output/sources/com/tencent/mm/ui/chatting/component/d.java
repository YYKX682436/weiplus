package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class d implements qi3.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.f f198914d;

    public d(com.tencent.mm.ui.chatting.component.f fVar) {
        this.f198914d = fVar;
    }

    @Override // qi3.a0
    public void L8(qi3.e0 e0Var) {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = e0Var.f363697g;
        java.lang.String a17 = msgIdTalker != null ? msgIdTalker.a() : "";
        com.tencent.mm.ui.chatting.component.f fVar = this.f198914d;
        if (a17.equals(fVar.f198580d.x())) {
            ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) fVar.f198580d.f460708c.a(sb5.z.class))).Q0();
        }
    }
}
