package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LiveVideoView f115003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.h7 f115004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f115005f;

    public wz(com.tencent.mm.live.core.view.LiveVideoView liveVideoView, mm2.h7 h7Var, int i17) {
        this.f115003d = liveVideoView;
        this.f115004e = h7Var;
        this.f115005f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = this.f115003d;
        liveVideoView.getLocationOnScreen(iArr);
        this.f115004e.f329115g.postValue(new mm2.g7(this.f115005f, iArr[0], iArr[1], liveVideoView.getHeight()));
    }
}
