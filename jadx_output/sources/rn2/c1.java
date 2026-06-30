package rn2;

/* loaded from: classes15.dex */
public final class c1 implements rn2.f {
    public r45.gz1 A;
    public r45.qa1 B;
    public kotlinx.coroutines.r2 C;
    public final kotlinx.coroutines.y0 D;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f397664d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f397665e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f397666f;

    /* renamed from: g, reason: collision with root package name */
    public rn2.g f397667g;

    /* renamed from: h, reason: collision with root package name */
    public int f397668h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f397669i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f397670m;

    /* renamed from: n, reason: collision with root package name */
    public int f397671n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f397672o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f397673p;

    /* renamed from: q, reason: collision with root package name */
    public r45.h32 f397674q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f397675r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f397676s;

    /* renamed from: t, reason: collision with root package name */
    public final long f397677t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f397678u;

    /* renamed from: v, reason: collision with root package name */
    public final long f397679v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f397680w;

    /* renamed from: x, reason: collision with root package name */
    public final int f397681x;

    /* renamed from: y, reason: collision with root package name */
    public final rn2.e f397682y;

    /* renamed from: z, reason: collision with root package name */
    public r45.gz1 f397683z;

    /* JADX WARN: Multi-variable type inference failed */
    public c1(androidx.appcompat.app.AppCompatActivity activity) {
        java.lang.String string;
        androidx.lifecycle.j0 j0Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f397664d = activity;
        this.f397665e = "FinderLiveLotteryCreatePresenter";
        ae2.in inVar = ae2.in.f3688a;
        boolean z17 = false;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3733e4).getValue()).r()).intValue() == 1;
        this.f397666f = z18;
        this.f397669i = "";
        this.f397670m = "";
        this.f397672o = "";
        this.f397673p = "";
        this.f397678u = "";
        this.f397680w = "";
        rn2.e eVar = new rn2.e();
        this.f397682y = eVar;
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        this.D = b17;
        this.f397677t = activity.getIntent().getLongExtra("KEY_PARAMS_LIVE_ID", 0L);
        this.f397679v = activity.getIntent().getLongExtra("KEY_PARAMS_OBJECT_ID", 0L);
        java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_PARAMS_NONCE_ID");
        this.f397678u = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = activity.getIntent().getStringExtra("KEY_PARAMS_ANCHOR_USERNAME");
        java.lang.String str = stringExtra2 == null ? "" : stringExtra2;
        this.f397680w = str;
        int intExtra = activity.getIntent().getIntExtra("KEY_PARAMS_LOTTERY_SOURCE", 0);
        this.f397681x = intExtra;
        rn2.b a17 = eVar.a();
        if (a17 != null) {
            a17.f397648e = true;
        }
        this.f397668h = a17 != null ? a17.f397646c : 1;
        if (a17 == null || (string = a17.f397644a) == null) {
            string = activity.getResources().getString(com.tencent.mm.R.string.f491625dp5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        this.f397669i = string;
        gk2.e eVar2 = gk2.e.f272471n;
        if (eVar2 != null && (j0Var = ((on2.z2) eVar2.a(on2.z2.class)).f347095p) != null) {
            z17 = kotlin.jvm.internal.o.b(j0Var.getValue(), java.lang.Boolean.TRUE);
        }
        if (z17) {
            c();
        } else {
            kotlinx.coroutines.l.d(b17, null, null, new rn2.n0(this, null), 3, null);
        }
        az2.f a18 = az2.c.a(az2.f.f16125d, activity, null, 0L, null, 14, null);
        a18.a();
        r45.et1 et1Var = new r45.et1();
        et1Var.set(2, str);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8400;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetlotterypreparedata";
        lVar.f70664a = et1Var;
        lVar.f70665b = new r45.ft1();
        com.tencent.mm.modelbase.o a19 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a19);
        pq5.g l17 = wi6.l();
        if (activity instanceof com.tencent.mm.ui.MMActivity) {
            l17.f((im5.b) activity);
        }
        l17.K(new rn2.z0(a18, this));
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreatePresenter", "showAttendTypeCompatibility: " + z18 + ",lotterySource:" + intExtra);
    }

    public void A(rn2.b type) {
        int i17;
        rn2.g gVar;
        kotlin.jvm.internal.o.g(type, "type");
        rn2.e eVar = this.f397682y;
        eVar.getClass();
        java.util.LinkedList linkedList = eVar.f397707i;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = type.f397646c;
            boolean z17 = false;
            if (!hasNext) {
                break;
            }
            rn2.b bVar = (rn2.b) it.next();
            if (bVar.f397646c == i17) {
                z17 = true;
            }
            bVar.f397648e = z17;
        }
        eVar.f397711m = i17;
        java.util.LinkedList linkedList2 = eVar.f397709k;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        linkedList2.addAll(eVar.f397708j);
        int i18 = type.f397646c;
        if (i18 != 3) {
            this.f397670m = "";
        }
        if (i18 != 6) {
            this.f397674q = null;
        }
        this.f397668h = i18;
        this.f397669i = type.f397644a;
        g(i18, false);
        if (this.f397666f && this.f397668h == 4 && (gVar = this.f397667g) != null) {
            ((rn2.t2) gVar).s(0, 0, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.doq), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v39, types: [rn2.w] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [r45.gz1] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v96 */
    public void B(int i17) {
        java.lang.Integer num;
        android.text.Editable editable;
        java.lang.Integer num2;
        java.lang.String str;
        rn2.e eVar = this.f397682y;
        r45.vc5 vc5Var = eVar.f397704f;
        boolean z17 = vc5Var != null && vc5Var.getBoolean(1);
        if (i17 == 0 && z17) {
            rn2.g gVar = this.f397667g;
            if (gVar != null) {
                r45.vc5 vc5Var2 = eVar.f397704f;
                if (vc5Var2 == null || (str = vc5Var2.getString(2)) == null) {
                    str = "";
                }
                com.tencent.mm.ui.MMActivity mMActivity = ((rn2.t2) gVar).f397853e;
                com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(mMActivity);
                android.view.View inflate = android.view.LayoutInflater.from(mMActivity).inflate(com.tencent.mm.R.layout.deq, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qc8);
                if (str.length() == 0) {
                    str = mMActivity.getString(com.tencent.mm.R.string.f491632lj0);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                }
                textView.setText(str);
                inflate.findViewById(com.tencent.mm.R.id.c9z).setOnClickListener(new rn2.l2(y1Var));
                y1Var.k(inflate);
                y1Var.s();
            }
            if (eVar.b() == i17) {
                eVar.g(i17);
            }
        } else {
            eVar.g(i17);
        }
        rn2.g gVar2 = this.f397667g;
        if (gVar2 != null) {
            int b17 = eVar.b();
            rn2.t2 t2Var = (rn2.t2) gVar2;
            android.view.View view = t2Var.f397867s;
            if (view == null) {
                num = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                num = 0;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "onSelectPrizeSource", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "onSelectPrizeSource", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            rn2.f fVar = t2Var.f397854f;
            if (b17 != 0) {
                android.view.View view2 = t2Var.f397852d;
                if (b17 == 1) {
                    java.lang.Integer num3 = num;
                    editable = null;
                    android.view.View view3 = t2Var.D;
                    if (view3 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(num3);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view4 = t2Var.X;
                    if (view4 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view5 = t2Var.Y;
                    if (view5 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f486417l54)).setText(view2.getContext().getString(com.tencent.mm.R.string.dro));
                    android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.bx9);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(num3);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view6 = t2Var.f397867s;
                    if (view6 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(view6, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view7 = t2Var.f397868t;
                    if (view7 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(view7, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view8 = t2Var.V;
                    if (view8 != null) {
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        arrayList8.add(num3);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(view8, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view9 = t2Var.f397851J;
                    if (view9 != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        arrayList9.add(8);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(view9, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view10 = t2Var.f397874x1;
                    if (view10 != null) {
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        arrayList10.add(8);
                        java.util.Collections.reverse(arrayList10);
                        yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                        yj0.a.f(view10, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.EditText editText = t2Var.C;
                    if (editText != null) {
                        editText.setText("");
                    }
                    if (fVar != null) {
                        ((rn2.c1) fVar).y(new rn2.b(null, null, 3, false, false, 0, 0, null, 251, null));
                    }
                    if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("type", 20);
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
                    } else {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("type", 9);
                        i95.m c18 = i95.n0.c(zy2.zb.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        ml2.c1 c1Var = ml2.c1.f327325e;
                        zy2.zb.j5((zy2.zb) c18, 6L, jSONObject2.toString(), null, 4, null);
                    }
                } else if (b17 != 2) {
                    if (b17 == 3) {
                        ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f486417l54)).setText(view2.getContext().getString(com.tencent.mm.R.string.mkr));
                        android.view.View view11 = t2Var.D;
                        if (view11 != null) {
                            java.util.ArrayList arrayList11 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                            arrayList11.add(8);
                            java.util.Collections.reverse(arrayList11);
                            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                            yj0.a.f(view11, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view12 = t2Var.X;
                        if (view12 != null) {
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                            arrayList12.add(8);
                            java.util.Collections.reverse(arrayList12);
                            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                            yj0.a.f(view12, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view13 = t2Var.Y;
                        if (view13 == null) {
                            num2 = num;
                        } else {
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                            num2 = num;
                            arrayList13.add(num2);
                            java.util.Collections.reverse(arrayList13);
                            yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                            yj0.a.f(view13, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.ViewGroup viewGroup = t2Var.Q;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(8);
                        }
                        android.view.View view14 = t2Var.V;
                        if (view14 != null) {
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                            arrayList14.add(8);
                            java.util.Collections.reverse(arrayList14);
                            yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                            yj0.a.f(view14, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view15 = t2Var.f397851J;
                        if (view15 != null) {
                            java.util.ArrayList arrayList15 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
                            arrayList15.add(num2);
                            java.util.Collections.reverse(arrayList15);
                            yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                            yj0.a.f(view15, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view16 = t2Var.f397874x1;
                        if (view16 != null) {
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
                            arrayList16.add(8);
                            java.util.Collections.reverse(arrayList16);
                            yj0.a.d(view16, arrayList16.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view16.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                            yj0.a.f(view16, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view17 = t2Var.f397867s;
                        if (view17 != null) {
                            java.util.ArrayList arrayList17 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal12 = zj0.c.f473285a;
                            arrayList17.add(8);
                            java.util.Collections.reverse(arrayList17);
                            yj0.a.d(view17, arrayList17.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view17.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                            yj0.a.f(view17, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.bx9);
                        java.util.ArrayList arrayList18 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal13 = zj0.c.f473285a;
                        arrayList18.add(8);
                        java.util.Collections.reverse(arrayList18);
                        yj0.a.d(findViewById2, arrayList18.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (fVar != null) {
                            java.lang.String string = view2.getContext().getString(com.tencent.mm.R.string.mkr);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            rn2.c1 c1Var2 = (rn2.c1) fVar;
                            c1Var2.f397672o = string;
                            c1Var2.g(c1Var2.f397668h, false);
                        }
                        android.widget.EditText editText2 = t2Var.C;
                        if (editText2 != null) {
                            editText2.setText("");
                        }
                        if (fVar != null) {
                            r45.gz1 gz1Var = new r45.gz1();
                            gz1Var.set(0, 3);
                            ((rn2.c1) fVar).f397683z = gz1Var;
                        }
                        android.view.View view18 = t2Var.f397868t;
                        if (view18 != null) {
                            java.util.ArrayList arrayList19 = new java.util.ArrayList();
                            arrayList19.add(num2);
                            java.util.Collections.reverse(arrayList19);
                            yj0.a.d(view18, arrayList19.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view18.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                            yj0.a.f(view18, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view19 = t2Var.f397868t;
                        if (view19 != null) {
                            view19.setEnabled(false);
                        }
                        if (fVar != null) {
                            ((rn2.c1) fVar).y(new rn2.b(null, null, 5, false, false, 0, 0, null, 251, null));
                        }
                    }
                    editable = null;
                } else {
                    java.lang.Integer num4 = num;
                    if (fVar != null) {
                        rn2.c1 c1Var3 = (rn2.c1) fVar;
                        if (c1Var3.B == null) {
                            kotlinx.coroutines.r2 r2Var = c1Var3.C;
                            if (!(r2Var != null && ((kotlinx.coroutines.a) r2Var).a())) {
                                c1Var3.C = kotlinx.coroutines.l.d(c1Var3.D, null, null, new rn2.b1(c1Var3, null), 3, null);
                            }
                        }
                    }
                    ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f486417l54)).setText(view2.getContext().getString(com.tencent.mm.R.string.f491641lj2));
                    android.view.View view20 = t2Var.D;
                    if (view20 != null) {
                        java.util.ArrayList arrayList20 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal14 = zj0.c.f473285a;
                        arrayList20.add(8);
                        java.util.Collections.reverse(arrayList20);
                        yj0.a.d(view20, arrayList20.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view20.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                        yj0.a.f(view20, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view21 = t2Var.Y;
                    if (view21 != null) {
                        java.util.ArrayList arrayList21 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal15 = zj0.c.f473285a;
                        arrayList21.add(8);
                        java.util.Collections.reverse(arrayList21);
                        yj0.a.d(view21, arrayList21.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view21.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                        yj0.a.f(view21, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view22 = t2Var.X;
                    if (view22 != null) {
                        java.util.ArrayList arrayList22 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal16 = zj0.c.f473285a;
                        arrayList22.add(num4);
                        java.util.Collections.reverse(arrayList22);
                        yj0.a.d(view22, arrayList22.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view22.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                        yj0.a.f(view22, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.ViewGroup viewGroup2 = t2Var.Q;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(8);
                    }
                    android.view.View view23 = t2Var.V;
                    if (view23 != null) {
                        java.util.ArrayList arrayList23 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal17 = zj0.c.f473285a;
                        arrayList23.add(8);
                        java.util.Collections.reverse(arrayList23);
                        yj0.a.d(view23, arrayList23.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view23.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
                        yj0.a.f(view23, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view24 = t2Var.f397851J;
                    if (view24 != null) {
                        java.util.ArrayList arrayList24 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal18 = zj0.c.f473285a;
                        arrayList24.add(num4);
                        java.util.Collections.reverse(arrayList24);
                        yj0.a.d(view24, arrayList24.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view24.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
                        yj0.a.f(view24, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view25 = t2Var.f397874x1;
                    if (view25 != null) {
                        java.util.ArrayList arrayList25 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal19 = zj0.c.f473285a;
                        arrayList25.add(num4);
                        java.util.Collections.reverse(arrayList25);
                        yj0.a.d(view25, arrayList25.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view25.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
                        yj0.a.f(view25, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view26 = t2Var.f397867s;
                    if (view26 != null) {
                        java.util.ArrayList arrayList26 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal20 = zj0.c.f473285a;
                        arrayList26.add(num4);
                        java.util.Collections.reverse(arrayList26);
                        yj0.a.d(view26, arrayList26.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view26.setVisibility(((java.lang.Integer) arrayList26.get(0)).intValue());
                        yj0.a.f(view26, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.bx9);
                    java.util.ArrayList arrayList27 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal21 = zj0.c.f473285a;
                    arrayList27.add(8);
                    java.util.Collections.reverse(arrayList27);
                    yj0.a.d(findViewById3, arrayList27.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList27.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.EditText editText3 = t2Var.C;
                    if (editText3 != null) {
                        editText3.setText("");
                    }
                    if (fVar != null) {
                        editable = null;
                        ((rn2.c1) fVar).C(null, null);
                    } else {
                        editable = null;
                    }
                    ?? r27 = t2Var.W;
                    if (r27 != 0) {
                        r27.b(fVar != null ? ((rn2.c1) fVar).A : editable, fVar != null ? ((rn2.c1) fVar).m() : editable);
                    }
                    android.view.View view27 = t2Var.f397868t;
                    if (view27 != null) {
                        java.util.ArrayList arrayList28 = new java.util.ArrayList();
                        arrayList28.add(num4);
                        java.util.Collections.reverse(arrayList28);
                        yj0.a.d(view27, arrayList28.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view27.setVisibility(((java.lang.Integer) arrayList28.get(0)).intValue());
                        yj0.a.f(view27, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view28 = t2Var.f397868t;
                    if (view28 != null) {
                        view28.setEnabled(false);
                    }
                    if (fVar != null) {
                        ((rn2.c1) fVar).y(new rn2.b(null, null, 0, false, false, 0, 0, null, 251, null));
                    }
                }
            } else {
                editable = null;
                t2Var.t();
            }
            int c19 = fVar != null ? ((rn2.c1) fVar).f397682y.c() : 3;
            android.widget.EditText editText4 = t2Var.A;
            android.text.Editable text = editText4 != null ? editText4.getText() : editable;
            if (text == null || text.length() == 0) {
                android.widget.EditText editText5 = t2Var.A;
                if (editText5 == null) {
                    return;
                }
                editText5.setHint(java.lang.String.valueOf(c19));
                return;
            }
            android.widget.EditText editText6 = t2Var.A;
            if (editText6 != null) {
                editText6.setText(java.lang.String.valueOf(c19));
            }
        }
    }

    public void C(java.lang.Integer num, java.util.List list) {
        r45.gz1 gz1Var;
        r45.vd4 vd4Var;
        if (num == null) {
            gz1Var = this.A;
        } else {
            r45.gz1 gz1Var2 = this.f397682y.f397701c;
            r45.vd4 vd4Var2 = (r45.vd4) gz1Var2.getCustom(2);
            if (vd4Var2 != null) {
                vd4Var2.set(0, java.lang.Integer.valueOf(num.intValue()));
            }
            if (list != null && (vd4Var = (r45.vd4) gz1Var2.getCustom(2)) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    rn2.y2 y2Var = (rn2.y2) it.next();
                    r45.wd4 wd4Var = new r45.wd4();
                    wd4Var.set(0, y2Var.f397928c);
                    wd4Var.set(1, y2Var.f397929d);
                    arrayList.add(wd4Var);
                }
                vd4Var.set(1, new java.util.LinkedList(arrayList));
            }
            gz1Var = gz1Var2;
        }
        this.f397683z = gz1Var;
        this.A = gz1Var;
    }

    public final void c() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f397664d;
        com.tencent.mm.ui.MMActivity mMActivity = appCompatActivity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) appCompatActivity : null;
        if (mMActivity != null) {
            mMActivity.addTextOptionMenu(0, ((com.tencent.mm.ui.MMActivity) appCompatActivity).getResources().getString(com.tencent.mm.R.string.dxs), new rn2.o0(this));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r1 == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r6.f397670m.length() > 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r6 = this;
            boolean r0 = r6.f397675r
            boolean r1 = r6.f397676s
            r0 = r0 & r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isValidClaimPrize lastLotteryClaimPrizeType:"
            r1.<init>(r2)
            rn2.e r2 = r6.f397682y
            int r3 = r2.f397712n
            r1.append(r3)
            java.lang.String r3 = ",customClaimPrizeContent:"
            r1.append(r3)
            java.lang.String r3 = r6.f397673p
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = r6.f397665e
            com.tencent.mars.xlog.Log.i(r3, r1)
            int r1 = r2.f397712n
            r2 = 2
            r4 = 0
            r5 = 1
            if (r1 != r2) goto L3d
            java.lang.String r1 = r6.f397673p
            int r1 = r1.length()
            if (r1 <= 0) goto L37
            r1 = r5
            goto L38
        L37:
            r1 = r4
        L38:
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            r1 = r4
            goto L3e
        L3d:
            r1 = r5
        L3e:
            r0 = r0 & r1
            int r1 = r6.f397668h
            switch(r1) {
                case 1: goto L77;
                case 2: goto L77;
                case 3: goto L5c;
                case 4: goto L77;
                case 5: goto L77;
                case 6: goto L45;
                default: goto L44;
            }
        L44:
            goto L78
        L45:
            r45.h32 r1 = r6.f397674q
            if (r1 == 0) goto L78
            r2 = 4
            java.lang.String r1 = r1.getString(r2)
            if (r1 == 0) goto L78
            int r1 = r1.length()
            if (r1 <= 0) goto L58
            r1 = r5
            goto L59
        L58:
            r1 = r4
        L59:
            if (r1 != r5) goto L78
            goto L77
        L5c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isValidWording wording:"
            r1.<init>(r2)
            java.lang.String r2 = r6.f397670m
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r3, r1)
            java.lang.String r1 = r6.f397670m
            int r1 = r1.length()
            if (r1 <= 0) goto L78
        L77:
            r4 = r5
        L78:
            r0 = r0 & r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkLotteryState type:"
            r1.<init>(r2)
            int r2 = r6.f397668h
            r1.append(r2)
            java.lang.String r2 = ",canConfirm:"
            r1.append(r2)
            r1.append(r0)
            r2 = 33
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.c1.f():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.c1.g(int, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(r45.dz1 dz1Var, int i17) {
        java.lang.String str;
        ek2.t0 t0Var;
        long j17;
        java.lang.String str2;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f397664d;
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
        gk2.e eVar = gk2.e.f272471n;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).qj(2);
        } else if (this.f397668h == 1) {
            if (this.f397670m.length() > 0) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327597m, this.f397670m);
            }
        }
        if (dz1Var == null) {
            rn2.e eVar2 = this.f397682y;
            int c17 = eVar2.c();
            com.tencent.mars.xlog.Log.i(this.f397665e, "getCreateParamsFromMethodItem, default duration = " + c17);
            long j18 = this.f397677t;
            long j19 = this.f397679v;
            java.lang.String str3 = this.f397678u;
            int i18 = c17 * 60;
            java.lang.String str4 = this.f397672o;
            int i19 = this.f397668h;
            java.lang.String str5 = this.f397670m;
            int i27 = ek2.s0.f253530v;
            int i28 = this.f397671n;
            long d17 = eVar2.d();
            gk2.e eVar3 = gk2.e.f272471n;
            com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(eVar3 != null ? ((mm2.e1) eVar3.a(mm2.e1.class)).f328985o : null);
            r45.yy1 yy1Var = new r45.yy1();
            yy1Var.set(0, java.lang.Integer.valueOf(eVar2.f397712n));
            yy1Var.set(1, this.f397673p);
            r45.gz1 gz1Var = this.f397683z;
            r45.h32 h32Var = this.f397674q;
            if (h32Var != null) {
                j17 = j19;
                str2 = h32Var.getString(4);
            } else {
                j17 = j19;
                str2 = null;
            }
            t0Var = new ek2.t0(j18, j17, str3, i18, str4, i19, str5, 0, i28, d17, b17, yy1Var, i17, gz1Var, str2);
        } else {
            long j27 = this.f397677t;
            long j28 = this.f397679v;
            java.lang.String str6 = this.f397678u;
            int integer = dz1Var.getInteger(1);
            java.lang.String valueOf = java.lang.String.valueOf(dz1Var.getString(2));
            r45.xy1 xy1Var = (r45.xy1) dz1Var.getCustom(3);
            int integer2 = xy1Var != null ? xy1Var.getInteger(0) : 0;
            int i29 = ek2.s0.f253530v;
            r45.xy1 xy1Var2 = (r45.xy1) dz1Var.getCustom(3);
            if (xy1Var2 == null || (str = xy1Var2.getString(1)) == null) {
                str = "";
            }
            java.lang.String str7 = str;
            int integer3 = dz1Var.getInteger(4);
            long j29 = dz1Var.getLong(5);
            gk2.e eVar4 = gk2.e.f272471n;
            com.tencent.mm.protobuf.g b18 = com.tencent.mm.protobuf.g.b(eVar4 != null ? ((mm2.e1) eVar4.a(mm2.e1.class)).f328985o : null);
            r45.yy1 yy1Var2 = (r45.yy1) dz1Var.getCustom(6);
            r45.gz1 gz1Var2 = (r45.gz1) dz1Var.getCustom(9);
            r45.xy1 xy1Var3 = (r45.xy1) dz1Var.getCustom(3);
            t0Var = new ek2.t0(j27, j28, str6, integer, valueOf, integer2, str7, 0, integer3, j29, b18, yy1Var2, i17, gz1Var2, xy1Var3 != null ? xy1Var3.getString(3) : null);
        }
        pq5.g l17 = new ek2.s0(t0Var).l();
        l17.K(new rn2.v0(f17, t0Var, this));
        if (appCompatActivity instanceof im5.b) {
            l17.f((im5.b) appCompatActivity);
        }
    }

    public final java.lang.Object i(boolean z17, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        r45.pa1 pa1Var = new r45.pa1();
        pa1Var.set(1, db2.t4.f228171a.a(8970));
        pa1Var.set(3, java.lang.Boolean.TRUE);
        az2.j jVar = (az2.j) pa1Var.d();
        if (z17) {
            az2.j.u(jVar, this.f397664d, null, 0L, 6, null);
        }
        km5.d T = pm0.v.T(jVar.l(), new rn2.w0(nVar));
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f397664d;
        com.tencent.mm.ui.MMActivity mMActivity = appCompatActivity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) appCompatActivity : null;
        if (mMActivity != null) {
            T.f(mMActivity);
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public java.util.LinkedList m() {
        r45.gz1 gz1Var;
        r45.vd4 vd4Var;
        java.util.LinkedList<r45.wd4> list;
        java.lang.Object obj;
        r45.vd4 vd4Var2;
        r45.vd4 vd4Var3;
        if (this.B == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.qa1 qa1Var = this.B;
        if (qa1Var != null) {
            linkedList.clear();
            java.util.LinkedList<r45.kv1> list2 = qa1Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getProduct_meta_list(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (r45.kv1 kv1Var : list2) {
                int i17 = (int) qa1Var.getLong(6);
                r45.n30 n30Var = new r45.n30();
                n30Var.set(0, kv1Var.getString(0));
                arrayList.add(new rn2.y2(false, i17, n30Var, kv1Var));
            }
            linkedList.addAll(arrayList);
            r45.gz1 gz1Var2 = this.f397683z;
            java.lang.Integer valueOf = (gz1Var2 == null || (vd4Var3 = (r45.vd4) gz1Var2.getCustom(2)) == null) ? null : java.lang.Integer.valueOf(vd4Var3.getInteger(0));
            r45.gz1 gz1Var3 = this.A;
            if (kotlin.jvm.internal.o.b(valueOf, (gz1Var3 == null || (vd4Var2 = (r45.vd4) gz1Var3.getCustom(2)) == null) ? null : java.lang.Integer.valueOf(vd4Var2.getInteger(0))) && (gz1Var = this.A) != null && (vd4Var = (r45.vd4) gz1Var.getCustom(2)) != null && (list = vd4Var.getList(1)) != null) {
                for (r45.wd4 wd4Var : list) {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        java.lang.String string = ((rn2.y2) obj).f397929d.getString(0);
                        r45.n30 n30Var2 = (r45.n30) wd4Var.getCustom(0);
                        if (kotlin.jvm.internal.o.b(string, n30Var2 != null ? n30Var2.getString(0) : null)) {
                            break;
                        }
                    }
                    rn2.y2 y2Var = (rn2.y2) obj;
                    if (y2Var != null) {
                        y2Var.f397926a = true;
                    }
                    r45.n30 n30Var3 = y2Var != null ? y2Var.f397928c : null;
                    if (n30Var3 != null) {
                        r45.n30 n30Var4 = (r45.n30) wd4Var.getCustom(0);
                        n30Var3.set(1, java.lang.Integer.valueOf(n30Var4 != null ? n30Var4.getInteger(1) : 0));
                    }
                }
            }
        }
        return linkedList;
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String str;
        android.widget.CheckBox checkBox;
        rn2.g callback = (rn2.g) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f397667g = callback;
        rn2.e eVar = this.f397682y;
        java.util.Iterator it = ((java.util.ArrayList) ((jz5.n) eVar.f397710l).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((rn2.b) obj2).f397646c == eVar.f397712n) {
                    break;
                }
            }
        }
        rn2.b bVar = (rn2.b) obj2;
        if (bVar == null || (str = bVar.f397644a) == null) {
            str = "";
        }
        rn2.t2 t2Var = (rn2.t2) callback;
        android.view.View view = t2Var.f397852d;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ogm);
        t2Var.f397855g = textView;
        rn2.f fVar = t2Var.f397854f;
        com.tencent.mm.ui.MMActivity mMActivity = t2Var.f397853e;
        if (textView != null) {
            java.lang.String string = mMActivity.getResources().getString(com.tencent.mm.R.string.dq7);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = fVar != null ? java.lang.Integer.valueOf(((rn2.c1) fVar).p()) : null;
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
        }
        t2Var.f397862p = view.findViewById(com.tencent.mm.R.id.f483741bx2);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.irj);
        t2Var.f397865q = findViewById;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = findViewById != null ? (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById.findViewById(com.tencent.mm.R.id.ly7) : null;
        t2Var.f397866r = mMSwitchBtn;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setSwitchListener(new rn2.u1(t2Var));
        }
        t2Var.f397867s = view.findViewById(com.tencent.mm.R.id.f483744bx5);
        t2Var.f397868t = view.findViewById(com.tencent.mm.R.id.f483740bx1);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bx7);
        t2Var.f397869u = textView2;
        if (textView2 != null) {
            textView2.setText(str);
        }
        android.view.View view2 = t2Var.f397868t;
        if (view2 != null) {
            view2.setOnClickListener(new rn2.v1(t2Var));
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.cog);
        t2Var.f397870v = findViewById2;
        android.widget.EditText editText = findViewById2 != null ? (android.widget.EditText) findViewById2.findViewById(com.tencent.mm.R.id.coh) : null;
        t2Var.f397871w = editText;
        zl2.r4 r4Var = zl2.r4.f473950a;
        r4Var.Z2(editText, null, 20, 10, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new rn2.w1(t2Var));
        t2Var.f397872x = view.findViewById(com.tencent.mm.R.id.a6d);
        t2Var.f397875y = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a6g);
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.c6r);
        t2Var.f397856h = findViewById3;
        android.widget.EditText editText2 = findViewById3 != null ? (android.widget.EditText) findViewById3.findViewById(com.tencent.mm.R.id.c88) : null;
        t2Var.f397861o = editText2;
        r4Var.Z2(editText2, null, 20, 10, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new rn2.x1(t2Var));
        t2Var.f397878z = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.f484137d53);
        android.widget.EditText editText3 = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.d57);
        t2Var.A = editText3;
        r4Var.Z2(editText3, null, 8, 4, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new rn2.y1(t2Var));
        t2Var.B = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.pmw);
        android.widget.EditText editText4 = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.f487737pn0);
        t2Var.C = editText4;
        r4Var.Z2(editText4, null, 8, 4, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new rn2.z1(t2Var));
        t2Var.D = view.findViewById(com.tencent.mm.R.id.q_4);
        t2Var.E = view.findViewById(com.tencent.mm.R.id.f484050cu2);
        android.widget.EditText editText5 = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.cuw);
        t2Var.F = editText5;
        r4Var.Z2(editText5, null, 20, 10, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new rn2.a2(t2Var));
        t2Var.H = view.findViewById(com.tencent.mm.R.id.c_1);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c9z);
        t2Var.G = textView3;
        if (this.f397681x == 1 && textView3 != null) {
            textView3.setText(mMActivity.getContext().getResources().getString(com.tencent.mm.R.string.dr_));
        }
        android.widget.TextView textView4 = t2Var.G;
        com.tencent.mm.ui.bk.r0(textView4 != null ? textView4.getPaint() : null, 0.8f);
        rn2.g.m(t2Var, false, 0, 2, null);
        view.findViewById(com.tencent.mm.R.id.irp).setOnClickListener(new rn2.b2(t2Var));
        t2Var.I = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.iro);
        android.widget.TextView textView5 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.irq);
        kotlin.jvm.internal.o.d(textView5);
        java.lang.String string2 = textView5.getContext().getResources().getString(com.tencent.mm.R.string.dqv);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = textView5.getContext().getResources().getString(com.tencent.mm.R.string.dqu);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{string2}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        int L = r26.n0.L(format2, string2, 0, false, 6, null);
        int length = string2.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(format2);
        spannableString.setSpan(new rn2.l3(new java.lang.ref.WeakReference(mMActivity)), L, length, 33);
        textView5.setHighlightColor(textView5.getContext().getResources().getColor(android.R.color.transparent));
        textView5.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView5.setText(spannableString);
        android.widget.CheckBox checkBox2 = t2Var.I;
        if (checkBox2 != null) {
            checkBox2.setOnCheckedChangeListener(new rn2.k1(t2Var));
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LOTTERY_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue() && (checkBox = t2Var.I) != null) {
            checkBox.setChecked(true);
        }
        t2Var.V = view.findViewById(com.tencent.mm.R.id.q_x);
        t2Var.f397851J = view.findViewById(com.tencent.mm.R.id.l5y);
        android.view.View view3 = t2Var.f397872x;
        if (view3 != null) {
            view3.setOnClickListener(new rn2.l1(t2Var));
        }
        android.widget.RelativeLayout relativeLayout = t2Var.f397878z;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new rn2.m1(t2Var));
        }
        android.widget.RelativeLayout relativeLayout2 = t2Var.B;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new rn2.n1(t2Var));
        }
        android.view.View view4 = t2Var.E;
        if (view4 != null) {
            view4.setOnClickListener(new rn2.o1(t2Var));
        }
        android.view.View view5 = t2Var.f397856h;
        if (view5 != null) {
            view5.setOnClickListener(new rn2.p1(t2Var));
        }
        android.view.View view6 = (android.view.View) ((jz5.n) t2Var.f397857i).getValue();
        if (view6 != null) {
            view6.setOnClickListener(new rn2.q1(t2Var));
        }
        android.widget.TextView textView6 = t2Var.G;
        if (textView6 != null) {
            textView6.setOnClickListener(new rn2.s1(t2Var));
        }
        android.view.View view7 = t2Var.V;
        if (view7 != null) {
            view7.setOnClickListener(new rn2.t1(t2Var));
        }
        if (fVar != null) {
            rn2.c1 c1Var = (rn2.c1) fVar;
            rn2.b a17 = c1Var.f397682y.a();
            if (a17 != null) {
                t2Var.q(a17);
            }
            android.widget.EditText editText6 = t2Var.A;
            rn2.e eVar2 = c1Var.f397682y;
            if (editText6 != null) {
                editText6.setHint(java.lang.String.valueOf(eVar2.c()));
            }
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = t2Var.f397866r;
            if (mMSwitchBtn2 != null) {
                mMSwitchBtn2.setCheck(eVar2.f397715q);
            }
        }
        android.view.View view8 = t2Var.f397867s;
        if (view8 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view8, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethod", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethod", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        t2Var.j(str);
        rn2.w wVar = t2Var.W;
        if (wVar == null) {
            wVar = new rn2.w(t2Var);
        }
        t2Var.W = wVar;
        t2Var.X = view.findViewById(com.tencent.mm.R.id.q_5);
        t2Var.Y = view.findViewById(com.tencent.mm.R.id.f486427s10);
        android.view.View view9 = t2Var.X;
        android.view.View findViewById4 = view9 != null ? view9.findViewById(com.tencent.mm.R.id.q6m) : null;
        t2Var.Z = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new rn2.g1(t2Var));
        }
        android.view.View view10 = t2Var.X;
        t2Var.f397863p0 = view10 != null ? (android.widget.TextView) view10.findViewById(com.tencent.mm.R.id.q6o) : null;
        android.view.View view11 = t2Var.X;
        android.view.View findViewById5 = view11 != null ? view11.findViewById(com.tencent.mm.R.id.f485166q74) : null;
        t2Var.f397873x0 = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new rn2.h1(t2Var));
        }
        android.view.View view12 = t2Var.X;
        t2Var.f397876y0 = view12 != null ? (androidx.recyclerview.widget.RecyclerView) view12.findViewById(com.tencent.mm.R.id.q77) : null;
        android.view.View view13 = t2Var.X;
        t2Var.f397858l1 = view13 != null ? view13.findViewById(com.tencent.mm.R.id.q78) : null;
        android.view.View view14 = t2Var.X;
        t2Var.f397864p1 = view14 != null ? (android.widget.TextView) view14.findViewById(com.tencent.mm.R.id.ohp) : null;
        t2Var.f397874x1 = view.findViewById(com.tencent.mm.R.id.q5k);
        t2Var.f397877y1 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.qas);
        t2Var.f397879z1 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.q76);
        t2Var.A1 = view.findViewById(com.tencent.mm.R.id.q4g);
        g(this.f397668h, false);
    }

    @Override // fs2.a
    public void onDetach() {
        jz5.f0 f0Var;
        int i17;
        r45.nw1 nw1Var;
        rn2.g gVar = this.f397667g;
        if (gVar != null) {
            ((rn2.t2) gVar).destroy();
        }
        this.f397667g = null;
        rn2.e eVar = this.f397682y;
        eVar.getClass();
        gk2.e eVar2 = gk2.e.f272471n;
        dk2.xf k17 = eVar2 != null ? dk2.ef.f233372a.k(eVar2) : null;
        gk2.e eVar3 = gk2.e.f272471n;
        r45.a94 a94Var = eVar3 != null ? ((on2.z2) eVar3.a(on2.z2.class)).f347097r : null;
        gk2.e eVar4 = gk2.e.f272471n;
        java.lang.Long valueOf = (eVar4 == null || (nw1Var = ((mm2.e1) eVar4.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0));
        gk2.e eVar5 = gk2.e.f272471n;
        java.lang.Long valueOf2 = eVar5 != null ? java.lang.Long.valueOf(((mm2.e1) eVar5.a(mm2.e1.class)).f328983m) : null;
        gk2.e eVar6 = gk2.e.f272471n;
        java.lang.Integer valueOf3 = eVar6 != null ? java.lang.Integer.valueOf((int) ((mm2.c1) eVar6.a(mm2.c1.class)).f328866q) : null;
        if (k17 == null || a94Var == null || valueOf == null || valueOf2 == null || valueOf3 == null) {
            f0Var = null;
        } else {
            valueOf3.intValue();
            long longValue = valueOf2.longValue();
            long longValue2 = valueOf.longValue();
            a94Var.f369858e = eVar.f397711m;
            if (eVar.f397715q) {
                int i18 = (int) a94Var.f369857d;
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                i17 = i18 | 1;
            } else {
                int i19 = (int) a94Var.f369857d;
                java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                i17 = i19 & (-2);
            }
            a94Var.f369857d = i17;
            rn2.d dVar = new rn2.d(a94Var);
            dk2.r4 r4Var = (dk2.r4) k17;
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "setMicSetting liveId:" + longValue2 + " objectId:" + longValue + " lotterySetting:" + a94Var.f369857d + ", " + a94Var.f369858e);
            pq5.g l17 = new ke2.g(longValue2, longValue, ((mm2.c1) r4Var.m(mm2.c1.class)).f328866q, xy2.c.f(r4Var.f234008c), 0, null, null, a94Var, null, 0L, dVar, null, 2416, null).l();
            java.lang.Object M = r4Var.M();
            if (M != null && (M instanceof com.tencent.mm.ui.MMActivity)) {
                l17.f((im5.b) M);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveLotteryCreateConfig", "setLiveLotterySetting error!");
        }
        kotlinx.coroutines.z0.e(this.D, null, 1, null);
    }

    public int p() {
        java.lang.Object obj;
        rn2.e eVar = this.f397682y;
        java.util.Iterator it = eVar.f397703e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((rn2.b) obj).f397646c == eVar.b()) {
                break;
            }
        }
        rn2.b bVar = (rn2.b) obj;
        int i17 = bVar != null ? bVar.f397649f : 0;
        return i17 > 0 ? i17 / 60 : rn2.e.f397696s;
    }

    public r45.dz1 q() {
        rn2.e eVar = this.f397682y;
        int c17 = eVar.c();
        com.tencent.mars.xlog.Log.i(this.f397665e, "getMethodItem, duration = " + c17);
        r45.dz1 dz1Var = new r45.dz1();
        dz1Var.set(1, java.lang.Integer.valueOf(c17 * 60));
        dz1Var.set(2, this.f397672o);
        r45.xy1 xy1Var = new r45.xy1();
        xy1Var.set(0, java.lang.Integer.valueOf(this.f397668h));
        xy1Var.set(1, this.f397670m);
        xy1Var.set(2, this.f397669i);
        r45.h32 h32Var = this.f397674q;
        xy1Var.set(3, h32Var != null ? h32Var.getString(4) : null);
        dz1Var.set(3, xy1Var);
        dz1Var.set(4, java.lang.Integer.valueOf(this.f397671n));
        dz1Var.set(5, java.lang.Long.valueOf(eVar.d()));
        r45.yy1 yy1Var = new r45.yy1();
        yy1Var.set(0, java.lang.Integer.valueOf(eVar.f397712n));
        yy1Var.set(1, this.f397673p);
        dz1Var.set(6, yy1Var);
        dz1Var.set(9, this.f397683z);
        return dz1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.c1.s(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v() {
        r45.dz1 q17 = q();
        r45.gz1 gz1Var = (r45.gz1) q17.getCustom(9);
        boolean z17 = gz1Var != null && gz1Var.getInteger(0) == 2;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f397664d;
        if (z17) {
            rn2.g gVar = this.f397667g;
            if (gVar != null) {
                ((rn2.t2) gVar).destroy();
            }
            appCompatActivity.setResult(-1, appCompatActivity.getIntent());
            appCompatActivity.finish();
            return;
        }
        r45.w02 w02Var = new r45.w02();
        w02Var.set(2, this.f397680w);
        w02Var.set(3, 0);
        w02Var.set(4, q17);
        az2.j jVar = (az2.j) w02Var.d();
        az2.j.u(jVar, this.f397664d, null, 0L, 6, null);
        pq5.g l17 = jVar.l();
        if (l17 != null) {
            if (appCompatActivity instanceof com.tencent.mm.ui.MMActivity) {
                l17.f((im5.b) appCompatActivity);
            }
            l17.K(new rn2.a1(this));
        }
    }

    public void y(rn2.b type) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f397682y.f(type.f397646c);
        g(this.f397668h, false);
    }

    public void z(int i17) {
        java.lang.Object obj;
        rn2.e eVar = this.f397682y;
        if (i17 > 0) {
            java.util.Iterator it = eVar.f397703e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((rn2.b) obj).f397646c == eVar.b()) {
                        break;
                    }
                }
            }
            rn2.b bVar = (rn2.b) obj;
            if (bVar != null) {
                bVar.f397650g = i17 * 60;
            }
        } else {
            eVar.getClass();
        }
        g(this.f397668h, false);
    }
}
