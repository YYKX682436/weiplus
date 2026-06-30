package l44;

/* loaded from: classes3.dex */
public final class f5 implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f316136a;

    public f5(kotlinx.coroutines.q qVar) {
        this.f316136a = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:3:0x0020, B:5:0x0033, B:8:0x003a, B:13:0x0046, B:17:0x0050, B:19:0x005d, B:20:0x0061, B:22:0x0069, B:23:0x007c, B:26:0x0086), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:3:0x0020, B:5:0x0033, B:8:0x003a, B:13:0x0046, B:17:0x0050, B:19:0x005d, B:20:0x0061, B:22:0x0069, B:23:0x007c, B:26:0x0086), top: B:2:0x0020 }] */
    @Override // com.tencent.mm.plugin.sns.model.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "onCallback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getFinderFollowStatus$2$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.String r2 = "access$parseAdFinderIsFollowedData"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "FollowRequestHelper"
            java.lang.String r5 = "parseAdFinderIsFollowedData, err! "
            java.lang.String r6 = "parseAdFinderIsFollowedData, ret="
            java.lang.String r7 = "parseAdFinderIsFollowedData"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            r8 = 0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L8b
            r9.append(r11)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L8b
            com.tencent.mars.xlog.Log.i(r4, r6)     // Catch: java.lang.Throwable -> L8b
            boolean r6 = r11 instanceof java.lang.String     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L36
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L8b
            goto L37
        L36:
            r11 = 0
        L37:
            r6 = 1
            if (r11 == 0) goto L43
            int r9 = r11.length()     // Catch: java.lang.Throwable -> L8b
            if (r9 != 0) goto L41
            goto L43
        L41:
            r9 = r8
            goto L44
        L43:
            r9 = r6
        L44:
            if (r9 == 0) goto L50
            java.lang.String r11 = "parseAdFinderIsFollowedData, null!"
            com.tencent.mars.xlog.Log.w(r4, r11)     // Catch: java.lang.Throwable -> L8b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)     // Catch: java.lang.Throwable -> L8b
            goto La1
        L50:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8b
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r11 = "followType"
            int r11 = r9.optInt(r11)     // Catch: java.lang.Throwable -> L8b
            if (r11 == r6) goto L61
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)     // Catch: java.lang.Throwable -> L8b
            goto La1
        L61:
            java.lang.String r11 = "errCode"
            int r11 = r9.optInt(r11)     // Catch: java.lang.Throwable -> L8b
            if (r11 == 0) goto L7c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L8b
            r6.append(r11)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r11 = r6.toString()     // Catch: java.lang.Throwable -> L8b
            com.tencent.mars.xlog.Log.w(r4, r11)     // Catch: java.lang.Throwable -> L8b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)     // Catch: java.lang.Throwable -> L8b
            goto La1
        L7c:
            java.lang.String r11 = "followFlg"
            int r11 = r9.optInt(r11)     // Catch: java.lang.Throwable -> L8b
            if (r11 == 0) goto L85
            goto L86
        L85:
            r6 = r8
        L86:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)     // Catch: java.lang.Throwable -> L8b
            r8 = r6
            goto La1
        L8b:
            r11 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "parseAdFinderIsFollowedData, exp="
            r5.<init>(r6)
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            com.tencent.mars.xlog.Log.e(r4, r11)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
        La1:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r11 = kotlin.Result.m521constructorimpl(r11)
            kotlinx.coroutines.q r2 = r10.f316136a
            kotlinx.coroutines.r r2 = (kotlinx.coroutines.r) r2
            r2.resumeWith(r11)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.f5.a(java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getFinderFollowStatus$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getFinderFollowStatus$2$1");
    }
}
