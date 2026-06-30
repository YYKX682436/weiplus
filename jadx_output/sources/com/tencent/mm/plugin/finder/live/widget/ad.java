package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ad implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView f117756d;

    public ad(com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView) {
        this.f117756d = finderLiveConfettiView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView = this.f117756d;
        if (finderLiveConfettiView.f117593m) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView.a(finderLiveConfettiView);
            return true;
        }
        long j17 = finderLiveConfettiView.f117594n;
        if (j17 <= 0) {
            return true;
        }
        finderLiveConfettiView.f117594n = j17 - 1;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView.a(finderLiveConfettiView);
        return true;
    }
}
