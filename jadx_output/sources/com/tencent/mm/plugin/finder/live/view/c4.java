package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class c4 extends com.tencent.mm.plugin.finder.live.widget.e0 implements com.tencent.mm.ui.tools.c5 {
    public android.view.View H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f116225J;
    public com.tencent.mm.ui.widget.MMEditText K;
    public android.widget.TextView L;
    public int M;
    public com.tencent.mm.ui.tools.f5 N;
    public yz5.q P;
    public yz5.l Q;
    public android.view.View R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.M = 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.aq7;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        android.text.TextPaint paint;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.H = rootView.findViewById(com.tencent.mm.R.id.f484943g10);
        this.I = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.eco);
        this.f116225J = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.odf);
        this.R = rootView.findViewById(com.tencent.mm.R.id.ljs);
        android.widget.TextView textView = this.f116225J;
        if (textView != null) {
            dq4.c.f242369a.f(textView);
        }
        android.widget.TextView textView2 = this.I;
        if (textView2 != null) {
            dq4.c.f242369a.f(textView2);
        }
        android.view.View view = this.H;
        if (view != null) {
            dq4.c.f242369a.f(view);
        }
        android.widget.TextView textView3 = this.f116225J;
        if (textView3 != null && (paint = textView3.getPaint()) != null) {
            com.tencent.mm.ui.bk.r0(paint, 0.8f);
        }
        this.K = (com.tencent.mm.ui.widget.MMEditText) rootView.findViewById(com.tencent.mm.R.id.ecr);
        this.L = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.ecs);
        android.view.View view2 = this.H;
        if (view2 != null) {
            view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.z3(this));
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.K;
        if (mMEditText != null) {
            mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.live.view.a4(this));
        }
        g0();
        e0();
        android.content.Context context = this.f118183e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((com.tencent.mm.ui.MMActivity) context);
        this.N = f5Var;
        f5Var.f210400e = this;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
    }

    public final void e0() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.K;
        java.lang.String valueOf = java.lang.String.valueOf(mMEditText != null ? mMEditText.getText() : null);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(valueOf);
        android.content.Context context = this.f118183e;
        if (K0) {
            android.widget.TextView textView = this.I;
            if (textView != null) {
                textView.setOnClickListener(null);
            }
            android.widget.TextView textView2 = this.I;
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_4));
            }
            android.widget.TextView textView3 = this.I;
            if (textView3 != null) {
                textView3.setBackgroundResource(com.tencent.mm.R.drawable.a7o);
                return;
            }
            return;
        }
        android.widget.TextView textView4 = this.I;
        if (textView4 != null) {
            textView4.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.y3(this, valueOf));
        }
        android.widget.TextView textView5 = this.I;
        if (textView5 != null) {
            textView5.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
        android.widget.TextView textView6 = this.I;
        if (textView6 != null) {
            textView6.setBackgroundResource(com.tencent.mm.R.drawable.a7j);
        }
    }

    public final void f0() {
        com.tencent.mm.ui.tools.f5 f5Var = this.N;
        if (f5Var != null) {
            f5Var.d();
        }
        java.lang.Object systemService = this.f118183e.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.K;
        if (mMEditText != null) {
            inputMethodManager.hideSoftInputFromWindow(mMEditText.getWindowToken(), 0);
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r26.i0.y("", "https", true) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0() {
        /*
            r7 = this;
            android.widget.TextView r0 = r7.L
            android.content.Context r1 = r7.f118183e
            if (r0 == 0) goto L14
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131099999(0x7f06015f, float:1.7812367E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
        L14:
            android.widget.TextView r0 = r7.L
            r2 = 0
            if (r0 == 0) goto L1c
            r0.setOnClickListener(r2)
        L1c:
            java.lang.String r0 = ""
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r4 = 4
            if (r3 != 0) goto L8d
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r5 = 0
            if (r3 != 0) goto L3e
            java.lang.String r3 = "http"
            r6 = 1
            boolean r3 = r26.i0.y(r0, r3, r6)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "https"
            boolean r3 = r26.i0.y(r0, r3, r6)
            if (r3 == 0) goto L3e
            goto L3f
        L3e:
            r6 = r5
        L3f:
            if (r6 != 0) goto L42
            goto L8d
        L42:
            com.tencent.mm.ui.widget.MMEditText r3 = r7.K
            if (r3 == 0) goto L4b
            android.text.Editable r3 = r3.getText()
            goto L4c
        L4b:
            r3 = r2
        L4c:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            boolean r3 = kotlin.jvm.internal.o.b(r3, r0)
            if (r3 == 0) goto L66
            android.widget.TextView r0 = r7.L
            if (r0 != 0) goto L5b
            goto L5e
        L5b:
            r0.setVisibility(r4)
        L5e:
            android.widget.TextView r0 = r7.L
            if (r0 == 0) goto L9c
            r0.setOnClickListener(r2)
            goto L9c
        L66:
            android.widget.TextView r2 = r7.L
            if (r2 != 0) goto L6b
            goto L6e
        L6b:
            r2.setVisibility(r5)
        L6e:
            android.widget.TextView r2 = r7.L
            if (r2 == 0) goto L80
            r3 = 2131765699(0x7f1029c3, float:1.9162567E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            java.lang.String r1 = r1.getString(r3, r4)
            r2.setText(r1)
        L80:
            android.widget.TextView r1 = r7.L
            if (r1 == 0) goto L9c
            com.tencent.mm.plugin.finder.live.view.b4 r2 = new com.tencent.mm.plugin.finder.live.view.b4
            r2.<init>(r7, r0)
            r1.setOnClickListener(r2)
            goto L9c
        L8d:
            android.widget.TextView r0 = r7.L
            if (r0 != 0) goto L92
            goto L95
        L92:
            r0.setVisibility(r4)
        L95:
            android.widget.TextView r0 = r7.L
            if (r0 == 0) goto L9c
            r0.setOnClickListener(r2)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.c4.g0():void");
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
    }
}
