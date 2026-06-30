package x03;

/* loaded from: classes15.dex */
public final class i implements dn.n, dn.k, dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f451038d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f451039e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451040f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f451041g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.q f451042h;

    public i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f451038d = "MicroMsg.FlutterVideoPlayerMgr";
        this.f451041g = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.f451039e = context.getCacheDir() + "/flutter/FTVideo/";
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
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
            boolean r0 = r6 instanceof x03.g
            if (r0 == 0) goto L13
            r0 = r6
            x03.g r0 = (x03.g) r0
            int r1 = r0.f451029h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f451029h = r1
            goto L18
        L13:
            x03.g r0 = new x03.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f451027f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f451029h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f451026e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f451025d
            x03.i r5 = (x03.i) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L72
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            x03.z1 r6 = x03.z1.f451178a
            java.util.Map r6 = x03.z1.f451179b
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4e
            jz5.l r0 = new jz5.l
            r0.<init>(r5, r6)
            return r0
        L4e:
            r0.f451025d = r4
            r0.f451026e = r5
            r0.f451029h = r3
            kotlinx.coroutines.r r5 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r6 = pz5.f.b(r0)
            r5.<init>(r6, r3)
            r5.k()
            r4.f451042h = r5
            x03.h r6 = new x03.h
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
            r5.f451042h = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x03.i.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final x03.f b(java.lang.String str) {
        java.util.Map map = this.f451041g;
        if (map.get(str) == null) {
            return new x03.f();
        }
        java.lang.Object obj = map.get(str);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
        return (x03.f) obj;
    }

    public final int c(java.lang.String str, int i17) {
        x03.f fVar;
        int i18;
        if (str == null) {
            return 0;
        }
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        java.lang.String o17 = new com.tencent.mm.vfs.r6(this.f451039e + '-' + str.hashCode() + ".mp4").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        if (r26.i0.p(g17, this.f451040f, true)) {
            return 0;
        }
        java.util.Map map = this.f451041g;
        if (map.get(g17) == null) {
            fVar = new x03.f();
        } else {
            java.lang.Object obj = map.get(g17);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
            fVar = (x03.f) obj;
        }
        if (fVar.f451021j && fVar.f451012a < (fVar.f451014c * i17) / 100) {
            fVar.f451021j = false;
        }
        if (!fVar.f451015d && !fVar.f451021j && !fVar.f451018g) {
            dn.o oVar = new dn.o();
            oVar.f241785d = "task_FlutterCdnDownloadMgr_1";
            oVar.field_mediaId = g17;
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
            if (!((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(g17)) {
                i18 = x03.x0.f451161d.a().f451165c.a(oVar);
                fVar.f451018g = true;
                fVar.f451020i = false;
                int i19 = i18;
                fVar.f451016e = o17;
                map.put(g17, fVar);
                return i19;
            }
        }
        i18 = -1;
        int i192 = i18;
        fVar.f451016e = o17;
        map.put(g17, fVar);
        return i192;
    }

    public final void d(boolean z17, java.lang.String str, java.lang.String str2, java.lang.Long l17) {
        x03.f b17 = b(str2);
        if (z17) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b17.f451018g);
            kotlin.jvm.internal.o.d(valueOf);
            if (valueOf.booleanValue()) {
                java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(b17.f451020i);
                kotlin.jvm.internal.o.d(valueOf2);
                if (valueOf2.booleanValue()) {
                    return;
                }
            }
            e(str, str2);
            return;
        }
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(b17.f451018g);
        kotlin.jvm.internal.o.d(valueOf3);
        if (valueOf3.booleanValue()) {
            return;
        }
        if ((b17.f451021j && (l17 == null || l17.longValue() == 0 || b17.f451013b >= l17.longValue())) || l17 == null) {
            return;
        }
        c(str, (int) (((l17.longValue() * 1.0d) / b17.f451014c) * 100));
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        x03.f fVar;
        if (str == null || !r26.i0.y(str, "preview://", false)) {
            boolean taskExist = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(str2);
            java.lang.String str3 = this.f451038d;
            java.util.Map map = this.f451041g;
            if (!taskExist) {
                boolean z17 = map.get(str2) == null;
                x03.f fVar2 = (x03.f) map.get(str2);
                com.tencent.mars.xlog.Log.e(str3, "testtest task not in preload, in info cache:" + z17 + ", completed:" + (fVar2 != null ? java.lang.Boolean.valueOf(fVar2.f451015d) : null));
            }
            if (str != null) {
                bArr = str.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
            } else {
                bArr = null;
            }
            java.lang.String g17 = kk.k.g(bArr);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f451039e);
            sb6.append('-');
            sb6.append(str != null ? str.hashCode() : 0);
            sb6.append(".mp4");
            java.lang.String o17 = new com.tencent.mm.vfs.r6(sb6.toString()).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            if (map.get(g17) == null) {
                fVar = new x03.f();
            } else {
                java.lang.Object obj = map.get(g17);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar = (x03.f) obj;
            }
            if (r26.i0.q(this.f451040f, g17, false, 2, null) && fVar.f451018g && fVar.f451020i) {
                com.tencent.mars.xlog.Log.i(str3, "playmode is downloading:" + g17);
                return;
            }
            if (!fVar.f451015d) {
                dn.o oVar = new dn.o();
                oVar.f241785d = "task_FlutterCdnDownloadMgr_2";
                oVar.field_mediaId = g17;
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
                java.lang.String str4 = this.f451040f;
                x03.v0 v0Var = x03.x0.f451161d;
                if (str4 != null && !r26.i0.q(str4, g17, false, 2, null) && ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(this.f451040f)) {
                    v0Var.a().f451165c.b(this.f451040f);
                    fVar.f451018g = false;
                }
                if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(g17) && !fVar.f451020i) {
                    v0Var.a().f451165c.b(g17);
                    fVar.f451018g = false;
                }
                v0Var.a().f451165c.a(oVar);
                fVar.f451018g = true;
                fVar.f451020i = true;
            }
            this.f451040f = g17;
            fVar.f451016e = o17;
            kotlin.jvm.internal.o.d(map);
            map.put(g17, fVar);
        }
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        x03.f fVar;
        if (str != null) {
            java.util.Map map = this.f451041g;
            if (map.get(str) == null) {
                fVar = new x03.f();
            } else {
                java.lang.Object obj = map.get(str);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar = (x03.f) obj;
            }
            fVar.f451012a = j17;
            fVar.f451014c = j18;
            kotlin.jvm.internal.o.d(map);
            map.put(str, fVar);
            if (j17 != j18 || fVar.f451015d) {
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f451038d, "onprogress cdntask end id:".concat(str));
            fVar.f451015d = true;
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        x03.f fVar;
        java.util.Map map = this.f451041g;
        if (str == null || hVar == null) {
            com.tencent.mars.xlog.Log.e(this.f451038d, "onfinish but id not found:" + str);
        } else {
            if (map.get(str) == null) {
                fVar = new x03.f();
            } else {
                java.lang.Object obj = map.get(str);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar = (x03.f) obj;
            }
            long j17 = hVar.field_fileLength;
            fVar.f451012a = j17;
            fVar.f451014c = j17;
            fVar.f451015d = true;
            kotlin.jvm.internal.o.d(map);
            map.put(str, fVar);
            this.f451040f = null;
        }
        x03.f fVar2 = (x03.f) map.get(str);
        if (fVar2 == null) {
            return;
        }
        fVar2.f451018g = false;
    }

    public final int h(java.lang.String str, boolean z17) {
        int b17 = x03.x0.f451161d.a().f451165c.b(str);
        java.util.Map map = this.f451041g;
        x03.f fVar = (x03.f) map.get(str);
        if (fVar != null) {
            fVar.f451018g = false;
        }
        if (z17 && map.containsKey(str)) {
            map.remove(str);
        }
        if (r26.i0.p(this.f451040f, str, true)) {
            this.f451040f = null;
        }
        return b17;
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String mediaId, java.lang.String str) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (str != null) {
            x03.z1 z1Var = x03.z1.f451178a;
            x03.z1.f451179b.put(mediaId, str);
            jz5.l lVar = new jz5.l(mediaId, str);
            kotlinx.coroutines.q qVar = this.f451042h;
            if (qVar != null) {
                qVar.resumeWith(kotlin.Result.m521constructorimpl(lVar));
            }
            this.f451042h = null;
        }
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        if (str == null || hVar == null) {
            return;
        }
        java.util.Map map = this.f451041g;
        java.lang.Object obj = map.get(str);
        java.lang.String str2 = this.f451038d;
        if (obj == null) {
            com.tencent.mars.xlog.Log.e(str2, "preload completed, but task not found, mediaId:".concat(str));
            return;
        }
        java.lang.Object obj2 = map.get(str);
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
        x03.f fVar = (x03.f) obj2;
        fVar.f451014c = hVar.field_fileLength;
        fVar.f451013b = hVar.field_recvedBytes;
        fVar.f451021j = true;
        fVar.f451018g = false;
        kotlin.jvm.internal.o.d(map);
        map.put(str, fVar);
        com.tencent.mars.xlog.Log.i(str2, "preload completed mediaId:".concat(str));
    }
}
