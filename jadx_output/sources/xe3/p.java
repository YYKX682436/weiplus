package xe3;

@j95.b
/* loaded from: classes15.dex */
public final class p extends i95.w implements ve3.s {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f453962d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f453963e = new java.util.concurrent.ConcurrentHashMap();

    public final void Ai(int i17, ve3.o callback, yz5.l command, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(command, "command");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        xe3.f fVar = (xe3.f) this.f453962d.get(java.lang.Integer.valueOf(i17));
        if (fVar != null) {
            command.invoke(fVar);
            ve3.o.a(callback, null, 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.e("MB_External_surface_video_service", "id:" + i17 + " not found, " + errorMsg);
        ((xd3.c) callback).b(-1, "id:" + i17 + " not found,  " + errorMsg);
    }

    @Override // ve3.r
    public void G1(int i17, ve3.o callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        Ai(i17, callback, new xe3.o(this, i17), "unregisterFinderLiveTexture failed");
    }

    @Override // ve3.r
    public boolean H1(int i17) {
        boolean z17 = !this.f453962d.containsKey(java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_service", "isIdValid: " + i17 + ", result: " + z17);
        return z17;
    }

    @Override // ve3.r
    public void Id(int i17, org.json.JSONObject extraData, android.view.Surface surface, ve3.o callback) {
        kotlin.jvm.internal.o.g(extraData, "extraData");
        kotlin.jvm.internal.o.g(surface, "surface");
        kotlin.jvm.internal.o.g(callback, "callback");
        Ai(i17, callback, new xe3.i(extraData, callback, surface), "registerExternalTexture failed");
    }

    @Override // ve3.r
    public void R7(int i17, ve3.o callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        Ai(i17, callback, new xe3.h(callback), "play failed");
    }

    @Override // ve3.r
    public void r4(int i17, ve3.o callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        Ai(i17, callback, new xe3.n(callback), "stopPlay failed");
    }

    public void wi(int i17, org.json.JSONObject extraData, ve3.o callback) {
        qh3.a kVar;
        kotlin.jvm.internal.o.g(extraData, "extraData");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453962d;
        if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_service", "id duplicated, registerExternalTexture failed, id: " + i17);
            ((xd3.c) callback).b(-1, "id duplicated, registerExternalTexture failed, id: " + i17);
            return;
        }
        java.lang.String optString = extraData.optString("src");
        kotlin.jvm.internal.o.d(optString);
        xe3.f fVar = new xe3.f(i17, optString, false, false, null, 28, null);
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), fVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepare source playId ");
        sb6.append(fVar.f453941a);
        sb6.append(" url ");
        java.lang.String str = fVar.f453942b;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", sb6.toString());
        if (r26.i0.A(str, "http", false, 2, null)) {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
            kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
            fVar.f453943c = b17;
            java.lang.String path = ze3.a.f471778a.a(b17, str);
            wh3.c cVar = wh3.d.f445967d;
            java.lang.String mediaId = fVar.f453943c;
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            kotlin.jvm.internal.o.g(path, "path");
            dn.o oVar = new dn.o();
            oVar.f241785d = "task_RewardADUtil";
            oVar.field_mediaId = mediaId;
            oVar.M1 = str;
            oVar.A = 60;
            oVar.B = 60;
            oVar.H1 = 1;
            oVar.Z = 11;
            oVar.field_fullpath = path;
            oVar.f241809y0 = wh3.d.f445968e;
            oVar.X = wh3.d.f445971h;
            oVar.f241806x0 = wh3.d.f445969f;
            oVar.T1 = "reward-ad-video";
            wh3.d dVar = new wh3.d(fVar.f453943c, str, oVar);
            ye3.a aVar = ye3.a.f461214a;
            rh3.q onePlayContext = fVar.f453946f;
            java.lang.String mediaId2 = fVar.f453943c;
            kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
            kotlin.jvm.internal.o.g(mediaId2, "mediaId");
            if (kotlin.jvm.internal.o.b(aVar, ye3.b.f461215a)) {
                com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "Create Memory Cache: mediaId=".concat(mediaId2));
                kVar = new ze3.b(onePlayContext, mediaId2, path);
            } else {
                if (!kotlin.jvm.internal.o.b(aVar, aVar)) {
                    throw new jz5.j();
                }
                com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "Create File DB Cache: mediaId=".concat(mediaId2));
                kVar = new ye3.k(dVar, mediaId2);
            }
            onePlayContext.d(dVar, kVar);
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "step 1 setDataSourceImp videoFileStateCache:" + kVar);
            rh3.r rVar = fVar.f453944d;
            rVar.d(onePlayContext);
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "step 2 setDataSourceImp attach videoFileStateCache:" + onePlayContext.e());
            rVar.n(dVar);
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "step 3 setMediaSourceImp");
            rVar.j(new xe3.e(fVar, callback));
            rVar.prepareAsync();
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "step 4 setDataSourceImp prepareAsync");
        } else {
            com.tencent.mars.xlog.Log.e("MB_External_surface_video_item", "url is not http protocol");
            ((xd3.c) callback).b(-1, "url is not http protocol");
        }
        java.lang.String str2 = (java.lang.String) this.f453963e.get(java.lang.Integer.valueOf(i17));
        if (str2 != null) {
            af3.b bVar = fVar.f453945e;
            bVar.getClass();
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "setUpReportInfo ".concat(str2));
            bVar.f4544i = str2;
        }
    }
}
