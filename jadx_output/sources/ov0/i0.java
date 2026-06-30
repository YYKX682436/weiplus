package ov0;

/* loaded from: classes5.dex */
public abstract class i0 extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {

    /* renamed from: n, reason: collision with root package name */
    public final ov0.u f349135n;

    /* renamed from: o, reason: collision with root package name */
    public final ov0.h0 f349136o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f349135n = new ov0.u(this);
        this.f349136o = new ov0.h0(this);
    }

    public void k7() {
    }

    public abstract sw0.c l7(ov0.e eVar);

    public abstract java.lang.String m7();

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /* renamed from: n7, reason: merged with bridge method [inline-methods] */
    public void Z6(ov0.t panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        panel.setKeyBoardStatusListener(this.f349135n);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cgz);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(ov0.a0.f349113d);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        int i17 = 0;
        while (i17 < 2) {
            ov0.e.f349124d.getClass();
            arrayList.add(l7(i17 == 0 ? ov0.e.f349125e : ov0.e.f349126f));
            i17++;
        }
        panel.K(arrayList, this.f349136o);
        panel.getEditText().setHint(m7());
        panel.getDeleteBtn().setOnClickListener(new ov0.b0(this, panel));
        panel.getSecondDeleteBtn().setOnClickListener(new ov0.c0(this, panel));
        panel.getDoneBtn().setOnClickListener(new ov0.d0(this));
        panel.getEditText().addTextChangedListener(new ov0.v(panel, this));
        panel.getEditText().setOnFocusChangeListener(new ov0.e0(panel));
        panel.getSecondEditText().addTextChangedListener(new ov0.w(panel, this));
        panel.getSecondEditText().setOnFocusChangeListener(new ov0.f0(panel));
        panel.getEditText().setOnTouchListener(ov0.g0.f349131d);
        panel.getSecondEditText().setOnTouchListener(ov0.x.f349158d);
        panel.getEditText().setOnClickListener(new ov0.y(this));
        panel.getSecondEditText().setOnClickListener(new ov0.z(this));
    }

    public void o7(java.lang.CharSequence charSequence) {
    }

    public abstract void p7(java.lang.CharSequence charSequence);

    public final void q7(java.lang.String text) {
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText;
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText2;
        kotlin.jvm.internal.o.g(text, "text");
        ov0.t tVar = (ov0.t) this.f69240i;
        if (tVar != null && (editText2 = tVar.getEditText()) != null) {
            editText2.setText(text);
        }
        ov0.t tVar2 = (ov0.t) this.f69240i;
        if (tVar2 == null || (editText = tVar2.getEditText()) == null) {
            return;
        }
        editText.setSelection(text.length());
    }

    public final void r7(java.lang.String text) {
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText secondEditText;
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText secondEditText2;
        kotlin.jvm.internal.o.g(text, "text");
        ov0.t tVar = (ov0.t) this.f69240i;
        if (tVar != null && (secondEditText2 = tVar.getSecondEditText()) != null) {
            secondEditText2.setText(text);
        }
        ov0.t tVar2 = (ov0.t) this.f69240i;
        if (tVar2 == null || (secondEditText = tVar2.getSecondEditText()) == null) {
            return;
        }
        secondEditText.setSelection(text.length());
    }
}
