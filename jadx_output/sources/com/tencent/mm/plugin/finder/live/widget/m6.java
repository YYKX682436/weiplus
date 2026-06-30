package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class m6 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final int f119043h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f119044i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.a f119045m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.v94 f119046n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(android.content.Context context, int i17, r45.v94 v94Var, yz5.l onSetAnchorLiveReplayCallBack) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onSetAnchorLiveReplayCallBack, "onSetAnchorLiveReplayCallBack");
        this.f119043h = i17;
        this.f119044i = onSetAnchorLiveReplayCallBack;
        r45.v94 v94Var2 = new r45.v94();
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingWidget", "Initializing with old settings: " + v94Var);
        if (v94Var != null) {
            v94Var2.set(0, java.lang.Boolean.valueOf(v94Var.getBoolean(0)));
            v94Var2.set(2, java.lang.Boolean.valueOf(v94Var.getBoolean(2)));
            v94Var2.set(3, java.lang.Boolean.valueOf(v94Var.getBoolean(3)));
            if (v94Var2.getBoolean(3)) {
                v94Var2.set(1, java.lang.Boolean.valueOf(v94Var.getBoolean(1)));
            } else {
                v94Var2.set(1, java.lang.Boolean.FALSE);
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingWidget", "No old settings, using defaults");
        }
        this.f119046n = v94Var2;
    }

    public static final void y(com.tencent.mm.plugin.finder.live.widget.m6 m6Var) {
        fg2.a aVar = m6Var.f119045m;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        r45.v94 v94Var = m6Var.f119046n;
        aVar.f261932g.setVisibility((v94Var.getBoolean(0) && v94Var.getBoolean(3)) ? 0 : 8);
        fg2.a aVar2 = m6Var.f119045m;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        aVar2.f261931f.setVisibility(v94Var.getBoolean(0) ? 0 : 8);
        fg2.a aVar3 = m6Var.f119045m;
        if (aVar3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        aVar3.f261933h.setCheck(v94Var.getBoolean(0));
        fg2.a aVar4 = m6Var.f119045m;
        if (aVar4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        aVar4.f261934i.setCheck(v94Var.getBoolean(2));
        fg2.a aVar5 = m6Var.f119045m;
        if (aVar5 != null) {
            aVar5.f261935j.setCheck(v94Var.getBoolean(1));
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.e8b;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorLiveReplaySettingWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.a aVar = this.f119045m;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = aVar.f261927b.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingWidget", "click back btn");
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorLiveReplaySettingWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.sd9;
        android.view.View a17 = x4.b.a(rootView, com.tencent.mm.R.id.sd9);
        if (a17 != null) {
            i17 = com.tencent.mm.R.id.sd_;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.sd_);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.sda;
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) x4.b.a(rootView, com.tencent.mm.R.id.sda);
                if (mMNeat7extView != null) {
                    i17 = com.tencent.mm.R.id.sdb;
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.sdb);
                    if (constraintLayout != null) {
                        i17 = com.tencent.mm.R.id.sdc;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.sdc);
                        if (linearLayout2 != null) {
                            i17 = com.tencent.mm.R.id.sdd;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.sdd);
                            if (textView != null) {
                                i17 = com.tencent.mm.R.id.f483308sg2;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f483308sg2);
                                if (textView2 != null) {
                                    i17 = com.tencent.mm.R.id.f483311sg5;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f483311sg5);
                                    if (textView3 != null) {
                                        i17 = com.tencent.mm.R.id.t5y;
                                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.t5y);
                                        if (textView4 != null) {
                                            i17 = com.tencent.mm.R.id.u4x;
                                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.u4x);
                                            if (textView5 != null) {
                                                i17 = com.tencent.mm.R.id.f485496u94;
                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.f485496u94);
                                                if (constraintLayout2 != null) {
                                                    i17 = com.tencent.mm.R.id.u99;
                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.u99);
                                                    if (constraintLayout3 != null) {
                                                        i17 = com.tencent.mm.R.id.u9h;
                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.u9h);
                                                        if (constraintLayout4 != null) {
                                                            i17 = com.tencent.mm.R.id.vbj;
                                                            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(rootView, com.tencent.mm.R.id.vbj);
                                                            if (mMSwitchBtn != null) {
                                                                i17 = com.tencent.mm.R.id.vbk;
                                                                com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(rootView, com.tencent.mm.R.id.vbk);
                                                                if (mMSwitchBtn2 != null) {
                                                                    i17 = com.tencent.mm.R.id.vbl;
                                                                    com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(rootView, com.tencent.mm.R.id.vbl);
                                                                    if (mMSwitchBtn3 != null) {
                                                                        this.f119045m = new fg2.a((androidx.constraintlayout.widget.ConstraintLayout) rootView, a17, linearLayout, mMNeat7extView, constraintLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, constraintLayout2, constraintLayout3, constraintLayout4, mMSwitchBtn, mMSwitchBtn2, mMSwitchBtn3);
                                                                        a17.setOnClickListener(this);
                                                                        fg2.a aVar = this.f119045m;
                                                                        if (aVar == null) {
                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                            throw null;
                                                                        }
                                                                        com.tencent.mm.ui.widget.MMNeat7extView anchorLiveReplaySettingGenTipsText = aVar.f261929d;
                                                                        kotlin.jvm.internal.o.f(anchorLiveReplaySettingGenTipsText, "anchorLiveReplaySettingGenTipsText");
                                                                        java.lang.CharSequence a18 = anchorLiveReplaySettingGenTipsText.a();
                                                                        if (a18 == null) {
                                                                            a18 = "";
                                                                        }
                                                                        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                                                                        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(this.f118381d, a18));
                                                                        f0Var.c(new com.tencent.mm.plugin.finder.live.widget.l6(this), java.lang.Math.max(0, a18.length() - 4), a18.length(), 33);
                                                                        anchorLiveReplaySettingGenTipsText.b(f0Var);
                                                                        return;
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
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDismiss, final setting:[");
        r45.v94 v94Var = this.f119046n;
        sb6.append(v94Var.getBoolean(0));
        sb6.append(',');
        sb6.append(v94Var.getBoolean(1));
        sb6.append(',');
        sb6.append(v94Var.getBoolean(2));
        sb6.append(',');
        sb6.append(v94Var.getBoolean(3));
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingWidget", sb6.toString());
        this.f119044i.invoke(v94Var);
        super.t();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        if (!this.f119046n.getBoolean(3)) {
            fg2.a aVar = this.f119045m;
            if (aVar == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            aVar.f261932g.setVisibility(8);
        }
        fg2.a aVar2 = this.f119045m;
        if (aVar2 != null) {
            aVar2.f261930e.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.live.widget.k6(this));
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }
}
