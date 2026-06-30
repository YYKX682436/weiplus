package pd3;

/* loaded from: classes7.dex */
public final class c implements jc3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f353551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pd3.d f353552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f353555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353556f;

    public c(pd3.d dVar, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        this.f353552b = dVar;
        this.f353553c = str;
        this.f353554d = str2;
        this.f353555e = z17;
        this.f353556f = str3;
    }

    @Override // jc3.x0
    public void a(int i17, java.lang.String str, java.lang.Object obj, org.json.JSONObject jSONObject, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.appbrand.appstorage.u1 wi6 = ((com.tencent.mm.plugin.magicbrush.y5) ((com.tencent.mm.plugin.magicbrush.q4) i95.n0.c(com.tencent.mm.plugin.magicbrush.q4.class))).wi(this.f353552b.e().f344331a);
        if (wi6 == null) {
            this.f353552b.w(this.f353553c, this.f353554d, 303304, "fail:get file system error");
            return;
        }
        java.lang.Object obj2 = map != null ? map.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME) : null;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str6 = (java.lang.String) obj2;
        java.lang.Object obj3 = map != null ? map.get("mimeType") : null;
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str7 = (java.lang.String) obj3;
        java.lang.Object obj4 = map != null ? map.get("dataLength") : null;
        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) obj4).longValue();
        java.lang.Object obj5 = map != null ? map.get("statusCode") : null;
        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) obj5).intValue();
        java.lang.String p17 = this.f353555e ? com.tencent.mm.vfs.w6.p(str6) : null;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f353556f);
        java.lang.String str8 = p17;
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (K0) {
            pd3.d dVar = this.f353552b;
            dVar.getClass();
            java.lang.String a17 = q75.g.a(str7);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                str2 = com.google.android.gms.common.Scopes.PROFILE;
                if (kotlin.jvm.internal.o.b(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MP4, str7)) {
                    a17 = "mp4";
                }
            } else {
                str2 = com.google.android.gms.common.Scopes.PROFILE;
            }
            ik1.b0 b0Var = new ik1.b0();
            com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = ((com.tencent.mm.plugin.magicbrush.fs.j) wi6).createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str6)), a17, true, b0Var);
            if (createTempFileFrom != j1Var) {
                com.tencent.mars.xlog.Log.e(dVar.f353557f, "saveDownloadFile fail ret: " + createTempFileFrom);
                str3 = null;
            } else {
                str3 = (java.lang.String) b0Var.f291824a;
            }
            if (str3 == null) {
                if (pd3.d.v(this.f353552b, this.f353553c, this.f353554d)) {
                    return;
                }
                this.f353552b.w(this.f353553c, this.f353554d, 303300, createTempFileFrom == com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE ? "temp file size exceed limit" : "download fail save file fail");
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f353552b.f353557f, "onDownloadResultWithCode localId %s", str3);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("downloadTaskId", this.f353554d);
            jSONObject2.put("state", ya.b.SUCCESS);
            jSONObject2.put("tempFilePath", str3);
            jSONObject2.put("dataLength", longValue);
            jSONObject2.put("statusCode", intValue);
            org.json.JSONObject jSONObject3 = this.f353551a;
            if (jSONObject3 != null) {
                jSONObject2.put("header", jSONObject3);
            }
            if (map2 != null && (!map2.isEmpty())) {
                jSONObject2.put(str2, map2);
            }
            if (str8 != null) {
                jSONObject2.put("calcuatedMd5", str8);
            }
            java.lang.String jSONObject4 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            pd3.d dVar2 = this.f353552b;
            com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange = new com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange();
            mBJsEventOnDownloadTaskStateChange.f147882e = jSONObject4;
            dVar2.u(mBJsEventOnDownloadTaskStateChange);
            return;
        }
        pd3.d dVar3 = this.f353552b;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str6));
        java.lang.String dstPath = this.f353556f;
        kotlin.jvm.internal.o.f(dstPath, "$dstPath");
        dVar3.getClass();
        if (r6Var.m()) {
            com.tencent.mm.plugin.appbrand.appstorage.j1 isdir = ((com.tencent.mm.plugin.magicbrush.fs.l) wi6).isdir(dstPath);
            str4 = "statusCode";
            kotlin.jvm.internal.o.f(isdir, "isdir(...)");
            if (isdir != j1Var) {
                try {
                    isdir = wi6.saveFile(r6Var, dstPath, new ik1.b0());
                    kotlin.jvm.internal.o.f(isdir, "saveFile(...)");
                } catch (java.lang.Exception e17) {
                    str5 = "fail:writeFile exception: " + e17;
                }
            }
            int ordinal = isdir.ordinal();
            if (ordinal == 0) {
                str5 = "ok";
            } else if (ordinal == 9) {
                str5 = java.lang.String.format("fail illegal operation on a directory, open \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                kotlin.jvm.internal.o.f(str5, "format(...)");
            } else if (ordinal == 15) {
                str5 = "fail the maximum size of the file storage limit is exceeded";
            } else if (ordinal == 3) {
                str5 = java.lang.String.format("fail no such file or directory \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                kotlin.jvm.internal.o.f(str5, "format(...)");
            } else if (ordinal != 4) {
                str5 = "fail " + isdir.name();
            } else {
                str5 = java.lang.String.format("fail permission denied, open \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                kotlin.jvm.internal.o.f(str5, "format(...)");
            }
        } else {
            str5 = "fail:file not exists";
            str4 = "statusCode";
        }
        if (!kotlin.jvm.internal.o.b("ok", str5)) {
            if (pd3.d.v(this.f353552b, this.f353553c, this.f353554d)) {
                return;
            }
            com.tencent.mars.xlog.Log.e(this.f353552b.f353557f, "onDownloadResultWithCode saveErrMsg:%s,filePath:%s", str5, str6);
            this.f353552b.w(this.f353553c, this.f353554d, 303300, "fail:download save file error");
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f353552b.f353557f, "onDownloadResultWithCode dstPath %s", this.f353556f);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        java.lang.String str9 = this.f353554d;
        java.lang.String str10 = this.f353556f;
        jSONObject5.put("downloadTaskId", str9);
        jSONObject5.put("state", ya.b.SUCCESS);
        jSONObject5.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str10);
        jSONObject5.put("dataLength", longValue);
        jSONObject5.put(str4, intValue);
        org.json.JSONObject jSONObject6 = this.f353551a;
        if (jSONObject6 != null) {
            jSONObject5.put("header", jSONObject6);
        }
        if (map2 != null && (!map2.isEmpty())) {
            jSONObject5.put(com.google.android.gms.common.Scopes.PROFILE, map2);
        }
        if (str8 != null) {
            jSONObject5.put("calcuatedMd5", str8);
        }
        java.lang.String jSONObject7 = jSONObject5.toString();
        kotlin.jvm.internal.o.f(jSONObject7, "toString(...)");
        pd3.d dVar4 = this.f353552b;
        com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange2 = new com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange();
        mBJsEventOnDownloadTaskStateChange2.f147882e = jSONObject7;
        dVar4.u(mBJsEventOnDownloadTaskStateChange2);
    }

    @Override // jc3.x0
    public void b(org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            return;
        }
        this.f353551a = jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("downloadTaskId", this.f353554d);
        jSONObject2.put("state", "headersReceived");
        jSONObject2.put("header", this.f353551a);
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange = new com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange();
        mBJsEventOnDownloadTaskStateChange.f147882e = jSONObject3;
        this.f353552b.u(mBJsEventOnDownloadTaskStateChange);
    }

    @Override // jc3.x0
    public void c(int i17, java.lang.String str, java.lang.String str2, java.util.Map map) {
        pd3.d dVar = this.f353552b;
        java.lang.String str3 = this.f353553c;
        java.lang.String str4 = this.f353554d;
        if (pd3.d.v(dVar, str3, str4)) {
            return;
        }
        dVar.w(str3, str4, i17, str);
    }

    @Override // jc3.x0
    public void d(int i17, long j17, long j18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("downloadTaskId", this.f353554d);
        jSONObject.put("state", "progressUpdate");
        jSONObject.put("progress", i17);
        jSONObject.put("totalBytesWritten", j17);
        jSONObject.put("totalBytesExpectedToWrite", j18);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange = new com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange();
        mBJsEventOnDownloadTaskStateChange.f147882e = jSONObject2;
        this.f353552b.u(mBJsEventOnDownloadTaskStateChange);
    }
}
