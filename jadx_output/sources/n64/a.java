package n64;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public yz5.l f335216a;

    public final boolean a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("acceptResourceType", "com.tencent.mm.plugin.sns.ad.preload.detector.AdPreloadResourceDetector");
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acceptResourceType", "com.tencent.mm.plugin.sns.ad.preload.detector.AdPreloadResourceDetector");
            return true;
        }
        yz5.l lVar = this.f335216a;
        boolean z17 = false;
        if (lVar != null && !((java.lang.Boolean) lVar.invoke(java.lang.Integer.valueOf(i17))).booleanValue()) {
            z17 = true;
        }
        boolean z18 = !z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acceptResourceType", "com.tencent.mm.plugin.sns.ad.preload.detector.AdPreloadResourceDetector");
        return z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n64.a.b(java.lang.Object):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r25, java.util.List r26, boolean r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n64.a.c(java.lang.Object, java.util.List, boolean, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r11 == true) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r8, int r9, java.lang.String r10, java.lang.Object r11, boolean r12, java.lang.String r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n64.a.d(int, int, java.lang.String, java.lang.Object, boolean, java.lang.String, java.util.List):void");
    }

    public final void e(yz5.l filter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setResourceTypeFilter", "com.tencent.mm.plugin.sns.ad.preload.detector.AdPreloadResourceDetector");
        kotlin.jvm.internal.o.g(filter, "filter");
        this.f335216a = filter;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setResourceTypeFilter", "com.tencent.mm.plugin.sns.ad.preload.detector.AdPreloadResourceDetector");
    }
}
