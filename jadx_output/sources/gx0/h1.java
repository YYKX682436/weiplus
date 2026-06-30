package gx0;

/* loaded from: classes5.dex */
public final class h1 extends uw0.e1 {
    public final jz5.g C;
    public final jz5.g D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.C = jz5.h.b(new gx0.b1(this));
        this.D = jz5.h.b(new gx0.a1(this));
    }

    @Override // uw0.e1
    public kotlinx.coroutines.r2 A7() {
        return pf5.e.launch$default(this, kotlinx.coroutines.q1.f310570c, null, new gx0.z0(this, null), 2, null);
    }

    @Override // uw0.e1
    public com.tencent.maas.model.time.MJTime B7() {
        return L7().h7();
    }

    @Override // uw0.e1
    public com.tencent.maas.model.time.MJTime C7() {
        return (com.tencent.maas.model.time.MJTime) L7().A.getValue();
    }

    @Override // uw0.e1
    public ow0.a0 E7() {
        return (ow0.a0) T6(gx0.u2.class);
    }

    @Override // uw0.e1
    public gx0.hf F7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // uw0.e1
    public void G7(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        super.G7(text);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.c1(this, null), 3, null);
    }

    @Override // uw0.e1
    public void H7(sw0.e textStyleState) {
        kotlin.jvm.internal.o.g(textStyleState, "textStyleState");
        ex0.a0 a0Var = M7().f276642r;
        if (a0Var == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(textStyleState.f413426a, textStyleState.f413427b.f413435b);
        if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
            java.lang.String str = dVar.f413422a.f48224b;
            du0.v0 R6 = R6();
            kotlin.jvm.internal.o.d(str);
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.a4(m7Var, str, null), 3, null);
            java.util.Iterator it = a0Var.f257097g.f257180h.iterator();
            while (it.hasNext()) {
                ((ex0.b) it.next()).K(str);
            }
            sw0.b bVar = this.f349118q;
            this.f349118q = bVar != null ? sw0.b.a(bVar, null, str, null, null, null, 29, null) : null;
            sw0.b bVar2 = this.f431548t;
            this.f431548t = bVar2 != null ? sw0.b.a(bVar2, null, str, null, null, null, 29, null) : null;
            kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.d1(this, null), 3, null);
        }
    }

    @Override // uw0.e1
    public void I7(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        super.I7(text);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.e1(this, null), 3, null);
    }

    @Override // uw0.e1
    public void J7() {
        sw0.b bVar;
        java.lang.String str;
        java.lang.String str2;
        this.f431554z = false;
        ex0.a0 a0Var = M7().f276642r;
        if (a0Var == null || (bVar = this.f349118q) == null || (str = bVar.f413416c) == null) {
            return;
        }
        java.util.List list = a0Var.f257097g.f257180h;
        ex0.b bVar2 = (ex0.b) kz5.n0.a0(list, 0);
        if (bVar2 != null) {
            com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = bVar2.f257117p;
            captionSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
            str2 = D != null ? com.tencent.maas.moviecomposing.segments.CaptionSegment.M0(captionSegment, D) : "";
        } else {
            str2 = null;
        }
        if (kotlin.jvm.internal.o.b(str2, str)) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((ex0.b) arrayList.get(i17)).I(str);
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.f1(this, null), 3, null);
    }

    @Override // uw0.e1
    public void K7(sw0.e textMaterialUiState) {
        sw0.b bVar;
        sw0.b bVar2;
        kotlin.jvm.internal.o.g(textMaterialUiState, "textMaterialUiState");
        ex0.a0 a0Var = M7().f276642r;
        if (a0Var == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(textMaterialUiState.f413426a, textMaterialUiState.f413427b.f413435b);
        if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
            java.lang.String str = dVar.f413422a.f48224b;
            java.util.ArrayList arrayList = (java.util.ArrayList) a0Var.f257097g.f257180h;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ex0.b bVar3 = (ex0.b) arrayList.get(i17);
                kotlin.jvm.internal.o.d(str);
                bVar3.getClass();
                com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = bVar3.f257117p;
                captionSegment.getClass();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
                if (D != null) {
                    bool = com.tencent.maas.moviecomposing.segments.CaptionSegment.v0(captionSegment, str, D);
                }
                bool.booleanValue();
                bVar3.J(str);
            }
            sw0.b bVar4 = this.f349118q;
            if (bVar4 != null) {
                kotlin.jvm.internal.o.d(str);
                bVar = sw0.b.a(bVar4, null, null, null, str, null, 23, null);
            } else {
                bVar = null;
            }
            this.f349118q = bVar;
            sw0.b bVar5 = this.f431548t;
            if (bVar5 != null) {
                kotlin.jvm.internal.o.d(str);
                bVar2 = sw0.b.a(bVar5, null, null, null, str, null, 23, null);
            } else {
                bVar2 = null;
            }
            this.f431548t = bVar2;
            kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.g1(this, null), 3, null);
        }
    }

    public final gx0.bf L7() {
        return (gx0.bf) ((jz5.n) this.D).getValue();
    }

    public final gx0.kh M7() {
        return (gx0.kh) ((jz5.n) this.C).getValue();
    }

    @Override // uw0.e1, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        super.b7();
        ex0.a0 a0Var = M7().f276642r;
        if (a0Var != null) {
            a0Var.J(cx0.d.f224510f.a(cx0.d.f224509e), null);
        }
    }

    @Override // uw0.e1
    public void x7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
        M7().r7(snapshotDesc, (com.tencent.maas.model.time.MJTime) L7().A.getValue());
    }

    @Override // uw0.e1
    public ex0.b z7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        gx0.kh M7 = M7();
        M7.getClass();
        ex0.a0 a0Var = M7.f276642r;
        if (a0Var == null) {
            return null;
        }
        return ex0.i0.c(a0Var, segmentID);
    }
}
