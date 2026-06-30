package rm5;

/* loaded from: classes10.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public long f397573a;

    /* renamed from: b, reason: collision with root package name */
    public long f397574b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f397575c;

    /* renamed from: d, reason: collision with root package name */
    public int f397576d;

    /* renamed from: e, reason: collision with root package name */
    public int f397577e;

    /* renamed from: f, reason: collision with root package name */
    public float f397578f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f397579g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.xeffect.effect.EffectManager f397580h;

    /* renamed from: i, reason: collision with root package name */
    public final wm5.g f397581i;

    /* renamed from: j, reason: collision with root package name */
    public wm5.h f397582j;

    /* renamed from: k, reason: collision with root package name */
    public sm5.c f397583k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f397584l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f397585m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f397586n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f397587o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f397588p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f397589q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.tav.codec.IMediaFactory f397590r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode f397591s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.tav.core.AssetExportSession f397592t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.a f397593u;

    public v() {
        this.f397573a = -1L;
        this.f397574b = -1L;
        this.f397575c = new android.graphics.Rect();
        this.f397578f = 30.0f;
        this.f397579g = new android.graphics.Rect();
        this.f397581i = new wm5.g();
        this.f397584l = new java.util.ArrayList();
        this.f397588p = true;
        this.f397591s = com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFill;
        xm5.b.c("VideoComposition", "create VLogComposition", new java.lang.Object[0]);
    }

    public static /* synthetic */ com.tencent.tavkit.composition.TAVSource c(rm5.v vVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildSource");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return vVar.b(z17);
    }

    public final void a(wm5.f fVar) {
        if (fVar != null) {
            wm5.g gVar = this.f397581i;
            gVar.getClass();
            synchronized (gVar.f447353a) {
                if (!gVar.f447353a.contains(fVar)) {
                    gVar.f447353a.add(fVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [uq5.y] */
    /* JADX WARN: Type inference failed for: r9v15 */
    public final com.tencent.tavkit.composition.TAVSource b(boolean z17) {
        com.tencent.tav.core.composition.MutableVideoComposition mutableVideoComposition;
        com.tencent.tavkit.composition.TAVComposition tAVComposition;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        com.tencent.tavkit.composition.TAVClip tAVClip;
        java.lang.String str2;
        java.util.List c17;
        boolean z18;
        java.util.ArrayList arrayList2 = this.f397584l;
        int i17 = 0;
        java.lang.String str3 = "VideoComposition";
        xm5.b.c("VideoComposition", "createComposition: track size " + arrayList2.size(), new java.lang.Object[0]);
        if (arrayList2.isEmpty()) {
            tAVComposition = new com.tencent.tavkit.composition.TAVComposition();
            mutableVideoComposition = null;
        } else {
            com.tencent.tavkit.composition.TAVComposition tAVComposition2 = new com.tencent.tavkit.composition.TAVComposition();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                rm5.j jVar = (rm5.j) it6.next();
                xm5.b.c(str3, "add track type:" + jVar.f397500b + " startTime:" + jVar.f397502d + ", endTime:" + jVar.f397503e + ", trackStartTime:" + jVar.f397504f + ", trackEndTime:" + jVar.f397505g, new java.lang.Object[i17]);
                boolean z19 = this.f397585m;
                int i18 = jVar.f397500b;
                if (i18 != 0) {
                    tAVClip = new com.tencent.tavkit.composition.TAVClip(rm5.l.f397520a.c(jVar));
                    arrayList = arrayList3;
                    tAVClip.setStartTime(new com.tencent.tav.coremedia.CMTime(jVar.f397502d, 1000));
                    str = str3;
                    it = it6;
                    tAVClip.setDuration(new com.tencent.tav.coremedia.CMTime(jVar.f397503e - jVar.f397502d, 1000));
                    tAVClip.getResource().setSourceTimeRange(new com.tencent.tav.coremedia.CMTimeRange(new com.tencent.tav.coremedia.CMTime(jVar.f397504f, 1000), new com.tencent.tav.coremedia.CMTime(jVar.f397505g - jVar.f397504f, 1000)));
                    if (i18 != 2 || z19) {
                        tAVClip.getAudioConfiguration().setVolume(jVar.f397507i);
                    } else {
                        tAVClip.getAudioConfiguration().setVolume(0.0f);
                    }
                    jVar.f397519u = tAVClip;
                    xm5.b.c("CompositionTrack", jVar.f397501c + " buildClip buildVideoClip, path:" + jVar.f397499a + ", video startEnd:[" + jVar.f397504f + ", " + jVar.f397505g + "], material startEnd:[" + jVar.f397502d + ", " + jVar.f397503e + "], volume: " + jVar.f397507i, new java.lang.Object[0]);
                } else {
                    str = str3;
                    arrayList = arrayList3;
                    it = it6;
                    tAVClip = new com.tencent.tavkit.composition.TAVClip(new com.tencent.tavkit.composition.resource.TAVEmptyResource(com.tencent.tav.coremedia.CMTime.CMTimeZero));
                }
                sm5.c cVar = this.f397583k;
                if (cVar != null) {
                    tAVClip.getAudioConfiguration().addAudioProcessorNode(new sm5.a(jVar, (sm5.b) cVar));
                }
                tAVClip.putExtraTrackInfo("key_extra_track", jVar);
                if (jVar.f397502d > 0) {
                    com.tencent.tavkit.composition.TAVClip tAVClip2 = new com.tencent.tavkit.composition.TAVClip(new com.tencent.tavkit.composition.resource.TAVEmptyResource(new com.tencent.tav.coremedia.CMTime(jVar.f397502d, 1000)));
                    tAVClip2.setStartTime(com.tencent.tav.coremedia.CMTime.CMTimeZero);
                    tAVClip2.setDuration(new com.tencent.tav.coremedia.CMTime(jVar.f397502d, 1000));
                    str2 = str;
                    xm5.b.c(str2, "add front empty clip duration:" + jVar.f397502d, new java.lang.Object[0]);
                    c17 = kz5.c0.i(tAVClip2, tAVClip);
                } else {
                    str2 = str;
                    c17 = kz5.b0.c(tAVClip);
                }
                java.util.ArrayList arrayList4 = arrayList;
                arrayList4.add(c17);
                str3 = str2;
                it6 = it;
                i17 = 0;
                arrayList3 = arrayList4;
            }
            java.util.ArrayList arrayList5 = arrayList3;
            java.lang.String str4 = str3;
            java.util.Iterator it7 = arrayList5.iterator();
            int i19 = 0;
            while (it7.hasNext()) {
                java.lang.Object next = it7.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio> list = (java.util.List) next;
                int i28 = ((rm5.j) arrayList2.get(i19)).f397500b;
                if (i28 == 1 || i28 == 2) {
                    tAVComposition2.addVideoChannel(list);
                }
                if (((rm5.j) arrayList2.get(i19)).f397500b == 2 || ((rm5.j) arrayList2.get(i19)).f397500b == 3 || ((rm5.j) arrayList2.get(i19)).f397500b == 1) {
                    tAVComposition2.addAudioChannel(list);
                }
                i19 = i27;
            }
            mutableVideoComposition = null;
            xm5.b.c(str4, "finish build composition, duration:" + (tAVComposition2.getDuration().getTimeUs() / 1000), new java.lang.Object[0]);
            tAVComposition = tAVComposition2;
        }
        java.lang.System.currentTimeMillis();
        com.tencent.mm.xeffect.effect.EffectManager effectManager = this.f397580h;
        uq5.k kVar = uq5.k.PAGTransitionEffect;
        if (effectManager != null) {
            effectManager.p(kVar);
        }
        int size = this.f397584l.size();
        for (int i29 = 1; i29 < size; i29++) {
            java.lang.Object obj = this.f397584l.get(i29 - 1);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            rm5.j jVar2 = (rm5.j) obj;
            java.lang.Object obj2 = this.f397584l.get(i29);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            rm5.j jVar3 = (rm5.j) obj2;
            rm5.n nVar = jVar3.f397515q;
            if (nVar.a()) {
                if (nVar.f397530b == null) {
                    com.tencent.mm.xeffect.effect.EffectManager effectManager2 = this.f397580h;
                    nVar.f397530b = effectManager2 != null ? effectManager2.i(kVar, nVar.f397529a) : mutableVideoComposition;
                }
                uq5.y yVar = nVar.f397530b;
                if (yVar != null) {
                    yVar.b(jVar3.f397502d, jVar2.f397503e);
                }
                com.tencent.mm.xeffect.effect.EffectManager effectManager3 = this.f397580h;
                if (effectManager3 != null) {
                    effectManager3.c(nVar.f397530b);
                }
            }
        }
        java.lang.System.currentTimeMillis();
        if (z17) {
            wm5.h hVar = new wm5.h();
            this.f397582j = hVar;
            hVar.b(this.f397576d, this.f397577e);
            com.tencent.mm.xeffect.effect.EffectManager effectManager4 = this.f397580h;
            if (!kotlin.jvm.internal.o.b(effectManager4, hVar.f447356f)) {
                hVar.f447356f = effectManager4;
                hVar.f447358h = true;
            }
            android.graphics.Rect rect = this.f397579g;
            kotlin.jvm.internal.o.g(rect, "rect");
            android.graphics.Rect rect2 = hVar.f447360j;
            rect2.set(rect);
            if (!rect2.isEmpty()) {
                hVar.f447361k = rect2.width();
                hVar.f447362l = rect2.height();
            }
            hVar.a(this.f397591s);
            z18 = false;
            hVar.f447365o = false;
            hVar.f447357g = this.f397581i;
            tAVComposition.setVideoMixEffect(new wm5.b(hVar));
        } else {
            z18 = false;
        }
        com.tencent.tavkit.composition.builder.TAVCompositionBuilder tAVCompositionBuilder = new com.tencent.tavkit.composition.builder.TAVCompositionBuilder(tAVComposition);
        tAVCompositionBuilder.setReloadChannels(z18);
        tAVCompositionBuilder.setVideoTracksMerge(this.f397588p);
        tAVCompositionBuilder.setAudioTracksMerge(z18);
        com.tencent.tavkit.composition.TAVSource buildSource = tAVCompositionBuilder.buildSource();
        if (!z17) {
            com.tencent.tav.core.composition.VideoComposition videoComposition = buildSource.getVideoComposition();
            kotlin.jvm.internal.o.e(videoComposition, "null cannot be cast to non-null type com.tencent.tav.core.composition.MutableVideoComposition");
            ((com.tencent.tav.core.composition.MutableVideoComposition) videoComposition).setCustomVideoCompositorClass(tm5.a.class);
        }
        com.tencent.tav.core.composition.VideoComposition videoComposition2 = buildSource.getVideoComposition();
        kotlin.jvm.internal.o.e(videoComposition2, "null cannot be cast to non-null type com.tencent.tav.core.composition.MutableVideoComposition");
        ((com.tencent.tav.core.composition.MutableVideoComposition) videoComposition2).setFrameDuration(new com.tencent.tav.coremedia.CMTime(1000L, (int) (this.f397578f * 1000)));
        if (this.f397586n != null) {
            com.tencent.tav.core.composition.VideoComposition videoComposition3 = buildSource.getVideoComposition();
            com.tencent.tav.core.composition.MutableVideoComposition mutableVideoComposition2 = videoComposition3 instanceof com.tencent.tav.core.composition.MutableVideoComposition ? (com.tencent.tav.core.composition.MutableVideoComposition) videoComposition3 : mutableVideoComposition;
            if (mutableVideoComposition2 != null) {
                mutableVideoComposition2.enableLut(this.f397586n);
            }
        }
        return buildSource;
    }

    public final boolean d() {
        this.f397589q = true;
        com.tencent.tav.core.AssetExportSession assetExportSession = this.f397592t;
        if (assetExportSession != null) {
            assetExportSession.cancelExport();
        }
        return true;
    }

    public final void e(boolean z17) {
        xm5.b.c("VideoComposition", "enableVideoSound:" + z17, new java.lang.Object[0]);
        this.f397585m = z17;
    }

    public final com.tencent.tav.core.AssetExportSession f(java.lang.String str, rm5.q qVar, boolean z17, yz5.p pVar, yz5.l lVar) {
        boolean z18;
        xm5.b.c("VideoComposition", "[VCTrace] exportImpl config print: ".concat(xm5.f.f455400a.a(qVar)), new java.lang.Object[0]);
        android.util.Size size = qVar.f397536a;
        android.util.Size size2 = qVar.f397548m;
        if (size2 == null) {
            size2 = size;
        }
        boolean z19 = (size2.getWidth() == size.getWidth() && size2.getHeight() == size.getHeight()) ? false : true;
        com.tencent.tavkit.composition.TAVSource b17 = b(z17);
        com.tencent.tav.core.ExportConfig exportConfig = new com.tencent.tav.core.ExportConfig(size.getWidth(), size.getHeight(), size2.getWidth(), size2.getHeight());
        com.tencent.tav.decoder.logger.WXLoggerConfig create = com.tencent.tav.decoder.logger.WXLoggerFactory.INSTANCE.create(qVar.f397560y, qVar.f397561z);
        exportConfig.setOutputFilePath(str);
        exportConfig.setNeedCorrectSizeByCodecCapabilities(qVar.f397552q);
        exportConfig.setVideoBitRate(qVar.f397537b);
        exportConfig.setVideoFrameRate(qVar.f397538c);
        int i17 = qVar.f397539d;
        exportConfig.setVideoIFrameInterval(i17);
        exportConfig.setLimitProfileLevel(qVar.f397544i);
        boolean z27 = qVar.f397543h;
        exportConfig.setHighProfile(z27);
        int i18 = qVar.f397540e;
        exportConfig.setAudioBitRate(i18);
        int i19 = qVar.f397541f;
        exportConfig.setAudioSampleRateHz(i19);
        int i27 = qVar.f397542g;
        exportConfig.setAudioChannelCount(i27);
        boolean z28 = qVar.f397545j;
        exportConfig.setAudioEncodeNeedCodecSpecificData(z28);
        exportConfig.setEncodeHevc(qVar.f397546k);
        exportConfig.setMinMuxDuration(qVar.f397558w);
        exportConfig.setMinMuxFrameCount(qVar.f397559x);
        exportConfig.loggerConfig = create;
        exportConfig.setColorSpace(qVar.f397549n, qVar.f397550o, qVar.f397551p);
        xm5.b.c("VideoComposition", "export: config: " + exportConfig.getOutputWidth() + ", " + exportConfig.getOutputHeight() + "; video: " + exportConfig.getVideoBitRate() + ", " + exportConfig.getVideoFrameRate() + ", " + i17 + ", " + z27 + "; audio: " + i18 + ", " + i19 + ", " + i27 + ", aacEncodeNeedCodecSpecificData:" + z28 + ", outputHevc:" + qVar.f397546k + ", correctSizeByCodecCapabilities:" + qVar.f397552q, new java.lang.Object[0]);
        com.tencent.tav.core.AssetExportSession assetExportSession = new com.tencent.tav.core.AssetExportSession(b17.getAsset(), exportConfig);
        if (z17) {
            z18 = true;
        } else {
            z18 = true;
            assetExportSession.setAppliesPreferredTrackTransform(true);
        }
        if (z19) {
            assetExportSession.setCalculateBfsTransform(z18);
        }
        assetExportSession.setOutputFilePath(str);
        assetExportSession.setOutputFileType("mp4");
        assetExportSession.setVideoComposition(b17.getVideoComposition());
        assetExportSession.setAudioMix(b17.getAudioMix());
        assetExportSession.setTimeRange(h());
        assetExportSession.setRevertMode(false);
        assetExportSession.setMediaFactory(this.f397590r);
        assetExportSession.setTimeoutParameter(qVar.f397553r, qVar.f397554s, qVar.f397555t);
        assetExportSession.setEnableOptimizedVideoFrameSampling(qVar.f397556u);
        assetExportSession.setEnableNewTextureBlitting(qVar.f397557v);
        assetExportSession.setLoggerConfig(create);
        if (assetExportSession.getVideoComposition() != null) {
            assetExportSession.getVideoComposition().enableLut(this.f397586n);
            assetExportSession.getVideoComposition().setUseSystemHdrTranscode(this.f397587o);
        }
        xm5.b.c("VideoComposition", "export duration:" + (j() - 0) + " playRange:" + h(), new java.lang.Object[0]);
        assetExportSession.exportAsynchronouslyWithCompletionHandler(new rm5.r(lVar, new kotlin.jvm.internal.c0(), android.os.SystemClock.elapsedRealtime(), this, pVar));
        this.f397592t = assetExportSession;
        return assetExportSession;
    }

    public final long g() {
        long j17 = this.f397574b;
        return j17 >= 0 ? j17 : j();
    }

    public final com.tencent.tav.coremedia.CMTimeRange h() {
        return new com.tencent.tav.coremedia.CMTimeRange(new com.tencent.tav.coremedia.CMTime(i(), 1000), new com.tencent.tav.coremedia.CMTime(g() - i(), 1000));
    }

    public final long i() {
        long j17 = this.f397573a;
        if (j17 >= 0) {
            return j17;
        }
        return 0L;
    }

    public final long j() {
        java.lang.Object obj;
        java.util.ArrayList arrayList = this.f397584l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i17 = ((rm5.j) next).f397500b;
            boolean z17 = true;
            if (i17 != 1 && i17 != 2) {
                z17 = false;
            }
            if (z17) {
                arrayList2.add(next);
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        if (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            if (it6.hasNext()) {
                long j17 = ((rm5.j) next2).f397503e;
                do {
                    java.lang.Object next3 = it6.next();
                    long j18 = ((rm5.j) next3).f397503e;
                    if (j17 < j18) {
                        next2 = next3;
                        j17 = j18;
                    }
                } while (it6.hasNext());
            }
            obj = next2;
        } else {
            obj = null;
        }
        rm5.j jVar = (rm5.j) obj;
        if (jVar != null) {
            return jVar.f397503e;
        }
        return 0L;
    }

    public final com.tencent.tav.core.AssetParallelExportSession k(java.lang.String path, rm5.q config, yz5.q qVar, yz5.l lVar) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.tavkit.composition.TAVSource b17 = b(false);
        xm5.b.c("VideoComposition", "[VCTrace] parallelExport config print: ".concat(xm5.f.f455400a.a(config)), new java.lang.Object[0]);
        android.util.Size size = config.f397536a;
        com.tencent.tav.core.ExportConfig exportConfig = new com.tencent.tav.core.ExportConfig(size.getWidth(), size.getHeight());
        exportConfig.setOutputFilePath(path);
        exportConfig.setVideoBitRate(config.f397537b);
        exportConfig.setVideoFrameRate(config.f397538c);
        int i17 = config.f397539d;
        exportConfig.setVideoIFrameInterval(i17);
        exportConfig.setLimitProfileLevel(config.f397544i);
        boolean z17 = config.f397543h;
        exportConfig.setHighProfile(z17);
        int i18 = config.f397540e;
        exportConfig.setAudioBitRate(i18);
        int i19 = config.f397541f;
        exportConfig.setAudioSampleRateHz(i19);
        int i27 = config.f397542g;
        exportConfig.setAudioChannelCount(i27);
        boolean z18 = config.f397545j;
        exportConfig.setAudioEncodeNeedCodecSpecificData(z18);
        exportConfig.setEncodeHevc(config.f397546k);
        exportConfig.setSuggestParallelCount(config.f397547l);
        exportConfig.setMinMuxDuration(config.f397558w);
        exportConfig.setMinMuxFrameCount(config.f397559x);
        xm5.b.c("VideoComposition", "export: config: " + exportConfig.getOutputWidth() + ", " + exportConfig.getOutputHeight() + "; video: " + exportConfig.getVideoBitRate() + ", " + exportConfig.getVideoFrameRate() + ", " + i17 + ", " + z17 + "; audio: " + i18 + ", " + i19 + ", " + i27 + ", aacEncodeNeedCodecSpecificData:" + z18 + ",outputHevc:" + config.f397546k, new java.lang.Object[0]);
        com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession = new com.tencent.tav.core.AssetParallelExportSession(b17.getAsset(), exportConfig);
        assetParallelExportSession.setAppliesPreferredTrackTransform(true);
        assetParallelExportSession.outputFilePath = path;
        assetParallelExportSession.outputFileType = "mp4";
        assetParallelExportSession.videoComposition = b17.getVideoComposition();
        assetParallelExportSession.setAudioMix(b17.getAudioMix());
        assetParallelExportSession.timeRange = h();
        assetParallelExportSession.setRevertMode(false);
        assetParallelExportSession.setMediaFactory(this.f397590r);
        assetParallelExportSession.setTimeoutParameter(config.f397553r, config.f397554s, config.f397555t);
        assetParallelExportSession.setEnableOptimizedVideoFrameSampling(config.f397556u);
        assetParallelExportSession.setEnableNewTextureBlitting(config.f397557v);
        com.tencent.tav.core.composition.VideoComposition videoComposition = assetParallelExportSession.videoComposition;
        if (videoComposition != null) {
            kotlin.jvm.internal.o.d(videoComposition);
            videoComposition.enableLut(this.f397586n);
            com.tencent.tav.core.composition.VideoComposition videoComposition2 = assetParallelExportSession.videoComposition;
            kotlin.jvm.internal.o.d(videoComposition2);
            videoComposition2.setUseSystemHdrTranscode(this.f397587o);
        }
        xm5.b.c("VideoComposition", "export duration:" + (j() - 0) + " playRange:" + h(), new java.lang.Object[0]);
        assetParallelExportSession.exportAsynchronouslyWithCompletionHandler(new rm5.u(lVar, android.os.SystemClock.elapsedRealtime(), qVar, this));
        return assetParallelExportSession;
    }

    public final void l(int i17, int i18) {
        xm5.b.c("VideoComposition", "setAssetSize: " + i17 + ", " + i18, new java.lang.Object[0]);
        this.f397576d = i17;
        this.f397577e = i18;
        wm5.h hVar = this.f397582j;
        if (hVar != null) {
            hVar.b(i17, i18);
        }
        this.f397575c.set(0, 0, i17, i18);
    }

    public final void m(android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        this.f397579g.set(rect);
    }

    public final void n(long j17, long j18) {
        xm5.b.c("VideoComposition", "setPlayRange:[" + j17 + ", " + j18 + ']', new java.lang.Object[0]);
        this.f397573a = j17;
        this.f397574b = j18;
    }

    public final void o(com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode newMode) {
        kotlin.jvm.internal.o.g(newMode, "newMode");
        this.f397591s = newMode;
        wm5.h hVar = this.f397582j;
        if (hVar != null) {
            hVar.a(newMode);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(java.util.List trackList) {
        this();
        kotlin.jvm.internal.o.g(trackList, "trackList");
        this.f397584l.addAll(trackList);
    }
}
