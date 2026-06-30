package dt1;

/* loaded from: classes12.dex */
public final class e extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final int f243145i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f243146m;

    /* renamed from: n, reason: collision with root package name */
    public final int f243147n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f243148o;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(long r6, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r5 = this;
            java.lang.String r0 = "session_id"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "from_username"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "to_username"
            kotlin.jvm.internal.o.g(r11, r0)
            r45.fr r0 = new r45.fr
            r0.<init>()
            r1 = 66
            if (r13 != r1) goto L24
            r45.kr r1 = new r45.kr
            r1.<init>()
            r1.f378908d = r12
            r0.f374572x = r1
            goto L2d
        L24:
            r45.gr r1 = new r45.gr
            r1.<init>()
            r1.f375491d = r12
            r0.f374571w = r1
        L2d:
            r0.f374561m = r9
            r0.f374557f = r11
            r0.f374556e = r10
            r0.f374555d = r13
            r5.<init>(r8, r0)
            r5.f243145i = r8
            r5.f243146m = r9
            r5.f243147n = r13
            com.tencent.mm.storage.f9 r10 = new com.tencent.mm.storage.f9
            r10.<init>()
            r5.f243148o = r10
            r0 = 1
            r10.r1(r0)
            r10.u1(r9)
            long r1 = c01.w9.o(r9)
            r10.e1(r1)
            r10.j1(r0)
            r10.d1(r12)
            r10.setType(r13)
            r1 = 0
            int r12 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            if (r12 <= 0) goto L77
            lm0.a r12 = gm0.j1.s(r1)
            vg3.x3 r12 = (vg3.x3) r12
            com.tencent.mm.plugin.messenger.foundation.h2 r12 = (com.tencent.mm.plugin.messenger.foundation.h2) r12
            com.tencent.mm.storage.g9 r12 = r12.cj()
            r12.lb(r6, r10, r0)
            r10.setMsgId(r6)
            goto L88
        L77:
            lm0.a r6 = gm0.j1.s(r1)
            vg3.x3 r6 = (vg3.x3) r6
            com.tencent.mm.plugin.messenger.foundation.h2 r6 = (com.tencent.mm.plugin.messenger.foundation.h2) r6
            com.tencent.mm.storage.g9 r6 = r6.cj()
            r7 = 0
            long r6 = r6.N9(r10, r7)
        L88:
            r10.setMsgId(r6)
            r45.fr r12 = r5.f243125d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = c01.z1.r()
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.w2.a(r1)
            r0.append(r1)
            r0.append(r9)
            r0.append(r6)
            r1 = 95
            r0.append(r1)
            long r1 = r10.getCreateTime()
            r10 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r10
            long r1 = r1 / r3
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            r12.f374558g = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "[CgiBypSendShareCard] bizType="
            r10.<init>(r12)
            r10.append(r8)
            java.lang.String r8 = " msgType="
            r10.append(r8)
            r10.append(r13)
            java.lang.String r8 = " clientId="
            r10.append(r8)
            r10.append(r6)
            java.lang.String r6 = " sessionId="
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = " toUsername="
            r10.append(r6)
            r10.append(r11)
            java.lang.String r6 = r10.toString()
            java.lang.String r7 = "Byp.CgiBypSendShareCard"
            com.tencent.mars.xlog.Log.i(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.e.<init>(long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    @Override // dt1.a
    public long H() {
        return this.f243148o.getMsgId();
    }

    @Override // dt1.a
    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.e("Byp.CgiBypSendShareCard", "[onSendFailed] bizType=" + this.f243145i + " msgType=" + this.f243147n + " sessionId=" + this.f243146m + ", errCode=" + i18);
        com.tencent.mm.storage.f9 f9Var = this.f243148o;
        f9Var.r1(5);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.getMsgId(), f9Var);
    }

    @Override // dt1.a
    public void J(r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.storage.f9 f9Var = this.f243148o;
        f9Var.r1(2);
        f9Var.o1(resp.f385130d);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.getMsgId(), f9Var);
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSendShareCard", "[onSendSuccessfully] bizType=" + this.f243145i + " msgType=" + this.f243147n + " msgSvrId=" + resp.f385130d + " sessionId=" + this.f243146m);
    }
}
