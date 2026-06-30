package qn2;

/* loaded from: classes3.dex */
public final class i0 extends qn2.z {
    public final qo0.c A;
    public volatile int B;
    public android.view.ViewGroup C;
    public qn2.l1 D;
    public android.view.ViewGroup E;
    public qn2.u1 F;
    public android.view.ViewGroup G;
    public qn2.v0 H;
    public final yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.l f365078J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.A = statusMonitor;
        this.B = -1;
        this.I = new qn2.e0(this);
        this.f365078J = new qn2.g0(this);
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        s71.b bVar;
        byte[] byteArrayExtra;
        qn2.v0 v0Var = this.H;
        if (v0Var != null && i17 == 1001 && i18 == -1) {
            if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("launch_from_select_addr")) == null) {
                bVar = null;
            } else {
                bVar = new s71.b();
                bVar.parseFrom(byteArrayExtra);
            }
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e("VisitorLotteryCardDoneWidget", "request addr but result is empty!");
                return;
            }
            android.content.Context context = v0Var.f365177b.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(context.getResources().getString(com.tencent.mm.R.string.dpc));
            u1Var.n(context.getResources().getString(com.tencent.mm.R.string.dpb));
            u1Var.j(context.getResources().getString(com.tencent.mm.R.string.dpa));
            u1Var.i(new on2.b3(u1Var));
            u1Var.l(new qn2.r0(v0Var, bVar));
            u1Var.q(false);
            v0Var.f365201z = u1Var.f211998c;
        }
    }

    @Override // qn2.z, com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            super.K0(i17);
        } else {
            this.f365323d.setVisibility(8);
            com.tencent.mars.xlog.Log.w("FinderLiveLotteryVisitorCardPlugin", "setVisible return for isTeenMode");
        }
    }

    @Override // qn2.z, com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        qn2.v0 v0Var = this.H;
        if (v0Var != null) {
            com.tencent.mm.plugin.finder.view.c1 c1Var = v0Var.f365200y;
            if (c1Var != null) {
                c1Var.q();
            }
            com.tencent.mm.ui.widget.dialog.j0 j0Var = v0Var.f365201z;
            if (j0Var != null) {
                j0Var.dismiss();
            }
        }
    }

    @Override // qn2.z
    public void t1() {
        super.t1();
        this.B = -1;
    }

    @Override // qn2.z
    public void v1() {
        super.v1();
        android.view.ViewGroup viewGroup = this.f365323d;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.m8k);
        this.C = viewGroup2;
        android.view.View view = this.f365225u;
        android.view.View view2 = this.f365226v;
        if (viewGroup2 != null && view != null && view2 != null) {
            qn2.l1 l1Var = new qn2.l1(this, viewGroup2, view, view2);
            this.D = l1Var;
            android.view.ViewGroup viewGroup3 = l1Var.f365092b;
            l1Var.f365101k = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.f484050cu2);
            l1Var.f365102l = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.cwn);
            android.widget.TextView textView = l1Var.f365101k;
            com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
            l1Var.f365103m = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.f484066cw1);
            l1Var.f365104n = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.cwa);
            l1Var.f365105o = viewGroup3.findViewById(com.tencent.mm.R.id.f487078nf3);
            l1Var.f365107q = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.gx_);
            l1Var.f365106p = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.a6b);
            l1Var.f365108r = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.obc);
            l1Var.f365109s = viewGroup3.findViewById(com.tencent.mm.R.id.q89);
            l1Var.f365110t = (android.widget.ImageView) viewGroup3.findViewById(com.tencent.mm.R.id.f486441l74);
            l1Var.f365111u = viewGroup3.findViewById(com.tencent.mm.R.id.l6s);
            l1Var.f365112v = (com.tencent.mm.plugin.finder.lottery.card.FinderLiveLotteryCardGiftWidget) viewGroup3.findViewById(com.tencent.mm.R.id.q6w);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(l1Var.f365106p, "finder_live_participate_lucky");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(l1Var.f365106p, 40, 25561);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(l1Var.f365106p, new qn2.w0(l1Var));
            android.widget.TextView textView2 = l1Var.f365106p;
            if (textView2 != null) {
                textView2.setOnClickListener(new qn2.x0(l1Var));
            }
            android.view.View view3 = l1Var.f365094d;
            android.widget.TextView textView3 = (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.au7);
            on2.l3 l3Var = on2.l3.f346966a;
            kotlin.jvm.internal.o.d(textView3);
            l3Var.f(textView3);
            android.widget.TextView textView4 = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.au7);
            view3.setTag(com.tencent.mm.R.id.e6f, textView4 != null ? textView4.getText() : null);
        }
        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.pmt);
        this.E = viewGroup4;
        android.view.View view4 = this.f365225u;
        android.view.View view5 = this.f365226v;
        if (viewGroup4 != null && view4 != null && view5 != null) {
            qn2.u1 u1Var = new qn2.u1(this, viewGroup4, view4, view5);
            this.F = u1Var;
            android.view.ViewGroup viewGroup5 = u1Var.f365163b;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup5.findViewById(com.tencent.mm.R.id.f485715ir0);
            u1Var.f365167f = weImageView;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = u1Var.f365167f;
            if (weImageView2 != null) {
                weImageView2.post(new qn2.n1(u1Var));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = u1Var.f365167f;
            if (weImageView3 != null) {
                weImageView3.setOnClickListener(new qn2.o1(u1Var));
            }
            android.widget.TextView textView5 = (android.widget.TextView) viewGroup5.findViewById(com.tencent.mm.R.id.pms);
            u1Var.f365168g = textView5;
            com.tencent.mm.ui.bk.r0(textView5 != null ? textView5.getPaint() : null, 0.8f);
            u1Var.f365169h = (android.widget.TextView) viewGroup5.findViewById(com.tencent.mm.R.id.oho);
            u1Var.f365170i = (androidx.recyclerview.widget.RecyclerView) viewGroup5.findViewById(com.tencent.mm.R.id.pmx);
            u1Var.f365173l = new qn2.c0(u1Var.f365162a.S0());
            androidx.recyclerview.widget.RecyclerView recyclerView = u1Var.f365170i;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(viewGroup5.getContext(), 1, false));
                recyclerView.setAdapter(u1Var.f365173l);
                recyclerView.i(new qn2.p1(u1Var));
            }
            u1Var.f365171j = viewGroup5.findViewById(com.tencent.mm.R.id.pmu);
            u1Var.f365172k = (android.widget.TextView) viewGroup5.findViewById(com.tencent.mm.R.id.ili);
        }
        android.view.ViewGroup viewGroup6 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.ish);
        this.G = viewGroup6;
        android.view.View view6 = this.f365225u;
        android.view.View view7 = this.f365226v;
        if (viewGroup6 == null || view6 == null || view7 == null) {
            return;
        }
        qn2.v0 v0Var = new qn2.v0(this, viewGroup6, view6, view7);
        this.H = v0Var;
        android.view.ViewGroup viewGroup7 = v0Var.f365177b;
        android.widget.TextView textView6 = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.kcv);
        v0Var.f365180e = textView6;
        com.tencent.mm.ui.bk.r0(textView6 != null ? textView6.getPaint() : null, 0.8f);
        android.widget.TextView textView7 = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.pmy);
        v0Var.f365181f = textView7;
        com.tencent.mm.ui.bk.r0(textView7 != null ? textView7.getPaint() : null, 0.8f);
        v0Var.f365182g = (android.widget.ImageView) viewGroup7.findViewById(com.tencent.mm.R.id.pmp);
        v0Var.f365183h = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.pmv);
        v0Var.f365184i = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.f486429l62);
        v0Var.f365185j = (android.widget.ImageView) viewGroup7.findViewById(com.tencent.mm.R.id.i0e);
        v0Var.f365186k = (android.widget.ImageView) viewGroup7.findViewById(com.tencent.mm.R.id.m48);
        v0Var.f365187l = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.dkh);
        v0Var.f365199x = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.f483742bx3);
        v0Var.f365188m = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.f485163q71);
        v0Var.f365189n = (com.tencent.mm.plugin.finder.lottery.card.FinderLiveLotteryCardGiftWidget) viewGroup7.findViewById(com.tencent.mm.R.id.f485162q70);
        v0Var.f365190o = viewGroup7.findViewById(com.tencent.mm.R.id.f483864q40);
        v0Var.f365191p = viewGroup7.findViewById(com.tencent.mm.R.id.q6_);
        v0Var.f365192q = (android.widget.ImageView) viewGroup7.findViewById(com.tencent.mm.R.id.q7a);
        v0Var.f365193r = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.q7b);
        v0Var.f365197v = viewGroup7.findViewById(com.tencent.mm.R.id.q7c);
        v0Var.f365198w = viewGroup7.findViewById(com.tencent.mm.R.id.q3_);
        android.widget.TextView textView8 = v0Var.f365199x;
        if (textView8 != null) {
            textView8.setOnClickListener(new qn2.m0(v0Var));
        }
        android.view.View findViewById = viewGroup7.findViewById(com.tencent.mm.R.id.ira);
        v0Var.f365194s = findViewById;
        if (findViewById != null) {
            findViewById.post(new qn2.n0(v0Var));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(v0Var.f365194s, "finder_live_win_result_list");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(v0Var.f365194s, 8, 25561);
        android.view.View view8 = v0Var.f365194s;
        if (view8 != null) {
            view8.setOnClickListener(new qn2.o0(v0Var));
        }
        v0Var.f365195t = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.ir_);
        v0Var.f365196u = viewGroup7.findViewById(com.tencent.mm.R.id.iqz);
    }

    @Override // qn2.z
    public void w1(boolean z17, km2.z lotteryInfoWrapper) {
        kotlin.jvm.internal.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        super.w1(z17, lotteryInfoWrapper);
        pm0.v.X(new qn2.h0(lotteryInfoWrapper, z17, this));
    }

    public final void y1(int i17) {
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryVisitorCardPlugin", "chooseContainer ui mode:" + i17);
        this.B = i17;
        if (i17 == 0) {
            android.view.ViewGroup viewGroup = this.C;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            android.view.ViewGroup viewGroup2 = this.E;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            android.view.ViewGroup viewGroup3 = this.G;
            if (viewGroup3 == null) {
                return;
            }
            viewGroup3.setVisibility(8);
            return;
        }
        if (i17 == 1) {
            android.view.ViewGroup viewGroup4 = this.C;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
            android.view.ViewGroup viewGroup5 = this.E;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(0);
            }
            android.view.ViewGroup viewGroup6 = this.G;
            if (viewGroup6 == null) {
                return;
            }
            viewGroup6.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            android.view.ViewGroup viewGroup7 = this.C;
            if (viewGroup7 != null) {
                viewGroup7.setVisibility(8);
            }
            android.view.ViewGroup viewGroup8 = this.E;
            if (viewGroup8 != null) {
                viewGroup8.setVisibility(8);
            }
            android.view.ViewGroup viewGroup9 = this.G;
            if (viewGroup9 != null) {
                viewGroup9.setVisibility(0);
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.p4 p4Var = ml2.p4.f327799m;
            ml2.v4[] v4VarArr = ml2.v4.f328149d;
            ml2.r0.ek(r0Var, p4Var, java.lang.String.valueOf(2), null, 0, null, 28, null);
            return;
        }
        if (i17 != 3) {
            return;
        }
        android.view.ViewGroup viewGroup10 = this.C;
        if (viewGroup10 != null) {
            viewGroup10.setVisibility(8);
        }
        android.view.ViewGroup viewGroup11 = this.E;
        if (viewGroup11 != null) {
            viewGroup11.setVisibility(8);
        }
        android.view.ViewGroup viewGroup12 = this.G;
        if (viewGroup12 != null) {
            viewGroup12.setVisibility(0);
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var2 = (ml2.r0) c18;
        ml2.p4 p4Var2 = ml2.p4.f327799m;
        ml2.v4[] v4VarArr2 = ml2.v4.f328149d;
        ml2.r0.ek(r0Var2, p4Var2, java.lang.String.valueOf(1), null, 0, null, 28, null);
    }

    public final void z1(boolean z17) {
        r45.cz1 cz1Var;
        r45.jz1 jz1Var;
        java.util.LinkedList list;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        qn2.u1 u1Var = this.F;
        if (u1Var != null) {
            qn2.i0 i0Var = u1Var.f365162a;
            on2.z2 z2Var = (on2.z2) i0Var.P0(on2.z2.class);
            km2.z zVar = z2Var.f347092m;
            int integer = (zVar == null || (cz1Var3 = zVar.f309232d) == null) ? 0 : cz1Var3.getInteger(10);
            km2.z zVar2 = z2Var.f347092m;
            java.lang.String str = "visitorLotteryDoneWinnerList realWinnerCnt:" + integer + ",participateCount:" + ((zVar2 == null || (cz1Var2 = zVar2.f309232d) == null) ? 0 : cz1Var2.getInteger(7));
            java.lang.String str2 = u1Var.f365166e;
            com.tencent.mars.xlog.Log.i(str2, str);
            qn2.c0 c0Var = u1Var.f365173l;
            if (c0Var != null) {
                com.tencent.mars.xlog.Log.i("Finder.LiveLotteryWinnerListAdapter", "clear");
                c0Var.f365048e.clear();
                c0Var.notifyDataSetChanged();
            }
            android.widget.TextView textView = u1Var.f365168g;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = u1Var.f365169h;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = u1Var.f365170i;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            r45.ht1 ht1Var = z2Var.f347094o;
            int size = (ht1Var == null || (jz1Var = (r45.jz1) ht1Var.getCustom(4)) == null || (list = jz1Var.getList(0)) == null) ? 0 : list.size();
            com.tencent.mars.xlog.Log.i(str2, "parseWinnerList winnerListSize:" + size);
            if (size > 0) {
                u1Var.a(ht1Var);
            } else {
                km2.z zVar3 = ((on2.z2) i0Var.P0(on2.z2.class)).f347092m;
                java.lang.String string = (zVar3 == null || (cz1Var = zVar3.f309232d) == null) ? null : cz1Var.getString(0);
                com.tencent.mars.xlog.Log.i(str2, "parseWinnerList record is empty!lotteryId:" + string);
                dk2.xf W0 = i0Var.W0();
                if (W0 != null) {
                    if (string == null) {
                        string = "";
                    }
                    r45.ht1 ht1Var2 = ((on2.z2) i0Var.P0(on2.z2.class)).f347094o;
                    ((dk2.r4) W0).N(string, ht1Var2 != null ? ht1Var2.getByteString(2) : null, new qn2.s1(u1Var));
                }
            }
            if (z17) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = u1Var.f365167f;
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                }
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = u1Var.f365167f;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(8);
                }
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ek((ml2.r0) c17, ml2.p4.f327800n, "", null, 0, null, 28, null);
        }
    }
}
