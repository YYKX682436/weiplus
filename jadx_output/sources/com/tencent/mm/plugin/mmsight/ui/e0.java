package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f149311d;

    public e0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton) {
        this.f149311d = mMSightRecordButton;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f149311d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "startTransition, isDown: %s", java.lang.Boolean.valueOf(mMSightRecordButton.f149208u));
        if (mMSightRecordButton.f149208u) {
            mMSightRecordButton.j(null);
        }
    }
}
