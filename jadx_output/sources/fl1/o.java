package fl1;

/* loaded from: classes7.dex */
public class o extends android.app.Dialog implements fl1.b2, ui1.z {
    public final java.util.List A;
    public fl1.i1 B;
    public int C;

    /* renamed from: d, reason: collision with root package name */
    public final xi1.g f263816d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f263817e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f263818f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f263819g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Button f263820h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.Button f263821i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f263822m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f263823n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f263824o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f263825p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.LinearLayout f263826q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView f263827r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f263828s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f263829t;

    /* renamed from: u, reason: collision with root package name */
    public final fl1.s f263830u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f263831v;

    /* renamed from: w, reason: collision with root package name */
    public fl1.g2 f263832w;

    /* renamed from: x, reason: collision with root package name */
    public final ui1.y f263833x;

    /* renamed from: y, reason: collision with root package name */
    public final fl1.r1 f263834y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f263835z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, xi1.g windowAndroid, ui1.y listener) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(windowAndroid, "windowAndroid");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f263816d = windowAndroid;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488086gu, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f263817e = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.oud);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f263830u = new fl1.s(context, findViewById);
        this.f263833x = listener;
        this.f263835z = "";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.A = arrayList;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.lzs);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f263818f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.lzw);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f263819g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.lzn);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById4;
        this.f263821i = button;
        button.setOnClickListener(new fl1.l(this));
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.lzx);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.Button button2 = (android.widget.Button) findViewById5;
        this.f263820h = button2;
        android.text.TextPaint paint = button2.getPaint();
        nf.y yVar = nf.x.f336616b;
        if (yVar != null) {
            yVar.g(paint);
        } else {
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            if (paint != null) {
                paint.setStrokeWidth(0.8f);
            }
        }
        button2.setOnClickListener(new fl1.m(this));
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.lzq);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById6;
        this.f263822m = textView;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.mwy);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f263823n = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.lzp);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f263826q = (android.widget.LinearLayout) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.lzz);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById9;
        this.f263824o = imageView;
        zk1.j jVar = zk1.m.f473414l;
        zk1.j.b(jVar, imageView, null, java.lang.Integer.valueOf(com.tencent.mm.R.string.f490304r9), false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479672c9), 4090, null);
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.lzm);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById10;
        this.f263825p = textView2;
        android.text.TextPaint paint2 = textView2.getPaint();
        nf.y yVar2 = nf.x.f336616b;
        if (yVar2 != null) {
            yVar2.g(paint2);
        } else {
            if (paint2 != null) {
                paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
        }
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.lzy);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView maxHeightRecyclerView = (com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView) findViewById11;
        this.f263827r = maxHeightRecyclerView;
        zk1.j.b(jVar, maxHeightRecyclerView, null, null, true, null, null, null, null, null, null, null, null, null, 8182, null);
        maxHeightRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        fl1.r1 r1Var = new fl1.r1(arrayList);
        this.f263834y = r1Var;
        r1Var.f263852e = this.B;
        maxHeightRecyclerView.setAdapter(r1Var);
        maxHeightRecyclerView.setItemAnimator(null);
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.lzt);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f263831v = findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.tencent.mm.R.id.b3v);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f263829t = findViewById13;
        android.view.View findViewById14 = inflate.findViewById(com.tencent.mm.R.id.lzr);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById14;
        this.f263828s = textView3;
        zk1.j.b(jVar, textView3, android.widget.Button.class, null, false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479672c9), 4092, null);
        textView2.setAccessibilityTraversalAfter(com.tencent.mm.R.id.lzw);
        textView2.setAccessibilityTraversalBefore(com.tencent.mm.R.id.lzz);
        textView.setAccessibilityTraversalAfter(com.tencent.mm.R.id.lzm);
        textView.setAccessibilityTraversalBefore(com.tencent.mm.R.id.lzy);
        textView3.setAccessibilityTraversalAfter(com.tencent.mm.R.id.lzy);
        textView3.setAccessibilityTraversalBefore(com.tencent.mm.R.id.lzn);
        this.C = 2;
    }

    public static final java.util.ArrayList c(fl1.o oVar, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        oVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.text.TextUtils.isEmpty(oVar.f263835z)) {
            java.util.List<fl1.h1> list = oVar.f263834y.f263851d;
            if (list.size() == 1) {
                fl1.h1 h1Var = (fl1.h1) list.get(0);
                if (h1Var != null && (str2 = h1Var.f263782d) != null) {
                    arrayList.add(str2);
                }
            } else {
                for (fl1.h1 h1Var2 : list) {
                    if ((h1Var2 != null && h1Var2.f263784f == z17) && (str = h1Var2.f263782d) != null) {
                        arrayList.add(str);
                    }
                }
            }
        } else {
            arrayList.add(oVar.f263835z);
        }
        return arrayList;
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    public final void e(int i17) {
        double d17 = (i17 == 1 || i17 == 3) ? 1.5d : 2.5d;
        com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView maxHeightRecyclerView = this.f263827r;
        maxHeightRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new fl1.n(d17, this));
        maxHeightRecyclerView.invalidate();
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f263817e;
    }

    @Override // ui1.z
    public android.view.MotionEvent getLastPointerDownTouchEvent() {
        android.view.View view = this.f263817e;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandDialogContentView");
        return ((com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandDialogContentView) view).getLastPointerDownTouchEvent();
    }

    @Override // fl1.b2
    public int getPosition() {
        return this.C;
    }

    @Override // si1.k0
    public si1.j0 h(com.tencent.mm.plugin.appbrand.jsapi.l component, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var) {
        kotlin.jvm.internal.o.g(component, "component");
        xi1.g windowAndroid = component.getWindowAndroid();
        kotlin.jvm.internal.o.d(windowAndroid);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        fl1.z1 z1Var = new fl1.z1(r1Var, str, context, this.f263817e.getMeasuredHeight(), windowAndroid);
        z1Var.k(this.C);
        return z1Var;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    public final boolean k() {
        fl1.s sVar = this.f263830u;
        if (sVar.c()) {
            return sVar.a();
        }
        return true;
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f263817e);
    }

    @Override // ui1.z
    public void o(boolean z17) {
        this.f263824o.setVisibility(z17 ? 0 : 8);
    }

    @Override // fl1.b2
    public void onCancel() {
        ui1.y.b(this.f263833x, 3, new java.util.ArrayList(), 0, false, 12, null);
    }

    @Override // si1.i0
    public void p(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        i(component).a(this);
    }

    @Override // si1.i0
    public void r(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        s(this.C);
        i(component).c(this);
    }

    public final void s(int i17) {
        this.C = i17;
        android.view.View view = this.f263817e;
        if (i17 == 1) {
            view.setBackground(b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.f480857ea));
        } else {
            if (i17 != 2) {
                return;
            }
            view.setBackground(b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.e_));
        }
    }

    @Override // ui1.z
    public void setAppBrandName(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f263819g.setText(str);
    }

    @Override // ui1.z
    public void setApplyWording(java.lang.String str) {
        this.f263825p.setText(str);
    }

    @Override // ui1.z
    public void setExplainOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f263824o.setOnClickListener(onClickListener);
    }

    @Override // ui1.z
    public void setFunctionButtonOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f263828s.setOnClickListener(onClickListener);
    }

    @Override // ui1.z
    public void setFunctionButtonText(java.lang.String str) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        android.widget.TextView textView = this.f263828s;
        if (isEmpty) {
            textView.setText("");
            textView.setVisibility(4);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    @Override // ui1.z
    public void setFunctionButtonTextColor(int i17) {
        this.f263828s.setTextColor(i17);
    }

    @Override // ui1.z
    public void setFunctionButtonVisibility(int i17) {
        this.f263828s.setVisibility(i17);
    }

    @Override // fl1.e2
    public void setIExternalToolsHelper(com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var) {
        this.f263830u.f263860m = r1Var;
    }

    @Override // ui1.z
    public void setIconUrl(java.lang.String str) {
        l01.d0.f314761a.b(this.f263818f, str, com.tencent.mm.plugin.appbrand.ui.ud.a(), l01.q0.f314787d);
    }

    @Override // ui1.z
    public void setItemCheckedListener(fl1.i1 i1Var) {
        this.B = i1Var;
        this.f263834y.f263852e = i1Var;
    }

    @Override // ui1.z
    public void setNegativeButtonText(java.lang.String str) {
        if (str != null) {
            this.f263821i.setText(str);
        }
    }

    @Override // ui1.z
    public void setOnListItemLongClickListener(fl1.j1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f263834y.f263853f = listener;
    }

    @Override // ui1.z
    public void setPositiveButtonText(java.lang.String str) {
        if (str != null) {
            this.f263820h.setText(str);
        }
    }

    @Override // ui1.z
    public void setRequestDesc(java.lang.String str) {
        this.f263822m.setText(str);
    }

    @Override // ui1.z
    public void setScope(java.lang.String scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f263835z = scope;
    }

    @Override // ui1.z
    public void setSelectListItem(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.List list2 = this.A;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        this.f263834y.notifyDataSetChanged();
        this.f263826q.setVisibility(0);
        android.view.View view = this.f263831v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ui1.z
    public void setSimpleDetailDesc(java.lang.String str) {
        if (str != null) {
            android.widget.TextView textView = this.f263823n;
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // fl1.e2
    public void setUserAgreementCheckBoxWording(java.lang.String wording) {
        kotlin.jvm.internal.o.g(wording, "wording");
        this.f263830u.setUserAgreementCheckBoxWording(wording);
    }

    @Override // fl1.e2
    public void setUserAgreementCheckedAlertListener(fl1.j2 j2Var) {
        this.f263830u.f263862o = j2Var;
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        s(this.C);
        this.f263832w = g2Var;
        java.lang.Object systemService = getContext().getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f263792a;
            android.content.Context context = this.f263817e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i2Var.a(context, this.f263817e, this.f263829t, windowManager.getDefaultDisplay().getRotation(), this.f263816d, this.f263830u.c());
            e(windowManager.getDefaultDisplay().getRotation());
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        fl1.i2 i2Var = fl1.i2.f263792a;
        android.content.Context context = this.f263817e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i2Var.a(context, this.f263817e, this.f263829t, i17, this.f263816d, this.f263830u.c());
        e(i17);
    }
}
