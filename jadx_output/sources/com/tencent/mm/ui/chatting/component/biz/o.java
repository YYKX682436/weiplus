package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes5.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198811d;

    public o(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198811d = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) r2.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1) == 2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r7 = this;
            com.tencent.mm.ui.chatting.component.biz.a r0 = r7.f198811d
            yb5.d r1 = r0.f198580d
            com.tencent.mm.ui.chatting.manager.c r1 = r1.f460708c
            java.lang.Class<sb5.z> r2 = sb5.z.class
            yn.e r1 = r1.a(r2)
            sb5.z r1 = (sb5.z) r1
            com.tencent.mm.ui.chatting.adapter.k r1 = (com.tencent.mm.ui.chatting.adapter.k) r1
            int r2 = r1.getCount()
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L22
            int r2 = r1.getCount()
            int r2 = r2 - r3
            com.tencent.mm.storage.f9 r1 = r1.getItem(r2)
            goto L23
        L22:
            r1 = r4
        L23:
            if (r1 != 0) goto L39
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r1)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.tencent.mm.plugin.messenger.foundation.h2) r1
            com.tencent.mm.storage.g9 r1 = r1.cj()
            java.lang.String r2 = "notifymessage"
            com.tencent.mm.storage.f9 r1 = r1.q5(r2)
        L39:
            if (r1 != 0) goto L3c
            goto L74
        L3c:
            int r2 = r1.getType()
            r5 = 721420337(0x2b000031, float:4.5475E-13)
            r6 = 2
            if (r2 != r5) goto L48
            r3 = r6
            goto L75
        L48:
            int r2 = r1.getType()
            r5 = 318767153(0x13000031, float:1.6155966E-27)
            if (r2 != r5) goto L74
            java.lang.String r2 = r1.j()
            java.lang.String r5 = "msg"
            java.util.Map r2 = com.tencent.mm.sdk.platformtools.aa.d(r2, r5, r4)
            if (r2 == 0) goto L74
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L64
            goto L74
        L64:
            java.lang.String r4 = ".msg.appmsg.mmreader.category.item.template_op_type"
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            r4 = -1
            int r2 = com.tencent.mm.sdk.platformtools.t8.P(r2, r4)
            if (r2 != r6) goto L74
            goto L75
        L74:
            r3 = 0
        L75:
            if (r1 == 0) goto L7c
            long r1 = r1.I0()
            goto L7e
        L7c:
            r1 = 0
        L7e:
            com.tencent.mm.plugin.report.service.g0 r4 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            long r5 = r0.f198751p
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            r1 = 20567(0x5057, float:2.882E-41)
            r4.d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.biz.o.run():void");
    }
}
