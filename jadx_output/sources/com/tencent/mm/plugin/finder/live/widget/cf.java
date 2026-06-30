package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class cf extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final android.app.Activity H;
    public final gk2.e I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.p f118003J;
    public android.view.View K;
    public android.view.View L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public android.widget.EditText Q;
    public android.widget.TextView R;
    public android.view.View S;
    public boolean T;
    public java.lang.String U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(android.app.Activity activity, gk2.e eVar) {
        super(activity, false, null, 0.0f, 12, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.H = activity;
        this.I = eVar;
        this.U = "";
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.aqa;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View root) {
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(root, "root");
        this.K = root;
        this.L = root.findViewById(com.tencent.mm.R.id.cgs);
        this.M = root.findViewById(com.tencent.mm.R.id.dqn);
        this.N = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.dso);
        this.P = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.dsl);
        this.Q = (android.widget.EditText) root.findViewById(com.tencent.mm.R.id.k3n);
        this.R = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.c_x);
        this.S = root.findViewById(com.tencent.mm.R.id.jpu);
        zl2.r4.f473950a.Z2(this.Q, null, 6, 3, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new com.tencent.mm.plugin.finder.live.widget.xe(this));
        android.widget.EditText editText = this.Q;
        if (editText != null) {
            editText.setOnFocusChangeListener(new com.tencent.mm.plugin.finder.live.widget.ye(this, editText));
        }
        android.view.View view = this.M;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ze(this));
        }
        android.widget.TextView textView = this.R;
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.af(this));
        }
        android.widget.TextView textView2 = this.N;
        if (textView2 != null) {
            com.tencent.mm.ui.bk.q0(textView2.getPaint());
        }
        android.widget.EditText editText2 = this.Q;
        if (editText2 != null) {
            com.tencent.mm.ui.bk.q0(editText2.getPaint());
        }
        android.widget.TextView textView3 = this.R;
        if (textView3 != null) {
            com.tencent.mm.ui.bk.q0(textView3.getPaint());
        }
        android.widget.EditText editText3 = this.Q;
        java.lang.String valueOf = java.lang.String.valueOf(editText3 != null ? editText3.getHint() : null);
        this.U = valueOf;
        g0(!(valueOf.length() == 0));
        android.widget.TextView textView4 = this.P;
        if (textView4 != null) {
            java.lang.CharSequence text = textView4.getText();
            android.content.Context context = this.f118183e;
            java.lang.String string = context.getString(com.tencent.mm.R.string.dde);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            kotlin.jvm.internal.o.d(text);
            int L = r26.n0.L(text, string, 0, false, 6, null);
            int length = string.length() + L;
            com.tencent.mm.plugin.finder.live.widget.bf bfVar = new com.tencent.mm.plugin.finder.live.widget.bf(this);
            android.text.SpannableString spannableString = new android.text.SpannableString(text);
            spannableString.setSpan(bfVar, L, length, 33);
            textView4.setText(spannableString);
            textView4.setHighlightColor(context.getResources().getColor(com.tencent.mm.R.color.a9e));
            textView4.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        if (this.H.getResources().getConfiguration().orientation == 2) {
            android.view.View view2 = this.S;
            layoutParams = view2 != null ? view2.getLayoutParams() : null;
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            return;
        }
        android.widget.TextView textView5 = this.R;
        layoutParams = textView5 != null ? textView5.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += com.tencent.mm.ui.dl.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public final void e0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        android.content.Context context;
        android.widget.EditText editText = this.Q;
        if (editText != null) {
            editText.clearFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
        if (this.T) {
            gk2.e eVar = this.I;
            if (eVar != null && (liveMutableData = ((mm2.s2) eVar.a(mm2.s2.class)).f329404f) != null) {
                liveMutableData.postValue(new mm2.q2(true, 0, 2, null));
            }
            this.T = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r1.a8() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            com.tencent.mm.plugin.finder.live.widget.e0.W(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "2"
            dk2.ef r1 = dk2.ef.f233372a
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r1.i(r2)
            mm2.c1 r1 = (mm2.c1) r1
            if (r1 == 0) goto L1f
            boolean r1 = r1.a8()
            r2 = 1
            if (r1 != r2) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            r1 = 0
            java.lang.Class<ml2.j0> r3 = ml2.j0.class
            if (r2 == 0) goto L31
            i95.m r2 = i95.n0.c(r3)
            ml2.j0 r2 = (ml2.j0) r2
            ml2.z4 r3 = ml2.z4.Q
            r2.yj(r3, r0, r1)
            goto L3e
        L31:
            i95.m r2 = i95.n0.c(r3)
            ml2.j0 r2 = (ml2.j0) r2
            ml2.c1 r3 = ml2.c1.f327325e
            r3 = 27
            r2.hj(r3, r0, r1)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.cf.f0():void");
    }

    public final void g0(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveFansBuildWidget", "updateConfirmBtn canConfirm:" + z17);
        android.widget.TextView textView = this.R;
        if (textView == null) {
            return;
        }
        textView.setEnabled(z17);
    }
}
