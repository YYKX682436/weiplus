package pi2;

/* loaded from: classes3.dex */
public final class n extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final com.tencent.mm.plugin.finder.live.plugin.l I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.a f354795J;
    public oi2.a K;
    public final jz5.g L;
    public android.widget.CheckBox M;
    public android.widget.TextView N;
    public android.view.View P;
    public r45.kf5 Q;
    public fg2.u0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, gk2.e buContext, com.tencent.mm.plugin.finder.live.plugin.l basePlugin, yz5.a back) {
        super(context, false, null, 0.0f, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        kotlin.jvm.internal.o.g(back, "back");
        this.H = buContext;
        this.I = basePlugin;
        this.f354795J = back;
        this.L = jz5.h.b(new pi2.l(context, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.drw;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View E(zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f118183e).inflate(com.tencent.mm.R.layout.drw, (android.view.ViewGroup) z(), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.rc6;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rc6);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.f483782rg0;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.f483782rg0);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.f483783rg1;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f483783rg1);
                if (textView2 != null) {
                    i17 = com.tencent.mm.R.id.c8g;
                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.c8g);
                    if (textView3 != null) {
                        i17 = com.tencent.mm.R.id.f483866ca1;
                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f483866ca1);
                        if (textView4 != null) {
                            i17 = com.tencent.mm.R.id.ci6;
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.ci6);
                            if (relativeLayout != null) {
                                i17 = com.tencent.mm.R.id.rjw;
                                android.widget.Button button = (android.widget.Button) x4.b.a(rootView, com.tencent.mm.R.id.rjw);
                                if (button != null) {
                                    i17 = com.tencent.mm.R.id.enc;
                                    android.widget.CheckBox checkBox = (android.widget.CheckBox) x4.b.a(rootView, com.tencent.mm.R.id.enc);
                                    if (checkBox != null) {
                                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.ene);
                                        if (linearLayout2 != null) {
                                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.enf);
                                            if (textView5 != null) {
                                                int i18 = com.tencent.mm.R.id.gyq;
                                                android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.gyq);
                                                if (relativeLayout2 != null) {
                                                    i18 = com.tencent.mm.R.id.gz9;
                                                    android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.gz9);
                                                    if (textView6 != null) {
                                                        i18 = com.tencent.mm.R.id.f485535i05;
                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f485535i05);
                                                        if (weImageView != null) {
                                                            i18 = com.tencent.mm.R.id.imn;
                                                            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.tencent.mm.R.id.imn);
                                                            if (progressBar != null) {
                                                                i18 = com.tencent.mm.R.id.s2_;
                                                                android.widget.Button button2 = (android.widget.Button) x4.b.a(rootView, com.tencent.mm.R.id.s2_);
                                                                if (button2 != null) {
                                                                    i18 = com.tencent.mm.R.id.s2l;
                                                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.s2l);
                                                                    if (linearLayout3 != null) {
                                                                        i18 = com.tencent.mm.R.id.pkg;
                                                                        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.pkg);
                                                                        if (linearLayout4 != null) {
                                                                            this.R = new fg2.u0((android.widget.FrameLayout) rootView, textView, linearLayout, textView2, textView3, textView4, relativeLayout, button, checkBox, linearLayout2, textView5, relativeLayout2, textView6, weImageView, progressBar, button2, linearLayout3, linearLayout4);
                                                                            button.setOnClickListener(this);
                                                                            fg2.u0 u0Var = this.R;
                                                                            if (u0Var == null) {
                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var.f262353k.setOnClickListener(this);
                                                                            fg2.u0 u0Var2 = this.R;
                                                                            if (u0Var2 == null) {
                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var2.f262354l.setOnClickListener(this);
                                                                            fg2.u0 u0Var3 = this.R;
                                                                            if (u0Var3 == null) {
                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var3.f262351i.setOnClickListener(this);
                                                                            fg2.u0 u0Var4 = this.R;
                                                                            if (u0Var4 == null) {
                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var4.f262347e.setOnClickListener(this);
                                                                            fg2.u0 u0Var5 = this.R;
                                                                            if (u0Var5 == null) {
                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var5.f262346d.setOnClickListener(this);
                                                                            fg2.u0 u0Var6 = this.R;
                                                                            if (u0Var6 == null) {
                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            android.widget.TextView applyPrice = u0Var6.f262344b;
                                                                            kotlin.jvm.internal.o.f(applyPrice, "applyPrice");
                                                                            com.tencent.mm.ui.fk.a(applyPrice);
                                                                            android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.enc);
                                                                            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                                                                            this.M = (android.widget.CheckBox) findViewById;
                                                                            android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.enf);
                                                                            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                                                                            this.N = (android.widget.TextView) findViewById2;
                                                                            android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.ene);
                                                                            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                                                                            this.P = findViewById3;
                                                                            android.widget.TextView textView7 = this.N;
                                                                            if (textView7 == null) {
                                                                                kotlin.jvm.internal.o.o("lisenceTv");
                                                                                throw null;
                                                                            }
                                                                            com.tencent.mm.ui.fk.a(textView7);
                                                                            android.view.View view = this.P;
                                                                            if (view == null) {
                                                                                kotlin.jvm.internal.o.o("lisenceContainer");
                                                                                throw null;
                                                                            }
                                                                            view.setOnClickListener(new pi2.d(this));
                                                                            android.widget.CheckBox checkBox2 = this.M;
                                                                            if (checkBox2 != null) {
                                                                                checkBox2.setOnCheckedChangeListener(new pi2.e(this));
                                                                                return;
                                                                            } else {
                                                                                kotlin.jvm.internal.o.o("lisenceCheck");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i17 = i18;
                                            } else {
                                                i17 = com.tencent.mm.R.id.enf;
                                            }
                                        } else {
                                            i17 = com.tencent.mm.R.id.ene;
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

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        fg2.u0 u0Var = this.R;
        if (u0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u0Var.f262348f.setVisibility(8);
        fg2.u0 u0Var2 = this.R;
        if (u0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u0Var2.f262352j.setVisibility(0);
        dk2.xf W0 = this.I.W0();
        if (W0 != null) {
            ((dk2.r4) W0).T(java.lang.System.currentTimeMillis(), new pi2.h(this));
        }
        ae2.in inVar = ae2.in.f3688a;
        boolean z18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LIVE_KNOW_LICENSE_PAY_VISITOR_MIC_INT_SYNC, 0) != 1;
        android.content.Context context = this.f118183e;
        if (!z18) {
            fg2.u0 u0Var3 = this.R;
            if (u0Var3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = u0Var3.f262343a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i65.a.b(context, 364);
            }
            fg2.u0 u0Var4 = this.R;
            if (u0Var4 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u0Var4.f262349g.setEnabled(true);
            android.view.View view = this.P;
            if (view == null) {
                kotlin.jvm.internal.o.o("lisenceContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.P;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("lisenceContainer");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.CheckBox checkBox = this.M;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setChecked(false);
        fg2.u0 u0Var5 = this.R;
        if (u0Var5 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u0Var5.f262349g.setEnabled(false);
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.mkm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.mkn, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        spannableString.setSpan(new pi2.m(this), string2.length() - string.length(), string2.length(), 33);
        android.widget.TextView textView = this.N;
        if (textView == null) {
            kotlin.jvm.internal.o.o("lisenceTv");
            throw null;
        }
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        android.widget.TextView textView2 = this.N;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("lisenceTv");
            throw null;
        }
        textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView3 = this.N;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("lisenceTv");
            throw null;
        }
        textView3.setText(spannableString);
        fg2.u0 u0Var6 = this.R;
        if (u0Var6 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = u0Var6.f262343a.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = i65.a.b(context, com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC);
        }
    }

    public final void e0() {
        js4.k kVar;
        dk2.xf W0 = this.I.W0();
        if (W0 != null) {
            android.content.Context context = this.f118183e;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            kVar = dk2.xf.a(W0, (androidx.fragment.app.FragmentActivity) context, 1, 0, new pi2.i(this), 4, null);
        } else {
            kVar = null;
        }
        if (kVar != null) {
            ((ns4.s) kVar).f339648m = new pi2.j(this);
        }
    }

    public final void f0() {
        r45.kf5 kf5Var;
        r45.il4 il4Var = ((mm2.o4) this.H.a(mm2.o4.class)).U;
        if (il4Var == null || (kf5Var = il4Var.f377132g) == null) {
            return;
        }
        this.Q = kf5Var;
        fg2.u0 u0Var = this.R;
        if (u0Var != null) {
            u0Var.f262344b.setText(java.lang.String.valueOf(kf5Var.f378658f));
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.u0 u0Var = this.R;
        if (u0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = u0Var.f262347e.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
            com.tencent.mm.plugin.finder.live.widget.e0.W((pi2.p) ((jz5.n) this.L).getValue(), null, false, 0, 7, null);
        } else {
            fg2.u0 u0Var2 = this.R;
            if (u0Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = u0Var2.f262346d.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", "https://kf.qq.com/touch/product/wechatwallet_app.html?scene_id=kf4");
                j45.l.j(this.f118183e, "webview", ".ui.tools.WebViewUI", intent, null);
            } else {
                fg2.u0 u0Var3 = this.R;
                if (u0Var3 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                int id8 = u0Var3.f262349g.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    r45.kf5 kf5Var = this.Q;
                    gk2.e eVar = this.H;
                    r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                    r45.kf5 kf5Var2 = il4Var != null ? il4Var.f377132g : null;
                    if (kf5Var != null && kf5Var2 != null && ((mm2.o4) eVar.a(mm2.o4.class)).B7(kf5Var, kf5Var2)) {
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.mki), 0).show();
                        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                        this.f354795J.invoke();
                        f0();
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    pi2.f fVar = new pi2.f(this);
                    android.view.View view2 = this.P;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("lisenceContainer");
                        throw null;
                    }
                    if (view2.getVisibility() == 8) {
                        fVar.invoke();
                    } else {
                        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new pi2.c(this, fVar, null), 3, null);
                    }
                } else {
                    fg2.u0 u0Var4 = this.R;
                    if (u0Var4 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = u0Var4.f262353k.getId();
                    if (valueOf != null && valueOf.intValue() == id9) {
                        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                        e0();
                    } else {
                        fg2.u0 u0Var5 = this.R;
                        if (u0Var5 == null) {
                            kotlin.jvm.internal.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = u0Var5.f262354l.getId();
                        if (valueOf != null && valueOf.intValue() == id10) {
                            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                            e0();
                        } else {
                            fg2.u0 u0Var6 = this.R;
                            if (u0Var6 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = u0Var6.f262351i.getId();
                            if (valueOf != null && valueOf.intValue() == id11) {
                                com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                            }
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
