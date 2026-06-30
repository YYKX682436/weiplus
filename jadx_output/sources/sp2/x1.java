package sp2;

/* loaded from: classes2.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f411265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f411266f;

    public x1(sp2.o2 o2Var, long j17, long j18) {
        this.f411264d = o2Var;
        this.f411265e = j17;
        this.f411266f = j18;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[LOOP:0: B:2:0x000a->B:12:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[EDGE_INSN: B:13:0x0042->B:14:0x0042 BREAK  A[LOOP:0: B:2:0x000a->B:12:0x003e], SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            sp2.o2 r0 = r11.f411264d
            java.util.ArrayList r1 = r0.f411145m
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        La:
            boolean r4 = r1.hasNext()
            long r5 = r11.f411265e
            r7 = -1
            r8 = 1
            if (r4 == 0) goto L41
            java.lang.Object r4 = r1.next()
            so2.j5 r4 = (so2.j5) r4
            boolean r9 = r4 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L3a
            zl2.q4 r9 = zl2.q4.f473933a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r4
            boolean r9 = r9.C(r4)
            if (r9 == 0) goto L3a
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            long r9 = r4.getId()
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 != 0) goto L3a
            r4 = r8
            goto L3b
        L3a:
            r4 = r2
        L3b:
            if (r4 == 0) goto L3e
            goto L42
        L3e:
            int r3 = r3 + 1
            goto La
        L41:
            r3 = r7
        L42:
            if (r3 == r7) goto Lcc
            com.tencent.mm.ui.MMActivity r1 = r0.f411121a
            java.lang.String r4 = "activity"
            kotlin.jvm.internal.o.g(r1, r4)
            pf5.z r4 = pf5.z.f353948a
            pf5.v r1 = r4.a(r1)
            java.lang.Class<rq2.w> r4 = rq2.w.class
            androidx.lifecycle.c1 r1 = r1.a(r4)
            rq2.w r1 = (rq2.w) r1
            if (r1 == 0) goto L9b
            cl0.g r4 = new cl0.g
            r4.<init>()
            long r9 = r11.f411266f
            java.lang.String r7 = pm0.v.u(r9)
            java.lang.String r9 = "liveid"
            r4.s(r9, r7)
            java.lang.String r5 = pm0.v.u(r5)
            java.lang.String r6 = "feedid"
            r4.s(r6, r5)
            java.lang.String r5 = "card_index"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r4.s(r5, r6)
            r45.qt2 r5 = r0.f411127d
            java.lang.String r5 = r5.getString(r8)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "toString(...)"
            kotlin.jvm.internal.o.f(r4, r6)
            java.lang.String r6 = ","
            java.lang.String r7 = ";"
            java.lang.String r4 = r26.i0.t(r4, r6, r7, r2)
            java.lang.String r6 = ""
            java.lang.String r7 = "main_page_end_live_card_recall"
            r1.P6(r6, r5, r7, r4)
        L9b:
            java.util.ArrayList r1 = r0.f411145m
            r1.remove(r3)
            up2.h r1 = r0.f411151p
            boolean r4 = r1 instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            if (r4 == 0) goto La7
            goto La8
        La7:
            r1 = 0
        La8:
            if (r1 == 0) goto Lae
            int r2 = r1.a0()
        Lae:
            up2.h r1 = r0.f411151p
            if (r1 == 0) goto Lb6
            int r2 = r2 + r3
            r1.notifyItemRemoved(r2)
        Lb6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[NearbyEndLive]onLiveEnded removed feed at index="
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.LiveEntranceFragmentViewCallback"
            com.tencent.mars.xlog.Log.i(r2, r1)
            sp2.o2.b(r0)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.x1.run():void");
    }
}
