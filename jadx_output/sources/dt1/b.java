package dt1;

/* loaded from: classes12.dex */
public final class b extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final int f243129i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f243130m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f243131n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f243132o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.api.IEmojiInfo f243133p;

    /* renamed from: q, reason: collision with root package name */
    public final long f243134q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f243135r;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.tencent.mm.api.IEmojiInfo r11, long r12, java.lang.String r14) {
        /*
            r6 = this;
            java.lang.String r0 = "session_id"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "from_username"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "to_username"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "emoji"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "talker"
            kotlin.jvm.internal.o.g(r14, r0)
            r45.fr r0 = new r45.fr
            r0.<init>()
            r45.ar r1 = new r45.ar
            r1.<init>()
            r0.f374568t = r1
            r0.f374561m = r8
            r0.f374557f = r10
            r0.f374556e = r9
            r1 = 47
            r0.f374555d = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = c01.z1.r()
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.w2.a(r2)
            r1.append(r2)
            r1.append(r8)
            r1.append(r12)
            r2 = 95
            r1.append(r2)
            long r2 = c01.id.c()
            r4 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r4
            long r2 = r2 / r4
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f374558g = r1
            java.lang.String r1 = c01.ia.n()
            r0.f374559h = r1
            r6.<init>(r7, r0)
            r6.f243129i = r7
            r6.f243130m = r8
            r6.f243131n = r9
            r6.f243132o = r10
            r6.f243133p = r11
            r6.f243134q = r12
            r6.f243135r = r14
            r45.fr r7 = r6.f243125d
            r45.ar r7 = r7.f374568t
            java.lang.String r8 = r11.getMd5()
            r7.f370210d = r8
            int r8 = r11.getType()
            r7.f370213g = r8
            int r8 = r11.getSize()
            r7.f370211e = r8
            java.lang.String r8 = r11.j()
            r7.f370214h = r8
            r8 = 0
            r7.f370216m = r8
            pt0.e0 r7 = pt0.f0.f358209b1
            com.tencent.mm.storage.f9 r7 = r7.n(r14, r12)
            if (r7 == 0) goto Lc4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            java.lang.String r9 = r7.j()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.d1(r8)
            java.lang.Class<vg3.x3> r8 = vg3.x3.class
            lm0.a r8 = gm0.j1.s(r8)
            vg3.x3 r8 = (vg3.x3) r8
            com.tencent.mm.plugin.messenger.foundation.h2 r8 = (com.tencent.mm.plugin.messenger.foundation.h2) r8
            com.tencent.mm.storage.g9 r8 = r8.cj()
            r9 = 1
            r8.lb(r12, r7, r9)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.b.<init>(int, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.api.IEmojiInfo, long, java.lang.String):void");
    }

    @Override // dt1.a
    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.e("Byp.CgiBypSendEmoij", "[onSendFailed] bizType=" + this.f243129i + " sessionId=" + this.f243130m + " toUsername=" + this.f243132o + " fromUsername=" + this.f243131n + " errCode:" + i18 + " errMsg:" + str);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String str2 = this.f243135r;
        long j17 = this.f243134q;
        com.tencent.mm.storage.f9 n17 = e0Var.n(str2, j17);
        n17.r1(5);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, n17, true);
    }

    @Override // dt1.a
    public void J(r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSendEmoij", "[onSendSuccessfully] bizType=" + this.f243129i + " msgSvrId=" + resp.f385130d + "  sessionId=" + this.f243130m + " toUsername=" + this.f243132o + " fromUsername=" + this.f243131n);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String str = this.f243135r;
        long j17 = this.f243134q;
        com.tencent.mm.storage.f9 n17 = e0Var.n(str, j17);
        n17.r1(2);
        n17.o1(resp.f385130d);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, n17, true);
    }
}
