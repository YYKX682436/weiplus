package com.tencent.rtmp.ui;

/* loaded from: classes14.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.rtmp.ui.TXCloudVideoView f215296a;

    /* renamed from: b, reason: collision with root package name */
    private final int f215297b;

    /* renamed from: c, reason: collision with root package name */
    private final int f215298c;

    /* renamed from: d, reason: collision with root package name */
    private final int f215299d;

    /* renamed from: e, reason: collision with root package name */
    private final int f215300e;

    private c(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18, int i19, int i27) {
        this.f215296a = tXCloudVideoView;
        this.f215297b = i17;
        this.f215298c = i18;
        this.f215299d = i19;
        this.f215300e = i27;
    }

    public static java.lang.Runnable a(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18, int i19, int i27) {
        return new com.tencent.rtmp.ui.c(tXCloudVideoView, i17, i18, i19, i27);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f215296a.showFocusViewInternal(this.f215297b, this.f215298c, this.f215299d, this.f215300e);
    }
}
