package rl5;

/* loaded from: classes15.dex */
public class r implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, android.view.View.OnKeyListener {

    /* renamed from: l1, reason: collision with root package name */
    public static boolean f397332l1;

    /* renamed from: x0, reason: collision with root package name */
    public static int f397333x0;

    /* renamed from: y0, reason: collision with root package name */
    public static int f397334y0;
    public android.view.View A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f397335J;
    public boolean K;
    public android.widget.PopupWindow.OnDismissListener L;
    public rl5.o M;
    public boolean N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public long X;
    public rl5.n Y;
    public boolean Z;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f397336d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f397337e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f397338f;

    /* renamed from: g, reason: collision with root package name */
    public rl5.q f397339g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMListPopupWindow f397340h;

    /* renamed from: i, reason: collision with root package name */
    public db5.d5 f397341i;

    /* renamed from: m, reason: collision with root package name */
    public db5.d5 f397342m;

    /* renamed from: n, reason: collision with root package name */
    public db5.d5 f397343n;

    /* renamed from: o, reason: collision with root package name */
    public db5.d5 f397344o;

    /* renamed from: p, reason: collision with root package name */
    public int f397345p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f397346p0;

    /* renamed from: q, reason: collision with root package name */
    public int f397347q;

    /* renamed from: r, reason: collision with root package name */
    public android.util.DisplayMetrics f397348r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f397349s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f397350t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View.OnCreateContextMenuListener f397351u;

    /* renamed from: v, reason: collision with root package name */
    public db5.r4 f397352v;

    /* renamed from: w, reason: collision with root package name */
    public db5.q4 f397353w;

    /* renamed from: x, reason: collision with root package name */
    public db5.t4 f397354x;

    /* renamed from: y, reason: collision with root package name */
    public db5.n4 f397355y;

    /* renamed from: z, reason: collision with root package name */
    public db5.g4 f397356z;

    public r(android.content.Context context, android.view.View view) {
        this.f397336d = null;
        this.f397339g = null;
        this.f397349s = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = false;
        this.K = false;
        this.N = false;
        this.P = false;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0L;
        this.Z = true;
        this.f397346p0 = false;
        this.f397336d = context;
        this.f397338f = view;
        this.f397337e = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        c();
        l();
    }

    public boolean a() {
        if (e()) {
            com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f397340h;
            if (mMListPopupWindow != null) {
                mMListPopupWindow.a();
            }
            return true;
        }
        db5.d5 d5Var = this.f397341i;
        if (d5Var != null && d5Var.isShowing()) {
            db5.d5 d5Var2 = this.f397341i;
            if (d5Var2 != null) {
                d5Var2.dismiss();
            }
            return true;
        }
        if (d()) {
            db5.d5 d5Var3 = this.f397342m;
            if (d5Var3 != null) {
                d5Var3.dismiss();
            }
            return true;
        }
        db5.d5 d5Var4 = this.f397344o;
        if (!(d5Var4 != null && d5Var4.isShowing())) {
            return false;
        }
        db5.d5 d5Var5 = this.f397344o;
        if (d5Var5 != null) {
            d5Var5.dismiss();
        }
        return true;
    }

    public int b() {
        db5.d5 d5Var = this.f397342m;
        if (d5Var == null || d5Var.getContentView() == null) {
            return 0;
        }
        android.view.View contentView = this.f397342m.getContentView();
        contentView.measure(0, 0);
        return contentView.getMeasuredHeight();
    }

    public final void c() {
        a();
        android.content.Context context = this.f397336d;
        this.f397356z = new db5.g4(context);
        this.f397339g = new rl5.q(this, null);
        this.f397348r = context.getResources().getDisplayMetrics();
    }

    public boolean d() {
        db5.d5 d5Var = this.f397342m;
        return d5Var != null && d5Var.isShowing();
    }

    public boolean e() {
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f397340h;
        return mMListPopupWindow != null && mMListPopupWindow.f197477g.isShowing();
    }

    public void f(android.view.View view, db5.n4 n4Var, db5.t4 t4Var, int i17, int i18) {
        this.f397354x = t4Var;
        this.f397338f = view;
        if (!(view instanceof android.widget.TextView) && (i17 == 0 || i18 == 0)) {
            l();
        }
        this.f397356z.clear();
        n4Var.a(this.f397356z, view, null);
        if (i17 == 0 && i18 == 0) {
            m();
        } else {
            n(i17, i18);
        }
    }

