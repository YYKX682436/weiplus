package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView f191718d;

    public i7(com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView synchronizedVideoPlayTextureView) {
        this.f191718d = synchronizedVideoPlayTextureView;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f191718d.K) {
            super/*com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView*/.stop();
        }
    }
}
