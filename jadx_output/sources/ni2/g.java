package ni2;

/* loaded from: classes3.dex */
public final class g extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f337298h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f337299i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f337300m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f337301n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, yz5.a agreeBlock) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(agreeBlock, "agreeBlock");
        this.f337298h = agreeBlock;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488953ds3;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.r4d);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f337299i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.b5d);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f337300m = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.enh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f337301n = textView;
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f337300m;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.f337299i;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("okBtn");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView3);
        android.widget.TextView textView4 = this.f337300m;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        textView4.setOnClickListener(new ni2.a(this));
        android.widget.TextView textView5 = this.f337299i;
        if (textView5 != null) {
            textView5.setOnClickListener(new ni2.b(this));
        } else {
            kotlin.jvm.internal.o.o("okBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        android.widget.TextView textView = this.f337301n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("lisenceTv");
            throw null;
        }
        java.lang.String string = textView.getContext().getResources().getString(com.tencent.mm.R.string.mkl);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = textView.getContext().getResources().getString(com.tencent.mm.R.string.mkm);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string.concat(string2));
        spannableString.setSpan(new ni2.f(this), string.length(), string.length() + string2.length(), 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }
}
