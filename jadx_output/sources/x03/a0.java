package x03;

/* loaded from: classes15.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f450983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f450984e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x03.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450984e = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x03.a0(this.f450984e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x03.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        x03.f fVar;
        java.lang.Object a17;
        dn.o oVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f450983d;
        x03.i0 i0Var = this.f450984e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            x03.v0 v0Var = x03.x0.f451161d;
            x03.x0 a18 = v0Var.a();
            java.lang.String url = i0Var.f451049f;
            java.lang.String mediaId = i0Var.f451050g;
            x03.i iVar = a18.f451164b;
            iVar.getClass();
            kotlin.jvm.internal.o.g(url, "url");
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            java.lang.String o17 = new com.tencent.mm.vfs.r6(iVar.f451039e + '-' + mediaId + "-hls").o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            java.util.Map map = iVar.f451041g;
            if (map.get(mediaId) == null) {
                fVar = new x03.f();
            } else {
                java.lang.Object obj2 = map.get(mediaId);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar = (x03.f) obj2;
            }
            if (!fVar.f451018g) {
                if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(mediaId)) {
                    v0Var.a().f451165c.b(mediaId);
                    fVar.f451019h = 0L;
                    fVar.f451018g = false;
                }
                java.lang.String concat = "[startPreviewMetaTask]preview download hls meta data: ".concat(o17);
                java.lang.String str = iVar.f451038d;
                com.tencent.mars.xlog.Log.i(str, concat);
                x03.z1 z1Var = x03.z1.f451178a;
                try {
                    android.net.Uri parse = android.net.Uri.parse(url);
                    java.lang.String host = parse.getHost();
                    java.lang.String queryParameter = parse.getQueryParameter("aesKey");
                    java.lang.String str2 = o17 + '/' + mediaId + "_m3u8";
                    java.lang.String queryParameter2 = parse.getQueryParameter("fileExt");
                    if (queryParameter2 == null) {
                        queryParameter2 = "mp4";
                    }
                    oVar = dn.e.b(mediaId, host, queryParameter, str2, queryParameter2);
                } catch (java.lang.Exception unused) {
                    oVar = null;
                }
                if (oVar == null) {
                    com.tencent.mars.xlog.Log.e(str, "[startPreviewMetaTask] create task failed, mediaId: ".concat(mediaId));
                } else {
                    oVar.f241815c2 = iVar;
                    java.lang.String field_fullpath = oVar.field_fullpath;
                    kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
                    fVar.f451016e = field_fullpath;
                    fVar.f451017f = true;
                    fVar.f451019h = java.lang.System.currentTimeMillis();
                    fVar.f451018g = true;
                    x03.j jVar = v0Var.a().f451165c;
                    jVar.getClass();
                    java.lang.String str3 = oVar.field_fullpath;
                    java.lang.String str4 = oVar.field_fullpath + "_temp";
                    oVar.field_fullpath = str4;
                    com.tencent.mars.cdn.CdnManager.C2CDownloadRequest b17 = x03.z1.f451178a.b(oVar);
                    kotlin.jvm.internal.o.d(str3);
                    if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(b17, jVar, new x03.w1(jVar, str4, str3), 0) == 0) {
                        java.util.HashMap hashMap = jVar.f451060d;
                        java.lang.String field_mediaId = oVar.field_mediaId;
                        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                        hashMap.put(field_mediaId, oVar);
                    }
                    map.put(mediaId, fVar);
                }
            }
            java.lang.String str5 = i0Var.f451044a;
            java.lang.String str6 = i0Var.f451050g;
            x03.x0 a19 = v0Var.a();
            java.lang.String str7 = i0Var.f451050g;
            this.f450983d = 1;
            a17 = a19.f451164b.a(str7, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        i0Var.f451053j = (java.lang.String) ((jz5.l) a17).f302834e;
        java.lang.String str8 = i0Var.f451044a;
        java.lang.String str9 = i0Var.f451050g;
        if (i0Var.f451051h < 3) {
            com.tencent.thumbplayer.api.TPVideoInfo.Builder builder = new com.tencent.thumbplayer.api.TPVideoInfo.Builder();
            builder.fileId(i0Var.f451050g);
            builder.downloadParam(new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(18));
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = i0Var.f451045b;
            if (iTPPlayer != null) {
                iTPPlayer.setVideoInfo(builder.build());
            }
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = i0Var.f451045b;
            if (iTPPlayer2 != null) {
                iTPPlayer2.setDataSource("http://127.0.0.1:1234/mock_url");
            }
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer3 = i0Var.f451045b;
            if (iTPPlayer3 != null) {
                iTPPlayer3.prepareAsync();
            }
        }
        return jz5.f0.f302826a;
    }
}
