package je4;

/* loaded from: classes4.dex */
public abstract class d {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (((r9.getImageHeight() * 1.0f) / r9.getImageWidth()) >= ((r17.getMeasuredHeight() * 2.0f) / r17.getMeasuredWidth())) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
    
        if (((r11.y * 1.0f) / r11.x) >= ((i65.a.k(r14) * 2.0f) / i65.a.B(r14))) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(android.content.Context r14, long r15, android.view.View r17, java.lang.String r18, boolean r19, java.lang.String r20, r45.jj4 r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: je4.d.a(android.content.Context, long, android.view.View, java.lang.String, boolean, java.lang.String, r45.jj4):void");
    }

    public static final com.tencent.mm.modelscan.ScanCodeInfo b(r45.fa6 fa6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toScanCodeInfo", "com.tencent.mm.plugin.sns.util.SnsScanCodeUtils");
        if (fa6Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toScanCodeInfo", "com.tencent.mm.plugin.sns.util.SnsScanCodeUtils");
            return null;
        }
        java.lang.String str = fa6Var.f374150d;
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toScanCodeInfo", "com.tencent.mm.plugin.sns.util.SnsScanCodeUtils");
            return null;
        }
        java.lang.String str2 = fa6Var.f374150d;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.modelscan.ScanCodeInfo scanCodeInfo = new com.tencent.mm.modelscan.ScanCodeInfo(str2, fa6Var.f374151e);
        scanCodeInfo.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toScanCodeInfo", "com.tencent.mm.plugin.sns.util.SnsScanCodeUtils");
        return scanCodeInfo;
    }
}
