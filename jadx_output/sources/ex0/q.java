package ex0;

/* loaded from: classes5.dex */
public final class q extends ex0.c implements ex0.h {

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.NarrationSegment f257162q;

    /* renamed from: r, reason: collision with root package name */
    public final cw0.d1 f257163r;

    /* renamed from: s, reason: collision with root package name */
    public float[] f257164s;

    /* renamed from: t, reason: collision with root package name */
    public vu0.u f257165t;

    /* renamed from: u, reason: collision with root package name */
    public vu0.w f257166u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment) {
        super(narrationSegment);
        kotlin.jvm.internal.o.g(narrationSegment, "narrationSegment");
        this.f257162q = narrationSegment;
        this.f257163r = new cw0.d1();
        this.f257164s = new float[0];
        this.f257165t = vu0.u.f440160e;
        this.f257166u = vu0.w.f440168f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ex0.p
            if (r0 == 0) goto L13
            r0 = r8
            ex0.p r0 = (ex0.p) r0
            int r1 = r0.f257161g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257161g = r1
            goto L18
        L13:
            ex0.p r0 = new ex0.p
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f257159e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f257161g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f257158d
            ex0.q r0 = (ex0.q) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            com.tencent.maas.moviecomposing.segments.NarrationSegment r8 = r7.f257162q
            com.tencent.maas.model.time.MJTime r2 = r8.p0()
            java.lang.String r4 = "getTotalDurationIncludingExpandable(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            r0.f257158d = r7
            r0.f257161g = r3
            cw0.d1 r3 = r7.f257163r
            r3.getClass()
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310570c
            cw0.c1 r5 = new cw0.c1
            r6 = 0
            r5.<init>(r2, r3, r8, r6)
            java.lang.Object r8 = kotlinx.coroutines.l.g(r4, r5, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r0 = r7
        L5a:
            float[] r8 = (float[]) r8
            r0.f257164s = r8
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.q.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String H() {
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = this.f257162q;
        narrationSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        return D != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.E1(narrationSegment, D) : "";
    }

    public final java.util.List I() {
        com.tencent.maas.moviecomposing.segments.CaptionItem[] P1 = this.f257162q.P1();
        kotlin.jvm.internal.o.f(P1, "getCaptionItems(...)");
        return kz5.z.z0(P1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r0.k().equalsTo(l().getEndTime()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        if (r0.l().getEndTime().bigThan(l().getStartTime()) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:8:0x001a->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(ex0.a0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "timelineViewModel"
            kotlin.jvm.internal.o.g(r6, r0)
            ex0.v r6 = r6.f257097g
            java.util.List r6 = r6.f257179g
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L16
            goto Laa
        L16:
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r6.next()
            ex0.q r0 = (ex0.q) r0
            com.tencent.maas.base.MJID r2 = r0.f257168b
            com.tencent.maas.base.MJID r3 = r5.f257168b
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            r3 = 1
            if (r2 == 0) goto L34
        L31:
            r0 = r1
            goto La7
        L34:
            ax0.a r2 = r5.f257134j
            int r2 = r2.ordinal()
            if (r2 == 0) goto L7a
            if (r2 == r3) goto L6d
            r4 = 2
            if (r2 != r4) goto L67
            com.tencent.maas.model.time.MJTimeRange r2 = r0.l()
            com.tencent.maas.model.time.MJTimeRange r4 = r5.l()
            com.tencent.maas.model.time.MJTime r4 = r4.getEndTime()
            boolean r2 = r2.containsTime(r4)
            if (r2 == 0) goto L31
            com.tencent.maas.model.time.MJTime r0 = r0.k()
            com.tencent.maas.model.time.MJTimeRange r2 = r5.l()
            com.tencent.maas.model.time.MJTime r2 = r2.getEndTime()
            boolean r0 = r0.equalsTo(r2)
            if (r0 == 0) goto L31
        L65:
            r0 = r3
            goto La7
        L67:
            jz5.j r6 = new jz5.j
            r6.<init>()
            throw r6
        L6d:
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r2 = r5.k()
            boolean r0 = r0.containsTime(r2)
            goto La7
        L7a:
            com.tencent.maas.model.time.MJTimeRange r2 = r0.l()
            com.tencent.maas.model.time.MJTime r2 = r2.getStartTime()
            com.tencent.maas.model.time.MJTimeRange r4 = r5.l()
            com.tencent.maas.model.time.MJTime r4 = r4.getEndTime()
            boolean r2 = r2.smallThan(r4)
            if (r2 == 0) goto L31
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r0 = r0.getEndTime()
            com.tencent.maas.model.time.MJTimeRange r2 = r5.l()
            com.tencent.maas.model.time.MJTime r2 = r2.getStartTime()
            boolean r0 = r0.bigThan(r2)
            if (r0 == 0) goto L31
            goto L65
        La7:
            if (r0 == 0) goto L1a
            r1 = r3
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.q.J(ex0.a0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r0.right >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r0.right <= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (r0.right >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r0.right <= r8.right) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
    
        if (r0.right >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0086, code lost:
    
        if (r0.right >= r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008c, code lost:
    
        if (r0.right <= r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:8:0x001a->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(android.graphics.Rect r8, ex0.a0 r9, bx0.h r10) {
        /*
            r7 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            ex0.v r9 = r9.f257097g
            java.util.List r9 = r9.f257179g
            boolean r1 = r9 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L16
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L16
            goto L92
        L16:
            java.util.Iterator r9 = r9.iterator()
        L1a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r9.next()
            ex0.q r1 = (ex0.q) r1
            com.tencent.maas.base.MJID r3 = r1.f257168b
            com.tencent.maas.base.MJID r4 = r7.f257168b
            boolean r3 = kotlin.jvm.internal.o.b(r3, r4)
            r4 = 1
            if (r3 == 0) goto L33
        L31:
            r1 = r2
            goto L8f
        L33:
            com.tencent.maas.base.MJID r1 = r1.f257168b
            android.graphics.Rect r1 = r10.b(r1, r2)
            r0.set(r1)
            ax0.a r1 = r7.f257134j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L76
            if (r1 == r4) goto L62
            r3 = 2
            if (r1 != r3) goto L5c
            int r1 = r0.left
            int r3 = r8.right
            if (r1 > r3) goto L53
            int r5 = r0.right
            if (r5 >= r3) goto L74
        L53:
            int r5 = r8.left
            if (r1 < r5) goto L31
            int r1 = r0.right
            if (r1 > r3) goto L31
            goto L74
        L5c:
            jz5.j r8 = new jz5.j
            r8.<init>()
            throw r8
        L62:
            int r1 = r0.left
            int r3 = r8.left
            if (r1 > r3) goto L6c
            int r5 = r0.right
            if (r5 >= r3) goto L74
        L6c:
            if (r1 < r3) goto L31
            int r1 = r0.right
            int r3 = r8.right
            if (r1 > r3) goto L31
        L74:
            r1 = r4
            goto L8f
        L76:
            int r1 = r0.left
            int r3 = r8.left
            if (r1 > r3) goto L80
            int r5 = r0.right
            if (r5 >= r3) goto L74
        L80:
            int r5 = r8.right
            if (r1 > r5) goto L88
            int r6 = r0.right
            if (r6 >= r5) goto L74
        L88:
            if (r1 < r3) goto L31
            int r1 = r0.right
            if (r1 > r5) goto L31
            goto L74
        L8f:
            if (r1 == 0) goto L1a
            r2 = r4
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.q.K(android.graphics.Rect, ex0.a0, bx0.h):boolean");
    }

    public final boolean L(java.lang.String colorStyleID) {
        kotlin.jvm.internal.o.g(colorStyleID, "colorStyleID");
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = this.f257162q;
        narrationSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.NarrationSegment.J1(narrationSegment, colorStyleID, D);
        }
        return bool.booleanValue();
    }

    public final boolean M(java.lang.String fontName) {
        kotlin.jvm.internal.o.g(fontName, "fontName");
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = this.f257162q;
        narrationSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.NarrationSegment.F1(narrationSegment, fontName, D);
        }
        return bool.booleanValue();
    }

    public final void N(java.util.List captionItems) {
        kotlin.jvm.internal.o.g(captionItems, "captionItems");
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = this.f257162q;
        narrationSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.NarrationSegment.H1(narrationSegment, captionItems, D);
        }
        bool.booleanValue();
    }

    public final boolean O(java.lang.String captionStyleID) {
        kotlin.jvm.internal.o.g(captionStyleID, "captionStyleID");
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = this.f257162q;
        narrationSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        java.lang.String G1 = D != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.G1(narrationSegment, D) : "";
        com.tencent.maas.moviecomposing.Timeline D2 = narrationSegment.D();
        java.lang.String K1 = D2 != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.K1(narrationSegment, D2) : "";
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D3 = narrationSegment.D();
        if (D3 != null) {
            bool = com.tencent.maas.moviecomposing.segments.NarrationSegment.D1(narrationSegment, captionStyleID, D3);
        }
        return bool.booleanValue() && L(G1) && M(K1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r5 == vu0.w.f440167e) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r5 != vu0.w.f440168f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r5 != vu0.w.f440168f) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(vu0.w r5) {
        /*
            r4 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.g(r5, r0)
            vu0.v r1 = vu0.w.f440166d
            vu0.w r2 = r4.f257166u
            r1.getClass()
            kotlin.jvm.internal.o.g(r2, r0)
            int r0 = r2.ordinal()
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L2a
            r3 = 2
            if (r0 != r3) goto L24
            vu0.w r0 = vu0.w.f440167e
            if (r5 == r0) goto L39
            vu0.w r0 = vu0.w.f440168f
            if (r5 != r0) goto L38
            goto L39
        L24:
            jz5.j r5 = new jz5.j
            r5.<init>()
            throw r5
        L2a:
            vu0.w r0 = vu0.w.f440167e
            if (r5 != r0) goto L38
            goto L39
        L2f:
            vu0.w r0 = vu0.w.f440169g
            if (r5 == r0) goto L39
            vu0.w r0 = vu0.w.f440168f
            if (r5 != r0) goto L38
            goto L39
        L38:
            r1 = 0
        L39:
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r5 = r2
        L3d:
            r4.f257166u = r5
            r4.toString()
            vu0.w r5 = r4.f257166u
            java.util.Objects.toString(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.q.P(vu0.w):void");
    }

    @Override // ex0.h
    public vu0.u e() {
        return this.f257165t;
    }

    @Override // ex0.h
    public void f(vu0.u uVar) {
        kotlin.jvm.internal.o.g(uVar, "<set-?>");
        this.f257165t = uVar;
    }

    @Override // ex0.f
    public android.graphics.PointF v() {
        return new android.graphics.PointF(0.5f, 0.69f);
    }

    @Override // ex0.f
    public android.graphics.PointF w() {
        return new android.graphics.PointF(0.5f, 0.7f);
    }
}
