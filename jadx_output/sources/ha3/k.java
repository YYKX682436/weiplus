package ha3;

/* loaded from: classes15.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f279889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ha3.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279890e = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ha3.k(this.f279890e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ha3.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ha3.e0 e0Var;
        dn.o oVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f279889d;
        ha3.v vVar = this.f279890e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ha3.i0 i0Var = ha3.j0.f279886a;
            ha3.h0 h0Var = ha3.j0.f279887b;
            java.lang.String str = vVar.f279939a;
            kotlin.jvm.internal.o.d(str);
            h0Var.getClass();
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
            java.lang.String o17 = new com.tencent.mm.vfs.r6(h0Var.f279869d + (b17 + "_liteapp") + "-hls").o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewMetaTask] try start: mediaId: " + b17 + " url:" + str);
            java.util.Map map = h0Var.f279870e;
            if (map.get(b17) == null) {
                e0Var = new ha3.e0();
            } else {
                java.lang.Object obj2 = map.get(b17);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.media.video.LiteAppVideoPlayerCdnDownloadMgr.LiteAppVideoPlayerTaskInfo");
                e0Var = (ha3.e0) obj2;
            }
            if (!e0Var.f279839g) {
                if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(b17)) {
                    ha3.i0 i0Var2 = ha3.j0.f279886a;
                    kotlin.jvm.internal.o.d(b17);
                    i0Var2.b(b17);
                    e0Var.f279840h = 0L;
                    e0Var.f279839g = false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewMetaTask]preview download hls meta data: ".concat(o17));
                ha3.r0 r0Var = ha3.r0.f279930a;
                kotlin.jvm.internal.o.d(b17);
                try {
                    android.net.Uri parse = android.net.Uri.parse(str);
                    java.lang.String host = parse.getHost();
                    java.lang.String queryParameter = parse.getQueryParameter("aesKey");
                    java.lang.String str2 = o17 + '/' + b17 + "_m3u8";
                    java.lang.String queryParameter2 = parse.getQueryParameter("fileExt");
                    if (queryParameter2 == null) {
                        queryParameter2 = "mp4";
                    }
                    oVar = dn.e.b(b17, host, queryParameter, str2, queryParameter2);
                } catch (java.lang.Exception unused) {
                    oVar = null;
                }
                if (oVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewMetaTask] create task failed, mediaId: ".concat(b17));
                } else {
                    oVar.f241815c2 = h0Var;
                    java.lang.String field_fullpath = oVar.field_fullpath;
                    kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
                    e0Var.f279837e = field_fullpath;
                    e0Var.f279838f = true;
                    e0Var.f279840h = java.lang.System.currentTimeMillis();
                    e0Var.f279839g = true;
                    ha3.i0 i0Var3 = ha3.j0.f279886a;
                    i0Var3.getClass();
                    java.lang.String str3 = oVar.field_fullpath;
                    java.lang.String str4 = oVar.field_fullpath + "_temp";
                    oVar.field_fullpath = str4;
                    com.tencent.mars.cdn.CdnManager.C2CDownloadRequest b18 = ha3.r0.f279930a.b(oVar);
                    kotlin.jvm.internal.o.d(str3);
                    if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(b18, i0Var3, new ha3.o0(i0Var3, str4, str3), 0) == 0) {
                        java.util.HashMap hashMap = i0Var3.f279873d;
                        java.lang.String field_mediaId = oVar.field_mediaId;
                        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                        hashMap.put(field_mediaId, oVar);
                    }
                    map.put(b17, e0Var);
                }
            }
            ha3.i0 i0Var4 = ha3.j0.f279886a;
            ha3.h0 h0Var2 = ha3.j0.f279887b;
            java.lang.String str5 = vVar.f279956r;
            kotlin.jvm.internal.o.d(str5);
            this.f279889d = 1;
            obj = h0Var2.a(str5, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        vVar.f279941c = (java.lang.String) ((jz5.l) obj).f302834e;
        com.tencent.thumbplayer.api.TPVideoInfo.Builder builder = new com.tencent.thumbplayer.api.TPVideoInfo.Builder();
        java.lang.String str6 = vVar.f279956r;
        kotlin.jvm.internal.o.d(str6);
        builder.fileId(str6);
        builder.downloadParam(new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(18));
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = vVar.f279940b;
        if (iTPPlayer != null) {
            iTPPlayer.setVideoInfo(builder.build());
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = vVar.f279940b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.setDataSource("http://127.0.0.1:1234/mock_url");
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer3 = vVar.f279940b;
        if (iTPPlayer3 != null) {
            iTPPlayer3.prepareAsync();
        }
        return jz5.f0.f302826a;
    }
}
