package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class iu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f169442d;

    /* renamed from: e, reason: collision with root package name */
    public int f169443e;

    /* renamed from: f, reason: collision with root package name */
    public final int f169444f;

    /* renamed from: g, reason: collision with root package name */
    public final int f169445g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f169446h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f169447i;

    public iu(int i17, int i18, int i19, com.tencent.mm.plugin.sns.ui.WrapScollview wrapScollview) {
        this.f169442d = i17;
        this.f169444f = i18;
        this.f169445g = i19;
        this.f169446h = new java.lang.ref.WeakReference(wrapScollview);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
        if (this.f169447i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI.ManualScrollCursorTask", "had run, skip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f169446h;
        com.tencent.mm.plugin.sns.ui.WrapScollview wrapScollview = (weakReference == null || weakReference.get() == null) ? null : (com.tencent.mm.plugin.sns.ui.WrapScollview) weakReference.get();
        if (wrapScollview == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI.ManualScrollCursorTask", "scrollview null, skip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            return;
        }
        this.f169447i = true;
        int i17 = this.f169443e - this.f169445g;
        int i18 = this.f169442d;
        int i19 = this.f169444f;
        int i27 = i18 > i17 ? i18 - i17 : i18 <= i19 ? i18 - i19 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI.ManualScrollCursorTask", "run: need scrollDelta:%d, cursorRawY:%d, unableShowTopY:%d, unableShowBottomY:%d, footerBarTopRawY:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f169443e));
        wrapScollview.setScrollDeltaOnFocusLocationChange(i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
    }
}
