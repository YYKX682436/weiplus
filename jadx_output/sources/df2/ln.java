package df2;

/* loaded from: classes10.dex */
public final class ln extends if2.b implements android.view.View.OnClickListener, if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230676m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f230677n;

    /* renamed from: o, reason: collision with root package name */
    public rf2.q f230678o;

    /* renamed from: p, reason: collision with root package name */
    public rf2.a f230679p;

    /* renamed from: q, reason: collision with root package name */
    public rf2.f f230680q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f230681r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f230682s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f230683t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f230684u;

    /* renamed from: v, reason: collision with root package name */
    public r45.f02 f230685v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f230686w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f230687x;

    /* renamed from: y, reason: collision with root package name */
    public df2.dn f230688y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230676m = "Finder.LiveMileStoneLotteryResultController";
        this.f230688y = df2.dn.f229991e;
    }

    public final void Z6() {
        com.tencent.mm.view.MMPAGView mMPAGView;
        android.view.View view = this.f230677n;
        boolean z17 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController", "hideLotteryResule", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController", "hideLotteryResule", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f230685v = null;
        a7(df2.dn.f229991e);
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f230683t;
        if (mMPAGView2 != null && mMPAGView2.f()) {
            z17 = true;
        }
        if (!z17 || (mMPAGView = this.f230683t) == null) {
            return;
        }
        mMPAGView.n();
    }

    public final void a7(df2.dn value) {
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i(this.f230676m, "set source:" + value);
        this.f230688y = value;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0704  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(df2.dn r36, r45.f02 r37, boolean r38, boolean r39, yz5.l r40, kotlin.coroutines.Continuation r41) {
        /*
            Method dump skipped, instructions count: 2815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ln.b7(df2.dn, r45.f02, boolean, boolean, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7(android.view.View r30) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ln.c7(android.view.View):void");
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        s71.b bVar;
        byte[] byteArrayExtra;
        rf2.q qVar = this.f230678o;
        if (qVar != null && i17 == qVar.f394856g && i18 == -1) {
            if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("launch_from_select_addr")) == null) {
                bVar = null;
            } else {
                bVar = new s71.b();
                bVar.parseFrom(byteArrayExtra);
            }
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e(qVar.f394855f, "request addr but result is empty!");
                return;
            }
            android.content.Context context = qVar.f394853d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(context.getResources().getString(com.tencent.mm.R.string.dpc));
            u1Var.n(context.getResources().getString(com.tencent.mm.R.string.dpb));
            u1Var.j(context.getResources().getString(com.tencent.mm.R.string.dpa));
            u1Var.i(new on2.b3(u1Var));
            u1Var.l(new rf2.m(qVar, bVar));
            u1Var.q(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = true;
        if ((valueOf == null || valueOf.intValue() != com.tencent.mm.R.id.fb6) && (valueOf == null || valueOf.intValue() != com.tencent.mm.R.id.bys)) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.en(this, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i(this.f230676m, "onLiveActivate");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f230677n = null;
        this.f230678o = null;
        this.f230679p = null;
        this.f230680q = null;
        this.f230683t = null;
        this.f230685v = null;
        com.tencent.mars.xlog.Log.i(this.f230676m, "set Back:false");
        this.f230687x = null;
        a7(df2.dn.f229991e);
        this.f230684u = null;
    }

    @Override // if2.e
    public void resume() {
        rf2.q qVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume cacheMilestoneLotteryInfo:");
        java.lang.Object obj = this.f230685v;
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        com.tencent.mars.xlog.Log.i(this.f230676m, sb6.toString());
        r45.f02 f02Var = this.f230685v;
        if (f02Var == null || (qVar = this.f230678o) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.d(qVar.f394854e, null, null, new rf2.n(f02Var, qVar, null), 3, null);
    }
}
