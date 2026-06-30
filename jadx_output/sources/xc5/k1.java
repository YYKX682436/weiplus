package xc5;

/* loaded from: classes12.dex */
public final class k1 extends vf3.i {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f453514g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f453515h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f453516i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f453517m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f453518n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(androidx.appcompat.app.AppCompatActivity ctx) {
        super(ctx);
        kotlin.jvm.internal.o.g(ctx, "ctx");
        this.f453514g = ctx;
        this.f453515h = new java.util.LinkedHashMap();
        this.f453516i = new java.util.LinkedHashMap();
        this.f453517m = jz5.h.b(xc5.f1.f453448d);
        this.f453518n = jz5.h.b(xc5.e1.f453436d);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(xc5.k1 r16, mf3.k r17, com.tencent.mm.storage.f9 r18, mf3.w r19, l70.d r20, l70.d r21, gg3.c r22, sf3.g r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.k1.b7(xc5.k1, mf3.k, com.tencent.mm.storage.f9, mf3.w, l70.d, l70.d, gg3.c, sf3.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // vf3.a
    public vf3.d K(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        return (vf3.d) ((java.util.LinkedHashMap) this.f453515h).get(W6(mediaInfo));
    }

    @Override // vf3.a
    public vf3.c S3(mf3.k mediaInfo) {
        int i17;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        sf3.g e17 = mediaInfo.e();
        java.lang.String c17 = e17 != null ? e17.c() : null;
        if (c17 == null) {
            c17 = "";
        }
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        com.tencent.mm.storage.f9 b17 = iVar != null ? iVar.b() : null;
        if (r26.n0.N(c17) || !com.tencent.mm.vfs.w6.j(c17)) {
            i17 = com.tencent.mm.R.string.g0a;
        } else {
            boolean z17 = false;
            if (b17 != null && tg3.s1.a(b17)) {
                i17 = com.tencent.mm.R.string.o6k;
            } else {
                if (b17 != null && b17.z2()) {
                    z17 = true;
                }
                if (z17) {
                    i17 = com.tencent.mm.R.string.g07;
                } else {
                    jx3.f.INSTANCE.d(31328, 1, 5000);
                    i17 = com.tencent.mm.R.string.g08;
                }
            }
        }
        java.lang.String string = this.f453514g.getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return new vf3.c(string);
    }

    @Override // vf3.a
    public vf3.b T4(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        java.lang.String id6 = mediaInfo.getId();
        java.util.Map map = this.f453516i;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        if (linkedHashMap.get(id6) != null) {
            return (vf3.b) linkedHashMap.get(id6);
        }
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar == null) {
            return null;
        }
        com.tencent.mm.storage.f9 b17 = iVar.b();
        j15.d dVar = new j15.d();
        java.lang.String j17 = b17.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        dVar.fromXml(j17);
        long length = dVar.o().getLength();
        long r17 = dVar.o().r();
        j15.c t17 = dVar.o().t();
        long size = t17 != null ? t17.getSize() : 0L;
        j15.c t18 = dVar.o().t();
        long o17 = t18 != null ? t18.o() : 0L;
        j15.c t19 = dVar.o().t();
        long p17 = t19 != null ? t19.p() : 0L;
        wh5.f fVar = wh5.f.f446052a;
        vf3.b bVar = new vf3.b(length, r17, size, o17, p17, ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Zi(b17) <= 0);
        map.put(id6, bVar);
        return bVar;
    }

    @Override // vf3.i
    public void V6() {
        v65.i.b(this.f436401f, null, new xc5.c1(this, null), 1, null);
    }

    @Override // vf3.a
    public boolean c2(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        vf3.d dVar = (vf3.d) ((java.util.LinkedHashMap) this.f453515h).get(W6(mediaInfo));
        if (dVar != null) {
            return dVar.f436374c;
        }
        return false;
    }

    public final sf3.g c7(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407404f;
        linkedHashMap.put(mVar, "");
        return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
    }

    public final gg3.c d7(java.lang.String str) {
        return new gg3.c(str, null, null, null, 0L, false, 62, null);
    }

    public final l70.d e7(com.tencent.mm.storage.f9 f9Var, mf3.w wVar) {
        try {
            return ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).cj(f9Var, xc5.b1.f453397a[wVar.ordinal()] == 1 ? s70.c.f403920h : s70.c.f403919g, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MediaGallery.MsgHistoryGalleryLiveStateManager", "genImageDownloadParams failed: " + e17.getMessage());
            return null;
        }
    }

    public final l70.d f7(com.tencent.mm.storage.f9 f9Var, mf3.w wVar) {
        try {
            return ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).cj(f9Var, xc5.b1.f453397a[wVar.ordinal()] == 1 ? s70.c.f403922m : s70.c.f403921i, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MediaGallery.MsgHistoryGalleryLiveStateManager", "genVideoDownloadParams failed: " + e17.getMessage());
            return null;
        }
    }

    public final java.util.HashSet g7() {
        return (java.util.HashSet) ((jz5.n) this.f453518n).getValue();
    }

    public final java.util.HashSet h7() {
        return (java.util.HashSet) ((jz5.n) this.f453517m).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i7(mf3.k r10, mf3.w r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.k1.i7(mf3.k, mf3.w, java.lang.String, java.lang.String):boolean");
    }

    public final void k7(mf3.k kVar, vf3.e eVar) {
        java.lang.String id6 = kVar.getId();
        Y6(kVar, eVar, new vf3.f(eVar, null, 0, 0.0f, 14, null), d7(id6), c7(id6));
    }

    public final void l7(mf3.k kVar, java.lang.String str, java.lang.String str2) {
        boolean Bi = ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).Bi(str2);
        lf3.k a17 = lf3.l.f318326a.a(str);
        this.f453515h.put(W6(kVar), new vf3.d("", "", Bi, a17 != null ? a17.f318322a : 0, a17 != null ? a17.f318323b : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7(mf3.k r22, l70.d r23, java.lang.String r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.k1.m7(mf3.k, l70.d, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n7(mf3.k r11, l70.d r12, java.lang.String r13, mf3.w r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.k1.n7(mf3.k, l70.d, java.lang.String, mf3.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // vf3.a
    public void p1(mf3.k mediaInfo, java.lang.String path, vf3.g listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(listener, "listener");
        if ((mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null) == null) {
            return;
        }
        gg3.c a17 = mediaInfo.a();
        gg3.c cVar = a17 == null ? new gg3.c(mediaInfo.getId(), null, null, null, 0L, false, 62, null) : a17;
        java.lang.String mediaId = mediaInfo.getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407405g;
        linkedHashMap.put(mVar, path);
        sf3.g a18 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(a18.c());
        java.lang.String str = a19.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l17, a19.f213280g, a19.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a19, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            vf3.i.Z6(this, mediaInfo, vf3.e.f436384n, null, cVar, a18, 2, null);
        } else {
            vf3.i.Z6(this, mediaInfo, vf3.e.f436382i, null, cVar, a18, 2, null);
        }
    }

    @Override // vf3.a
    public void v2(mf3.k mediaInfo, vf3.g listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        a7(mediaInfo, listener);
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar == null) {
            k7(mediaInfo, vf3.e.f436385o);
            return;
        }
        com.tencent.mm.storage.f9 b17 = iVar.b();
        mf3.w level = mediaInfo.getLevel();
        l70.d f76 = f7(b17, level);
        if (f76 == null) {
            k7(mediaInfo, vf3.e.f436385o);
            return;
        }
        l70.d e76 = e7(b17, level);
        if (e76 == null) {
            k7(mediaInfo, vf3.e.f436385o);
            return;
        }
        gg3.c cVar = new gg3.c(mediaInfo.getId(), e76.f316805f, f76.f316805f, null, 0L, false, 40, null);
        java.lang.String mediaId = mediaInfo.getId();
        sf3.m mVar = xc5.b1.f453397a[level.ordinal()] == 1 ? sf3.m.f407403e : sf3.m.f407404f;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.Map linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar2 = sf3.m.f407404f;
        java.lang.String path = e76.f316805f;
        kotlin.jvm.internal.o.g(path, "path");
        linkedHashMap.put(mVar2, path);
        linkedHashMap.put(sf3.m.f407406h, path);
        linkedHashMap.put(sf3.m.f407403e, path);
        if ((60 & 1) != 0) {
            linkedHashMap = kz5.q0.f314001d;
        }
        java.util.Map map = linkedHashMap;
        java.lang.String previewPath = (60 & 4) != 0 ? "" : null;
        java.lang.String detectPath = (60 & 8) != 0 ? "" : null;
        sf3.m detectType = (60 & 16) != 0 ? sf3.m.f407402d : null;
        sf3.b loadStrategy = (60 & 32) != 0 ? new sf3.b() : null;
        kotlin.jvm.internal.o.g(previewPath, "previewPath");
        kotlin.jvm.internal.o.g(detectPath, "detectPath");
        kotlin.jvm.internal.o.g(detectType, "detectType");
        kotlin.jvm.internal.o.g(loadStrategy, "loadStrategy");
        sf3.g gVar = new sf3.g(map, mediaId, previewPath, detectPath, null, loadStrategy, 16, null);
        java.lang.String str = (java.lang.String) gVar.f407387a.get(mVar);
        gVar.f407390d = str != null ? str : "";
        gVar.f407391e = mVar;
        if (!tg3.s1.a(b17)) {
            xc5.a1 a1Var = new xc5.a1(this, mediaInfo, b17, e76.f316804e, f76.f316804e, cVar, gVar);
            e76.f316813n = new java.lang.ref.WeakReference(a1Var);
            f76.f316813n = new java.lang.ref.WeakReference(a1Var);
            v65.i.b(this.f436401f, null, new xc5.i1(this, mediaInfo, level, e76, f76, gVar, cVar, b17, null), 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.e("MediaGallery.MsgHistoryGalleryLiveStateManager", "tryDownload SEC_INVALID, mediaId=" + mediaInfo.getId());
        vf3.e eVar = vf3.e.f436386p;
        Y6(mediaInfo, eVar, new vf3.f(eVar, null, 0, 0.0f, 14, null), cVar, gVar);
    }

    @Override // vf3.a
    public void x6(mf3.k mediaInfo) {
        com.tencent.mm.storage.f9 b17;
        mf3.w level;
        l70.d e76;
        l70.d f76;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar == null || (e76 = e7((b17 = iVar.b()), (level = mediaInfo.getLevel()))) == null || (f76 = f7(b17, level)) == null) {
            return;
        }
        v65.i.b(this.f436401f, null, new xc5.d1(this, e76, mediaInfo, level, f76, null), 1, null);
    }
}
