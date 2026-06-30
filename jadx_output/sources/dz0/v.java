package dz0;

/* loaded from: classes5.dex */
public final class v implements dz0.d {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.z f245032d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f245033e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245035g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f245029a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f245030b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f245031c = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f245034f = dz0.q.f244979d;

    public v(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC) {
        this.f245035g = maasSdkUIC;
    }

    public static final void a(dz0.v vVar, yz5.l lVar, com.tencent.maas.instamovie.base.MJError mJError) {
        vVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEndSegmentClipComplete ");
        sb6.append(mJError != null ? mJError.message : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", sb6.toString());
        if (lVar != null) {
            lVar.invoke(mJError);
        }
        com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = vVar.f245035g;
        kotlinx.coroutines.l.d(maasSdkUIC.getMainScope(), null, null, new dz0.s(maasSdkUIC, null), 3, null);
        bz0.h hVar = bz0.j.f36761l;
        if (hVar != null) {
            if (hVar.f36746c == null) {
                hVar.f36746c = 0;
            }
            ((java.util.ArrayList) bz0.j.f36762m).add(hVar);
        }
        bz0.j.f36761l = null;
    }

    public final boolean b(bg0.y yVar) {
        if (yVar == null) {
            return false;
        }
        long j17 = yVar.f19868d;
        return j17 > 0 && j17 > yVar.f19867c;
    }

    public final com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem c(java.lang.String str, java.util.List list) {
        java.lang.Object obj = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) next).f138430e, str)) {
                obj = next;
                break;
            }
        }
        return (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
    }

    public final int d(bg0.y yVar) {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        com.tencent.maas.model.time.MJTime duration;
        if (!this.f245033e) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MJSegmentClipBehaviorHolder", "updateClipSegmentPlayRange: not doingSegmentClip");
            return -1;
        }
        java.util.Iterator it = this.f245031c.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(((com.tencent.maas.instamovie.a) it.next()).f48165a, yVar.f19865a)) {
                break;
            }
            i17++;
        }
        com.tencent.maas.instamovie.a aVar = i17 >= 0 ? (com.tencent.maas.instamovie.a) kz5.n0.a0(this.f245031c, i17) : null;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "onSegmentClipTimeRangeUpdateComplete: failed, " + yVar.f19866b);
            return -1;
        }
        com.tencent.maas.model.time.MJTimeRange b17 = aVar.b();
        if (!((b17 == null || b17.isValid()) ? false : true)) {
            com.tencent.maas.model.time.MJTimeRange a17 = aVar.a();
            if (a17 != null && !a17.isValid()) {
                z17 = true;
            }
            if (!z17) {
                com.tencent.maas.model.time.MJTime fromMilliseconds = com.tencent.maas.model.time.MJTime.fromMilliseconds((long) yVar.f19870f);
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.tencent.maas.model.time.MJTimeRange b18 = aVar.b();
                    m521constructorimpl = kotlin.Result.m521constructorimpl(b18 != null ? b18.getStartTime() : null);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                if (m524exceptionOrNullimpl != null) {
                    com.tencent.mars.xlog.Log.e("MaasFuncUtils", "safeGetValue: err=" + m524exceptionOrNullimpl.getMessage());
                    m521constructorimpl = null;
                }
                com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) m521constructorimpl;
                if (mJTime == null) {
                    mJTime = com.tencent.maas.model.time.MJTime.fromSeconds(0.0d);
                }
                com.tencent.maas.model.time.MJTime add = mJTime.add(fromMilliseconds);
                try {
                    com.tencent.maas.model.time.MJTimeRange a18 = aVar.a();
                    m521constructorimpl2 = kotlin.Result.m521constructorimpl((a18 == null || (duration = a18.getDuration()) == null) ? null : java.lang.Double.valueOf(duration.toSeconds()));
                } catch (java.lang.Throwable th7) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                }
                java.lang.Throwable m524exceptionOrNullimpl2 = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2);
                if (m524exceptionOrNullimpl2 != null) {
                    com.tencent.mars.xlog.Log.e("MaasFuncUtils", "safeGetValue: err=" + m524exceptionOrNullimpl2.getMessage());
                    m521constructorimpl2 = null;
                }
                java.lang.Double d17 = (java.lang.Double) m521constructorimpl2;
                double doubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                com.tencent.maas.model.time.MJTimeRange fromSecondsStartTimeDuration = com.tencent.maas.model.time.MJTimeRange.fromSecondsStartTimeDuration(add.toSeconds(), doubleValue);
                com.tencent.mars.xlog.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "updateClipSegmentPlayRange:" + aVar.f48165a + ", startSecond:" + add.toSeconds() + ", durationSecond:" + doubleValue);
                com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f245035g;
                kotlinx.coroutines.l.d(maasSdkUIC.getMainScope(), null, null, new dz0.u(maasSdkUIC, add, fromSecondsStartTimeDuration, null), 3, null);
                return i17;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MJSegmentClipBehaviorHolder", "updateClipSegmentPlayRange: failed, time invalid");
        return -1;
    }

    public void e() {
        java.util.List<com.tencent.maas.instamovie.a> list;
        com.tencent.maas.model.time.MJTime endTime;
        com.tencent.maas.model.time.MJTime startTime;
        com.tencent.maas.model.time.MJTime duration;
        az0.n7 n7Var = this.f245035g.f69783d;
        if (n7Var != null) {
            list = n7Var.f15742a.getStorylineClipSegments();
            kotlin.jvm.internal.o.f(list, "getStorylineClipSegments(...)");
        } else {
            list = kz5.p0.f313996d;
        }
        if (list.isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "updateMJClipSegment: data size:" + ((java.util.ArrayList) this.f245030b).size() + ", mj size" + list.size());
        java.util.Iterator it = ((java.util.ArrayList) this.f245030b).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                bz0.h hVar = bz0.j.f36761l;
                if ((hVar != null ? hVar.f36746c : null) != null || hVar == null) {
                    return;
                }
                hVar.f36746c = 1;
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bg0.y yVar = (bg0.y) next;
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it6.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.maas.instamovie.a) next2).f48165a, yVar.f19865a)) {
                    r4 = next2;
                    break;
                }
            }
            com.tencent.maas.instamovie.a aVar = (com.tencent.maas.instamovie.a) r4;
            if (aVar != null) {
                com.tencent.maas.model.time.MJTimeRange a17 = aVar.a();
                double d17 = yVar.f19870f / 1000.0d;
                com.tencent.maas.model.time.MJTimeRange a18 = aVar.a();
                com.tencent.maas.model.time.MJTimeRange fromSecondsStartTimeDuration = com.tencent.maas.model.time.MJTimeRange.fromSecondsStartTimeDuration(d17, (a18 == null || (duration = a18.getDuration()) == null) ? 0.0d : duration.toSeconds());
                com.tencent.maas.instamovie.MJMovieSession mJMovieSession = (com.tencent.maas.instamovie.MJMovieSession) aVar.f48166b.get();
                if (mJMovieSession != null) {
                    mJMovieSession.setSegmentTimeRangeInClip(aVar.f48165a, fromSecondsStartTimeDuration);
                }
                if (a17 != null && (startTime = a17.getStartTime()) != null) {
                    startTime.toSeconds();
                }
                if (a17 != null && (endTime = a17.getEndTime()) != null) {
                    endTime.toSeconds();
                }
                fromSecondsStartTimeDuration.getStartTime().toSeconds();
                fromSecondsStartTimeDuration.getEndTime().toSeconds();
            }
            i17 = i18;
        }
    }
}
