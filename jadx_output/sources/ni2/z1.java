package ni2;

/* loaded from: classes3.dex */
public final class z1 extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final qo0.c I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f337520J;
    public fg2.p1 K;
    public r45.kf5 L;
    public int M;
    public boolean N;
    public final jz5.g P;
    public final jz5.g Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context, false, null, 0.0f, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.H = buContext;
        this.I = statusMonitor;
        this.f337520J = basePlugin;
        this.M = 1;
        this.P = jz5.h.b(new ni2.y1(context, this));
        this.Q = jz5.h.b(new ni2.u1(context, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.dsg;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.f483067rc0;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.f483067rc0);
        if (relativeLayout != null) {
            i17 = com.tencent.mm.R.id.f483068rc1;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f483068rc1);
            if (weImageView != null) {
                i17 = com.tencent.mm.R.id.f483250rc4;
                com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.f483250rc4);
                if (roundCornerLinearLayout != null) {
                    i17 = com.tencent.mm.R.id.f483251rc5;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f483251rc5);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.a6v;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.a6v);
                        if (weImageView2 != null) {
                            i17 = com.tencent.mm.R.id.f483289a71;
                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.f483289a71);
                            if (relativeLayout2 != null) {
                                i17 = com.tencent.mm.R.id.rce;
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.rce);
                                if (weImageView3 != null) {
                                    i17 = com.tencent.mm.R.id.rcf;
                                    android.view.View a17 = x4.b.a(rootView, com.tencent.mm.R.id.rcf);
                                    if (a17 != null) {
                                        i17 = com.tencent.mm.R.id.a_n;
                                        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.tencent.mm.R.id.a_n);
                                        if (imageView != null) {
                                            i17 = com.tencent.mm.R.id.ava;
                                            android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.ava);
                                            if (relativeLayout3 != null) {
                                                i17 = com.tencent.mm.R.id.rdv;
                                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rdv);
                                                if (textView2 != null) {
                                                    i17 = com.tencent.mm.R.id.che;
                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.che);
                                                    if (linearLayout != null) {
                                                        i17 = com.tencent.mm.R.id.f484150rj1;
                                                        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.f484150rj1);
                                                        if (roundCornerRelativeLayout != null) {
                                                            i17 = com.tencent.mm.R.id.d98;
                                                            com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) x4.b.a(rootView, com.tencent.mm.R.id.d98);
                                                            if (mMEditText != null) {
                                                                i17 = com.tencent.mm.R.id.rjj;
                                                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rjj);
                                                                if (textView3 != null) {
                                                                    i17 = com.tencent.mm.R.id.rjv;
                                                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.rjv);
                                                                    if (linearLayout2 != null) {
                                                                        i17 = com.tencent.mm.R.id.f6a;
                                                                        android.view.View a18 = x4.b.a(rootView, com.tencent.mm.R.id.f6a);
                                                                        if (a18 != null) {
                                                                            i17 = com.tencent.mm.R.id.f6c;
                                                                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.f6c);
                                                                            if (frameLayout != null) {
                                                                                i17 = com.tencent.mm.R.id.rtk;
                                                                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rtk);
                                                                                if (textView4 != null) {
                                                                                    i17 = com.tencent.mm.R.id.rxe;
                                                                                    android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rxe);
                                                                                    if (textView5 != null) {
                                                                                        i17 = com.tencent.mm.R.id.rxp;
                                                                                        com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout2 = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.rxp);
                                                                                        if (roundCornerLinearLayout2 != null) {
                                                                                            i17 = com.tencent.mm.R.id.ryp;
                                                                                            android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.ryp);
                                                                                            if (textView6 != null) {
                                                                                                i17 = com.tencent.mm.R.id.m3m;
                                                                                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.m3m);
                                                                                                if (weImageView4 != null) {
                                                                                                    i17 = com.tencent.mm.R.id.mce;
                                                                                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.mce);
                                                                                                    if (linearLayout3 != null) {
                                                                                                        i17 = com.tencent.mm.R.id.s5e;
                                                                                                        android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.s5e);
                                                                                                        if (textView7 != null) {
                                                                                                            i17 = com.tencent.mm.R.id.s96;
                                                                                                            android.view.View a19 = x4.b.a(rootView, com.tencent.mm.R.id.s96);
                                                                                                            if (a19 != null) {
                                                                                                                i17 = com.tencent.mm.R.id.f487556oz4;
                                                                                                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f487556oz4);
                                                                                                                if (weImageView5 != null) {
                                                                                                                    i17 = com.tencent.mm.R.id.oz_;
                                                                                                                    android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.oz_);
                                                                                                                    if (relativeLayout4 != null) {
                                                                                                                        i17 = com.tencent.mm.R.id.s_j;
                                                                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.s_j);
                                                                                                                        if (weImageView6 != null) {
                                                                                                                            i17 = com.tencent.mm.R.id.s_k;
                                                                                                                            android.view.View a27 = x4.b.a(rootView, com.tencent.mm.R.id.s_k);
                                                                                                                            if (a27 != null) {
                                                                                                                                this.K = new fg2.p1((android.widget.FrameLayout) rootView, relativeLayout, weImageView, roundCornerLinearLayout, textView, weImageView2, relativeLayout2, weImageView3, a17, imageView, relativeLayout3, textView2, linearLayout, roundCornerRelativeLayout, mMEditText, textView3, linearLayout2, a18, frameLayout, textView4, textView5, roundCornerLinearLayout2, textView6, weImageView4, linearLayout3, textView7, a19, weImageView5, relativeLayout4, weImageView6, a27);
                                                                                                                                com.tencent.mm.ui.fk.a(textView6);
                                                                                                                                fg2.p1 p1Var = this.K;
                                                                                                                                if (p1Var == null) {
                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var.f262233m.addTextChangedListener(new ni2.s1(this));
                                                                                                                                fg2.p1 p1Var2 = this.K;
                                                                                                                                if (p1Var2 == null) {
                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var2.f262237q.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var3 = this.K;
                                                                                                                                if (p1Var3 == null) {
                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var3.f262242v.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var4 = this.K;
                                                                                                                                if (p1Var4 == null) {
                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var4.f262235o.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var5 = this.K;
                                                                                                                                if (p1Var5 == null) {
                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var5.A.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var6 = this.K;
                                                                                                                                if (p1Var6 == null) {
                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var6.f262227g.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var7 = this.K;
                                                                                                                                if (p1Var7 == null) {
                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var7.f262222b.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var8 = this.K;
                                                                                                                                if (p1Var8 != null) {
                                                                                                                                    p1Var8.f262224d.setOnClickListener(this);
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                    throw null;
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

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        if (!this.N) {
            fg2.p1 p1Var = this.K;
            if (p1Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var.f262233m.getText().clear();
        }
        g0();
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.Q).getValue()).d();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        super.U();
        this.I.statusChange(qo0.b.f365360h3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        android.app.Dialog dialog;
        super.V(e0Var, z17, i17);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.B;
        if (y1Var == null || (dialog = y1Var.f212025d) == null) {
            return;
        }
        dialog.setOnKeyListener(new ni2.w1(this));
    }

    public final void e0() {
        r45.kf5 kf5Var;
        gk2.e eVar = this.H;
        if (!((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.o4) eVar.a(mm2.o4.class)).H).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("FinderLiveRequestPayMic", "skip apply mic, disable mic");
            android.content.Context context = this.f118183e;
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.mkj), 0).show();
            return;
        }
        if (f0()) {
            int i17 = this.M != 2 ? 1 : 2;
            fg2.p1 p1Var = this.K;
            if (p1Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            java.lang.String obj = p1Var.f262233m.getEditableText().toString();
            if (obj == null) {
                obj = "";
            }
            boolean z17 = this.M == 3;
            r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
            oi2.a aVar = new oi2.a(i17, obj, z17, (il4Var == null || (kf5Var = il4Var.f377132g) == null) ? 0 : kf5Var.f378658f);
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
            pi2.n nVar = (pi2.n) ((jz5.n) this.P).getValue();
            nVar.getClass();
            nVar.K = aVar;
            com.tencent.mm.plugin.finder.live.widget.e0.W(nVar, null, false, 0, 7, null);
        }
    }

    public final boolean f0() {
        fg2.p1 p1Var = this.K;
        if (p1Var != null) {
            return p1Var.f262233m.getEditableText().toString().length() <= 50;
        }
        kotlin.jvm.internal.o.o("uiBinding");
        throw null;
    }

    public final void g0() {
        fg2.p1 p1Var = this.K;
        if (p1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        p1Var.f262233m.clearFocus();
        java.lang.Object systemService = this.f118183e.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        fg2.p1 p1Var2 = this.K;
        if (p1Var2 != null) {
            inputMethodManager.hideSoftInputFromWindow(p1Var2.f262233m.getWindowToken(), 0);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void h0() {
        fg2.p1 p1Var = this.K;
        if (p1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        p1Var.B.setVisibility(8);
        fg2.p1 p1Var2 = this.K;
        if (p1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        p1Var2.f262228h.setVisibility(0);
        fg2.p1 p1Var3 = this.K;
        if (p1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        p1Var3.f262223c.setVisibility(8);
        this.M = 1;
    }

    public final void i0() {
        r45.kf5 kf5Var;
        gk2.e eVar = this.H;
        double d17 = ((mm2.g5) eVar.a(mm2.g5.class)).f329089f;
        if (d17 <= 0.0d) {
            fg2.p1 p1Var = this.K;
            if (p1Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var.f262234n.setVisibility(0);
            fg2.p1 p1Var2 = this.K;
            if (p1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var2.f262235o.setVisibility(4);
        } else {
            fg2.p1 p1Var3 = this.K;
            if (p1Var3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var3.f262234n.setVisibility(8);
            fg2.p1 p1Var4 = this.K;
            if (p1Var4 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var4.f262235o.setVisibility(0);
        }
        fg2.p1 p1Var5 = this.K;
        if (p1Var5 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        p1Var5.f262244x.setText(java.lang.String.valueOf(d17));
        r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
        if (il4Var != null && (kf5Var = il4Var.f377132g) != null) {
            fg2.p1 p1Var6 = this.K;
            if (p1Var6 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var6.f262239s.setText(this.f118183e.getResources().getString(com.tencent.mm.R.string.mlj, java.lang.Integer.valueOf(kf5Var.f378656d)));
            fg2.p1 p1Var7 = this.K;
            if (p1Var7 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var7.f262225e.setText(java.lang.String.valueOf(kf5Var.f378658f));
        }
        r45.il4 il4Var2 = ((mm2.o4) eVar.a(mm2.o4.class)).U;
        this.L = il4Var2 != null ? il4Var2.f377132g : null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveRequestPayMicPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.p1 p1Var = this.K;
        if (p1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = p1Var.f262237q.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
        } else {
            fg2.p1 p1Var2 = this.K;
            if (p1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = p1Var2.f262242v.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                U();
            } else {
                fg2.p1 p1Var3 = this.K;
                if (p1Var3 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                int id8 = p1Var3.A.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    fg2.p1 p1Var4 = this.K;
                    if (p1Var4 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    p1Var4.B.setVisibility(0);
                    fg2.p1 p1Var5 = this.K;
                    if (p1Var5 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    p1Var5.f262228h.setVisibility(8);
                    fg2.p1 p1Var6 = this.K;
                    if (p1Var6 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    p1Var6.f262223c.setVisibility(8);
                    this.M = 2;
                } else {
                    fg2.p1 p1Var7 = this.K;
                    if (p1Var7 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = p1Var7.f262227g.getId();
                    if (valueOf != null && valueOf.intValue() == id9) {
                        h0();
                    } else {
                        fg2.p1 p1Var8 = this.K;
                        if (p1Var8 == null) {
                            kotlin.jvm.internal.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = p1Var8.f262222b.getId();
                        if (valueOf != null && valueOf.intValue() == id10) {
                            fg2.p1 p1Var9 = this.K;
                            if (p1Var9 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            p1Var9.B.setVisibility(8);
                            fg2.p1 p1Var10 = this.K;
                            if (p1Var10 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            p1Var10.f262228h.setVisibility(8);
                            fg2.p1 p1Var11 = this.K;
                            if (p1Var11 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            p1Var11.f262223c.setVisibility(0);
                            this.M = 3;
                        } else {
                            fg2.p1 p1Var12 = this.K;
                            if (p1Var12 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = p1Var12.f262235o.getId();
                            android.content.Context context = this.f118183e;
                            gk2.e eVar = this.H;
                            if (valueOf != null && valueOf.intValue() == id11) {
                                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.g5) eVar.a(mm2.g5.class)).f329092i;
                                if (finderJumpInfo != null) {
                                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                    kotlin.jvm.internal.o.g(context, "context");
                                    xc2.y2 y2Var = xc2.y2.f453343a;
                                    xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                                    p0Var.f453252n = 0;
                                    xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
                                }
                            } else {
                                fg2.p1 p1Var13 = this.K;
                                if (p1Var13 == null) {
                                    kotlin.jvm.internal.o.o("uiBinding");
                                    throw null;
                                }
                                int id12 = p1Var13.f262224d.getId();
                                if (valueOf != null && valueOf.intValue() == id12) {
                                    this.N = true;
                                    r45.kf5 kf5Var = this.L;
                                    r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                                    r45.kf5 kf5Var2 = il4Var != null ? il4Var.f377132g : null;
                                    if (kf5Var != null && kf5Var2 != null && ((mm2.o4) eVar.a(mm2.o4.class)).B7(kf5Var, kf5Var2)) {
                                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                        db5.t7.makeText(context2, context2.getResources().getString(com.tencent.mm.R.string.mki), 0).show();
                                        i0();
                                        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveRequestPayMicPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                        return;
                                    }
                                    zl2.r4 r4Var = zl2.r4.f473950a;
                                    android.content.Context context3 = this.f118183e;
                                    gk2.e S0 = this.f337520J.S0();
                                    java.lang.String string = context.getString(com.tencent.mm.R.string.ec6);
                                    kotlin.jvm.internal.o.f(string, "getString(...)");
                                    java.lang.String string2 = context.getString(com.tencent.mm.R.string.f491825ec4);
                                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                                    if (r4Var.B(context3, S0, string, string2, new ni2.v1(this))) {
                                        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                                        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveRequestPayMicPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                        return;
                                    }
                                    e0();
                                }
                            }
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveRequestPayMicPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118183e);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 24), i65.a.b(weImageView.getContext(), 24)));
        weImageView.setImageResource(com.tencent.mm.R.raw.finder_live_view_setting_icon);
        return weImageView;
    }
}
