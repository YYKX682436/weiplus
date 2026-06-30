package on2;

/* loaded from: classes3.dex */
public final class a2 extends com.tencent.mm.plugin.finder.live.widget.n8 implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f346828h;

    /* renamed from: i, reason: collision with root package name */
    public final int f346829i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f346830m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f346831n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f346832o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f346833p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f346834q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f346835r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f346836s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f346837t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f346838u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f346839v;

    /* renamed from: w, reason: collision with root package name */
    public final on2.j1 f346840w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.content.Context context, gk2.e eVar, int i17) {
        super(context);
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.g0 g0Var;
        kotlin.jvm.internal.o.g(context, "context");
        this.f346828h = eVar;
        this.f346829i = i17;
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        this.f346830m = z17;
        this.f346831n = jz5.h.b(new on2.m1(this));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.atv, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f346832o = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.irs);
        this.f346833p = findViewById;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) inflate.findViewById(com.tencent.mm.R.id.irt);
        this.f346834q = liveBottomSheetPanel;
        android.view.View findViewById2 = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.irr);
        this.f346835r = findViewById2;
        android.view.View findViewById3 = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.irv);
        this.f346836s = findViewById3;
        android.widget.TextView textView = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.irx);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.iru);
        this.f346837t = recyclerView;
        this.f346838u = jz5.h.b(new on2.z1(context));
        this.f346839v = new int[2];
        on2.j1 j1Var = new on2.j1();
        j1Var.f346947f = new on2.u1(this, context, j1Var);
        j1Var.f346948g = new on2.y1(j1Var, this, context);
        this.f346840w = j1Var;
        liveBottomSheetPanel.getLayoutParams().height = getDEFAULT_PANEL_HEIGHT();
        liveBottomSheetPanel.setOnVisibilityListener(new on2.n1(this));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(j1Var);
        recyclerView.N(new on2.o1(this));
        recyclerView.P(new on2.p1(this));
        findViewById.setOnClickListener(this);
        liveBottomSheetPanel.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        textView.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        on2.z2 z2Var = (on2.z2) c(on2.z2.class);
        if (z2Var != null && (g0Var = z2Var.f347090h) != null) {
            g0Var.observe((com.tencent.mm.ui.MMActivity) context, new on2.k1(this));
        }
        on2.z2 z2Var2 = (on2.z2) c(on2.z2.class);
        if (z2Var2 != null && (j0Var = z2Var2.f347095p) != null) {
            j0Var.observe((com.tencent.mm.ui.MMActivity) context, new on2.l1(this));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryPanelWidget", "init sourceScene:" + i17 + " isLand:" + z17 + ", DEFAULT_PANEL_HEIGHT:" + getDEFAULT_PANEL_HEIGHT());
    }

    private final int getDEFAULT_PANEL_HEIGHT() {
        return ((java.lang.Number) ((jz5.n) this.f346831n).getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rl5.r getPopupMenu() {
        return (rl5.r) ((jz5.n) this.f346838u).getValue();
    }

    public final androidx.lifecycle.c1 c(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        gk2.e eVar = this.f346828h;
        if (eVar != null) {
            return eVar.a(bu6);
        }
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin = getBasePlugin();
        if (basePlugin != null) {
            return basePlugin.P0(bu6);
        }
        return null;
    }

    public final void d() {
        this.f346834q.setTranslationY(0.0f);
    }

    public final gk2.e getLiveData() {
        return this.f346828h;
    }

    public final int getSourceScene() {
        return this.f346829i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        r45.nw1 nw1Var;
        boolean z17;
        int i17;
        java.lang.String str2;
        java.lang.String str3;
        r45.nw1 nw1Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if ((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.irs) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.irv)) {
            d();
        } else {
            str = "";
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.irx) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - qd2.h.f361767a >= 500) {
                    z17 = false;
                } else {
                    com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
                    z17 = true;
                }
                qd2.h.f361767a = currentTimeMillis;
                if (z17) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327605u, "");
                android.content.Intent intent = new android.content.Intent();
                mm2.c1 c1Var = (mm2.c1) c(mm2.c1.class);
                if (c1Var != null && c1Var.T) {
                    i17 = 3;
                } else {
                    mm2.n0 n0Var = (mm2.n0) c(mm2.n0.class);
                    i17 = n0Var != null && n0Var.f329273r ? 16 : 1;
                }
                intent.putExtra("KEY_LOTTERY_HISTORY_SCENE", i17);
                mm2.e1 e1Var = (mm2.e1) c(mm2.e1.class);
                intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", (e1Var == null || (nw1Var2 = e1Var.f328988r) == null) ? 0L : nw1Var2.getLong(0));
                mm2.e1 e1Var2 = (mm2.e1) c(mm2.e1.class);
                intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", e1Var2 != null ? e1Var2.f328983m : 0L);
                mm2.e1 e1Var3 = (mm2.e1) c(mm2.e1.class);
                if (e1Var3 == null || (str2 = e1Var3.f328992v) == null) {
                    str2 = "";
                }
                intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID", str2);
                mm2.c1 c1Var2 = (mm2.c1) c(mm2.c1.class);
                if (c1Var2 != null && (str3 = c1Var2.f328852o) != null) {
                    str = str3;
                }
                intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", str);
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.content.Context context = this.f346832o.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                c61.yb.H7(ybVar, context, intent, 0L, null, 0, 0, false, 124, null);
                c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
                android.content.Context context2 = this.f346832o.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Oj(context2, intent, true);
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.irr) {
                on2.z2 z2Var = (on2.z2) c(on2.z2.class);
                if (!(z2Var != null && z2Var.V6())) {
                    on2.z2 z2Var2 = (on2.z2) c(on2.z2.class);
                    if (!(z2Var2 != null && z2Var2.T6())) {
                        on2.z2 z2Var3 = (on2.z2) c(on2.z2.class);
                        if ((z2Var3 != null ? z2Var3.f347088f : 100) <= this.f346840w.getItemCount()) {
                            db5.t7.g(this.f346832o.getContext(), this.f346832o.getContext().getResources().getString(com.tencent.mm.R.string.dpu));
                        } else {
                            mm2.e1 e1Var4 = (mm2.e1) c(mm2.e1.class);
                            java.lang.Long valueOf2 = (e1Var4 == null || (nw1Var = e1Var4.f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0));
                            mm2.e1 e1Var5 = (mm2.e1) c(mm2.e1.class);
                            java.lang.Long valueOf3 = e1Var5 != null ? java.lang.Long.valueOf(e1Var5.f328983m) : null;
                            mm2.e1 e1Var6 = (mm2.e1) c(mm2.e1.class);
                            java.lang.String str4 = e1Var6 != null ? e1Var6.f328992v : null;
                            mm2.c1 c1Var3 = (mm2.c1) c(mm2.c1.class);
                            java.lang.String str5 = c1Var3 != null ? c1Var3.f328852o : null;
                            com.tencent.mars.xlog.Log.i("FinderLiveLotteryPanelWidget", "enterFinderCreateLotteryUI liveId:" + valueOf2 + ",objectId:" + valueOf3 + ",nonceId:" + str4 + ",sourceScene:" + this.f346829i);
                            c61.ub ubVar2 = (c61.ub) i95.n0.c(c61.ub.class);
                            android.content.Context context3 = this.f346832o.getContext();
                            kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
                            android.app.Activity activity = (android.app.Activity) context3;
                            android.content.Intent intent2 = new android.content.Intent();
                            intent2.putExtra("KEY_PARAMS_LOTTERY_SOURCE", this.f346829i);
                            intent2.putExtra("KEY_PARAMS_LIVE_ID", valueOf2 != null ? valueOf2.longValue() : 0L);
                            intent2.putExtra("KEY_PARAMS_OBJECT_ID", valueOf3 != null ? valueOf3.longValue() : 0L);
                            if (str4 == null) {
                                str4 = "";
                            }
                            intent2.putExtra("KEY_PARAMS_NONCE_ID", str4);
                            intent2.putExtra("KEY_PARAMS_ANCHOR_USERNAME", str5 != null ? str5 : "");
                            ((com.tencent.mm.plugin.finder.assist.i0) ubVar2).sj(activity, intent2, 1002);
                        }
                    }
                }
                db5.t7.m(this.f346832o.getContext(), this.f346832o.getContext().getResources().getString(com.tencent.mm.R.string.dpv));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
