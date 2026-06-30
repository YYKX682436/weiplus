package qi2;

/* loaded from: classes10.dex */
public final class q1 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f363605h;

    /* renamed from: i, reason: collision with root package name */
    public final si2.b f363606i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.d1 f363607m;

    /* renamed from: n, reason: collision with root package name */
    public int f363608n;

    /* renamed from: o, reason: collision with root package name */
    public int f363609o;

    /* renamed from: p, reason: collision with root package name */
    public ce2.i f363610p;

    /* renamed from: q, reason: collision with root package name */
    public r45.kl4 f363611q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f363612r;

    /* renamed from: s, reason: collision with root package name */
    public int f363613s;

    /* renamed from: t, reason: collision with root package name */
    public r45.wz1 f363614t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f363615u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f363616v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(gk2.e liveData, android.content.Context context, si2.b callback) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f363605h = liveData;
        this.f363606i = callback;
        this.f363608n = 1;
        this.f363612r = new java.util.LinkedList();
        this.f363615u = jz5.h.b(new qi2.n1(context, this));
        this.f363616v = jz5.h.b(new qi2.l1(context, this));
        this.f118384g.c(context.getResources().getDrawable(com.tencent.mm.R.drawable.a0m));
    }

    public final void A() {
        this.f363609o = 0;
        fg2.d1 d1Var = this.f363607m;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var.f261982n.setVisibility(0);
        fg2.d1 d1Var2 = this.f363607m;
        if (d1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var2.f261978j.setVisibility(8);
        fg2.d1 d1Var3 = this.f363607m;
        if (d1Var3 != null) {
            d1Var3.f261981m.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void B() {
        this.f363609o = 1;
        fg2.d1 d1Var = this.f363607m;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var.f261982n.setVisibility(8);
        fg2.d1 d1Var2 = this.f363607m;
        if (d1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var2.f261978j.setVisibility(0);
        fg2.d1 d1Var3 = this.f363607m;
        if (d1Var3 != null) {
            d1Var3.f261981m.setVisibility(this.f363610p != null ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            r6 = this;
            gk2.e r0 = r6.f363605h
            java.lang.Class<mm2.y2> r1 = mm2.y2.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm2.y2 r0 = (mm2.y2) r0
            dk2.pf r0 = r0.f329566s
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L56
            int r4 = r6.f363608n
            int r5 = r0.f233926a
            if (r5 != r4) goto L56
            int r4 = r6.f363609o
            int r5 = r0.f233927b
            if (r5 != r4) goto L56
            ce2.i r4 = r6.f363610p
            if (r4 == 0) goto L24
            java.lang.String r4 = r4.field_rewardProductId
            goto L25
        L24:
            r4 = r3
        L25:
            if (r4 != 0) goto L29
            java.lang.String r4 = ""
        L29:
            java.lang.String r5 = r0.f233928c
            boolean r4 = kotlin.jvm.internal.o.b(r5, r4)
            if (r4 == 0) goto L56
            int r4 = r6.f363613s
            int r5 = r0.f233929d
            if (r5 != r4) goto L56
            int r4 = r6.f363608n
            if (r4 != r2) goto L4e
            fg2.d1 r4 = r6.f363607m
            if (r4 == 0) goto L47
            com.tencent.mm.ui.widget.MMSwitchBtn r4 = r4.f261971c
            boolean r4 = r4.f211363x
            if (r4 == 0) goto L4e
            r4 = r2
            goto L4f
        L47:
            java.lang.String r0 = "uiBinding"
            kotlin.jvm.internal.o.o(r0)
            throw r3
        L4e:
            r4 = 2
        L4f:
            int r0 = r0.f233930e
            if (r0 == r4) goto L54
            goto L56
        L54:
            r0 = r1
            goto L57
        L56:
            r0 = r2
        L57:
            android.view.View r4 = r6.f118383f
            if (r0 != 0) goto L7a
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L62
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
        L62:
            if (r3 == 0) goto L98
            r3.setEnabled(r1)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099680(0x7f060020, float:1.781172E38)
            int r0 = r0.getColor(r1)
            r3.setTextColor(r0)
            goto L98
        L7a:
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L81
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
        L81:
            if (r3 == 0) goto L98
            r3.setEnabled(r2)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131102743(0x7f060c17, float:1.7817933E38)
            int r0 = r0.getColor(r1)
            r3.setTextColor(r0)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.q1.C():void");
    }

    public final void D(ce2.i iVar) {
        this.f363610p = iVar;
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorPkSettingPanelWidget", "notifyGiftSelect giftId: " + iVar.field_rewardProductId + " selectGiftInfo: " + this.f363610p);
        ce2.i iVar2 = this.f363610p;
        if (iVar2 != null) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(iVar2.field_thumbnailFileUrl, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            fg2.d1 d1Var = this.f363607m;
            if (d1Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.widget.ImageView selectGiftIcon = d1Var.f261980l;
            kotlin.jvm.internal.o.f(selectGiftIcon, "selectGiftIcon");
            a17.c(selectGiftIcon);
        }
    }

    public final void E() {
        fg2.d1 d1Var = this.f363607m;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var.f261990v.setVisibility(8);
        fg2.d1 d1Var2 = this.f363607m;
        if (d1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var2.f261989u.setVisibility(8);
        fg2.d1 d1Var3 = this.f363607m;
        if (d1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var3.f261970b.setVisibility(8);
        fg2.d1 d1Var4 = this.f363607m;
        if (d1Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var4.f261971c.setCheck(true);
        this.f363610p = null;
    }

    public final void F(r45.wz1 wz1Var, boolean z17) {
        jz5.f0 f0Var;
        r45.jm1 jm1Var;
        r45.jm1 jm1Var2;
        java.util.LinkedList list;
        w();
        this.f363614t = wz1Var;
        this.f363611q = wz1Var != null ? (r45.kl4) wz1Var.getCustom(10) : null;
        if (wz1Var != null && (jm1Var2 = (r45.jm1) wz1Var.getCustom(14)) != null && (list = jm1Var2.getList(0)) != null) {
            java.util.LinkedList linkedList = this.f363612r;
            linkedList.clear();
            linkedList.addAll(list);
        }
        r45.kl4 kl4Var = this.f363611q;
        fg2.d1 d1Var = this.f363607m;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        java.lang.String string = kl4Var != null ? kl4Var.getString(7) : null;
        boolean z18 = string == null || string.length() == 0;
        android.content.Context context = this.f118381d;
        d1Var.f261986r.setText(!z18 ? kl4Var != null ? kl4Var.getString(7) : null : context.getResources().getString(com.tencent.mm.R.string.lzw));
        fg2.d1 d1Var2 = this.f363607m;
        if (d1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        java.lang.String string2 = kl4Var != null ? kl4Var.getString(8) : null;
        d1Var2.f261988t.setText(!(string2 == null || string2.length() == 0) ? kl4Var != null ? kl4Var.getString(8) : null : context.getResources().getString(com.tencent.mm.R.string.lzy));
        fg2.d1 d1Var3 = this.f363607m;
        if (d1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        java.lang.String string3 = kl4Var != null ? kl4Var.getString(5) : null;
        d1Var3.f261975g.setText(!(string3 == null || string3.length() == 0) ? kl4Var != null ? kl4Var.getString(5) : null : context.getResources().getString(com.tencent.mm.R.string.ljh));
        fg2.d1 d1Var4 = this.f363607m;
        if (d1Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        java.lang.String string4 = kl4Var != null ? kl4Var.getString(6) : null;
        d1Var4.f261973e.setText(!(string4 == null || string4.length() == 0) ? kl4Var != null ? kl4Var.getString(6) : null : context.getResources().getString(com.tencent.mm.R.string.ljf));
        gk2.e eVar = this.f363605h;
        if (z17) {
            dk2.pf pfVar = ((mm2.y2) eVar.a(mm2.y2.class)).f329566s;
            if (pfVar != null) {
                int i17 = pfVar.f233926a;
                if (i17 == 1) {
                    y();
                } else if (i17 == 2) {
                    z();
                }
                int i18 = pfVar.f233927b;
                if (i18 == 0) {
                    A();
                } else if (i18 == 1) {
                    B();
                    ce2.i e17 = dk2.u7.f234181a.e(pfVar.f233928c);
                    if (e17 != null) {
                        D(e17);
                    }
                }
                this.f363613s = pfVar.f233929d;
                fg2.d1 d1Var5 = this.f363607m;
                if (d1Var5 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                d1Var5.f261971c.setCheck(pfVar.f233930e == 1);
                fg2.d1 d1Var6 = this.f363607m;
                if (d1Var6 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                d1Var6.f261977i.setText(context.getResources().getString(com.tencent.mm.R.string.lzf, java.lang.Integer.valueOf(this.f363613s / 60)));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                y();
                A();
                fg2.d1 d1Var7 = this.f363607m;
                if (d1Var7 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                d1Var7.f261971c.setCheck(true);
                r45.wz1 wz1Var2 = this.f363614t;
                this.f363613s = (wz1Var2 == null || (jm1Var = (r45.jm1) wz1Var2.getCustom(14)) == null) ? 300 : jm1Var.getInteger(1);
                fg2.d1 d1Var8 = this.f363607m;
                if (d1Var8 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                d1Var8.f261977i.setText(context.getResources().getString(com.tencent.mm.R.string.lzf, java.lang.Integer.valueOf(this.f363613s / 60)));
            }
        }
        fg2.d1 d1Var9 = this.f363607m;
        if (d1Var9 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var9.f261977i.setText(context.getResources().getString(com.tencent.mm.R.string.lzf, java.lang.Integer.valueOf(this.f363613s / 60)));
        C();
        if (((mm2.e1) eVar.a(mm2.e1.class)).g7()) {
            E();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return g();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        android.widget.TextView f17 = f();
        f17.setEnabled(true);
        f17.setTextColor(f17.getContext().getColor(com.tencent.mm.R.color.aaz));
        f17.setText(f17.getContext().getResources().getString(com.tencent.mm.R.string.d6t));
        return f17;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dkt;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.dvn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkSettingPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.d1 d1Var = this.f363607m;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = d1Var.f261985q.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            y();
        } else {
            fg2.d1 d1Var2 = this.f363607m;
            if (d1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = d1Var2.f261987s.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                z();
            } else {
                fg2.d1 d1Var3 = this.f363607m;
                if (d1Var3 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                int id8 = d1Var3.f261974f.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    A();
                } else {
                    fg2.d1 d1Var4 = this.f363607m;
                    if (d1Var4 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = d1Var4.f261972d.getId();
                    jz5.g gVar = this.f363615u;
                    if (valueOf == null || valueOf.intValue() != id9) {
                        fg2.d1 d1Var5 = this.f363607m;
                        if (d1Var5 == null) {
                            kotlin.jvm.internal.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = d1Var5.f261981m.getId();
                        if (valueOf != null && valueOf.intValue() == id10) {
                            a();
                            qi2.w0 w0Var = (qi2.w0) ((jz5.n) gVar).getValue();
                            com.tencent.mm.plugin.finder.live.util.y.m(w0Var.f363647h.a(), kotlinx.coroutines.q1.f310570c, null, new qi2.v0(w0Var, 1, null), 2, null);
                            w0Var.w();
                        } else {
                            fg2.d1 d1Var6 = this.f363607m;
                            if (d1Var6 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = d1Var6.f261976h.getId();
                            if (valueOf != null && valueOf.intValue() == id11) {
                                ((qi2.m0) ((jz5.n) this.f363616v).getValue()).y(this.f363612r, this.f363613s);
                                a();
                            }
                        }
                    } else if (this.f363610p == null) {
                        a();
                        qi2.w0 w0Var2 = (qi2.w0) ((jz5.n) gVar).getValue();
                        com.tencent.mm.plugin.finder.live.util.y.m(w0Var2.f363647h.a(), kotlinx.coroutines.q1.f310570c, null, new qi2.v0(w0Var2, 1, null), 2, null);
                        w0Var2.w();
                    } else {
                        B();
                    }
                }
            }
        }
        if (((mm2.e1) this.f363605h.a(mm2.e1.class)).g7()) {
            E();
        }
        C();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkSettingPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.h7q;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.h7q);
        if (constraintLayout != null) {
            i17 = com.tencent.mm.R.id.h8q;
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(rootView, com.tencent.mm.R.id.h8q);
            if (mMSwitchBtn != null) {
                i17 = com.tencent.mm.R.id.h8r;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.h8r);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.lly;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.lly);
                    if (weImageView != null) {
                        i17 = com.tencent.mm.R.id.q6g;
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.q6g);
                        if (constraintLayout2 != null) {
                            i17 = com.tencent.mm.R.id.q6h;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q6h);
                            if (textView2 != null) {
                                i17 = com.tencent.mm.R.id.q6i;
                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q6i);
                                if (textView3 != null) {
                                    i17 = com.tencent.mm.R.id.f485164q72;
                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f485164q72);
                                    if (weImageView2 != null) {
                                        i17 = com.tencent.mm.R.id.q7e;
                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.q7e);
                                        if (constraintLayout3 != null) {
                                            i17 = com.tencent.mm.R.id.q7f;
                                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q7f);
                                            if (textView4 != null) {
                                                i17 = com.tencent.mm.R.id.q7g;
                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q7g);
                                                if (textView5 != null) {
                                                    i17 = com.tencent.mm.R.id.qv8;
                                                    com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.qv8);
                                                    if (roundCornerConstraintLayout != null) {
                                                        i17 = com.tencent.mm.R.id.qv9;
                                                        android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.qv9);
                                                        if (textView6 != null) {
                                                            i17 = com.tencent.mm.R.id.qv_;
                                                            android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.qv_);
                                                            if (textView7 != null) {
                                                                i17 = com.tencent.mm.R.id.q9q;
                                                                com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.q9q);
                                                                if (roundCornerLinearLayout != null) {
                                                                    i17 = com.tencent.mm.R.id.q9r;
                                                                    android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q9r);
                                                                    if (textView8 != null) {
                                                                        i17 = com.tencent.mm.R.id.q_r;
                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_r);
                                                                        if (weImageView3 != null) {
                                                                            i17 = com.tencent.mm.R.id.q_s;
                                                                            android.view.View a17 = x4.b.a(rootView, com.tencent.mm.R.id.q_s);
                                                                            if (a17 != null) {
                                                                                i17 = com.tencent.mm.R.id.q_t;
                                                                                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_t);
                                                                                if (imageView != null) {
                                                                                    i17 = com.tencent.mm.R.id.q_u;
                                                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.q_u);
                                                                                    if (constraintLayout4 != null) {
                                                                                        i17 = com.tencent.mm.R.id.q_v;
                                                                                        android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q_v);
                                                                                        if (textView9 != null) {
                                                                                            i17 = com.tencent.mm.R.id.q_w;
                                                                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_w);
                                                                                            if (weImageView4 != null) {
                                                                                                i17 = com.tencent.mm.R.id.q_y;
                                                                                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_y);
                                                                                                if (weImageView5 != null) {
                                                                                                    i17 = com.tencent.mm.R.id.q_z;
                                                                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_z);
                                                                                                    if (weImageView6 != null) {
                                                                                                        i17 = com.tencent.mm.R.id.mz6;
                                                                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.mz6);
                                                                                                        if (constraintLayout5 != null) {
                                                                                                            i17 = com.tencent.mm.R.id.mz7;
                                                                                                            android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.mz7);
                                                                                                            if (textView10 != null) {
                                                                                                                i17 = com.tencent.mm.R.id.mz8;
                                                                                                                android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.mz8);
                                                                                                                if (textView11 != null) {
                                                                                                                    i17 = com.tencent.mm.R.id.f487237nz5;
                                                                                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout6 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.f487237nz5);
                                                                                                                    if (constraintLayout6 != null) {
                                                                                                                        i17 = com.tencent.mm.R.id.nz6;
                                                                                                                        android.widget.TextView textView12 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.nz6);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i17 = com.tencent.mm.R.id.nz7;
                                                                                                                            android.widget.TextView textView13 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.nz7);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i17 = com.tencent.mm.R.id.qcb;
                                                                                                                                com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout2 = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.qcb);
                                                                                                                                if (roundCornerLinearLayout2 != null) {
                                                                                                                                    i17 = com.tencent.mm.R.id.qcc;
                                                                                                                                    android.widget.TextView textView14 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.qcc);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        this.f363607m = new fg2.d1((androidx.core.widget.NestedScrollView) rootView, constraintLayout, mMSwitchBtn, textView, weImageView, constraintLayout2, textView2, textView3, weImageView2, constraintLayout3, textView4, textView5, roundCornerConstraintLayout, textView6, textView7, roundCornerLinearLayout, textView8, weImageView3, a17, imageView, constraintLayout4, textView9, weImageView4, weImageView5, weImageView6, constraintLayout5, textView10, textView11, constraintLayout6, textView12, textView13, roundCornerLinearLayout2, textView14);
                                                                                                                                        constraintLayout5.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var = this.f363607m;
                                                                                                                                        if (d1Var == null) {
                                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var.f261987s.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var2 = this.f363607m;
                                                                                                                                        if (d1Var2 == null) {
                                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var2.f261972d.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var3 = this.f363607m;
                                                                                                                                        if (d1Var3 == null) {
                                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var3.f261974f.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var4 = this.f363607m;
                                                                                                                                        if (d1Var4 == null) {
                                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var4.f261981m.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var5 = this.f363607m;
                                                                                                                                        if (d1Var5 == null) {
                                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var5.f261976h.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var6 = this.f363607m;
                                                                                                                                        if (d1Var6 == null) {
                                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var6.f261971c.setCheck(true);
                                                                                                                                        fg2.d1 d1Var7 = this.f363607m;
                                                                                                                                        if (d1Var7 == null) {
                                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var7.f261971c.setSwitchListener(new qi2.o1(this));
                                                                                                                                        y();
                                                                                                                                        A();
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void u() {
        a();
        this.f363606i.onCancel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r7.f261971c.f211363x != false) goto L18;
     */
    @Override // com.tencent.mm.plugin.finder.live.widget.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v() {
        /*
            r8 = this;
            dk2.pf r6 = new dk2.pf
            int r1 = r8.f363608n
            int r2 = r8.f363609o
            ce2.i r0 = r8.f363610p
            r3 = 0
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.field_rewardProductId
            goto Lf
        Le:
            r0 = r3
        Lf:
            if (r0 != 0) goto L13
            java.lang.String r0 = ""
        L13:
            r4 = r0
            int r5 = r8.f363613s
            r0 = 1
            if (r1 != r0) goto L2b
            fg2.d1 r7 = r8.f363607m
            if (r7 == 0) goto L24
            com.tencent.mm.ui.widget.MMSwitchBtn r3 = r7.f261971c
            boolean r3 = r3.f211363x
            if (r3 == 0) goto L2b
            goto L2c
        L24:
            java.lang.String r0 = "uiBinding"
            kotlin.jvm.internal.o.o(r0)
            throw r3
        L2b:
            r0 = 2
        L2c:
            r7 = r0
            r0 = r6
            r3 = r4
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            qi2.p1 r0 = new qi2.p1
            r0.<init>(r8)
            si2.b r1 = r8.f363606i
            r1.c(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.q1.v():void");
    }

    public final void y() {
        this.f363608n = 1;
        fg2.d1 d1Var = this.f363607m;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var.f261983o.setVisibility(0);
        fg2.d1 d1Var2 = this.f363607m;
        if (d1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var2.f261970b.setVisibility(0);
        fg2.d1 d1Var3 = this.f363607m;
        if (d1Var3 != null) {
            d1Var3.f261984p.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void z() {
        this.f363608n = 2;
        fg2.d1 d1Var = this.f363607m;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var.f261983o.setVisibility(8);
        fg2.d1 d1Var2 = this.f363607m;
        if (d1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var2.f261984p.setVisibility(0);
        fg2.d1 d1Var3 = this.f363607m;
        if (d1Var3 != null) {
            d1Var3.f261970b.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }
}
