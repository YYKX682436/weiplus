package l44;

/* loaded from: classes3.dex */
public final class k5 implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f316221a;

    public k5(kotlinx.coroutines.q qVar) {
        this.f316221a = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x001d, B:5:0x0030, B:7:0x0036, B:12:0x0042, B:16:0x004c, B:18:0x005a, B:19:0x005e), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x001d, B:5:0x0030, B:7:0x0036, B:12:0x0042, B:16:0x004c, B:18:0x005a, B:19:0x005e), top: B:2:0x001d }] */
    @Override // com.tencent.mm.plugin.sns.model.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "onCallback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2$1$2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.String r2 = "access$parseAdFinderFollowResult"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "FollowRequestHelper"
            java.lang.String r5 = "parseAdFinderFollowResult, ret="
            java.lang.String r6 = "parseAdFinderFollowResult"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L69
            r8.append(r10)     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L69
            com.tencent.mars.xlog.Log.i(r4, r5)     // Catch: java.lang.Throwable -> L69
            boolean r5 = r10 instanceof java.lang.String     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L33
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L69
            goto L34
        L33:
            r10 = 0
        L34:
            if (r10 == 0) goto L3f
            int r5 = r10.length()     // Catch: java.lang.Throwable -> L69
            if (r5 != 0) goto L3d
            goto L3f
        L3d:
            r5 = r7
            goto L40
        L3f:
            r5 = 1
        L40:
            if (r5 == 0) goto L4c
            java.lang.String r10 = "parseAdFinderFollowResult, null!"
            com.tencent.mars.xlog.Log.w(r4, r10)     // Catch: java.lang.Throwable -> L69
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L4c:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L69
            java.lang.String r10 = "followType"
            int r10 = r5.optInt(r10)     // Catch: java.lang.Throwable -> L69
            r8 = 2
            if (r10 == r8) goto L5e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L5e:
            java.lang.String r10 = "followRet"
            boolean r10 = r5.optBoolean(r10)     // Catch: java.lang.Throwable -> L69
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)     // Catch: java.lang.Throwable -> L69
            r7 = r10
            goto L7f
        L69:
            r10 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "parseAdFinderFollowResult, exp="
            r5.<init>(r8)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            com.tencent.mars.xlog.Log.e(r4, r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
        L7f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)
            kotlinx.coroutines.q r2 = r9.f316221a
            kotlinx.coroutines.r r2 = (kotlinx.coroutines.r) r2
            r2.resumeWith(r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.k5.a(java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2$1$2");
    }
}
