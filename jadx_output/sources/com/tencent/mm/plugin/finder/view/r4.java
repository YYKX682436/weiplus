package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class r4 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132927g;

    public r4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        this.f132927g = finderColumnFrameLayout;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        ey2.u uVar;
        androidx.lifecycle.j0 j0Var;
        jz5.l lVar;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
        int i17;
        androidx.lifecycle.j0 j0Var2;
        jz5.l lVar2;
        androidx.lifecycle.j0 j0Var3;
        jz5.l lVar3;
        cw2.da videoView;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = null;
            com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f132927g;
            int i18 = fVar.f250959d;
            if (i18 == 4) {
                com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout.b(finderColumnFrameLayout, finderColumnFrameLayout.getRecyclerView());
                java.lang.ref.WeakReference weakReference = finderColumnFrameLayout.getColumnFeedSelectorAdapter().f244113x;
                in5.s0 s0Var = weakReference != null ? (in5.s0) weakReference.get() : null;
                if (s0Var != null) {
                    com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                    int currentPlayMs = (finderVideoLayout == null || (videoView = finderVideoLayout.getVideoView()) == null) ? 0 : (int) ((((float) videoView.getCurrentPlayMs()) / ((float) videoView.getVideoDurationMs())) * 100);
                    ey2.u uVar2 = finderColumnFrameLayout.f130914r;
                    com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer2 = (uVar2 == null || (j0Var3 = uVar2.f257542x) == null || (lVar3 = (jz5.l) j0Var3.getValue()) == null) ? null : (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar3.f302833d;
                    kotlin.jvm.internal.o.e(dataBuffer2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<com.tencent.mm.plugin.finder.model.RVFeed>");
                    if (finderColumnFrameLayout.getLastSnappedPosition() != -1) {
                        java.lang.Object obj = dataBuffer2.get(finderColumnFrameLayout.getLastSnappedPosition());
                        if (obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                            baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
                        }
                    }
                    if (baseFinderFeed != null) {
                        baseFinderFeed.Y1(currentPlayMs);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i18 == 2 && finderColumnFrameLayout.getColumnFeedSelectorAdapter().f244111v) {
                ey2.u uVar3 = finderColumnFrameLayout.f130914r;
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer3 = (uVar3 == null || (j0Var2 = uVar3.f257542x) == null || (lVar2 = (jz5.l) j0Var2.getValue()) == null) ? null : (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar2.f302833d;
                kotlin.jvm.internal.o.e(dataBuffer3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<com.tencent.mm.plugin.finder.model.RVFeed>");
                if (finderColumnFrameLayout.getLastSnappedPosition() != -1) {
                    java.lang.Object obj2 = dataBuffer3.get(finderColumnFrameLayout.getLastSnappedPosition());
                    if (obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
                    }
                }
                if (baseFinderFeed == null || baseFinderFeed.getItemId() != fVar.f250965j || !((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Wb).getValue()).r()).booleanValue() || (uVar = finderColumnFrameLayout.f130914r) == null || (j0Var = uVar.f257542x) == null || (lVar = (jz5.l) j0Var.getValue()) == null || (dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d) == null || (i17 = finderColumnFrameLayout.lastSnappedPosition + 1) >= dataBuffer.size()) {
                    return;
                }
                finderColumnFrameLayout.d(i17);
            }
        }
    }
}
