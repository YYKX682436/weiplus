package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class lm implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.qm f129488a;

    public lm(com.tencent.mm.plugin.finder.ui.qm qmVar) {
        this.f129488a = qmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[EDGE_INSN: B:44:0x00c4->B:45:0x00c4 BREAK  A[LOOP:2: B:20:0x0073->B:51:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[LOOP:2: B:20:0x0073->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // in5.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.recyclerview.widget.RecyclerView r12, in5.w0 r13) {
        /*
            r11 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r12 = "data"
            kotlin.jvm.internal.o.g(r13, r12)
            com.tencent.mm.plugin.finder.ui.qm r12 = r11.f129488a
            com.tencent.mm.ui.MMActivity r12 = r12.f106421d
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.g(r12, r0)
            pf5.z r0 = pf5.z.f353948a
            pf5.v r12 = r0.a(r12)
            java.lang.Class<as2.g> r0 = as2.g.class
            pf5.b0 r12 = r12.e(r0)
            as2.g r12 = (as2.g) r12
            if (r12 == 0) goto Le2
            java.util.LinkedList r13 = r13.f293154g
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L2e:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r13.next()
            r2 = r1
            in5.x0 r2 = (in5.x0) r2
            in5.c r2 = r2.f293158a
            boolean r2 = r2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r2 == 0) goto L2e
            r0.add(r1)
            goto L2e
        L45:
            java.util.ArrayList r13 = new java.util.ArrayList
            r1 = 10
            int r1 = kz5.d0.q(r0, r1)
            r13.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            in5.x0 r1 = (in5.x0) r1
            in5.c r1 = r1.f293158a
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            kotlin.jvm.internal.o.e(r1, r2)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r1
            r13.add(r1)
            goto L54
        L6d:
            java.util.concurrent.CopyOnWriteArrayList r12 = r12.f13463d
            java.util.Iterator r12 = r12.iterator()
        L73:
            boolean r0 = r12.hasNext()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r12.next()
            r4 = r0
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r4
            if (r4 == 0) goto L8d
            boolean r5 = r4.getIsUnReadBackupFeed()
            if (r5 != r2) goto L8d
            r5 = r2
            goto L8e
        L8d:
            r5 = r3
        L8e:
            if (r5 == 0) goto Lbf
            boolean r5 = r13.isEmpty()
            if (r5 == 0) goto L97
            goto Lba
        L97:
            java.util.Iterator r5 = r13.iterator()
        L9b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lba
            java.lang.Object r6 = r5.next()
            so2.j5 r6 = (so2.j5) r6
            long r7 = r4.getItemId()
            long r9 = r6.getItemId()
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto Lb5
            r6 = r2
            goto Lb6
        Lb5:
            r6 = r3
        Lb6:
            if (r6 == 0) goto L9b
            r4 = r2
            goto Lbb
        Lba:
            r4 = r3
        Lbb:
            if (r4 == 0) goto Lbf
            r4 = r2
            goto Lc0
        Lbf:
            r4 = r3
        Lc0:
            if (r4 == 0) goto L73
            goto Lc4
        Lc3:
            r0 = r1
        Lc4:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r0
            if (r0 == 0) goto Le2
            r0.b2(r3)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "markRead feed:"
            r12.<init>(r13)
            java.lang.String r13 = hc2.b0.h(r0, r3, r2, r1)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "FinderSharePageBackupUIC"
            com.tencent.mars.xlog.Log.i(r13, r12)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.lm.a(androidx.recyclerview.widget.RecyclerView, in5.w0):void");
    }
}
