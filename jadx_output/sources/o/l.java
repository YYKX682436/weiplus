package o;

/* loaded from: classes15.dex */
public final class l extends o.c0 implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    public int A;
    public boolean C;
    public o.f0 D;
    public android.view.ViewTreeObserver E;
    public android.widget.PopupWindow.OnDismissListener F;
    public boolean G;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f341725e;

    /* renamed from: f, reason: collision with root package name */
    public final int f341726f;

    /* renamed from: g, reason: collision with root package name */
    public final int f341727g;

    /* renamed from: h, reason: collision with root package name */
    public final int f341728h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f341729i;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Handler f341730m;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f341738u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f341739v;

    /* renamed from: w, reason: collision with root package name */
    public int f341740w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f341741x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f341742y;

    /* renamed from: z, reason: collision with root package name */
    public int f341743z;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f341731n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f341732o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f341733p = new o.g(this);

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnAttachStateChangeListener f341734q = new o.h(this);

    /* renamed from: r, reason: collision with root package name */
    public final androidx.appcompat.widget.m1 f341735r = new o.j(this);

    /* renamed from: s, reason: collision with root package name */
    public int f341736s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f341737t = 0;
    public boolean B = false;

    public l(android.content.Context context, android.view.View view, int i17, int i18, boolean z17) {
        this.f341725e = context;
        this.f341738u = view;
        this.f341727g = i17;
        this.f341728h = i18;
        this.f341729i = z17;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        this.f341740w = n3.v0.d(view) != 1 ? 1 : 0;
        android.content.res.Resources resources = context.getResources();
        this.f341726f = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479973kl));
        this.f341730m = new android.os.Handler();
    }

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f341732o;
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                i17 = -1;
                break;
            } else if (rVar == ((o.k) arrayList.get(i17)).f341723b) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 < 0) {
            return;
        }
        int i18 = i17 + 1;
        if (i18 < arrayList.size()) {
            ((o.k) arrayList.get(i18)).f341723b.c(false);
        }
        o.k kVar = (o.k) arrayList.remove(i17);
        kVar.f341723b.r(this);
        boolean z18 = this.G;
        androidx.appcompat.widget.o1 o1Var = kVar.f341722a;
        if (z18) {
            o1Var.E.setExitTransition(null);
            o1Var.E.setAnimationStyle(0);
        }
        o1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f341740w = ((o.k) arrayList.get(size2 - 1)).f341724c;
        } else {
            android.view.View view = this.f341738u;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            this.f341740w = n3.v0.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z17) {
                ((o.k) arrayList.get(0)).f341723b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o.f0 f0Var = this.D;
        if (f0Var != null) {
            f0Var.a(rVar, true);
        }
        android.view.ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.E.removeGlobalOnLayoutListener(this.f341733p);
            }
            this.E = null;
        }
        this.f341739v.removeOnAttachStateChangeListener(this.f341734q);
        this.F.onDismiss();
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        return null;
    }

    @Override // o.g0
    public void c(boolean z17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f341732o).iterator();
        while (it.hasNext()) {
            android.widget.ListAdapter adapter = ((o.k) it.next()).f341722a.f9419f.getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                adapter = ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((o.o) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.k0
    public void dismiss() {
        java.util.List list = this.f341732o;
        int size = ((java.util.ArrayList) list).size();
        if (size > 0) {
            o.k[] kVarArr = (o.k[]) ((java.util.ArrayList) list).toArray(new o.k[size]);
            for (int i17 = size - 1; i17 >= 0; i17--) {
                o.k kVar = kVarArr[i17];
                if (kVar.f341722a.isShowing()) {
                    kVar.f341722a.dismiss();
                }
            }
        }
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
    }

    @Override // o.g0
    public void g(o.f0 f0Var) {
        this.D = f0Var;
    }

    @Override // o.k0
    public android.widget.ListView getListView() {
        java.util.List list = this.f341732o;
        if (((java.util.ArrayList) list).isEmpty()) {
            return null;
        }
        return ((o.k) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).f341722a.f9419f;
    }

    @Override // o.g0
    public boolean i(o.o0 o0Var) {
        java.util.Iterator it = ((java.util.ArrayList) this.f341732o).iterator();
        while (it.hasNext()) {
            o.k kVar = (o.k) it.next();
            if (o0Var == kVar.f341723b) {
                kVar.f341722a.f9419f.requestFocus();
                return true;
            }
        }
        if (!o0Var.hasVisibleItems()) {
            return false;
        }
        k(o0Var);
        o.f0 f0Var = this.D;
        if (f0Var != null) {
            f0Var.c(o0Var);
        }
        return true;
    }

    @Override // o.k0
    public boolean isShowing() {
        java.util.List list = this.f341732o;
        return ((java.util.ArrayList) list).size() > 0 && ((o.k) ((java.util.ArrayList) list).get(0)).f341722a.isShowing();
    }

    @Override // o.c0
    public void k(o.r rVar) {
        rVar.b(this, this.f341725e);
        if (isShowing()) {
            u(rVar);
        } else {
            ((java.util.ArrayList) this.f341731n).add(rVar);
        }
    }

    @Override // o.c0
    public void m(android.view.View view) {
        if (this.f341738u != view) {
            this.f341738u = view;
            int i17 = this.f341736s;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            this.f341737t = android.view.Gravity.getAbsoluteGravity(i17, n3.v0.d(view));
        }
    }

    @Override // o.c0
    public void n(boolean z17) {
        this.B = z17;
    }

    @Override // o.c0
    public void o(int i17) {
        if (this.f341736s != i17) {
            this.f341736s = i17;
            android.view.View view = this.f341738u;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            this.f341737t = android.view.Gravity.getAbsoluteGravity(i17, n3.v0.d(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        o.k kVar;
        java.util.List list = this.f341732o;
        int size = ((java.util.ArrayList) list).size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                kVar = null;
                break;
            }
            kVar = (o.k) ((java.util.ArrayList) list).get(i17);
            if (!kVar.f341722a.isShowing()) {
                break;
            } else {
                i17++;
            }
        }
        if (kVar != null) {
            kVar.f341723b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i17 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.c0
    public void p(int i17) {
        this.f341741x = true;
        this.f341743z = i17;
    }

    @Override // o.c0
    public void q(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.F = onDismissListener;
    }

    @Override // o.c0
    public void r(boolean z17) {
        this.C = z17;
    }

    @Override // o.c0
    public void s(int i17) {
        this.f341742y = true;
        this.A = i17;
    }

    @Override // o.k0
    public void show() {
        if (isShowing()) {
            return;
        }
        java.util.List list = this.f341731n;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            u((o.r) it.next());
        }
        ((java.util.ArrayList) list).clear();
        android.view.View view = this.f341738u;
        this.f341739v = view;
        if (view != null) {
            boolean z17 = this.E == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z17) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f341733p);
            }
            this.f341739v.addOnAttachStateChangeListener(this.f341734q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(o.r r19) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l.u(o.r):void");
    }
}
