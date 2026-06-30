package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes13.dex */
public final class ie implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI f161155d;

    public ie(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI) {
        this.f161155d = settingsHearingAidTestEnvironmentUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r2.isTouchExplorationEnabled() == true) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI r1 = r6.f161155d
            com.tencent.mm.ui.widget.button.WeButton r2 = r1.f160437d
            r3 = 0
            java.lang.String r4 = "mBtnStart"
            if (r2 == 0) goto L66
            int r2 = r2.getWidth()
            com.tencent.mm.ui.widget.button.WeButton r5 = r1.f160437d
            if (r5 == 0) goto L62
            int r5 = r5.getHeight()
            r0.<init>(r2, r5)
            com.tencent.mm.ui.widget.button.WeButton r2 = r1.f160437d
            if (r2 == 0) goto L5e
            int r2 = r2.getLeft()
            r0.leftMargin = r2
            com.tencent.mm.ui.widget.button.WeButton r2 = r1.f160437d
            if (r2 == 0) goto L5a
            int r2 = r2.getTop()
            r0.topMargin = r2
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r4 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r4)
            boolean r4 = r2 instanceof android.view.accessibility.AccessibilityManager
            if (r4 == 0) goto L3d
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            goto L3e
        L3d:
            r2 = r3
        L3e:
            if (r2 == 0) goto L48
            boolean r2 = r2.isTouchExplorationEnabled()
            r4 = 1
            if (r2 != r4) goto L48
            goto L49
        L48:
            r4 = 0
        L49:
            if (r4 != 0) goto L59
            android.view.View r1 = r1.f160438e
            if (r1 == 0) goto L53
            r1.setLayoutParams(r0)
            goto L59
        L53:
            java.lang.String r0 = "mBtnStartView"
            kotlin.jvm.internal.o.o(r0)
            throw r3
        L59:
            return
        L5a:
            kotlin.jvm.internal.o.o(r4)
            throw r3
        L5e:
            kotlin.jvm.internal.o.o(r4)
            throw r3
        L62:
            kotlin.jvm.internal.o.o(r4)
            throw r3
        L66:
            kotlin.jvm.internal.o.o(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.ie.run():void");
    }
}
