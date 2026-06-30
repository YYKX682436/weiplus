package ow0;

/* loaded from: classes5.dex */
public abstract class q0 {
    public static final void a(gx0.u2 u2Var, com.tencent.maas.base.MJID mjid) {
        ex0.r n17;
        com.tencent.maas.base.MJID mjid2;
        ex0.r n18;
        ex0.r n19;
        kotlin.jvm.internal.o.g(u2Var, "<this>");
        ex0.a0 a0Var = u2Var.S7().f276642r;
        if (a0Var == null || (n17 = a0Var.n()) == null || (mjid2 = n17.f257168b) == null) {
            return;
        }
        java.util.Objects.toString(mjid);
        mjid2.toString();
        ex0.r n27 = a0Var.n();
        java.util.Objects.toString(n27 != null ? n27.f257169c : null);
        ug.m mVar = ug.m.Caption;
        if (mjid == null) {
            ex0.r n28 = a0Var.n();
            if ((n28 != null ? n28.f257169c : null) != mVar || (n19 = a0Var.n()) == null) {
                return;
            }
            n19.f257171e = ax0.b.f14964d;
            return;
        }
        u2Var.W7(mjid);
        if (!kotlin.jvm.internal.o.b(mjid, mjid2)) {
            ex0.i0.j(a0Var, mjid);
            return;
        }
        ex0.r n29 = a0Var.n();
        if ((n29 != null ? n29.f257169c : null) != mVar || (n18 = a0Var.n()) == null) {
            return;
        }
        n18.f257171e = ax0.b.f14965e;
    }

