package ex0;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.Storyline f257173a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f257174b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257175c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.WeakHashMap f257176d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f257177e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f257178f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f257179g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f257180h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f257181i;

    public v(com.tencent.maas.moviecomposing.Storyline storyline) {
        kotlin.jvm.internal.o.g(storyline, "storyline");
        this.f257173a = storyline;
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        this.f257174b = ZeroTime;
        this.f257175c = new androidx.lifecycle.j0();
        this.f257176d = new java.util.WeakHashMap();
        this.f257177e = new java.util.ArrayList();
        this.f257178f = new java.util.ArrayList();
        this.f257179g = new java.util.ArrayList();
        this.f257180h = new java.util.ArrayList();
        this.f257181i = new java.util.ArrayList();
        h();
    }

    public final ex0.r a(com.tencent.maas.moviecomposing.segments.Segment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        switch (segment.C()) {
            case None:
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                return null;
            case Transition:
                return new ex0.j0((com.tencent.maas.moviecomposing.segments.TransitionSegment) segment);
            case MovieClip:
                return new ex0.j((com.tencent.maas.moviecomposing.segments.ClipSegment) segment);
            case VideoClip:
            default:
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                return null;
            case ImageClip:
                return new ex0.i((com.tencent.maas.moviecomposing.segments.ClipSegment) segment);
            case MovieTitle:
                return new ex0.l((com.tencent.maas.moviecomposing.segments.MovieTitleSegment) segment);
            case ContentDesc:
                return new ex0.d((com.tencent.maas.moviecomposing.segments.ContentDescSegment) segment);
            case FancyText:
                return new ex0.k((com.tencent.maas.moviecomposing.segments.FancyTextSegment) segment);
            case WhenWhere:
                return new ex0.k0((com.tencent.maas.moviecomposing.segments.WhenWhereSegment) segment);
            case Emoticon:
                return new ex0.g((com.tencent.maas.moviecomposing.segments.EmoticonSegment) segment);
            case Music:
                return new ex0.o((com.tencent.maas.moviecomposing.segments.MusicSegment) segment);
            case Narration:
                return new ex0.q((com.tencent.maas.moviecomposing.segments.NarrationSegment) segment);
            case Caption:
                return new ex0.b((com.tencent.maas.moviecomposing.segments.CaptionSegment) segment);
        }
    }

    public final boolean b(com.tencent.maas.base.MJID mjid) {
        return this.f257176d.get(mjid) != null;
    }

    public final com.tencent.maas.model.time.MJTime c() {
        com.tencent.maas.model.time.MJTime duration = this.f257173a.n().getDuration();
        kotlin.jvm.internal.o.f(duration, "getPresentationDuration(...)");
        return duration;
    }

    public final boolean d(ex0.r segmentVM) {
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        return ((java.util.ArrayList) this.f257178f).contains(segmentVM) && !e(segmentVM);
    }

    public final boolean e(ex0.r segmentVM) {
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        return this.f257177e.contains(segmentVM);
    }

    public final ex0.r f(com.tencent.maas.model.time.MJTime time) {
        kotlin.jvm.internal.o.g(time, "time");
        double d17 = Double.MAX_VALUE;
        ex0.r rVar = null;
        for (ex0.r rVar2 : this.f257177e) {
            com.tencent.maas.moviecomposing.segments.Segment segment = rVar2.f257167a;
            segment.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.maas.moviecomposing.Timeline D = segment.D();
            if (D != null) {
                bool = java.lang.Boolean.valueOf(segment.nativeIsClipSegment(D, segment.f48532a.value()));
            }
            if (bool.booleanValue()) {
                com.tencent.maas.model.time.MJTimeRange l17 = rVar2.l();
                if (l17.containsTime(time)) {
                    return rVar2;
                }
                double abs = java.lang.Math.abs(l17.getStartTime().sub(time).toSeconds());
                if (abs < d17) {
                    rVar = rVar2;
                    d17 = abs;
                }
                double abs2 = java.lang.Math.abs(l17.getEndTime().sub(time).toSeconds());
                if (abs2 < d17) {
                    rVar = rVar2;
                    d17 = abs2;
                }
            }
        }
        return rVar;
    }

    public final ex0.r g(com.tencent.maas.base.MJID mjid) {
        if (mjid == null) {
            return null;
        }
        return (ex0.r) this.f257176d.get(mjid);
    }

    public final void h() {
        ex0.r a17;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f257178f;
        arrayList.clear();
        ((java.util.ArrayList) this.f257177e).clear();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f257179g;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f257181i;
        arrayList3.clear();
        java.util.ArrayList arrayList4 = (java.util.ArrayList) this.f257180h;
        arrayList4.clear();
        java.util.WeakHashMap weakHashMap = this.f257176d;
        weakHashMap.clear();
        com.tencent.maas.moviecomposing.Storyline storyline = this.f257173a;
        int p17 = storyline.p();
        for (int i17 = 0; i17 < p17; i17++) {
            com.tencent.maas.moviecomposing.segments.Segment o17 = storyline.o(i17);
            if (o17 != null && (a17 = a(o17)) != null) {
                arrayList.add(a17);
                weakHashMap.put(a17.f257168b, a17);
            }
        }
        com.tencent.mars.xlog.Log.i("StorylineViewModel", "AllSegmentVMs: " + arrayList);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            com.tencent.maas.moviecomposing.segments.Segment segment = ((ex0.r) obj).f257167a;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.maas.moviecomposing.Timeline timeline = (com.tencent.maas.moviecomposing.Timeline) storyline.f48403a.get();
            if (timeline != null) {
                bool = com.tencent.maas.moviecomposing.Storyline.a(storyline, segment, timeline);
            }
            if (bool.booleanValue()) {
                arrayList5.add(obj);
            }
        }
        java.util.List F0 = kz5.n0.F0(arrayList5, ex0.s.f257172d);
        com.tencent.mars.xlog.Log.i("StorylineViewModel", "StorySegmentVMs before sort: " + arrayList5);
        com.tencent.mars.xlog.Log.i("StorylineViewModel", "StorySegmentVMs after sort: " + F0);
        ((java.util.ArrayList) this.f257177e).addAll(F0);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((ex0.r) next).f257169c == ug.m.Narration) {
                arrayList6.add(next);
            }
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList6.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            ex0.r rVar = (ex0.r) it6.next();
            ex0.q qVar = rVar instanceof ex0.q ? (ex0.q) rVar : null;
            if (qVar != null) {
                arrayList7.add(qVar);
            }
        }
        arrayList2.addAll(arrayList7);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((ex0.r) obj2).f257169c == ug.m.Transition) {
                arrayList8.add(obj2);
            }
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList8.iterator();
        while (it7.hasNext()) {
            ex0.r rVar2 = (ex0.r) it7.next();
            ex0.j0 j0Var = rVar2 instanceof ex0.j0 ? (ex0.j0) rVar2 : null;
            if (j0Var != null) {
                arrayList9.add(j0Var);
            }
        }
        arrayList3.addAll(arrayList9);
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            if (((ex0.r) obj3).f257169c == ug.m.Caption) {
                arrayList10.add(obj3);
            }
        }
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        java.util.Iterator it8 = arrayList10.iterator();
        while (it8.hasNext()) {
            ex0.r rVar3 = (ex0.r) it8.next();
            ex0.b bVar = rVar3 instanceof ex0.b ? (ex0.b) rVar3 : null;
            if (bVar != null) {
                arrayList11.add(bVar);
            }
        }
        arrayList4.addAll(arrayList11);
    }

    public final void i(boolean z17) {
        if (z17) {
            this.f257174b = c();
            return;
        }
        com.tencent.maas.model.time.MJTime c17 = c();
        if (this.f257174b.equalsTo(c17)) {
            return;
        }
        this.f257175c.postValue(c17);
        this.f257174b = c();
    }

    public java.lang.String toString() {
        return this.f257173a.toString();
    }
}
