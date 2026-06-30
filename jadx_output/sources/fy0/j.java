package fy0;

/* loaded from: classes5.dex */
public final class j extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fy0.n f267188a;

    public j(fy0.n nVar) {
        this.f267188a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.g(r8, r0)
            int r0 = r8.what
            fy0.n r1 = r7.f267188a
            int r2 = r1.f267201i
            if (r0 == r2) goto Lb7
            int r2 = r1.f267202j
            int r3 = r1.f267203k
            if (r0 != r2) goto La0
            android.os.Handler r8 = r1.f267204l
            if (r8 == 0) goto L1a
            r8.removeMessages(r3)
        L1a:
            fy0.k r8 = r1.f267199g
            r0 = 1
            r2 = 0
            if (r8 == 0) goto L2e
            r3 = r8
            gy0.q r3 = (gy0.q) r3
            com.tencent.maas.base.MJID r3 = r3.M
            if (r3 == 0) goto L29
            r3 = r0
            goto L2a
        L29:
            r3 = r2
        L2a:
            if (r3 != r0) goto L2e
            r3 = r0
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 == 0) goto Lb7
            r1.f267205m = r0
            fy0.l r0 = fy0.l.f267190e
            r1.f267195c = r0
            if (r8 == 0) goto Lb7
            gy0.q r8 = (gy0.q) r8
            com.tencent.maas.base.MJID r0 = r8.M
            r8.N = r0
            if (r0 == 0) goto Lb7
            boolean r1 = r8.K
            ex0.a0 r3 = r8.f277523f
            if (r1 != 0) goto L4b
            boolean r1 = r8.L
            if (r1 == 0) goto L4e
        L4b:
            ex0.i0.i(r3)
        L4e:
            r8.K = r2
            r8.L = r2
            ex0.r r1 = r3.K(r0)
            if (r1 != 0) goto L59
            goto Lb7
        L59:
            boolean r1 = r1.f257170d
            r3 = 2
            if (r1 == 0) goto L75
            bx0.h r1 = r8.f277524g
            r1.g(r0)
            com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView r0 = r8.f277522e
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.o.g(r0, r1)
            r0.performHapticFeedback(r2, r3)
            gy0.j r8 = r8.f277527m
            if (r8 == 0) goto Lb7
            r8.g()
            goto Lb7
        L75:
            gy0.f r8 = r8.f277526i
            if (r8 == 0) goto Lb7
            rv0.n0 r8 = (rv0.n0) r8
            rv0.n1 r8 = r8.f400125a
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r0 = r8.r7()
            r0.performHapticFeedback(r2, r3)
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r0 = r8.r7()
            r0.o()
            kotlinx.coroutines.y0 r1 = r8.getMainScope()
            r2 = 0
            r3 = 0
            rv0.m0 r4 = new rv0.m0
            r0 = 0
            r4.<init>(r8, r0)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.l.d(r1, r2, r3, r4, r5, r6)
            rv0.a4.c(r8)
            goto Lb7
        La0:
            if (r0 != r3) goto La3
            goto Lb7
        La3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown message "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fy0.j.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fy0.n nVar, android.os.Handler handler) {
        super(handler.getLooper());
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f267188a = nVar;
    }
}
