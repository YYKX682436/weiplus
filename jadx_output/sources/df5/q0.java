package df5;

/* loaded from: classes11.dex */
public final class q0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public v11.e0 f232188d;

    /* renamed from: e, reason: collision with root package name */
    public df5.d1 f232189e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f232190f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f232191g;

    /* renamed from: h, reason: collision with root package name */
    public long f232192h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f232193i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f232194m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context context, v11.e0 renderConfig) {
        super(context, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(renderConfig, "renderConfig");
        this.f232188d = renderConfig;
        df5.d1 d1Var = new df5.d1(context, renderConfig);
        this.f232189e = d1Var;
        this.f232190f = "";
        d1Var.f232074c = this.f232191g;
        setOrientation(1);
    }

    public static android.widget.TextView e(df5.q0 q0Var, java.lang.CharSequence charSequence, v11.j0 j0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        q0Var.getClass();
        android.widget.TextView textView = new android.widget.TextView(q0Var.getContext());
        q0Var.a(textView, charSequence, j0Var, z17);
        jf5.k0.c(textView, df5.p0.f232184d);
        return textView;
    }

    public final void a(android.widget.TextView textView, java.lang.CharSequence charSequence, v11.j0 j0Var, boolean z17) {
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(z17 ? -1 : -2, -2));
        textView.setGravity(8388659);
        textView.setText(charSequence);
        textView.setTextSize(1, j0Var.f432416a);
        textView.setTextColor(j0Var.f432417b);
        if (j0Var.f432418c) {
            textView.setTypeface(textView.getTypeface(), 1);
        }
        if (j0Var.f432419d) {
            textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        }
        textView.setLineSpacing(0.0f, j0Var.f432420e);
        int i17 = j0Var.f432421f;
        int i18 = j0Var.f432422g;
        textView.setPadding(i17, i18, i17, i18);
        if (j0Var.f432423h) {
            com.tencent.mm.pluginsdk.ui.span.y0 y0Var = new com.tencent.mm.pluginsdk.ui.span.y0(getContext());
            y0Var.f191313s = false;
            textView.setOnTouchListener(y0Var);
            textView.setClickable(false);
            textView.setLongClickable(false);
        }
        java.lang.Integer num = j0Var.f432424i;
        if (num != null) {
            textView.setHighlightColor(num.intValue());
        }
    }

    public final android.view.View b() {
        android.view.View view = new android.view.View(getContext());
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, this.f232188d.f432374m.f432375a));
        return view;
    }

    public final android.widget.TextView c(java.lang.CharSequence charSequence, v11.j0 j0Var, boolean z17) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        df5.k1 k1Var = new df5.k1(context, this.f232188d.f432368g);
        a(k1Var, charSequence, j0Var, z17);
        jf5.k0.c(k1Var, df5.n0.f232180d);
        return k1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View d(df5.j0 j0Var) {
        int i17;
        df5.j1 j1Var;
        if (j0Var instanceof df5.i0) {
            return c(this.f232189e.h(((df5.i0) j0Var).f232132a), this.f232188d.f432364c.f432394a, this.f232193i);
        }
        if (j0Var instanceof df5.d0) {
            v11.k kVar = ((df5.d0) j0Var).f232070a;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            df5.b0 b0Var = new df5.b0(context, this.f232188d);
            b0Var.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            b0Var.setOnInteractionConsumed(this.f232191g);
            b0Var.b(kVar, this.f232190f, this.f232192h);
            j1Var = b0Var;
        } else {
            if (!(j0Var instanceof df5.h0)) {
                if (!(j0Var instanceof df5.g0)) {
                    if (j0Var instanceof df5.f0) {
                        android.content.Context context2 = getContext();
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        return new df5.c0(context2, this.f232188d);
                    }
                    if (!(j0Var instanceof df5.e0)) {
                        throw new jz5.j();
                    }
                    v11.l lVar = ((df5.e0) j0Var).f232081a;
                    v11.e0 e0Var = this.f232188d;
                    v11.z zVar = e0Var.f432366e;
                    v11.j0 j0Var2 = e0Var.f432364c.f432394a;
                    float f17 = zVar.f432498h;
                    if (f17 <= 0.0f) {
                        f17 = j0Var2.f432420e;
                    }
                    v11.j0 a17 = v11.j0.a(j0Var2, 0.0f, 0, false, false, f17, 0, 0, false, null, com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX, null);
                    df5.d1 d1Var = this.f232189e;
                    java.util.List list = lVar.f432435b;
                    int i18 = lVar.f432434a;
                    android.widget.TextView c17 = c(d1Var.f(list, i18, lVar.f432436c), a17, this.f232193i);
                    int b17 = zVar.b(i18);
                    if (b17 <= 0) {
                        return c17;
                    }
                    c17.setPadding(c17.getPaddingLeft(), c17.getPaddingTop() + b17, c17.getPaddingRight(), c17.getPaddingBottom());
                    return c17;
                }
                v11.o oVar = ((df5.g0) j0Var).f232108a;
                java.lang.String str = oVar.f432451a;
                java.lang.String obj = str.toString();
                v11.s sVar = oVar.f432452b;
                v11.s sVar2 = null;
                if (sVar != null) {
                    int i19 = sVar.f432458a;
                    if (!(i19 >= 0 && sVar.f432459b >= i19 && (i17 = sVar.f432460c) >= 0 && sVar.f432461d >= i17)) {
                        sVar = null;
                    }
                    if (sVar != null) {
                        java.lang.String str2 = this.f232190f;
                        int i27 = sVar.f432460c;
                        int b18 = jf5.k0.b(str2, i27);
                        int i28 = sVar.f432461d;
                        int b19 = jf5.k0.b(str2, i28);
                        if (b19 < b18) {
                            b19 = b18;
                        }
                        java.lang.String substring = str2.substring(b18, b19);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        int L = r26.n0.L(substring, obj, 0, false, 6, null);
                        if (L >= 0) {
                            int codePointCount = substring.codePointCount(0, L) + i27;
                            sVar2 = new v11.s(codePointCount, obj.codePointCount(0, obj.length()) + codePointCount, i27, i28);
                        }
                    }
                }
                if (sVar2 != null) {
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new jf5.k(sVar2), 0, spannableStringBuilder.length(), 33);
                    str = spannableStringBuilder;
                }
                android.widget.TextView e17 = e(this, str, this.f232188d.f432370i.f432354a, false, 4, null);
                jf5.k0.c(e17, df5.o0.f232183d);
                return e17;
            }
            v11.q qVar = ((df5.h0) j0Var).f232118a;
            android.content.Context context3 = getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            df5.j1 j1Var2 = new df5.j1(context3, this.f232188d);
            j1Var2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            j1Var2.setOnInteractionConsumed(this.f232191g);
            j1Var2.j(qVar, this.f232190f, this.f232192h);
            j1Var = j1Var2;
        }
        return j1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0bb9  */
    /* JADX WARN: Type inference failed for: r0v138, types: [df5.j1] */
    /* JADX WARN: Type inference failed for: r0v142, types: [df5.j1] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v27, types: [df5.e0] */
    /* JADX WARN: Type inference failed for: r13v28, types: [df5.f0] */
    /* JADX WARN: Type inference failed for: r13v29, types: [df5.g0] */
    /* JADX WARN: Type inference failed for: r13v30, types: [df5.h0] */
    /* JADX WARN: Type inference failed for: r13v33, types: [df5.d0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final df5.p1 f(v11.t r51, java.util.Map r52, java.lang.Boolean r53) {
        /*
            Method dump skipped, instructions count: 3441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df5.q0.f(v11.t, java.util.Map, java.lang.Boolean):df5.p1");
    }

    public final void g() {
        android.view.View childAt = getChildAt(getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null && layoutParams2.height == this.f232188d.f432374m.f432375a) {
            removeView(childAt);
        }
    }

    public final yz5.a getOnInteractionConsumed() {
        return this.f232191g;
    }

    public final void h(int i17, df5.j0 j0Var) {
        android.view.View childAt = getChildAt(i17);
        if (childAt == null) {
            return;
        }
        if (j0Var instanceof df5.i0) {
            android.widget.TextView textView = childAt instanceof android.widget.TextView ? (android.widget.TextView) childAt : null;
            if (textView == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected TextView at %d, got %s", java.lang.Integer.valueOf(i17), kotlin.jvm.internal.i0.a(childAt.getClass()).g());
                return;
            }
            java.lang.CharSequence h17 = this.f232189e.h(((df5.i0) j0Var).f232132a);
            textView.setText(h17);
            ((android.text.SpannableStringBuilder) h17).length();
            return;
        }
        if (j0Var instanceof df5.d0) {
            df5.b0 b0Var = childAt instanceof df5.b0 ? (df5.b0) childAt : null;
            if (b0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected CodeBlockView at %d, got %s", java.lang.Integer.valueOf(i17), kotlin.jvm.internal.i0.a(childAt.getClass()).g());
                return;
            }
            df5.d0 d0Var = (df5.d0) j0Var;
            b0Var.b(d0Var.f232070a, this.f232190f, this.f232192h);
            v11.k kVar = d0Var.f232070a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: CodeBlock submitCodeBlock, lang=%s, contentLen=%d", kVar.f432425a, java.lang.Integer.valueOf(kVar.f432426b.length()));
            return;
        }
        if (j0Var instanceof df5.h0) {
            df5.j1 j1Var = childAt instanceof df5.j1 ? (df5.j1) childAt : null;
            if (j1Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected TableView at %d, got %s", java.lang.Integer.valueOf(i17), kotlin.jvm.internal.i0.a(childAt.getClass()).g());
                return;
            }
            df5.h0 h0Var = (df5.h0) j0Var;
            j1Var.j(h0Var.f232118a, this.f232190f, this.f232192h);
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: TableBlock submitTable, rows=%d, cols=%d", java.lang.Integer.valueOf(h0Var.f232118a.f432455b.size()), java.lang.Integer.valueOf(h0Var.f232118a.f432454a.size()));
            return;
        }
        if (j0Var instanceof df5.g0) {
            android.widget.TextView textView2 = childAt instanceof android.widget.TextView ? (android.widget.TextView) childAt : null;
            if (textView2 != null) {
                textView2.setText(((df5.g0) j0Var).f232108a.f432451a);
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected TextView at %d, got %s", java.lang.Integer.valueOf(i17), kotlin.jvm.internal.i0.a(childAt.getClass()).g());
                return;
            }
        }
        if ((j0Var instanceof df5.f0) || !(j0Var instanceof df5.e0)) {
            return;
        }
        android.widget.TextView textView3 = childAt instanceof android.widget.TextView ? (android.widget.TextView) childAt : null;
        if (textView3 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected TextView at %d, got %s", java.lang.Integer.valueOf(i17), kotlin.jvm.internal.i0.a(childAt.getClass()).g());
            return;
        }
        df5.d1 d1Var = this.f232189e;
        df5.e0 e0Var = (df5.e0) j0Var;
        v11.l lVar = e0Var.f232081a;
        textView3.setText(d1Var.f(lVar.f432435b, lVar.f432434a, lVar.f432436c));
        int i18 = e0Var.f232081a.f432434a;
    }

    public final void setOnInteractionConsumed(yz5.a aVar) {
        this.f232191g = aVar;
        this.f232189e.f232074c = aVar;
    }
}
