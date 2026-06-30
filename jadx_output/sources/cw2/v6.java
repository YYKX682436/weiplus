package cw2;

/* loaded from: classes15.dex */
public final class v6 implements android.view.TextureView.SurfaceTextureListener, mk4.a, com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f224068d;

    public v6(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        this.f224068d = finderThumbPlayerProxy;
    }

    @Override // mk4.a
    public boolean a(java.lang.Object surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        if (surface instanceof android.graphics.SurfaceTexture) {
            return false;
        }
        boolean z17 = surface instanceof android.view.SurfaceHolder;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        if (z17) {
            if (!(finderThumbPlayerProxy.getRenderView() instanceof com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender)) {
                return false;
            }
            mk4.h hVar = finderThumbPlayerProxy.A1;
            mk4.b renderView = finderThumbPlayerProxy.getRenderView();
            kotlin.jvm.internal.o.e(renderView, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender");
            hVar.e((com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender) renderView);
            return false;
        }
        com.tencent.mars.xlog.Log.w(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onSurfaceDestroy() surface:" + surface + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        return false;
    }

    @Override // mk4.a
    public void b(java.lang.Object surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onSurfaceChange  surface:" + surface + ' ' + i17 + ' ' + i18 + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        if (surface instanceof android.graphics.SurfaceTexture) {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.h(finderThumbPlayerProxy, (android.graphics.SurfaceTexture) surface, i17, i18);
            return;
        }
        if (surface instanceof android.view.SurfaceHolder) {
            android.view.SurfaceHolder surfaceHolder = (android.view.SurfaceHolder) surface;
            cw2.z5 z5Var = finderThumbPlayerProxy.G1;
            if (z5Var != null) {
                android.view.Surface surface2 = surfaceHolder.getSurface();
                kotlin.jvm.internal.o.f(surface2, "getSurface(...)");
                z5Var.c(surface2, i17, i18);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.w(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onSurfaceChange() width:" + i17 + " height:" + i18 + " surface:" + surface + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
    }

    @Override // mk4.a
    public void c(java.lang.Object surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        boolean z17 = surface instanceof android.graphics.SurfaceTexture;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        if (z17) {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f(finderThumbPlayerProxy, (android.graphics.SurfaceTexture) surface, i17, i18);
            return;
        }
        if (surface instanceof android.view.SurfaceHolder) {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.g(finderThumbPlayerProxy, (android.view.SurfaceHolder) surface, i17, i18);
            return;
        }
        com.tencent.mars.xlog.Log.w(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onSurfaceAvailable() width:" + i17 + " height:" + i18 + " surface:" + surface + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
    }

    @Override // mk4.a
    public void d(java.lang.Object surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        finderThumbPlayerProxy.q(7);
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onCompletion() " + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        pm0.v.X(new cw2.u6(finderThumbPlayerProxy));
        zy2.ub videoViewCallback = finderThumbPlayerProxy.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa mediaSource = finderThumbPlayerProxy.getMediaSource();
            videoViewCallback.E("", mediaSource != null ? mediaSource.f224096c : null);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer player, int i17, int i18, long j17, long j18) {
        zy2.ub videoViewCallback;
        cw2.wa mediaSource;
        kotlin.jvm.internal.o.g(player, "player");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onError() " + i17 + ' ' + i18 + " bgPrepareStatus:" + finderThumbPlayerProxy.f130677z + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        finderThumbPlayerProxy.P(true);
        finderThumbPlayerProxy.q(10);
        if (i18 == 11030406 && (mediaSource = finderThumbPlayerProxy.getMediaSource()) != null) {
            cu2.x xVar = cu2.x.f222449a;
            long feedId = mediaSource.f224099f.getFeedId();
            java.lang.String str = mediaSource.f224096c;
            mn2.j4 j4Var = mediaSource.f224098e;
            java.lang.String string = j4Var.e().getString(9);
            if (string == null) {
                string = "";
            }
            java.lang.String str2 = mediaSource.f224094a;
            cu2.x.h(xVar, feedId, str, string, str2 != null ? str2 : "", j4Var.b(), j4Var.g(), j4Var.c(), 0L, 0L, 1, j4Var.e().getInteger(3), "", "", false, j4Var.d(), 8192, null);
            cw2.s6 s6Var = finderThumbPlayerProxy.f130669v;
            if (s6Var != null) {
                s6Var.b();
            }
        }
        if (finderThumbPlayerProxy.f130677z != 0) {
            player.reset();
            finderThumbPlayerProxy.F();
            return;
        }
        cw2.wa mediaSource2 = finderThumbPlayerProxy.getMediaSource();
        if (mediaSource2 == null || (videoViewCallback = finderThumbPlayerProxy.getVideoViewCallback()) == null) {
            return;
        }
        videoViewCallback.N("", mediaSource2.f224096c, "", i18, i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        cw2.wa mediaSource;
        cw2.i9 lifecycle;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        r45.mb4 mb4Var;
        r45.mb4 mb4Var2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData3;
        com.tencent.mm.plugin.finder.storage.FeedData feedData4;
        com.tencent.mars.xlog.Log.i(this.f224068d.getFTPPTag(), "FTPP.onInfo() what:" + i17 + " arg1:" + j17 + " arg2:" + j18 + " extraObject:" + obj + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(this.f224068d));
        pw2.b bVar = this.f224068d.f130675y0;
        long j19 = 0;
        if (i17 != 101) {
            if (i17 != 102) {
                if (i17 != 104) {
                    bVar.getClass();
                } else if (bVar.f358689e == 0) {
                    bVar.f358689e = android.os.SystemClock.uptimeMillis();
                }
            } else if (bVar.f358687c == 0) {
                bVar.f358687c = android.os.SystemClock.uptimeMillis();
            }
        } else if (bVar.f358686b == 0) {
            bVar.f358686b = android.os.SystemClock.uptimeMillis();
        }
        if (i17 == 105) {
            com.tencent.mars.xlog.Log.i(this.f224068d.getFTPPTag(), "FTPP.onInfo#firstAudioFrameRendered " + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(this.f224068d));
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
            if (!finderThumbPlayerProxy.isViewFocused || (mediaSource = finderThumbPlayerProxy.getMediaSource()) == null || (lifecycle = this.f224068d.getLifecycle()) == null) {
                return;
            }
            lifecycle.p(new nk4.j(mediaSource.f224099f.getExpectId(), android.os.SystemClock.uptimeMillis(), mediaSource.f224099f.getDupFlag()));
            return;
        }
        java.lang.String str = null;
        r6 = null;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = null;
        str = null;
        if (i17 == 106) {
            com.tencent.mars.xlog.Log.i(this.f224068d.getFTPPTag(), "FTPP.onInfo#firstVideoFrameRendered " + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(this.f224068d));
            kz2.a aVar = this.f224068d.R;
            if (aVar != null) {
                aVar.b("onRendered");
            }
            this.f224068d.Q("onFirstFrameRendered");
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = this.f224068d;
            nk4.a aVar2 = finderThumbPlayerProxy2.f130672x0;
            kz2.a aVar3 = finderThumbPlayerProxy2.R;
            aVar2.E = aVar3 != null ? aVar3.d() : null;
            cw2.i9 lifecycle2 = this.f224068d.getLifecycle();
            if (lifecycle2 != null) {
                cw2.wa mediaSource2 = this.f224068d.getMediaSource();
                lifecycle2.u(mediaSource2 != null ? mediaSource2.f224097d : null, 0L, this.f224068d.R);
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = this.f224068d;
            pw2.b bVar2 = finderThumbPlayerProxy3.f130675y0;
            boolean z17 = finderThumbPlayerProxy3.isViewFocused;
            if (bVar2.f358690f == 0) {
                bVar2.f358697m = z17 ? 1 : 0;
                bVar2.f358690f = android.os.SystemClock.uptimeMillis();
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy4 = this.f224068d;
            finderThumbPlayerProxy4.f130672x0.F = finderThumbPlayerProxy4.f130675y0.a();
            cw2.i9 lifecycle3 = this.f224068d.getLifecycle();
            if (lifecycle3 != null) {
                cw2.wa mediaSource3 = this.f224068d.getMediaSource();
                if (mediaSource3 != null && (feedData2 = mediaSource3.f224099f) != null) {
                    j19 = feedData2.getFeedId();
                }
                long j27 = j19;
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy5 = this.f224068d;
                org.json.JSONObject jSONObject = finderThumbPlayerProxy5.f130672x0.F;
                cw2.wa mediaSource4 = finderThumbPlayerProxy5.getMediaSource();
                if (mediaSource4 != null && (feedData = mediaSource4.f224099f) != null) {
                    str = feedData.getDupFlag();
                }
                lifecycle3.B(new nk4.c(j27, 7, uptimeMillis, jSONObject, str));
            }
            com.tencent.mars.xlog.Log.i(this.f224068d.getFTPPTag(), "FTPP.onInfo#firstVideoFrameRendered " + this.f224068d.f130675y0);
            return;
        }
        if (i17 == 108) {
            com.tencent.mars.xlog.Log.i(this.f224068d.getFTPPTag(), "FTPP.onInfo#firstVideoFrameRenderedAfterSurfaceChange " + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(this.f224068d));
            this.f224068d.R();
            return;
        }
        if (i17 == 204) {
            java.lang.String fTPPTag = this.f224068d.getFTPPTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onInfo#videoDecodeType:");
            sb6.append(j17);
            sb6.append(' ');
            cw2.wa mediaSource5 = this.f224068d.getMediaSource();
            sb6.append(mediaSource5 != null ? mediaSource5.f224096c : null);
            com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
            cw2.wa mediaSource6 = this.f224068d.getMediaSource();
            if (((mediaSource6 == null || (mb4Var2 = mediaSource6.f224097d) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var2.getCustom(69)) == null) {
                cw2.wa mediaSource7 = this.f224068d.getMediaSource();
                r45.mb4 mb4Var3 = mediaSource7 != null ? mediaSource7.f224097d : null;
                if (mb4Var3 != null) {
                    mb4Var3.set(69, new com.tencent.mm.protocal.protobuf.FinderMediaReportObject());
                }
            }
            int i18 = (int) j17;
            if (i18 == 102) {
                cw2.p6 p6Var = this.f224068d.T;
                p6Var.getClass();
                p6Var.f223932c = "MediaCodec";
            } else {
                cw2.p6 p6Var2 = this.f224068d.T;
                p6Var2.getClass();
                p6Var2.f223932c = "FFmpeg";
            }
            cw2.wa mediaSource8 = this.f224068d.getMediaSource();
            if (mediaSource8 != null && (mb4Var = mediaSource8.f224097d) != null) {
                finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
            }
            if (finderMediaReportObject == null) {
                return;
            }
            finderMediaReportObject.setPlayDecoderType(i18);
            return;
        }
        int i19 = 1;
        if (i17 == 502) {
            java.lang.String fTPPTag2 = this.f224068d.getFTPPTag();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FTPP.onInfo#mediaCodecInfo:");
            sb7.append(j17);
            sb7.append(' ');
            cw2.wa mediaSource9 = this.f224068d.getMediaSource();
            sb7.append(mediaSource9 != null ? mediaSource9.f224096c : null);
            com.tencent.mars.xlog.Log.i(fTPPTag2, sb7.toString());
            if (!(obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo)) {
                com.tencent.mars.xlog.Log.w(this.f224068d.getFTPPTag(), "FTPP.onInfo#mediaCodecInfo return for not codecInfo");
                return;
            }
            com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo tPMediaCodecInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) obj;
            if (tPMediaCodecInfo.mediaType != com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_DEC_MEDIA_TYPE_VIDEO) {
                com.tencent.mars.xlog.Log.w(this.f224068d.getFTPPTag(), "FTPP.onInfo#mediaCodecInfo return for not video type");
                return;
            }
            int i27 = tPMediaCodecInfo.infoType;
            try {
                if (i27 == com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_READY) {
                    cl0.g gVar = new cl0.g(((com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) obj).msg);
                    nk4.t tVar = this.f224068d.A;
                    if (tVar != null) {
                        tVar.f338105c = gVar.optBoolean("reuseEnable") ? 1 : -1;
                    }
                    nk4.t tVar2 = this.f224068d.A;
                    if (tVar2 != null) {
                        if (!gVar.optBoolean("isReuse")) {
                            i19 = -1;
                        }
                        tVar2.f338106d = i19;
                    }
                    nk4.t tVar3 = this.f224068d.A;
                    if (tVar3 != null) {
                        tVar3.f338107e = gVar.optInt("totalCodec");
                    }
                } else if (i27 == com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_EXCEPTION) {
                    cl0.g gVar2 = new cl0.g(((com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) obj).msg);
                    nk4.t tVar4 = this.f224068d.A;
                    if (tVar4 != null) {
                        tVar4.f338108f = gVar2.optString("errorCodec");
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            cw2.i9 lifecycle4 = this.f224068d.getLifecycle();
            if (lifecycle4 != null) {
                cw2.wa mediaSource10 = this.f224068d.getMediaSource();
                lifecycle4.g(mediaSource10 != null ? mediaSource10.f224097d : null, this.f224068d.A);
                return;
            }
            return;
        }
        if (i17 == 1006) {
            if (obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) {
                com.tencent.mars.xlog.Log.i(this.f224068d.getFTPPTag(), "FTPP.onInfo#downloadProgressUpdate: " + ((com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) obj).playableDurationMS);
                return;
            }
            return;
        }
        if (i17 == 150) {
            com.tencent.mars.xlog.Log.i(this.f224068d.getFTPPTag(), "FTPP.onInfo#onLoopStart() " + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(this.f224068d));
            return;
        }
        if (i17 == 151) {
            com.tencent.mars.xlog.Log.i(this.f224068d.getFTPPTag(), "FTPP.onInfo#onLoopEnd()  " + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(this.f224068d));
            cw2.i9 lifecycle5 = this.f224068d.getLifecycle();
            if (lifecycle5 != null) {
                cw2.wa mediaSource11 = this.f224068d.getMediaSource();
                lifecycle5.F(mediaSource11 != null ? mediaSource11.f224097d : null);
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464684a.a();
            return;
        }
        if (i17 == 200) {
            java.lang.String fTPPTag3 = this.f224068d.getFTPPTag();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("FTPP.onInfo#onBufferingStart() pos:");
            sb8.append(this.f224068d.getCurrentPlayMs());
            sb8.append(" feedId:");
            cw2.wa mediaSource12 = this.f224068d.getMediaSource();
            if (mediaSource12 != null && (feedData3 = mediaSource12.f224099f) != null) {
                j19 = feedData3.getFeedId();
            }
            sb8.append(pm0.v.u(j19));
            sb8.append(' ');
            sb8.append(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(this.f224068d));
            com.tencent.mars.xlog.Log.i(fTPPTag3, sb8.toString());
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy6 = this.f224068d;
            cw2.wa mediaSource13 = finderThumbPlayerProxy6.getMediaSource();
            java.lang.String str2 = mediaSource13 != null ? mediaSource13.f224096c : null;
            java.lang.Runnable runnable = finderThumbPlayerProxy6.H;
            if (runnable != null) {
                finderThumbPlayerProxy6.G.removeCallbacks(runnable);
                finderThumbPlayerProxy6.H = null;
            }
            cw2.b7 b7Var = new cw2.b7(finderThumbPlayerProxy6, str2);
            finderThumbPlayerProxy6.H = b7Var;
            finderThumbPlayerProxy6.G.postDelayed(b7Var, (!finderThumbPlayerProxy6.f130665r || finderThumbPlayerProxy6.isSeeking) ? 1000L : 500L);
            return;
        }
        if (i17 == 201) {
            java.lang.String fTPPTag4 = this.f224068d.getFTPPTag();
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("FTPP.onInfo#onBufferingEnd() pos:");
            sb9.append(this.f224068d.getCurrentPlayMs());
            sb9.append(" feedId:");
            cw2.wa mediaSource14 = this.f224068d.getMediaSource();
            if (mediaSource14 != null && (feedData4 = mediaSource14.f224099f) != null) {
                j19 = feedData4.getFeedId();
            }
            sb9.append(pm0.v.u(j19));
            sb9.append(' ');
            sb9.append(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(this.f224068d));
            com.tencent.mars.xlog.Log.i(fTPPTag4, sb9.toString());
            this.f224068d.P(true);
            return;
        }
        if (i17 == 260) {
            java.lang.String fTPPTag5 = this.f224068d.getFTPPTag();
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("FTPP.onInfo#mediaCodecOpenStuck:");
            sb10.append(j17);
            sb10.append(' ');
            cw2.wa mediaSource15 = this.f224068d.getMediaSource();
            sb10.append(mediaSource15 != null ? mediaSource15.f224096c : null);
            com.tencent.mars.xlog.Log.w(fTPPTag5, sb10.toString());
            this.f224068d.f130672x0.f338063z = (int) j17;
            return;
        }
        if (i17 != 261) {
            return;
        }
        java.lang.String fTPPTag6 = this.f224068d.getFTPPTag();
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("FTPP.onInfo#mediaCodecCloseStuck:");
        sb11.append(j17);
        sb11.append(' ');
        cw2.wa mediaSource16 = this.f224068d.getMediaSource();
        sb11.append(mediaSource16 != null ? mediaSource16.f224096c : null);
        com.tencent.mars.xlog.Log.w(fTPPTag6, sb11.toString());
        this.f224068d.f130672x0.A = (int) j17;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer player) {
        cw2.i9 lifecycle;
        so2.i3 i3Var;
        cw2.i9 lifecycle2;
        kotlin.jvm.internal.o.g(player, "player");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.OnPrepared() " + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        kz2.a aVar = finderThumbPlayerProxy.R;
        if (aVar != null) {
            aVar.c("onPrepared");
        }
        pw2.b bVar = finderThumbPlayerProxy.f130675y0;
        if (bVar.f358686b == 0) {
            bVar.f358688d = android.os.SystemClock.uptimeMillis();
        }
        finderThumbPlayerProxy.q(4);
        java.lang.String fTPPTag = finderThumbPlayerProxy.getFTPPTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dFile:");
        sb6.append(finderThumbPlayerProxy.getRequestOffset());
        sb6.append('/');
        sb6.append(finderThumbPlayerProxy.f130649d2);
        sb6.append(':');
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((((float) finderThumbPlayerProxy.getRequestOffset()) * 100.0f) / ((float) finderThumbPlayerProxy.f130649d2))}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append("% ");
        com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
        zy2.ub videoViewCallback = finderThumbPlayerProxy.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa mediaSource = finderThumbPlayerProxy.getMediaSource();
            videoViewCallback.o("", mediaSource != null ? mediaSource.f224096c : null);
        }
        cw2.wa mediaSource2 = finderThumbPlayerProxy.getMediaSource();
        if (mediaSource2 != null && (lifecycle2 = finderThumbPlayerProxy.getLifecycle()) != null) {
            com.tencent.mm.plugin.finder.storage.FeedData feedData = mediaSource2.f224099f;
            lifecycle2.C(new nk4.q(feedData.getExpectId(), ((kk4.f0) finderThumbPlayerProxy.getPlayer()).f308532h, android.os.SystemClock.uptimeMillis(), feedData.getDupFlag()));
        }
        if (finderThumbPlayerProxy.isViewFocused) {
            finderThumbPlayerProxy.X(2);
        } else if (finderThumbPlayerProxy.W()) {
            finderThumbPlayerProxy.setBgPrepareStatus(1);
            player.pauseDownload();
        }
        cw2.s6 s6Var = finderThumbPlayerProxy.f130669v;
        if (s6Var != null && (i3Var = s6Var.f224002g) != null) {
            i3Var.field_audioBitrate = (int) player.getPropertyLong(101);
            i3Var.field_videoBitrate = (int) player.getPropertyLong(202);
            i3Var.field_frameRate = (int) player.getPropertyLong(206);
            i3Var.field_videoCodecId = (int) player.getPropertyLong(201);
            long j17 = i3Var.field_audioBitrate + i3Var.field_videoBitrate;
            finderThumbPlayerProxy.F1 = j17;
            finderThumbPlayerProxy.T.f223938i = j17;
            finderThumbPlayerProxy.f130672x0.f338058u = i3Var.field_frameRate;
        }
        cw2.d0 playerBufferController = finderThumbPlayerProxy.getPlayerBufferController();
        if (playerBufferController != null) {
            long j18 = finderThumbPlayerProxy.F1;
            long durationMs = player.getDurationMs();
            com.tencent.mars.xlog.Log.i(playerBufferController.d(), "onPrepared durationMs:" + durationMs + " bitrate:" + j18);
        }
        zy2.ub videoViewCallback2 = finderThumbPlayerProxy.getVideoViewCallback();
        if (videoViewCallback2 != null) {
            cw2.wa mediaSource3 = finderThumbPlayerProxy.getMediaSource();
            videoViewCallback2.o("", mediaSource3 != null ? mediaSource3.f224096c : null);
        }
        cw2.wa mediaSource4 = finderThumbPlayerProxy.getMediaSource();
        if (mediaSource4 != null && (lifecycle = finderThumbPlayerProxy.getLifecycle()) != null) {
            com.tencent.mm.plugin.finder.storage.FeedData feedData2 = mediaSource4.f224099f;
            lifecycle.C(new nk4.q(feedData2.getFeedId(), ((kk4.f0) finderThumbPlayerProxy.getPlayer()).f308532h, android.os.SystemClock.uptimeMillis(), feedData2.getDupFlag()));
        }
        if (finderThumbPlayerProxy.isViewFocused) {
            finderThumbPlayerProxy.X(2);
        } else if (finderThumbPlayerProxy.W()) {
            finderThumbPlayerProxy.setBgPrepareStatus(1);
            player.pauseDownload();
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener onSeekCompleteListener = finderThumbPlayerProxy.getOnSeekCompleteListener();
        if (onSeekCompleteListener != null) {
            onSeekCompleteListener.onSeekComplete(iTPPlayer);
        }
        finderThumbPlayerProxy.setOnSeekCompleteListener(null);
        pw2.b bVar = finderThumbPlayerProxy.f130675y0;
        if (bVar.f358693i == 0) {
            bVar.f358693i = android.os.SystemClock.uptimeMillis();
        }
        finderThumbPlayerProxy.setSeeking(false);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onStateChange() preState:" + i17 + " curState:" + i18 + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f(this.f224068d, surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onSurfaceTextureDestroyed() surfaceTexture:" + surfaceTexture.hashCode() + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onSurfaceTextureSizeChanged  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i17 + ' ' + i18 + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.h(finderThumbPlayerProxy, surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        finderThumbPlayerProxy.getClass();
        finderThumbPlayerProxy.f130672x0.f338045e++;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        cw2.i9 lifecycle;
        java.lang.String str;
        mn2.j4 j4Var;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        java.util.LinkedList<r45.mb4> mediaList;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData3;
        so2.i3 i3Var;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224068d;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.OnVideoSizeChanged() width:" + j17 + " height:" + j18 + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        int i17 = (int) j17;
        int i18 = (int) j18;
        finderThumbPlayerProxy.getRenderView().a(i17, i18);
        finderThumbPlayerProxy.setVideoResolutionSize(new android.util.Size(i17, i18));
        finderThumbPlayerProxy.H();
        cw2.z5 z5Var = finderThumbPlayerProxy.G1;
        if (z5Var != null) {
            z5Var.b(i17, i18);
        }
        cw2.s6 s6Var = finderThumbPlayerProxy.f130669v;
        if (s6Var != null && (i3Var = s6Var.f224002g) != null) {
            i3Var.field_enhanceStrategy = finderThumbPlayerProxy.L;
            i3Var.field_enhanceGPUScore = finderThumbPlayerProxy.M;
            i3Var.field_enhanceStrength = finderThumbPlayerProxy.N;
        }
        cw2.wa mediaSource = finderThumbPlayerProxy.getMediaSource();
        java.lang.Long valueOf = (mediaSource == null || (feedData3 = mediaSource.f224099f) == null) ? null : java.lang.Long.valueOf(feedData3.getFeedId());
        cw2.wa mediaSource2 = finderThumbPlayerProxy.getMediaSource();
        java.lang.Integer valueOf2 = (mediaSource2 == null || (feedData2 = mediaSource2.f224099f) == null) ? null : java.lang.Integer.valueOf(feedData2.getPosition());
        cw2.wa mediaSource3 = finderThumbPlayerProxy.getMediaSource();
        bu2.h0 d17 = (mediaSource3 == null || (feedData = mediaSource3.f224099f) == null || (mediaList = feedData.getMediaList()) == null) ? null : bu2.z.d(mediaList, "FTPP.FinderThumbPlayerProxy", false);
        com.tencent.mars.xlog.Log.i("FTPP.FinderThumbPlayerProxy", "onVideoSizeChanged: width: %s, height: %s, feedId: %s, position: %s, mediaHWRatio: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), valueOf, valueOf2, d17 != null ? java.lang.Float.valueOf(d17.f24516a) : null);
        if (valueOf == null || valueOf2 == null || d17 == null || (lifecycle = finderThumbPlayerProxy.getLifecycle()) == null) {
            return;
        }
        long longValue = valueOf.longValue();
        cw2.wa mediaSource4 = finderThumbPlayerProxy.getMediaSource();
        java.lang.String str2 = mediaSource4 != null ? mediaSource4.f224096c : null;
        int intValue = valueOf2.intValue();
        cw2.wa mediaSource5 = finderThumbPlayerProxy.getMediaSource();
        if (mediaSource5 == null || (j4Var = mediaSource5.f224098e) == null || (str = j4Var.g()) == null) {
            str = "";
        }
        lifecycle.t(j17, j18, longValue, str2, intValue, d17, str);
    }
}
