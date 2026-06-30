package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f149307d;

    public d0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton) {
        this.f149307d = mMSightRecordButton;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f149307d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "on Long Press, isDispatchSimpleTap: %s, isDispatchLongPress: %s", java.lang.Boolean.valueOf(mMSightRecordButton.f149200m), java.lang.Boolean.valueOf(mMSightRecordButton.f149201n));
        if (mMSightRecordButton.f149200m) {
            return;
        }
        mMSightRecordButton.f149201n = true;
        com.tencent.mm.plugin.mmsight.ui.h0 h0Var = mMSightRecordButton.f149213z;
        if (h0Var != null) {
            h0Var.a();
        }
    }
}
