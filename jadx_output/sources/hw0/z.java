package hw0;

/* loaded from: classes5.dex */
public abstract class z extends ov0.i0 implements mw0.h {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f285493p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f285494q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f285495r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f285496s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f285497t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.maas.base.MJID f285498u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f285499v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f285493p = jz5.h.b(new hw0.t(this));
        this.f285494q = jz5.h.b(new hw0.r(this));
        this.f285495r = jz5.h.b(new hw0.x(this));
        this.f285496s = jz5.h.b(new hw0.q(this));
        this.f285497t = jz5.h.b(new hw0.w(this));
    }

    public abstract du0.o A7();

    public abstract gx0.hf B7();

    @Override // ov0.i0
    /* renamed from: C7, reason: merged with bridge method [inline-methods] */
    public void Z6(hw0.p panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.Z6(panel);
        panel.setSelectedCallback(this);
        android.view.View stylePageView = panel.getStylePageView();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView replaceStyleView = stylePageView instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView ? (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView) stylePageView : null;
        if (replaceStyleView == null) {
            return;
        }
        replaceStyleView.setGetPanelDiffHeight(new hw0.o(panel));
    }

    public java.lang.Object D7(java.lang.String str, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    public void E7() {
    }

    public void F7() {
    }

    public final void G7() {
        hw0.p pVar = (hw0.p) this.f69240i;
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText = pVar != null ? pVar.getEditText() : null;
        if (editText == null) {
            return;
        }
        editText.setHint(m7());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new hw0.p(getActivity());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        hw0.p panel = (hw0.p) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        w7();
        bu0.a u76 = u7();
        java.lang.String d17 = u76 != null ? u76.d() : null;
        nw0.h v76 = v7();
        kotlinx.coroutines.l.d(v76.f340768b, null, null, new nw0.b(v76, d17, null), 3, null);
        panel.f285477y1 = false;
        x7(panel);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        mv0.c cVar;
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText;
        hw0.p pVar = (hw0.p) this.f69240i;
        if (pVar == null || (cVar = pVar.getEditPurpose$plugin_mj_template_release()) == null) {
            cVar = mv0.c.f331533e;
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            E7();
        } else if (ordinal == 1) {
            F7();
        }
        t7();
        v7().e();
        du0.v0 R6 = R6();
        hw0.p pVar2 = (hw0.p) this.f69240i;
        R6.U6(java.lang.String.valueOf((pVar2 == null || (editText = pVar2.getEditText()) == null) ? null : editText.getText()));
    }

    @Override // mw0.h
    public void e3(kw0.a stickerData) {
        kotlin.jvm.internal.o.g(stickerData, "stickerData");
        nw0.h v76 = v7();
        v76.getClass();
        kotlinx.coroutines.l.d(v76.f340768b, null, null, new nw0.e(stickerData, v76, kw0.b.f312791e, null), 3, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        zw0.d dVar;
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f285493p).getValue();
        hw0.p pVar = (hw0.p) this.f69240i;
        if (pVar == null || (dVar = pVar.getPanelLevel()) == null) {
            dVar = zw0.d.f476561f;
        }
        gx0.hf.b7(hfVar, dVar, null, 2, null);
    }

    @Override // ov0.i0
    public sw0.c l7(ov0.e page) {
        kotlin.jvm.internal.o.g(page, "page");
        int ordinal = page.ordinal();
        if (ordinal == 0) {
            return new sw0.c(getString(com.tencent.mm.R.string.lkj), ov0.e.f349125e, new vw0.j(getActivity()));
        }
        if (ordinal == 1) {
            return new sw0.c(getString(com.tencent.mm.R.string.lkk), ov0.e.f349126f, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView(getActivity(), null, 0, 6, null));
        }
        throw new jz5.j();
    }

    @Override // ov0.i0
    public java.lang.String m7() {
        java.lang.String a17;
        bu0.a u76 = u7();
        if (u76 != null && (a17 = u76.a()) != null) {
            return a17;
        }
        java.lang.String string = j65.q.a(getContext()).getString(com.tencent.mm.R.string.ln_);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        v7().d();
    }

    @Override // ov0.i0
    public void p7(java.lang.CharSequence charSequence) {
        java.lang.String str;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        com.tencent.maas.base.MJID mjid = this.f285498u;
        if (mjid != null) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new hw0.y(this, str, mjid, null), 3, null);
        }
        if (str.length() == 0) {
            hw0.p pVar = (hw0.p) this.f69240i;
            if (pVar != null) {
                pVar.J();
                return;
            }
            return;
        }
        hw0.p pVar2 = (hw0.p) this.f69240i;
        if (pVar2 != null) {
            pVar2.Q();
        }
    }

    public abstract void s7();

    public void t7() {
    }

    public bu0.a u7() {
        return null;
    }

    public final nw0.h v7() {
        return (nw0.h) ((jz5.n) this.f285497t).getValue();
    }

    public void w7() {
        q7("");
    }

    public void x7(hw0.p panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        v7().f340772f.observe(W6(), new hw0.s(panel, this));
    }

    public abstract ow0.a0 y7();

    public abstract gx0.w z7();
}
