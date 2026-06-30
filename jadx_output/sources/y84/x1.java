package y84;

/* loaded from: classes4.dex */
public final class x1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460223d;

    public x1(y84.h3 h3Var) {
        this.f460223d = h3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #0 {all -> 0x00e3, blocks: (B:3:0x001b, B:5:0x0027, B:6:0x002d, B:8:0x0039, B:11:0x004b, B:16:0x0057, B:18:0x005f, B:20:0x0070, B:23:0x0078, B:25:0x007e, B:28:0x0099, B:30:0x0096, B:35:0x003f, B:37:0x0045), top: B:2:0x001b }] */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            java.lang.String r12 = "getMDesc"
            java.lang.String r0 = "access$getMDesc"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent"
            java.lang.String r2 = "emit"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$requestDynamicData$1$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            i64.p r11 = (i64.p) r11
            java.lang.String r4 = "observe numberTitle = "
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            y84.h3 r5 = r10.f460223d
            java.lang.String r6 = r5.j()
            java.lang.String r7 = r5.j()     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Le3
            r4 = 0
            if (r11 == 0) goto L2c
            java.lang.String r9 = r11.a()     // Catch: java.lang.Throwable -> Le3
            goto L2d
        L2c:
            r9 = r4
        L2d:
            r8.append(r9)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Le3
            com.tencent.mars.xlog.Log.i(r7, r8)     // Catch: java.lang.Throwable -> Le3
            if (r11 == 0) goto L3f
            java.lang.String r11 = r11.a()     // Catch: java.lang.Throwable -> Le3
            if (r11 != 0) goto L49
        L3f:
            y84.l3 r11 = y84.h3.E(r5)     // Catch: java.lang.Throwable -> Le3
            if (r11 == 0) goto L48
            java.lang.String r11 = r11.f460141h     // Catch: java.lang.Throwable -> Le3
            goto L49
        L48:
            r11 = r4
        L49:
            if (r11 == 0) goto L54
            int r7 = r11.length()     // Catch: java.lang.Throwable -> Le3
            if (r7 != 0) goto L52
            goto L54
        L52:
            r7 = 0
            goto L55
        L54:
            r7 = 1
        L55:
            if (r7 != 0) goto Le7
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            jz5.g r7 = r5.T
            r8 = r7
            jz5.n r8 = (jz5.n) r8     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> Le3
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Le3
            if (r8 == 0) goto L74
            java.lang.CharSequence r4 = r8.getText()     // Catch: java.lang.Throwable -> Le3
        L74:
            if (r4 != 0) goto L78
            java.lang.String r4 = ""
        L78:
            boolean r4 = kotlin.jvm.internal.o.b(r11, r4)     // Catch: java.lang.Throwable -> Le3
            if (r4 != 0) goto Le7
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            r4 = r7
            jz5.n r4 = (jz5.n) r4     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Le3
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Le3
            if (r4 != 0) goto L96
            goto L99
        L96:
            r4.setText(r11)     // Catch: java.lang.Throwable -> Le3
        L99:
            java.lang.String r11 = "access$getMContext$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r1)     // Catch: java.lang.Throwable -> Le3
            android.content.Context r4 = r5.f460107y     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            jz5.n r7 = (jz5.n) r7     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> Le3
            android.widget.TextView r11 = (android.widget.TextView) r11     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r12 = "access$getMDescTextSize"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r0 = "getMDescTextSize"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Le3
            jz5.g r7 = r5.A0     // Catch: java.lang.Throwable -> Le3
            jz5.n r7 = (jz5.n) r7     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> Le3
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> Le3
            float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r12 = "access$getMAvailableWidth$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            float r0 = r5.f460105x     // Catch: java.lang.Throwable -> Le3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)     // Catch: java.lang.Throwable -> Le3
            ca4.m0.b(r4, r11, r7, r0)     // Catch: java.lang.Throwable -> Le3
            goto Le7
        Le3:
            r11 = move-exception
            ca4.q.c(r6, r11)
        Le7:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            jz5.f0 r11 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y84.x1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
