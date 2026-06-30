package com.tencent.rtmp.ui;

/* loaded from: classes14.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.rtmp.ui.TXCloudVideoView f215291a;

    /* renamed from: b, reason: collision with root package name */
    private final int f215292b;

    /* renamed from: c, reason: collision with root package name */
    private final int f215293c;

    /* renamed from: d, reason: collision with root package name */
    private final int f215294d;

    /* renamed from: e, reason: collision with root package name */
    private final int f215295e;

    private b(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18, int i19, int i27) {
        this.f215291a = tXCloudVideoView;
        this.f215292b = i17;
        this.f215293c = i18;
        this.f215294d = i19;
        this.f215295e = i27;
    }

    public static java.lang.Runnable a(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18, int i19, int i27) {
        return new com.tencent.rtmp.ui.b(tXCloudVideoView, i17, i18, i19, i27);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f215291a.setBackgroundColor(android.graphics.Color.argb(this.f215292b, this.f215293c, this.f215294d, this.f215295e));
    }
}
