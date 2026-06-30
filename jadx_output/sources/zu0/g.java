package zu0;

/* loaded from: classes5.dex */
public abstract class g {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(com.tencent.mm.maas_api.MJMediaItem r11) {
        /*
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_album_device_configuration
            h62.d r0 = (h62.d) r0
            java.lang.String r2 = ""
            r3 = 1
            java.lang.String r0 = r0.Zi(r1, r2, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L1d
        L1a:
            r3 = r2
            goto L93
        L1d:
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L88
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L88
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "devices"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = "maxsize"
            int r1 = r1.optInt(r4)     // Catch: java.lang.Throwable -> L88
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L88
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L88
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L88
            r5 = r2
        L3a:
            if (r5 >= r0) goto L82
            org.json.JSONObject r6 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = "brand"
            java.lang.String r8 = r6.optString(r8)     // Catch: java.lang.Throwable -> L88
            boolean r7 = r26.i0.p(r7, r8, r3)     // Catch: java.lang.Throwable -> L88
            if (r7 == 0) goto L7f
            java.lang.String r7 = wo.w0.m()     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = "model"
            java.lang.String r8 = r6.optString(r8)     // Catch: java.lang.Throwable -> L88
            boolean r7 = r26.i0.p(r7, r8, r3)     // Catch: java.lang.Throwable -> L88
            if (r7 == 0) goto L7f
            java.lang.String r7 = r11.f68640f     // Catch: java.lang.Throwable -> L88
            long r7 = com.tencent.mm.vfs.w6.k(r7)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L70
            int r9 = r1 * 1024
            int r9 = r9 * 1024
            long r9 = (long) r9     // Catch: java.lang.Throwable -> L88
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L70
            goto L1a
        L70:
            java.lang.String r7 = "androidVersion"
            int r6 = r6.optInt(r7)     // Catch: java.lang.Throwable -> L88
            r7 = -1
            if (r7 != r6) goto L7a
            goto L93
        L7a:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L88
            if (r7 != r6) goto L7f
            goto L93
        L7f:
            int r5 = r5 + 1
            goto L3a
        L82:
            jz5.f0 r11 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L88
            kotlin.Result.m521constructorimpl(r11)     // Catch: java.lang.Throwable -> L88
            goto L1a
        L88:
            r11 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
            kotlin.Result.m521constructorimpl(r11)
            goto L1a
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.g.a(com.tencent.mm.maas_api.MJMediaItem):boolean");
    }

    public static final zu0.a b(com.tencent.mm.maas_api.MJMediaItem mJMediaItem, int i17, int i18, qg.c cVar, boolean z17) {
        if (i17 <= 0 || i18 <= 0) {
            return null;
        }
        qg.a aVar = qg.a.Filepath;
        return z17 ? new zu0.a(new com.tencent.maas.instamovie.base.asset.MJAssetInfo(aVar, mJMediaItem.f68639e, cVar), i18, i17) : new zu0.a(new com.tencent.maas.instamovie.base.asset.MJAssetInfo(aVar, mJMediaItem.f68639e, cVar), i17, i18);
    }

    public static final void c(com.tencent.mm.maas_api.MJMediaItem mJMediaItem) {
        java.lang.String string;
        gp.c cVar = new gp.c();
        cVar.k(mJMediaItem.f68640f);
        int d17 = cVar.d();
        android.media.MediaFormat mediaFormat = null;
        android.media.MediaFormat mediaFormat2 = null;
        for (int i17 = 0; i17 < d17; i17++) {
            android.media.MediaFormat e17 = cVar.e(i17);
            kotlin.jvm.internal.o.f(e17, "getTrackFormat(...)");
            if (e17.containsKey("mime") && (string = e17.getString("mime")) != null) {
                if (r26.i0.y(string, "video/", false)) {
                    if (mediaFormat == null) {
                        mediaFormat = e17;
                    }
                } else if (r26.i0.y(string, "audio/", false) && mediaFormat2 == null) {
                    mediaFormat2 = e17;
                }
                if (mediaFormat2 != null && mediaFormat != null) {
                    break;
                }
            }
        }
        if (mediaFormat != null) {
            mJMediaItem.f68642h = !mediaFormat.containsKey("height") ? 0 : mediaFormat.getInteger("height");
            mJMediaItem.f68641g = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : 0;
            mJMediaItem.f68643i = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(mJMediaItem.f68640f);
        }
        cVar.g();
    }

    public static final void d(com.tencent.mm.maas_api.MJMediaItem mJMediaItem) {
        java.lang.String str = mJMediaItem.f68640f;
        org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(str));
        mJMediaItem.f68642h = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
        mJMediaItem.f68641g = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
        mJMediaItem.f68643i = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(str);
    }

    public static final java.lang.Object e(zu0.a aVar, kotlin.coroutines.Continuation continuation) {
        if (aVar.f475661a.getIdentifierType() != qg.a.Filepath) {
            return java.lang.Boolean.FALSE;
        }
        com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo = aVar.f475661a;
        qg.c mediaType = mJAssetInfo.getMediaType();
        int i17 = mediaType == null ? -1 : zu0.b.f475664a[mediaType.ordinal()];
        if (i17 == 1) {
            java.lang.String identifier = mJAssetInfo.getIdentifier();
            kotlin.jvm.internal.o.f(identifier, "getIdentifier(...)");
            return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new zu0.d(identifier, null), continuation);
        }
        if (i17 != 2) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String identifier2 = mJAssetInfo.getIdentifier();
        kotlin.jvm.internal.o.f(identifier2, "getIdentifier(...)");
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new zu0.c(identifier2, null), continuation);
    }

    public static final java.lang.Object f(com.tencent.mm.maas_api.MJMediaItem mJMediaItem, kotlin.coroutines.Continuation continuation) {
        int ordinal = mJMediaItem.f68638d.ordinal();
        if (ordinal == 0) {
            return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new zu0.f(mJMediaItem, null), continuation);
        }
        if (ordinal != 1) {
            return null;
        }
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new zu0.e(mJMediaItem, null), continuation);
    }
}
