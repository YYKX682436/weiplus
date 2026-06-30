package gx0;

/* loaded from: classes5.dex */
public final class u3 implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f277014a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f277015b;

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.r2 f277016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f277017d;

    public u3(gx0.y3 y3Var) {
        this.f277017d = y3Var;
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        this.f277014a = mJTime;
        this.f277015b = mJTime;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        gx0.y3 y3Var = this.f277017d;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView o76 = y3Var.o7();
        o76.state = jv0.h.f302191d;
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(o76, false, 1, null);
        kotlinx.coroutines.l.d(y3Var.getMainScope(), null, null, new gx0.s3(y3Var, null), 3, null);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView o77 = y3Var.o7();
        com.tencent.maas.model.time.MJTime moveToTime = this.f277015b;
        kotlin.jvm.internal.o.f(moveToTime, "moveToTime");
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(o77, moveToTime, false, 2, null);
        this.f277015b = com.tencent.maas.model.time.MJTime.InvalidTime;
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
    }

    @Override // gy0.j
    public void c(boolean z17) {
        gx0.y3 y3Var = this.f277017d;
        y3Var.R6().V6();
        j();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView o76 = y3Var.o7();
        o76.state = jv0.h.f302192e;
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(o76, false, 1, null);
    }

    @Override // gy0.j
    public void d() {
        gx0.y3 y3Var = this.f277017d;
        ex0.f fVar = y3Var.f302188q;
        this.f277015b = fVar != null ? fVar.k() : y3Var.z7().h7();
        gx0.bf z76 = y3Var.z7();
        com.tencent.maas.model.time.MJTime moveToTime = this.f277015b;
        kotlin.jvm.internal.o.f(moveToTime, "moveToTime");
        gx0.bf.q7(z76, moveToTime, false, 0L, 4, null);
    }

    @Override // gy0.j
    public void e() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    @Override // gy0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            r11 = this;
            com.tencent.maas.model.time.MJTime r0 = r11.f277014a
            boolean r0 = r0.isValid()
            r1 = 1
            r2 = 0
            gx0.y3 r3 = r11.f277017d
            if (r0 != 0) goto L13
            com.tencent.maas.model.time.MJTime r0 = r11.f277014a
            kotlin.jvm.internal.o.d(r0)
            goto L89
        L13:
            ex0.f r0 = r3.f302188q
            if (r0 == 0) goto L25
            com.tencent.maas.model.time.MJTime r0 = r0.k()
            com.tencent.maas.model.time.MJTime r4 = r11.f277014a
            boolean r0 = r0.bigThan(r4)
            if (r0 != r1) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L37
            ex0.f r0 = r3.f302188q
            if (r0 == 0) goto L31
            com.tencent.maas.model.time.MJTime r0 = r0.k()
            goto L33
        L31:
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.ZeroTime
        L33:
            kotlin.jvm.internal.o.d(r0)
            goto L89
        L37:
            ex0.f r0 = r3.f302188q
            if (r0 == 0) goto L60
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r0 = r0.getEndTime()
            if (r0 == 0) goto L60
            com.tencent.maas.model.time.MJTime r4 = r11.f277014a
            java.lang.String r5 = "trimPreviewTime"
            kotlin.jvm.internal.o.f(r4, r5)
            boolean r5 = r0.smallThan(r4)
            if (r5 != 0) goto L5b
            boolean r0 = r0.equalsTo(r4)
            if (r0 == 0) goto L59
            goto L5b
        L59:
            r0 = r2
            goto L5c
        L5b:
            r0 = r1
        L5c:
            if (r0 != r1) goto L60
            r0 = r1
            goto L61
        L60:
            r0 = r2
        L61:
            if (r0 == 0) goto L84
            ex0.f r0 = r3.f302188q
            if (r0 == 0) goto L7e
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r0 = r0.getEndTime()
            if (r0 == 0) goto L7e
            com.tencent.maas.model.time.MJTime r4 = new com.tencent.maas.model.time.MJTime
            r5 = 1
            r4.<init>(r5)
            com.tencent.maas.model.time.MJTime r0 = r0.sub(r4)
            if (r0 != 0) goto L80
        L7e:
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.ZeroTime
        L80:
            kotlin.jvm.internal.o.d(r0)
            goto L89
        L84:
            com.tencent.maas.model.time.MJTime r0 = r11.f277014a
            kotlin.jvm.internal.o.d(r0)
        L89:
            kotlinx.coroutines.y0 r4 = r3.getMainScope()
            r5 = 0
            r6 = 0
            gx0.t3 r7 = new gx0.t3
            r10 = 0
            r7.<init>(r3, r0, r10)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView r4 = r3.o7()
            jv0.h r5 = jv0.h.f302191d
            r4.state = r5
            com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(r4, r2, r1, r10)
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView r1 = r3.o7()
            r1.k(r0, r2)
            gx0.x4 r0 = r3.y7()
            r0.w7()
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.InvalidTime
            r11.f277014a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.u3.f():void");
    }

    @Override // gy0.j
    public void g() {
        j();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView o76 = this.f277017d.o7();
        o76.state = jv0.h.f302193f;
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(o76, false, 1, null);
    }

    @Override // gy0.j
    public void h() {
        java.lang.Object obj;
        java.lang.Object obj2;
        gx0.y3 y3Var = this.f277017d;
        ex0.f fVar = y3Var.f302188q;
        if (fVar == null) {
            return;
        }
        com.tencent.maas.model.time.MJTime endTime = gx0.q3.f276865a[fVar.f257134j.ordinal()] == 1 ? fVar.l().getEndTime() : fVar.k();
        kotlin.jvm.internal.o.d(endTime);
        ex0.f fVar2 = y3Var.f302188q;
        if (fVar2 != null && fVar2.f257133i) {
            ax0.a aVar = fVar2.f257134j;
            ax0.a aVar2 = ax0.a.f14961e;
            java.util.List list = y3Var.f302189r;
            if (aVar == aVar2) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((jv0.p) obj2).f302205a.equalsTo(endTime)) {
                            break;
                        }
                    }
                }
                jv0.p pVar = (jv0.p) obj2;
                if (pVar != null) {
                    y3Var.B7(endTime);
                    if (!pVar.f302206b) {
                        endTime = endTime.sub(new com.tencent.maas.model.time.MJTime(1L));
                        kotlin.jvm.internal.o.d(endTime);
                    }
                    y3Var.z7().p7(endTime, true, 8L);
                }
                y3Var.f277195v = null;
                y3Var.z7().p7(endTime, true, 8L);
                y3Var.y7().w7();
            } else {
                if (aVar == ax0.a.f14962f) {
                    java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it6.next();
                            if (((jv0.p) obj).f302205a.equalsTo(endTime)) {
                                break;
                            }
                        }
                    }
                    jv0.p pVar2 = (jv0.p) obj;
                    if (pVar2 != null) {
                        y3Var.B7(endTime);
                        if (!pVar2.f302206b) {
                            endTime = endTime.sub(new com.tencent.maas.model.time.MJTime(1L));
                            kotlin.jvm.internal.o.d(endTime);
                        }
                        y3Var.z7().p7(endTime, true, 8L);
                    }
                }
                y3Var.f277195v = null;
                y3Var.z7().p7(endTime, true, 8L);
                y3Var.y7().w7();
            }
        }
        this.f277014a = endTime;
        jv0.a aVar3 = (jv0.a) y3Var.f69240i;
        if (aVar3 != null) {
            aVar3.J();
        }
    }

    @Override // gy0.j
    public void i() {
    }

    public final void j() {
        ex0.f fVar;
        com.tencent.maas.base.MJID mjid;
        ex0.f n76;
        gx0.y3 y3Var = this.f277017d;
        ex0.a0 A7 = y3Var.A7();
        if (A7 == null || (fVar = y3Var.f302188q) == null || (mjid = fVar.f257168b) == null || (n76 = y3Var.n7(mjid)) == null) {
            return;
        }
        kotlinx.coroutines.r2 r2Var = this.f277016c;
        boolean z17 = false;
        if (r2Var != null && !r2Var.A()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        this.f277016c = kotlinx.coroutines.l.d(y3Var.getMainScope(), null, null, new gx0.r3(A7, n76, y3Var, null), 3, null);
    }
}
