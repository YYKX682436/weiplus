package rf2;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {
    public android.widget.ImageView A;
    public android.widget.ImageView B;
    public android.widget.TextView C;
    public rf2.g D;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f394853d;

    /* renamed from: e, reason: collision with root package name */
    public final df2.ln f394854e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f394855f;

    /* renamed from: g, reason: collision with root package name */
    public final int f394856g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f394857h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f394858i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f394859m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f394860n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f394861o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f394862p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f394863q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f394864r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f394865s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f394866t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f394867u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f394868v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f394869w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f394870x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f394871y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f394872z;

    public q(android.view.View root, df2.ln controller) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f394853d = root;
        this.f394854e = controller;
        this.f394855f = controller.f230676m;
        this.f394856g = 1001;
        this.D = rf2.g.f394735d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rf2.q r19, r45.f02 r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.q.a(rf2.q, r45.f02, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(rf2.q qVar, r45.ul4 ul4Var) {
        java.lang.String str;
        qVar.getClass();
        if (ul4Var == null || (str = ul4Var.f387458e) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        boolean z17 = ul4Var != null && ul4Var.f387459f == 0;
        qVar.e(z17 ? rf2.g.f394743o : rf2.g.f394742n, str2, z17 ? com.tencent.mm.R.color.UN_BW_100_Alpha_0_8 : com.tencent.mm.R.color.aex, 17.0f, z17 ? com.tencent.mm.R.drawable.f481735a50 : 0, false, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(rf2.q r19, r45.f02 r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.q.c(rf2.q, r45.f02, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void g(rf2.q qVar, boolean z17, boolean z18, java.lang.Integer num, int i17, java.lang.Object obj) {
        java.lang.String str;
        if ((i17 & 4) != 0) {
            num = null;
        }
        java.lang.Integer num2 = num;
        if (!z17) {
            android.widget.TextView textView = qVar.f394865s;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = qVar.f394866t;
            if (weImageView == null) {
                return;
            }
            weImageView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = qVar.f394865s;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = qVar.f394866t;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
        rf2.t tVar = rf2.t.f394890a;
        r45.f02 f02Var = qVar.f394854e.f230685v;
        if (f02Var == null || (str = f02Var.f373878d) == null) {
            str = "";
        }
        tVar.e(str, 20, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : num2);
    }

    public final void d() {
        android.view.ViewGroup viewGroup = this.f394857h;
        android.view.View view = this.f394853d;
        android.widget.TextView textView = null;
        if (viewGroup == null) {
            viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.isr);
            if (viewGroup != null) {
                viewGroup.setOnClickListener(this);
            } else {
                viewGroup = null;
            }
        }
        this.f394857h = viewGroup;
        android.view.View view2 = this.f394858i;
        if (view2 == null) {
            if (viewGroup == null || (view2 = viewGroup.findViewById(com.tencent.mm.R.id.pmq)) == null) {
                view2 = null;
            } else {
                view2.setOnClickListener(this);
            }
        }
        this.f394858i = view2;
        android.widget.ImageView imageView = this.f394859m;
        if (imageView == null) {
            android.view.ViewGroup viewGroup2 = this.f394857h;
            imageView = viewGroup2 != null ? (android.widget.ImageView) viewGroup2.findViewById(com.tencent.mm.R.id.pmp) : null;
        }
        this.f394859m = imageView;
        android.widget.TextView textView2 = this.f394860n;
        d92.f fVar = d92.f.f227470a;
        if (textView2 == null) {
            android.view.ViewGroup viewGroup3 = this.f394857h;
            if (viewGroup3 == null || (textView2 = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.pmv)) == null) {
                textView2 = null;
            } else {
                android.content.Context context = textView2.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                d92.f.a(fVar, context, textView2, 17.0f, 0.0f, 8, null);
            }
        }
        this.f394860n = textView2;
        android.widget.TextView textView3 = this.f394861o;
        if (textView3 == null) {
            android.view.ViewGroup viewGroup4 = this.f394857h;
            textView3 = viewGroup4 != null ? (android.widget.TextView) viewGroup4.findViewById(com.tencent.mm.R.id.dkf) : null;
        }
        this.f394861o = textView3;
        android.widget.TextView textView4 = this.f394862p;
        if (textView4 == null) {
            android.view.ViewGroup viewGroup5 = this.f394857h;
            if (viewGroup5 == null || (textView4 = (android.widget.TextView) viewGroup5.findViewById(com.tencent.mm.R.id.f486429l62)) == null) {
                textView4 = null;
            } else {
                android.content.Context context2 = textView4.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                d92.f.a(fVar, context2, textView4, 22.0f, 0.0f, 8, null);
            }
        }
        this.f394862p = textView4;
        android.widget.TextView textView5 = this.f394863q;
        if (textView5 == null) {
            android.view.ViewGroup viewGroup6 = this.f394857h;
            if (viewGroup6 == null || (textView5 = (android.widget.TextView) viewGroup6.findViewById(com.tencent.mm.R.id.f483742bx3)) == null) {
                textView5 = null;
            } else {
                textView5.setOnClickListener(this);
                android.content.Context context3 = textView5.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                d92.f.a(fVar, context3, textView5, 17.0f, 0.0f, 8, null);
                com.tencent.mm.ui.bk.r0(textView5.getPaint(), 0.8f);
            }
        }
        this.f394863q = textView5;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f394864r;
        if (weImageView == null) {
            android.view.ViewGroup viewGroup7 = this.f394857h;
            if (viewGroup7 == null || (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup7.findViewById(com.tencent.mm.R.id.f483743bx4)) == null) {
                weImageView = null;
            } else {
                weImageView.setOnClickListener(this);
            }
        }
        this.f394864r = weImageView;
        android.widget.TextView textView6 = this.f394865s;
        if (textView6 == null) {
            android.view.ViewGroup viewGroup8 = this.f394857h;
            if (viewGroup8 == null || (textView6 = (android.widget.TextView) viewGroup8.findViewById(com.tencent.mm.R.id.p_h)) == null) {
                textView6 = null;
            } else {
                textView6.setOnClickListener(this);
                android.content.Context context4 = textView6.getContext();
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                d92.f.a(fVar, context4, textView6, 14.0f, 0.0f, 8, null);
            }
        }
        this.f394865s = textView6;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f394866t;
        if (weImageView2 == null) {
            android.view.ViewGroup viewGroup9 = this.f394857h;
            if (viewGroup9 == null || (weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup9.findViewById(com.tencent.mm.R.id.p_i)) == null) {
                weImageView2 = null;
            } else {
                weImageView2.setOnClickListener(this);
            }
        }
        this.f394866t = weImageView2;
        android.widget.TextView textView7 = this.f394867u;
        if (textView7 == null) {
            android.view.ViewGroup viewGroup10 = this.f394857h;
            if (viewGroup10 == null || (textView7 = (android.widget.TextView) viewGroup10.findViewById(com.tencent.mm.R.id.nfl)) == null) {
                textView7 = null;
            } else {
                android.content.Context context5 = textView7.getContext();
                kotlin.jvm.internal.o.f(context5, "getContext(...)");
                d92.f.a(fVar, context5, textView7, 14.0f, 0.0f, 8, null);
            }
        }
        this.f394867u = textView7;
        android.widget.TextView textView8 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485933r41);
        if (textView8 != null) {
            android.content.Context context6 = textView8.getContext();
            kotlin.jvm.internal.o.f(context6, "getContext(...)");
            d92.f.a(fVar, context6, textView8, 17.0f, 0.0f, 8, null);
            textView = textView8;
        }
        this.C = textView;
        this.f394868v = view.findViewById(com.tencent.mm.R.id.qzs);
        this.f394869w = view.findViewById(com.tencent.mm.R.id.qyu);
        this.f394870x = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.qyp);
        this.f394871y = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.qyt);
        this.f394872z = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.qyx);
        this.A = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.qyr);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.qyo);
        imageView2.setPivotX(0.0f);
        imageView2.setPivotY(0.0f);
        this.B = imageView2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cf, code lost:
    
        if (r2 != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019b, code lost:
    
        if (com.tencent.mm.plugin.finder.live.util.k2.e(r1, 3) == true) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ae, code lost:
    
        if (com.tencent.mm.plugin.finder.live.util.k2.e(r1, 4) == true) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(rf2.g r19, java.lang.String r20, int r21, float r22, int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.q.e(rf2.g, java.lang.String, int, float, int, boolean, boolean):void");
    }

    public final void f(int i17) {
        boolean E = zl2.q4.f473933a.E();
        java.lang.String str = this.f394855f;
        if (E) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVisible:");
            sb6.append(i17);
            sb6.append(",winnerContainner visibility:");
            android.view.ViewGroup viewGroup = this.f394857h;
            sb6.append(viewGroup != null ? java.lang.Integer.valueOf(viewGroup.getVisibility()) : null);
            com.tencent.mm.sdk.platformtools.Log.c(str, sb6.toString(), new java.lang.Object[0]);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setVisible:");
            sb7.append(i17);
            sb7.append(",winnerContainner visibility:");
            android.view.ViewGroup viewGroup2 = this.f394857h;
            sb7.append(viewGroup2 != null ? java.lang.Integer.valueOf(viewGroup2.getVisibility()) : null);
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
        }
        if (this.f394857h == null) {
            d();
        }
        android.view.ViewGroup viewGroup3 = this.f394857h;
        if (viewGroup3 == null) {
            return;
        }
        viewGroup3.setVisibility(i17);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        r45.km4 km4Var;
        r45.fm4 fm4Var;
        r45.fm4 fm4Var2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        r45.fm4 fm4Var3;
        df2.ln lnVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.p_h) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.p_i);
        rf2.t tVar = rf2.t.f394890a;
        df2.ln lnVar2 = this.f394854e;
        if (z17) {
            r45.f02 f02Var = lnVar2.f230685v;
            if (f02Var != null) {
                java.lang.String str6 = f02Var.f373878d;
                java.lang.String str7 = str6 == null ? "" : str6;
                mm2.v4 v4Var = (mm2.v4) lnVar2.business(mm2.v4.class);
                java.lang.String str8 = f02Var.f373878d;
                if (str8 == null) {
                    str8 = "";
                }
                java.lang.Object O6 = v4Var.O6(str8);
                r45.i02 i02Var = O6 instanceof r45.i02 ? (r45.i02) O6 : null;
                mm2.v4 v4Var2 = (mm2.v4) lnVar2.business(mm2.v4.class);
                java.lang.String str9 = f02Var.f373878d;
                java.lang.Object O62 = v4Var2.O6(str9 != null ? str9 : "");
                lnVar = lnVar2;
                tVar.e(str7, 21, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : tVar.a(f02Var, i02Var, O62 instanceof r45.i52 ? (r45.i52) O62 : null));
            } else {
                lnVar = lnVar2;
            }
            lnVar.c7(this.f394857h);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.pmq) {
            yz5.l lVar = lnVar2.f230687x;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
            lnVar2.Z6();
        } else {
            if ((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f483743bx4) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f483742bx3)) {
                r45.f02 f02Var2 = lnVar2.f230685v;
                boolean z18 = (f02Var2 == null || (fm4Var3 = f02Var2.f373880f) == null || fm4Var3.f374448g != 1) ? false : true;
                android.view.View view2 = this.f394853d;
                str = this.f394855f;
                if (z18) {
                    mm2.v4 v4Var3 = (mm2.v4) lnVar2.business(mm2.v4.class);
                    r45.f02 f02Var3 = lnVar2.f230685v;
                    if (f02Var3 == null || (str3 = f02Var3.f373878d) == null) {
                        str3 = "";
                    }
                    java.lang.Object O63 = v4Var3.O6(str3);
                    r45.i02 i02Var2 = O63 instanceof r45.i02 ? (r45.i02) O63 : null;
                    if (i02Var2 == null) {
                        com.tencent.mars.xlog.Log.e(str, "claim prize,but coupon info is empty!");
                    } else {
                        r45.zd4 zd4Var = i02Var2.f376613e;
                        com.tencent.mm.protobuf.g gVar = zd4Var != null ? zd4Var.f391935g : null;
                        if (gVar == null) {
                            com.tencent.mars.xlog.Log.e(str, "claim prize,but jump_info is empty!");
                        } else if (i02Var2.f376612d == 2) {
                            r45.f02 f02Var4 = lnVar2.f230685v;
                            tVar.e((f02Var4 == null || (str5 = f02Var4.f373878d) == null) ? "" : str5, 18, (r13 & 4) != 0 ? null : zd4Var != null ? zd4Var.f391932d : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                            lr2.b bVar = lr2.b.f320718a;
                            android.content.Context context = view2.getContext();
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            r45.mg0 mg0Var = new r45.mg0();
                            try {
                                mg0Var.parseFrom(gVar.g());
                            } catch (java.lang.Exception e17) {
                                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                            }
                            bVar.a(context, mg0Var, 1177);
                        } else {
                            r45.f02 f02Var5 = lnVar2.f230685v;
                            if (f02Var5 == null || (str4 = f02Var5.f373878d) == null) {
                                str4 = "";
                            }
                            tVar.e(str4, 16, (r13 & 4) != 0 ? null : zd4Var != null ? zd4Var.f391932d : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                            com.tencent.mm.plugin.finder.live.view.ub ubVar = lnVar2.f291099e;
                            com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
                            if (k0Var != null) {
                                byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
                                java.lang.String str10 = "live_milestone_lottery:" + ((mm2.e1) lnVar2.business(mm2.e1.class)).f328988r.getLong(0) + ':' + ((mm2.c1) lnVar2.business(mm2.c1.class)).f328852o + "::" + ((mm2.c1) lnVar2.business(mm2.c1.class)).f328861p2 + ':' + s07 + ':' + ((mm2.c1) lnVar2.business(mm2.c1.class)).P3 + ':';
                                dk2.q4 q4Var = dk2.q4.f233938a;
                                android.content.Context context2 = k0Var.getContext();
                                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                gk2.e buContext = k0Var.getBuContext();
                                st2.c2 c2Var = st2.c2.f412249a;
                                android.content.Context context3 = k0Var.getContext();
                                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                                r45.ce0 ce0Var = new r45.ce0();
                                try {
                                    ce0Var.parseFrom(gVar.g());
                                } catch (java.lang.Exception e18) {
                                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                                }
                                kotlin.jvm.internal.o.d(s07);
                                q4Var.n(context2, buContext, c2Var.d(context3, ce0Var, 1177, s07, str10, k0Var.getBuContext()), k0Var);
                            }
                        }
                    }
                } else {
                    if ((f02Var2 == null || (fm4Var2 = f02Var2.f373880f) == null || fm4Var2.f374448g != 2) ? false : true) {
                        lnVar2.Z6();
                        r45.zb4 zb4Var = new r45.zb4();
                        zb4Var.set(2, view2.getContext().getString(com.tencent.mm.R.string.f491563dj5));
                        zb4Var.set(4, java.lang.Boolean.FALSE);
                        ((mm2.s2) lnVar2.business(mm2.s2.class)).f329411p.postValue(zb4Var);
                    } else {
                        if ((f02Var2 == null || (fm4Var = f02Var2.f373880f) == null || fm4Var.f374448g != 4) ? false : true) {
                            android.content.Context context4 = view.getContext();
                            kotlin.jvm.internal.o.f(context4, "getContext(...)");
                            int i17 = this.f394856g;
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("launch_from_select_addr", true);
                            intent.putExtra("enter_scene_address", 3);
                            j45.l.o(context4, "address", ".ui.WalletSelectAddrUI", intent, i17, false);
                        } else {
                            java.lang.String str11 = (f02Var2 == null || (km4Var = f02Var2.f373883i) == null) ? null : km4Var.f378821d;
                            tVar.e((f02Var2 == null || (str2 = f02Var2.f373878d) == null) ? "" : str2, 12, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                            if (str11 == null || str11.length() == 0) {
                                com.tencent.mars.xlog.Log.e(str, "claim prize,but red packet uri is empty!");
                            } else {
                                i95.m c17 = i95.n0.c(c61.yb.class);
                                kotlin.jvm.internal.o.f(c17, "getService(...)");
                                c61.yb ybVar = (c61.yb) c17;
                                android.content.Context context5 = view.getContext();
                                kotlin.jvm.internal.o.f(context5, "getContext(...)");
                                r45.ac4 ac4Var = new r45.ac4();
                                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                                com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
                                html5Info.setUrl(str11);
                                finderJumpInfo.setHtml5_info(html5Info);
                                finderJumpInfo.setJumpinfo_type(2);
                                ac4Var.set(1, finderJumpInfo);
                                c61.yb.Yi(ybVar, context5, ac4Var, null, null, 8, null);
                            }
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
