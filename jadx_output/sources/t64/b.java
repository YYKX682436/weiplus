package t64;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final t64.b f416013a = new t64.b();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:64:0x001a, B:13:0x0028, B:14:0x002f, B:16:0x0035, B:58:0x003d, B:19:0x0045, B:49:0x004d, B:51:0x0051, B:54:0x005a, B:46:0x0061, B:33:0x0068, B:36:0x0080, B:42:0x0085, B:39:0x008f, B:29:0x009b, B:70:0x00b4), top: B:63:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(r45.ua6 r13) {
        /*
            java.lang.String r0 = "tryOpAd"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.adop.AdOpHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r13 != 0) goto Le
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        Le:
            java.util.LinkedList r2 = r13.f387187z
            int r3 = r13.f387186y
            java.lang.String r4 = "AdOpHelper"
            if (r3 == 0) goto Lb4
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L23
            boolean r6 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb8
            if (r6 == 0) goto L21
            goto L23
        L21:
            r6 = r3
            goto L24
        L23:
            r6 = r5
        L24:
            if (r6 == 0) goto L28
            goto Lb4
        L28:
            kotlin.jvm.internal.o.d(r2)     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lb8
        L2f:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r6 == 0) goto Lcf
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> Lb8
            r45.i5 r6 = (r45.i5) r6     // Catch: java.lang.Throwable -> Lb8
            if (r6 != 0) goto L45
            java.lang.String r6 = "pb parse error, parse list without content?"
            r7 = 4
            ca4.q.a(r4, r6, r7)     // Catch: java.lang.Throwable -> Lb8
            goto L2f
        L45:
            int r7 = r6.f376733d     // Catch: java.lang.Throwable -> Lb8
            t64.b r8 = t64.b.f416013a
            java.util.LinkedList r9 = r13.f387176o
            if (r7 != r5) goto L5e
            java.util.LinkedList r7 = r13.f387170f     // Catch: java.lang.Throwable -> Lb8
            if (r9 == 0) goto L59
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lb8
            if (r9 <= 0) goto L59
            r9 = r5
            goto L5a
        L59:
            r9 = r3
        L5a:
            r8.a(r6, r9, r7)     // Catch: java.lang.Throwable -> Lb8
            goto L2f
        L5e:
            r10 = 2
            if (r7 != r10) goto L65
            r8.b(r6, r9)     // Catch: java.lang.Throwable -> Lb8
            goto L2f
        L65:
            r10 = 3
            if (r7 != r10) goto L9b
            com.tencent.mm.plugin.report.service.g0 r7 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> Lb8
            r10 = 2123(0x84b, float:2.975E-42)
            r7.A(r10, r5)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r11 = "isEnableAdSwap"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r1)     // Catch: java.lang.Throwable -> Lb8
            e42.c0 r12 = e42.c0.clicfg_sns_ad_android_enable_swap_ad     // Catch: java.lang.Throwable -> Lb8
            int r12 = ca4.m0.u0(r12, r5)     // Catch: java.lang.Throwable -> Lb8
            if (r12 <= 0) goto L7f
            r12 = r5
            goto L80
        L7f:
            r12 = r3
        L80:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)     // Catch: java.lang.Throwable -> Lb8
            if (r12 == 0) goto L8f
            t64.d r7 = t64.d.f416017a     // Catch: java.lang.Throwable -> Lb8
            int r7 = r7.a(r6, r9)     // Catch: java.lang.Throwable -> Lb8
            r8.c(r7, r6)     // Catch: java.lang.Throwable -> Lb8
            goto L2f
        L8f:
            java.lang.String r6 = "tryOpAd !isEnableAdSwap"
            com.tencent.mars.xlog.Log.e(r4, r6)     // Catch: java.lang.Throwable -> Lb8
            r6 = 11
            r7.A(r10, r6)     // Catch: java.lang.Throwable -> Lb8
            goto L2f
        L9b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r7.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = "tryOpAd unknow type = "
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb8
            int r6 = r6.f376733d     // Catch: java.lang.Throwable -> Lb8
            r7.append(r6)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> Lb8
            com.tencent.mars.xlog.Log.e(r4, r6)     // Catch: java.lang.Throwable -> Lb8
            goto L2f
        Lb4:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Lb8
            return
        Lb8:
            r13 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "tryOpAd error"
            r2.<init>(r3)
            java.lang.String r13 = r13.getMessage()
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            com.tencent.mars.xlog.Log.e(r4, r13)
        Lcf:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t64.b.d(r45.ua6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r45.i5 r32, boolean r33, java.util.LinkedList r34) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t64.b.a(r45.i5, boolean, java.util.LinkedList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d8  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r45.i5 r39, java.util.LinkedList r40) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t64.b.b(r45.i5, java.util.LinkedList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #1 {Exception -> 0x0015, blocks: (B:45:0x0012, B:4:0x0018, B:6:0x002d, B:11:0x0039), top: B:44:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r11, r45.i5 r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t64.b.c(int, r45.i5):void");
    }
}
