package ni2;

/* loaded from: classes10.dex */
public final class f1 extends com.tencent.mm.plugin.finder.live.widget.b1 {

    /* renamed from: i, reason: collision with root package name */
    public final gk2.e f337291i;

    /* renamed from: m, reason: collision with root package name */
    public final lj2.x0 f337292m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f337293n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f337294o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f337295p;

    /* renamed from: q, reason: collision with root package name */
    public xh2.a f337296q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context, gk2.e buContext, lj2.x0 server) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(server, "server");
        this.f337291i = buContext;
        this.f337292m = server;
        this.f337295p = "";
        ni2.z0 z0Var = new ni2.z0();
        ni2.e1 e1Var = new ni2.e1();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f337293n;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        mMEditText.setFilters(new android.text.InputFilter[]{z0Var, e1Var});
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f337293n;
        if (mMEditText2 != null) {
            mMEditText2.addTextChangedListener(new ni2.y0(this));
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }

    public final void A(java.lang.String str) {
        if (str.length() <= 0 || kotlin.jvm.internal.o.b(this.f337295p, str)) {
            android.widget.Button button = this.f337294o;
            if (button != null) {
                button.setEnabled(false);
                return;
            } else {
                kotlin.jvm.internal.o.o("confirmBtn");
                throw null;
            }
        }
        android.widget.Button button2 = this.f337294o;
        if (button2 != null) {
            button2.setEnabled(true);
        } else {
            kotlin.jvm.internal.o.o("confirmBtn");
            throw null;
        }
    }

    public final void B(xh2.a aVar, java.lang.String tagText) {
        kotlin.jvm.internal.o.g(tagText, "tagText");
        w();
        this.f337296q = aVar;
        this.f337295p = tagText;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f337293n;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        mMEditText.setText(tagText);
        A(tagText);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return h();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dkq;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.jz6);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.d6q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f337293n = (com.tencent.mm.ui.widget.MMEditText) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.c9z);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById2;
        this.f337294o = button;
        button.setOnClickListener(new ni2.d1(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.b1, com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f337293n;
        if (mMEditText != null) {
            mMEditText.setText("");
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.b1
    public android.widget.EditText y() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f337293n;
        if (mMEditText != null) {
            return mMEditText;
        }
        kotlin.jvm.internal.o.o("editText");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.b1
    public void z() {
        super.z();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f337293n;
        if (mMEditText != null) {
            mMEditText.setSelection(this.f337295p.length());
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }
}
