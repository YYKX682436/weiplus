package m54;

/* loaded from: classes4.dex */
public final class z extends k64.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f324318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f324319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yz5.a aVar, yz5.a aVar2) {
        super(4679);
        this.f324318e = aVar;
        this.f324319f = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if ((r7 instanceof r45.l2) != false) goto L11;
     */
    @Override // k64.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r6, com.tencent.mm.modelbase.m1 r7) {
        /*
            r5 = this;
            java.lang.String r0 = "onResult"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghAntiCheatingUtil$doAntiCheating$1$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r6 != 0) goto L6e
            boolean r6 = r7 instanceof ib4.a
            if (r6 == 0) goto L6e
            r6 = 0
            com.tencent.mm.protobuf.f r7 = k64.t.a(r7)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r7 instanceof r45.l2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            goto L19
        L18:
            r7 = r6
        L19:
            r45.l2 r7 = (r45.l2) r7
            java.lang.String r2 = "SnsAd.VangoghAntiAbuseUtil"
            if (r7 == 0) goto L66
            int r6 = r7.f379083d
            int r7 = r7.f379085f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "the canvasAuthFailed is "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = ", cleanLocalCache is "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r3)
            if (r6 != 0) goto L42
            r6 = 2
            if (r7 != r6) goto L52
        L42:
            yz5.a r6 = r5.f324318e
            if (r6 == 0) goto L49
            r6.invoke()
        L49:
            com.tencent.mm.plugin.report.service.g0 r6 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r3 = 1612(0x64c, float:2.259E-42)
            r4 = 113(0x71, float:1.58E-43)
            r6.A(r3, r4)
        L52:
            if (r7 == 0) goto L64
            yz5.a r6 = r5.f324319f
            if (r6 == 0) goto L5b
            r6.invoke()
        L5b:
            com.tencent.mm.plugin.report.service.g0 r6 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r7 = 2013(0x7dd, float:2.821E-42)
            r3 = 112(0x70, float:1.57E-43)
            r6.A(r7, r3)
        L64:
            jz5.f0 r6 = jz5.f0.f302826a
        L66:
            if (r6 != 0) goto L6e
            java.lang.String r6 = "the response is null, it consider that ad doesn't abuse"
            com.tencent.mars.xlog.Log.e(r2, r6)
        L6e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m54.z.b(int, com.tencent.mm.modelbase.m1):void");
    }
}
