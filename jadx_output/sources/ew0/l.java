package ew0;

/* loaded from: classes5.dex */
public abstract class l extends ov0.c {

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f257025t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f257026u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f257027v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.segments.NarrationSegment f257028w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.segments.CaptionItem f257029x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.u3 f257030y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f257025t = jz5.h.b(new ew0.b(this));
        this.f257026u = jz5.h.b(new ew0.g(this));
        this.f257027v = jz5.h.b(new ew0.k(this));
        this.f257030y = com.tencent.mm.ui.widget.dialog.u3.c(getContext(), j65.q.b(getContext(), com.tencent.mm.R.string.lli), false, 0, null);
    }

    public void A7(ew0.a panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        u7().f457652p.observe(W6(), new ew0.c(panel, this));
        u7().f457654r.observe(W6(), new ew0.d(panel, this));
        u7().f457650n.observe(W6(), new ew0.f(panel, this));
    }

    public abstract du0.o B7();

    public cw0.l0 C7() {
        return null;
    }

    public abstract gx0.hf D7();

    public void E7(ex0.q narrationVM, com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment) {
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
        kotlin.jvm.internal.o.g(narrationSegment, "narrationSegment");
    }

    public void F7(java.lang.String text) {
        com.tencent.maas.base.MJID mjid;
        com.tencent.maas.moviecomposing.segments.CaptionItem captionItem;
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = this.f257028w;
        if (narrationSegment == null || (mjid = narrationSegment.f48532a) == null || (captionItem = this.f257029x) == null) {
            return;
        }
        com.tencent.maas.moviecomposing.segments.CaptionItem captionItem2 = new com.tencent.maas.moviecomposing.segments.CaptionItem(text, captionItem.getTimeRange());
        ex0.q z76 = z7(mjid);
        if (z76 == null) {
            return;
        }
        java.util.List V0 = kz5.n0.V0(z76.I());
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((com.tencent.maas.moviecomposing.segments.CaptionItem) it.next()).getTimeRange(), captionItem.getTimeRange())) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 != -1) {
            arrayList.remove(i17);
        }
        arrayList.add(captionItem2);
        z76.N(V0);
        this.f257029x = captionItem2;
        sw0.b bVar = this.f349118q;
        this.f349118q = bVar != null ? sw0.b.a(bVar, text, null, null, null, null, 30, null) : null;
    }

    @Override // vw0.d0
    public void K3(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        u7().v(data);
    }

    @Override // vw0.d0
    public void L6(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        u7().u(data);
    }

    @Override // vw0.d0
    public void P5(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new ew0.a(getActivity());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0077  */
    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r13) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ew0.l.a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel):void");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment;
        if (!kotlin.jvm.internal.o.b(this.f349117p, this.f349118q) && (narrationSegment = this.f257028w) != null) {
            java.lang.String string = j65.q.a(getContext()).getString(com.tencent.mm.R.string.f492510lm4);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            x7(narrationSegment, string);
        }
        sw0.b bVar = this.f349118q;
        java.lang.String str = bVar != null ? bVar.f413414a : null;
        sw0.b bVar2 = this.f349117p;
        boolean z17 = !kotlin.jvm.internal.o.b(str, bVar2 != null ? bVar2.f413414a : null);
        ew0.a aVar = (ew0.a) this.f69240i;
        if (aVar != null) {
            aVar.setResult(java.lang.Boolean.valueOf(z17));
        }
        u7().t();
        this.f349117p = null;
        this.f349118q = null;
        this.f257028w = null;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        zw0.d dVar;
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f257027v).getValue();
        ew0.a aVar = (ew0.a) this.f69240i;
        if (aVar == null || (dVar = aVar.getPanelLevel()) == null) {
            dVar = zw0.d.f476561f;
        }
        gx0.hf.b7(hfVar, dVar, null, 2, null);
    }

    @Override // vw0.d0
    public void l5() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new ew0.j(this, null), 3, null);
    }

    @Override // ov0.i0
    public java.lang.String m7() {
        java.lang.String string = j65.q.a(getContext()).getString(com.tencent.mm.R.string.f492561lx0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        u7().s();
    }

    @Override // vw0.d0
    public void p0() {
    }

    @Override // ov0.i0
    public void p7(java.lang.CharSequence charSequence) {
        java.lang.String str;
        if (this.f257028w == null) {
            return;
        }
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        F7(str);
        if (str.length() == 0) {
            ew0.a aVar = (ew0.a) this.f69240i;
            if (aVar != null) {
                aVar.J();
                return;
            }
            return;
        }
        ew0.a aVar2 = (ew0.a) this.f69240i;
        if (aVar2 != null) {
            aVar2.Q();
        }
    }

    @Override // ov0.c
    public ug.m t7() {
        return ug.m.Narration;
    }

    @Override // vw0.d0
    public void w1() {
        sw0.e eVar = (sw0.e) u7().f457650n.getValue();
        if (eVar == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
        if (dVar == null) {
            return;
        }
        xw0.r u76 = u7();
        sw0.b bVar = this.f349118q;
        u76.l(dVar, bVar != null ? bVar.f413416c : null, true);
    }

    public void x7(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(narrationSegment, "narrationSegment");
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
    }

    public com.tencent.maas.model.time.MJTime y7() {
        return null;
    }

    public ex0.q z7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return null;
    }
}
