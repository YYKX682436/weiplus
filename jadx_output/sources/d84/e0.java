package d84;

/* loaded from: classes4.dex */
public final class e0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227056d;

    public e0(d84.j0 j0Var) {
        this.f227056d = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:3:0x0019, B:5:0x0025, B:6:0x002b, B:8:0x0037, B:11:0x0049, B:16:0x0055, B:18:0x0061, B:21:0x0069, B:23:0x006f, B:26:0x007f, B:28:0x007c, B:33:0x003d, B:35:0x0043), top: B:2:0x0019 }] */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            java.lang.String r11 = "access$getMDesc"
            java.lang.String r0 = "emit"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$requestDynamicData$1$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            i64.p r10 = (i64.p) r10
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent"
            java.lang.String r3 = "observe numberTitle = "
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            d84.j0 r4 = r9.f227056d
            java.lang.String r5 = r4.j()
            java.lang.String r6 = r4.j()     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r7.<init>(r3)     // Catch: java.lang.Throwable -> Lb0
            r3 = 0
            if (r10 == 0) goto L2a
            java.lang.String r8 = r10.a()     // Catch: java.lang.Throwable -> Lb0
            goto L2b
        L2a:
            r8 = r3
        L2b:
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb0
            com.tencent.mars.xlog.Log.i(r6, r7)     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto L3d
            java.lang.String r10 = r10.a()     // Catch: java.lang.Throwable -> Lb0
            if (r10 != 0) goto L47
        L3d:
            d84.l0 r10 = d84.j0.y(r4)     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto L46
            java.lang.String r10 = r10.f227110i     // Catch: java.lang.Throwable -> Lb0
            goto L47
        L46:
            r10 = r3
        L47:
            if (r10 == 0) goto L52
            int r6 = r10.length()     // Catch: java.lang.Throwable -> Lb0
            if (r6 != 0) goto L50
            goto L52
        L50:
            r6 = 0
            goto L53
        L52:
            r6 = 1
        L53:
            if (r6 != 0) goto Lb4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            android.widget.TextView r6 = r4.M()     // Catch: java.lang.Throwable -> Lb0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            if (r6 == 0) goto L65
            java.lang.CharSequence r3 = r6.getText()     // Catch: java.lang.Throwable -> Lb0
        L65:
            if (r3 != 0) goto L69
            java.lang.String r3 = ""
        L69:
            boolean r3 = kotlin.jvm.internal.o.b(r10, r3)     // Catch: java.lang.Throwable -> Lb0
            if (r3 != 0) goto Lb4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            android.widget.TextView r3 = r4.M()     // Catch: java.lang.Throwable -> Lb0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            if (r3 != 0) goto L7c
            goto L7f
        L7c:
            r3.setText(r10)     // Catch: java.lang.Throwable -> Lb0
        L7f:
            android.content.Context r10 = d84.j0.z(r4)     // Catch: java.lang.Throwable -> Lb0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            android.widget.TextView r3 = r4.M()     // Catch: java.lang.Throwable -> Lb0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r11 = "access$getMTryMaxSizePx$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            float r6 = r4.U     // Catch: java.lang.Throwable -> Lb0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r11 = "access$getMTextContainerWidth$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            int r7 = r4.R     // Catch: java.lang.Throwable -> Lb0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)     // Catch: java.lang.Throwable -> Lb0
            float r11 = (float) r7     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = "access$getMDescTotalHeight$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)     // Catch: java.lang.Throwable -> Lb0
            float r4 = r4.S     // Catch: java.lang.Throwable -> Lb0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)     // Catch: java.lang.Throwable -> Lb0
            ca4.m0.c(r10, r3, r6, r11, r4)     // Catch: java.lang.Throwable -> Lb0
            goto Lb4
        Lb0:
            r10 = move-exception
            ca4.q.c(r5, r10)
        Lb4:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            jz5.f0 r10 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d84.e0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
