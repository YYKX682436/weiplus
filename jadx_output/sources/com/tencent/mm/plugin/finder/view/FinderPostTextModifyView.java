package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB%\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderPostTextModifyView;", "Landroid/widget/RelativeLayout;", "Landroidx/recyclerview/widget/p2;", "getItemDecoration", "", "getLeftLen", "getModLen", "Lcom/tencent/mm/plugin/finder/view/pp;", "callback", "Ljz5/f0;", "setModifyCallback", "", "Lso2/n6;", "getDeleteList", "Landroid/view/View;", "d", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "y", "Ljz5/g;", "getModifyLimit", "()I", "modifyLimit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderPostTextModifyView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.view.View contentView;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f131417e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f131418f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f131419g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f131420h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMEditText f131421i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f131422m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f131423n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f131424o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f131425p;

    /* renamed from: q, reason: collision with root package name */
    public int f131426q;

    /* renamed from: r, reason: collision with root package name */
    public int f131427r;

    /* renamed from: s, reason: collision with root package name */
    public so2.p6 f131428s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f131429t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f131430u;

    /* renamed from: v, reason: collision with root package name */
    public int f131431v;

    /* renamed from: w, reason: collision with root package name */
    public int f131432w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.pp f131433x;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final jz5.g modifyLimit;

    public FinderPostTextModifyView(android.content.Context context) {
        super(context);
        this.f131425p = "";
        this.f131428s = so2.p6.f410542e;
        this.f131429t = new java.util.LinkedList();
        this.f131430u = new java.util.ArrayList();
        this.modifyLimit = jz5.h.a(jz5.i.f302831f, new com.tencent.mm.plugin.finder.view.uh(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.edg, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.tsu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.contentView = findViewById;
        int h17 = com.tencent.mm.ui.bl.h(getContext());
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.tsw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f131417e = textView;
        com.tencent.mm.ui.kk.d(textView, com.tencent.mm.ui.kk.a(textView) + h17);
        textView.setText(e(false));
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.tsx);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f131420h = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.tsy);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f131418f = findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.tsz);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) findViewById5;
        this.f131419g = weButton;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.Object systemService = context2.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        weButton.setTextSize(1, (14.0f * displayMetrics.density) / context2.getResources().getDisplayMetrics().density);
        dq4.c cVar = dq4.c.f242369a;
        cVar.f(weButton);
        weButton.setEnabled(true);
        cVar.f(findViewById4);
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.f484911tt1);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById6;
        this.f131421i = mMEditText;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.f484912tt2);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f131422m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.f484910tt0);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f131423n = (android.widget.TextView) findViewById8;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.tsv);
        this.f131424o = recyclerView;
        if (recyclerView != null) {
            com.tencent.mm.ui.kk.d(recyclerView, com.tencent.mm.ui.kk.a(recyclerView) + h17);
        }
        findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.view.ph(this));
        weButton.setOnClickListener(new com.tencent.mm.plugin.finder.view.qh(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.rh(this));
        f();
    }

    private final androidx.recyclerview.widget.p2 getItemDecoration() {
        return new com.tencent.mm.plugin.finder.view.th();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getLeftLen() {
        return getModifyLimit() - getModLen();
    }

    private final int getModLen() {
        return this.f131428s == so2.p6.f410542e ? this.f131431v : this.f131432w;
    }

    private final int getModifyLimit() {
        return ((java.lang.Number) this.modifyLimit.getValue()).intValue();
    }

    public final boolean b(java.lang.String selectAtStr, int i17, int i18, so2.p6 textType) {
        kotlin.jvm.internal.o.g(selectAtStr, "selectAtStr");
        kotlin.jvm.internal.o.g(textType, "textType");
        this.f131428s = textType;
        if (g(i17, i18, textType)) {
            return false;
        }
        if (com.tencent.mm.ui.tools.v4.f(selectAtStr) <= getLeftLen()) {
            return true;
        }
        m();
        return false;
    }

    public final java.util.List c(so2.p6 textType) {
        kotlin.jvm.internal.o.g(textType, "textType");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f131429t) {
            so2.n6 n6Var = (so2.n6) obj;
            boolean z17 = false;
            if (n6Var.f410505e == textType) {
                if (n6Var.f410501a.length() > 0) {
                    if (n6Var.f410502b.length() > 0) {
                        z17 = true;
                    }
                }
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.List d(int i17, int i18, so2.p6 p6Var) {
        java.util.List c17 = c(p6Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            so2.n6 n6Var = (so2.n6) obj;
            int i19 = n6Var.f410503c;
            boolean z17 = true;
            if (i17 < i19 || i18 > n6Var.f410504d) {
                if (!(i17 <= i19 && i19 < i18)) {
                    int i27 = i17 + 1;
                    int i28 = n6Var.f410504d;
                    if (!(i27 <= i28 && i28 < i18)) {
                        z17 = false;
                    }
                }
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.lang.String e(boolean z17) {
        java.lang.String string = getContext().getResources().getString(z17 ? com.tencent.mm.R.string.nzc : com.tencent.mm.R.string.nz6, java.lang.Integer.valueOf(getModifyLimit() / 2));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void f() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f131424o;
        if (recyclerView != null) {
            com.tencent.mm.plugin.finder.profile.FlowLayoutManager flowLayoutManager = new com.tencent.mm.plugin.finder.profile.FlowLayoutManager();
            flowLayoutManager.f123308s = getModifyLimit() + 2;
            recyclerView.setLayoutManager(flowLayoutManager);
        }
        if (recyclerView != null) {
            recyclerView.N(getItemDecoration());
        }
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.FinderPostTextModifyView$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                so2.p6 p6Var = so2.p6.f410541d;
                if (type == 0) {
                    return new com.tencent.mm.plugin.finder.convert.fx();
                }
                android.content.Context context = com.tencent.mm.plugin.finder.view.FinderPostTextModifyView.this.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                return new com.tencent.mm.plugin.finder.convert.ex(context, new com.tencent.mm.plugin.finder.view.sh(com.tencent.mm.plugin.finder.view.FinderPostTextModifyView.this));
            }
        }, this.f131430u, false));
    }

    public final boolean g(int i17, int i18, so2.p6 p6Var) {
        int ordinal = (getModLen() >= getModifyLimit() ? so2.l.f410460e : ((java.util.ArrayList) d(i17, i18, p6Var)).isEmpty() ^ true ? so2.l.f410461f : so2.l.f410459d).ordinal();
        if (ordinal == 1) {
            android.content.Context context = getContext();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = getContext().getResources().getString(com.tencent.mm.R.string.f491373nm0, java.lang.Integer.valueOf(getModifyLimit() / 2));
            e4Var.c();
            return true;
        }
        if (ordinal != 2) {
            return false;
        }
        java.util.List d17 = d(i17, i18, p6Var);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.nlx, java.lang.Integer.valueOf(((java.util.ArrayList) d17).size()));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        u1Var.g(string);
        u1Var.a(true);
        u1Var.j(getContext().getResources().getString(com.tencent.mm.R.string.f490347sg));
        u1Var.m(com.tencent.mm.R.string.f490507x1);
        u1Var.k(getContext().getResources().getColor(com.tencent.mm.R.color.Link_100));
        u1Var.l(new com.tencent.mm.plugin.finder.view.vh(d17, this));
        u1Var.q(false);
        return true;
    }

    public final android.view.View getContentView() {
        return this.contentView;
    }

    public final java.util.List<so2.n6> getDeleteList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f131429t) {
            if (((so2.n6) obj).f410506f == so2.a.f410242f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void h(java.lang.String newAtStr, java.lang.String selectAtStr, int i17, int i18, so2.p6 textType, r45.gb4 gb4Var) {
        kotlin.jvm.internal.o.g(newAtStr, "newAtStr");
        kotlin.jvm.internal.o.g(selectAtStr, "selectAtStr");
        kotlin.jvm.internal.o.g(textType, "textType");
        if (com.tencent.mm.ui.tools.v4.f(newAtStr) > getLeftLen()) {
            m();
            return;
        }
        j(selectAtStr, i17, i18);
        p(selectAtStr, newAtStr, this.f131428s, false);
        int length = newAtStr.length() - selectAtStr.length();
        o(length, i17);
        q(new so2.n6(selectAtStr, newAtStr, i17, length + i18, textType, so2.a.f410241e, so2.m.f410476e, 0, gb4Var, 0L, 640, null));
        n();
        k();
        com.tencent.mm.plugin.finder.view.pp ppVar = this.f131433x;
        if (ppVar != null) {
            com.tencent.mm.plugin.finder.view.pp.p5(ppVar, selectAtStr, newAtStr, i17, i18, textType, false, false, 64, null);
        }
    }

    public final void i(so2.n6 modModel) {
        kotlin.jvm.internal.o.g(modModel, "modModel");
        so2.p6 p6Var = modModel.f410505e;
        java.lang.String str = modModel.f410501a;
        java.lang.String str2 = modModel.f410502b;
        p(str, str2, p6Var, true);
        this.f131429t.remove(modModel);
        n();
        if (this.f131430u.isEmpty()) {
            l();
        }
        o(str.length() - str2.length(), modModel.f410503c);
        com.tencent.mm.plugin.finder.view.pp ppVar = this.f131433x;
        if (ppVar != null) {
            com.tencent.mm.plugin.finder.view.pp.p5(ppVar, modModel.f410502b, modModel.f410501a, modModel.f410503c, modModel.f410504d, modModel.f410505e, true, false, 64, null);
        }
    }

    public final void j(java.lang.String str, int i17, int i18) {
        jz5.l lVar;
        this.f131426q = i17;
        int leftLen = getLeftLen();
        if (com.tencent.mm.ui.tools.v4.f(str) <= leftLen) {
            this.f131425p = str;
            this.f131427r = i18;
            return;
        }
        int length = str.length();
        int i19 = 1;
        while (true) {
            if (i19 >= length) {
                lVar = new jz5.l(java.lang.Integer.valueOf(length), str);
                break;
            }
            java.lang.String substring = str.substring(0, i19);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            if ((com.tencent.mm.ui.tools.v4.f(substring) - leftLen) / 2 == 0) {
                lVar = new jz5.l(java.lang.Integer.valueOf(i19), substring);
                break;
            }
            i19++;
        }
        this.f131425p = (java.lang.String) lVar.f302834e;
        this.f131427r = this.f131426q + ((java.lang.Number) lVar.f302833d).intValue();
        int i27 = leftLen / 2;
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f491997nz5, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i27));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Context context = getContext();
        int i28 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = string;
        e4Var.c();
    }

    public final void k() {
        this.f131417e.setVisibility(8);
        android.view.View view = this.f131420h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView", "showResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView", "showResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f131424o;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.view.pp ppVar = this.f131433x;
        if (ppVar != null) {
            ((sr2.w0) ppVar).P6();
        }
    }

    public final void l() {
        this.f131417e.setVisibility(0);
        android.view.View view = this.f131420h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView", "showTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView", "showTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.view.pp ppVar = this.f131433x;
        if (ppVar != null) {
            ((sr2.w0) ppVar).P6();
        }
    }

    public final void m() {
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f491376nm3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Context context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = string;
        e4Var.c();
    }

    public final void n() {
        androidx.recyclerview.widget.f2 adapter;
        java.util.ArrayList arrayList = this.f131430u;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.LinkedList linkedList = this.f131429t;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((so2.n6) next).f410505e == so2.p6.f410542e) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(new so2.o6((so2.n6) it6.next()));
        }
        int modifyLimit = getModifyLimit() / 2;
        if (!arrayList3.isEmpty()) {
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f491995nz3);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int ceil = (int) java.lang.Math.ceil(this.f131431v / 2.0f);
            java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.f491996nz4, java.lang.Integer.valueOf(ceil), java.lang.Integer.valueOf(modifyLimit));
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            arrayList.add(new so2.o6(new so2.n6(string, string2, 0, 0, so2.p6.f410541d, null, null, ceil, null, 0L, com.tencent.mm.plugin.appbrand.jsapi.t3.CTRL_INDEX, null)));
            arrayList.addAll(arrayList3);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (((so2.n6) obj).f410505e == so2.p6.f410543f) {
                arrayList4.add(obj);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            arrayList5.add(new so2.o6((so2.n6) it7.next()));
        }
        if (!arrayList5.isEmpty()) {
            java.lang.String string3 = getContext().getResources().getString(com.tencent.mm.R.string.nzb);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = getContext().getResources().getString(com.tencent.mm.R.string.f491996nz4, java.lang.Integer.valueOf(this.f131432w / 2), java.lang.Integer.valueOf(modifyLimit));
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            arrayList.add(new so2.o6(new so2.n6(string3, string4, 0, 0, so2.p6.f410541d, null, null, (int) java.lang.Math.ceil(this.f131432w / 2.0f), null, 0L, com.tencent.mm.plugin.appbrand.jsapi.t3.CTRL_INDEX, null)));
            arrayList.addAll(arrayList5);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f131424o;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    public final void o(int i17, int i18) {
        int i19;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("FinderPostTextModifyView", "[updateIndex] offSet:" + i17 + " startIndex:" + i18);
            for (so2.n6 n6Var : this.f131429t) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateIndex] before old:");
                sb6.append(n6Var.f410501a);
                sb6.append(" new:");
                java.lang.String str = n6Var.f410502b;
                sb6.append(str);
                sb6.append(" start:");
                sb6.append(n6Var.f410503c);
                sb6.append(" end:");
                sb6.append(n6Var.f410504d);
                com.tencent.mars.xlog.Log.i("FinderPostTextModifyView", sb6.toString());
                if (n6Var.f410505e == this.f131428s && (i19 = n6Var.f410503c) >= i18) {
                    n6Var.f410503c = i19 + i17;
                    n6Var.f410504d += i17;
                    com.tencent.mars.xlog.Log.i("FinderPostTextModifyView", "[updateIndex] after old:" + n6Var.f410501a + " new:" + str + " start:" + n6Var.f410503c + " end:" + n6Var.f410504d);
                }
            }
        }
    }

    public final void p(java.lang.String str, java.lang.String str2, so2.p6 p6Var, boolean z17) {
        int f17 = com.tencent.mm.ui.tools.v4.f(str);
        int f18 = com.tencent.mm.ui.tools.v4.f(str2);
        int max = java.lang.Math.max(f17, f18);
        com.tencent.mars.xlog.Log.i("FinderPostTextModifyView", "[getTextLen] oldLen:" + f17 + " newLen:" + f18 + " realLen:" + max);
        if (z17) {
            max = -max;
        }
        if (p6Var == so2.p6.f410542e) {
            this.f131431v += max;
        } else {
            this.f131432w += max;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[EDGE_INSN: B:15:0x0032->B:16:0x0032 BREAK  A[LOOP:0: B:2:0x0006->B:22:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:2:0x0006->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(so2.n6 r7) {
        /*
            r6 = this;
            java.util.LinkedList r0 = r6.f131429t
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            r3 = r2
            so2.n6 r3 = (so2.n6) r3
            int r4 = r3.f410503c
            int r5 = r7.f410503c
            if (r4 < r5) goto L2d
            int r4 = r3.f410504d
            int r5 = r7.f410504d
            if (r4 > r5) goto L2d
            so2.a r4 = so2.a.f410242f
            so2.a r3 = r3.f410506f
            if (r3 != r4) goto L2d
            so2.a r3 = so2.a.f410241e
            so2.a r4 = r7.f410506f
            if (r4 != r3) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            if (r3 == 0) goto L6
            goto L32
        L31:
            r2 = 0
        L32:
            so2.n6 r2 = (so2.n6) r2
            if (r2 == 0) goto L39
            r0.remove(r2)
        L39:
            r0.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.FinderPostTextModifyView.q(so2.n6):void");
    }

    public final void setModifyCallback(com.tencent.mm.plugin.finder.view.pp callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f131433x = callback;
    }

    public FinderPostTextModifyView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f131425p = "";
        this.f131428s = so2.p6.f410542e;
        this.f131429t = new java.util.LinkedList();
        this.f131430u = new java.util.ArrayList();
        this.modifyLimit = jz5.h.a(jz5.i.f302831f, new com.tencent.mm.plugin.finder.view.uh(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.edg, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.tsu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.contentView = findViewById;
        int h17 = com.tencent.mm.ui.bl.h(getContext());
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.tsw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f131417e = textView;
        com.tencent.mm.ui.kk.d(textView, com.tencent.mm.ui.kk.a(textView) + h17);
        textView.setText(e(false));
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.tsx);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f131420h = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.tsy);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f131418f = findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.tsz);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) findViewById5;
        this.f131419g = weButton;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.Object systemService = context2.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        weButton.setTextSize(1, (14.0f * displayMetrics.density) / context2.getResources().getDisplayMetrics().density);
        dq4.c cVar = dq4.c.f242369a;
        cVar.f(weButton);
        weButton.setEnabled(true);
        cVar.f(findViewById4);
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.f484911tt1);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById6;
        this.f131421i = mMEditText;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.f484912tt2);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f131422m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.f484910tt0);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f131423n = (android.widget.TextView) findViewById8;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.tsv);
        this.f131424o = recyclerView;
        if (recyclerView != null) {
            com.tencent.mm.ui.kk.d(recyclerView, com.tencent.mm.ui.kk.a(recyclerView) + h17);
        }
        findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.view.ph(this));
        weButton.setOnClickListener(new com.tencent.mm.plugin.finder.view.qh(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.rh(this));
        f();
    }

    public FinderPostTextModifyView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f131425p = "";
        this.f131428s = so2.p6.f410542e;
        this.f131429t = new java.util.LinkedList();
        this.f131430u = new java.util.ArrayList();
        this.modifyLimit = jz5.h.a(jz5.i.f302831f, new com.tencent.mm.plugin.finder.view.uh(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.edg, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.tsu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.contentView = findViewById;
        int h17 = com.tencent.mm.ui.bl.h(getContext());
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.tsw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f131417e = textView;
        com.tencent.mm.ui.kk.d(textView, com.tencent.mm.ui.kk.a(textView) + h17);
        textView.setText(e(false));
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.tsx);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f131420h = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.tsy);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f131418f = findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.tsz);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) findViewById5;
        this.f131419g = weButton;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.Object systemService = context2.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        weButton.setTextSize(1, (14.0f * displayMetrics.density) / context2.getResources().getDisplayMetrics().density);
        dq4.c cVar = dq4.c.f242369a;
        cVar.f(weButton);
        weButton.setEnabled(true);
        cVar.f(findViewById4);
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.f484911tt1);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById6;
        this.f131421i = mMEditText;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.f484912tt2);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f131422m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.f484910tt0);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f131423n = (android.widget.TextView) findViewById8;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.tsv);
        this.f131424o = recyclerView;
        if (recyclerView != null) {
            com.tencent.mm.ui.kk.d(recyclerView, com.tencent.mm.ui.kk.a(recyclerView) + h17);
        }
        findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.view.ph(this));
        weButton.setOnClickListener(new com.tencent.mm.plugin.finder.view.qh(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.rh(this));
        f();
    }
}
