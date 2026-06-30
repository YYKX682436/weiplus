package ex0;

/* loaded from: classes5.dex */
public final class a0 {
    public final androidx.lifecycle.j0 A;
    public final androidx.lifecycle.j0 B;
    public final androidx.lifecycle.j0 C;
    public final java.util.concurrent.ConcurrentHashMap D;
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo E;
    public int F;
    public final java.util.ArrayList G;
    public final dx0.g H;
    public final ex0.e I;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.ComposingSession f257091a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.Timeline f257092b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f257093c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f257094d;

    /* renamed from: e, reason: collision with root package name */
    public final mv0.b f257095e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f257096f;

    /* renamed from: g, reason: collision with root package name */
    public final ex0.v f257097g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f257098h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f257099i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f257100j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f257101k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f257102l;

    /* renamed from: m, reason: collision with root package name */
    public mv0.b f257103m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f257104n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257105o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257106p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257107q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257108r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257109s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257110t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257111u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257112v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257113w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257114x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257115y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257116z;

    public a0(float f17, com.tencent.maas.moviecomposing.ComposingSession composingSession, com.tencent.maas.moviecomposing.Timeline timeline, java.util.List assetPaths, kotlinx.coroutines.y0 mainScope, kotlinx.coroutines.p0 uiDispatcher, mv0.b originAspectRatio, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 32) != 0) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            uiDispatcher = kotlinx.coroutines.internal.b0.f310484a;
        }
        kotlin.jvm.internal.o.g(composingSession, "composingSession");
        kotlin.jvm.internal.o.g(timeline, "timeline");
        kotlin.jvm.internal.o.g(assetPaths, "assetPaths");
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        kotlin.jvm.internal.o.g(uiDispatcher, "uiDispatcher");
        kotlin.jvm.internal.o.g(originAspectRatio, "originAspectRatio");
        this.f257091a = composingSession;
        this.f257092b = timeline;
        this.f257093c = mainScope;
        this.f257094d = uiDispatcher;
        this.f257095e = originAspectRatio;
        this.f257096f = new java.util.HashMap();
        com.tencent.maas.model.time.MJTime mJTime = timeline.f48416c;
        kotlin.jvm.internal.o.f(mJTime, "getMinSegmentPreservedDuration(...)");
        this.f257098h = mJTime;
        this.f257099i = com.tencent.maas.model.time.MJTime.fromSeconds(0.3d);
        this.f257100j = com.tencent.maas.model.time.MJTime.fromSeconds(0.5d);
        this.f257101k = com.tencent.maas.model.time.MJTime.fromSeconds(0.3d);
        this.f257102l = com.tencent.maas.model.time.MJTime.fromSeconds(60.0d);
        this.f257103m = originAspectRatio;
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).getClass();
        this.f257104n = com.tencent.maas.model.time.MJTime.fromMilliseconds(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingTransitionDisplayDurationMs()));
        this.f257105o = new androidx.lifecycle.j0();
        this.f257106p = new androidx.lifecycle.j0();
        this.f257107q = new androidx.lifecycle.j0(com.tencent.maas.model.time.MJTime.InvalidTime);
        this.f257114x = new androidx.lifecycle.j0(ax0.e.f14975d);
        this.f257115y = new androidx.lifecycle.j0();
        this.f257116z = new androidx.lifecycle.j0();
        this.A = new androidx.lifecycle.j0();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.B = new androidx.lifecycle.j0(bool);
        this.C = new androidx.lifecycle.j0(bool);
        this.D = new java.util.concurrent.ConcurrentHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.G = arrayList;
        float f18 = 48;
        this.H = new dx0.g(this, new android.util.Size((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f18), (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f18)), new ex0.y(this), mainScope);
        this.I = new ex0.e();
        com.tencent.maas.moviecomposing.Storyline storyline = timeline.f48414a;
        kotlin.jvm.internal.o.f(storyline, "getStoryline(...)");
        this.f257097g = new ex0.v(storyline);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_mj_publisher_digizoom_default_val, 0) == 1;
        com.tencent.mars.xlog.Log.i("TimelineViewModel", "initImageDigiZoom: " + z17);
        R(z17);
        timeline.x();
        float f19 = f17 * 60.0f;
        this.f257108r = new androidx.lifecycle.j0(java.lang.Float.valueOf(f19));
        this.f257109s = new androidx.lifecycle.j0(java.lang.Float.valueOf(f19));
        this.f257110t = new androidx.lifecycle.j0(java.lang.Float.valueOf(f19));
        this.f257111u = new androidx.lifecycle.j0(java.lang.Float.valueOf(f19));
        this.f257112v = new androidx.lifecycle.j0(java.lang.Float.valueOf(f19));
        this.f257113w = new androidx.lifecycle.j0(java.lang.Float.valueOf(f19));
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = assetPaths.iterator();
        while (it.hasNext()) {
            java.lang.String c17 = com.tencent.maas.moviecomposing.ComposingFactory.c((com.tencent.maas.instamovie.base.asset.MJAssetInfo) it.next());
            if (c17 != null) {
                arrayList2.add(c17);
            }
        }
        this.G.addAll(arrayList2);
        ex0.f0 f0Var = new ex0.f0(this);
        ex0.d0 d0Var = new ex0.d0(this);
        ex0.h0 h0Var = new ex0.h0(this);
        ex0.e0 e0Var = new ex0.e0(this);
        ax0.e eVar = ax0.e.f14975d;
        java.util.HashMap hashMap = this.f257096f;
        hashMap.put(0, f0Var);
        hashMap.put(1, d0Var);
        hashMap.put(4, d0Var);
        hashMap.put(2, h0Var);
        hashMap.put(5, h0Var);
        hashMap.put(3, e0Var);
        hashMap.put(6, e0Var);
    }

    public final boolean A() {
        ex0.r n17 = n();
        if (!(n17 != null && n17.p())) {
            return false;
        }
        switch (r().ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public final boolean B() {
        java.lang.String p17 = this.f257092b.p("ImageDigiZoomEnabled");
        if (p17 == null) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_mj_publisher_digizoom_default_val, 0) == 1) {
                return true;
            }
        } else {
            java.lang.String lowerCase = p17.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            int hashCode = lowerCase.hashCode();
            if (hashCode != 49) {
                if (hashCode != 121) {
                    if (hashCode != 119527) {
                        if (hashCode == 3569038 && lowerCase.equals("true")) {
                            return true;
                        }
                    } else if (lowerCase.equals("yes")) {
                        return true;
                    }
                } else if (lowerCase.equals("y")) {
                    return true;
                }
            } else if (lowerCase.equals("1")) {
                return true;
            }
        }
        return false;
    }

    public final boolean C(com.tencent.maas.model.time.MJTime time) {
        kotlin.jvm.internal.o.g(time, "time");
        com.tencent.maas.model.time.MJTime mJTime = this.I.f257124b;
        return mJTime.isValid() && time.sub(mJTime).bigThan(this.f257102l);
    }

    public final boolean D(com.tencent.maas.base.MJID segmentID) {
        int indexOf;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.v vVar = this.f257097g;
        ex0.r g17 = vVar.g(segmentID);
        if (g17 == null || (indexOf = ((java.util.ArrayList) vVar.f257177e).indexOf(g17)) < 0) {
            return false;
        }
        kz5.c0.g(vVar.f257177e);
        return indexOf == 0;
    }

    public final boolean E(com.tencent.maas.base.MJID segmentID) {
        int indexOf;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.v vVar = this.f257097g;
        ex0.r g17 = vVar.g(segmentID);
        return g17 != null && (indexOf = ((java.util.ArrayList) vVar.f257177e).indexOf(g17)) >= 0 && indexOf == ((java.util.ArrayList) vVar.f257177e).size() - 1;
    }

    public final boolean F() {
        com.tencent.maas.moviecomposing.segments.MusicSegment m17 = this.f257092b.f48414a.m();
        if (m17 == null) {
            return false;
        }
        this.E = null;
        this.F = 0;
        com.tencent.maas.base.MJID mjid = m17.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        return G(mjid, true, ax0.e.f14975d);
    }

    public final boolean G(com.tencent.maas.base.MJID segmentID, boolean z17, ax0.e targetEditingState) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(targetEditingState, "targetEditingState");
        if (!h(segmentID)) {
            h(segmentID);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return false;
        }
        this.f257092b.w(segmentID);
        int ordinal = targetEditingState.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            ex0.r n17 = n();
            if (n17 != null) {
                n17.f257171e = ax0.b.f14964d;
            }
            M(null);
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        O(targetEditingState);
        if (z17) {
            com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) this.f257106p.getValue();
            if (mJTime == null) {
                mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            }
            kotlin.jvm.internal.o.d(mJTime);
            ex0.i0.a(this, mJTime);
        }
        J(cx0.d.f224510f.a(cx0.d.f224509e), null);
        return true;
    }

    public final void H() {
        androidx.lifecycle.j0 j0Var = this.f257115y;
        kz5.p0 p0Var = kz5.p0.f313996d;
        java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f224508d);
        kotlin.jvm.internal.o.f(of6, "of(...)");
        j0Var.setValue(new cx0.c(p0Var, p0Var, p0Var, of6, null));
    }

    public final void I(ex0.f segmentVM) {
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        if (segmentVM.f257170d) {
            com.tencent.maas.model.time.MJTime c17 = this.f257097g.c();
            com.tencent.maas.model.time.MJTimeRange l17 = segmentVM.l();
            com.tencent.maas.model.time.MJTime startTime = l17.getStartTime();
            com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            if (startTime.smallThan(mJTime)) {
                com.tencent.maas.model.time.MJTime add = l17.getDuration().add(l17.getStartTime());
                kotlin.jvm.internal.o.f(add, "add(...)");
                segmentVM.z(add);
            }
            if (l17.getEndTime().bigThan(c17)) {
                com.tencent.maas.model.time.MJTime startTime2 = l17.getStartTime();
                if (!startTime2.bigThan(mJTime)) {
                    startTime2 = null;
                }
                if (startTime2 != null) {
                    mJTime = startTime2;
                }
                com.tencent.maas.model.time.MJTime sub = c17.sub(mJTime);
                kotlin.jvm.internal.o.f(sub, "sub(...)");
                segmentVM.y(sub);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(java.util.EnumSet r22, cx0.e r23) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.a0.J(java.util.EnumSet, cx0.e):void");
    }

    public final ex0.r K(com.tencent.maas.base.MJID mjid) {
        return this.f257097g.g(mjid);
    }

    public final boolean L(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, java.lang.String filePath, float f17, boolean z17) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(audioCacheInfo, "audioCacheInfo");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.E = audioCacheInfo;
        com.tencent.mars.xlog.Log.i("TimelineViewModel", "[selectMusic] " + audioCacheInfo.f155723t + " duration:" + audioCacheInfo.f155720q + " mirBegin:" + audioCacheInfo.E + " mirEnd:" + audioCacheInfo.F);
        com.tencent.maas.model.MJMusicInfo a17 = ou0.e.a(audioCacheInfo, false);
        com.tencent.maas.moviecomposing.Timeline timeline = this.f257092b;
        com.tencent.maas.moviecomposing.segments.MusicSegment m17 = timeline.f48414a.m();
        com.tencent.maas.base.MJID mjid = null;
        if (m17 != null) {
            com.tencent.maas.moviecomposing.Timeline D = m17.D();
            java.lang.String D1 = D != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.D1(m17, D) : "";
            com.tencent.maas.model.time.MJTime z18 = m17.z();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.maas.moviecomposing.Timeline D2 = m17.D();
            boolean booleanValue = (D2 != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.K1(m17, a17, filePath, D1, z18, true, D2) : bool).booleanValue();
            if (z17) {
                com.tencent.maas.moviecomposing.Timeline D3 = m17.D();
                if (D3 != null) {
                    bool = com.tencent.maas.moviecomposing.segments.MusicSegment.I1(m17, D3);
                }
                bool.booleanValue();
            } else {
                com.tencent.maas.moviecomposing.Timeline D4 = m17.D();
                if (D4 != null) {
                    com.tencent.maas.moviecomposing.segments.MusicSegment.F1(m17, D4);
                }
            }
            if (booleanValue) {
                J(cx0.d.f224510f.a(cx0.d.f224509e), null);
                ex0.o o17 = o();
                if (o17 != null) {
                    o17.E(f17);
                }
            }
            return booleanValue;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(timeline.g(a17, filePath, "", com.tencent.maas.model.time.MJTime.ZeroTime, timeline.l(), true));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        com.tencent.maas.base.MJID mjid2 = (com.tencent.maas.base.MJID) m521constructorimpl;
        if (mjid2 != null) {
            J(cx0.d.f224510f.a(cx0.d.f224509e), null);
            mjid = mjid2;
        }
        ex0.o o18 = o();
        if (o18 != null) {
            com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = o18.f257154q;
            musicSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D5 = musicSegment.D();
            if (D5 != null) {
                com.tencent.maas.moviecomposing.segments.MusicSegment.M1(musicSegment, true, D5);
            }
            musicSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D6 = musicSegment.D();
            if (D6 != null) {
                com.tencent.maas.moviecomposing.segments.MusicSegment.z1(musicSegment, true, D6);
            }
            o18.E(f17);
            if (z17) {
                musicSegment.getClass();
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                com.tencent.maas.moviecomposing.Timeline D7 = musicSegment.D();
                if (D7 != null) {
                    bool2 = com.tencent.maas.moviecomposing.segments.MusicSegment.I1(musicSegment, D7);
                }
                bool2.booleanValue();
            } else {
                musicSegment.getClass();
                com.tencent.maas.moviecomposing.Timeline D8 = musicSegment.D();
                if (D8 != null) {
                    com.tencent.maas.moviecomposing.segments.MusicSegment.F1(musicSegment, D8);
                }
            }
        }
        return mjid != null;
    }

    public final void M(ex0.r rVar) {
        this.f257105o.setValue(rVar);
    }

    public final void N(com.tencent.maas.model.time.MJTime playheadTime, boolean z17) {
        kotlin.jvm.internal.o.g(playheadTime, "playheadTime");
        if (z17) {
            this.f257107q.setValue(playheadTime);
        }
        androidx.lifecycle.j0 j0Var = this.f257106p;
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) j0Var.getValue();
        boolean z18 = false;
        if (mJTime != null && mJTime.equalsTo(playheadTime)) {
            z18 = true;
        }
        if (z18) {
            return;
        }
        j0Var.setValue(playheadTime);
    }

    public final void O(ax0.e state) {
        kotlin.jvm.internal.o.g(state, "state");
        this.f257114x.setValue(state);
    }

    public final jz5.l P() {
        java.lang.Object m521constructorimpl;
        ex0.r n17 = n();
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (n17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return new jz5.l(java.lang.Boolean.FALSE, p0Var);
        }
        androidx.lifecycle.j0 j0Var = this.f257106p;
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) j0Var.getValue();
        if (mJTime == null) {
            return new jz5.l(java.lang.Boolean.FALSE, p0Var);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!n17.n(mJTime)) {
            return new jz5.l(java.lang.Boolean.FALSE, p0Var);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(kz5.h0.w(arrayList, this.f257092b.z(n17.f257168b, mJTime, true))));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("TimelineViewModel", "Failed to call timeline.splitSegment. e:" + m524exceptionOrNullimpl);
            return new jz5.l(java.lang.Boolean.FALSE, p0Var);
        }
        J(cx0.d.f224510f.a(cx0.d.f224509e), null);
        com.tencent.maas.model.time.MJTime mJTime2 = (com.tencent.maas.model.time.MJTime) j0Var.getValue();
        if (mJTime2 == null) {
            mJTime2 = com.tencent.maas.model.time.MJTime.InvalidTime;
        }
        kotlin.jvm.internal.o.d(mJTime2);
        ex0.i0.a(this, mJTime2);
        return new jz5.l(java.lang.Boolean.TRUE, arrayList);
    }

    public final void Q(com.tencent.maas.moviecomposing.TimelineOpDesc timelineOpDesc, cx0.a aVar) {
        ex0.v vVar = this.f257097g;
        vVar.h();
        vVar.i(false);
        com.tencent.maas.model.time.MJTime playheadTime = timelineOpDesc.getPlayheadTime();
        kotlin.jvm.internal.o.f(playheadTime, "getPlayheadTime(...)");
        java.lang.String focusedSegmentID = timelineOpDesc.getFocusedSegmentID();
        com.tencent.maas.base.MJID of6 = focusedSegmentID != null ? com.tencent.maas.base.MJID.of(focusedSegmentID) : null;
        if (of6 == null || !h(of6)) {
            ex0.r b17 = ex0.i0.b(this, playheadTime);
            if (b17 != null && !kotlin.jvm.internal.o.b(b17, n())) {
                ex0.r n17 = n();
                if (n17 != null) {
                    n17.f257171e = ax0.b.f14964d;
                }
                b17.f257171e = ax0.b.f14965e;
                M(b17);
            }
            if (b17 != null) {
                playheadTime = b17.k();
            }
        } else {
            ex0.r K = K(of6);
            if (K != null) {
                l(K);
                if (!K.l().containsTime(playheadTime)) {
                    playheadTime = K.k();
                }
            }
        }
        N(playheadTime, true);
        ex0.r n18 = n();
        if (n18 != null) {
            if (n18.p()) {
                androidx.lifecycle.j0 j0Var = this.f257114x;
                java.lang.Object value = j0Var.getValue();
                ax0.e eVar = ax0.e.f14977f;
                if (value == eVar || j0Var.getValue() == ax0.e.f14980i) {
                    if (vVar.d(n18)) {
                        eVar = ax0.e.f14980i;
                    }
                    O(eVar);
                    v(n());
                }
            }
            if (vVar.d(n18)) {
                if (n18.f257169c == ug.m.Music) {
                    O(ax0.e.f14980i);
                    v(n());
                } else {
                    O(ax0.e.f14975d);
                }
            } else if (vVar.e(n18)) {
                O(ax0.e.f14975d);
            } else {
                O(ax0.e.f14975d);
            }
        }
        androidx.lifecycle.j0 j0Var2 = this.f257116z;
        java.lang.String title = timelineOpDesc.getTitle();
        kotlin.jvm.internal.o.f(title, "getTitle(...)");
        j0Var2.setValue(new cx0.f(aVar, title, playheadTime));
        S();
    }

    public final void R(boolean z17) {
        com.tencent.maas.moviecomposing.Timeline D;
        this.f257092b.y("ImageDigiZoomEnabled", z17 ? "1" : "0");
        for (ex0.r rVar : this.f257097g.f257177e) {
            if (rVar.f257169c == ug.m.ImageClip) {
                com.tencent.maas.moviecomposing.segments.Segment segment = rVar.f257167a;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment != null && (D = clipSegment.D()) != null) {
                    com.tencent.maas.moviecomposing.segments.ClipSegment.y0(clipSegment, z17, D);
                }
            }
        }
    }

    public final void S() {
        androidx.lifecycle.j0 j0Var = this.B;
        com.tencent.maas.moviecomposing.ComposingSession composingSession = this.f257091a;
        j0Var.setValue(java.lang.Boolean.valueOf(composingSession.b()));
        this.C.setValue(java.lang.Boolean.valueOf(composingSession.a()));
    }

    public final com.tencent.maas.model.time.MJTime a(com.tencent.maas.model.time.MJTime targetTime) {
        kotlin.jvm.internal.o.g(targetTime, "targetTime");
        com.tencent.maas.model.time.MJTime a17 = this.f257092b.a(targetTime);
        kotlin.jvm.internal.o.f(a17, "alignTimeToVideoFrameBoundary(...)");
        return a17;
    }

    public final void b(double d17) {
        ex0.r n17 = n();
        ex0.c cVar = n17 instanceof ex0.c ? (ex0.c) n17 : null;
        if (cVar != null) {
            cVar.F(d17);
        }
        java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f224510f);
        kotlin.jvm.internal.o.f(of6, "of(...)");
        J(of6, null);
    }

    public final void c(ax0.a edge) {
        kotlin.jvm.internal.o.g(edge, "edge");
        n();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ex0.r n17 = n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        fVar.f257134j = edge;
        fVar.f257135k = ax0.d.f14972e;
        fVar.f257137m = ax0.c.f14967d;
        fVar.f257131g = fVar.i();
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        fVar.f257132h = ZeroTime;
        fVar.f257133i = true;
    }

    public final boolean d(ex0.j0 transitionSegmentVM, java.lang.String transitionId) {
        boolean z17;
        kotlin.jvm.internal.o.g(transitionSegmentVM, "transitionSegmentVM");
        kotlin.jvm.internal.o.g(transitionId, "transitionId");
        if (kotlin.jvm.internal.o.b(transitionId, "Blank")) {
            return true;
        }
        if (!transitionSegmentVM.s()) {
            com.tencent.maas.moviecomposing.segments.TransitionDesc I = transitionSegmentVM.f257143f.I();
            if (I != null && I.f48535b) {
                z17 = true;
                return !((z17 && com.tencent.maas.moviecomposing.segments.TransitionDesc.b(transitionId).f48535b) || transitionSegmentVM.s()) || t(transitionSegmentVM).isValid();
            }
        }
        z17 = false;
        if ((z17 && com.tencent.maas.moviecomposing.segments.TransitionDesc.b(transitionId).f48535b) || transitionSegmentVM.s()) {
            return true;
        }
    }

    public final boolean e(com.tencent.maas.model.time.MJTime duration) {
        com.tencent.maas.model.time.MJTime duration2;
        kotlin.jvm.internal.o.g(duration, "duration");
        java.util.Iterator it = ((java.util.ArrayList) this.f257097g.f257177e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return true;
            }
            ex0.r rVar = (ex0.r) it.next();
            ug.m mVar = rVar.f257169c;
            if (mVar != ug.m.Transition && mVar != ug.m.ImageClip) {
                com.tencent.maas.moviecomposing.segments.Segment segment = rVar.f257167a;
                com.tencent.maas.model.time.MJTimeRange mJTimeRange = null;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment != null) {
                    mJTimeRange = com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange;
                    com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                    if (D != null) {
                        mJTimeRange = com.tencent.maas.moviecomposing.segments.ClipSegment.T0(clipSegment, D);
                    }
                }
                if ((mJTimeRange == null || (duration2 = mJTimeRange.getDuration()) == null || !duration2.smallThan(duration)) ? false : true) {
                    return false;
                }
            }
        }
    }

    public final void f(boolean z17) {
        com.tencent.maas.moviecomposing.Timeline D;
        java.util.Iterator it = ((java.util.ArrayList) this.f257097g.f257177e).iterator();
        while (it.hasNext()) {
            ex0.r rVar = (ex0.r) it.next();
            if (ou0.b0.b(rVar.f257167a)) {
                com.tencent.maas.moviecomposing.segments.Segment segment = rVar.f257167a;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment != null && (D = clipSegment.D()) != null) {
                    com.tencent.maas.moviecomposing.segments.ClipSegment.I0(clipSegment, z17, D);
                }
            }
        }
    }

    public final void g() {
        ex0.o o17 = o();
        if (o17 == null) {
            return;
        }
        java.util.Iterator it = this.f257097g.f257177e.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long flicks = ((ex0.r) next).l().getEndTime().getFlicks();
            do {
                java.lang.Object next2 = it.next();
                long flicks2 = ((ex0.r) next2).l().getEndTime().getFlicks();
                if (flicks < flicks2) {
                    next = next2;
                    flicks = flicks2;
                }
            } while (it.hasNext());
        }
        com.tencent.maas.model.time.MJTime endTime = ((ex0.r) next).l().getEndTime();
        if (o17.l().getEndTime().bigThan(endTime)) {
            com.tencent.maas.model.time.MJTime sub = endTime.sub(o17.k());
            kotlin.jvm.internal.o.f(sub, "sub(...)");
            o17.y(sub);
        }
    }

    public final boolean h(com.tencent.maas.base.MJID mjid) {
        return this.f257097g.b(mjid);
    }

    public final void i() {
        n();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ex0.r n17 = n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        int ordinal = fVar.f257134j.ordinal();
        com.tencent.maas.moviecomposing.Timeline timeline = this.f257092b;
        if (ordinal == 1) {
            com.tencent.maas.model.time.MJTime a17 = timeline.a(fVar.i());
            kotlin.jvm.internal.o.f(a17, "alignTimeToVideoFrameBoundary(...)");
            fVar.z(a17);
        } else if (ordinal == 2) {
            com.tencent.maas.model.time.MJTime a18 = timeline.a(fVar.i());
            kotlin.jvm.internal.o.f(a18, "alignTimeToVideoFrameBoundary(...)");
            fVar.y(a18);
        }
        fVar.f257136l = fVar.l();
        fVar.f257134j = ax0.a.f14960d;
        fVar.f257135k = ax0.d.f14971d;
        fVar.f257137m = ax0.c.f14967d;
        fVar.f257133i = false;
        java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f224509e, cx0.d.f224510f);
        kotlin.jvm.internal.o.f(of6, "of(...)");
        J(of6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[EDGE_INSN: B:11:0x0038->B:12:0x0038 BREAK  A[LOOP:0: B:2:0x000c->B:15:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[LOOP:0: B:2:0x000c->B:15:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ex0.r j(ex0.j0 r6) {
        /*
            r5 = this;
            com.tencent.maas.model.time.MJTimeRange r6 = r6.l()
            ex0.v r0 = r5.f257097g
            java.util.List r0 = r0.f257177e
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            r2 = r1
            ex0.r r2 = (ex0.r) r2
            com.tencent.maas.model.time.MJTimeRange r3 = r2.l()
            com.tencent.maas.model.time.MJTime r3 = r3.getStartTime()
            com.tencent.maas.model.time.MJTime r4 = r6.getEndTime()
            boolean r3 = r3.equalsTo(r4)
            if (r3 == 0) goto L33
            ug.m r3 = ug.m.Transition
            ug.m r2 = r2.f257169c
            if (r2 == r3) goto L33
            r2 = 1
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 == 0) goto Lc
            goto L38
        L37:
            r1 = 0
        L38:
            ex0.r r1 = (ex0.r) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.a0.j(ex0.j0):ex0.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[EDGE_INSN: B:11:0x0038->B:12:0x0038 BREAK  A[LOOP:0: B:2:0x000c->B:15:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[LOOP:0: B:2:0x000c->B:15:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ex0.r k(ex0.j0 r6) {
        /*
            r5 = this;
            com.tencent.maas.model.time.MJTimeRange r6 = r6.l()
            ex0.v r0 = r5.f257097g
            java.util.List r0 = r0.f257177e
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            r2 = r1
            ex0.r r2 = (ex0.r) r2
            com.tencent.maas.model.time.MJTimeRange r3 = r2.l()
            com.tencent.maas.model.time.MJTime r3 = r3.getEndTime()
            com.tencent.maas.model.time.MJTime r4 = r6.getStartTime()
            boolean r3 = r3.equalsTo(r4)
            if (r3 == 0) goto L33
            ug.m r3 = ug.m.Transition
            ug.m r2 = r2.f257169c
            if (r2 == r3) goto L33
            r2 = 1
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 == 0) goto Lc
            goto L38
        L37:
            r1 = 0
        L38:
            ex0.r r1 = (ex0.r) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.a0.k(ex0.j0):ex0.r");
    }

    public final void l(ex0.r segmentVM) {
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        if (kotlin.jvm.internal.o.b(segmentVM, n())) {
            return;
        }
        ex0.r n17 = n();
        if (n17 != null) {
            n17.f257171e = ax0.b.f14964d;
        }
        M(segmentVM);
    }

    public final dx0.p m(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return this.H.d(segmentID);
    }

    public final ex0.r n() {
        return (ex0.r) this.f257105o.getValue();
    }

    public final ex0.o o() {
        java.lang.Object obj;
        java.util.Iterator it = this.f257097g.f257178f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ex0.r) obj).f257169c == ug.m.Music) {
                break;
            }
        }
        if (obj instanceof ex0.o) {
            return (ex0.o) obj;
        }
        return null;
    }

    public final com.tencent.maas.moviecomposing.o0 p(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.D;
        if (concurrentHashMap.containsKey(segmentID)) {
            return (com.tencent.maas.moviecomposing.o0) concurrentHashMap.get(segmentID);
        }
        return null;
    }

    public final com.tencent.maas.model.time.MJTimeRange q() {
        com.tencent.maas.model.time.MJTimeRange n17 = this.f257097g.f257173a.n();
        kotlin.jvm.internal.o.f(n17, "getPresentationTimeRange(...)");
        return n17;
    }

    public final ax0.e r() {
        ax0.e eVar = (ax0.e) this.f257114x.getValue();
        return eVar == null ? ax0.e.f14975d : eVar;
    }

    public final float s(bx0.i layoutType) {
        kotlin.jvm.internal.o.g(layoutType, "layoutType");
        int ordinal = layoutType.ordinal();
        if (ordinal == 0) {
            java.lang.Float f17 = (java.lang.Float) this.f257109s.getValue();
            if (f17 == null) {
                return 1.0f;
            }
            return f17.floatValue();
        }
        if (ordinal == 1) {
            java.lang.Float f18 = (java.lang.Float) this.f257113w.getValue();
            if (f18 == null) {
                return 1.0f;
            }
            return f18.floatValue();
        }
        if (ordinal == 2) {
            java.lang.Float f19 = (java.lang.Float) this.f257112v.getValue();
            if (f19 == null) {
                return 1.0f;
            }
            return f19.floatValue();
        }
        if (ordinal == 3) {
            java.lang.Float f27 = (java.lang.Float) this.f257110t.getValue();
            if (f27 == null) {
                return 1.0f;
            }
            return f27.floatValue();
        }
        if (ordinal != 4) {
            java.lang.Float f28 = (java.lang.Float) this.f257108r.getValue();
            if (f28 == null) {
                return 1.0f;
            }
            return f28.floatValue();
        }
        java.lang.Float f29 = (java.lang.Float) this.f257111u.getValue();
        if (f29 == null) {
            return 1.0f;
        }
        return f29.floatValue();
    }

    public final com.tencent.maas.model.time.MJTime t(ex0.j0 j0Var) {
        ex0.r k17 = k(j0Var);
        ex0.c cVar = k17 instanceof ex0.c ? (ex0.c) k17 : null;
        if (cVar == null) {
            com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
            return InvalidTime;
        }
        ex0.r j17 = j(j0Var);
        ex0.c cVar2 = j17 instanceof ex0.c ? (ex0.c) j17 : null;
        if (cVar2 == null) {
            com.tencent.maas.model.time.MJTime InvalidTime2 = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime2, "InvalidTime");
            return InvalidTime2;
        }
        com.tencent.maas.model.time.MJTime i17 = cVar.i();
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = cVar.f257119p;
        clipSegment.getClass();
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
        com.tencent.maas.model.time.MJTime Q = D != null ? com.tencent.maas.moviecomposing.segments.ElementSegment.Q(clipSegment, D) : mJTime;
        kotlin.jvm.internal.o.f(Q, "getTransInDuration(...)");
        com.tencent.maas.model.time.MJTime sub = i17.sub(Q);
        com.tencent.maas.model.time.MJTime mJTime2 = this.f257098h;
        com.tencent.maas.model.time.MJTime sub2 = sub.sub(mJTime2);
        com.tencent.maas.model.time.MJTime i18 = cVar2.i();
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment2 = cVar2.f257119p;
        clipSegment2.getClass();
        com.tencent.maas.moviecomposing.Timeline D2 = clipSegment2.D();
        if (D2 != null) {
            mJTime = com.tencent.maas.moviecomposing.segments.ElementSegment.b0(clipSegment2, D2);
        }
        kotlin.jvm.internal.o.f(mJTime, "getTransOutDuration(...)");
        com.tencent.maas.model.time.MJTime sub3 = i18.sub(mJTime).sub(mJTime2);
        if (!sub2.smallThan(sub3)) {
            sub2 = sub3;
        }
        if (!sub2.bigThan(this.f257099i)) {
            com.tencent.maas.model.time.MJTime mJTime3 = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.d(mJTime3);
            return mJTime3;
        }
        com.tencent.maas.model.time.MJTime mJTime4 = this.f257100j;
        if (sub2.bigThan(mJTime4)) {
            sub2 = mJTime4;
        }
        kotlin.jvm.internal.o.d(sub2);
        return sub2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.maas.model.time.MJTimeRange u(ex0.j0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "transitionSegmentVM"
            kotlin.jvm.internal.o.g(r6, r0)
            ex0.r r0 = r5.k(r6)
            com.tencent.maas.model.time.MJTime r1 = r5.f257104n
            if (r0 == 0) goto L3e
            com.tencent.maas.model.time.MJTimeRange r2 = r0.l()
            com.tencent.maas.model.time.MJTime r2 = r2.getEndTime()
            com.tencent.maas.model.time.MJTime r2 = r2.sub(r1)
            com.tencent.maas.model.time.MJTimeRange r3 = r0.l()
            com.tencent.maas.model.time.MJTime r3 = r3.getStartTime()
            boolean r2 = r2.bigThan(r3)
            if (r2 == 0) goto L34
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r0 = r0.getEndTime()
            com.tencent.maas.model.time.MJTime r0 = r0.sub(r1)
            goto L3c
        L34:
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r0 = r0.getStartTime()
        L3c:
            if (r0 != 0) goto L46
        L3e:
            com.tencent.maas.model.time.MJTimeRange r0 = r6.l()
            com.tencent.maas.model.time.MJTime r0 = r0.getStartTime()
        L46:
            ex0.r r2 = r5.j(r6)
            if (r2 == 0) goto L7d
            com.tencent.maas.model.time.MJTimeRange r3 = r2.l()
            com.tencent.maas.model.time.MJTime r3 = r3.getStartTime()
            com.tencent.maas.model.time.MJTime r3 = r3.add(r1)
            com.tencent.maas.model.time.MJTimeRange r4 = r2.l()
            com.tencent.maas.model.time.MJTime r4 = r4.getEndTime()
            boolean r3 = r3.smallThan(r4)
            if (r3 == 0) goto L73
            com.tencent.maas.model.time.MJTimeRange r2 = r2.l()
            com.tencent.maas.model.time.MJTime r2 = r2.getStartTime()
            com.tencent.maas.model.time.MJTime r1 = r2.add(r1)
            goto L7b
        L73:
            com.tencent.maas.model.time.MJTimeRange r1 = r2.l()
            com.tencent.maas.model.time.MJTime r1 = r1.getEndTime()
        L7b:
            if (r1 != 0) goto L85
        L7d:
            com.tencent.maas.model.time.MJTimeRange r6 = r6.l()
            com.tencent.maas.model.time.MJTime r1 = r6.getEndTime()
        L85:
            com.tencent.maas.model.time.MJTimeRange r6 = com.tencent.maas.model.time.MJTimeRange.fromStartEnd(r0, r1)
            java.lang.String r0 = "fromStartEnd(...)"
            kotlin.jvm.internal.o.f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.a0.u(ex0.j0):com.tencent.maas.model.time.MJTimeRange");
    }

    public final java.lang.Integer v(ex0.r rVar) {
        if (rVar == null) {
            return null;
        }
        return java.lang.Integer.valueOf(((java.util.ArrayList) this.f257097g.f257178f).indexOf(rVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.util.List r6) {
        /*
            r5 = this;
            java.lang.String r0 = "assetIds"
            kotlin.jvm.internal.o.g(r6, r0)
            androidx.lifecycle.j0 r0 = r5.f257106p
            java.lang.Object r0 = r0.getValue()
            com.tencent.maas.model.time.MJTime r0 = (com.tencent.maas.model.time.MJTime) r0
            if (r0 == 0) goto L19
            boolean r1 = r0.isValid()
            if (r1 == 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L1b
        L19:
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.PositiveInfinityTime
        L1b:
            com.tencent.maas.moviecomposing.Timeline r1 = r5.f257092b
            r2 = 0
            com.tencent.maas.base.MJID[] r0 = r1.s(r6, r0, r2)
            java.util.ArrayList r1 = r5.G
            r1.addAll(r6)
            cx0.d r6 = cx0.d.f224510f
            java.util.EnumSet r6 = java.util.EnumSet.of(r6)
            java.lang.String r1 = "of(...)"
            kotlin.jvm.internal.o.f(r6, r1)
            cx0.e r1 = cx0.e.f224512d
            r5.J(r6, r1)
            int r6 = r0.length
        L38:
            if (r2 >= r6) goto L5e
            r1 = r0[r2]
            ex0.r r1 = r5.K(r1)
            if (r1 != 0) goto L43
            goto L49
        L43:
            ug.m r3 = ug.m.Transition
            ug.m r4 = r1.f257169c
            if (r4 != r3) goto L4c
        L49:
            int r2 = r2 + 1
            goto L38
        L4c:
            ex0.r r6 = r5.n()
            if (r6 != 0) goto L53
            goto L57
        L53:
            ax0.b r0 = ax0.b.f14964d
            r6.f257171e = r0
        L57:
            ax0.b r6 = ax0.b.f14965e
            r1.f257171e = r6
            r5.M(r1)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.a0.w(java.util.List):void");
    }

    public final void x(ex0.j0 j0Var, java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, "Blank")) {
            j0Var.getClass();
            com.tencent.maas.moviecomposing.segments.TransitionDesc a17 = com.tencent.maas.moviecomposing.segments.TransitionDesc.a();
            com.tencent.maas.moviecomposing.segments.TransitionSegment transitionSegment = j0Var.f257143f;
            transitionSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D = transitionSegment.D();
            if (D != null) {
                com.tencent.maas.moviecomposing.segments.TransitionSegment.H(transitionSegment, a17, D);
            }
            com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
            transitionSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D2 = transitionSegment.D();
            if (D2 != null) {
                com.tencent.maas.moviecomposing.segments.TransitionSegment.F(transitionSegment, ZeroTime, D2);
                return;
            }
            return;
        }
        com.tencent.maas.model.time.MJTime t17 = t(j0Var);
        if (d(j0Var, str)) {
            boolean s17 = j0Var.s();
            com.tencent.maas.moviecomposing.segments.TransitionDesc b17 = com.tencent.maas.moviecomposing.segments.TransitionDesc.b(str);
            com.tencent.maas.moviecomposing.segments.TransitionSegment transitionSegment2 = j0Var.f257143f;
            transitionSegment2.getClass();
            com.tencent.maas.moviecomposing.Timeline D3 = transitionSegment2.D();
            if (D3 != null) {
                com.tencent.maas.moviecomposing.segments.TransitionSegment.H(transitionSegment2, b17, D3);
            }
            if (s17 || (j0Var.i().bigThan(t17) && t17.isValid())) {
                transitionSegment2.getClass();
                com.tencent.maas.moviecomposing.Timeline D4 = transitionSegment2.D();
                if (D4 != null) {
                    com.tencent.maas.moviecomposing.segments.TransitionSegment.F(transitionSegment2, t17, D4);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[LOOP:0: B:9:0x001a->B:27:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y() {
        /*
            r6 = this;
            ex0.v r0 = r6.f257097g
            java.util.List r0 = r0.f257177e
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
            goto L52
        L14:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            ex0.r r1 = (ex0.r) r1
            com.tencent.maas.moviecomposing.segments.Segment r4 = r1.f257167a
            boolean r4 = ou0.b0.b(r4)
            if (r4 == 0) goto L37
            com.tencent.maas.moviecomposing.segments.Segment r1 = r1.f257167a
            boolean r4 = r1 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment
            if (r4 == 0) goto L37
            com.tencent.maas.moviecomposing.segments.ClipSegment r1 = (com.tencent.maas.moviecomposing.segments.ClipSegment) r1
            goto L38
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L4e
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            com.tencent.maas.moviecomposing.Timeline r5 = r1.D()
            if (r5 == 0) goto L46
            java.lang.Boolean r4 = com.tencent.maas.moviecomposing.segments.ClipSegment.d1(r1, r5)
        L46:
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L4e
            r1 = r2
            goto L4f
        L4e:
            r1 = r3
        L4f:
            if (r1 == 0) goto L1a
            r3 = r2
        L52:
            r0 = r3 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.a0.y():boolean");
    }

    public final boolean z() {
        ex0.r n17 = n();
        if (n17 != null) {
            return this.f257097g.e(n17);
        }
        return false;
    }
}
