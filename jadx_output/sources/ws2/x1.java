package ws2;

/* loaded from: classes15.dex */
public final class x1 implements android.view.TextureView.SurfaceTextureListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy f449155d;

    public x1(com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy) {
        this.f449155d = finderLiveThumbPlayerProxy;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.util.HashSet hashSet = com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.N;
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
        finderLiveThumbPlayerProxy.f(7);
        com.tencent.mars.xlog.Log.i(finderLiveThumbPlayerProxy.getFTPPTag(), "FTPP.onCompletion() " + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(finderLiveThumbPlayerProxy));
        com.tencent.mm.pluginsdk.ui.b1 videoViewCallback = finderLiveThumbPlayerProxy.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa waVar = finderLiveThumbPlayerProxy.f124897p;
            videoViewCallback.E("", waVar != null ? waVar.f224096c : null);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer player, int i17, int i18, long j17, long j18) {
        com.tencent.mm.pluginsdk.ui.b1 videoViewCallback;
        kotlin.jvm.internal.o.g(player, "player");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
        com.tencent.mars.xlog.Log.i(finderLiveThumbPlayerProxy.getFTPPTag(), "FTPP.onError() " + i17 + ' ' + i18 + " bgPrepareStatus:" + finderLiveThumbPlayerProxy.f124902u + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(finderLiveThumbPlayerProxy));
        if (finderLiveThumbPlayerProxy.f124902u != 0) {
            player.reset();
            finderLiveThumbPlayerProxy.F();
            return;
        }
        cw2.wa waVar = finderLiveThumbPlayerProxy.f124897p;
        if (waVar == null || (videoViewCallback = finderLiveThumbPlayerProxy.getVideoViewCallback()) == null) {
            return;
        }
        videoViewCallback.N("", waVar.f224096c, "", i18, i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        r45.mb4 mb4Var;
        r45.mb4 mb4Var2;
        yz5.p seiInfoCallback;
        com.tencent.mars.xlog.Log.i(this.f449155d.getFTPPTag(), "FTPP.onInfo() what:" + i17 + " arg1:" + j17 + " arg2:" + j18 + " extraObject:" + obj + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(this.f449155d));
        if (i17 == 105) {
            com.tencent.mars.xlog.Log.i(this.f449155d.getFTPPTag(), "FTPP.onInfo#firstAudioFrameRendered " + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(this.f449155d));
            return;
        }
        r8 = null;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = null;
        if (i17 == 106) {
            com.tencent.mars.xlog.Log.i(this.f449155d.getFTPPTag(), "FTPP.onInfo#firstVideoFrameRendered " + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(this.f449155d));
            this.f449155d.g("onFirstFrameRendered");
            kz2.a aVar = this.f449155d.B;
            if (aVar != null) {
                aVar.b("onRendered");
            }
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
            nk4.a aVar2 = finderLiveThumbPlayerProxy.F;
            kz2.a aVar3 = finderLiveThumbPlayerProxy.B;
            aVar2.E = aVar3 != null ? aVar3.d() : null;
            cw2.fb lifecycle = this.f449155d.getLifecycle();
            if (lifecycle != null) {
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy2 = this.f449155d;
                cw2.wa waVar = finderLiveThumbPlayerProxy2.f124897p;
                lifecycle.u(waVar != null ? waVar.f224097d : null, 0L, finderLiveThumbPlayerProxy2.B);
                return;
            }
            return;
        }
        if (i17 == 150) {
            com.tencent.mars.xlog.Log.i(this.f449155d.getFTPPTag(), "FTPP.onInfo#onReplay() " + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(this.f449155d));
            cw2.fb lifecycle2 = this.f449155d.getLifecycle();
            if (lifecycle2 != null) {
                cw2.wa waVar2 = this.f449155d.f124897p;
                lifecycle2.F(waVar2 != null ? waVar2.f224097d : null);
                return;
            }
            return;
        }
        if (i17 == 204) {
            java.lang.String fTPPTag = this.f449155d.getFTPPTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onInfo#videoDecodeType:");
            sb6.append(j17);
            sb6.append(' ');
            cw2.wa waVar3 = this.f449155d.f124897p;
            sb6.append(waVar3 != null ? waVar3.f224096c : null);
            com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
            cw2.wa waVar4 = this.f449155d.f124897p;
            if (((waVar4 == null || (mb4Var2 = waVar4.f224097d) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var2.getCustom(69)) == null) {
                cw2.wa waVar5 = this.f449155d.f124897p;
                r45.mb4 mb4Var3 = waVar5 != null ? waVar5.f224097d : null;
                if (mb4Var3 != null) {
                    mb4Var3.set(69, new com.tencent.mm.protocal.protobuf.FinderMediaReportObject());
                }
            }
            cw2.wa waVar6 = this.f449155d.f124897p;
            if (waVar6 != null && (mb4Var = waVar6.f224097d) != null) {
                finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
            }
            if (finderMediaReportObject == null) {
                return;
            }
            finderMediaReportObject.setPlayDecoderType((int) j17);
            return;
        }
        if (i17 == 1006) {
            if (obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) {
                java.lang.String fTPPTag2 = this.f449155d.getFTPPTag();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FTPP.onInfo#downloadProgressUpdate: ");
                com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) obj;
                sb7.append(tPDownLoadProgressInfo.playableDurationMS);
                sb7.append(',');
                sb7.append(tPDownLoadProgressInfo.downloadSpeedKBps);
                sb7.append(',');
                sb7.append(tPDownLoadProgressInfo.currentDownloadSize);
                sb7.append(',');
                sb7.append(tPDownLoadProgressInfo.totalFileSize);
                com.tencent.mars.xlog.Log.i(fTPPTag2, sb7.toString());
                return;
            }
            return;
        }
        if (i17 == 200) {
            com.tencent.mars.xlog.Log.i(this.f449155d.getFTPPTag(), "FTPP.onInfo#onBufferingStart() pos:" + this.f449155d.getCurrentPlayMs() + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(this.f449155d));
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy3 = this.f449155d;
            cw2.wa waVar7 = finderLiveThumbPlayerProxy3.f124897p;
            java.lang.String str = waVar7 != null ? waVar7.f224096c : null;
            java.lang.Runnable runnable = finderLiveThumbPlayerProxy3.f124906y;
            if (runnable != null) {
                finderLiveThumbPlayerProxy3.f124905x.removeCallbacks(runnable);
                finderLiveThumbPlayerProxy3.f124906y = null;
            }
            ws2.y1 y1Var = new ws2.y1(finderLiveThumbPlayerProxy3, str);
            finderLiveThumbPlayerProxy3.f124906y = y1Var;
            finderLiveThumbPlayerProxy3.f124905x.postDelayed(y1Var, finderLiveThumbPlayerProxy3.f124896o ? 500L : 1000L);
            return;
        }
        int i18 = 1;
        if (i17 == 201) {
            com.tencent.mars.xlog.Log.i(this.f449155d.getFTPPTag(), "FTPP.onInfo#onBufferingEnd() pos:" + this.f449155d.getCurrentPlayMs() + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(this.f449155d));
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy4 = this.f449155d;
            java.lang.Runnable runnable2 = finderLiveThumbPlayerProxy4.f124906y;
            if (runnable2 != null) {
                finderLiveThumbPlayerProxy4.f124905x.removeCallbacks(runnable2);
                finderLiveThumbPlayerProxy4.f124906y = null;
            }
            if (finderLiveThumbPlayerProxy4.f124900s) {
                finderLiveThumbPlayerProxy4.f124900s = false;
                com.tencent.mm.pluginsdk.ui.b1 b1Var = finderLiveThumbPlayerProxy4.videoViewCallback;
                if (b1Var != null) {
                    cw2.wa waVar8 = finderLiveThumbPlayerProxy4.f124897p;
                    b1Var.m2("", waVar8 != null ? waVar8.f224096c : null, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 502) {
            if (i17 != 503) {
                return;
            }
            com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo = obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo ? (com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo) obj : null;
            if (tPVideoSeiInfo == null || (seiInfoCallback = this.f449155d.getSeiInfoCallback()) == null) {
                return;
            }
            seiInfoCallback.invoke(java.lang.Integer.valueOf(tPVideoSeiInfo.videoSeiType), obj);
            return;
        }
        java.lang.String fTPPTag3 = this.f449155d.getFTPPTag();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("FTPP.onInfo#mediaCodecInfo:");
        sb8.append(j17);
        sb8.append(' ');
        cw2.wa waVar9 = this.f449155d.f124897p;
        sb8.append(waVar9 != null ? waVar9.f224096c : null);
        com.tencent.mars.xlog.Log.i(fTPPTag3, sb8.toString());
        if (!(obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo)) {
            com.tencent.mars.xlog.Log.w(this.f449155d.getFTPPTag(), "FTPP.onInfo#mediaCodecInfo return for not codecInfo");
            return;
        }
        com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo tPMediaCodecInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) obj;
        if (tPMediaCodecInfo.mediaType != com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_DEC_MEDIA_TYPE_VIDEO) {
            com.tencent.mars.xlog.Log.w(this.f449155d.getFTPPTag(), "FTPP.onInfo#mediaCodecInfo return for not video type");
            return;
        }
        int i19 = tPMediaCodecInfo.infoType;
        try {
            if (i19 == com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_READY) {
                cl0.g gVar = new cl0.g(((com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) obj).msg);
                nk4.t tVar = this.f449155d.f124903v;
                if (tVar != null) {
                    tVar.f338105c = gVar.optBoolean("reuseEnable") ? 1 : -1;
                }
                nk4.t tVar2 = this.f449155d.f124903v;
                if (tVar2 != null) {
                    if (!gVar.optBoolean("isReuse")) {
                        i18 = -1;
                    }
                    tVar2.f338106d = i18;
                }
                nk4.t tVar3 = this.f449155d.f124903v;
                if (tVar3 != null) {
                    tVar3.f338107e = gVar.optInt("totalCodec");
                }
            } else if (i19 == com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_EXCEPTION) {
                cl0.g gVar2 = new cl0.g(((com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) obj).msg);
                nk4.t tVar4 = this.f449155d.f124903v;
                if (tVar4 != null) {
                    tVar4.f338108f = gVar2.optString("errorCodec");
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        cw2.fb lifecycle3 = this.f449155d.getLifecycle();
        if (lifecycle3 != null) {
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy5 = this.f449155d;
            cw2.wa waVar10 = finderLiveThumbPlayerProxy5.f124897p;
            lifecycle3.g(waVar10 != null ? waVar10.f224097d : null, finderLiveThumbPlayerProxy5.f124903v);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer player) {
        kotlin.jvm.internal.o.g(player, "player");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
        com.tencent.mars.xlog.Log.i(finderLiveThumbPlayerProxy.getFTPPTag(), "FTPP.OnPrepared() " + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(finderLiveThumbPlayerProxy));
        kz2.a aVar = finderLiveThumbPlayerProxy.B;
        if (aVar != null) {
            aVar.c("onPrepared");
        }
        finderLiveThumbPlayerProxy.f(4);
        com.tencent.mm.pluginsdk.ui.b1 videoViewCallback = finderLiveThumbPlayerProxy.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa waVar = finderLiveThumbPlayerProxy.f124897p;
            videoViewCallback.o("", waVar != null ? waVar.f224096c : null);
        }
        if (!finderLiveThumbPlayerProxy.isViewFocused || finderLiveThumbPlayerProxy.E) {
            finderLiveThumbPlayerProxy.setBgPrepareStatus(1);
            player.pauseDownload();
        } else {
            finderLiveThumbPlayerProxy.o(2);
        }
        finderLiveThumbPlayerProxy.E = false;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.pluginsdk.ui.b1 videoViewCallback = this.f449155d.getVideoViewCallback();
        if (videoViewCallback != null) {
            videoViewCallback.onSeekComplete(iTPPlayer);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
        com.tencent.mars.xlog.Log.i(finderLiveThumbPlayerProxy.getFTPPTag(), "FTPP.onStateChange() preState:" + i17 + " curState:" + i18 + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(finderLiveThumbPlayerProxy));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.Boolean valueOf;
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
        com.tencent.mars.xlog.Log.i(finderLiveThumbPlayerProxy.getFTPPTag(), "FTPP.onSurfaceTextureAvailable() width:" + i17 + " height:" + i18 + " surfaceTexture:" + surfaceTexture.hashCode() + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(finderLiveThumbPlayerProxy));
        kz2.a aVar = finderLiveThumbPlayerProxy.B;
        if (aVar != null) {
            aVar.c("onSurfaceAva");
        }
        if (finderLiveThumbPlayerProxy.f124893i == null) {
            finderLiveThumbPlayerProxy.f124894m = surfaceTexture;
            finderLiveThumbPlayerProxy.f124893i = new android.view.Surface(surfaceTexture);
            kk4.c cVar = finderLiveThumbPlayerProxy.f124890f;
            if (cVar == null) {
                kotlin.jvm.internal.o.o("player");
                throw null;
            }
            ((kk4.f0) cVar).setSurface(finderLiveThumbPlayerProxy.f124893i);
            finderLiveThumbPlayerProxy.o(1);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            valueOf = java.lang.Boolean.FALSE;
        } else {
            android.graphics.SurfaceTexture surfaceTexture2 = finderLiveThumbPlayerProxy.f124894m;
            valueOf = surfaceTexture2 != null ? java.lang.Boolean.valueOf(surfaceTexture2.isReleased()) : null;
        }
        java.lang.String fTPPTag = finderLiveThumbPlayerProxy.getFTPPTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onSurfaceTextureAvailable() return for surface:");
        android.view.Surface surface = finderLiveThumbPlayerProxy.f124893i;
        sb6.append(surface != null ? java.lang.Integer.valueOf(surface.hashCode()) : null);
        sb6.append(" valid:");
        android.view.Surface surface2 = finderLiveThumbPlayerProxy.f124893i;
        sb6.append(surface2 != null ? java.lang.Boolean.valueOf(surface2.isValid()) : null);
        sb6.append(" released:");
        sb6.append(valueOf);
        sb6.append(" isReusing:");
        sb6.append(finderLiveThumbPlayerProxy.D);
        com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
        pk4.b bVar = finderLiveThumbPlayerProxy.f124892h;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
        android.graphics.SurfaceTexture surfaceTexture3 = finderLiveThumbPlayerProxy.f124894m;
        kotlin.jvm.internal.o.d(surfaceTexture3);
        bVar.setSurfaceTexture(surfaceTexture3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
        com.tencent.mars.xlog.Log.i(finderLiveThumbPlayerProxy.getFTPPTag(), "FTPP.onSurfaceTextureDestroyed() surfaceTexture:" + surfaceTexture.hashCode() + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(finderLiveThumbPlayerProxy));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
        com.tencent.mars.xlog.Log.i(finderLiveThumbPlayerProxy.getFTPPTag(), "FTPP.onSurfaceTextureSizeChanged  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i17 + ' ' + i18 + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(finderLiveThumbPlayerProxy));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
        finderLiveThumbPlayerProxy.getClass();
        finderLiveThumbPlayerProxy.F.f338045e++;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        java.lang.String str;
        cw2.wa waVar;
        mn2.j4 j4Var;
        r45.mb4 e17;
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449155d;
        com.tencent.mars.xlog.Log.i(finderLiveThumbPlayerProxy.getFTPPTag(), "FTPP.OnVideoSizeChanged() width:" + j17 + " height:" + j18 + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(finderLiveThumbPlayerProxy));
        if (j17 > 0 && j18 > 0 && (waVar = finderLiveThumbPlayerProxy.f124897p) != null && (j4Var = waVar.f224098e) != null && (e17 = j4Var.e()) != null) {
            e17.set(4, java.lang.Float.valueOf((float) j17));
            e17.set(5, java.lang.Float.valueOf((float) j18));
        }
        com.tencent.mm.pluginsdk.ui.b1 videoViewCallback = finderLiveThumbPlayerProxy.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa waVar2 = finderLiveThumbPlayerProxy.f124897p;
            if (waVar2 == null || (str = waVar2.f224096c) == null) {
                str = "";
            }
            videoViewCallback.I("", str, (int) j17, (int) j18);
        }
        pk4.b bVar = finderLiveThumbPlayerProxy.f124892h;
        if (bVar != null) {
            ((com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView) bVar).m((int) j17, (int) j18);
        } else {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
    }
}
