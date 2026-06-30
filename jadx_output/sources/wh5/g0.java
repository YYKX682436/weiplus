package wh5;

/* loaded from: classes12.dex */
public final class g0 extends vf3.i {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f446062g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f446063h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f446064i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f446065m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f446066n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f446062g = new java.util.LinkedHashMap();
        this.f446063h = new java.util.LinkedHashMap();
        this.f446064i = new java.util.LinkedHashMap();
        this.f446065m = jz5.h.b(wh5.a0.f446016d);
        this.f446066n = jz5.h.b(wh5.z.f446112d);
    }

    public static final void b7(wh5.g0 g0Var, mf3.k kVar, java.lang.String str) {
        g0Var.getClass();
        com.tencent.mm.plugin.sight.base.b Ai = ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).Ai(str);
        if (Ai == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.ChatLiveStateManager", "checkVideoInfo failed, mediaId: " + kVar.getId() + " , mediaLevel: " + kVar.getLevel().name() + " , videoPath: " + str);
            return;
        }
        sf3.g e17 = kVar.e();
        lf3.k a17 = lf3.l.f318326a.a(e17 != null ? e17.c() : null);
        wh5.v vVar = (wh5.v) kVar;
        vf3.d dVar = new vf3.d(Ai.f162401t, Ai.f162400s, ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).Bi(str), a17 != null ? a17.f318322a : 0, a17 != null ? a17.f318323b : 0);
        vf3.b T4 = g0Var.T4(vVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parserLiveInfo MMBitmapFactory.decodeFile , mediaId: ");
        sb6.append(kVar.getId());
        sb6.append(" , imageWidth: ");
        sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f318322a) : null);
        sb6.append(" , imageHeight: ");
        sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f318323b) : null);
        sb6.append(" isHorizontalLong: ");
        sb6.append(a17 != null ? java.lang.Boolean.valueOf(a17.f318324c) : null);
        sb6.append(" isVerticalLong: ");
        sb6.append(a17 != null ? java.lang.Boolean.valueOf(a17.f318325d) : null);
        sb6.append(" imageHDFileLen: ");
        sb6.append(T4 != null ? java.lang.Long.valueOf(T4.f436366b) : null);
        sb6.append(" videoHDFileLen: ");
        sb6.append(T4 != null ? java.lang.Long.valueOf(T4.f436368d) : null);
        sb6.append(" videoInfo:");
        sb6.append(Ai);
        com.tencent.mars.xlog.Log.i("MediaGallery.ChatLiveStateManager", sb6.toString());
        g0Var.f446063h.put(g0Var.W6(kVar), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c7(wh5.g0 r11, wh5.v r12, l70.d r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh5.g0.c7(wh5.g0, wh5.v, l70.d, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // vf3.a
    public vf3.d K(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        return (vf3.d) ((java.util.LinkedHashMap) this.f446063h).get(W6(mediaInfo));
    }

    @Override // vf3.a
    public vf3.c S3(mf3.k mediaInfo) {
        int i17;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        sf3.g e17 = mediaInfo.e();
        java.lang.String c17 = e17 != null ? e17.c() : null;
        wh5.v vVar = (wh5.v) mediaInfo;
        if (c17 == null || !com.tencent.mm.vfs.w6.j(c17)) {
            i17 = com.tencent.mm.R.string.g0a;
        } else {
            com.tencent.mm.storage.f9 f9Var = vVar.f446096a;
            if (tg3.s1.a(f9Var)) {
                i17 = com.tencent.mm.R.string.o6k;
            } else if (f9Var.z2()) {
                i17 = com.tencent.mm.R.string.g07;
            } else {
                jx3.f.INSTANCE.d(31328, 1, 5000);
                i17 = com.tencent.mm.R.string.g08;
            }
        }
        java.lang.String string = getActivity().getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return new vf3.c(string);
    }

    @Override // vf3.a
    public vf3.b T4(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        wh5.v vVar = (wh5.v) mediaInfo;
        java.util.Map map = this.f446064i;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        if (linkedHashMap.get(mediaInfo.getId()) == null) {
            j15.d dVar = new j15.d();
            java.lang.String j17 = vVar.f446096a.j();
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
            com.tencent.mm.storage.f9 msg = vVar.f446096a;
            kotlin.jvm.internal.o.g(msg, "msg");
            map.put(mediaInfo.getId(), new vf3.b(length, r17, size, o17, p17, ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Zi(msg) <= 0));
        }
        return (vf3.b) linkedHashMap.get(mediaInfo.getId());
    }

    @Override // vf3.i
    public void V6() {
        v65.i.b(this.f436401f, null, new wh5.x(this, null), 1, null);
    }

    @Override // vf3.a
    public boolean c2(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        vf3.d dVar = (vf3.d) ((java.util.LinkedHashMap) this.f446063h).get(W6(mediaInfo));
        if (dVar != null) {
            return dVar.f436374c;
        }
        return false;
    }

    public final java.util.HashSet d7() {
        return (java.util.HashSet) ((jz5.n) this.f446066n).getValue();
    }

    public final java.util.HashSet e7() {
        return (java.util.HashSet) ((jz5.n) this.f446065m).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f7(wh5.v r23, l70.d r24, java.lang.String r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh5.g0.f7(wh5.v, l70.d, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // vf3.a
    public void p1(mf3.k mediaInfo, java.lang.String path, vf3.g listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(listener, "listener");
        wh5.v vVar = mediaInfo instanceof wh5.v ? (wh5.v) mediaInfo : null;
        if (vVar == null) {
            return;
        }
        java.lang.String mediaId = mediaInfo.getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407405g;
        linkedHashMap.put(mVar, path);
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(a17.c());
        java.lang.String str = a18.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            vf3.i.Z6(this, vVar, vf3.e.f436384n, null, null, a17, 6, null);
        } else {
            vf3.i.Z6(this, vVar, vf3.e.f436382i, null, null, null, 14, null);
        }
    }

    @Override // vf3.a
    public void v2(mf3.k mediaInfo, vf3.g listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        a7(mediaInfo, listener);
        wh5.v vVar = mediaInfo instanceof wh5.v ? (wh5.v) mediaInfo : null;
        if (vVar == null) {
            return;
        }
        if (tg3.s1.a(((wh5.v) mediaInfo).f446096a)) {
            com.tencent.mars.xlog.Log.e("MediaGallery.ChatLiveStateManager", "updateState SEC_INVALID, isSecExpired. mediaId: " + mediaInfo.getId());
            vf3.i.Z6(this, mediaInfo, vf3.e.f436386p, null, null, null, 14, null);
            return;
        }
        mediaInfo.getId();
        l70.d h17 = vVar.h();
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.ChatLiveStateManager", "updateState INVALID, videoDownloadParam null. mediaId: " + mediaInfo.getId());
            vf3.i.Z6(this, mediaInfo, vf3.e.f436385o, null, null, null, 14, null);
            return;
        }
        l70.d d17 = vVar.d();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.ChatLiveStateManager", "updateState INVALID, imageDownloadParam null. mediaId: " + mediaInfo.getId());
            vf3.i.Z6(this, mediaInfo, vf3.e.f436385o, null, null, null, 14, null);
            return;
        }
        java.lang.String id6 = mediaInfo.getId();
        wh5.w wVar = new wh5.w(vVar, new wh5.e0(this, mediaInfo));
        this.f446062g.put(id6, wVar);
        d17.f316813n = new java.lang.ref.WeakReference(wVar);
        h17.f316813n = new java.lang.ref.WeakReference(wVar);
        v65.i.b(this.f436401f, null, new wh5.d0(h17, d17, mediaInfo, this, vVar, null), 1, null);
    }

    @Override // vf3.a
    public void x6(mf3.k mediaInfo) {
        l70.d d17;
        l70.d h17;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        wh5.v vVar = mediaInfo instanceof wh5.v ? (wh5.v) mediaInfo : null;
        if (vVar == null || (d17 = vVar.d()) == null || (h17 = vVar.h()) == null) {
            return;
        }
        v65.i.b(this.f436401f, null, new wh5.y(this, d17, vVar, h17, null), 1, null);
    }
}
