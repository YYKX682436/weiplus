package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ww implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView f120242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Message f120243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f120244f;

    public ww(com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView, android.os.Message message, kotlin.jvm.internal.g0 g0Var) {
        this.f120242d = finderLiveTaskBannerView;
        this.f120243e = message;
        this.f120244f = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f120242d.f117684r.sendMessageDelayed(this.f120243e, this.f120244f.f310121d);
    }
}
