package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes8.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public android.webkit.ValueCallback f165178a;

    /* renamed from: b, reason: collision with root package name */
    public android.webkit.ValueCallback f165179b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f165180c;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.app.Activity r18, com.tencent.mm.plugin.webview.permission.w r19, android.webkit.ValueCallback r20, android.webkit.ValueCallback r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0.a(android.app.Activity, com.tencent.mm.plugin.webview.permission.w, android.webkit.ValueCallback, android.webkit.ValueCallback, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.app.Activity r9, int r10, int r11, android.content.Intent r12) {
        /*
            r8 = this;
            java.lang.String r0 = "onActivityResult"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$FileChooser"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 2003(0x7d3, float:2.807E-42)
            r3 = 0
            if (r10 != r2) goto Lc3
            java.lang.String r10 = "onActivityResultInternal"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            android.webkit.ValueCallback r2 = r8.f165178a
            r4 = 1
            java.lang.String r5 = "AdLandingFloatWebView"
            if (r2 != 0) goto L29
            android.webkit.ValueCallback r2 = r8.f165179b
            if (r2 != 0) goto L29
            java.lang.String r9 = "uploadFileCallback is null."
            com.tencent.mars.xlog.Log.w(r5, r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
            goto Lbf
        L29:
            java.lang.String r2 = "getUriFromActivityResult"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            r6 = -1
            r7 = 0
            if (r11 == r6) goto L36
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L88
        L36:
            if (r12 == 0) goto L6c
            android.net.Uri r9 = r12.getData()
            if (r9 != 0) goto L55
            android.os.Bundle r9 = r12.getExtras()
            if (r9 == 0) goto L53
            java.lang.String r11 = "android.intent.extra.STREAM"
            android.os.Parcelable r12 = r9.getParcelable(r11)
            if (r12 == 0) goto L53
            android.os.Parcelable r9 = r9.getParcelable(r11)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L59
        L53:
            r9 = r7
            goto L59
        L55:
            android.net.Uri r9 = r12.getData()
        L59:
            boolean r11 = com.tencent.mm.sdk.platformtools.t8.W0(r9)
            if (r11 != 0) goto L68
            java.lang.String r9 = "getUriFromActivityResult fail uri not safe"
            com.tencent.mars.xlog.Log.e(r5, r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L88
        L68:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L89
        L6c:
            com.tencent.mm.vfs.r6 r11 = new com.tencent.mm.vfs.r6
            java.lang.String r12 = r8.f165180c
            java.lang.String r12 = hy4.t.b(r12)
            r11.<init>(r12)
            boolean r12 = r11.m()
            if (r12 == 0) goto L85
            android.net.Uri r9 = com.tencent.mm.sdk.platformtools.i1.b(r9, r11)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L89
        L85:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L88:
            r9 = r7
        L89:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "result = "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r5, r11)
            java.lang.String r11 = "callbackOnReceiveValue"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r1)
            android.webkit.ValueCallback r12 = r8.f165178a
            if (r12 == 0) goto La8
            r12.onReceiveValue(r9)
            goto Lb9
        La8:
            android.webkit.ValueCallback r12 = r8.f165179b
            if (r12 == 0) goto Lb9
            if (r9 != 0) goto Lb2
            r12.onReceiveValue(r7)
            goto Lb9
        Lb2:
            android.net.Uri[] r2 = new android.net.Uri[r4]
            r2[r3] = r9
            r12.onReceiveValue(r2)
        Lb9:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
        Lbf:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        Lc3:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0.b(android.app.Activity, int, int, android.content.Intent):boolean");
    }
}
