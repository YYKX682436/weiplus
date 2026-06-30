package eu2;

/* loaded from: classes2.dex */
public final class j implements fu2.c {

    /* renamed from: a, reason: collision with root package name */
    public final du2.l f256790a = eu2.b0.I;

    /* renamed from: b, reason: collision with root package name */
    public final fu2.a f256791b = new fu2.a(null, null);

    /* renamed from: c, reason: collision with root package name */
    public final fu2.b f256792c = new fu2.b(0, 0, 0.0f, 4, null);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f256793d;

    public j(eu2.b0 b0Var) {
        this.f256793d = b0Var;
    }

    public final android.app.PendingIntent a(int i17, android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService.class);
        intent.putExtra("key_action_code", i17);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.PendingIntent foregroundService = android.app.PendingIntent.getForegroundService(context, i17, intent, 201326592);
            kotlin.jvm.internal.o.d(foregroundService);
            return foregroundService;
        }
        android.app.PendingIntent service = android.app.PendingIntent.getService(context, i17, intent, 201326592);
        kotlin.jvm.internal.o.d(service);
        return service;
    }

    public final void b(boolean z17) {
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2;
        cw2.da daVar;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout3;
        cw2.da daVar2;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout4;
        eu2.b0 b0Var = this.f256793d;
        if (z17) {
            b0Var.f256767q = false;
        }
        int ordinal = b0Var.f256762i.ordinal();
        r4 = null;
        java.lang.Integer num = null;
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            if (z17) {
                int ordinal2 = b0Var.f256760g.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 2) {
                        return;
                    }
                    in5.s0 s0Var = b0Var.f256761h;
                    if (s0Var != null && (finderVideoLayout4 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.k(com.tencent.mm.R.id.e_k)) != null) {
                        cw2.v9.n(finderVideoLayout4, 0, null, null, 7, null);
                    }
                    b0Var.f256763m = false;
                    return;
                }
                b0Var.f256766p = true;
                b0Var.Di();
                if (!b0Var.Zi() || (daVar2 = b0Var.f256757d) == null) {
                    return;
                }
                daVar2.setVideoViewFocused(true);
                if (zy2.g5.u(daVar2, null, 1, null)) {
                    return;
                }
                daVar2.setMute(false);
                return;
            }
            int ordinal3 = b0Var.f256760g.ordinal();
            if (ordinal3 == 0) {
                b0Var.f256766p = true;
                b0Var.Di();
                if (!b0Var.Zi() || (daVar = b0Var.f256757d) == null) {
                    return;
                }
                daVar.pause();
                return;
            }
            if (ordinal3 != 2) {
                return;
            }
            in5.s0 s0Var2 = b0Var.f256761h;
            java.lang.Object videoView = (s0Var2 == null || (finderVideoLayout3 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var2.k(com.tencent.mm.R.id.e_k)) == null) ? null : finderVideoLayout3.getVideoView();
            java.lang.Object obj = videoView instanceof cw2.u9 ? (cw2.u9) videoView : null;
            if (obj != null) {
                ((com.tencent.mm.plugin.finder.video.FinderLivePlayView) obj).pause();
            }
            if (b0Var.f256762i == eu2.e.f256783e) {
                b0Var.f256763m = true;
                com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handleLivePauseAction]: videoView = " + obj + ", pause live feed, livePausedByMediaSessionOrNotificationAction = true");
                return;
            }
            return;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: pause video");
            int ordinal4 = b0Var.f256760g.ordinal();
            if (ordinal4 == 0) {
                b0Var.f256766p = true;
                b0Var.Di();
                if (!eu2.b0.Bi(b0Var)) {
                    com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: keyGuard video is pausing now, update player state!");
                    b0Var.cj(null);
                    return;
                } else {
                    if (!b0Var.Zi()) {
                        com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: keyGuard is not shown!");
                        return;
                    }
                    cw2.da daVar3 = b0Var.f256757d;
                    if (daVar3 != null) {
                        daVar3.w();
                    }
                    com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: keyGuard pause!");
                    b0Var.ij("lock_screen_widget_stop");
                    return;
                }
            }
            if (ordinal4 == 1) {
                kd2.p1.T0(kd2.p1.N.a(), false, false, false, 7, null);
                com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: pause mini view!");
                b0Var.ij("lock_screen_widget_stop");
                return;
            }
            if (ordinal4 != 2) {
                return;
            }
            android.content.res.Configuration configuration = b0Var.f256776z;
            if (configuration != null && configuration.orientation == 2) {
                in5.s0 s0Var3 = b0Var.f256761h;
                cw2.da videoView2 = (s0Var3 == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var3.k(com.tencent.mm.R.id.e_k)) == null) ? null : finderVideoLayout.getVideoView();
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView2 : null;
                java.lang.Object parent = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getParent() : null;
                com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = parent instanceof com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout ? (com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout) parent : null;
                if (finderLandscapePreviewLayout != null) {
                    finderLandscapePreviewLayout.i();
                }
            } else {
                in5.s0 s0Var4 = b0Var.f256761h;
                if (s0Var4 != null && (finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var4.k(com.tencent.mm.R.id.ghd)) != null) {
                    com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.I(finderFullSeekBarLayout, "FinderSystemPlayerDepend", false, 2, null);
                }
            }
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: pause video feed!");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: start play video");
        int ordinal5 = b0Var.f256760g.ordinal();
        if (ordinal5 == 0) {
            b0Var.f256766p = true;
            b0Var.Di();
            if (eu2.b0.Bi(b0Var)) {
                com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: keyGuard video is playing now, update player state!");
                b0Var.cj(null);
                return;
            } else {
                if (!b0Var.Zi()) {
                    com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: keyGuard is not shown!");
                    return;
                }
                cw2.da daVar4 = b0Var.f256757d;
                if (daVar4 != null) {
                    zy2.g5.u(daVar4, null, 1, null);
                }
                com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: keyGuard start play!");
                b0Var.ij("lock_screen_widget_play");
                return;
            }
        }
        if (ordinal5 == 1) {
            kd2.p1.T0(kd2.p1.N.a(), false, false, false, 7, null);
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: mini view start play!");
            b0Var.ij("lock_screen_widget_play");
            return;
        }
        if (ordinal5 != 2) {
            return;
        }
        android.content.res.Configuration configuration2 = b0Var.f256776z;
        if (configuration2 != null && configuration2.orientation == 2) {
            in5.s0 s0Var5 = b0Var.f256761h;
            cw2.da videoView3 = (s0Var5 == null || (finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var5.k(com.tencent.mm.R.id.e_k)) == null) ? null : finderVideoLayout2.getVideoView();
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = videoView3 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView3 : null;
            android.view.ViewParent parent2 = finderThumbPlayerProxy2 != null ? finderThumbPlayerProxy2.getParent() : null;
            com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout2 = parent2 instanceof com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout ? (com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout) parent2 : null;
            if (finderLandscapePreviewLayout2 != null) {
                finderLandscapePreviewLayout2.i();
            }
        } else {
            in5.s0 s0Var6 = b0Var.f256761h;
            if (s0Var6 != null && (finderFullSeekBarLayout2 = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var6.k(com.tencent.mm.R.id.ghd)) != null) {
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.I(finderFullSeekBarLayout2, "FinderSystemPlayerDepend", false, 2, null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handlePlayAction]: mediaType = ");
        cw2.wa waVar = b0Var.f256758e;
        if (waVar != null && (feedData = waVar.f224099f) != null) {
            num = java.lang.Integer.valueOf(feedData.getMediaType());
        }
        sb6.append(num);
        sb6.append(", start play feed stream!");
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerDepend", sb6.toString());
    }

    public final void c(boolean z17) {
        eu2.b0 b0Var = this.f256793d;
        cw2.da daVar = b0Var.f256757d;
        if (b0Var.f256760g == eu2.k.f256794d && b0Var.aj() && daVar != null) {
            if (!z17) {
                b(false);
                b0Var.Ui().Ui(false, eu2.b0.I);
                return;
            }
            b0Var.Ui().Ui(true, eu2.b0.I);
            if (b0Var.f256767q) {
                return;
            }
            if ((daVar instanceof cw2.u9) || daVar.getCurrentPlayMs() != 0) {
                b(true);
            }
        }
    }

    public java.lang.String d() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        cw2.wa waVar = this.f256793d.f256758e;
        if (waVar == null || (feedData = waVar.f224099f) == null) {
            return null;
        }
        return feedData.getNickName();
    }

    public android.graphics.Bitmap e() {
        android.graphics.Bitmap bitmap = this.f256791b.f266872a;
        if (bitmap == null || !(!bitmap.isRecycled())) {
            return null;
        }
        return bitmap;
    }

    public java.util.List f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return kz5.b0.c(eu2.b0.Bi(this.f256793d) ? new z2.f0(com.tencent.mm.R.drawable.f481659c45, "Pause", a(3, context)) : new z2.f0(com.tencent.mm.R.drawable.f481660c46, "Play", a(2, context)));
    }

    public java.lang.String g() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        eu2.b0 b0Var = this.f256793d;
        int ordinal = b0Var.f256762i.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return null;
            }
            throw new jz5.j();
        }
        cw2.wa waVar = b0Var.f256758e;
        if (waVar == null || (feedData = waVar.f224099f) == null) {
            return null;
        }
        return feedData.getDescription();
    }
}
