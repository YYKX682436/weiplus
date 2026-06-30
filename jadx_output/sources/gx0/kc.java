package gx0;

/* loaded from: classes5.dex */
public final class kc extends gx0.hf {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f276630i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f276631m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f276632n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276630i = jz5.h.b(new gx0.jc(this));
        this.f276631m = jz5.h.b(new gx0.hc(this));
        this.f276632n = jz5.h.b(new gx0.fc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object i7(gx0.kc kcVar, com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        kcVar.getClass();
        if ((segment instanceof ug.d) && !((ug.d) segment).l() && segment.x()) {
            ((ug.d) segment).a();
        }
        java.lang.Object d76 = gx0.bf.d7(kcVar.k7(), null, mJTime, false, continuation, 5, null);
        return d76 == pz5.a.f359186d ? d76 : jz5.f0.f302826a;
    }

    @Override // gx0.hf
    public void U6(com.tencent.maas.base.MJID mjID, yz5.a aVar) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        com.tencent.maas.moviecomposing.segments.Segment b76 = l7().b7(mjID);
        if (b76 == null) {
            return;
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.cc(this, b76, aVar, null), 3, null);
    }

    @Override // gx0.hf
    public void W6(com.tencent.maas.base.MJID mjID, com.tencent.maas.model.time.MJTimeRange timeRange, yz5.a aVar) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        kotlin.jvm.internal.o.g(timeRange, "timeRange");
        com.tencent.maas.moviecomposing.segments.Segment b76 = l7().b7(mjID);
        if (b76 == null) {
            return;
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.dc(this, b76, timeRange, aVar, mjID, null), 3, null);
    }

    @Override // gx0.hf
    public void X6(com.tencent.maas.model.time.MJTime previewTime) {
        kotlin.jvm.internal.o.g(previewTime, "previewTime");
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment l76 = l7().l7();
        if (l76 == null) {
            return;
        }
        pf5.e.launchUI$default(this, null, null, new gx0.ec(this, l76, previewTime, null), 3, null);
    }

    @Override // gx0.hf
    public void a7(zw0.d dVar, com.tencent.maas.model.time.MJTime previewTime) {
        kotlin.jvm.internal.o.g(previewTime, "previewTime");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.gc(dVar, this, previewTime, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r10 == pz5.a.f359186d) goto L13;
     */
    @Override // gx0.hf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c7(boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            gx0.kh r0 = r9.l7()
            com.tencent.maas.moviecomposing.segments.MovieTitleSegment r0 = r0.l7()
            jz5.f0 r1 = jz5.f0.f302826a
            if (r0 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r9.Z6(r0)
            if (r0 == 0) goto L2f
            if (r10 != 0) goto L16
            goto L2f
        L16:
            gx0.bf r2 = r9.k7()
            r3 = 0
            com.tencent.maas.model.time.MJTime r4 = com.tencent.maas.model.time.MJTime.InvalidTime
            java.lang.String r10 = "InvalidTime"
            kotlin.jvm.internal.o.f(r4, r10)
            r5 = 0
            r7 = 5
            r8 = 0
            r6 = r11
            java.lang.Object r10 = gx0.bf.d7(r2, r3, r4, r5, r6, r7, r8)
            pz5.a r11 = pz5.a.f359186d
            if (r10 != r11) goto L2f
            goto L30
        L2f:
            r10 = r1
        L30:
            pz5.a r11 = pz5.a.f359186d
            if (r10 != r11) goto L35
            return r10
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.kc.c7(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // gx0.hf
    public com.tencent.maas.model.time.MJTime e7() {
        com.tencent.maas.model.time.MJTime i76 = k7().i7();
        return !i76.isValid() ? super.e7() : i76;
    }

    @Override // gx0.hf
    public com.tencent.maas.model.time.MJTime f7() {
        com.tencent.maas.model.time.MJTime f76 = super.f7();
        com.tencent.maas.model.time.MJTime l76 = k7().l7();
        if (!l76.isValid()) {
            return f76;
        }
        com.tencent.maas.model.time.MJTime sub = l76.sub(e7());
        return sub.smallThan(f76) ? sub : f76;
    }

    @Override // gx0.hf
    public boolean g7(com.tencent.maas.base.MJID mjID, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        ex0.a0 a0Var = l7().f276642r;
        if (a0Var == null) {
            return false;
        }
        boolean G = a0Var.G(mjID, true, ax0.e.f14975d);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.ic(this, G, z17, z18, null), 3, null);
        return G;
    }

    public final gx0.bf k7() {
        return (gx0.bf) ((jz5.n) this.f276631m).getValue();
    }

    public final gx0.kh l7() {
        return (gx0.kh) ((jz5.n) this.f276630i).getValue();
    }
}
