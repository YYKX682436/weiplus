package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wt extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f120233h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.e f120234i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(android.content.Context context, yz5.a onClickReplayCancelCallback) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onClickReplayCancelCallback, "onClickReplayCancelCallback");
        this.f120233h = onClickReplayCancelCallback;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.e8f;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelTipWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayCancelTipWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.e eVar = this.f120234i;
        if (eVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = eVar.f261992b.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.tencent.mars.xlog.Log.i("FinderLiveReplayCancelTipWidget", "click cancel btn");
            com.tencent.mm.plugin.finder.assist.s3.f102523a.a(ml2.t1.f327989t3, null);
            a();
            this.f120233h.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelTipWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.uys;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.uys);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.uyx;
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) x4.b.a(rootView, com.tencent.mm.R.id.uyx);
            if (mMNeat7extView != null) {
                i17 = com.tencent.mm.R.id.uyy;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.uyy);
                if (frameLayout != null) {
                    i17 = com.tencent.mm.R.id.uyz;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.uyz);
                    if (textView2 != null) {
                        this.f120234i = new fg2.e((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, mMNeat7extView, frameLayout, textView2);
                        textView.setOnClickListener(this);
                        fg2.e eVar = this.f120234i;
                        if (eVar == null) {
                            kotlin.jvm.internal.o.o("uiBinding");
                            throw null;
                        }
                        com.tencent.mm.ui.widget.MMNeat7extView replayCancelTipDesc = eVar.f261993c;
                        kotlin.jvm.internal.o.f(replayCancelTipDesc, "replayCancelTipDesc");
                        java.lang.CharSequence a17 = replayCancelTipDesc.a();
                        if (a17 == null) {
                            a17 = "";
                        }
                        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(this.f118381d, a17));
                        f0Var.c(new com.tencent.mm.plugin.finder.live.widget.vt(this), java.lang.Math.max(0, a17.length() - 4), a17.length(), 33);
                        replayCancelTipDesc.b(f0Var);
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        com.tencent.mm.plugin.finder.assist.s3.f102523a.b(ml2.u1.f328070o3);
        super.w();
    }
}
