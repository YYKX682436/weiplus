package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class ws {
    public static boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHitFirstCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
        boolean z17 = ih.a.a(e42.d0.clicfg_sns_cancel_camera_sheet, 0) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHitFirstCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
        return z17;
    }
}
