package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class uv extends com.tencent.mm.plugin.finder.live.widget.b1 implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f120006i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.q1 f120007m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f120008n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(android.content.Context context, yz5.l onClickAcceptCallback) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onClickAcceptCallback, "onClickAcceptCallback");
        this.f120006i = onClickAcceptCallback;
    }

    public final void A(java.lang.String curMicTopicText, boolean z17) {
        kotlin.jvm.internal.o.g(curMicTopicText, "curMicTopicText");
        this.f120008n = z17;
        w();
        wd2.g gVar = this.f118384g;
        com.tencent.mm.ui.fk.b(gVar.f444844k);
        com.tencent.mm.ui.fk.b(gVar.f444843j);
        fg2.q1 q1Var = this.f120007m;
        if (q1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        q1Var.f262268e.setText(curMicTopicText);
        fg2.q1 q1Var2 = this.f120007m;
        if (q1Var2 != null) {
            q1Var2.f262268e.setSelection(curMicTopicText.length());
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return h();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.graphics.drawable.Drawable i() {
        return this.f118381d.getDrawable(com.tencent.mm.R.drawable.a0m);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.ebp;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.ozs);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveSetMicTopicWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveSetMicTopicWidget", sb6.toString());
        fg2.q1 q1Var = this.f120007m;
        if (q1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(view, q1Var.f262265b)) {
            fg2.q1 q1Var2 = this.f120007m;
            if (q1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.text.Editable text = q1Var2.f262268e.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            this.f120006i.invoke(str);
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveSetMicTopicWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.toj;
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) x4.b.a(rootView, com.tencent.mm.R.id.toj);
        if (weButton != null) {
            i17 = com.tencent.mm.R.id.tok;
            com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = (com.tencent.mm.ui.widget.RoundCornerFrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.tok);
            if (roundCornerFrameLayout != null) {
                i17 = com.tencent.mm.R.id.tol;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tol);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.tom;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tom);
                    if (textView2 != null) {
                        i17 = com.tencent.mm.R.id.ton;
                        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) x4.b.a(rootView, com.tencent.mm.R.id.ton);
                        if (mMEditText != null) {
                            this.f120007m = new fg2.q1((androidx.constraintlayout.widget.ConstraintLayout) rootView, weButton, roundCornerFrameLayout, textView, textView2, mMEditText);
                            weButton.setOnClickListener(this);
                            fg2.q1 q1Var = this.f120007m;
                            if (q1Var == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            q1Var.f262268e.addTextChangedListener(new com.tencent.mm.plugin.finder.live.widget.tv(this));
                            return;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.b1
    public android.widget.EditText y() {
        fg2.q1 q1Var = this.f120007m;
        if (q1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.ui.widget.MMEditText finderLiveSetMicTopicText = q1Var.f262268e;
        kotlin.jvm.internal.o.f(finderLiveSetMicTopicText, "finderLiveSetMicTopicText");
        return finderLiveSetMicTopicText;
    }
}
