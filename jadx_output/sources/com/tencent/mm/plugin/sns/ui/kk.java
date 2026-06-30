package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class kk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLabelUI f169638d;

    public kk(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        this.f169638d = snsLabelUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if (r5.length() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r5.length() == 0) goto L18;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI$10"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            c93.b r2 = c93.a.a()
            b93.b r2 = (b93.b) r2
            r2.getClass()
            com.tencent.mm.storage.h4 r2 = b93.r.wi()
            r2.D0()
            c93.b r2 = c93.a.a()
            b93.b r2 = (b93.b) r2
            java.util.List r2 = r2.d()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            com.tencent.mm.plugin.sns.ui.SnsLabelUI r3 = r6.f169638d
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.W6(r3, r2)
            ae4.a r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(r3)
            java.util.ArrayList r4 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(r3)
            r2.h(r4)
            java.lang.String r2 = "access$1600"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            r3.b7()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            java.util.ArrayList r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(r3)
            if (r2 == 0) goto L51
            java.util.ArrayList r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(r3)
            int r2 = r2.size()
            if (r2 != 0) goto Lcd
        L51:
            java.lang.String r2 = "access$2100"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            java.lang.String r5 = r3.f167222g
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            if (r5 == 0) goto L6b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            java.lang.String r5 = r3.f167222g
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            int r2 = r5.length()
            if (r2 != 0) goto Lcd
        L6b:
            ae4.a r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(r3)
            int r2 = r2.f4360h
            if (r2 == 0) goto Lcd
            ae4.a r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(r3)
            int r2 = r2.f4360h
            r5 = 1
            if (r2 == r5) goto Lcd
            java.lang.String r2 = "access$2200"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            java.lang.String r5 = r3.f167223h
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            if (r5 == 0) goto L96
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            java.lang.String r5 = r3.f167223h
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            int r2 = r5.length()
            if (r2 != 0) goto Lcd
        L96:
            ae4.a r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(r3)
            java.util.ArrayList r2 = r2.f4367o
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lcd
            ae4.a r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(r3)
            java.util.ArrayList r2 = r2.f4368p
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lcd
            ae4.a r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(r3)
            java.util.ArrayList r2 = r2.f4365m
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lcd
            ae4.a r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(r3)
            java.util.ArrayList r2 = r2.f4366n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lcd
            ae4.a r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(r3)
            r5 = 0
            r2.f4360h = r5
        Lcd:
            ae4.a r2 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(r3)
            r2.notifyDataSetChanged()
            java.lang.String r2 = "access$1802"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            r5 = 0
            r3.f167233u = r5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.kk.run():void");
    }
}
