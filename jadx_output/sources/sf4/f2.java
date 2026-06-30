package sf4;

/* loaded from: classes4.dex */
public final class f2 implements t21.i0 {

    /* renamed from: d, reason: collision with root package name */
    public nf4.o f407473d;

    /* renamed from: e, reason: collision with root package name */
    public t21.h0 f407474e;

    /* renamed from: f, reason: collision with root package name */
    public if4.h f407475f;

    /* renamed from: g, reason: collision with root package name */
    public int f407476g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f407477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f407478i;

    public f2(sf4.j2 j2Var) {
        this.f407478i = j2Var;
    }

    @Override // t21.i0
    public void a(java.lang.String mediaId, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        pm0.v.X(new sf4.e2(this, mediaId, i17, i18));
    }

    @Override // t21.i0
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String b17;
        java.lang.Object obj;
        int i17;
        sf4.p1 p1Var;
        int i18;
        r45.xe6 xe6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", "startHttpStream " + str + ' ' + str2 + ' ' + str3 + " this:" + this);
        if4.h hVar = this.f407475f;
        if (hVar != null) {
            ef4.k0 k0Var = ef4.k0.f252459a;
            nf4.o b18 = k0Var.b(hVar);
            this.f407473d = b18;
            if (!com.tencent.mm.vfs.w6.j(b18.field_filePath)) {
                java.lang.String field_filePath = b18.field_filePath;
                kotlin.jvm.internal.o.f(field_filePath, "field_filePath");
                if (!(field_filePath.length() == 0)) {
                    java.lang.String r17 = com.tencent.mm.vfs.w6.r(field_filePath);
                    com.tencent.mm.vfs.w6.u(r17);
                    com.tencent.mm.vfs.w6.t(r17);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", "startHttpStream error downloadFinish " + b18.t0() + " ret:" + com.tencent.mm.vfs.w6.j(b18.field_filePath) + " path:" + b18.field_filePath);
                b18.field_cacheSize = 0;
                b18.field_totalSize = 0;
                ef4.w.f252468t.k().D0(b18);
            }
            if4.h hVar2 = this.f407478i.f407504f;
            if (hVar2 != null) {
                if (mf4.c.f326152d > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryBrowseIDKeyStat", "startHttp");
                    mf4.c.f326158j = true;
                }
                mf4.b bVar = mf4.b.f326142a;
                long j17 = hVar2.f291254b;
                if (bVar.a()) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    java.util.Map map = mf4.b.f326144c;
                    if (map.containsKey(valueOf)) {
                        android.support.v4.media.f.a(map.get(java.lang.Long.valueOf(j17)));
                    }
                }
            }
            if4.h hVar3 = this.f407475f;
            if (com.tencent.mm.sdk.platformtools.t8.K0((hVar3 == null || (xe6Var = hVar3.f291258f) == null) ? null : xe6Var.f390023f)) {
                return;
            }
            sf4.j2 j2Var = this.f407478i;
            j2Var.f407509k++;
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = j2Var.f407499a;
            if (storyVideoView != null) {
                storyVideoView.setNeedShowLoading(true);
            }
            sf4.d2 d2Var = new sf4.d2(this.f407478i);
            d2Var.f407449e = this.f407474e;
            nf4.o oVar = this.f407473d;
            if4.h hVar4 = this.f407475f;
            d2Var.f407450f = oVar;
            d2Var.f407451g = hVar4;
            dn.o oVar2 = new dn.o();
            oVar2.f241785d = "task_StoryVideoViewMgr";
            oVar2.field_mediaId = str;
            oVar2.M1 = str3;
            oVar2.H1 = 1;
            oVar2.Z = 6;
            oVar2.f241809y0 = 4;
            oVar2.field_fullpath = str2;
            oVar2.f241815c2 = d2Var;
            oVar2.field_fileType = 20302;
            oVar2.field_requestVideoFormat = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, str2);
            sf4.u1 u1Var = sf4.u1.f407583a;
            if4.h hVar5 = this.f407475f;
            kotlin.jvm.internal.o.d(hVar5);
            int i19 = hVar5.f291255c;
            java.lang.String str4 = hVar5.f291258f.f390023f;
            if (str4 == null) {
                b17 = "story_local_video_" + i19;
            } else {
                b17 = com.tencent.mm.modelcdntran.i2.b("storyvideo", i19, "story", str4);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                b17 = null;
            }
            sf4.u1.f407594l = b17;
            sf4.u1.f407595m = java.lang.Long.valueOf(hVar5.f291254b);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "markCurrentPlay:" + sf4.u1.f407594l + " then remove it from preload");
            java.util.Iterator it = sf4.u1.f407591i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(b17, ((sf4.q1) obj).f407573c)) {
                        break;
                    }
                }
            }
            sf4.q1 q1Var = (sf4.q1) obj;
            if (q1Var != null) {
                sf4.u1.f407591i.remove(q1Var);
                sf4.u1.f407583a.d(q1Var.f407571a);
            }
            if4.h hVar6 = this.f407478i.f407504f;
            if (hVar6 != null) {
                mf4.b bVar2 = mf4.b.f326142a;
                long j18 = hVar6.f291254b;
                nf4.o oVar3 = this.f407473d;
                if (oVar3 != null) {
                    int i27 = oVar3.field_cacheSize;
                }
                java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
                java.util.Map map2 = mf4.b.f326144c;
                if (map2.containsKey(valueOf2)) {
                    android.support.v4.media.f.a(map2.get(java.lang.Long.valueOf(j18)));
                }
            }
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().f(oVar2);
            if4.h hVar7 = this.f407475f;
            if (hVar7 == null || str == null) {
                return;
            }
            sf4.u1 u1Var2 = sf4.u1.f407583a;
            java.lang.String a17 = k0Var.a(hVar7.f291255c, hVar7.f291258f.f390023f);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "checkPreloadOnVideoPlay:" + a17);
            nf4.o b19 = k0Var.b(hVar7);
            int i28 = b19.field_cacheSize;
            if (i28 <= 0 || (i18 = b19.field_totalSize) <= 0) {
                i17 = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", a17 + " not hit cache or moov not ready");
                p1Var = new sf4.p1(false, 0L, 0L, false);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "hit cache, mediaId:" + a17 + ", cachePercent:" + (i28 / i18) + ", filePath:" + b19.field_filePath);
                java.lang.String str5 = b19.field_filePath;
                com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
                long[] jArr = new long[2];
                c2CDownloadRequest.fileKey = a17;
                c2CDownloadRequest.fileType = 6;
                c2CDownloadRequest.url = hVar7.f291258f.f390023f;
                c2CDownloadRequest.setSavePath(str5);
                c2CDownloadRequest.requestVideoFormat = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, str5);
                boolean queryVideoMoovInfo = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryVideoMoovInfo(c2CDownloadRequest, jArr);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(a17);
                sb6.append(" queryMoovReady: ");
                sb6.append(queryVideoMoovInfo);
                sb6.append(", offset:");
                sb6.append(jArr[0]);
                sb6.append(", length:");
                sb6.append(jArr[1]);
                sb6.append(", preloadFinish:");
                java.util.Set set = sf4.u1.f407590h;
                sb6.append(kz5.n0.O(set, a17));
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", sb6.toString());
                i17 = 0;
                p1Var = new sf4.p1(true, jArr[0], jArr[1], kz5.n0.O(set, a17));
            }
            sf4.p1 p1Var2 = p1Var;
            if (!p1Var2.f407556a || d2Var.f407448d) {
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkPreloadOnVideoPlay ");
            sb7.append(str);
            sb7.append(", moovReady, offset:");
            sb7.append(p1Var2.f407557b);
            sb7.append(", length:");
            sb7.append(p1Var2.f407558c);
            sb7.append(", cacheSize:");
            nf4.o oVar4 = this.f407473d;
            sb7.append(oVar4 != null ? java.lang.Integer.valueOf(oVar4.field_cacheSize) : null);
            sb7.append(", totalSize:");
            nf4.o oVar5 = this.f407473d;
            sb7.append(oVar5 != null ? java.lang.Integer.valueOf(oVar5.field_totalSize) : null);
            sb7.append(", preloadFinish:");
            sb7.append(p1Var2.f407559d);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", sb7.toString());
            long j19 = p1Var2.f407557b;
            if (j19 > 0) {
                long j27 = p1Var2.f407558c;
                if (j27 > 0) {
                    d2Var.onMoovReady(str, j19, j27, new com.tencent.mars.cdn.CdnManager.VideoInfo());
                    nf4.o oVar6 = this.f407473d;
                    this.f407476g = oVar6 != null ? oVar6.field_cacheSize : i17;
                    this.f407477h = p1Var2.f407559d;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        if (r8 == null) goto L67;
     */
    @Override // t21.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf4.f2.c(java.lang.String):void");
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
        this.f407474e = h0Var;
    }

    @Override // t21.i0
    public boolean e(java.lang.String mediaId, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if4.h hVar = this.f407475f;
        if (hVar != null) {
            nf4.o b17 = ef4.k0.f252459a.b(hVar);
            this.f407473d = b17;
            if (b17.t0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isVideoDataAvailable ");
                sb6.append(mediaId);
                sb6.append(", ");
                sb6.append(i17);
                sb6.append(", ");
                sb6.append(i18);
                sb6.append(", download finish cacheSize:");
                nf4.o oVar = this.f407473d;
                sb6.append(oVar != null ? java.lang.Integer.valueOf(oVar.field_cacheSize) : null);
                sb6.append(" this:");
                sb6.append(this);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
                return true;
            }
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        boolean o17 = t21.o2.Di().o(mediaId, i17, i18);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isVideoDataAvailable ");
        sb7.append(mediaId);
        sb7.append(", ");
        sb7.append(i17);
        sb7.append(", ");
        sb7.append(i18);
        sb7.append(", available:");
        sb7.append(o17);
        sb7.append(" cacheSize:");
        nf4.o oVar2 = this.f407473d;
        sb7.append(oVar2 != null ? java.lang.Integer.valueOf(oVar2.field_cacheSize) : null);
        sb7.append(" this:");
        sb7.append(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", sb7.toString());
        return o17;
    }
}
