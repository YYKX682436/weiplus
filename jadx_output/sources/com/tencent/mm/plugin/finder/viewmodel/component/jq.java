package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jq extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.hk2 f134877d;

    /* renamed from: e, reason: collision with root package name */
    public so2.u0 f134878e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ka f134879f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.aq f134880g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.gi f134881h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f134882i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f134883m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134882i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.dq(this));
    }

    public final java.lang.Integer O6() {
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        if (finderHomeTabFragment != null) {
            return java.lang.Integer.valueOf(finderHomeTabFragment.f129265p);
        }
        return null;
    }

    public final void P6() {
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null) {
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var = (com.tencent.mm.plugin.finder.viewmodel.component.d1) a17;
            com.tencent.mm.plugin.finder.convert.qg qgVar = d1Var.f134062i;
            if (qgVar == null) {
                com.tencent.mars.xlog.Log.w("FinderNegativeFeedBackUIC", "hideFeedBackBubble but fullMergedHeaderConvert is null!");
                return;
            }
            in5.s0 s0Var = d1Var.f134063m;
            if (s0Var == null) {
                com.tencent.mars.xlog.Log.w("FinderNegativeFeedBackUIC", "hideFeedBackBubble but holder is null!");
                return;
            }
            com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView finderHomeTabFeedBackBubbleView = qgVar.f104389q;
            if (finderHomeTabFeedBackBubbleView != null) {
                finderHomeTabFeedBackBubbleView.a("bubble_hide");
            }
            qgVar.r(s0Var, true, true);
        }
    }

    public final void Q6() {
        com.tencent.mm.plugin.finder.view.FinderLoadBar finderLoadBar;
        com.tencent.mm.plugin.finder.viewmodel.component.gi giVar = this.f134881h;
        android.view.View a17 = giVar != null ? com.tencent.mm.plugin.finder.viewmodel.component.bl.M.a(giVar) : null;
        if (a17 != null) {
            a17.setTouchDelegate(null);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.gi giVar2 = this.f134881h;
        if (giVar2 == null || (finderLoadBar = giVar2.f134534k) == null) {
            return;
        }
        finderLoadBar.setOnClickListener(null);
    }

    public final void R6(java.lang.String str) {
        Q6();
        P6();
        androidx.fragment.app.Fragment fragment = getFragment();
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        java.lang.Integer O6 = O6();
        if (finderHomeTabFragment != null && O6 != null) {
            int intValue = O6.intValue();
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.gi X6 = ((com.tencent.mm.plugin.finder.viewmodel.component.bl) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class)).X6(intValue);
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (X6 != null) {
                android.view.View a17 = com.tencent.mm.plugin.finder.viewmodel.component.bl.M.a(X6);
                if (a17 != null) {
                    a17.removeCallbacks(this.f134883m);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(" setTabStatusToNormal fragment=");
                sb6.append(getFragment());
                sb6.append(",tabType=");
                sb6.append(O6());
                sb6.append(",displayStatus=");
                com.tencent.mm.plugin.finder.viewmodel.component.hi hiVar = X6.f134535l;
                sb6.append(hiVar.f134635a);
                com.tencent.mars.xlog.Log.i("FinderNegativeFeedBackUIC", sb6.toString());
                com.tencent.mm.plugin.finder.viewmodel.component.fi fiVar = hiVar.f134635a;
                if (fiVar == com.tencent.mm.plugin.finder.viewmodel.component.fi.f134406e || fiVar == com.tencent.mm.plugin.finder.viewmodel.component.fi.f134407f) {
                    S6(X6, com.tencent.mm.plugin.finder.viewmodel.component.fi.f134405d, new com.tencent.mm.plugin.finder.viewmodel.component.iq(X6, finderHomeTabFragment));
                }
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("FinderNegativeFeedBackUIC", str + " setTabStatusToNormal fragment=" + getFragment() + ",tabType=" + O6() + ",finder tab is null!");
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderNegativeFeedBackUIC", str + " setTabStatusToNormal fragment=" + getFragment() + ",tabType=" + O6());
        }
    }

    public final void S6(com.tencent.mm.plugin.finder.viewmodel.component.gi giVar, com.tencent.mm.plugin.finder.viewmodel.component.fi fiVar, yz5.a aVar) {
        com.tencent.mm.plugin.finder.view.FinderLoadBar finderLoadBar;
        int ordinal = fiVar.ordinal();
        if (ordinal == 0) {
            com.tencent.mm.plugin.finder.view.FinderLoadBar finderLoadBar2 = giVar.f134534k;
            if (finderLoadBar2 != null) {
                com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar = finderLoadBar2.f131267i;
                if (finderProcessBar != null) {
                    finderProcessBar.e();
                }
                finderLoadBar2.removeAllViews();
                finderLoadBar2.requestLayout();
                finderLoadBar2.invalidate();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hide cur status=");
                sb6.append(finderLoadBar2.f131268m);
                sb6.append(" processBar(");
                com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar2 = finderLoadBar2.f131267i;
                sb6.append(finderProcessBar2 != null ? finderProcessBar2.hashCode() : 0);
                sb6.append("),parent:");
                com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar3 = finderLoadBar2.f131267i;
                android.view.ViewParent parent = finderProcessBar3 != null ? finderProcessBar3.getParent() : null;
                sb6.append(parent != null ? parent.hashCode() : 0);
                sb6.append("; icon(");
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderLoadBar2.f131266h;
                sb6.append(weImageView != null ? weImageView.hashCode() : 0);
                sb6.append("),parent:");
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = finderLoadBar2.f131266h;
                android.view.ViewParent parent2 = weImageView2 != null ? weImageView2.getParent() : null;
                sb6.append(parent2 != null ? parent2.hashCode() : 0);
                finderLoadBar2.b(sb6.toString());
                finderLoadBar2.f131268m = com.tencent.mm.plugin.finder.view.ee.f132000d;
            }
        } else if (ordinal == 1) {
            com.tencent.mm.plugin.finder.view.FinderLoadBar finderLoadBar3 = giVar.f134534k;
            if (finderLoadBar3 != null) {
                finderLoadBar3.setVisibility(0);
            }
            com.tencent.mm.plugin.finder.view.FinderLoadBar finderLoadBar4 = giVar.f134534k;
            if (finderLoadBar4 != null) {
                com.tencent.mm.plugin.finder.view.FinderLoadBar.a(finderLoadBar4, false, null, null, 7, null);
            }
        } else if (ordinal == 2 && (finderLoadBar = giVar.f134534k) != null) {
            com.tencent.mm.plugin.finder.view.FinderLoadBar.c(finderLoadBar, null, null, 3, null);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.hi hiVar = giVar.f134535l;
        hiVar.getClass();
        hiVar.f134635a = fiVar;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        androidx.recyclerview.widget.RecyclerView S6;
        r45.hk2 hk2Var = new r45.hk2();
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_NEGATIVE_FEED_BACK_CONF_STRING_SYNC, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            hk2Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init FinderNegativeFeedbackConfig=");
            java.lang.Object obj = (r45.dt4) hk2Var.getCustom(0);
            if (obj == null) {
                obj = "";
            }
            sb6.append(pm0.b0.g(obj));
            com.tencent.mars.xlog.Log.i("FinderNegativeFeedBackUIC", sb6.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderNegativeFeedBackUIC", e17, "", new java.lang.Object[0]);
        }
        this.f134877d = hk2Var;
        androidx.fragment.app.Fragment fragment = getFragment();
        r45.hk2 hk2Var2 = this.f134877d;
        r45.dt4 dt4Var = hk2Var2 != null ? (r45.dt4) hk2Var2.getCustom(0) : null;
        if (fragment != null && dt4Var != null && (S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.t80) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)).S6()) != null) {
            so2.u0 u0Var = this.f134878e;
            if (u0Var == null) {
                u0Var = new so2.u0("FinderNegativeFeedBackUIC", new so2.r0(0L, 0, dt4Var.getInteger(1), 0, false, false, 59, null));
            }
            this.f134878e = u0Var;
            u0Var.a(S6, true, so2.u0.f410617l);
            so2.u0 u0Var2 = this.f134878e;
            if (u0Var2 != null) {
                u0Var2.f410627i = new com.tencent.mm.plugin.finder.viewmodel.component.fq(this);
            }
        }
        if (this.f134879f == null) {
            com.tencent.mm.plugin.finder.viewmodel.component.bq bqVar = new com.tencent.mm.plugin.finder.viewmodel.component.bq(this);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o.add(bqVar);
            this.f134879f = bqVar;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        androidx.recyclerview.widget.RecyclerView S6;
        so2.u0 u0Var;
        androidx.recyclerview.widget.w2 w2Var;
        super.onStop();
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null && (S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.t80) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)).S6()) != null && (u0Var = this.f134878e) != null && (w2Var = u0Var.f410626h) != null) {
            S6.V0(w2Var);
        }
        so2.u0 u0Var2 = this.f134878e;
        if (u0Var2 != null) {
            u0Var2.f410627i = null;
        }
        R6("onStop");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134882i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.dq(this));
    }
}
