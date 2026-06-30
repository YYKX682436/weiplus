package cw2;

/* loaded from: classes2.dex */
public final class b3 implements cw2.i9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout f223592d;

    public b3(com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout) {
        this.f223592d = finderLiveCardMediaLayout;
    }

    @Override // cw2.i9
    public void B(nk4.c data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // cw2.i9
    public void C(nk4.q data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout = this.f223592d;
        cw2.h8 playInfo = finderLiveCardMediaLayout.getPlayInfo();
        if (playInfo != null) {
            com.tencent.mm.plugin.finder.report.s5 s5Var = com.tencent.mm.plugin.finder.report.s5.f125349a;
            mn2.g4 g4Var = playInfo.f223747c;
            java.lang.String string = g4Var.f330002e.getString(9);
            if (string == null) {
                string = "";
            }
            s5Var.a(string, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFirstFrameUpdate] videoView=");
            cw2.da videoView = finderLiveCardMediaLayout.getVideoView();
            sb6.append(videoView != null ? java.lang.Integer.valueOf(videoView.hashCode()) : null);
            sb6.append(" mediaId=");
            sb6.append(playInfo.f223746b);
            com.tencent.mars.xlog.Log.i("FinderLiveCardMediaLayout", sb6.toString());
            ym5.a1.f(new cw2.g3(finderLiveCardMediaLayout, "onFirstFrameDraw"));
            ec2.g videoPlayBehavior = finderLiveCardMediaLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
                ((ec2.h) videoPlayBehavior).a(feedData.getExpectId(), feedData.getDupFlag(), g4Var.f330002e, g4Var, j17);
            }
        }
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // cw2.fb
    public void b(float f17) {
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
    }

    @Override // cw2.i9
    public void f(nk4.d data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        java.util.LinkedList videoCallBackList;
        com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout = this.f223592d;
        cw2.h8 playInfo = finderLiveCardMediaLayout.getPlayInfo();
        if (playInfo != null) {
            ec2.g videoPlayBehavior = finderLiveCardMediaLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
                long expectId = feedData.getExpectId();
                java.lang.String dupFlag = feedData.getDupFlag();
                mn2.g4 g4Var = playInfo.f223747c;
                ((ec2.h) videoPlayBehavior).c(expectId, dupFlag, g4Var.f330002e, playInfo.f223749e, g4Var, playInfo.f223745a);
            }
            videoCallBackList = finderLiveCardMediaLayout.getVideoCallBackList();
            java.util.Iterator it = videoCallBackList.iterator();
            while (it.hasNext()) {
                ((cw2.ea) it.next()).onVideoPlay();
            }
        }
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        java.util.LinkedList videoCallBackList;
        com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout = this.f223592d;
        cw2.h8 playInfo = finderLiveCardMediaLayout.getPlayInfo();
        if (playInfo != null) {
            ec2.g videoPlayBehavior = finderLiveCardMediaLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
                long expectId = feedData.getExpectId();
                java.lang.String dupFlag = feedData.getDupFlag();
                mn2.g4 g4Var = playInfo.f223747c;
                ((ec2.h) videoPlayBehavior).b(expectId, dupFlag, g4Var.f330002e, playInfo.f223749e, g4Var, aVar);
            }
            videoCallBackList = finderLiveCardMediaLayout.getVideoCallBackList();
            java.util.Iterator it = videoCallBackList.iterator();
            while (it.hasNext()) {
                ((cw2.ea) it.next()).onVideoPause();
            }
        }
    }

    @Override // cw2.i9
    public void p(nk4.j data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
        if (waVar != null) {
            cu2.x xVar = cu2.x.f222449a;
            so2.i3 c17 = cu2.x.c(xVar, waVar.f224096c, false, false, false, 14, null);
            if (!c17.field_hasPlayed) {
                c17.field_hasPlayed = true;
                java.lang.String field_mediaId = c17.field_mediaId;
                kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                so2.i3 c18 = cu2.x.c(xVar, field_mediaId, false, false, false, 14, null);
                c18.field_hasPlayed = true;
                xVar.i(field_mediaId, c18, false);
            }
            ec2.g videoPlayBehavior = this.f223592d.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                com.tencent.mm.plugin.finder.storage.FeedData feedData = waVar.f224099f;
                long id6 = feedData.getId();
                java.lang.String dupFlag = feedData.getDupFlag();
                mn2.j4 video = waVar.f224098e;
                kotlin.jvm.internal.o.g(video, "video");
                ec2.f fVar = new ec2.f(6);
                fVar.f250965j = id6;
                fVar.f250966k = dupFlag;
                fVar.f250961f = waVar.f224097d;
                fVar.f250962g = video;
                fVar.f250978w = aVar;
                ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
            }
        }
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
    }

    @Override // cw2.fb
    public void x(r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar) {
    }
}
