package pd3;

/* loaded from: classes7.dex */
public final class a implements jc3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd3.b f353546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353548c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353549d;

    public a(pd3.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f353546a = bVar;
        this.f353547b = str;
        this.f353548c = str2;
        this.f353549d = str3;
    }

    @Override // jc3.x0
    public void a(int i17, java.lang.String str, java.lang.Object obj, org.json.JSONObject jSONObject, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.appstorage.u1 wi6 = ((com.tencent.mm.plugin.magicbrush.y5) ((com.tencent.mm.plugin.magicbrush.q4) i95.n0.c(com.tencent.mm.plugin.magicbrush.q4.class))).wi(this.f353546a.e().f344331a);
        if (wi6 == null) {
            this.f353546a.w(this.f353547b, this.f353548c, 303304, "fail:get file system error");
            return;
        }
        java.lang.Object obj2 = map != null ? map.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME) : null;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str3 = (java.lang.String) obj2;
        java.lang.Object obj3 = map != null ? map.get("mimeType") : null;
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str4 = (java.lang.String) obj3;
        java.lang.Object obj4 = map != null ? map.get("dataLength") : null;
        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) obj4).longValue();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f353549d);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (K0) {
            this.f353546a.getClass();
            java.lang.String a17 = q75.g.a(str4);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17) && kotlin.jvm.internal.o.b(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MP4, str4)) {
                a17 = "mp4";
            }
            ik1.b0 b0Var = new ik1.b0();
            com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = ((com.tencent.mm.plugin.magicbrush.fs.j) wi6).createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3)), a17, true, b0Var);
            java.lang.String str5 = createTempFileFrom == j1Var ? (java.lang.String) b0Var.f291824a : null;
            if (str5 == null) {
                if (pd3.b.v(this.f353546a, this.f353547b, this.f353548c)) {
                    return;
                }
                this.f353546a.w(this.f353547b, this.f353548c, 303300, createTempFileFrom == com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE ? "temp file size exceed limit" : "download fail save file fail");
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f353546a.f353550f, "onDownloadResultWithCode localId %s", str5);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("downloadTaskId", this.f353548c);
            jSONObject2.put("state", ya.b.SUCCESS);
            jSONObject2.put("tempFilePath", str5);
            jSONObject2.put("dataLength", longValue);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            pd3.b bVar = this.f353546a;
            com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnCDNDownloadTaskStateChange mBJsEventOnCDNDownloadTaskStateChange = new com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnCDNDownloadTaskStateChange();
            mBJsEventOnCDNDownloadTaskStateChange.f147882e = jSONObject3;
            bVar.u(mBJsEventOnCDNDownloadTaskStateChange);
            return;
        }
        pd3.b bVar2 = this.f353546a;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3));
        java.lang.String dstPath = this.f353549d;
        kotlin.jvm.internal.o.f(dstPath, "$dstPath");
        bVar2.getClass();
        if (r6Var.m()) {
            com.tencent.mm.plugin.appbrand.appstorage.j1 isdir = ((com.tencent.mm.plugin.magicbrush.fs.l) wi6).isdir(dstPath);
            kotlin.jvm.internal.o.f(isdir, "isdir(...)");
            if (isdir != j1Var) {
                try {
                    isdir = wi6.saveFile(r6Var, dstPath, new ik1.b0());
                    kotlin.jvm.internal.o.f(isdir, "saveFile(...)");
                } catch (java.lang.Exception e17) {
                    str2 = "fail:writeFile exception: " + e17;
                }
            }
            int ordinal = isdir.ordinal();
            if (ordinal == 0) {
                str2 = "ok";
            } else if (ordinal == 9) {
                str2 = java.lang.String.format("fail illegal operation on a directory, open \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                kotlin.jvm.internal.o.f(str2, "format(...)");
            } else if (ordinal == 15) {
                str2 = "fail the maximum size of the file storage limit is exceeded";
            } else if (ordinal == 3) {
                str2 = java.lang.String.format("fail no such file or directory \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                kotlin.jvm.internal.o.f(str2, "format(...)");
            } else if (ordinal != 4) {
                str2 = "fail " + isdir.name();
            } else {
                str2 = java.lang.String.format("fail permission denied, open \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                kotlin.jvm.internal.o.f(str2, "format(...)");
            }
        } else {
            str2 = "fail:file not exists";
        }
        if (!kotlin.jvm.internal.o.b("ok", str2)) {
            if (pd3.b.v(this.f353546a, this.f353547b, this.f353548c)) {
                return;
            }
            this.f353546a.w(this.f353547b, this.f353548c, 303300, "fail:download save file error");
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f353546a.f353550f, "onDownloadResultWithCode filePath %s", this.f353549d);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        java.lang.String str6 = this.f353548c;
        java.lang.String str7 = this.f353549d;
        jSONObject4.put("downloadTaskId", str6);
        jSONObject4.put("state", ya.b.SUCCESS);
        jSONObject4.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str7);
        jSONObject4.put("dataLength", longValue);
        java.lang.String jSONObject5 = jSONObject4.toString();
        kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
        pd3.b bVar3 = this.f353546a;
        com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnCDNDownloadTaskStateChange mBJsEventOnCDNDownloadTaskStateChange2 = new com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnCDNDownloadTaskStateChange();
        mBJsEventOnCDNDownloadTaskStateChange2.f147882e = jSONObject5;
        bVar3.u(mBJsEventOnCDNDownloadTaskStateChange2);
    }

    @Override // jc3.x0
    public void b(org.json.JSONObject jSONObject, int i17) {
    }

    @Override // jc3.x0
    public void c(int i17, java.lang.String str, java.lang.String str2, java.util.Map map) {
        pd3.b bVar = this.f353546a;
        java.lang.String str3 = this.f353547b;
        java.lang.String str4 = this.f353548c;
        if (pd3.b.v(bVar, str3, str4)) {
            return;
        }
        bVar.w(str3, str4, i17, str);
    }

    @Override // jc3.x0
    public void d(int i17, long j17, long j18) {
    }
}
