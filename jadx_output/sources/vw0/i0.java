package vw0;

/* loaded from: classes5.dex */
public final class i0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f440784d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f440785e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f440786f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f440787g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f440788h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f440789i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f440790m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f440791n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f440792o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f440793p;

    /* renamed from: q, reason: collision with root package name */
    public final int f440794q;

    /* renamed from: r, reason: collision with root package name */
    public final int f440795r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f440796s;

    /* renamed from: t, reason: collision with root package name */
    public final pw0.m f440797t;

    /* renamed from: u, reason: collision with root package name */
    public final pw0.q f440798u;

    /* renamed from: v, reason: collision with root package name */
    public final pw0.s f440799v;

    /* renamed from: w, reason: collision with root package name */
    public final pw0.o f440800w;

    /* renamed from: x, reason: collision with root package name */
    public vw0.d0 f440801x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context) {
        super(context, null, -1);
        kotlin.jvm.internal.o.g(context, "context");
        this.f440794q = j65.q.a(context).getColor(com.tencent.mm.R.color.acs, null);
        this.f440795r = j65.q.a(context).getColor(com.tencent.mm.R.color.ac_, null);
        this.f440796s = j65.q.a(context).getDrawable(com.tencent.mm.R.drawable.cvp, null);
        pw0.m mVar = new pw0.m(new vw0.e0(this));
        this.f440797t = mVar;
        pw0.q qVar = new pw0.q(new vw0.g0(this));
        this.f440798u = qVar;
        pw0.s sVar = new pw0.s(new vw0.h0(this));
        this.f440799v = sVar;
        pw0.o oVar = new pw0.o(new vw0.f0(this));
        this.f440800w = oVar;
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dgc, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.q_l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f440784d = recyclerView;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q_m);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f440785e = recyclerView2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.q_n);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView3 = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        this.f440786f = recyclerView3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.s3e);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView4 = (androidx.recyclerview.widget.RecyclerView) findViewById4;
        this.f440787g = recyclerView4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.qaw);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f440788h = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.qax);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f440789i = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.s9c);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f440790m = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.s9w);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById8;
        this.f440791n = textView;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.s9x);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById9;
        this.f440792o = textView2;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.s9v);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById10;
        this.f440793p = textView3;
        textView.setOnClickListener(new vw0.x(this));
        textView2.setOnClickListener(new vw0.y(this));
        textView3.setOnClickListener(new vw0.z(this));
        textView.performClick();
        recyclerView.N(new lv0.c(j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479674cb), j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0, 0, null, 56, null));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(mVar);
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
        if (o3Var != null) {
            o3Var.f12182g = false;
        }
        recyclerView2.N(new lv0.c(j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs), j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs), 0, 0, null, 56, null));
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        recyclerView2.setAdapter(qVar);
        androidx.recyclerview.widget.n2 itemAnimator2 = recyclerView2.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var2 = itemAnimator2 instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator2 : null;
        if (o3Var2 != null) {
            o3Var2.f12182g = false;
        }
        recyclerView3.N(new lv0.c(j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs), j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs), 0, 0, null, 56, null));
        recyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        recyclerView3.setAdapter(sVar);
        androidx.recyclerview.widget.n2 itemAnimator3 = recyclerView3.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var3 = itemAnimator3 instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator3 : null;
        if (o3Var3 != null) {
            o3Var3.f12182g = false;
        }
        recyclerView4.N(new lv0.c(j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs), j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs), 0, 0, null, 56, null));
        recyclerView4.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        recyclerView4.setAdapter(oVar);
        androidx.recyclerview.widget.n2 itemAnimator4 = recyclerView4.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var4 = itemAnimator4 instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator4 : null;
        if (o3Var4 != null) {
            o3Var4.f12182g = false;
        }
        findViewById5.setOnClickListener(new vw0.a0(this));
        findViewById6.setOnClickListener(new vw0.b0(this));
        findViewById7.setOnClickListener(new vw0.c0(this));
    }

    public static final void a(vw0.i0 i0Var, android.widget.TextView textView) {
        android.widget.TextView textView2 = i0Var.f440791n;
        int i17 = i0Var.f440795r;
        textView2.setTextColor(i17);
        textView2.setBackground(null);
        android.widget.TextView textView3 = i0Var.f440792o;
        textView3.setTextColor(i17);
        textView3.setBackground(null);
        android.widget.TextView textView4 = i0Var.f440793p;
        textView4.setTextColor(i17);
        textView4.setBackground(null);
        textView.setTextColor(i0Var.f440794q);
        textView.setBackground(i0Var.f440796s);
    }

    public final void b(sw0.g selectedPack) {
        pw0.o oVar = this.f440800w;
        oVar.getClass();
        kotlin.jvm.internal.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = oVar.f275970d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sw0.d dVar = (sw0.d) obj;
            if (dVar.f413424c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sw0.d.a(dVar, null, null, false, null, 11, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sw0.d dVar2 = (sw0.d) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (dVar2 != null) {
                arrayList.set(intValue, dVar2);
                oVar.notifyItemChanged(intValue);
            }
        }
        int i19 = selectedPack.f413435b;
        sw0.d dVar3 = (sw0.d) kz5.n0.a0(arrayList, i19);
        if (dVar3 != null) {
            oVar.x(i19, sw0.d.a(dVar3, null, null, true, null, 11, null));
        }
        if (dVar3 != null) {
            dy0.o.b(this.f440787g, selectedPack.f413435b, false, 2, null);
        }
    }

    public final void c(sw0.g selectedPack) {
        pw0.q qVar = this.f440798u;
        qVar.getClass();
        kotlin.jvm.internal.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = qVar.f275970d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sw0.d dVar = (sw0.d) obj;
            if (dVar.f413424c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sw0.d.a(dVar, null, null, false, null, 11, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sw0.d dVar2 = (sw0.d) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (dVar2 != null) {
                arrayList.set(intValue, dVar2);
                qVar.notifyItemChanged(intValue);
            }
        }
        int i19 = selectedPack.f413435b;
        sw0.d dVar3 = (sw0.d) kz5.n0.a0(arrayList, i19);
        if (dVar3 != null) {
            qVar.x(i19, sw0.d.a(dVar3, null, null, true, null, 11, null));
        }
        if (dVar3 != null) {
            dy0.o.b(this.f440785e, selectedPack.f413435b, false, 2, null);
        }
    }

    public final void d(sw0.g selectedPack) {
        pw0.s sVar = this.f440799v;
        sVar.getClass();
        kotlin.jvm.internal.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = sVar.f275970d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sw0.d dVar = (sw0.d) obj;
            if (dVar.f413424c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sw0.d.a(dVar, null, null, false, null, 11, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sw0.d dVar2 = (sw0.d) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (dVar2 != null) {
                arrayList.set(intValue, dVar2);
                sVar.notifyItemChanged(intValue);
            }
        }
        int i19 = selectedPack.f413435b;
        sw0.d dVar3 = (sw0.d) kz5.n0.a0(arrayList, i19);
        if (dVar3 != null) {
            sVar.x(i19, sw0.d.a(dVar3, null, null, true, null, 11, null));
        }
        if (dVar3 != null) {
            dy0.o.b(this.f440786f, selectedPack.f413435b, false, 2, null);
        }
    }

    public final void e(sw0.g selectedPack) {
        pw0.m mVar = this.f440797t;
        mVar.getClass();
        kotlin.jvm.internal.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = mVar.f275970d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sw0.d dVar = (sw0.d) obj;
            if (dVar.f413424c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sw0.d.a(dVar, null, null, false, null, 11, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sw0.d dVar2 = (sw0.d) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (dVar2 != null) {
                arrayList.set(intValue, dVar2);
                mVar.notifyItemChanged(intValue);
            }
        }
        int i19 = selectedPack.f413435b;
        sw0.d dVar3 = (sw0.d) kz5.n0.a0(arrayList, i19);
        if (dVar3 != null) {
            mVar.x(i19, sw0.d.a(dVar3, null, null, true, null, 11, null));
        }
        if (dVar3 != null) {
            dy0.o.b(this.f440784d, selectedPack.f413435b, false, 2, null);
        }
    }

    public final vw0.d0 getSelectedTextStyleCallback() {
        return this.f440801x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if ((r11.f440786f.getVisibility() == 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAnimStyleState$plugin_mj_template_release(sw0.e r12) {
        /*
            r11 = this;
            java.lang.String r0 = "textMaterialUiState"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setAnimDataList: textMaterialUiState "
            r0.<init>(r1)
            sw0.m r1 = r12.f413428c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextStyleView"
            com.tencent.mars.xlog.Log.i(r2, r0)
            boolean r0 = r1 instanceof sw0.i
            pw0.o r3 = r11.f440800w
            sw0.g r4 = r12.f413427b
            if (r0 == 0) goto La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setAnimDataList: "
            r0.<init>(r1)
            java.util.List r12 = r12.f413426a
            int r1 = r12.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            r3.y(r12)
            r11.b(r4)
            java.util.ArrayList r12 = r3.f275970d
            boolean r12 = r12.isEmpty()
            r0 = 0
            if (r12 == 0) goto L57
            androidx.recyclerview.widget.RecyclerView r12 = r11.f440786f
            int r12 = r12.getVisibility()
            r1 = 1
            if (r12 != 0) goto L53
            r12 = r1
            goto L54
        L53:
            r12 = r0
        L54:
            if (r12 == 0) goto L57
            goto L58
        L57:
            r1 = r0
        L58:
            android.view.View r12 = r11.f440789i
            if (r1 == 0) goto L5e
            r1 = r0
            goto L60
        L5e:
            r1 = 8
        L60:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r3 = r10.toArray()
            java.lang.String r4 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r5 = "showAnimLoadFailedHintIfDataListEmpty"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r10.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r4 = "showAnimLoadFailedHintIfDataListEmpty"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            goto Lc8
        La2:
            boolean r12 = r1 instanceof sw0.l
            if (r12 == 0) goto Laa
            r11.b(r4)
            goto Lc8
        Laa:
            boolean r12 = r1 instanceof sw0.j
            if (r12 == 0) goto Lb8
            sw0.j r1 = (sw0.j) r1
            int r12 = r1.f413438a
            zu0.i r0 = r1.f413439b
            r3.z(r12, r0)
            goto Lc8
        Lb8:
            boolean r12 = r1 instanceof sw0.k
            if (r12 == 0) goto Lc8
            r11.b(r4)
            sw0.k r1 = (sw0.k) r1
            int r12 = r1.f413440a
            zu0.i r0 = r1.f413441b
            r3.z(r12, r0)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vw0.i0.setAnimStyleState$plugin_mj_template_release(sw0.e):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if ((r11.f440785e.getVisibility() == 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setColorStyleState$plugin_mj_template_release(sw0.e r12) {
        /*
            r11 = this;
            java.lang.String r0 = "textMaterialUiState"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setColorDataList: textMaterialUiState "
            r0.<init>(r1)
            sw0.m r1 = r12.f413428c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextStyleView"
            com.tencent.mars.xlog.Log.i(r2, r0)
            boolean r0 = r1 instanceof sw0.i
            pw0.q r3 = r11.f440798u
            sw0.g r4 = r12.f413427b
            if (r0 == 0) goto La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setColorDataList: "
            r0.<init>(r1)
            java.util.List r12 = r12.f413426a
            int r1 = r12.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            r3.y(r12)
            r11.c(r4)
            java.util.ArrayList r12 = r3.f275970d
            boolean r12 = r12.isEmpty()
            r0 = 0
            if (r12 == 0) goto L57
            androidx.recyclerview.widget.RecyclerView r12 = r11.f440785e
            int r12 = r12.getVisibility()
            r1 = 1
            if (r12 != 0) goto L53
            r12 = r1
            goto L54
        L53:
            r12 = r0
        L54:
            if (r12 == 0) goto L57
            goto L58
        L57:
            r1 = r0
        L58:
            android.view.View r12 = r11.f440788h
            if (r1 == 0) goto L5e
            r1 = r0
            goto L60
        L5e:
            r1 = 8
        L60:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r3 = r10.toArray()
            java.lang.String r4 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r5 = "showColorLoadFailedHintIfDataListEmpty"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r10.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r4 = "showColorLoadFailedHintIfDataListEmpty"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            goto Lc8
        La2:
            boolean r12 = r1 instanceof sw0.l
            if (r12 == 0) goto Laa
            r11.c(r4)
            goto Lc8
        Laa:
            boolean r12 = r1 instanceof sw0.j
            if (r12 == 0) goto Lb8
            sw0.j r1 = (sw0.j) r1
            int r12 = r1.f413438a
            zu0.i r0 = r1.f413439b
            r3.z(r12, r0)
            goto Lc8
        Lb8:
            boolean r12 = r1 instanceof sw0.k
            if (r12 == 0) goto Lc8
            r11.c(r4)
            sw0.k r1 = (sw0.k) r1
            int r12 = r1.f413440a
            zu0.i r0 = r1.f413441b
            r3.z(r12, r0)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vw0.i0.setColorStyleState$plugin_mj_template_release(sw0.e):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if ((r11.f440786f.getVisibility() == 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFontStyleState(sw0.e r12) {
        /*
            r11 = this;
            java.lang.String r0 = "textMaterialUiState"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setFontDataList: textMaterialUiState "
            r0.<init>(r1)
            sw0.m r1 = r12.f413428c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextStyleView"
            com.tencent.mars.xlog.Log.i(r2, r0)
            boolean r0 = r1 instanceof sw0.i
            pw0.s r2 = r11.f440799v
            sw0.g r3 = r12.f413427b
            if (r0 == 0) goto L8d
            java.util.List r12 = r12.f413426a
            r2.y(r12)
            r11.d(r3)
            java.util.ArrayList r12 = r2.f275970d
            boolean r12 = r12.isEmpty()
            r0 = 0
            if (r12 == 0) goto L42
            androidx.recyclerview.widget.RecyclerView r12 = r11.f440786f
            int r12 = r12.getVisibility()
            r1 = 1
            if (r12 != 0) goto L3e
            r12 = r1
            goto L3f
        L3e:
            r12 = r0
        L3f:
            if (r12 == 0) goto L42
            goto L43
        L42:
            r1 = r0
        L43:
            android.view.View r12 = r11.f440789i
            if (r1 == 0) goto L49
            r1 = r0
            goto L4b
        L49:
            r1 = 8
        L4b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r3 = r10.toArray()
            java.lang.String r4 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r5 = "showFontLoadFailedHintIfDataListEmpty"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r10.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r4 = "showFontLoadFailedHintIfDataListEmpty"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            goto Lb3
        L8d:
            boolean r12 = r1 instanceof sw0.l
            if (r12 == 0) goto L95
            r11.d(r3)
            goto Lb3
        L95:
            boolean r12 = r1 instanceof sw0.j
            if (r12 == 0) goto La3
            sw0.j r1 = (sw0.j) r1
            int r12 = r1.f413438a
            zu0.i r0 = r1.f413439b
            r2.z(r12, r0)
            goto Lb3
        La3:
            boolean r12 = r1 instanceof sw0.k
            if (r12 == 0) goto Lb3
            r11.d(r3)
            sw0.k r1 = (sw0.k) r1
            int r12 = r1.f413440a
            zu0.i r0 = r1.f413441b
            r2.z(r12, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vw0.i0.setFontStyleState(sw0.e):void");
    }

    public final void setSelectedTextStyleCallback(vw0.d0 d0Var) {
        this.f440801x = d0Var;
    }

    public final void setTextStyleState(sw0.e textMaterialUiState) {
        kotlin.jvm.internal.o.g(textMaterialUiState, "textMaterialUiState");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTextStyleData: textStyleUiState ");
        sw0.m mVar = textMaterialUiState.f413428c;
        sb6.append(mVar);
        com.tencent.mars.xlog.Log.i("TextStyleView", sb6.toString());
        boolean z17 = mVar instanceof sw0.i;
        pw0.m mVar2 = this.f440797t;
        sw0.g gVar = textMaterialUiState.f413427b;
        if (z17) {
            mVar2.y(textMaterialUiState.f413426a);
            e(gVar);
            return;
        }
        if (mVar instanceof sw0.l) {
            e(gVar);
            return;
        }
        if (mVar instanceof sw0.j) {
            sw0.j jVar = (sw0.j) mVar;
            mVar2.z(jVar.f413438a, jVar.f413439b);
        } else if (mVar instanceof sw0.k) {
            e(gVar);
            sw0.k kVar = (sw0.k) mVar;
            mVar2.z(kVar.f413440a, kVar.f413441b);
        }
    }
}
