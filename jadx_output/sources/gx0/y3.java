package gx0;

/* loaded from: classes5.dex */
public final class y3 extends jv0.g {
    public final gx0.g3 A;
    public final gx0.j3 B;
    public final gx0.u3 C;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f277193t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f277194u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f277195v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f277196w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f277197x;

    /* renamed from: y, reason: collision with root package name */
    public final gx0.l3 f277198y;

    /* renamed from: z, reason: collision with root package name */
    public final gx0.w3 f277199z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f277193t = jz5.h.b(new gx0.x2(this));
        this.f277194u = jz5.h.b(new gx0.k3(this));
        this.f277196w = jz5.h.b(new gx0.x3(this));
        this.f277197x = jz5.h.b(new gx0.m3(this));
        this.f277198y = new gx0.l3(this);
        this.f277199z = new gx0.w3(this);
        this.A = new gx0.g3(this);
        this.B = new gx0.j3(this);
        this.C = new gx0.u3(this);
    }

    public final ex0.a0 A7() {
        return ((gx0.kh) ((jz5.n) this.f277196w).getValue()).f276642r;
    }

    public final void B7(com.tencent.maas.model.time.MJTime mJTime) {
        ex0.r K;
        com.tencent.maas.model.time.MJTime mJTime2 = this.f277195v;
        boolean z17 = false;
        if (mJTime2 != null && mJTime2.equalsTo(mJTime)) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        this.f277195v = mJTime;
        java.util.List<com.tencent.maas.base.MJID> list = (java.util.List) ((java.util.LinkedHashMap) this.f302190s).get(java.lang.Long.valueOf(mJTime.getFlicks()));
        if (list != null) {
            java.util.ArrayList<com.tencent.maas.moviecomposing.segments.Segment> arrayList = new java.util.ArrayList();
            for (com.tencent.maas.base.MJID mjid : list) {
                ex0.a0 A7 = A7();
                com.tencent.maas.moviecomposing.segments.Segment segment = (A7 == null || (K = A7.K(mjid)) == null) ? null : K.f257167a;
                if (segment != null) {
                    arrayList.add(segment);
                }
            }
            y7().w7();
            gx0.x4 y76 = y7();
            y76.getClass();
            com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle mJHandleBoxBorderStyle = new com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle(new com.tencent.maas.model.MJColor(1.0f, 0.7607843f, 0.14509805f, 1.0f), j65.q.a(y76.getContext()).getDimension(com.tencent.mm.R.dimen.afy), new com.tencent.maas.model.MJColor(0.0f, 0.0f, 0.0f, 0.1f), 0.0f, new com.tencent.maas.handlebox.model.MJDashLineStyle(new float[]{3.0f, 3.0f}, 0.0f));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (com.tencent.maas.moviecomposing.segments.Segment segment2 : arrayList) {
                com.tencent.maas.model.MJEdgeInsets b17 = cv0.h.b(segment2, y76.getContext());
                java.lang.String value = segment2.f48532a.value();
                kz5.p0 p0Var = kz5.p0.f313996d;
                ug.m C = segment2.C();
                kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
                arrayList2.add(new com.tencent.maas.moviecomposing.DecorationBoxConfig(value, p0Var, y76.Z6(av0.a.a(C)), b17, mJHandleBoxBorderStyle));
            }
            y76.q7(arrayList2);
        }
    }

    @Override // jv0.g
    public java.util.List k7() {
        ex0.a0 A7 = A7();
        if (A7 != null) {
            return A7.f257097g.f257178f;
        }
        return null;
    }

    @Override // jv0.g
    public com.tencent.maas.model.time.MJTime l7(ex0.f vm6, com.tencent.maas.moviecomposing.segments.CaptionItem captionItem) {
        kotlin.jvm.internal.o.g(vm6, "vm");
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        ex0.a0 A7 = A7();
        if (A7 == null) {
            com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
            return ZeroTime;
        }
        com.tencent.maas.model.time.MJTime k17 = vm6.k();
        com.tencent.maas.model.time.MJTime endTime = vm6.l().getEndTime();
        com.tencent.maas.model.time.MJTime b17 = A7.f257092b.b(captionItem.getTimeRange().getEndTime().add(k17));
        kotlin.jvm.internal.o.f(b17, "alignTimeToVideoFrameBoundaryForward(...)");
        com.tencent.maas.model.time.MJTime a17 = ou0.f.a(b17, k17);
        kotlin.jvm.internal.o.d(endTime);
        return ou0.f.b(a17, endTime);
    }

    @Override // jv0.g
    public com.tencent.maas.model.time.MJTime m7(ex0.f vm6, com.tencent.maas.moviecomposing.segments.CaptionItem captionItem) {
        kotlin.jvm.internal.o.g(vm6, "vm");
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        ex0.a0 A7 = A7();
        if (A7 == null) {
            com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
            return ZeroTime;
        }
        com.tencent.maas.model.time.MJTime k17 = vm6.k();
        com.tencent.maas.model.time.MJTime endTime = vm6.l().getEndTime();
        com.tencent.maas.model.time.MJTime b17 = A7.f257092b.b(captionItem.getTimeRange().getStartTime().add(k17));
        kotlin.jvm.internal.o.f(b17, "alignTimeToVideoFrameBoundaryForward(...)");
        com.tencent.maas.model.time.MJTime a17 = ou0.f.a(b17, k17);
        kotlin.jvm.internal.o.d(endTime);
        return ou0.f.b(a17, endTime);
    }

    @Override // jv0.g
    public ex0.f n7(com.tencent.maas.base.MJID mjid) {
        ex0.a0 A7 = A7();
        if (A7 == null) {
            return null;
        }
        ex0.r K = A7.K(mjid);
        if (K instanceof ex0.f) {
            return (ex0.f) K;
        }
        return null;
    }

    @Override // jv0.g
    public void p7() {
        ex0.f fVar;
        ex0.a0 A7 = A7();
        if (A7 == null || (fVar = this.f302188q) == null) {
            return;
        }
        ex0.r n17 = A7.n();
        if (!kotlin.jvm.internal.o.b(n17 != null ? n17.f257168b : null, fVar.f257168b)) {
            ex0.i0.k(A7, fVar);
        }
        if (A7.r() != ax0.e.f14980i) {
            ex0.i0.m(A7);
            ex0.i0.k(A7, fVar);
        }
    }

    @Override // jv0.g
    public void q7() {
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        ex0.a0 A7 = A7();
        if (A7 != null) {
            ex0.i0.m(A7);
        }
        ex0.a0 A72 = A7();
        if (A72 != null) {
            A72.H();
        }
        ex0.a0 A73 = A7();
        if (A73 != null && (j0Var2 = A73.f257115y) != null) {
            j0Var2.observe(W6(), new gx0.y2(this));
        }
        ex0.a0 A74 = A7();
        if (A74 != null && (j0Var = A74.A) != null) {
            j0Var.observe(W6(), new gx0.z2(this));
        }
        ((gx0.gf) ((jz5.n) this.f277197x).getValue()).f276473f.observe(W6(), new gx0.a3(this));
    }

    @Override // jv0.g
    public void r7(com.tencent.maas.base.MJID destSegmentID) {
        kotlin.jvm.internal.o.g(destSegmentID, "destSegmentID");
        A7();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ex0.a0 A7 = A7();
        if (A7 == null) {
            return;
        }
        o7().post(new gx0.b3(this, A7, destSegmentID));
    }

    @Override // jv0.g
    public void s7() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.d3(this, null), 3, null);
    }

    @Override // jv0.g
    public void w7() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.p3(this, null), 3, null);
    }

    @Override // jv0.g
    public void x7() {
        gx0.kh khVar = (gx0.kh) ((jz5.n) this.f277196w).getValue();
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.lmj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        khVar.r7(string, null);
    }

    public final gx0.x4 y7() {
        return (gx0.x4) ((jz5.n) this.f277193t).getValue();
    }

    public final gx0.bf z7() {
        return (gx0.bf) ((jz5.n) this.f277194u).getValue();
    }
}
