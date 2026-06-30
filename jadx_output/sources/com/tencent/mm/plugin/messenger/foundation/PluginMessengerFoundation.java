package com.tencent.mm.plugin.messenger.foundation;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class})
/* loaded from: classes11.dex */
public class PluginMessengerFoundation extends i95.w implements vg3.f4 {

    /* renamed from: d, reason: collision with root package name */
    public a95.b f148617d;

    /* renamed from: e, reason: collision with root package name */
    public b95.j f148618e;

    /* renamed from: f, reason: collision with root package name */
    public final qv1.a f148619f = new qv1.a();

    /* renamed from: g, reason: collision with root package name */
    public int f148620g = 0;

    public b95.j Ai() {
        gm0.j1.b().c();
        if (this.f148618e == null) {
            this.f148618e = new b95.j();
        }
        return this.f148618e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if ((r0 == 2) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if ((r0 == 1) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Bi(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.f148620g
            r1 = 0
            if (r0 != 0) goto L6
            goto L2f
        L6:
            boolean r0 = com.tencent.mm.storage.z3.Q4(r6)
            r2 = 1
            if (r0 == 0) goto L1b
            int r0 = r5.f148620g
            r0 = r0 & r2
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r0 != r2) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L2f
        L19:
            r1 = r2
            goto L2f
        L1b:
            boolean r0 = com.tencent.mm.storage.z3.R4(r6)
            if (r0 == 0) goto L2f
            int r0 = r5.f148620g
            r3 = 2
            r0 = r0 & r3
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r0 != r3) goto L2b
            r0 = r2
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 == 0) goto L2f
            goto L19
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            java.lang.String r0 = "MicroMsg.TAG"
            java.lang.String r2 = "ifAddTicketByActionFlag %s %s"
            com.tencent.mars.xlog.Log.i(r0, r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.Bi(java.lang.String):boolean");
    }

    public void Di(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TAG", "setEnSendMsgActionFlag %s", java.lang.Integer.valueOf(i17));
        this.f148620g = i17;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        com.tencent.mm.plugin.zero.a1.f188619b = new pq5.d() { // from class: com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.1
            @Override // pq5.d
            public a25.u get() {
                return new com.tencent.mm.plugin.messenger.foundation.z2();
            }
        };
        com.tencent.mm.plugin.messenger.foundation.v vVar = new com.tencent.mm.plugin.messenger.foundation.v();
        vg3.v4.a(2, vVar);
        vg3.v4.a(17, vVar);
        vg3.v4.a(4, vVar);
        vg3.v4.a(78, new eh3.d());
        vg3.v4.a(7, new com.tencent.mm.plugin.messenger.foundation.g0());
        com.tencent.mm.plugin.messenger.foundation.a2 a2Var = new com.tencent.mm.plugin.messenger.foundation.a2();
        vg3.v4.a(5, a2Var);
        vg3.v4.a(8, a2Var);
        vg3.v4.a(9, a2Var);
        vg3.v4.a(1, new com.tencent.mm.plugin.messenger.foundation.a3());
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.q(rv1.f.class, this.f148619f);
            com.tencent.mm.booter.l lVar = com.tencent.mm.booter.CoreService.f63234v;
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("msg_receive_number");
            long j17 = M.getLong("recv_num", 0L);
            long j18 = M.getLong("send_num", 0L);
            long j19 = j17 - j18;
            if (j19 > 0) {
                M.putLong("send_num", 1 + j17);
                jx3.f.INSTANCE.d(19779, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "checkSyncNum() why?????? diffValue:%s recvNum:%s sendNum:%s", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "checkSyncNum() no problem");
            }
            kotlin.jvm.internal.o.g(context, "context");
            ((ku5.t0) ku5.t0.f312615d).h(new bh3.a(context), "MicroMsg.CheckContactService");
        }
    }

    public a95.b wi() {
        gm0.j1.b().c();
        if (this.f148617d == null) {
            gm0.j1.i();
            this.f148617d = new a95.b(gm0.j1.u().f273153f);
        }
        return this.f148617d;
    }
}
