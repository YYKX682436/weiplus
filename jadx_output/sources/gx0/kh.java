package gx0;

/* loaded from: classes5.dex */
public final class kh extends ou0.p {

    /* renamed from: r, reason: collision with root package name */
    public ex0.a0 f276642r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.j0 f276643s;

    /* renamed from: t, reason: collision with root package name */
    public final float f276644t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f276645u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f276646v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f276647w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276643s = new androidx.lifecycle.j0();
        this.f276644t = activity.getResources().getDisplayMetrics().density;
        this.f276645u = jz5.h.b(new gx0.jh(this));
        this.f276646v = jz5.h.b(new gx0.eh(this));
    }

    public static final void Y6(gx0.kh khVar) {
        int i17 = khVar.getContext().getResources().getDisplayMetrics().widthPixels;
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).getClass();
        float qj6 = (float) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingClipPanelOneScreenTimeS());
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).getClass();
        float qj7 = (float) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingNarrationPanelOneScreenTimeS());
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).getClass();
        float f17 = i17;
        float f18 = f17 / qj6;
        float f19 = f17 / qj7;
        float qj8 = f17 / ((float) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingCaptionPanelOneScreenTimeS()));
        ex0.a0 a0Var = khVar.f276642r;
        if (a0Var != null) {
            a0Var.f257109s.setValue(java.lang.Float.valueOf(f18));
            a0Var.f257110t.setValue(java.lang.Float.valueOf(f19));
            a0Var.f257111u.setValue(java.lang.Float.valueOf(qj8));
            a0Var.f257112v.setValue(java.lang.Float.valueOf(qj8));
        }
    }

    public final void Z6(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment) {
        kotlin.jvm.internal.o.g(elementSegment, "elementSegment");
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return;
        }
        android.graphics.PointF m07 = elementSegment.m0();
        kotlin.jvm.internal.o.f(m07, "getLayerPosition(...)");
        float n07 = elementSegment.n0();
        android.graphics.PointF o07 = elementSegment.o0();
        kotlin.jvm.internal.o.f(o07, "getLayerScale(...)");
        ug.m C = elementSegment.C();
        kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
        java.util.List list = a0Var.f257097g.f257178f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((ex0.r) next).f257169c == C) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.maas.moviecomposing.segments.Segment segment = ((ex0.r) it6.next()).f257167a;
            com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment2 = segment instanceof com.tencent.maas.moviecomposing.segments.ElementSegment ? (com.tencent.maas.moviecomposing.segments.ElementSegment) segment : null;
            if (elementSegment2 != null) {
                com.tencent.maas.moviecomposing.Timeline D = elementSegment2.D();
                if (D != null) {
                    com.tencent.maas.moviecomposing.segments.ElementSegment.Z(elementSegment2, m07, D);
                }
                com.tencent.maas.moviecomposing.Timeline D2 = elementSegment2.D();
                if (D2 != null) {
                    com.tencent.maas.moviecomposing.segments.ElementSegment.J(elementSegment2, n07, D2);
                }
                elementSegment2.t0(o07);
            }
        }
    }

    public final java.lang.Object a7(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new gx0.ch(this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final com.tencent.maas.moviecomposing.segments.Segment b7(com.tencent.maas.base.MJID segmentId) {
        kotlin.jvm.internal.o.g(segmentId, "segmentId");
        com.tencent.maas.moviecomposing.Timeline o76 = o7();
        if (o76 != null) {
            return o76.m(segmentId);
        }
        return null;
    }

    public final java.util.List c7() {
        com.tencent.maas.moviecomposing.Storyline storyline;
        com.tencent.maas.moviecomposing.segments.Segment[] l17;
        com.tencent.maas.moviecomposing.Timeline o76 = o7();
        if (o76 == null || (storyline = o76.f48414a) == null || (l17 = storyline.l()) == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.maas.moviecomposing.segments.Segment segment : l17) {
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            if (clipSegment != null) {
                arrayList.add(clipSegment);
            }
        }
        return arrayList;
    }

    public final java.util.List d7() {
        com.tencent.maas.moviecomposing.Storyline storyline;
        com.tencent.maas.moviecomposing.segments.Segment[] l17;
        com.tencent.maas.moviecomposing.Timeline o76 = o7();
        if (o76 == null || (storyline = o76.f48414a) == null || (l17 = storyline.l()) == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.maas.moviecomposing.segments.Segment segment : l17) {
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            com.tencent.maas.moviecomposing.segments.ContentDescSegment h07 = clipSegment != null ? clipSegment.h0() : null;
            if (h07 != null) {
                arrayList.add(h07);
            }
        }
        return arrayList;
    }

    public final ex0.b e7(com.tencent.maas.model.time.MJTime time) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(time, "time");
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return null;
        }
        ex0.v vVar = a0Var.f257097g;
        vVar.getClass();
        java.util.Iterator it = ((java.util.ArrayList) vVar.f257180h).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ex0.b) obj).f257167a.B().containsTime(time)) {
                break;
            }
        }
        ex0.r rVar = (ex0.r) obj;
        if (rVar instanceof ex0.b) {
            return (ex0.b) rVar;
        }
        return null;
    }

    public final ex0.c f7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f257097g.g(segmentID);
        ex0.c cVar = g17 instanceof ex0.c ? (ex0.c) g17 : null;
        if (cVar != null) {
            return cVar;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    public final ex0.c g7(com.tencent.maas.model.time.MJTime time) {
        kotlin.jvm.internal.o.g(time, "time");
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return null;
        }
        return ex0.i0.d(a0Var, time);
    }

    public final int h7() {
        ex0.a0 a0Var = this.f276642r;
        if (a0Var != null) {
            return a0Var.f257091a.c();
        }
        return 0;
    }

    public final ex0.k i7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f257097g.g(segmentID);
        ex0.k kVar = g17 instanceof ex0.k ? (ex0.k) g17 : null;
        if (kVar != null) {
            return kVar;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    public final int k7() {
        ex0.a0 a0Var = this.f276642r;
        if (a0Var != null) {
            return a0Var.f257091a.d();
        }
        return 0;
    }

    public final com.tencent.maas.moviecomposing.segments.MovieTitleSegment l7() {
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null || !q7()) {
            return null;
        }
        final com.tencent.maas.moviecomposing.Storyline storyline = a0Var.f257092b.f48414a;
        storyline.getClass();
        return (com.tencent.maas.moviecomposing.segments.MovieTitleSegment) storyline.k(null, new r.a() { // from class: com.tencent.maas.moviecomposing.Storyline$$d
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.Storyline.i(com.tencent.maas.moviecomposing.Storyline.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public final ex0.o m7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f257097g.g(segmentID);
        ex0.o oVar = g17 instanceof ex0.o ? (ex0.o) g17 : null;
        if (oVar != null) {
            return oVar;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    public final ex0.q n7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return null;
        }
        return ex0.i0.f(a0Var, segmentID);
    }

    public final com.tencent.maas.moviecomposing.Timeline o7() {
        ex0.a0 a0Var = this.f276642r;
        if (a0Var != null) {
            return a0Var.f257092b;
        }
        return null;
    }

    public final ex0.k0 p7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f257097g.g(segmentID);
        ex0.k0 k0Var = g17 instanceof ex0.k0 ? (ex0.k0) g17 : null;
        if (k0Var != null) {
            return k0Var;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    public final boolean q7() {
        boolean nativeHasMovieTitleSegment;
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return false;
        }
        com.tencent.maas.moviecomposing.Storyline storyline = a0Var.f257092b.f48414a;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline timeline = (com.tencent.maas.moviecomposing.Timeline) storyline.f48403a.get();
        if (timeline != null) {
            nativeHasMovieTitleSegment = storyline.nativeHasMovieTitleSegment(timeline);
            bool = java.lang.Boolean.valueOf(nativeHasMovieTitleSegment);
        }
        return bool.booleanValue();
    }

    public final void r7(java.lang.String actionDesc, com.tencent.maas.model.time.MJTime mJTime) {
        com.tencent.maas.base.MJID mjid;
        kotlin.jvm.internal.o.g(actionDesc, "actionDesc");
        ex0.a0 a0Var = this.f276642r;
        if (a0Var == null) {
            return;
        }
        if (mJTime == null && (mJTime = (com.tencent.maas.model.time.MJTime) a0Var.f257106p.getValue()) == null) {
            mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        ex0.r n17 = a0Var.n();
        a0Var.f257091a.h(new com.tencent.maas.moviecomposing.TimelineOpDesc(actionDesc, mJTime, (n17 == null || (mjid = n17.f257168b) == null) ? null : mjid.value()));
        a0Var.S();
    }
}
