package y54;

/* loaded from: classes4.dex */
public final class x extends k64.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI f459569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI dynamicCanvasPageUI) {
        super(2883);
        this.f459569e = dynamicCanvasPageUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((r7 instanceof r45.dt6) != false) goto L11;
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
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI$updateUxInfo$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "complete update ux info , the error code is "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NetSceneEnd"
            com.tencent.mars.xlog.Log.i(r3, r2)
            if (r6 != 0) goto L56
            boolean r6 = r7 instanceof ib4.n
            if (r6 == 0) goto L56
            r6 = 0
            com.tencent.mm.protobuf.f r7 = k64.t.a(r7)     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r7 instanceof r45.dt6     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2b
            goto L2c
        L2b:
            r7 = r6
        L2c:
            r45.dt6 r7 = (r45.dt6) r7
            if (r7 == 0) goto L32
            java.lang.String r6 = r7.f372746d
        L32:
            if (r6 != 0) goto L36
            java.lang.String r6 = ""
        L36:
            com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI r7 = r5.f459569e
            m54.l r7 = r7.u4()
            r7.getClass()
            java.lang.String r2 = "setUpdatedUxInfo"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            r7.f2862e = r6
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            java.lang.String r7 = "the update ux info is "
            java.lang.String r6 = r7.concat(r6)
            com.tencent.mars.xlog.Log.i(r3, r6)
        L56:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y54.x.b(int, com.tencent.mm.modelbase.m1):void");
    }
}
