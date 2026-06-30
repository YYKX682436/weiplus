package cw2;

/* loaded from: classes10.dex */
public final class z3 extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f224131d;

    public z3(com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView) {
        this.f224131d = finderLivePlayView;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
        cw2.wa waVar;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = this.f224131d;
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(finderLivePlayView.getContext());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNetStatus curPlayStatus:");
        sb6.append(finderLivePlayView.f130602g);
        sb6.append(", netQuality:");
        sb6.append(netType);
        sb6.append(", isPlaying:");
        mn0.b0 txLivePlayer = finderLivePlayView.getTxLivePlayer();
        sb6.append(txLivePlayer != null && ((mn0.y) txLivePlayer).b(false));
        com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", sb6.toString());
        mn0.b0 txLivePlayer2 = finderLivePlayView.getTxLivePlayer();
        if (!(txLivePlayer2 != null && ((mn0.y) txLivePlayer2).b(false)) || netType == -1 || finderLivePlayView.f130602g != -2301 || (waVar = finderLivePlayView.f130607n) == null) {
            return;
        }
        java.lang.String str = waVar.f224094a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str == null) {
            return;
        }
        mn0.b0 txLivePlayer3 = finderLivePlayView.getTxLivePlayer();
        if (txLivePlayer3 != null) {
            mn0.b0.C(txLivePlayer3, false, false, false, 6, null);
        }
        if (zl2.r4.f473950a.x0()) {
            cw2.wa waVar2 = finderLivePlayView.f130607n;
            if ((waVar2 == null || (feedData = waVar2.f224099f) == null || (liveInfo = feedData.getLiveInfo()) == null || liveInfo.getInteger(2) != 2) ? false : true) {
                com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", "onNetStatus try to start play but live status is end!");
                return;
            }
        }
        if (str == null) {
            str = "";
        }
        finderLivePlayView.Z(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03cf  */
    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPlayEvent(int r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.z3.onPlayEvent(int, android.os.Bundle):void");
    }
}
