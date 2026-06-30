package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes16.dex */
public final class ns extends kotlin.jvm.internal.q implements yz5.l {
    public static final com.tencent.mm.ui.chatting.viewitems.ns C = new com.tencent.mm.ui.chatting.viewitems.ns();

    public ns() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.storage.f9 msg = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(msg.j(), "msg", null);
        boolean z17 = false;
        if (d17 != null && com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.ecs_kf_template_msg_type"), 0) == 1) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
