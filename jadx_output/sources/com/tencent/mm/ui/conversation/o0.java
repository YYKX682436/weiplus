package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.p0 f207908d;

    public o0(com.tencent.mm.ui.conversation.p0 p0Var) {
        this.f207908d = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            com.tencent.mm.ui.conversation.p0 r0 = r4.f207908d
            com.tencent.mm.ui.conversation.q0 r1 = r0.f207951d
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI r1 = r1.f207991d
            java.lang.String r1 = com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI.access$700(r1)
            boolean r1 = com.tencent.mm.storage.z3.w4(r1)
            if (r1 != 0) goto L89
            com.tencent.mm.ui.conversation.q0 r1 = r0.f207951d
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI r1 = r1.f207991d
            java.lang.String r1 = com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI.access$700(r1)
            boolean r1 = com.tencent.mm.storage.z3.W3(r1)
            if (r1 == 0) goto L1f
            goto L89
        L1f:
            java.lang.Class<rv.u2> r1 = rv.u2.class
            i95.m r2 = i95.n0.c(r1)
            rv.u2 r2 = (rv.u2) r2
            com.tencent.mm.ui.conversation.q0 r3 = r0.f207951d
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI r3 = r3.f207991d
            java.lang.String r3 = com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI.access$700(r3)
            qv.o r2 = (qv.o) r2
            r2.getClass()
            boolean r2 = r01.z.j(r3)
            if (r2 != 0) goto L60
            i95.m r1 = i95.n0.c(r1)
            rv.u2 r1 = (rv.u2) r1
            com.tencent.mm.ui.conversation.q0 r2 = r0.f207951d
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI r2 = r2.f207991d
            java.lang.String r2 = com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI.access$700(r2)
            qv.o r1 = (qv.o) r1
            r1.getClass()
            boolean r1 = r01.z.g(r2)
            if (r1 == 0) goto L54
            goto L60
        L54:
            com.tencent.mm.ui.conversation.q0 r1 = r0.f207951d
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI r1 = r1.f207991d
            java.lang.String r1 = com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI.access$700(r1)
            c01.h2.j(r1)
            goto L9e
        L60:
            s01.g r1 = r01.q3.aj()
            com.tencent.mm.ui.conversation.q0 r2 = r0.f207951d
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI r2 = r2.f207991d
            java.lang.String r2 = com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI.access$700(r2)
            r1.z0(r2)
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r1)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.tencent.mm.plugin.messenger.foundation.h2) r1
            com.tencent.mm.storage.m4 r1 = r1.Di()
            com.tencent.mm.ui.conversation.q0 r2 = r0.f207951d
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI r2 = r2.f207991d
            java.lang.String r2 = com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI.access$700(r2)
            r1.k(r2)
            goto L9e
        L89:
            c01.f r1 = c01.d9.b()
            com.tencent.mm.storage.l8 r1 = r1.r()
            com.tencent.mm.ui.conversation.q0 r2 = r0.f207951d
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI r2 = r2.f207991d
            java.lang.String r2 = com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI.access$700(r2)
            com.tencent.mm.storage.m4 r1 = (com.tencent.mm.storage.m4) r1
            r1.n(r2)
        L9e:
            java.lang.Class<qy.j> r1 = qy.j.class
            i95.m r1 = i95.n0.c(r1)
            qy.j r1 = (qy.j) r1
            xf5.c r1 = (xf5.c) r1
            int r1 = r1.Ai()
            if (r1 != 0) goto Lbd
            c01.f r1 = c01.d9.b()
            com.tencent.mm.storage.l8 r1 = r1.r()
            java.lang.String r2 = "conversationboxservice"
            com.tencent.mm.storage.m4 r1 = (com.tencent.mm.storage.m4) r1
            r1.k(r2)
        Lbd:
            java.lang.Class<de0.j> r1 = de0.j.class
            i95.m r1 = i95.n0.c(r1)
            de0.j r1 = (de0.j) r1
            com.tencent.mm.ui.conversation.q0 r0 = r0.f207951d
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI r0 = r0.f207991d
            java.lang.String r0 = com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI.access$700(r0)
            ce0.e r1 = (ce0.e) r1
            r1.getClass()
            r1 = 14
            com.tencent.mm.modelsimple.g1.I(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.o0.run():void");
    }
}
