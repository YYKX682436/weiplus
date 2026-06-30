package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xh extends com.tencent.mm.plugin.finder.live.widget.n8 {
    public static final java.util.Set H = kz5.z.D0(new java.lang.Integer[]{19, 6, 28, 25, 26, 27, 20, 21, 22, 23, 24, 29, 30});
    public static final android.text.InputFilter I = com.tencent.mm.plugin.finder.live.widget.eh.f118251d;

    /* renamed from: J, reason: collision with root package name */
    public static final android.text.InputFilter f120324J = com.tencent.mm.plugin.finder.live.widget.fh.f118354d;
    public static final int K = 10;
    public r45.kv1 A;
    public java.lang.String B;
    public kotlinx.coroutines.r2 C;
    public int D;
    public final jz5.g E;
    public final com.tencent.mm.plugin.finder.live.widget.oh F;
    public final jz5.g G;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f120325h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f120326i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f120327m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f120328n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.EditText f120329o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f120330p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.LinearLayout f120331q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f120332r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f120333s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f120334t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f120335u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f120336v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f120337w;

    /* renamed from: x, reason: collision with root package name */
    public r45.yp1 f120338x;

    /* renamed from: y, reason: collision with root package name */
    public r45.kv1 f120339y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f120340z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aqi, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f120326i = inflate;
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) inflate.findViewById(com.tencent.mm.R.id.gre);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463315n));
        this.f120327m = mMPAGView;
        this.f120328n = (android.widget.TextView) this.f120326i.findViewById(com.tencent.mm.R.id.grf);
        this.f120329o = (android.widget.EditText) this.f120326i.findViewById(com.tencent.mm.R.id.grd);
        this.f120330p = this.f120326i.findViewById(com.tencent.mm.R.id.f483834c63);
        this.f120331q = (android.widget.LinearLayout) this.f120326i.findViewById(com.tencent.mm.R.id.f483833c62);
        this.f120332r = new java.util.LinkedHashMap();
        this.f120333s = this.f120326i.findViewById(com.tencent.mm.R.id.aud);
        android.view.View findViewById = this.f120326i.findViewById(com.tencent.mm.R.id.b5i);
        this.f120334t = findViewById;
        android.widget.TextView confirmBtn = (android.widget.TextView) this.f120326i.findViewById(com.tencent.mm.R.id.c9z);
        this.f120335u = confirmBtn;
        this.f120336v = (android.widget.TextView) this.f120326i.findViewById(com.tencent.mm.R.id.odf);
        this.f120337w = (android.widget.TextView) this.f120326i.findViewById(com.tencent.mm.R.id.cut);
        this.f120340z = "";
        this.B = "";
        this.D = K;
        this.E = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.jh(this));
        this.F = new com.tencent.mm.plugin.finder.live.widget.oh(this);
        this.G = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.kh(this));
        this.f120326i.setOnTouchListener(com.tencent.mm.plugin.finder.live.widget.ch.f118005d);
        j(false);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.dh(this));
        kotlin.jvm.internal.o.f(confirmBtn, "confirmBtn");
        setTextBold(confirmBtn);
    }

    public static final void c(com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        xhVar.getClass();
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var != null) {
            c1Var.N1 = false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin = xhVar.getBasePlugin();
        if (basePlugin != null) {
            basePlugin.R0().statusChange(qo0.b.Z2, bundle);
        }
    }

    private final androidx.lifecycle.k0 getLandScapeKeyBoardObserve() {
        return (androidx.lifecycle.k0) ((jz5.n) this.E).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.finder.live.widget.gh getModifyBottomPage() {
        return (com.tencent.mm.plugin.finder.live.widget.gh) ((jz5.n) this.G).getValue();
    }

    public final boolean d() {
        r45.yp1 yp1Var = this.f120338x;
        return ((yp1Var != null ? yp1Var.getInteger(3) : 0) & 2) > 0;
    }

    public final void e() {
        if (d()) {
            android.widget.EditText editText = this.f120329o;
            editText.setVisibility(8);
            this.f120328n.setVisibility(0);
            android.view.View view = this.f120333s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = this.f120330p.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            if (editText != null) {
                editText.clearFocus();
            }
            android.content.Context context = getContext();
            java.lang.Object systemService = context != null ? context.getSystemService("input_method") : null;
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
        }
    }

    public final void f() {
        r45.kv1 kv1Var = this.A;
        if (kv1Var != null) {
            java.lang.String string = kv1Var != null ? kv1Var.getString(0) : null;
            r45.kv1 kv1Var2 = this.f120339y;
            if (!kotlin.jvm.internal.o.b(string, kv1Var2 != null ? kv1Var2.getString(0) : null)) {
                j(true);
                return;
            }
        }
        if (!kotlin.jvm.internal.o.b(this.B, this.f120340z)) {
            if (this.B.length() > 0) {
                j(true);
                return;
            }
        }
        j(false);
    }

    public final void g(r45.kv1 kv1Var) {
        this.A = kv1Var;
        ((java.util.LinkedHashMap) this.f120332r).forEach(new com.tencent.mm.plugin.finder.live.widget.mh(this));
        kotlinx.coroutines.r2 r2Var = this.C;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f120327m;
        mMPAGView.n();
        mMPAGView.setProgress(0.0d);
        mMPAGView.setVisibility(8);
        r45.kv1 kv1Var2 = this.A;
        if (kv1Var2 != null) {
            this.C = kotlinx.coroutines.l.d(getScope(), null, null, new com.tencent.mm.plugin.finder.live.widget.lh(kv1Var2, this, null), 3, null);
        }
        f();
    }

    public final yz5.a getBackClickListener() {
        return this.f120325h;
    }

    public final android.view.View getRoot() {
        return this.f120326i;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.tencent.mm.ui.widget.dialog.y1 r23, r45.yp1 r24, r45.kv1 r25, r45.qa0 r26) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.xh.h(com.tencent.mm.ui.widget.dialog.y1, r45.yp1, r45.kv1, r45.qa0):void");
    }

    public final void i() {
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin;
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!r4Var.Y1(context) || (basePlugin = getBasePlugin()) == null) {
            return;
        }
        ((mm2.e1) basePlugin.P0(mm2.e1.class)).B.removeObservers(basePlugin);
    }

    public final void j(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFansModifyGiftWidget", "updateConfirmBtn canConfirm:" + z17);
        android.widget.TextView confirmBtn = this.f120335u;
        confirmBtn.setEnabled(z17);
        zl2.r4 r4Var = zl2.r4.f473950a;
        kotlin.jvm.internal.o.f(confirmBtn, "confirmBtn");
        r4Var.Y2(confirmBtn, z17, true);
    }

    public final void setBackClickListener(yz5.a aVar) {
        this.f120325h = aVar;
    }

    public final void setRoot(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f120326i = view;
    }
}