    public static final com.tencent.maas.model.time.MJTime b(gx0.u2 u2Var) {
        kotlin.jvm.internal.o.g(u2Var, "<this>");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76 = u2Var.n7();
        if (n76 == null) {
            return null;
        }
        return com.tencent.maas.model.time.MJTime.fromSeconds(n76.getCurrentScrolledX() / (u2Var.S7().f276642r != null ? r5.s(n76.getTimelineLayoutType()) : 1.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(gx0.u2 r3, com.tencent.maas.model.time.MJTime r4, boolean r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "targetTime"
            kotlin.jvm.internal.o.g(r4, r0)
            gx0.kh r0 = r3.S7()
            ex0.a0 r0 = r0.f276642r
            if (r0 != 0) goto L13
            return
        L13:
            androidx.lifecycle.j0 r0 = r0.f257114x
            java.lang.Object r0 = r0.getValue()
            ax0.e r0 = (ax0.e) r0
            if (r0 != 0) goto L1e
            return
        L1e:
            ax0.e r1 = ax0.e.f14979h
            if (r0 == r1) goto L2b
            ax0.e r1 = ax0.e.f14980i
            if (r0 == r1) goto L2b
            ax0.e r1 = ax0.e.f14975d
            if (r0 == r1) goto L2b
            return
        L2b:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView r0 = r3.n7()
            r1 = 0
            if (r0 == 0) goto L46
            gy0.q r0 = r0.mainItemDecoration
            r2 = 1
            if (r0 == 0) goto L42
            com.tencent.maas.base.MJID r0 = r0.N
            if (r0 == 0) goto L3d
            r0 = r2
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 != r2) goto L42
            r0 = r2
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 != r2) goto L46
            r1 = r2
        L46:
            if (r1 == 0) goto L4b
            if (r5 != 0) goto L4b
            return
        L4b:
            gx0.kh r5 = r3.S7()
            ex0.b r4 = r5.e7(r4)
            if (r4 == 0) goto L58
            com.tencent.maas.base.MJID r4 = r4.f257168b
            goto L59
        L58:
            r4 = 0
        L59:
            a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ow0.q0.c(gx0.u2, com.tencent.maas.model.time.MJTime, boolean):void");
    }

    public static void d(gx0.u2 u2Var, com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView timelineView, ex0.a0 timelineVM, com.tencent.maas.model.time.MJTime mJTime, int i17, java.lang.Object obj) {
        ex0.v vVar;
        java.util.List list;
        if ((i17 & 4) != 0) {
            mJTime = null;
        }
        kotlin.jvm.internal.o.g(u2Var, "<this>");
        kotlin.jvm.internal.o.g(timelineView, "timelineView");
        kotlin.jvm.internal.o.g(timelineVM, "timelineVM");
        int i18 = (int) (u2Var.getContext().getResources().getDisplayMetrics().widthPixels * 0.5f);
        timelineView.b(timelineVM, new bx0.j(e3.d.b(i18, (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 40), i18, 0), (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 28)), u2Var.getMainScope());
        timelineView.setPlaybackStateListener(new ow0.b0(u2Var));
        timelineView.setTimelineScaleListener(new ow0.d0(u2Var));
        timelineView.setScrollTimeChangedListener(new ow0.g0(u2Var, timelineVM, timelineView));
        timelineView.setTimelineItemDecorationTrimListener(new ow0.j0(u2Var, timelineVM, timelineView, i18));
        timelineView.setScrollStateChangeListener(new ow0.m0(u2Var));
        timelineView.setTapSelectSegmentListener(new ow0.n0(timelineView, timelineVM, u2Var));
        kotlinx.coroutines.y0 mainScope = u2Var.getMainScope();
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        ex0.a0 timelineVM2 = timelineView.getTimelineVM();
        if (timelineVM2 != null && (vVar = timelineVM2.f257097g) != null && (list = vVar.f257177e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                timelineView.getThumbnailProviderManager().d(rVar.f257168b);
                if (rVar.f257169c != ug.m.Transition) {
                    kotlinx.coroutines.l.d(mainScope, null, null, new ww0.d(timelineView, rVar, null), 3, null);
                }
            }
        }
        if (mJTime == null) {
            e(u2Var, u2Var.R7().i7());
            return;
        }
        if (u2Var.S7().f276642r == null) {
            return;
        }
        timelineView.g(r6.s(timelineView.getTimelineLayoutType()) * mJTime.toSeconds());
    }

    public static final void e(gx0.u2 u2Var, com.tencent.maas.model.time.MJTime currentTime) {
        kotlin.jvm.internal.o.g(u2Var, "<this>");
        kotlin.jvm.internal.o.g(currentTime, "currentTime");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76 = u2Var.n7();
        if (n76 != null && currentTime.isValid()) {
            u2Var.b8(currentTime);
            if (u2Var.S7().f276642r != null) {
                n76.g(r1.s(n76.getTimelineLayoutType()) * currentTime.toSeconds());
            }
            f(u2Var, n76);
        }
    }

    public static final void f(gx0.u2 u2Var, com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView timelineView) {
        kotlin.jvm.internal.o.g(u2Var, "<this>");
        kotlin.jvm.internal.o.g(timelineView, "timelineView");
        if ((timelineView.recyclerView.getScrollState() != 0) || u2Var.R7().f276255v.getValue() == gx0.fd.f276432h) {
            return;
        }
        ym5.a1.f(new ow0.p0(u2Var, timelineView));
    }

    public static final void g(gx0.u2 u2Var, ex0.r segmentVM) {
        kotlin.jvm.internal.o.g(u2Var, "<this>");
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        com.tencent.maas.model.time.MJTime b17 = b(u2Var);
        if (b17 == null) {
            b17 = u2Var.R7().i7();
        }
        com.tencent.maas.model.time.MJTime startTime = b17.smallThan(segmentVM.k()) ? segmentVM.l().getStartTime() : b17.bigThan(segmentVM.l().getEndTime()) ? segmentVM.l().getEndTime().sub(new com.tencent.maas.model.time.MJTime(1L)) : com.tencent.maas.model.time.MJTime.InvalidTime;
        if (startTime.isValid()) {
            gx0.bf.q7(u2Var.R7(), startTime, true, 0L, 4, null);
            e(u2Var, startTime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(gx0.u2 r8) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ow0.q0.h(gx0.u2):void");
    }
}
