package my2;

/* loaded from: classes3.dex */
public final class k0 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public static final my2.e0 E = new my2.e0(null);
    public final com.tencent.mm.plugin.finder.assist.d9 A;
    public int B;
    public int C;
    public java.lang.String D;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f332743p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.UnchangeTextView f332744q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.UnchangeTextView f332745r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.UnchangeTextView f332746s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.FlowTextMixView f332747t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f332748u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.UnchangeTextView f332749v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f332750w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.LinearLayout f332751x;

    /* renamed from: y, reason: collision with root package name */
    public final ky2.g0 f332752y;

    /* renamed from: z, reason: collision with root package name */
    public android.os.CountDownTimer f332753z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f332743p = statusMonitor;
        com.tencent.mm.plugin.finder.assist.a9 a9Var = com.tencent.mm.plugin.finder.assist.d9.f102093f;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.A = com.tencent.mm.plugin.finder.assist.a9.a(a9Var, context, root.getContext().getResources().getString(com.tencent.mm.R.string.f9y), 500L, null, 8, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.p8m);
        this.f332744q = (com.tencent.mm.plugin.finder.view.UnchangeTextView) root.findViewById(com.tencent.mm.R.id.p8k);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) root.findViewById(com.tencent.mm.R.id.p8j);
        this.f332748u = wxRecyclerView;
        com.tencent.mm.plugin.finder.view.UnchangeTextView unchangeTextView = (com.tencent.mm.plugin.finder.view.UnchangeTextView) root.findViewById(com.tencent.mm.R.id.p8q);
        this.f332745r = unchangeTextView;
        this.f332746s = (com.tencent.mm.plugin.finder.view.UnchangeTextView) root.findViewById(com.tencent.mm.R.id.p8i);
        this.f332747t = (com.tencent.mm.ui.widget.FlowTextMixView) root.findViewById(com.tencent.mm.R.id.p8p);
        com.tencent.mm.plugin.finder.view.UnchangeTextView unchangeTextView2 = (com.tencent.mm.plugin.finder.view.UnchangeTextView) root.findViewById(com.tencent.mm.R.id.p8h);
        this.f332749v = unchangeTextView2;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.p8l);
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.p8o);
        this.f332750w = textView;
        if (wxRecyclerView != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.t(wxRecyclerView, false);
        }
        ky2.g0 g0Var = new ky2.g0(root, S0());
        this.f332752y = g0Var;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(g0Var);
        }
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(root.getContext()));
        }
        this.f332751x = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.p8n);
        g0Var.f313544g = new my2.a0(this, root);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(my2.b0.f332719d);
        }
        root.setOnClickListener(new my2.c0(this));
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new my2.d0(this));
        }
        if (unchangeTextView != null) {
            com.tencent.mm.ui.fk.a(unchangeTextView);
        }
        if (unchangeTextView2 != null) {
            com.tencent.mm.ui.fk.a(unchangeTextView2);
        }
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        this.D = "";
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f365323d.getVisibility() != 0) {
            return false;
        }
        K0(8);
        v1(8);
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        android.os.CountDownTimer countDownTimer;
        int i18 = ((mm2.c1) P0(mm2.c1.class)).f328895u6;
        my2.e0 e0Var = E;
        if (i18 == 0 || i18 == e0Var.hashCode()) {
            if (i17 == 0) {
                ((mm2.c1) P0(mm2.c1.class)).f328895u6 = e0Var.hashCode();
            } else {
                ((mm2.c1) P0(mm2.c1.class)).f328895u6 = 0;
            }
            if (i17 == 8 && (countDownTimer = this.f332753z) != null) {
                countDownTimer.cancel();
            }
            super.K0(i17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 99) {
            w1();
        } else if (ordinal == 100) {
            android.os.CountDownTimer countDownTimer = this.f332753z;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            K0(8);
            v1(8);
        }
        super.M0(status, bundle);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        android.os.CountDownTimer countDownTimer = this.f332753z;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final boolean a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return ((mm2.c1) P0(mm2.c1.class)).f328799e6.contains(str);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final boolean t1() {
        if (zl2.r4.f473950a.w1() || ((mm2.c1) P0(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) P0(mm2.n0.class)).f329273r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        if ((r1 != null && r1.getInteger(4) == 4) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        if ((r1 != null && r1.getInteger(4) == 4) != false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c A[LOOP:0: B:74:0x0176->B:76:0x017c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my2.k0.u1():void");
    }

    public final void v1(int i17) {
        qo0.c cVar = this.f332743p;
        if (i17 == 0 && this.f365323d.getVisibility() == 0) {
            mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
            boolean z17 = c1Var.N1;
            if (z17) {
                return;
            }
            c1Var.N1 = !z17;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", c1Var.N1);
            cVar.statusChange(qo0.b.Z2, bundle);
            return;
        }
        mm2.c1 c1Var2 = (mm2.c1) P0(mm2.c1.class);
        boolean z18 = c1Var2.N1;
        if (z18) {
            c1Var2.N1 = !z18;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", c1Var2.N1);
            cVar.statusChange(qo0.b.Z2, bundle2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
    
        if ((r1 != null && r1.getInteger(4) == 4) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x021d, code lost:
    
        if ((r1 != null && r1.getInteger(4) == 4) != false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0333 A[LOOP:0: B:127:0x032d->B:129:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1() {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my2.k0.w1():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r1 != null && r1.getInteger(4) == 4) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my2.k0.x1():void");
    }
}
