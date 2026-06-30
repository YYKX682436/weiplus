package qu0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final vu0.k f366730a;

    /* renamed from: b, reason: collision with root package name */
    public final vu0.r0 f366731b;

    /* renamed from: c, reason: collision with root package name */
    public final qu0.c f366732c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f366733d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f366734e;

    /* renamed from: f, reason: collision with root package name */
    public final qu0.g f366735f;

    /* renamed from: g, reason: collision with root package name */
    public final int f366736g;

    /* renamed from: h, reason: collision with root package name */
    public final wu0.a f366737h;

    public i(vu0.k audioRecognitionService, vu0.r0 waveformService, qu0.c audioRecordListener) {
        java.lang.Object m521constructorimpl;
        boolean booleanValue;
        com.tencent.mm.vfs.r6 b17;
        qu0.i iVar = this;
        kotlin.jvm.internal.o.g(audioRecognitionService, "audioRecognitionService");
        kotlin.jvm.internal.o.g(waveformService, "waveformService");
        kotlin.jvm.internal.o.g(audioRecordListener, "audioRecordListener");
        iVar.f366730a = audioRecognitionService;
        iVar.f366731b = waveformService;
        iVar.f366732c = audioRecordListener;
        iVar.f366733d = jz5.h.b(qu0.h.f366729d);
        iVar.f366734e = new java.util.concurrent.ConcurrentHashMap();
        iVar.f366735f = new qu0.g(iVar);
        yy0.m0 m0Var = (yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class));
        m0Var.getClass();
        int nj6 = !pp0.h0.Q2(m0Var, false, 1, null) ? 0 : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingNarrationDenoiseType());
        iVar.f366736g = nj6;
        wu0.a aVar = new wu0.a();
        ru0.c[] cVarArr = ru0.c.f399659d;
        if (nj6 == 2) {
            if (aVar.f449649a != null) {
                com.tencent.mars.xlog.Log.e("AudioDenoise3AHelper", "create3aInterface: processInterface == null");
                booleanValue = true;
            } else {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.tencent.mars.xlog.Log.i("AudioDenoise3AHelper", "create3aInterface: ");
                    b17 = aVar.b();
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (b17 == null) {
                    ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "can not find valid voip model, file does not exist")));
                } else {
                    com.tencent.mars.xlog.Log.i("AudioDenoise3AHelper", "create3aInterface: modesFile " + b17.o());
                    com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.MJAudioChannels3aInterface mJAudioChannels3aInterface = new com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.MJAudioChannels3aInterface();
                    int modelBinFilePath = mJAudioChannels3aInterface.setModelBinFilePath(b17.o(), b17.o().length());
                    com.tencent.mars.xlog.Log.i("AudioDenoise3AHelper", "create3aInterface: modeResult " + modelBinFilePath);
                    if (modelBinFilePath != 22) {
                        aVar.a();
                        ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "can not find valid voip model, setModelBinFilePath failed for modeResult:" + modelBinFilePath)));
                    } else {
                        boolean init = mJAudioChannels3aInterface.init();
                        com.tencent.mars.xlog.Log.i("AudioDenoise3AHelper", "create3aInterface: initResult " + init);
                        if (init) {
                            int config = mJAudioChannels3aInterface.setConfig(new com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aConfig());
                            com.tencent.mars.xlog.Log.i("AudioDenoise3AHelper", "create3aInterface: configResult " + config);
                            if (config != 0) {
                                aVar.a();
                                ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "config failed, configResult:" + config)));
                            } else {
                                aVar.f449649a = mJAudioChannels3aInterface;
                                com.tencent.mars.xlog.Log.i("AudioDenoise3AHelper", "create3aInterface: success");
                                ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", "successful")));
                                m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE);
                                java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                                if (m524exceptionOrNullimpl != null) {
                                    com.tencent.mars.xlog.Log.e("AudioDenoise3AHelper", "create3aInterface: failed ", m524exceptionOrNullimpl);
                                }
                                booleanValue = ((java.lang.Boolean) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? java.lang.Boolean.FALSE : m521constructorimpl)).booleanValue();
                            }
                        } else {
                            aVar.a();
                            ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "init failed, initResult:" + init)));
                        }
                    }
                }
                booleanValue = false;
            }
            if (booleanValue) {
                iVar = this;
            } else {
                ru0.c[] cVarArr2 = ru0.c.f399659d;
                iVar = this;
                iVar.f366736g = 1;
            }
        }
        iVar.f366737h = aVar;
        com.tencent.mars.xlog.Log.i("MJAudioManager", "init: denoiseType " + iVar.f366736g + ' ');
        uu0.c.e().f431223r = new qu0.a(iVar);
        uu0.c.e().f431224s = new qu0.b(iVar);
    }

    public final uu0.k a() {
        return (uu0.k) this.f366733d.getValue();
    }

    public final void b(java.util.List narrationSegmentViewModels) {
        int i17;
        kotlin.jvm.internal.o.g(narrationSegmentViewModels, "narrationSegmentViewModels");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f366734e;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!narrationSegmentViewModels.isEmpty()) {
                java.util.Iterator it6 = narrationSegmentViewModels.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    com.tencent.maas.moviecomposing.segments.Segment segment = ((ex0.q) it6.next()).f257167a;
                    kotlin.jvm.internal.o.e(segment, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
                    if (kotlin.jvm.internal.o.b(((com.tencent.maas.moviecomposing.segments.NarrationSegment) segment).Q1(), ((ru0.b) entry.getValue()).f399656b)) {
                        i17 = 1;
                        break;
                    }
                }
            }
            if (i17 != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        concurrentHashMap.clear();
        concurrentHashMap.putAll(linkedHashMap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Collection<ru0.b> values = concurrentHashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (ru0.b bVar : values) {
            if (bVar.f399656b != null && bVar.f399658d != null) {
                arrayList.add(bVar);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            com.tencent.maas.moviecomposing.VocalAdjustmentParams vocalAdjustmentParams = ((ru0.b) it7.next()).f399658d;
            if (vocalAdjustmentParams != null) {
                arrayList2.add(vocalAdjustmentParams);
            }
        }
        float[] a17 = com.tencent.maas.moviecomposing.VocalEnhancementProcessor.a(arrayList2);
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            java.lang.Object next = it8.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ru0.b bVar2 = (ru0.b) next;
            java.lang.String str = bVar2.f399656b;
            if (str != null && bVar2.f399658d != null) {
                hashMap.put(str, java.lang.Float.valueOf(a17[i17]));
            }
            i17 = i18;
        }
        java.util.Iterator it9 = narrationSegmentViewModels.iterator();
        while (it9.hasNext()) {
            ex0.q qVar = (ex0.q) it9.next();
            com.tencent.maas.moviecomposing.segments.Segment segment2 = qVar.f257167a;
            kotlin.jvm.internal.o.e(segment2, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
            java.lang.String Q1 = ((com.tencent.maas.moviecomposing.segments.NarrationSegment) segment2).Q1();
            kotlin.jvm.internal.o.f(Q1, "getOriginNarrationFilePath(...)");
            java.lang.Float f17 = (java.lang.Float) hashMap.get(Q1);
            if (f17 != null) {
                java.lang.Object obj = qVar.f257167a;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.VocalAdjustable");
                float floatValue = f17.floatValue();
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = (com.tencent.maas.moviecomposing.segments.ClipSegment) ((ug.p) obj);
                com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                if (D != null) {
                    com.tencent.maas.moviecomposing.segments.ClipSegment.F0(clipSegment, floatValue, D);
                }
            }
        }
    }
}
