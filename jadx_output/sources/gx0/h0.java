package gx0;

/* loaded from: classes5.dex */
public final class h0 extends uw0.o {
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.B = jz5.h.b(new gx0.g0(this));
        this.C = jz5.h.b(new gx0.e0(this));
        this.D = jz5.h.b(new gx0.f0(this));
        this.E = jz5.h.b(new gx0.z(this));
    }

    @Override // uw0.o
    public java.util.List A7() {
        return W7().d7();
    }

    @Override // uw0.o
    public ex0.c B7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return W7().f7(segmentID);
    }

    @Override // uw0.o
    public ex0.d C7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        gx0.kh W7 = W7();
        W7.getClass();
        ex0.a0 a0Var = W7.f276642r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f257097g.g(segmentID);
        ex0.d dVar = g17 instanceof ex0.d ? (ex0.d) g17 : null;
        if (dVar != null) {
            return dVar;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // uw0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.maas.moviecomposing.segments.ContentDescSegment D7() {
        /*
            r5 = this;
            gx0.kh r0 = r5.W7()
            ex0.a0 r0 = r0.f276642r
            r1 = 0
            if (r0 == 0) goto L34
            ex0.v r0 = r0.f257097g
            java.util.List r0 = r0.f257178f
            if (r0 == 0) goto L34
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            r3 = r2
            ex0.r r3 = (ex0.r) r3
            ug.m r3 = r3.f257169c
            ug.m r4 = ug.m.ContentDesc
            if (r3 != r4) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 == 0) goto L13
            goto L2d
        L2c:
            r2 = r1
        L2d:
            ex0.r r2 = (ex0.r) r2
            if (r2 == 0) goto L34
            com.tencent.maas.moviecomposing.segments.Segment r0 = r2.f257167a
            goto L35
        L34:
            r0 = r1
        L35:
            boolean r2 = r0 instanceof com.tencent.maas.moviecomposing.segments.ContentDescSegment
            if (r2 == 0) goto L3c
            r1 = r0
            com.tencent.maas.moviecomposing.segments.ContentDescSegment r1 = (com.tencent.maas.moviecomposing.segments.ContentDescSegment) r1
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.h0.D7():com.tencent.maas.moviecomposing.segments.ContentDescSegment");
    }

    @Override // uw0.o
    public void H7(uw0.a panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.H7(panel);
        ((gx0.gf) ((jz5.n) this.D).getValue()).f276473f.observe(W6(), new gx0.y(this, panel));
    }

    @Override // uw0.o
    public boolean I7(com.tencent.maas.base.MJID mjid) {
        ex0.v vVar;
        ex0.a0 a0Var = W7().f276642r;
        return (a0Var == null || (vVar = a0Var.f257097g) == null || !vVar.b(mjid)) ? false : true;
    }

    @Override // uw0.o
    public gx0.w J7() {
        return (gx0.w) T6(gx0.f4.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    @Override // uw0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K7(sw0.d r6, com.tencent.maas.moviecomposing.segments.ClipSegment r7) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "belongingSegment"
            kotlin.jvm.internal.o.g(r7, r0)
            gx0.kh r0 = r5.W7()
            com.tencent.maas.material.MJMaterialInfo r6 = r6.f413422a
            java.lang.String r6 = r6.f48224b
            java.lang.String r1 = "getMaterialID(...)"
            kotlin.jvm.internal.o.f(r6, r1)
            com.tencent.maas.base.MJID r7 = r7.f48532a
            java.lang.String r1 = "getSegmentID(...)"
            kotlin.jvm.internal.o.f(r7, r1)
            r0.getClass()
            ex0.a0 r0 = r0.f276642r
            r2 = 0
            if (r0 != 0) goto L27
            goto L35
        L27:
            com.tencent.maas.moviecomposing.Timeline r3 = r0.f257092b
            r4 = 1
            com.tencent.maas.base.MJID r6 = r3.c(r6, r7, r4)
            if (r6 != 0) goto L33
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.z.f193105a
            r6 = r2
        L33:
            if (r6 != 0) goto L37
        L35:
            r6 = r2
            goto L42
        L37:
            cx0.d r7 = cx0.d.f224510f
            cx0.d r3 = cx0.d.f224509e
            java.util.EnumSet r7 = r7.a(r3)
            r0.J(r7, r2)
        L42:
            if (r6 != 0) goto L47
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.z.f193105a
            r6 = r2
        L47:
            r7 = 0
            if (r6 != 0) goto L4d
            r5.f431590z = r7
            return
        L4d:
            ex0.d r6 = r5.C7(r6)
            if (r6 != 0) goto L56
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.z.f193105a
            r6 = r2
        L56:
            gx0.bf r0 = r5.V7()
            com.tencent.maas.moviecomposing.PlaybackSession r0 = r0.k7()
            if (r6 == 0) goto Lc4
            if (r0 != 0) goto L63
            goto Lc4
        L63:
            java.util.List r7 = r5.A7()
            java.lang.Object r7 = kz5.n0.Z(r7)
            com.tencent.maas.moviecomposing.segments.ContentDescSegment r7 = (com.tencent.maas.moviecomposing.segments.ContentDescSegment) r7
            if (r7 != 0) goto L89
            gx0.bf r7 = r5.V7()
            gx0.kh r0 = r5.W7()
            jz5.g r3 = r5.E
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            gx0.w8 r3 = (gx0.w8) r3
            android.util.SizeF r3 = r3.C7()
            ou0.e0.a(r6, r7, r0, r3)
            goto La8
        L89:
            android.graphics.PointF r0 = r7.m0()
            java.lang.String r3 = "getLayerPosition(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            float r3 = r7.n0()
            android.graphics.PointF r7 = r7.o0()
            java.lang.String r4 = "getLayerScale(...)"
            kotlin.jvm.internal.o.f(r7, r4)
            r6.r(r0)
            r6.s(r3)
            r6.t(r7)
        La8:
            jz5.g r7 = r5.f431586v
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            gx0.kc r7 = (gx0.kc) r7
            com.tencent.maas.moviecomposing.segments.Segment r6 = r6.f257167a
            com.tencent.maas.base.MJID r6 = r6.f48532a
            kotlin.jvm.internal.o.f(r6, r1)
            com.tencent.maas.model.time.MJTimeRange r0 = com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange
            java.lang.String r1 = "InvalidTimeRange"
            kotlin.jvm.internal.o.f(r0, r1)
            r7.W6(r6, r0, r2)
            return
        Lc4:
            r5.f431590z = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.h0.K7(sw0.d, com.tencent.maas.moviecomposing.segments.ClipSegment):void");
    }

    @Override // uw0.o
    public void M7(com.tencent.maas.moviecomposing.segments.ClipSegment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        gx0.bf V7 = V7();
        com.tencent.maas.model.time.MJTime A = segment.A();
        kotlin.jvm.internal.o.f(A, "getPresentationStartTime(...)");
        gx0.bf.q7(V7, A, true, 0L, 4, null);
    }

    @Override // uw0.o
    public void N7() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.a0(this, null), 3, null);
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f431589y;
        if (clipSegment != null) {
            gx0.bf V7 = V7();
            com.tencent.maas.model.time.MJTimeRange B = clipSegment.B();
            kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(V7, B);
        }
    }

    @Override // uw0.o
    public void O7() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.b0(this, null), 3, null);
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f431589y;
        if (clipSegment != null) {
            gx0.bf V7 = V7();
            com.tencent.maas.model.time.MJTimeRange B = clipSegment.B();
            kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(V7, B);
        }
    }

    @Override // uw0.o
    public void P7() {
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f431589y;
        if (clipSegment != null) {
            gx0.bf V7 = V7();
            com.tencent.maas.model.time.MJTimeRange B = clipSegment.B();
            kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(V7, B);
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.c0(this, null), 3, null);
    }

    @Override // uw0.o
    public void Q7() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.d0(this, null), 3, null);
    }

    public final gx0.bf V7() {
        return (gx0.bf) ((jz5.n) this.C).getValue();
    }

    public final gx0.kh W7() {
        return (gx0.kh) ((jz5.n) this.B).getValue();
    }

    @Override // uw0.o
    public void y7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
        gx0.kh W7 = W7();
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f431589y;
        W7.r7(snapshotDesc, clipSegment != null ? clipSegment.A() : null);
    }

    @Override // uw0.o
    public com.tencent.maas.moviecomposing.segments.ClipSegment z7(com.tencent.maas.moviecomposing.segments.ClipSegment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        gx0.kh W7 = W7();
        W7.getClass();
        ex0.a0 a0Var = W7.f276642r;
        if (a0Var == null) {
            return null;
        }
        com.tencent.maas.model.time.MJTime endTime = segment.B().getEndTime();
        kotlin.jvm.internal.o.d(endTime);
        ex0.c d17 = ex0.i0.d(a0Var, endTime);
        com.tencent.maas.moviecomposing.segments.Segment segment2 = d17 != null ? d17.f257167a : null;
        if (segment2 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment) {
            return (com.tencent.maas.moviecomposing.segments.ClipSegment) segment2;
        }
        return null;
    }
}
