package uw0;

/* loaded from: classes5.dex */
public abstract class e1 extends ov0.c {
    public boolean A;
    public final com.tencent.mm.ui.widget.dialog.u3 B;

    /* renamed from: t, reason: collision with root package name */
    public sw0.b f431548t;

    /* renamed from: u, reason: collision with root package name */
    public sw0.b f431549u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f431550v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f431551w;

    /* renamed from: x, reason: collision with root package name */
    public ex0.b f431552x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f431553y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f431554z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f431550v = jz5.h.b(new uw0.d1(this));
        this.f431551w = jz5.h.b(new uw0.c1(this));
        this.f431553y = "";
        this.B = com.tencent.mm.ui.widget.dialog.u3.c(getContext(), j65.q.b(getContext(), com.tencent.mm.R.string.lli), false, 0, null);
    }

    public kotlinx.coroutines.r2 A7() {
        return null;
    }

    public com.tencent.maas.model.time.MJTime B7() {
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        return ZeroTime;
    }

    public com.tencent.maas.model.time.MJTime C7() {
        return null;
    }

    public final sw0.b D7(ex0.b bVar, com.tencent.maas.moviecomposing.segments.CaptionItem captionItem) {
        java.lang.String text = captionItem.getText();
        java.lang.String str = text == null ? "" : text;
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = bVar.f257117p;
        captionSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
        java.lang.String K0 = D != null ? com.tencent.maas.moviecomposing.segments.CaptionSegment.K0(captionSegment, D) : "";
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment2 = bVar.f257117p;
        captionSegment2.getClass();
        com.tencent.maas.moviecomposing.Timeline D2 = captionSegment2.D();
        java.lang.String M0 = D2 != null ? com.tencent.maas.moviecomposing.segments.CaptionSegment.M0(captionSegment2, D2) : "";
        captionSegment2.getClass();
        com.tencent.maas.moviecomposing.Timeline D3 = captionSegment2.D();
        return new sw0.b(str, K0, M0, D3 != null ? com.tencent.maas.moviecomposing.segments.CaptionSegment.L0(captionSegment2, D3) : "", bVar.f257130f.g0());
    }

    public abstract ow0.a0 E7();

    public abstract gx0.hf F7();

    public void G7(java.lang.String text) {
        ex0.b z76;
        java.lang.String E;
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.maas.base.MJID y76 = y7();
        if (y76 == null || (z76 = z7(y76)) == null || (E = z76.E()) == null) {
            return;
        }
        java.lang.String obj = r26.n0.u0(text).toString();
        if (kotlin.jvm.internal.o.b(obj, "")) {
            obj = " ";
        }
        z76.L(obj, E, B7());
        sw0.b bVar = this.f431548t;
        this.f431548t = bVar != null ? sw0.b.a(bVar, text, null, null, null, null, 30, null) : null;
    }

    public void H7(sw0.e textStyleState) {
        kotlin.jvm.internal.o.g(textStyleState, "textStyleState");
    }

    public void I7(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.maas.base.MJID y76 = y7();
        if (y76 == null) {
            return;
        }
        ex0.b z76 = z7(y76);
        if (z76 != null) {
            z76.L(text, this.f431553y, B7());
        }
        sw0.b bVar = this.f349118q;
        this.f349118q = bVar != null ? sw0.b.a(bVar, text, null, null, null, null, 30, null) : null;
    }

    public void J7() {
        this.f431554z = false;
    }

    @Override // vw0.d0
    public void K3(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        u7().v(data);
    }

    public void K7(sw0.e textMaterialUiState) {
        kotlin.jvm.internal.o.g(textMaterialUiState, "textMaterialUiState");
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
        return new uw0.u0(getContext());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        java.lang.String str;
        uw0.u0 panel = (uw0.u0) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        com.tencent.maas.base.MJID y76 = y7();
        sw0.b bVar = null;
        ex0.b z76 = y76 != null ? z7(y76) : null;
        if (z76 == null) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(this, false, 1, null);
            return;
        }
        uw0.u0 u0Var = (uw0.u0) this.f69240i;
        java.lang.String str2 = u0Var != null ? (java.lang.String) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(u0Var, "key_caption_language", null, 2, null) : null;
        if (str2 == null) {
            str2 = z76.D();
        }
        this.f431553y = str2;
        java.lang.String E = z76.E();
        com.tencent.maas.model.time.MJTime C7 = C7();
        if (C7 == null) {
            C7 = z76.k();
        }
        com.tencent.maas.moviecomposing.segments.CaptionItem A = z76.A(this.f431553y, C7);
        com.tencent.maas.moviecomposing.segments.CaptionItem A2 = E != null ? z76.A(E, C7) : null;
        if (A == null) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(this, false, 1, null);
            return;
        }
        this.f431552x = z76;
        this.f349117p = D7(z76, A);
        this.f431549u = A2 != null ? D7(z76, A2) : null;
        sw0.b bVar2 = this.f349117p;
        if (bVar2 == null) {
            bVar2 = D7(z76, A);
        }
        this.f349118q = bVar2;
        sw0.b bVar3 = this.f431549u;
        if (bVar3 != null) {
            bVar = bVar3;
        } else if (A2 != null) {
            bVar = D7(z76, A2);
        }
        this.f431548t = bVar;
        java.lang.String text = A.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        q7(text);
        sw0.b bVar4 = this.f431548t;
        if (bVar4 != null && (str = bVar4.f413414a) != null) {
            r7(str);
        }
        panel.setInputMethodChangeCallback(new uw0.a1(this, panel));
        if (!u7().f457642f) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.B;
            if (!u3Var.isShowing()) {
                u3Var.show();
            }
        }
        u7().f457652p.observe(W6(), new uw0.v0(panel, this));
        u7().f457654r.observe(W6(), new uw0.w0(panel, this));
        u7().f457650n.observe(W6(), new uw0.y0(this, panel));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        java.lang.String str;
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText;
        android.text.Editable text;
        if (this.f431552x != null) {
            java.lang.String string = (kotlin.jvm.internal.o.b(this.f349118q, this.f349117p) && kotlin.jvm.internal.o.b(this.f431548t, this.f431549u)) ? null : j65.q.a(getContext()).getString(com.tencent.mm.R.string.m_q);
            if (string != null) {
                x7(string);
            }
        }
        u7().t();
        this.f431552x = null;
        this.f349117p = null;
        this.f431549u = null;
        this.f349118q = null;
        this.f431548t = null;
        du0.v0 R6 = R6();
        uw0.u0 u0Var = (uw0.u0) this.f69240i;
        if (u0Var == null || (editText = u0Var.getEditText()) == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        R6.U6(str);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void d7() {
        if (this.f431554z) {
            J7();
        }
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.y4(m7Var, null), 3, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        zw0.d dVar;
        if (((ow0.a0) ((jz5.n) this.f431550v).getValue()).X6()) {
            return;
        }
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f431551w).getValue();
        uw0.u0 u0Var = (uw0.u0) this.f69240i;
        if (u0Var == null || (dVar = u0Var.getPanelLevel()) == null) {
            dVar = zw0.d.f476561f;
        }
        gx0.hf.b7(hfVar, dVar, null, 2, null);
    }

    @Override // ov0.i0
    public void k7() {
        r7("");
    }

    @Override // vw0.d0
    public void l5() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new uw0.b1(this, null), 3, null);
    }

    @Override // ov0.i0
    public java.lang.String m7() {
        return "";
    }

    @Override // ov0.i0
    public void o7(java.lang.CharSequence charSequence) {
        java.lang.String str;
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText secondEditText;
        if (this.f431552x == null) {
            return;
        }
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        uw0.u0 u0Var = (uw0.u0) this.f69240i;
        if ((u0Var == null || (secondEditText = u0Var.getSecondEditText()) == null || !secondEditText.isFocused()) ? false : true) {
            if (str.length() > 0) {
                uw0.u0 u0Var2 = (uw0.u0) this.f69240i;
                if (u0Var2 != null) {
                    u0Var2.getSecondDeleteBtn().setVisibility(0);
                }
                G7(str);
            }
        }
        uw0.u0 u0Var3 = (uw0.u0) this.f69240i;
        if (u0Var3 != null) {
            u0Var3.getSecondDeleteBtn().setVisibility(8);
        }
        G7(str);
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
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText;
        if (this.f431552x == null) {
            return;
        }
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        uw0.u0 u0Var = (uw0.u0) this.f69240i;
        if ((u0Var == null || (editText = u0Var.getEditText()) == null || !editText.isFocused()) ? false : true) {
            if (str.length() > 0) {
                uw0.u0 u0Var2 = (uw0.u0) this.f69240i;
                if (u0Var2 != null) {
                    u0Var2.Q();
                }
                I7(str);
            }
        }
        uw0.u0 u0Var3 = (uw0.u0) this.f69240i;
        if (u0Var3 != null) {
            u0Var3.J();
        }
        I7(str);
    }

    @Override // ov0.c, vw0.d0
    public void s(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f413423b != zu0.i.f475678h) {
            super.s(data);
            return;
        }
        android.app.Activity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = j65.q.a(getContext()).getString(com.tencent.mm.R.string.mbr);
        e4Var.c();
    }

    @Override // ov0.c
    public ug.m t7() {
        return ug.m.Caption;
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

    public void x7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
    }

    public final com.tencent.maas.base.MJID y7() {
        uw0.u0 u0Var = (uw0.u0) this.f69240i;
        if (u0Var != null) {
            return (com.tencent.maas.base.MJID) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(u0Var, "key_caption_segment_id", null, 2, null);
        }
        return null;
    }

    public ex0.b z7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return null;
    }
}
