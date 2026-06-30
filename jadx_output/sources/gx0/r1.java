package gx0;

/* loaded from: classes5.dex */
public final class r1 extends hw0.n {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f276903u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f276904v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f276905w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276903u = jz5.h.b(new gx0.q1(this));
        this.f276904v = jz5.h.b(new gx0.o1(this));
        this.f276905w = jz5.h.b(new gx0.p1(this));
    }

    @Override // hw0.n, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        super.b7();
        ex0.a0 a0Var = s7().f276642r;
        if (a0Var != null) {
            ex0.i0.l(a0Var);
        }
        com.tencent.maas.moviecomposing.Timeline o76 = s7().o7();
        if (o76 != null) {
            du0.v0 R6 = R6();
            int h76 = s7().h7();
            int k76 = s7().k7();
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.j1(m7Var, o76, h76, k76, null), 3, null);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        zw0.d dVar;
        gx0.kc r76 = r7();
        hw0.g gVar = (hw0.g) this.f69240i;
        if (gVar == null || (dVar = gVar.getPanelLevel()) == null) {
            dVar = zw0.d.f476561f;
        }
        gx0.hf.b7(r76, dVar, null, 2, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void f7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        hw0.g panel = (hw0.g) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        d7();
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.n1(this, null), 3, null);
    }

    @Override // hw0.n
    public lw0.l l7() {
        return (lw0.l) T6(gx0.dd.class);
    }

    @Override // hw0.n
    public void m7(hw0.g panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.m7(panel);
        ((gx0.gf) T6(gx0.gf.class)).f276473f.observe(W6(), new gx0.k1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // hw0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n7(com.tencent.mm.api.IEmojiInfo r18, com.tencent.mm.vfs.r6 r19, com.tencent.mm.ui.widget.dialog.u3 r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.r1.n7(com.tencent.mm.api.IEmojiInfo, com.tencent.mm.vfs.r6, com.tencent.mm.ui.widget.dialog.u3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    @Override // hw0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o7(kw0.a r9) {
        /*
            r8 = this;
            java.lang.String r0 = "stickerData"
            kotlin.jvm.internal.o.g(r9, r0)
            gx0.kc r0 = r8.r7()
            ug.m r1 = ug.m.WhenWhere
            com.tencent.maas.model.time.MJTimeRange r0 = r0.Y6(r1)
            gx0.kh r1 = r8.s7()
            com.tencent.maas.material.MJMaterialInfo r9 = r9.f312788a
            java.lang.String r9 = r9.f48224b
            java.lang.String r2 = "getMaterialID(...)"
            kotlin.jvm.internal.o.f(r9, r2)
            r1.getClass()
            ex0.a0 r1 = r1.f276642r
            r2 = 0
            if (r1 != 0) goto L25
            goto L3b
        L25:
            com.tencent.maas.model.time.MJTime r3 = r0.getStartTime()
            com.tencent.maas.model.time.MJTime r4 = r0.getDuration()
            r5 = 1
            com.tencent.maas.moviecomposing.Timeline r6 = r1.f257092b
            com.tencent.maas.base.MJID r9 = r6.i(r9, r3, r4, r5)
            if (r9 != 0) goto L39
            java.lang.String r9 = com.tencent.mm.sdk.platformtools.z.f193105a
            r9 = r2
        L39:
            if (r9 != 0) goto L3d
        L3b:
            r9 = r2
            goto L48
        L3d:
            cx0.d r3 = cx0.d.f224510f
            cx0.d r4 = cx0.d.f224509e
            java.util.EnumSet r3 = r3.a(r4)
            r1.J(r3, r2)
        L48:
            if (r9 != 0) goto L4d
            java.lang.String r9 = com.tencent.mm.sdk.platformtools.z.f193105a
            r9 = r2
        L4d:
            if (r9 != 0) goto L50
            return
        L50:
            gx0.kh r1 = r8.s7()
            ex0.k0 r1 = r1.p7(r9)
            if (r1 != 0) goto L5d
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z.f193105a
            r1 = r2
        L5d:
            if (r1 != 0) goto L60
            return
        L60:
            gx0.kh r3 = r8.s7()
            gx0.kc r4 = r8.r7()
            com.tencent.maas.model.time.MJTime r4 = r4.e7()
            ex0.c r3 = r3.g7(r4)
            if (r3 != 0) goto L75
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.z.f193105a
            r3 = r2
        L75:
            if (r3 != 0) goto L78
            return
        L78:
            com.tencent.maas.moviecomposing.segments.WhenWhereSegment r4 = r1.f257145p
            r4.getClass()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            com.tencent.maas.moviecomposing.Timeline r6 = r4.D()
            if (r6 == 0) goto L8a
            java.lang.Boolean r6 = com.tencent.maas.moviecomposing.segments.WhenWhereSegment.v0(r4, r6)
            goto L8b
        L8a:
            r6 = r5
        L8b:
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L98
            long r6 = r3.A()
            r1.B(r6)
        L98:
            r4.getClass()
            com.tencent.maas.moviecomposing.Timeline r6 = r4.D()
            if (r6 == 0) goto La5
            java.lang.Boolean r5 = com.tencent.maas.moviecomposing.segments.WhenWhereSegment.z0(r4, r6)
        La5:
            boolean r4 = r5.booleanValue()
            if (r4 != 0) goto Lc1
            gx0.kc r9 = r8.r7()
            com.tencent.maas.moviecomposing.segments.Segment r1 = r1.f257167a
            com.tencent.maas.base.MJID r2 = r1.f48532a
            java.lang.String r3 = "getSegmentID(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            gx0.j1 r3 = new gx0.j1
            r3.<init>(r1, r8)
            r9.W6(r2, r0, r3)
            return
        Lc1:
            du0.i0 r4 = r8.P6()
            com.tencent.maas.moviecomposing.segments.ClipSegment r3 = r3.f257119p
            r3.getClass()
            com.tencent.maas.moviecomposing.Timeline r5 = r3.D()
            if (r5 == 0) goto Ld4
            com.tencent.maas.model.MJLocation r2 = com.tencent.maas.moviecomposing.segments.ClipSegment.U0(r3, r5)
        Ld4:
            gx0.m1 r3 = new gx0.m1
            r3.<init>(r8, r9, r1, r0)
            r4.O6(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.r1.o7(kw0.a):void");
    }

    public final gx0.bf q7() {
        return (gx0.bf) ((jz5.n) this.f276904v).getValue();
    }

    public final gx0.kc r7() {
        return (gx0.kc) ((jz5.n) this.f276905w).getValue();
    }

    public final gx0.kh s7() {
        return (gx0.kh) ((jz5.n) this.f276903u).getValue();
    }
}
