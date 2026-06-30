package hw0;

/* loaded from: classes5.dex */
public abstract class n extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f285469n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f285470o;

    /* renamed from: p, reason: collision with root package name */
    public kw0.c f285471p;

    /* renamed from: q, reason: collision with root package name */
    public au0.c f285472q;

    /* renamed from: r, reason: collision with root package name */
    public final hw0.m f285473r;

    /* renamed from: s, reason: collision with root package name */
    public final hw0.k f285474s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f285475t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f285469n = jz5.h.b(new hw0.l(this));
        this.f285471p = kw0.c.f312795d;
        this.f285473r = new hw0.m(this);
        this.f285474s = new hw0.k(this);
        this.f285475t = jz5.h.b(new hw0.i(this));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new hw0.g(getActivity());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void Z6(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        hw0.g panel = (hw0.g) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new kw0.d(getString(com.tencent.mm.R.string.lmp), kw0.c.f312796e, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenWhereView(getActivity(), null, 0, 6, null)));
        arrayList.add(new kw0.d(getString(com.tencent.mm.R.string.lmn), kw0.c.f312795d, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.EmotionView(getActivity(), null, 0, 6, null)));
        panel.C(arrayList, this.f285473r, this.f285474s);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        hw0.g panel = (hw0.g) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        this.f285470o = com.tencent.mm.ui.widget.dialog.u3.c(getContext(), j65.q.b(getContext(), com.tencent.mm.R.string.lli), true, 0, null);
        nw0.h k76 = k7();
        kotlinx.coroutines.l.d(k76.f340768b, null, null, new nw0.d(k76, null, null), 3, null);
        m7(panel);
        panel.D(panel.getCurrentPage$plugin_mj_template_release(), false);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        k7().e();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void c7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        hw0.g panel = (hw0.g) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        this.f285470o = null;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void d7() {
        zw0.b entrance;
        hw0.g gVar = (hw0.g) this.f69240i;
        if (gVar != null && (entrance = gVar.getEntrance()) != null) {
            du0.v0 R6 = R6();
            R6.getClass();
            java.lang.String entryType = entrance.f476559d;
            kotlin.jvm.internal.o.g(entryType, "entryType");
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.r1(m7Var, entryType, null), 3, null);
        }
        int ordinal = this.f285471p.ordinal();
        if (ordinal == 0) {
            yy0.m7 m7Var2 = (yy0.m7) R6().O6();
            kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.i3(m7Var2, null), 3, null);
        } else {
            if (ordinal != 1) {
                return;
            }
            yy0.m7 m7Var3 = (yy0.m7) R6().O6();
            kotlinx.coroutines.l.d(m7Var3.Di(), null, null, new yy0.j3(m7Var3, null), 3, null);
        }
    }

    public final nw0.h k7() {
        return (nw0.h) ((jz5.n) this.f285469n).getValue();
    }

    public abstract lw0.l l7();

    public void m7(hw0.g panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        k7().f340771e.observe(W6(), new hw0.j(panel, this));
    }

    public abstract java.lang.Object n7(com.tencent.mm.api.IEmojiInfo iEmojiInfo, com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation);

    public abstract void o7(kw0.a aVar);

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        java.lang.Object obj;
        super.onCleared();
        hw0.g gVar = (hw0.g) this.f69240i;
        if (gVar != null) {
            kw0.c cVar = kw0.c.f312795d;
            java.util.Iterator it = gVar.D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((kw0.d) obj).f312799b == cVar) {
                        break;
                    }
                }
            }
            kw0.d dVar = (kw0.d) obj;
            android.view.View view = dVar != null ? dVar.f312800c : null;
            if (!(view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.EmotionView)) {
                view = null;
            }
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.EmotionView emotionView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.EmotionView) view;
            if (emotionView != null) {
                emotionView.b();
            }
        }
        this.f285470o = null;
        k7().d();
    }

    public final void p7(com.tencent.maas.base.MJID mjID, zw0.b entrance, mv0.c editPurpose) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        kotlin.jvm.internal.o.g(editPurpose, "editPurpose");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7(this, (lw0.l) ((jz5.n) this.f285475t).getValue(), kz5.c1.i(new jz5.l("ket_dest_segment", mjID), new jz5.l("ket_edit_purpose", editPurpose)), entrance, null, null, 24, null);
    }
}
