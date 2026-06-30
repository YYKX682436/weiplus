package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class l1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f125754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f125755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f125757g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f125758h;

    public l1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, yz5.a aVar, com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, in5.s0 s0Var, int i17) {
        this.f125754d = baseFinderFeed;
        this.f125755e = aVar;
        this.f125756f = finderFeedSearchUI;
        this.f125757g = s0Var;
        this.f125758h = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.tz0 tz0Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.lang.String string;
        cw2.da videoView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMoreMenuItemSelectedListener feed ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f125754d;
        sb6.append(feed);
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(" menuItem:");
        sb6.append(menuItem.getItemId());
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", sb6.toString());
        yz5.a aVar = this.f125755e;
        if (aVar != null) {
            aVar.invoke();
        }
        int itemId = menuItem.getItemId();
        cu2.m mVar = cu2.m.f222420a;
        int i18 = this.f125758h;
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        in5.s0 s0Var = this.f125757g;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI activity = this.f125756f;
        switch (itemId) {
            case 99:
                int indexOf = activity.C.indexOf(feed);
                if (indexOf >= 0) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = activity.P;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                    androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
                    androidx.recyclerview.widget.z zVar = new androidx.recyclerview.widget.z();
                    zVar.f12169d = 2000L;
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = activity.P;
                    if (recyclerView2 == null) {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                    recyclerView2.setItemAnimator(zVar);
                    androidx.recyclerview.widget.RecyclerView recyclerView3 = activity.P;
                    if (recyclerView3 == null) {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                    recyclerView3.postDelayed(new com.tencent.mm.plugin.finder.search.g1(activity, itemAnimator), zVar.f12169d);
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "defaultItemAnimator.removeDuration =" + zVar.f12169d);
                    bd2.r rVar = bd2.r.f19284a;
                    androidx.appcompat.app.AppCompatActivity context = activity.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    rVar.e(context, feed.getFeedObject().getId(), feed.w(), feed.getFeedObject().getObjectNonceId(), (r17 & 16) != 0 ? false : false, (r17 & 32) != 0 ? null : this.f125757g);
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "[UNINTEREST] pos error " + indexOf);
                }
                activity.getClass();
                x3Var.c(activity, "button_uninterested", feed.getItemId(), this.f125758h);
                return;
            case 101:
                if (zl2.q4.f473933a.C(feed)) {
                    r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
                    if (liveInfo != null) {
                        long j17 = liveInfo.getLong(0);
                        bd2.b bVar = bd2.b.f19244a;
                        androidx.appcompat.app.AppCompatActivity context2 = activity.getContext();
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        androidx.appcompat.app.AppCompatActivity context3 = activity.getContext();
                        kotlin.jvm.internal.o.f(context3, "getContext(...)");
                        bVar.j(context2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), j17, feed.getFeedObject().getUserName(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : null);
                    }
                } else {
                    bd2.b bVar2 = bd2.b.f19244a;
                    androidx.appcompat.app.AppCompatActivity context4 = activity.getContext();
                    kotlin.jvm.internal.o.f(context4, "getContext(...)");
                    bd2.b.c(bVar2, context4, this.f125754d, 0L, 0, 12, null);
                }
                activity.getClass();
                x3Var.c(activity, "button_complaint", feed.getItemId(), this.f125758h);
                return;
            case 102:
                com.tencent.mm.plugin.finder.assist.n7.C(n7Var, this.f125756f, feed.getFeedObject(), null, 3, new com.tencent.mm.plugin.finder.search.h1(feed), 4, null);
                activity.getClass();
                x3Var.c(activity, "button_forward_friend", feed.getItemId(), this.f125758h);
                return;
            case 103:
                com.tencent.mm.plugin.finder.assist.n7.F(n7Var, this.f125756f, this.f125754d, null, 0, 0, 28, null);
                if (feed.getFeedObject().isLiveFeed()) {
                    vs5.a aVar2 = vs5.a.f439924a;
                    r45.nw1 liveInfo2 = feed.getFeedObject().getLiveInfo();
                    java.lang.String valueOf = java.lang.String.valueOf(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null);
                    java.lang.String valueOf2 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId());
                    java.lang.String username = feed.getFeedObject().getFeedObject().getUsername();
                    java.lang.String str = com.tencent.mm.plugin.finder.convert.zf.D1;
                    aVar2.a(valueOf, valueOf2, username, com.tencent.mm.plugin.finder.convert.zf.D1, "2", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                }
                activity.getClass();
                x3Var.c(activity, "button_forward_friendcircle", feed.getItemId(), this.f125758h);
                return;
            case 104:
                so2.v0.b(so2.v0.f410644a, this.f125754d, this.f125756f, null, null, 12, null);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                androidx.appcompat.app.AppCompatActivity context5 = activity.getContext();
                kotlin.jvm.internal.o.f(context5, "getContext(...)");
                com.tencent.mm.plugin.finder.report.o3.Rk((com.tencent.mm.plugin.finder.report.o3) c17, context5, true, feed.getItemId(), false, 8, null);
                return;
            case 106:
                androidx.appcompat.app.AppCompatActivity context6 = activity.getContext();
                kotlin.jvm.internal.o.f(context6, "getContext(...)");
                mVar.b(context6, feed, false, new com.tencent.mm.plugin.finder.search.k1(activity));
                return;
            case 107:
                androidx.appcompat.app.AppCompatActivity context7 = activity.getContext();
                kotlin.jvm.internal.o.f(context7, "getContext(...)");
                mVar.b(context7, feed, true, new com.tencent.mm.plugin.finder.search.j1(activity));
                return;
            case 109:
                androidx.appcompat.app.AppCompatActivity context8 = activity.getContext();
                kotlin.jvm.internal.o.f(context8, "getContext(...)");
                com.tencent.mm.plugin.finder.assist.y4.T(y4Var, context8, this.f125754d, this.f125757g, this.f125758h, 0, 16, null);
                return;
            case 113:
                androidx.appcompat.app.AppCompatActivity context9 = activity.getContext();
                kotlin.jvm.internal.o.f(context9, "getContext(...)");
                com.tencent.mm.plugin.finder.assist.n7.H(n7Var, context9, this.f125754d, null, 0, 12, null);
                activity.getClass();
                x3Var.c(activity, "textstatus_in_menu", feed.getItemId(), this.f125758h);
                if (feed.getFeedObject().isLiveFeed()) {
                    vs5.a aVar3 = vs5.a.f439924a;
                    r45.nw1 liveInfo3 = feed.getFeedObject().getLiveInfo();
                    java.lang.String valueOf3 = java.lang.String.valueOf(liveInfo3 != null ? java.lang.Long.valueOf(liveInfo3.getLong(0)) : null);
                    java.lang.String valueOf4 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId());
                    java.lang.String username2 = feed.getFeedObject().getFeedObject().getUsername();
                    java.lang.String str2 = com.tencent.mm.plugin.finder.convert.zf.D1;
                    aVar3.a(valueOf3, valueOf4, username2, com.tencent.mm.plugin.finder.convert.zf.D1, "3", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                    return;
                }
                return;
            case 114:
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
                kotlin.jvm.internal.o.d(finderFullSeekBarLayout);
                cw2.ca.d(finderFullSeekBarLayout, null, false, 3, null);
                com.tencent.mm.plugin.finder.assist.y5 y5Var = com.tencent.mm.plugin.finder.assist.y5.f102716a;
                androidx.appcompat.app.AppCompatActivity context10 = activity.getContext();
                kotlin.jvm.internal.o.f(context10, "getContext(...)");
                y5Var.d(context10, this.f125754d, 2L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : this.f125757g, new com.tencent.mm.plugin.finder.search.i1(finderFullSeekBarLayout));
                activity.getClass();
                x3Var.c(activity, "button_set_bell", feed.getItemId(), this.f125758h);
                return;
            case 116:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484486ee3);
                if (p17 != null) {
                    arrayList.add(p17);
                }
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                cw2.da videoView2 = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView2 : null;
                if (finderThumbPlayerProxy != null) {
                    in5.s0 s0Var2 = this.f125757g;
                    activity.getClass();
                    androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.a7((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a17, s0Var2, arrayList, finderThumbPlayerProxy, null, null, null, 56, null);
                }
                activity.getClass();
                x3Var.c(activity, "button_speedplay", feed.getItemId(), this.f125758h);
                return;
            case 119:
                androidx.appcompat.app.AppCompatActivity context11 = activity.getContext();
                kotlin.jvm.internal.o.f(context11, "getContext(...)");
                y4Var.X(context11, feed);
                return;
            case 120:
                kotlin.jvm.internal.o.g(activity, "activity");
                kotlin.jvm.internal.o.g(feed, "feed");
                fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                byte[] byteArray = feed.getFeedObject().getFeedObject().toByteArray();
                ((ee0.n4) k4Var).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                if (byteArray == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                } else {
                    je4.a.f299315a.a(activity, 2, byteArray, 0, 9);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                }
            case 121:
                androidx.appcompat.app.AppCompatActivity context12 = activity.getContext();
                kotlin.jvm.internal.o.f(context12, "getContext(...)");
                y4Var.Q(context12, feed);
                return;
            case 200:
                androidx.appcompat.app.AppCompatActivity context13 = activity.getContext();
                kotlin.jvm.internal.o.f(context13, "getContext(...)");
                y4Var.Y(feed, context13, cu2.f0.f222391a.f(feed.getFeedObject().getFromAppId()));
                return;
            case 201:
                activity.getClass();
                y4Var.h0(activity, feed);
                return;
            case 202:
                xc2.y2 y2Var = xc2.y2.f453343a;
                androidx.appcompat.app.AppCompatActivity context14 = activity.getContext();
                kotlin.jvm.internal.o.f(context14, "getContext(...)");
                activity.getClass();
                y2Var.V(context14, feed, i18, false);
                return;
            case 207:
                activity.getClass();
                y4Var.f0(activity, feed, i18);
                return;
            case 209:
                androidx.appcompat.app.AppCompatActivity context15 = activity.getContext();
                kotlin.jvm.internal.o.f(context15, "getContext(...)");
                kotlin.jvm.internal.o.g(feed, "feed");
                r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
                if (object_extend == null || (tz0Var = (r45.tz0) object_extend.getCustom(11)) == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) tz0Var.getCustom(0)) == null) {
                    return;
                }
                xc2.y2.i(xc2.y2.f453343a, context15, new xc2.p0(finderJumpInfo), 0, null, 12, null);
                return;
            case 210:
                androidx.appcompat.app.AppCompatActivity context16 = activity.getContext();
                kotlin.jvm.internal.o.f(context16, "getContext(...)");
                y4Var.j0(context16, feed, s0Var);
                return;
            case 213:
                com.tencent.mm.plugin.finder.assist.k2 k2Var = com.tencent.mm.plugin.finder.assist.k2.f102306a;
                k2Var.a(feed.getFeedObject());
                androidx.appcompat.app.AppCompatActivity context17 = activity.getContext();
                kotlin.jvm.internal.o.f(context17, "getContext(...)");
                k2Var.b(context17);
                return;
            case 215:
                androidx.appcompat.app.AppCompatActivity context18 = activity.getContext();
                kotlin.jvm.internal.o.f(context18, "getContext(...)");
                y4Var.e0(context18, feed);
                return;
            case 216:
                androidx.appcompat.app.AppCompatActivity context19 = activity.getContext();
                kotlin.jvm.internal.o.f(context19, "getContext(...)");
                kotlin.jvm.internal.o.g(feed, "feed");
                r45.dm2 object_extend2 = feed.getFeedObject().getFeedObject().getObject_extend();
                if (object_extend2 == null || (string = object_extend2.getString(46)) == null) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", string);
                j45.l.j(context19, "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            case 218:
                androidx.appcompat.app.AppCompatActivity context20 = activity.getContext();
                kotlin.jvm.internal.o.f(context20, "getContext(...)");
                y4Var.g0(context20, feed);
                return;
            case 219:
                androidx.appcompat.app.AppCompatActivity context21 = activity.getContext();
                kotlin.jvm.internal.o.f(context21, "getContext(...)");
                y4Var.d0(context21, feed, s0Var);
                return;
            case 301:
            case 302:
                activity.getClass();
                androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
                kotlin.jvm.internal.o.f(a18, "get(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.Q6((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a18, this.f125757g, false, true, false, 8, null);
                return;
            case 305:
                y4Var.L(this.f125757g, true, this.f125754d, this.f125758h, activity.C);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET /* 306 */:
                y4Var.L(this.f125757g, false, this.f125754d, this.f125758h, activity.C);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE /* 307 */:
                androidx.appcompat.app.AppCompatActivity context22 = activity.getContext();
                kotlin.jvm.internal.o.f(context22, "getContext(...)");
                androidx.lifecycle.c1 a19 = pf5.z.f353948a.a(context22).a(com.tencent.mm.plugin.finder.viewmodel.component.f2.class);
                kotlin.jvm.internal.o.f(a19, "get(...)");
                ((com.tencent.mm.plugin.finder.viewmodel.component.f2) a19).Q6(s0Var, false);
                activity.getClass();
                x3Var.c(activity, "button_minimize", feed.getItemId(), this.f125758h);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR /* 308 */:
                androidx.appcompat.app.AppCompatActivity context23 = activity.getContext();
                kotlin.jvm.internal.o.f(context23, "getContext(...)");
                y4Var.I(context23, feed);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL /* 309 */:
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                float currentPlayMs = (finderVideoLayout2 == null || (videoView = finderVideoLayout2.getVideoView()) == null) ? 0.0f : ((float) videoView.getCurrentPlayMs()) / ((float) videoView.getVideoDurationMs());
                vn2.u0 u0Var = vn2.u0.f438387a;
                androidx.appcompat.app.AppCompatActivity context24 = activity.getContext();
                kotlin.jvm.internal.o.f(context24, "getContext(...)");
                u0Var.a("Finder.FinderFeedSearchUI", "", context24, this.f125754d, true, true, currentPlayMs);
                return;
            case 312:
                androidx.appcompat.app.AppCompatActivity context25 = activity.getContext();
                kotlin.jvm.internal.o.f(context25, "getContext(...)");
                y4Var.M(context25, s0Var, feed, activity.S);
                return;
            case 313:
                androidx.appcompat.app.AppCompatActivity context26 = activity.getContext();
                kotlin.jvm.internal.o.f(context26, "getContext(...)");
                y4Var.K(context26, feed, s0Var, menuItem);
                return;
            case 403:
                c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                androidx.appcompat.app.AppCompatActivity context27 = activity.getContext();
                kotlin.jvm.internal.o.f(context27, "getContext(...)");
                r45.s02 s02Var = new r45.s02();
                s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
                s02Var.set(3, 1);
                ((b92.d1) zbVar).uj(context27, s02Var);
                androidx.appcompat.app.AppCompatActivity context28 = activity.getContext();
                kotlin.jvm.internal.o.f(context28, "getContext(...)");
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context28).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                i95.m c18 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb.T8((zy2.zb) c18, ml2.t1.W2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1")), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)).toString(), null, null, false, 112, null);
                return;
            default:
                o25.y1 y1Var = activity.f125552x0;
                if (y1Var != null) {
                    ((com.tencent.mm.pluginsdk.forward.m) y1Var).aj((db5.h4) menuItem, new com.tencent.mm.plugin.finder.search.f1(feed, activity, menuItem, i18));
                    return;
                } else {
                    kotlin.jvm.internal.o.o("quickMenuHelper");
                    throw null;
                }
        }
    }
}
