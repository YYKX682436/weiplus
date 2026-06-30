package ha3;

/* loaded from: classes15.dex */
public final class i implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279872d;

    public i(ha3.v vVar) {
        this.f279872d = vVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("complete textureId: ");
        ha3.v vVar = this.f279872d;
        sb6.append(vVar.f279955q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f279956r);
        sb6.append(", state: ");
        sb6.append(vVar.f279946h);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "completed");
        vVar.b(hashMap);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener
    public void onDetailInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detail info textureId: ");
        ha3.v vVar = this.f279872d;
        sb6.append(vVar.f279955q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f279956r);
        sb6.append(", state: ");
        sb6.append(vVar.f279946h);
        sb6.append(", detailInfo: ");
        sb6.append(tPPlayerDetailInfo != null ? java.lang.Integer.valueOf(tPPlayerDetailInfo.type) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error textureId: ");
        ha3.v vVar = this.f279872d;
        sb6.append(vVar.f279955q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f279956r);
        sb6.append(", state: ");
        sb6.append(vVar.f279946h);
        sb6.append(", url: ");
        sb6.append(vVar.f279939a);
        sb6.append(", errorType: ");
        sb6.append(i17);
        sb6.append(", errorCode: ");
        sb6.append(i18);
        sb6.append(", arg1: ");
        sb6.append(j17);
        sb6.append(", arg2: ");
        sb6.append(j18);
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = "视频加载失败 errorType: " + i17 + ", errorCode: " + i18;
        hashMap.put("errorType", java.lang.Integer.valueOf(i17));
        hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(i18));
        hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str);
        hashMap.put("errorActionDesc", "重试");
        if (vVar.f279951m != null) {
            vVar.a(java.lang.String.valueOf(i18), str, hashMap);
        } else {
            vVar.f279944f = hashMap;
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on info textureId: ");
        ha3.v vVar = this.f279872d;
        sb6.append(vVar.f279955q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f279956r);
        sb6.append(", state: ");
        sb6.append(vVar.f279946h);
        sb6.append(", info: ");
        sb6.append(i17);
        sb6.append(", arg1: ");
        sb6.append(j17);
        sb6.append(", arg2: ");
        sb6.append(j18);
        sb6.append(", extra: ");
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        if (i17 == 108) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "first frame textureId: " + vVar.f279955q + ", mediaId: " + vVar.f279956r + ", state: " + vVar.f279946h);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", "firstFrame");
            vVar.b(hashMap);
            return;
        }
        if (i17 == 204) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "video decoder type textureId: " + vVar.f279955q + ", mediaId: " + vVar.f279956r + ", state: " + vVar.f279946h + ", decoder type: " + j17);
            return;
        }
        if (i17 == 1000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "player type textureId: " + vVar.f279955q + ", mediaId: " + vVar.f279956r + ", state: " + vVar.f279946h + ", player type: " + j17);
            return;
        }
        if (i17 == 1006) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "buffer update textureId: " + vVar.f279955q + ", mediaId: " + vVar.f279956r + ", state: " + vVar.f279946h);
            vVar.l(null);
            return;
        }
        if (i17 == 1009) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "is use proxy textureId: " + vVar.f279955q + ", mediaId: " + vVar.f279956r + ", state: " + vVar.f279946h + ", is use proxy: " + j17);
            return;
        }
        if (i17 == 200) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "buffer start textureId: " + vVar.f279955q + ", mediaId: " + vVar.f279956r + ", state: " + vVar.f279946h);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("event", "bufferingStart");
            vVar.b(hashMap2);
            return;
        }
        if (i17 == 201) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "buffer end textureId: " + vVar.f279955q + ", mediaId: " + vVar.f279956r + ", state: " + vVar.f279946h);
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("event", "bufferingEnd");
            vVar.b(hashMap3);
            return;
        }
        if (i17 == 502) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("media codec info textureId: ");
            sb7.append(vVar.f279955q);
            sb7.append(", mediaId: ");
            sb7.append(vVar.f279956r);
            sb7.append(", state: ");
            sb7.append(vVar.f279946h);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb7.toString());
            return;
        }
        if (i17 != 503) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "sei info textureId: " + vVar.f279955q + ", mediaId: " + vVar.f279956r + ", state: " + vVar.f279946h);
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
                vVar.b(hashMap4);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoHLSPlayer", e17.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer r11) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ha3.i.onPrepared(com.tencent.thumbplayer.api.ITPPlayer):void");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seek complete textureId: ");
        ha3.v vVar = this.f279872d;
        sb6.append(vVar.f279955q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f279956r);
        sb6.append(", state: ");
        sb6.append(vVar.f279946h);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onSeekComplete");
        hashMap.put("position", java.lang.Long.valueOf(vVar.q()));
        vVar.b(hashMap);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state change textureId: ");
        ha3.v vVar = this.f279872d;
        sb6.append(vVar.f279955q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f279956r);
        sb6.append(", state: ");
        sb6.append(vVar.f279946h);
        sb6.append(", preState: ");
        sb6.append(i17);
        sb6.append(", curState: ");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        vVar.f279946h = i18;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener
    public void onStopAsyncComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop complete textureId: ");
        ha3.v vVar = this.f279872d;
        sb6.append(vVar.f279955q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f279956r);
        sb6.append(", state: ");
        sb6.append(vVar.f279946h);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video size change textureId: ");
        ha3.v vVar = this.f279872d;
        sb6.append(vVar.f279955q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f279956r);
        sb6.append(", state: ");
        sb6.append(vVar.f279946h);
        sb6.append(", width: ");
        sb6.append(j17);
        sb6.append(", height: ");
        sb6.append(j18);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
    }
}
