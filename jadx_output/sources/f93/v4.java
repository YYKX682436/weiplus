package f93;

/* loaded from: classes11.dex */
public final class v4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.b5 f260490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.u4 f260491e;

    public v4(f93.b5 b5Var, f93.u4 u4Var) {
        this.f260490d = b5Var;
        this.f260491e = u4Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int c17;
        f93.u4 u4Var = this.f260491e;
        if (editable == null) {
            android.widget.ImageView imageView = u4Var.f260480b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("mDeleteBtn");
                throw null;
            }
        }
        java.lang.String obj = editable.toString();
        android.widget.ImageView imageView2 = u4Var.f260480b;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("mDeleteBtn");
            throw null;
        }
        imageView2.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(obj) ? 8 : 0);
        u4Var.a().removeTextChangedListener(this);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(obj);
        f93.b5 b5Var = this.f260490d;
        if (!K0) {
            int f17 = com.tencent.mm.ui.tools.v4.f(obj);
            com.tencent.mm.ui.tools.v4.d(b5Var.E, obj);
            int i17 = b5Var.E;
            if (f17 > i17 && (c17 = com.tencent.mm.ui.tools.v4.c(i17, obj)) > 0 && c17 < i17 && c17 < obj.length()) {
                java.lang.String substring = obj.substring(0, c17 + 1);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                u4Var.a().setText(substring);
                u4Var.a().setSelection(u4Var.a().getText().length());
                com.tencent.mm.ui.jk.f209011a.a();
                android.content.Context context = u4Var.a().getContext();
                android.content.Context context2 = u4Var.a().getContext();
                dp.a.makeText(context, context2 != null ? context2.getString(com.tencent.mm.R.string.g9t, java.lang.Integer.valueOf(i17 / 2)) : null, 0).show();
            }
        }
        int i18 = f93.b5.I;
        b5Var.getClass();
        u4Var.a().addTextChangedListener(this);
        u4Var.a().setSelection(u4Var.a().getText().length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        f93.a5 a5Var = this.f260490d.G;
        if (a5Var == null) {
            kotlin.jvm.internal.o.o("textListener");
            throw null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(charSequence);
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = ((f93.x) a5Var).f260499a;
        contactEditLabel.f143195h = valueOf;
        contactEditLabel.enableOptionMenu(!com.tencent.mm.sdk.platformtools.t8.K0(valueOf));
    }
}
