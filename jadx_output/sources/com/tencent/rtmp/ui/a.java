package com.tencent.rtmp.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.rtmp.ui.TXCloudVideoView f215290a;

    private a(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f215290a = tXCloudVideoView;
    }

    public static java.lang.Runnable a(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        return new com.tencent.rtmp.ui.a(tXCloudVideoView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f215290a.hideIndicatorView();
    }
}
