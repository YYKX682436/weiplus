package fg2;

/* loaded from: classes3.dex */
public final class q implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f262247a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f262248b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f262249c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMEditText f262250d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f262251e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMEditText f262252f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f262253g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f262254h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f262255i;

    public q(android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.LinearLayout linearLayout2, android.widget.TextView textView2, com.tencent.mm.ui.widget.MMEditText mMEditText, android.view.View view, com.tencent.mm.ui.widget.MMEditText mMEditText2, android.widget.FrameLayout frameLayout, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5) {
        this.f262247a = linearLayout;
        this.f262248b = textView;
        this.f262249c = textView2;
        this.f262250d = mMEditText;
        this.f262251e = view;
        this.f262252f = mMEditText2;
        this.f262253g = textView3;
        this.f262254h = textView4;
        this.f262255i = textView5;
    }

    public static fg2.q a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488881aq1, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.f485563i46;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f485563i46);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.i47;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.i47);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.u_s;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.u_s);
                if (textView2 != null) {
                    i17 = com.tencent.mm.R.id.i48;
                    com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) x4.b.a(inflate, com.tencent.mm.R.id.i48);
                    if (mMEditText != null) {
                        i17 = com.tencent.mm.R.id.u_t;
                        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.u_t);
                        if (a17 != null) {
                            i17 = com.tencent.mm.R.id.u_u;
                            com.tencent.mm.ui.widget.MMEditText mMEditText2 = (com.tencent.mm.ui.widget.MMEditText) x4.b.a(inflate, com.tencent.mm.R.id.u_u);
                            if (mMEditText2 != null) {
                                i17 = com.tencent.mm.R.id.i49;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.i49);
                                if (frameLayout != null) {
                                    i17 = com.tencent.mm.R.id.i4_;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.i4_);
                                    if (textView3 != null) {
                                        i17 = com.tencent.mm.R.id.u_v;
                                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.u_v);
                                        if (textView4 != null) {
                                            i17 = com.tencent.mm.R.id.i4c;
                                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.i4c);
                                            if (textView5 != null) {
                                                return new fg2.q((android.widget.LinearLayout) inflate, textView, linearLayout, textView2, mMEditText, a17, mMEditText2, frameLayout, textView3, textView4, textView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262247a;
    }
}
