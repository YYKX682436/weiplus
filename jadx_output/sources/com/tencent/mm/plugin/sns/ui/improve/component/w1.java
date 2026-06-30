package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class w1 extends com.tencent.mm.plugin.sns.ui.improve.component.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f169050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f169050d = arrayList;
        arrayList.add(new yc4.u(this));
        arrayList.add(new yc4.z(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ReportUIC", "[" + hashCode() + "]onCreate");
        java.util.Iterator it = this.f169050d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).b(bundle);
        }
        int intExtra = getIntent().getIntExtra("sns_unread_count", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("enter_by_red", false);
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "UnReadMsgCount", java.lang.Integer.valueOf(intExtra));
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "HasNewSnsMsgWhenEntrance", java.lang.Boolean.valueOf(booleanExtra));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        iy1.c cVar = iy1.c.SnsTimeLineUI;
        cy1.a aVar = (cy1.a) ((cy1.a) rVar).ak(activity, cVar);
        aVar.Rj(getActivity(), iy1.a.Moments);
        aVar.dk(getActivity(), com.tencent.mm.plugin.sns.ui.improve.component.w1.class.getSimpleName());
        aVar.Tj(getActivity(), 48, 16, false);
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (s0Var.f164957j == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else {
            if (s0Var.f164941b.isEmpty()) {
                s0Var.f164939a.h(2, com.tencent.mm.sdk.platformtools.t8.i1());
                s0Var.f164943c.clear();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "enterTimeLine exposureFeedSize %d", java.lang.Integer.valueOf(s0Var.f164941b.size()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushEnterSnsTimeLineEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            v30.e eVar = (v30.e) i95.n0.c(v30.e.class);
            e62.e eVar2 = s0Var.f164956i0;
            ((u30.e) eVar).getClass();
            e62.n nVar = e62.n.f249782a;
            if (eVar2 != null) {
                java.util.ArrayList arrayList = e62.n.f249783b;
                if (!arrayList.contains(eVar2)) {
                    arrayList.add(eVar2);
                }
            }
            s0Var.E(1);
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.sns.statistics.o0(s0Var), "sns_feed_expose_tag");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushEnterSnsTimeLineEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        rc4.e eVar3 = rc4.e.f394136a;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        boolean resumePage = resumePage();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerPageReport", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        kotlin.jvm.internal.o.g(activity2, "activity");
        rc4.e.f394140e.clear();
        rc4.e.f394142g = false;
        rc4.e.f394143h = false;
        rc4.e.f394144i = "";
        if (resumePage) {
            long j17 = rc4.e.f394139d;
            rc4.e.f394141f = j17 == -1 ? new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 10, null, null, 0, 238, null) : new rc4.a(j17, 0, 0, null, 2, null, null, 0, 238, null);
        }
        java.lang.String stringExtra = activity2.getIntent().getStringExtra("new_feed_id");
        java.lang.String str = stringExtra != null ? stringExtra : "";
        cy1.a aVar2 = (cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(activity2, 32, 28630)).ak(activity2, cVar);
        aVar2.gk(activity2, kz5.c1.k(new jz5.l("enter_publishid", str), new jz5.l("is_cached_page", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.model.l4.qj().b() ? 1 : 0)), new jz5.l("timeline_session_id", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni())));
        aVar2.Ai(activity2, rc4.c.f394134a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerPageReport", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.lang.String str;
        v52.c g17;
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ReportUIC", "[" + hashCode() + "]onDestroy");
        java.util.Iterator it = this.f169050d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).c();
        }
        androidx.recyclerview.widget.f2 adapter = getRecycleView().getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : -1;
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWsFoldExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) s0Var.Y;
        for (com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct snsTimelineWeiShangeFoldExposeStruct : concurrentHashMap.values()) {
            if (snsTimelineWeiShangeFoldExposeStruct != null) {
                snsTimelineWeiShangeFoldExposeStruct.f60745j = itemCount;
                snsTimelineWeiShangeFoldExposeStruct.k();
            }
        }
        concurrentHashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWsFoldExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.j();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.mvvmlist.MvvmList S6 = ((com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class)).S6();
        rc4.e eVar = rc4.e.f394136a;
        zc4.b bVar = (zc4.b) kz5.n0.Z(S6.f152065o);
        long y07 = (bVar == null || (n17 = bVar.n()) == null) ? -1L : n17.y0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        rc4.e.f394145j.clear();
        rc4.e.f394146k = false;
        rc4.e.f394137b.B("FinderTierManager.UI_KEY", y07);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "release snsId:" + ca4.z0.t0(y07));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        xa4.c cVar = xa4.c.f452822a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTimelineReport", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringFeed25330Reporter", "doTimelineReport");
        java.util.HashMap hashMap = xa4.c.f452823b;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct snsRabbiot2023ExposeStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct) entry.getValue();
            if (((n30.r) i95.n0.c(n30.r.class)) == null || (g17 = v52.c.g()) == null || (str = g17.d()) == null) {
                str = "";
            }
            snsRabbiot2023ExposeStruct.f60700f = snsRabbiot2023ExposeStruct.b("sessionID", str, true);
            ((com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct) entry.getValue()).k();
        }
        hashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTimelineReport", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        yc4.b0 b0Var = yc4.b0.f460839a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markExitTimeline", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        ((ku5.t0) ku5.t0.f312615d).q(j0.k5.f296418d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markExitTimeline", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ReportUIC", "[" + hashCode() + "]onPause");
        super.onPause();
        java.util.Iterator it = this.f169050d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ReportUIC", "[" + hashCode() + "]onResume");
        super.onResume();
        java.util.Iterator it = this.f169050d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).e();
        }
        yc4.b0.f460839a.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnterScene", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMenuActionReporter", "setEnterScene >> 1");
        ta4.y0.f416864b = 1;
        ta4.y0.f416866d = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnterScene", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r9, com.tencent.mm.plugin.sns.ui.improve.component.x1 r10, int r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            java.lang.String r0 = "onScrollStateChanged"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r12 instanceof com.tencent.mm.plugin.sns.ui.improve.component.v1
            if (r2 == 0) goto L1b
            r2 = r12
            com.tencent.mm.plugin.sns.ui.improve.component.v1 r2 = (com.tencent.mm.plugin.sns.ui.improve.component.v1) r2
            int r3 = r2.f169038m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f169038m = r3
            goto L20
        L1b:
            com.tencent.mm.plugin.sns.ui.improve.component.v1 r2 = new com.tencent.mm.plugin.sns.ui.improve.component.v1
            r2.<init>(r8, r12)
        L20:
            java.lang.Object r12 = r2.f169036h
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f169038m
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L5e
            if (r4 == r6) goto L4b
            if (r4 != r5) goto L40
            int r9 = r2.f169035g
            java.lang.Object r10 = r2.f169034f
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r2.f169033e
            com.tencent.mm.plugin.sns.ui.improve.component.x1 r11 = (com.tencent.mm.plugin.sns.ui.improve.component.x1) r11
            java.lang.Object r4 = r2.f169032d
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            kotlin.ResultKt.throwOnFailure(r12)
            goto L80
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L4b:
            int r11 = r2.f169035g
            java.lang.Object r9 = r2.f169034f
            r10 = r9
            com.tencent.mm.plugin.sns.ui.improve.component.x1 r10 = (com.tencent.mm.plugin.sns.ui.improve.component.x1) r10
            java.lang.Object r9 = r2.f169033e
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            java.lang.Object r4 = r2.f169032d
            com.tencent.mm.plugin.sns.ui.improve.component.w1 r4 = (com.tencent.mm.plugin.sns.ui.improve.component.w1) r4
            kotlin.ResultKt.throwOnFailure(r12)
            goto L76
        L5e:
            kotlin.ResultKt.throwOnFailure(r12)
            r2.f169032d = r8
            r2.f169033e = r9
            r2.f169034f = r10
            r2.f169035g = r11
            r2.f169038m = r6
            java.lang.Object r12 = super.onScrollStateChanged(r9, r10, r11, r2)
            if (r12 != r3) goto L75
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L75:
            r4 = r8
        L76:
            java.util.ArrayList r12 = r4.f169050d
            java.util.Iterator r12 = r12.iterator()
            r4 = r9
            r9 = r11
            r11 = r10
            r10 = r12
        L80:
            boolean r12 = r10.hasNext()
            jz5.f0 r6 = jz5.f0.f302826a
            if (r12 == 0) goto Lb2
            java.lang.Object r12 = r10.next()
            yc4.f r12 = (yc4.f) r12
            r2.f169032d = r4
            r2.f169033e = r11
            r2.f169034f = r10
            r2.f169035g = r9
            r2.f169038m = r5
            r12.getClass()
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
            java.lang.String r7 = "onScrollStateChanged$suspendImpl"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r12)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r12)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
            if (r6 != r3) goto L80
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        Lb2:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.w1.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j
    public void onScrollStateChangedInMain(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 struct, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(struct, "struct");
        super.onScrollStateChangedInMain(recyclerView, struct, i17);
        java.util.Iterator it = this.f169050d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).f(recyclerView, struct, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }
}
