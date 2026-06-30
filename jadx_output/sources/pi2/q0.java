package pi2;

/* loaded from: classes10.dex */
public final class q0 extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final zh2.c I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.p f354803J;
    public final java.util.LinkedList K;
    public int L;
    public final jz5.g M;
    public r45.jf5 N;
    public final java.util.LinkedList P;
    public final jz5.g Q;
    public final java.util.LinkedList R;
    public int S;
    public final jz5.g T;
    public final java.util.LinkedList U;
    public int V;
    public final jz5.g W;
    public fg2.m1 X;
    public boolean Y;
    public java.lang.String Z;

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f354804p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context context, gk2.e liveData, zh2.c pluginAbility, yz5.p settingInvoke) {
        super(context, false, null, 0.6666667f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(settingInvoke, "settingInvoke");
        this.H = liveData;
        this.I = pluginAbility;
        this.f354803J = settingInvoke;
        this.K = new java.util.LinkedList();
        this.M = jz5.h.b(new pi2.l0(context, this));
        this.N = new r45.jf5();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.N);
        linkedList.add(new r45.jf5());
        this.P = linkedList;
        this.Q = jz5.h.b(new pi2.j0(context, this));
        this.R = new java.util.LinkedList();
        this.T = jz5.h.b(new pi2.p0(context, this));
        this.U = new java.util.LinkedList();
        this.W = jz5.h.b(new pi2.n0(context, this));
        this.Z = "";
        this.f354804p0 = jz5.h.b(new pi2.h0(context, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.f488955ds5;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.f482335bp;
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) x4.b.a(rootView, com.tencent.mm.R.id.f482335bp);
        if (weButton != null) {
            i17 = com.tencent.mm.R.id.f482709r32;
            android.view.View a17 = x4.b.a(rootView, com.tencent.mm.R.id.f482709r32);
            if (a17 != null) {
                i17 = com.tencent.mm.R.id.che;
                androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) x4.b.a(rootView, com.tencent.mm.R.id.che);
                if (nestedScrollView != null) {
                    i17 = com.tencent.mm.R.id.rjj;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rjj);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.rjn;
                        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(rootView, com.tencent.mm.R.id.rjn);
                        if (mMSwitchBtn != null) {
                            i17 = com.tencent.mm.R.id.rjv;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.rjv);
                            if (frameLayout != null) {
                                i17 = com.tencent.mm.R.id.gz9;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.gz9);
                                if (textView2 != null) {
                                    i17 = com.tencent.mm.R.id.rx6;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rx6);
                                    if (textView3 != null) {
                                        i17 = com.tencent.mm.R.id.rx7;
                                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rx7);
                                        if (textView4 != null) {
                                            i17 = com.tencent.mm.R.id.rx9;
                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.rx9);
                                            if (constraintLayout != null) {
                                                i17 = com.tencent.mm.R.id.rx_;
                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rx_);
                                                if (textView5 != null) {
                                                    i17 = com.tencent.mm.R.id.rxa;
                                                    android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rxa);
                                                    if (textView6 != null) {
                                                        i17 = com.tencent.mm.R.id.rxb;
                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.rxb);
                                                        if (weImageView != null) {
                                                            i17 = com.tencent.mm.R.id.rxc;
                                                            android.view.View a18 = x4.b.a(rootView, com.tencent.mm.R.id.rxc);
                                                            if (a18 != null) {
                                                                i17 = com.tencent.mm.R.id.rxd;
                                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.rxd);
                                                                if (constraintLayout2 != null) {
                                                                    i17 = com.tencent.mm.R.id.rxe;
                                                                    android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rxe);
                                                                    if (textView7 != null) {
                                                                        i17 = com.tencent.mm.R.id.rxf;
                                                                        android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rxf);
                                                                        if (textView8 != null) {
                                                                            i17 = com.tencent.mm.R.id.rxg;
                                                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.rxg);
                                                                            if (weImageView2 != null) {
                                                                                i17 = com.tencent.mm.R.id.rxh;
                                                                                android.view.View a19 = x4.b.a(rootView, com.tencent.mm.R.id.rxh);
                                                                                if (a19 != null) {
                                                                                    i17 = com.tencent.mm.R.id.rxi;
                                                                                    android.view.View a27 = x4.b.a(rootView, com.tencent.mm.R.id.rxi);
                                                                                    if (a27 != null) {
                                                                                        i17 = com.tencent.mm.R.id.rxj;
                                                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.rxj);
                                                                                        if (constraintLayout3 != null) {
                                                                                            i17 = com.tencent.mm.R.id.rxk;
                                                                                            android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rxk);
                                                                                            if (textView9 != null) {
                                                                                                i17 = com.tencent.mm.R.id.rxl;
                                                                                                android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rxl);
                                                                                                if (textView10 != null) {
                                                                                                    i17 = com.tencent.mm.R.id.rxm;
                                                                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.rxm);
                                                                                                    if (weImageView3 != null) {
                                                                                                        i17 = com.tencent.mm.R.id.rxw;
                                                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.rxw);
                                                                                                        if (weImageView4 != null) {
                                                                                                            i17 = com.tencent.mm.R.id.rxx;
                                                                                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.rxx);
                                                                                                            if (constraintLayout4 != null) {
                                                                                                                i17 = com.tencent.mm.R.id.rxy;
                                                                                                                android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rxy);
                                                                                                                if (textView11 != null) {
                                                                                                                    i17 = com.tencent.mm.R.id.rxz;
                                                                                                                    android.widget.TextView textView12 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rxz);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i17 = com.tencent.mm.R.id.f485921ry0;
                                                                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f485921ry0);
                                                                                                                        if (weImageView5 != null) {
                                                                                                                            i17 = com.tencent.mm.R.id.f485929ry2;
                                                                                                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f485929ry2);
                                                                                                                            if (weImageView6 != null) {
                                                                                                                                i17 = com.tencent.mm.R.id.f485930ry3;
                                                                                                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.f485930ry3);
                                                                                                                                if (constraintLayout5 != null) {
                                                                                                                                    i17 = com.tencent.mm.R.id.f485931ry4;
                                                                                                                                    android.widget.TextView textView13 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f485931ry4);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i17 = com.tencent.mm.R.id.f485932ry5;
                                                                                                                                        android.widget.TextView textView14 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f485932ry5);
                                                                                                                                        if (textView14 != null) {
                                                                                                                                            i17 = com.tencent.mm.R.id.ry6;
                                                                                                                                            android.widget.TextView textView15 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.ry6);
                                                                                                                                            if (textView15 != null) {
                                                                                                                                                i17 = com.tencent.mm.R.id.ry7;
                                                                                                                                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.ry7);
                                                                                                                                                if (weImageView7 != null) {
                                                                                                                                                    i17 = com.tencent.mm.R.id.s3l;
                                                                                                                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.s3l);
                                                                                                                                                    if (linearLayout != null) {
                                                                                                                                                        i17 = com.tencent.mm.R.id.s3m;
                                                                                                                                                        android.widget.TextView textView16 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.s3m);
                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                            i17 = com.tencent.mm.R.id.s5f;
                                                                                                                                                            android.widget.TextView textView17 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.s5f);
                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                i17 = com.tencent.mm.R.id.s5h;
                                                                                                                                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout6 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.s5h);
                                                                                                                                                                if (constraintLayout6 != null) {
                                                                                                                                                                    this.X = new fg2.m1((androidx.constraintlayout.widget.ConstraintLayout) rootView, weButton, a17, nestedScrollView, textView, mMSwitchBtn, frameLayout, textView2, textView3, textView4, constraintLayout, textView5, textView6, weImageView, a18, constraintLayout2, textView7, textView8, weImageView2, a19, a27, constraintLayout3, textView9, textView10, weImageView3, weImageView4, constraintLayout4, textView11, textView12, weImageView5, weImageView6, constraintLayout5, textView13, textView14, textView15, weImageView7, linearLayout, textView16, textView17, constraintLayout6);
                                                                                                                                                                    constraintLayout2.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var = this.X;
                                                                                                                                                                    if (m1Var == null) {
                                                                                                                                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var.f262145g.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var2 = this.X;
                                                                                                                                                                    if (m1Var2 == null) {
                                                                                                                                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var2.f262154p.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var3 = this.X;
                                                                                                                                                                    if (m1Var3 == null) {
                                                                                                                                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var3.f262152n.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var4 = this.X;
                                                                                                                                                                    if (m1Var4 == null) {
                                                                                                                                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var4.f262156r.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var5 = this.X;
                                                                                                                                                                    if (m1Var5 == null) {
                                                                                                                                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var5.f262140b.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var6 = this.X;
                                                                                                                                                                    if (m1Var6 == null) {
                                                                                                                                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var6.f262144f.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var7 = this.X;
                                                                                                                                                                    if (m1Var7 == null) {
                                                                                                                                                                        kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var7.f262143e.setSwitchListener(new pi2.f0(this));
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
    public void U() {
        super.U();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.g5) this.H.a(mm2.g5.class)).f329091h;
        if (finderJumpInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = this.f118183e;
            kotlin.jvm.internal.o.g(context, "context");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        e0();
    }

    public final void e0() {
        fg2.m1 m1Var = this.X;
        if (m1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        boolean z17 = false;
        if (this.L != 0 && this.N.getInteger(0) != 0 && this.S != 0) {
            z17 = true;
        }
        m1Var.f262140b.setEnabled(z17);
    }

    public final void f0(boolean z17, java.lang.String str) {
        this.Y = z17;
        this.Z = str;
        if (!z17) {
            fg2.m1 m1Var = this.X;
            if (m1Var != null) {
                m1Var.f262153o.setText("");
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        fg2.m1 m1Var2 = this.X;
        if (m1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        m1Var2.f262153o.setText(this.f118183e.getResources().getString(com.tencent.mm.R.string.mle));
    }

    public final void g0(r45.jf5 jf5Var, java.lang.String str) {
        this.N = jf5Var;
        fg2.m1 m1Var = this.X;
        if (m1Var != null) {
            m1Var.f262146h.setText(str);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void h0(int i17, java.lang.String str) {
        this.S = i17;
        fg2.m1 m1Var = this.X;
        if (m1Var != null) {
            m1Var.f262155q.setText(str);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void i0(int i17, java.lang.String str) {
        this.V = i17;
        fg2.m1 m1Var = this.X;
        if (m1Var != null) {
            m1Var.f262157s.setText(str);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void j0(int i17, java.lang.String str) {
        this.L = i17;
        fg2.m1 m1Var = this.X;
        if (m1Var != null) {
            m1Var.f262149k.setText(str);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicSettingPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.m1 m1Var = this.X;
        if (m1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = m1Var.f262148j.getId();
        gk2.e eVar = this.H;
        if (valueOf != null && valueOf.intValue() == id6) {
            r45.p52 p52Var = ((mm2.g5) eVar.a(mm2.g5.class)).f329090g;
            java.util.LinkedList payDurationList = p52Var != null ? p52Var.getList(0) : null;
            if (payDurationList == null) {
                payDurationList = this.K;
            }
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
            pi2.z zVar = (pi2.z) ((jz5.n) this.M).getValue();
            int i17 = this.L;
            zVar.getClass();
            kotlin.jvm.internal.o.g(payDurationList, "payDurationList");
            com.tencent.mm.plugin.finder.live.widget.e0.W(zVar, null, false, 0, 7, null);
            int indexOf = payDurationList.indexOf(java.lang.Integer.valueOf(i17));
            zVar.M = indexOf;
            if (indexOf == -1) {
                zVar.M = 0;
                java.lang.Object first = payDurationList.getFirst();
                kotlin.jvm.internal.o.f(first, "getFirst(...)");
                ((java.lang.Number) first).intValue();
            }
            java.util.LinkedList linkedList = zVar.L;
            linkedList.clear();
            linkedList.addAll(payDurationList);
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = zVar.I;
            if (customOptionPickNew == null) {
                kotlin.jvm.internal.o.o("pickView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(payDurationList, 10));
            java.util.Iterator it = payDurationList.iterator();
            while (it.hasNext()) {
                arrayList2.add(zVar.f118183e.getResources().getString(com.tencent.mm.R.string.lzf, java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue())));
            }
            customOptionPickNew.setOptionsArray((java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = zVar.I;
            if (customOptionPickNew2 == null) {
                kotlin.jvm.internal.o.o("pickView");
                throw null;
            }
            customOptionPickNew2.setValue(zVar.M);
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew3 = zVar.I;
            if (customOptionPickNew3 == null) {
                kotlin.jvm.internal.o.o("pickView");
                throw null;
            }
            customOptionPickNew3.c(zVar.M);
        } else {
            fg2.m1 m1Var2 = this.X;
            if (m1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = m1Var2.f262145g.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                r45.p52 p52Var2 = ((mm2.g5) eVar.a(mm2.g5.class)).f329090g;
                java.util.LinkedList breakList = p52Var2 != null ? p52Var2.getList(1) : null;
                if (breakList == null) {
                    breakList = this.P;
                }
                com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                pi2.x xVar = (pi2.x) ((jz5.n) this.Q).getValue();
                r45.jf5 defaultBreak = this.N;
                xVar.getClass();
                kotlin.jvm.internal.o.g(breakList, "breakList");
                kotlin.jvm.internal.o.g(defaultBreak, "defaultBreak");
                com.tencent.mm.plugin.finder.live.widget.e0.W(xVar, null, false, 0, 7, null);
                java.util.Iterator it6 = breakList.iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i18 = -1;
                        break;
                    } else {
                        if ((((r45.jf5) it6.next()).getInteger(0) == defaultBreak.getInteger(0)) == true) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                xVar.M = i18;
                if (i18 == -1) {
                    xVar.M = 0;
                }
                java.util.LinkedList linkedList2 = xVar.L;
                linkedList2.clear();
                linkedList2.addAll(breakList);
                com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew4 = xVar.I;
                if (customOptionPickNew4 == null) {
                    kotlin.jvm.internal.o.o("pickView");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(breakList, 10));
                java.util.Iterator it7 = breakList.iterator();
                while (it7.hasNext()) {
                    java.lang.String string = ((r45.jf5) it7.next()).getString(1);
                    if (string == null) {
                        string = "";
                    }
                    arrayList3.add(string);
                }
                customOptionPickNew4.setOptionsArray((java.lang.String[]) arrayList3.toArray(new java.lang.String[0]));
                com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew5 = xVar.I;
                if (customOptionPickNew5 == null) {
                    kotlin.jvm.internal.o.o("pickView");
                    throw null;
                }
                customOptionPickNew5.setValue(xVar.M);
                com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew6 = xVar.I;
                if (customOptionPickNew6 == null) {
                    kotlin.jvm.internal.o.o("pickView");
                    throw null;
                }
                customOptionPickNew6.c(xVar.M);
            } else {
                fg2.m1 m1Var3 = this.X;
                if (m1Var3 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                int id8 = m1Var3.f262154p.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    r45.p52 p52Var3 = ((mm2.g5) eVar.a(mm2.g5.class)).f329090g;
                    java.util.LinkedList priceList = p52Var3 != null ? p52Var3.getList(2) : null;
                    if (priceList == null) {
                        priceList = this.R;
                    }
                    com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                    pi2.e0 e0Var = (pi2.e0) ((jz5.n) this.T).getValue();
                    int i19 = this.S;
                    e0Var.getClass();
                    kotlin.jvm.internal.o.g(priceList, "priceList");
                    com.tencent.mm.plugin.finder.live.widget.e0.W(e0Var, null, false, 0, 7, null);
                    int indexOf2 = priceList.indexOf(java.lang.Integer.valueOf(i19));
                    e0Var.M = indexOf2;
                    if (indexOf2 == -1) {
                        e0Var.M = 0;
                        java.lang.Object first2 = priceList.getFirst();
                        kotlin.jvm.internal.o.f(first2, "getFirst(...)");
                        ((java.lang.Number) first2).intValue();
                    }
                    java.util.LinkedList linkedList3 = e0Var.L;
                    linkedList3.clear();
                    linkedList3.addAll(priceList);
                    com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew7 = e0Var.I;
                    if (customOptionPickNew7 == null) {
                        kotlin.jvm.internal.o.o("pickView");
                        throw null;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(priceList, 10));
                    java.util.Iterator it8 = priceList.iterator();
                    while (it8.hasNext()) {
                        arrayList4.add(java.lang.String.valueOf(((java.lang.Number) it8.next()).intValue()));
                    }
                    customOptionPickNew7.setOptionsArray((java.lang.String[]) arrayList4.toArray(new java.lang.String[0]));
                    com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew8 = e0Var.I;
                    if (customOptionPickNew8 == null) {
                        kotlin.jvm.internal.o.o("pickView");
                        throw null;
                    }
                    customOptionPickNew8.setValue(e0Var.M);
                    com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew9 = e0Var.I;
                    if (customOptionPickNew9 == null) {
                        kotlin.jvm.internal.o.o("pickView");
                        throw null;
                    }
                    customOptionPickNew9.c(e0Var.M);
                } else {
                    fg2.m1 m1Var4 = this.X;
                    if (m1Var4 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = m1Var4.f262152n.getId();
                    if (valueOf != null && valueOf.intValue() == id9) {
                        pi2.b0 b0Var = (pi2.b0) ((jz5.n) this.f354804p0).getValue();
                        boolean z17 = this.Y;
                        java.lang.String focusId = this.Z;
                        b0Var.getClass();
                        kotlin.jvm.internal.o.g(focusId, "focusId");
                        com.tencent.mm.plugin.finder.live.widget.e0.W(b0Var, null, false, 0, 7, null);
                        zh2.c cVar = b0Var.H;
                        xh2.c cVar2 = (xh2.c) ((mm2.o4) cVar.g().a(mm2.o4.class)).A.getValue();
                        if (cVar2 == null) {
                            java.util.LinkedList linkedList4 = new java.util.LinkedList();
                            linkedList4.add(new xh2.a(((mm2.o4) cVar.g().a(mm2.o4.class)).a7(), new xh2.i(0.0f, 0.0f, 1.0f, 1.0f, 0, 0, 0, false, 0, 0, 0L, 2032, null)));
                            cVar2 = new xh2.c(linkedList4, new android.graphics.Rect(), 0, 0, 0, 0, 0.5625f, false, new java.util.LinkedList());
                        }
                        xh2.c a17 = cVar2.a();
                        if (z17) {
                            a17.f454533c = 1;
                        } else {
                            a17.f454533c = 0;
                        }
                        r45.il4 il4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).U;
                        if (il4Var != null) {
                            pi2.c0 c0Var = b0Var.f354765J;
                            if (c0Var == null) {
                                kotlin.jvm.internal.o.o("micModeWidget");
                                throw null;
                            }
                            java.util.LinkedList linkedList5 = a17.f454531a;
                            android.graphics.Rect rect = a17.f454532b;
                            int i27 = a17.f454533c;
                            c0Var.j(il4Var, new xh2.c(linkedList5, rect, (i27 == 1 || i27 == 3) ? 1 : 0, a17.f454534d, a17.f454535e, a17.f454536f, a17.f454537g, a17.f454538h, a17.f454539i), (int) ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377129d);
                        }
                    } else {
                        fg2.m1 m1Var5 = this.X;
                        if (m1Var5 == null) {
                            kotlin.jvm.internal.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = m1Var5.f262156r.getId();
                        if (valueOf != null && valueOf.intValue() == id10) {
                            r45.p52 p52Var4 = ((mm2.g5) eVar.a(mm2.g5.class)).f329090g;
                            java.util.LinkedList addPriceList = p52Var4 != null ? p52Var4.getList(3) : null;
                            if (addPriceList == null) {
                                addPriceList = this.U;
                            }
                            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                            pi2.v vVar = (pi2.v) ((jz5.n) this.W).getValue();
                            int i28 = this.V;
                            vVar.getClass();
                            kotlin.jvm.internal.o.g(addPriceList, "addPriceList");
                            com.tencent.mm.plugin.finder.live.widget.e0.W(vVar, null, false, 0, 7, null);
                            int indexOf3 = addPriceList.indexOf(java.lang.Integer.valueOf(i28));
                            vVar.M = indexOf3;
                            if (indexOf3 == -1) {
                                vVar.M = 0;
                                java.lang.Object first3 = addPriceList.getFirst();
                                kotlin.jvm.internal.o.f(first3, "getFirst(...)");
                                ((java.lang.Number) first3).intValue();
                            }
                            java.util.LinkedList linkedList6 = vVar.L;
                            linkedList6.clear();
                            linkedList6.addAll(addPriceList);
                            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew10 = vVar.I;
                            if (customOptionPickNew10 == null) {
                                kotlin.jvm.internal.o.o("pickView");
                                throw null;
                            }
                            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(addPriceList, 10));
                            java.util.Iterator it9 = addPriceList.iterator();
                            while (it9.hasNext()) {
                                arrayList5.add(java.lang.String.valueOf(((java.lang.Number) it9.next()).intValue()));
                            }
                            customOptionPickNew10.setOptionsArray((java.lang.String[]) arrayList5.toArray(new java.lang.String[0]));
                            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew11 = vVar.I;
                            if (customOptionPickNew11 == null) {
                                kotlin.jvm.internal.o.o("pickView");
                                throw null;
                            }
                            customOptionPickNew11.setValue(vVar.M);
                            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew12 = vVar.I;
                            if (customOptionPickNew12 == null) {
                                kotlin.jvm.internal.o.o("pickView");
                                throw null;
                            }
                            customOptionPickNew12.c(vVar.M);
                        } else {
                            fg2.m1 m1Var6 = this.X;
                            if (m1Var6 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = m1Var6.f262140b.getId();
                            if (valueOf != null && valueOf.intValue() == id11) {
                                com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                                r45.kf5 kf5Var = new r45.kf5();
                                kf5Var.f378656d = this.L;
                                kf5Var.f378657e = this.N.getInteger(0);
                                kf5Var.f378658f = this.S;
                                fg2.m1 m1Var7 = this.X;
                                if (m1Var7 == null) {
                                    kotlin.jvm.internal.o.o("uiBinding");
                                    throw null;
                                }
                                kf5Var.f378659g = m1Var7.f262143e.f211363x;
                                kf5Var.f378660h = this.V;
                                kf5Var.f378662m = this.Y;
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                jSONObject.put("element", ((mm2.c1) eVar.a(mm2.c1.class)).a8() ? 12 : 9);
                                jSONObject.put("sub_element", 2);
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("lianmai_mode", 2);
                                jSONObject2.put("pay_lianmai_duration", kf5Var.f378656d);
                                jSONObject2.put("pay_lianmai_close_type", kf5Var.f378657e);
                                jSONObject2.put("pay_lianmai_price", kf5Var.f378658f);
                                jSONObject2.put("pay_lianmai_is_allow_markup", kf5Var.f378659g ? 1 : 0);
                                jSONObject2.put("pay_lianmai_markup_price", kf5Var.f378660h);
                                jSONObject2.put("pay_lianmai_is_prominent", kf5Var.f378662m ? 1 : 0);
                                jSONObject.put("extra", jSONObject2.toString());
                                if (((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
                                    i95.m c17 = i95.n0.c(ml2.j0.class);
                                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                                    zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                                } else {
                                    i95.m c18 = i95.n0.c(ml2.j0.class);
                                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                                    zy2.zb zbVar = (zy2.zb) c18;
                                    ml2.c1 c1Var = ml2.c1.f327325e;
                                    zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
                                }
                                this.f354803J.invoke(kf5Var, this.Z);
                            } else {
                                fg2.m1 m1Var8 = this.X;
                                if (m1Var8 == null) {
                                    kotlin.jvm.internal.o.o("uiBinding");
                                    throw null;
                                }
                                int id12 = m1Var8.f262144f.getId();
                                if (valueOf != null && valueOf.intValue() == id12 && (finderJumpInfo = ((mm2.g5) eVar.a(mm2.g5.class)).f329092i) != null) {
                                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                    android.content.Context context = this.f118183e;
                                    kotlin.jvm.internal.o.g(context, "context");
                                    xc2.y2 y2Var = xc2.y2.f453343a;
                                    xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                                    p0Var.f453252n = 0;
                                    xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
                                }
                            }
                        }
                    }
                }
            }
        }
        e0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicSettingPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        android.widget.TextView textView = new android.widget.TextView(this.f118183e);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.dkb));
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo));
        com.tencent.mm.ui.fk.a(textView);
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.ejp));
        return textView;
    }
}
