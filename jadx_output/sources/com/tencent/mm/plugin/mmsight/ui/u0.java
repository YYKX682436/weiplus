package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes3.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView f149429d;

    public u0(com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView mMSightTopCountdownCoverView) {
        this.f149429d = mMSightTopCountdownCoverView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView mMSightTopCountdownCoverView = this.f149429d;
        mMSightTopCountdownCoverView.f149220g.setText(java.lang.String.format(java.util.Locale.US, "%02d:%02d", java.lang.Long.valueOf(((mMSightTopCountdownCoverView.f149223m - 400) - mMSightTopCountdownCoverView.f149222i) / java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)), java.lang.Long.valueOf(java.lang.Math.max(java.lang.Math.round((r1 % r3.toMillis(1L)) / java.util.concurrent.TimeUnit.SECONDS.toMillis(1L)), 0L))));
        mMSightTopCountdownCoverView.f149217d.postDelayed(this, 1000L);
        mMSightTopCountdownCoverView.f149222i += 1000;
    }
}