    public void g(android.view.View view, int i17, long j17, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, int i18, int i19) {
        this.f397354x = t4Var;
        this.f397338f = view;
        l();
        this.f397356z.clear();
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new android.widget.AdapterView.AdapterContextMenuInfo(view, i17, j17);
        onCreateContextMenuListener.onCreateContextMenu(this.f397356z, view, adapterContextMenuInfo);
        java.util.Iterator it = ((java.util.ArrayList) this.f397356z.f228344d).iterator();
        while (it.hasNext()) {
            ((db5.h4) ((android.view.MenuItem) it.next())).f228381y = adapterContextMenuInfo;
        }
        if (i18 == 0 && i19 == 0) {
            m();
        } else {
            n(i18, i19);
        }
    }

    public void h(android.view.View view, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, int i17, int i18) {
        this.f397354x = t4Var;
        this.f397338f = view;
        if (!(view instanceof android.widget.TextView) && (i17 == 0 || i18 == 0)) {
            l();
        }
        this.f397356z.clear();
        onCreateContextMenuListener.onCreateContextMenu(this.f397356z, view, null);
        if (i17 == 0 && i18 == 0) {
            m();
        } else {
            n(i17, i18);
        }
    }

    public void i(android.view.View view, db5.n4 n4Var, db5.t4 t4Var) {
        this.f397338f = view;
        l();
        this.f397354x = t4Var;
        if (view instanceof android.widget.AbsListView) {
            com.tencent.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView", new java.lang.Object[0]);
            ((android.widget.AbsListView) view).setOnItemLongClickListener(new rl5.g(this, n4Var));
        } else {
            com.tencent.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view", new java.lang.Object[0]);
            view.setOnLongClickListener(new rl5.h(this, n4Var, view));
        }
    }

    public void j(android.view.View view, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var) {
        this.f397338f = view;
        l();
        this.f397354x = t4Var;
        if (view instanceof android.widget.AbsListView) {
            com.tencent.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView", new java.lang.Object[0]);
            ((android.widget.AbsListView) view).setOnItemLongClickListener(new rl5.e(this, onCreateContextMenuListener));
        } else {
            com.tencent.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view", new java.lang.Object[0]);
            view.setOnLongClickListener(new rl5.f(this, onCreateContextMenuListener));
        }
    }

    public void k(int i17) {
        db5.d5 d5Var;
        boolean z17 = this.W;
        android.content.Context context = this.f397336d;
        if (z17 && (d5Var = this.f397344o) != null) {
            d5Var.setBackgroundDrawable(context.getResources().getDrawable(i17));
            return;
        }
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f397340h;
        if (mMListPopupWindow != null) {
            mMListPopupWindow.f197477g.setBackgroundDrawable(context.getResources().getDrawable(i17));
        }
    }

    public final void l() {
        this.f397338f.setOnTouchListener(new rl5.d(this));
    }

    public boolean m() {
        return n(0, 0);
    }

    public boolean n(int i17, int i18) {
        int i19;
        int i27;
        int width;
        int dimensionPixelSize;
        android.view.View view = this.f397338f;
        if (((view != null && !view.equals(this.A)) || !f397332l1) && (i17 != 0 || i18 != 0)) {
            f397333x0 = i17;
            f397334y0 = i18;
        }
        this.A = null;
        boolean z17 = false;
        if (this.S) {
            i19 = f397333x0;
            i27 = f397334y0;
        } else {
            i19 = 0;
            i27 = 0;
        }
        f397332l1 = false;
        android.util.DisplayMetrics displayMetrics = this.f397348r;
        android.content.Context context = this.f397336d;
        if (displayMetrics == null) {
            this.f397348r = context.getResources().getDisplayMetrics();
        }
        android.view.View view2 = this.f397338f;
        if (view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            if (i19 == 0 || i19 > this.f397348r.widthPixels || this.F) {
                i19 = iArr[0] + (this.f397338f.getWidth() / 2);
            }
            if (this.F && !this.W) {
                if (this.G) {
                    width = iArr[0];
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                } else {
                    width = iArr[0] + this.f397338f.getWidth();
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                }
                i19 = width - dimensionPixelSize;
            }
            int i28 = iArr[1];
            int height = this.f397338f.getHeight() + i28;
            if (i28 < 0) {
                i28 = 0;
            }
            int i29 = this.f397348r.heightPixels;
            if (height > i29) {
                height = i29;
            }
            if (i27 == 0 || this.F) {
                i27 = ((i28 + height) / 2) - (this.W ? this.f397338f.getHeight() / 2 : 0);
            }
        }
        com.tencent.mm.ui.yk.c("MicroMsg.MMPopupMenu", "show popMenu , xDown:%s, yDown:%s, showPointX:%s, showPointY:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (e()) {
            db5.d5 d5Var = this.f397341i;
            if (d5Var != null && d5Var.isShowing()) {
                z17 = true;
            }
            if (z17 && d()) {
                return a() & p(i19, i27);
            }
        }
        return p(i19, i27);
    }

