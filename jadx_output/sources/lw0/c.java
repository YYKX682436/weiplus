package lw0;

/* loaded from: classes5.dex */
public class c extends qv0.f {
    public androidx.viewpager.widget.ViewPager I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f321530J;
    public final lw0.b K;
    public lw0.a L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f321530J = new java.util.ArrayList();
        this.K = new lw0.b(this);
    }

    private final void setStyleDataList(java.util.List<kw0.a> list) {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView L = L();
        if (L != null) {
            L.setStyleDataList(list);
        }
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenPickerView K() {
        java.lang.Object obj;
        mv0.d dVar = mv0.d.f331535d;
        java.util.Iterator it = this.f321530J.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mv0.e) obj).f331539b == dVar) {
                break;
            }
        }
        mv0.e eVar = (mv0.e) obj;
        android.view.View view = eVar != null ? eVar.f331540c : null;
        return (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenPickerView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenPickerView ? view : null);
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView L() {
        java.lang.Object obj;
        mv0.d dVar = mv0.d.f331536e;
        java.util.Iterator it = this.f321530J.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mv0.e) obj).f331539b == dVar) {
                break;
            }
        }
        mv0.e eVar = (mv0.e) obj;
        android.view.View view = eVar != null ? eVar.f331540c : null;
        return (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView ? view : null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        return new ou0.v(false, 1, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dfy, bodyContainerLayout);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.q9c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.I = (androidx.viewpager.widget.ViewPager) findViewById;
    }

    public final com.tencent.maas.base.MJID getDestID$plugin_mj_template_release() {
        return (com.tencent.maas.base.MJID) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(this, "ket_dest_segment", null, 2, null);
    }

    public final mv0.c getEditPurpose$plugin_mj_template_release() {
        mv0.c cVar = (mv0.c) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(this, "ket_edit_purpose", null, 2, null);
        return cVar == null ? mv0.c.f331533e : cVar;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String b17 = j65.q.b(getContext(), com.tencent.mm.R.string.lmm);
        kotlin.jvm.internal.o.f(b17, "safeGetString(...)");
        return b17;
    }

    public final void setSelectedCallback(mw0.h callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView L = L();
        if (L == null) {
            return;
        }
        L.setSelectedStickerStyleCallback(callback);
    }

    public final void setWhenPickerView(android.view.View pickerView) {
        kotlin.jvm.internal.o.g(pickerView, "pickerView");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenPickerView K = K();
        if (K != null) {
            K.setPickerView(pickerView);
        }
    }

    public final void setWhenWhereUiState(kw0.e state) {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView L;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView L2;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView L3;
        kotlin.jvm.internal.o.g(state, "state");
        java.util.List<kw0.a> list = state.f312801a;
        if (list.isEmpty()) {
            return;
        }
        kw0.k kVar = state.f312803c;
        if (kVar instanceof kw0.f) {
            return;
        }
        boolean z17 = kVar instanceof kw0.g;
        int i17 = state.f312802b;
        if (z17) {
            kw0.g gVar = (kw0.g) kVar;
            kw0.a aVar = (kw0.a) kz5.n0.a0(list, gVar.f312805a);
            if (aVar != null && (L3 = L()) != null) {
                iw0.c cVar = L3.f69314e;
                cVar.getClass();
                cVar.x(gVar.f312805a, aVar);
            }
            if (!(kVar instanceof kw0.h) || (L2 = L()) == null) {
                return;
            }
            L2.a(i17);
            return;
        }
        if (!(kVar instanceof kw0.i)) {
            if (!(kVar instanceof kw0.j) || (L = L()) == null) {
                return;
            }
            L.a(i17);
            return;
        }
        setStyleDataList(list);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView L4 = L();
        if (L4 != null) {
            L4.a(i17);
        }
    }

    public final void setWhereText(java.lang.String str) {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenPickerView K = K();
        if (K != null) {
            K.setWhereText(str);
        }
    }
}
