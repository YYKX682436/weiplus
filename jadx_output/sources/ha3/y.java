package ha3;

/* loaded from: classes15.dex */
public final class y implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f279960d;

    public y(ha3.d0 d0Var) {
        this.f279960d = d0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("complete textureId: ");
        ha3.d0 d0Var = this.f279960d;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f279825o);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "completed");
        d0Var.b(hashMap);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener
    public void onDetailInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detail info textureId: ");
        ha3.d0 d0Var = this.f279960d;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f279825o);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        sb6.append(", detailInfo: ");
        sb6.append(tPPlayerDetailInfo != null ? java.lang.Integer.valueOf(tPPlayerDetailInfo.type) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error textureId: ");
        ha3.d0 d0Var = this.f279960d;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f279825o);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        sb6.append(", url: ");
        sb6.append(d0Var.f279816f);
        sb6.append(", errorType: ");
        sb6.append(i17);
        sb6.append(", errorCode: ");
        sb6.append(i18);
        sb6.append(", arg1: ");
        sb6.append(j17);
        sb6.append(", arg2: ");
        sb6.append(j18);
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = "视频加载失败 errorType: " + i17 + ", errorCode: " + i18;
        hashMap.put("errorType", java.lang.Integer.valueOf(i17));
        hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(i18));
        hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str);
        hashMap.put("errorActionDesc", "重试");
        if (d0Var.f279821k != null) {
            d0Var.a(java.lang.String.valueOf(i18), str, hashMap);
        } else {
            d0Var.f279812b = hashMap;
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on info textureId: ");
        ha3.d0 d0Var = this.f279960d;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f279825o);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        sb6.append(", info: ");
        sb6.append(i17);
        sb6.append(", arg1: ");
        sb6.append(j17);
        sb6.append(", arg2: ");
        sb6.append(j18);
        sb6.append(", extra: ");
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        if (i17 == 108) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "first frame textureId: " + d0Var.f279824n + ", mediaId: " + d0Var.f279825o + ", state: " + d0Var.f279814d);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", "firstFrame");
            d0Var.b(hashMap);
            return;
        }
        if (i17 == 204) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "video decoder type textureId: " + d0Var.f279824n + ", mediaId: " + d0Var.f279825o + ", state: " + d0Var.f279814d + ", decoder type: " + j17);
            return;
        }
        if (i17 == 1000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "player type textureId: " + d0Var.f279824n + ", mediaId: " + d0Var.f279825o + ", state: " + d0Var.f279814d + ", player type: " + j17);
            return;
        }
        if (i17 == 1006) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "buffer update textureId: " + d0Var.f279824n + ", mediaId: " + d0Var.f279825o + ", state: " + d0Var.f279814d);
            d0Var.l(null);
            return;
        }
        if (i17 == 1009) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "is use proxy textureId: " + d0Var.f279824n + ", mediaId: " + d0Var.f279825o + ", state: " + d0Var.f279814d + ", is use proxy: " + j17);
            return;
        }
        if (i17 == 200) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "buffer start textureId: " + d0Var.f279824n + ", mediaId: " + d0Var.f279825o + ", state: " + d0Var.f279814d);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("event", "bufferingStart");
            d0Var.b(hashMap2);
            return;
        }
        if (i17 == 201) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "buffer end textureId: " + d0Var.f279824n + ", mediaId: " + d0Var.f279825o + ", state: " + d0Var.f279814d);
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("event", "bufferingEnd");
            d0Var.b(hashMap3);
            return;
        }
        if (i17 == 502) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("media codec info textureId: ");
            sb7.append(d0Var.f279824n);
            sb7.append(", mediaId: ");
            sb7.append(d0Var.f279825o);
            sb7.append(", state: ");
            sb7.append(d0Var.f279814d);
            sb7.append(", mediaType: ");
            boolean z17 = obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo;
            com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo tPMediaCodecInfo = z17 ? (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) obj : null;
            sb7.append(tPMediaCodecInfo != null ? java.lang.Integer.valueOf(tPMediaCodecInfo.mediaType) : null);
            sb7.append(", infoType: ");
            com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo tPMediaCodecInfo2 = z17 ? (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) obj : null;
            sb7.append(tPMediaCodecInfo2 != null ? java.lang.Integer.valueOf(tPMediaCodecInfo2.infoType) : null);
            sb7.append(", msg: ");
            com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo tPMediaCodecInfo3 = z17 ? (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) obj : null;
            sb7.append(tPMediaCodecInfo3 != null ? tPMediaCodecInfo3.msg : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb7.toString());
            return;
        }
        if (i17 != 503) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "sei info textureId: " + d0Var.f279824n + ", mediaId: " + d0Var.f279825o + ", state: " + d0Var.f279814d);
        if ((obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo ? (com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo) obj : null) != null) {
            byte[] bArr = ((com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo) obj).seiData;
            kotlin.jvm.internal.o.d(bArr);
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
            java.lang.String str = new java.lang.String(bArr, UTF_8);
            int P = r26.n0.P(str, "\\0", 0, false, 6, null);
            if (P != -1 && P == str.length() - 2) {
                str = r26.p0.E0(str, P);
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("event", "getMessage");
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                hashMap4.put("msg", jSONObject2);
                d0Var.b(hashMap4);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayer", e17.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on prepared start textureId: ");
        ha3.d0 d0Var = this.f279960d;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f279825o);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        sb6.append(", url: ");
        sb6.append(d0Var.f279816f);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        if (d0Var.f279815e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayer", "onPrepared video is null.");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "initialized");
        kk4.c cVar = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar);
        hashMap.put("duration", java.lang.Long.valueOf(((kk4.f0) cVar).getDurationMs()));
        kk4.c cVar2 = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar2);
        hashMap.put("width", java.lang.Integer.valueOf(((kk4.f0) cVar2).getVideoWidth()));
        kk4.c cVar3 = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar3);
        hashMap.put("height", java.lang.Integer.valueOf(((kk4.f0) cVar3).getVideoHeight()));
        kk4.c cVar4 = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar4);
        hashMap.put("videoRate", java.lang.Long.valueOf(((kk4.f0) cVar4).getPropertyLong(202)));
        kk4.c cVar5 = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar5);
        hashMap.put("audioRate", java.lang.Long.valueOf(((kk4.f0) cVar5).getPropertyLong(101)));
        kk4.c cVar6 = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar6);
        hashMap.put("videoFrameRate", java.lang.Long.valueOf(((kk4.f0) cVar6).getPropertyLong(206)));
        kk4.c cVar7 = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar7);
        java.lang.String propertyString = ((kk4.f0) cVar7).getPropertyString(0);
        kk4.c cVar8 = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar8);
        long propertyLong = ((kk4.f0) cVar8).getPropertyLong(205);
        if (!d0Var.f279828r) {
            kk4.c cVar9 = d0Var.f279815e;
            kotlin.jvm.internal.o.d(cVar9);
            int videoWidth = ((kk4.f0) cVar9).getVideoWidth();
            kk4.c cVar10 = d0Var.f279815e;
            kotlin.jvm.internal.o.d(cVar10);
            int videoHeight = ((kk4.f0) cVar10).getVideoHeight();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "onPrepared: delayed init renderController with videoWidth=" + videoWidth + ", videoHeight=" + videoHeight);
            if (videoWidth > 0 && videoHeight > 0) {
                io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = d0Var.f279820j;
                if (surfaceProducer != null) {
                    surfaceProducer.setSize(videoWidth, videoHeight);
                }
                ha3.x xVar = new ha3.x(d0Var);
                um5.p pVar = d0Var.f279826p;
                io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = d0Var.f279820j;
                kotlin.jvm.internal.o.d(surfaceProducer2);
                pVar.e(surfaceProducer2.getSurface(), videoWidth, videoHeight);
                d0Var.f279826p.n(xVar);
                d0Var.f279828r = true;
            }
        }
        um5.p pVar2 = d0Var.f279826p;
        kk4.c cVar11 = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar11);
        int videoWidth2 = ((kk4.f0) cVar11).getVideoWidth();
        kk4.c cVar12 = d0Var.f279815e;
        kotlin.jvm.internal.o.d(cVar12);
        pVar2.m(videoWidth2, ((kk4.f0) cVar12).getVideoHeight(), (int) propertyLong);
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("VideoCodec=TP_CODEC_ID_(\\w+)").matcher(propertyString);
        if (matcher.find()) {
            str = matcher.group(1);
            kotlin.jvm.internal.o.f(str, "group(...)");
        } else {
            str = "";
        }
        hashMap.put("videoCodec", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "initializedEvent: " + hashMap);
        if (d0Var.f279821k != null) {
            d0Var.b(hashMap);
        } else {
            d0Var.f279811a = hashMap;
        }
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.e0 b17 = ha3.j0.f279887b.b(d0Var.f279816f);
        if (b17 == null) {
            b17 = new ha3.e0();
        }
        long j17 = b17.f279835c;
        double d17 = 0.0d;
        if (j17 != 0) {
            double d18 = ((b17.f279833a * 100.0d) / j17) * 1.0d;
            if (d18 >= 3.0d) {
                d17 = d18;
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap.put("event", "onHitVideoCache");
        hashMap.put("percent", java.lang.Double.valueOf(d17));
        d0Var.b(hashMap2);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seek complete textureId: ");
        ha3.d0 d0Var = this.f279960d;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f279825o);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onSeekComplete");
        hashMap.put("position", java.lang.Long.valueOf(d0Var.q()));
        d0Var.b(hashMap);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state change textureId: ");
        ha3.d0 d0Var = this.f279960d;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f279825o);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        sb6.append(", preState: ");
        sb6.append(i17);
        sb6.append(", curState: ");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        d0Var.f279814d = i18;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener
    public void onStopAsyncComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop complete textureId: ");
        ha3.d0 d0Var = this.f279960d;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f279825o);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video size change textureId: ");
        ha3.d0 d0Var = this.f279960d;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f279825o);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        sb6.append(", width: ");
        sb6.append(j17);
        sb6.append(", height: ");
        sb6.append(j18);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
    }
}
