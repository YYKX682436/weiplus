package qx2;

/* loaded from: classes2.dex */
public final class g extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f367332d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f367333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(android.widget.TextView textView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!(str2.length() == 0)) {
            if (!(str3.length() == 0)) {
                int L = r26.n0.L(str, str2, 0, false, 6, null);
                int length = str2.length() + L;
                android.text.SpannableString spannableString = new android.text.SpannableString(str);
                spannableString.setSpan(new qx2.d(str3, this), L, length, 33);
                textView.setHighlightColor(getContext().getResources().getColor(android.R.color.transparent));
                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                textView.setText(spannableString);
                return;
            }
        }
        textView.setText(str);
    }

    public final java.lang.Object b(qx2.a aVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        android.widget.TextView textView;
        android.widget.Button button;
        android.widget.Button button2;
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = nVar;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
        y1Var.f212037s = new qx2.e(h0Var);
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        qx2.f fVar = new qx2.f(h0Var);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.akp, (android.view.ViewGroup) this, false);
        this.f367332d = inflate;
        if (inflate != null && (button2 = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.bfc)) != null) {
            button2.setOnClickListener(new qx2.b(this));
        }
        android.view.View view = this.f367332d;
        if (view != null && (button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.bfd)) != null) {
            button.setOnClickListener(new qx2.c(this, fVar));
        }
        android.view.View view2 = this.f367332d;
        if (view2 != null && (textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.bfi)) != null) {
            a(textView, aVar.f367322a, aVar.f367323b, aVar.f367324c);
        }
        android.view.View view3 = this.f367332d;
        android.widget.LinearLayout linearLayout = view3 != null ? (android.widget.LinearLayout) view3.findViewById(com.tencent.mm.R.id.iix) : null;
        for (qx2.a aVar2 : list) {
            android.widget.TextView textView2 = new android.widget.TextView(getContext());
            textView2.setTextSize(15.0f);
            textView2.setPadding(0, ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 8.0f), 0, 0);
            textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
            a(textView2, aVar2.f367322a, aVar2.f367323b, aVar2.f367324c);
            if (linearLayout != null) {
                linearLayout.addView(textView2);
            }
        }
        y1Var.k(this.f367332d);
        y1Var.s();
        this.f367333e = y1Var;
        java.lang.Object a17 = nVar.a();
        pz5.a aVar3 = pz5.a.f359186d;
        return a17;
    }

    public final android.view.View getRoot() {
        return this.f367332d;
    }

    public final void setRoot(android.view.View view) {
        this.f367332d = view;
    }
}
