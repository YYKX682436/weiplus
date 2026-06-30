package o54;

/* loaded from: classes4.dex */
public final class h implements p64.b {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f343150d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static q64.b f343151e;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r2 != true) goto L15;
     */
    @Override // p64.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle a(q64.b r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "onServerCall"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            q64.b r2 = o54.h.f343151e
            r3 = 0
            if (r2 == 0) goto L38
            java.lang.String r4 = "access$isAlive"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.String r6 = "isAlive"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            r64.b r2 = (r64.b) r2     // Catch: java.lang.Throwable -> L2d
            k55.e r2 = r2.d()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2d
            android.os.IBinder r2 = r2.asBinder()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2d
            boolean r2 = r2.isBinderAlive()     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r2 = r3
        L2e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r4 = 1
            if (r2 != r4) goto L38
            goto L39
        L38:
            r4 = r3
        L39:
            java.lang.String r2 = "AdLandingIPCCall"
            if (r4 != 0) goto L45
            o54.h.f343151e = r9
            java.lang.String r4 = "onServerCall() get callback binder!"
            com.tencent.mars.xlog.Log.i(r2, r4)
        L45:
            r4 = 0
            if (r10 == 0) goto L76
            java.lang.String r5 = "obj"
            android.os.Parcelable r5 = r10.getParcelable(r5)     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto L52
            goto L76
        L52:
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L74
            java.util.Map r7 = o54.h.f343150d     // Catch: java.lang.Throwable -> L74
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7     // Catch: java.lang.Throwable -> L74
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L74
            yz5.l r6 = (yz5.l) r6     // Catch: java.lang.Throwable -> L74
            if (r6 != 0) goto L6a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> L74
            return r4
        L6a:
            r6.invoke(r5)     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "onServerCall() call success~"
            com.tencent.mars.xlog.Log.i(r2, r5)     // Catch: java.lang.Throwable -> L74
            goto L81
        L74:
            r5 = move-exception
            goto L7a
        L76:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> L74
            return r4
        L7a:
            java.lang.String r6 = "call with error"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r5, r6, r3)
        L81:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "onServerCall() called with: callbackResponse = "
            r3.<init>(r5)
            r3.append(r9)
            java.lang.String r9 = ", params = "
            r3.append(r9)
            r3.append(r10)
            java.lang.String r9 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o54.h.a(q64.b, android.os.Bundle):android.os.Bundle");
    }
}
