package ha3;

/* loaded from: classes15.dex */
public final class h0 implements dn.n, dn.k, dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f279869d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f279870e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.q f279871f;

    public h0() {
        java.lang.String str = com.tencent.mm.plugin.lite.logic.y2.g() + "/video/";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        this.f279869d = java.lang.String.valueOf(str);
        this.f279870e = java.util.Collections.synchronizedMap(new java.util.HashMap());
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "getCdnAuthInfo mediaId:" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ha3.f0
            if (r0 == 0) goto L13
            r0 = r6
            ha3.f0 r0 = (ha3.f0) r0
            int r1 = r0.f279849h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279849h = r1
            goto L18
        L13:
            ha3.f0 r0 = new ha3.f0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f279847f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f279849h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f279846e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f279845d
            ha3.h0 r5 = (ha3.h0) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L72
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            ha3.r0 r6 = ha3.r0.f279930a
            java.util.Map r6 = ha3.r0.f279931b
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4e
            jz5.l r0 = new jz5.l
            r0.<init>(r5, r6)
            return r0
        L4e:
            r0.f279845d = r4
            r0.f279846e = r5
            r0.f279849h = r3
            kotlinx.coroutines.r r5 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r6 = pz5.f.b(r0)
            r5.<init>(r6, r3)
            r5.k()
            r4.f279871f = r5
            ha3.g0 r6 = new ha3.g0
            r6.<init>(r4)
            r5.m(r6)
            java.lang.Object r6 = r5.j()
            if (r6 != r1) goto L71
            return r1
        L71:
            r5 = r4
        L72:
            jz5.l r6 = (jz5.l) r6
            r0 = 0
            r5.f279871f = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ha3.h0.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ha3.e0 b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        return (ha3.e0) this.f279870e.get(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
    }

    public final ha3.e0 c(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (ha3.e0) this.f279870e.get(str);
    }

    public final int d(java.lang.String str, int i17) {
        java.lang.String str2;
        int i18;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "preloadTask url is null");
            return -1;
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "preloadTask url: " + str + ", mediaId: " + b17 + ", ratio: " + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b17);
        sb6.append("_liteapp");
        java.lang.String o17 = new com.tencent.mm.vfs.r6(this.f279869d + sb6.toString()).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "preloadTask filePath: ".concat(o17));
        java.util.Map map = this.f279870e;
        ha3.e0 e0Var = (ha3.e0) map.get(b17);
        if (e0Var == null) {
            e0Var = new ha3.e0();
        }
        if (e0Var.f279842j) {
            str2 = "MicroMsg.LiteAppVideoPlayerCdnDownloadMgr";
            if (e0Var.f279833a < (e0Var.f279835c * i17) / 100) {
                e0Var.f279842j = false;
            }
        } else {
            str2 = "MicroMsg.LiteAppVideoPlayerCdnDownloadMgr";
        }
        if (e0Var.f279836d || e0Var.f279842j || e0Var.f279839g) {
            com.tencent.mars.xlog.Log.i(str2, "preload task has downloaded or isDoing, mediaId: " + b17 + ", complete: " + e0Var.f279836d + ", preloadComplete: " + e0Var.f279842j + ", isDoing: " + e0Var.f279839g);
        } else {
            dn.o oVar = new dn.o();
            oVar.f241785d = "task_FlutterCdnDownloadMgr_1";
            oVar.field_mediaId = b17;
            oVar.M1 = str;
            oVar.A = 60;
            oVar.B = 60;
            oVar.Y = 2;
            oVar.H1 = 2;
            oVar.Z = 3;
            oVar.field_requestVideoFormat = 0;
            oVar.field_fullpath = o17;
            oVar.f241809y0 = 8;
            oVar.f241806x0 = 1;
            oVar.f241815c2 = this;
            oVar.f241787f = this;
            oVar.f241796p0 = this;
            oVar.field_preloadRatio = i17;
            if (!((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(b17)) {
                ha3.i0 i0Var = ha3.j0.f279886a;
                i18 = ha3.j0.f279886a.a(oVar);
                e0Var.f279839g = true;
                e0Var.f279841i = false;
                com.tencent.mars.xlog.Log.i(str2, "preload addDownloadTask mediaId: " + b17);
                e0Var.f279837e = o17;
                kotlin.jvm.internal.o.d(map);
                map.put(b17, e0Var);
                return i18;
            }
            com.tencent.mars.xlog.Log.i(str2, "preload task has existed mediaId: " + b17);
        }
        i18 = -1;
        e0Var.f279837e = o17;
        kotlin.jvm.internal.o.d(map);
        map.put(b17, e0Var);
        return i18;
    }

    public final void e(java.lang.String str, boolean z17, java.lang.Long l17) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask url is null");
            return;
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask url: " + str + ", mediaId: " + b17 + ", minLength: " + l17);
        ha3.e0 b18 = b(str);
        if (b18 == null) {
            b18 = new ha3.e0();
        }
        if (z17) {
            if (!b18.f279839g || !b18.f279841i) {
                h(str);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask mediaId: " + b17 + ", play mode is downloading");
            return;
        }
        if (b18.f279839g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask mediaId: " + b17 + ", is already downloading, isPlayMode: " + z17 + ", curMode: " + b18.f279841i);
            return;
        }
        if (!b18.f279842j || (l17 != null && l17.longValue() != 0 && b18.f279834b < l17.longValue())) {
            if (l17 != null) {
                d(str, (int) (((l17.longValue() * 1.0d) / b18.f279835c) * 100));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask mediaId: " + b17 + ", preload already done");
        }
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onProgress mediaId: " + str + ", offset: " + j17 + ", total: " + j18);
        if (str != null) {
            java.util.Map map = this.f279870e;
            ha3.e0 e0Var = (ha3.e0) map.get(str);
            if (e0Var == null) {
                e0Var = new ha3.e0();
            }
            e0Var.f279833a = j17;
            e0Var.f279835c = j18;
            kotlin.jvm.internal.o.d(map);
            map.put(str, e0Var);
            if (j17 == j18 && !e0Var.f279836d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onProgress task is complete, mediaId: ".concat(str));
                e0Var.f279836d = true;
            }
            double d17 = ((j17 * 100.0d) / j18) * 1.0d;
            ha3.i0 i0Var = ha3.j0.f279886a;
            ha3.a aVar = (ha3.a) ha3.j0.f279888c.get(str);
            if (aVar != null) {
                aVar.l(java.lang.Double.valueOf(d17));
            }
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onFinish mediaId: " + str + ", ret: " + i17 + ", sceneResult: " + hVar);
        if (str == null || hVar == null) {
            return;
        }
        java.util.Map map = this.f279870e;
        ha3.e0 e0Var = (ha3.e0) map.get(str);
        if (e0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onFinish but mediaId: " + str + " not found");
            return;
        }
        long j17 = hVar.field_fileLength;
        e0Var.f279833a = j17;
        e0Var.f279835c = j17;
        e0Var.f279836d = true;
        e0Var.f279839g = false;
        kotlin.jvm.internal.o.d(map);
        map.put(str, e0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onFinish mediaId:" + str + ", is playMode:" + e0Var.f279841i);
    }

    public final void h(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask url is null");
            return;
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        if (r26.i0.y(str, "preview://", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask abort, only preview, url:" + str + ", mediaId: " + b17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask url: " + str + ", mediaId: " + b17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b17);
        sb6.append("_liteapp");
        java.lang.String o17 = new com.tencent.mm.vfs.r6(this.f279869d + sb6.toString()).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.util.Map map = this.f279870e;
        ha3.e0 e0Var = (ha3.e0) map.get(b17);
        if (e0Var == null) {
            e0Var = new ha3.e0();
        }
        if (e0Var.f279839g && e0Var.f279841i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask playMode is downloading, mediaId: " + b17);
            return;
        }
        if (e0Var.f279836d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask mediaId: " + b17 + " has downloaded.");
        } else {
            dn.o oVar = new dn.o();
            oVar.f241785d = "task_FlutterCdnDownloadMgr_2";
            oVar.field_mediaId = b17;
            oVar.M1 = str;
            oVar.A = 60;
            oVar.B = 60;
            oVar.Y = 1;
            oVar.H1 = 1;
            oVar.Z = 3;
            oVar.field_requestVideoFormat = 0;
            oVar.field_fullpath = o17;
            oVar.f241809y0 = 8;
            oVar.f241815c2 = this;
            for (java.lang.String str2 : map.keySet()) {
                if (!kotlin.jvm.internal.o.b(str2, b17) && ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(str2)) {
                    ha3.i0 i0Var = ha3.j0.f279886a;
                    ha3.i0 i0Var2 = ha3.j0.f279886a;
                    kotlin.jvm.internal.o.d(str2);
                    int b18 = i0Var2.b(str2);
                    ha3.e0 e0Var2 = (ha3.e0) map.get(str2);
                    if (e0Var2 != null) {
                        e0Var2.f279839g = false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask cancel downloadTask mediaId: " + b17 + ", ret: " + b18);
                }
            }
            if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(b17) && !e0Var.f279841i) {
                ha3.i0 i0Var3 = ha3.j0.f279886a;
                ha3.i0 i0Var4 = ha3.j0.f279886a;
                kotlin.jvm.internal.o.d(b17);
                int b19 = i0Var4.b(b17);
                e0Var.f279839g = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask cancel downloadTask because not in playMode, mediaId: " + b17 + ", ret: " + b19);
            }
            ha3.i0 i0Var5 = ha3.j0.f279886a;
            int a17 = ha3.j0.f279886a.a(oVar);
            e0Var.f279839g = true;
            e0Var.f279841i = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask addDownload mediaId: " + b17 + ", ret: " + a17 + ", path: " + o17);
        }
        e0Var.f279837e = o17;
        kotlin.jvm.internal.o.d(map);
        map.put(b17, e0Var);
    }

    public final int i(java.lang.String str, boolean z17) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "stopTask url is null.");
            return -1;
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "stopTask url: " + str + ", mediaId: " + b17);
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.i0 i0Var2 = ha3.j0.f279886a;
        kotlin.jvm.internal.o.d(b17);
        int b18 = i0Var2.b(b17);
        java.util.Map map = this.f279870e;
        ha3.e0 e0Var = (ha3.e0) map.get(b17);
        if (e0Var != null) {
            e0Var.f279839g = false;
        }
        if (z17) {
            map.remove(b17);
        }
        return b18;
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onMoovReady mediaId: " + str + ", offset: " + j17 + ", length: " + j18);
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onM3U8Ready mediaId: " + str + ", m3u8: " + str2);
        if (str == null || str2 == null) {
            return;
        }
        ha3.r0 r0Var = ha3.r0.f279930a;
        ha3.r0.f279931b.put(str, str2);
        jz5.l lVar = new jz5.l(str, str2);
        kotlinx.coroutines.q qVar = this.f279871f;
        if (qVar != null) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(lVar));
        }
        this.f279871f = null;
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onMoovReady mediaId: " + str + ", offset: " + j17 + ", length: " + j18 + ", info: " + videoInfo);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.util.Objects.toString(gVar);
        java.util.Objects.toString(hVar);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "decodePrepareResponse mediaId:" + str);
        return new byte[0];
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onPreloadCompleted mediaId: " + str + ", sceneResult: " + hVar);
        if (str == null || hVar == null) {
            return;
        }
        java.util.Map map = this.f279870e;
        ha3.e0 e0Var = (ha3.e0) map.get(str);
        if (e0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onPreloadCompleted, but task not found, mediaId:".concat(str));
            return;
        }
        e0Var.f279835c = hVar.field_fileLength;
        e0Var.f279834b = hVar.field_recvedBytes;
        e0Var.f279842j = true;
        e0Var.f279839g = false;
        kotlin.jvm.internal.o.d(map);
        map.put(str, e0Var);
    }
}