    public final void o(int i17, int i18) {
        android.content.Context context = this.f397336d;
        db5.d5 d5Var = new db5.d5(context);
        this.f397344o = d5Var;
        d5Var.setOnDismissListener(this);
        this.f397344o.setWidth(-2);
        this.f397344o.setHeight(-2);
        this.f397344o.setFocusable(true);
        this.f397344o.setOutsideTouchable(true);
        this.f397344o.setAnimationStyle(com.tencent.mm.R.style.f494459nm);
        this.f397344o.setInputMethodMode(2);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dlz, null);
        inflate.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f485900jh2);
        linearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        int size = this.f397356z.size();
        for (int i19 = 0; i19 < size; i19++) {
            rl5.n nVar = this.Y;
            android.view.View a17 = nVar != null ? nVar.a(context, (android.view.MenuItem) ((java.util.ArrayList) this.f397356z.f228344d).get(i19)) : null;
            if (a17 == null) {
                android.view.MenuItem menuItem = (android.view.MenuItem) ((java.util.ArrayList) this.f397356z.f228344d).get(i19);
                android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.dly, null);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.h5n);
                android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.obc);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.qx_);
                weImageView.setImageDrawable(menuItem.getIcon());
                textView.setText(menuItem.getTitle());
                if (menuItem.getItemId() == this.f397345p) {
                    weImageView2.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.check_mark_regular, context.getColor(com.tencent.mm.R.color.Brand_100)));
                    weImageView2.setVisibility(0);
                }
                if (i19 + 1 == size) {
                    ((android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.f484109d21)).setVisibility(8);
                }
                a17 = inflate2;
            }
            a17.setOnClickListener(new rl5.a(this, i19));
            if (linearLayout.getChildCount() < 5) {
                linearLayout.addView(a17);
            }
        }
        this.f397344o.setContentView(inflate);
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = inflate.getMeasuredHeight();
        int measuredWidth = inflate.getMeasuredWidth();
        int a18 = com.tencent.mm.ui.zk.a(context, 12);
        int i27 = i17 - ((int) (measuredWidth / 2.0f));
        int i28 = i27 + measuredWidth;
        int i29 = this.f397348r.widthPixels;
        if (i28 > i29 - a18) {
            a18 = (i29 - a18) - measuredWidth;
        } else if (i27 >= a18) {
            a18 = i27;
        }
        int a19 = a18 - com.tencent.mm.ui.zk.a(context, 8);
        int e17 = (i18 - measuredHeight) - com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479672c9);
        if (e17 < 0 || this.V) {
            e17 = i18 + this.f397338f.getHeight() + com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479646bl);
        }
        if (!(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing()) {
            return;
        }
        com.tencent.mm.ui.yk.c("MicroMsg.MMPopupMenu", "showTickStyleMenu, x:" + a19 + ", y:" + e17, new java.lang.Object[0]);
        this.f397344o.showAtLocation(this.f397338f, 0, a19, e17);
        this.X = java.lang.System.currentTimeMillis();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        if (!this.f397349s) {
            android.view.View view = this.f397350t;
            if (view != null) {
                view.setSelected(false);
            } else {
                this.f397338f.setSelected(false);
            }
        }
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.L;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0af4 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0960  */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 2808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rl5.r.p(int, int):boolean");
    }

    public r(android.content.Context context) {
        this.f397336d = null;
        this.f397338f = null;
        this.f397339g = null;
        this.f397349s = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = false;
        this.K = false;
        this.N = false;
        this.P = false;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0L;
        this.Z = true;
        this.f397346p0 = false;
        this.f397336d = context;
        this.f397337e = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        c();
    }
}
