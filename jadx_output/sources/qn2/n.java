package qn2;

/* loaded from: classes3.dex */
public final class n extends qn2.z {
    public final qo0.c A;
    public final java.lang.String B;
    public final int C;
    public final int D;
    public final int E;
    public android.view.View F;
    public android.widget.TextView G;
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f365117J;
    public android.widget.TextView K;
    public android.view.View L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public androidx.recyclerview.widget.RecyclerView S;
    public android.view.View T;
    public android.widget.TextView U;
    public com.tencent.mm.plugin.finder.lottery.card.FinderLiveLotteryCardGiftWidget V;
    public android.view.View W;
    public android.widget.TextView X;
    public qn2.c0 Y;
    public boolean Z;

    /* renamed from: p0, reason: collision with root package name */
    public final yz5.l f365118p0;

    /* renamed from: x0, reason: collision with root package name */
    public final yz5.l f365119x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.A = statusMonitor;
        this.B = "FinderLiveLotteryAnchorCardPlugin";
        this.C = 1;
        this.D = 2;
        this.E = 10;
        this.f365118p0 = new qn2.d(this);
        this.f365119x0 = new qn2.f(this);
    }

    public static final void y1(qn2.n nVar, r45.cz1 cz1Var) {
        r45.cz1 cz1Var2;
        r45.jz1 jz1Var;
        java.util.LinkedList list;
        r45.cz1 cz1Var3;
        boolean a86 = ((mm2.c1) nVar.P0(mm2.c1.class)).a8();
        java.lang.String str = nVar.B;
        if (!a86) {
            nVar.K0(8);
            com.tencent.mars.xlog.Log.i(str, "anchorDoneAction liveStatus:" + ((mm2.c1) nVar.P0(mm2.c1.class)).f328813h2);
            return;
        }
        r45.ht1 ht1Var = ((on2.z2) nVar.P0(on2.z2.class)).f347094o;
        if (ht1Var != null && (cz1Var3 = (r45.cz1) ht1Var.getCustom(1)) != null) {
            cz1Var = cz1Var3;
        }
        kotlin.jvm.internal.o.d(cz1Var);
        int integer = cz1Var.getInteger(7);
        android.view.ViewGroup viewGroup = nVar.f365323d;
        if (integer > 0) {
            nVar.A1(nVar.C);
            qn2.c0 c0Var = nVar.Y;
            if (c0Var != null) {
                com.tencent.mars.xlog.Log.i("Finder.LiveLotteryWinnerListAdapter", "clear");
                c0Var.f365048e.clear();
                c0Var.notifyDataSetChanged();
            }
            r45.ht1 ht1Var2 = ((on2.z2) nVar.P0(on2.z2.class)).f347094o;
            int size = (ht1Var2 == null || (jz1Var = (r45.jz1) ht1Var2.getCustom(4)) == null || (list = jz1Var.getList(0)) == null) ? 0 : list.size();
            com.tencent.mars.xlog.Log.i(str, "parseWinnerList winnerListSize:" + size);
            if (size > 0) {
                nVar.C1(ht1Var2);
            } else {
                km2.z zVar = ((on2.z2) nVar.P0(on2.z2.class)).f347092m;
                java.lang.String string = (zVar == null || (cz1Var2 = zVar.f309232d) == null) ? null : cz1Var2.getString(0);
                com.tencent.mars.xlog.Log.i(str, "parseWinnerList record is empty!lotteryId:" + string);
                dk2.xf W0 = nVar.W0();
                if (W0 != null) {
                    if (string == null) {
                        string = "";
                    }
                    r45.ht1 ht1Var3 = ((on2.z2) nVar.P0(on2.z2.class)).f347094o;
                    ((dk2.r4) W0).N(string, ht1Var3 != null ? ht1Var3.getByteString(2) : null, new qn2.l(nVar));
                }
            }
            android.widget.TextView textView = nVar.K;
            if (textView != null) {
                textView.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dre));
            }
        } else {
            nVar.A1(nVar.D);
            nVar.B1(nVar.P, cz1Var);
            android.widget.TextView textView2 = nVar.N;
            if (textView2 != null) {
                textView2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491636dr2));
            }
            android.widget.TextView textView3 = nVar.K;
            if (textView3 != null) {
                on2.l3.f346966a.f(textView3);
            }
        }
        android.view.View view = nVar.f365225u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorDoneAction", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorDoneAction", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        nVar.K0(0);
    }

    public static final void z1(qn2.n nVar, r45.cz1 cz1Var) {
        nVar.A1(0);
        nVar.B1(nVar.G, cz1Var);
        android.widget.TextView textView = nVar.H;
        android.view.ViewGroup viewGroup = nVar.f365323d;
        if (textView != null) {
            textView.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dok));
        }
        if (cz1Var.getInteger(7) > 0) {
            android.widget.TextView textView2 = nVar.I;
            if (textView2 != null) {
                java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dop);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cz1Var.getInteger(7))}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                textView2.setText(format);
            }
        } else {
            android.widget.TextView textView3 = nVar.I;
            if (textView3 != null) {
                textView3.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491635dr1));
            }
        }
        android.widget.TextView textView4 = nVar.f365117J;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        nVar.K0(0);
        android.view.View view = nVar.f365225u;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void A1(int i17) {
        com.tencent.mars.xlog.Log.i(this.B, "chooseContainer ui mode:" + i17);
        if (i17 == this.C) {
            android.view.View view = this.F;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.M;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.L;
            if (view3 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == this.D) {
            android.view.View view4 = this.F;
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = this.M;
            if (view5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view6 = this.L;
            if (view6 == null) {
                return;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.F;
        if (view7 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view8 = this.M;
        if (view8 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view9 = this.L;
        if (view9 == null) {
            return;
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
        arrayList9.add(8);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view9, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void B1(android.widget.TextView textView, r45.cz1 cz1Var) {
        android.view.ViewGroup viewGroup = this.f365323d;
        java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491628dq2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String string2 = cz1Var.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        objArr[0] = string2;
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        int integer = cz1Var.getInteger(6);
        if (textView == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(format);
        sb6.append('\n');
        java.lang.String string3 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491630dq4);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(integer)}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        sb6.append(format2);
        textView.setText(sb6.toString());
    }

    public final void C1(r45.ht1 ht1Var) {
        r45.jz1 jz1Var;
        jz5.f0 f0Var = null;
        r1 = null;
        java.util.LinkedList linkedList = null;
        r45.cz1 cz1Var = ht1Var != null ? (r45.cz1) ht1Var.getCustom(1) : null;
        java.lang.String str = this.B;
        if (cz1Var != null) {
            android.widget.TextView textView = this.Q;
            android.view.ViewGroup viewGroup = this.f365323d;
            if (textView != null) {
                java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dsc);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cz1Var.getInteger(10))}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                textView.setText(format);
            }
            android.widget.TextView textView2 = this.R;
            if (textView2 != null) {
                java.lang.String string2 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491639dr4);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cz1Var.getInteger(7))}, 1));
                kotlin.jvm.internal.o.f(format2, "format(...)");
                textView2.setText(format2);
            }
        } else {
            com.tencent.mars.xlog.Log.e(str, "updateWinnerList error lotteryInfo is empty!");
        }
        qn2.c0 c0Var = this.Y;
        if (c0Var != null) {
            if (ht1Var != null && (jz1Var = (r45.jz1) ht1Var.getCustom(4)) != null) {
                linkedList = jz1Var.getList(0);
            }
            c0Var.y(linkedList, cz1Var);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(str, "updateWinnerList but winnderAdapter is null!");
        }
        qn2.c0 c0Var2 = this.Y;
        if (c0Var2 != null) {
            c0Var2.notifyDataSetChanged();
        }
    }

    @Override // qn2.z
    public void v1() {
        super.v1();
        android.view.ViewGroup viewGroup = this.f365323d;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.m8k);
        this.F = findViewById;
        this.G = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.f484050cu2) : null;
        android.view.View view = this.F;
        this.H = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484066cw1) : null;
        android.view.View view2 = this.F;
        android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.cwa) : null;
        this.I = textView;
        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.view.View view3 = this.F;
        this.f365117J = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.f482989tn) : null;
        android.view.View view4 = this.F;
        this.V = view4 != null ? (com.tencent.mm.plugin.finder.lottery.card.FinderLiveLotteryCardGiftWidget) view4.findViewById(com.tencent.mm.R.id.f485162q70) : null;
        android.view.View view5 = this.F;
        this.W = view5 != null ? view5.findViewById(com.tencent.mm.R.id.q6w) : null;
        android.view.View view6 = this.F;
        this.X = view6 != null ? (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.q6j) : null;
        android.widget.TextView textView2 = this.f365117J;
        com.tencent.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
        android.widget.TextView textView3 = this.f365117J;
        if (textView3 != null) {
            textView3.setOnClickListener(new qn2.h(this));
        }
        android.widget.TextView textView4 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.au7);
        this.K = textView4;
        if (textView4 != null) {
            on2.l3.f346966a.f(textView4);
        }
        this.L = viewGroup.findViewById(com.tencent.mm.R.id.pmt);
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.kcz);
        this.M = findViewById2;
        this.P = findViewById2 != null ? (android.widget.TextView) findViewById2.findViewById(com.tencent.mm.R.id.f486151kd0) : null;
        android.view.View view7 = this.M;
        android.widget.TextView textView5 = view7 != null ? (android.widget.TextView) view7.findViewById(com.tencent.mm.R.id.kcy) : null;
        this.N = textView5;
        com.tencent.mm.ui.bk.r0(textView5 != null ? textView5.getPaint() : null, 0.8f);
        android.widget.TextView textView6 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.pms);
        this.Q = textView6;
        com.tencent.mm.ui.bk.r0(textView6 != null ? textView6.getPaint() : null, 0.8f);
        this.R = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.oho);
        android.view.View view8 = this.L;
        this.S = view8 != null ? (androidx.recyclerview.widget.RecyclerView) view8.findViewById(com.tencent.mm.R.id.pmx) : null;
        this.Y = new qn2.c0(S0());
        androidx.recyclerview.widget.RecyclerView recyclerView = this.S;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(viewGroup.getContext(), 1, false));
            recyclerView.setAdapter(this.Y);
            recyclerView.i(new qn2.g(this));
        }
        android.view.View view9 = this.L;
        this.T = view9 != null ? view9.findViewById(com.tencent.mm.R.id.pmu) : null;
        android.view.View view10 = this.L;
        this.U = view10 != null ? (android.widget.TextView) view10.findViewById(com.tencent.mm.R.id.ili) : null;
    }

    @Override // qn2.z
    public void w1(boolean z17, km2.z lotteryInfoWrapper) {
        kotlin.jvm.internal.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        super.w1(z17, lotteryInfoWrapper);
        pm0.v.X(new qn2.a(lotteryInfoWrapper, this, z17));
    }
}
