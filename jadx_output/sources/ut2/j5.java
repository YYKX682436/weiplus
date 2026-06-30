package ut2;

/* loaded from: classes3.dex */
public final class j5 implements android.view.View.OnClickListener {
    public final android.view.ViewGroup A;
    public final xt2.r3 B;
    public xt2.n C;
    public xt2.n D;
    public kotlinx.coroutines.r2 E;

    /* renamed from: d, reason: collision with root package name */
    public final st2.h1 f430936d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f430937e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f430938f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f430939g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f430940h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f430941i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f430942m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f430943n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f430944o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f430945p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f430946q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f430947r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f430948s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f430949t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f430950u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f430951v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f430952w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f430953x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f430954y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.ViewGroup f430955z;

    public j5(st2.h1 shoppingList, android.view.ViewGroup root, gk2.e buContext, kotlinx.coroutines.y0 y0Var) {
        kotlin.jvm.internal.o.g(shoppingList, "shoppingList");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f430936d = shoppingList;
        this.f430937e = root;
        this.f430938f = buContext;
        this.f430939g = y0Var;
        this.f430940h = "ShoppingPanelHeaderHolder";
        this.f430941i = root.findViewById(com.tencent.mm.R.id.qye);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.flz);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        d92.f fVar = d92.f.f227470a;
        java.lang.Float valueOf = java.lang.Float.valueOf(15.0f);
        fVar.h(textView, valueOf);
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        this.f430942m = jz5.h.b(new ut2.r4(this));
        jz5.h.b(new ut2.s4(this));
        this.f430943n = jz5.h.b(new ut2.g5(this));
        android.view.View findViewById2 = s().findViewById(com.tencent.mm.R.id.mui);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        fVar.h(textView2, valueOf);
        kotlin.jvm.internal.o.f(findViewById2, "apply(...)");
        this.f430944o = (android.widget.TextView) findViewById2;
        this.f430945p = jz5.h.b(new ut2.f5(this));
        this.f430946q = jz5.h.b(new ut2.e5(this));
        android.view.View findViewById3 = p().findViewById(com.tencent.mm.R.id.mug);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        zl2.r4 r4Var = zl2.r4.f473950a;
        kotlin.jvm.internal.o.d(textView3);
        try {
            textView3.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), "fonts/SF-Pro-Text-MediumItalic.ttf"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveUtil", "setShopScoreTypeFace() Exception:" + e17.getMessage());
        }
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        fVar.h(textView3, java.lang.Float.valueOf(13.0f));
        kotlin.jvm.internal.o.f(findViewById3, "apply(...)");
        this.f430947r = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = p().findViewById(com.tencent.mm.R.id.mue);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById4;
        com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        fVar.h(textView4, java.lang.Float.valueOf(12.0f));
        kotlin.jvm.internal.o.f(findViewById4, "apply(...)");
        this.f430948s = (android.widget.TextView) findViewById4;
        this.f430949t = jz5.h.b(new ut2.b5(this));
        jz5.h.b(new ut2.c5(this));
        jz5.h.b(new ut2.d5(this));
        this.f430950u = jz5.h.b(new ut2.j4(this));
        this.f430951v = jz5.h.b(new ut2.x4(this));
        this.f430952w = jz5.h.b(new ut2.v4(this));
        this.f430953x = jz5.h.b(new ut2.w4(this));
        android.view.View findViewById5 = p().findViewById(com.tencent.mm.R.id.mua);
        android.widget.TextView textView5 = (android.widget.TextView) findViewById5;
        kotlin.jvm.internal.o.d(textView5);
        fVar.h(textView5, java.lang.Float.valueOf(12.0f));
        kotlin.jvm.internal.o.f(findViewById5, "apply(...)");
        this.f430954y = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = t().findViewById(com.tencent.mm.R.id.s5y);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f430955z = (android.view.ViewGroup) findViewById6;
        android.view.View findViewById7 = t().findViewById(com.tencent.mm.R.id.s5v);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.A = (android.view.ViewGroup) findViewById7;
        android.view.View findViewById8 = this.f430937e.findViewById(com.tencent.mm.R.id.f483593bd4);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.B = new xt2.r3((android.view.ViewGroup) findViewById8, h());
        ym5.a1.h(s(), new ut2.a5(this));
        com.tencent.mm.accessibility.base.MapExpandKt.visitChild(t(), ut2.i4.f430924d);
    }

    public static final void a(ut2.j5 j5Var, ml2.f4 f4Var) {
        r45.e56 e56Var = ((mm2.f6) j5Var.f430938f.a(mm2.f6.class)).K;
        org.json.JSONObject jSONObject = null;
        java.lang.Integer valueOf = e56Var != null ? java.lang.Integer.valueOf(e56Var.getInteger(18)) : null;
        if (valueOf != null) {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("window_type", valueOf.intValue());
        }
        com.tencent.mars.xlog.Log.i(j5Var.f430940h, "report shopwindow action = " + f4Var.name() + ", type = " + valueOf);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, f4Var, null, null, null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
    }

    public static final void d(ut2.j5 j5Var, boolean z17) {
        r45.e56 e56Var = ((mm2.f6) j5Var.f430938f.a(mm2.f6.class)).K;
        int integer = e56Var != null ? e56Var.getInteger(11) : 0;
        gk2.e eVar = j5Var.f430938f;
        r45.e56 e56Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).K;
        java.lang.String string = e56Var2 != null ? e56Var2.getString(12) : null;
        r45.e56 e56Var3 = ((mm2.f6) eVar.a(mm2.f6.class)).K;
        java.lang.String string2 = e56Var3 != null ? e56Var3.getString(13) : null;
        jz5.g gVar = j5Var.f430951v;
        jz5.g gVar2 = j5Var.f430953x;
        jz5.g gVar3 = j5Var.f430952w;
        if (!z17 || integer == 0) {
            java.lang.Object value = ((jz5.n) gVar3).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.widget.ImageView) value).setVisibility(8);
            java.lang.Object value2 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.widget.TextView) value2).setVisibility(8);
            java.lang.Object value3 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            android.view.View view = (android.view.View) value3;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object value4 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        android.view.View view2 = (android.view.View) value4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value5 = ((jz5.n) gVar3).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        ((android.widget.ImageView) value5).setVisibility(0);
        java.lang.Object value6 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        ((android.widget.TextView) value6).setVisibility(0);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e);
        java.lang.Object value7 = ((jz5.n) gVar3).getValue();
        kotlin.jvm.internal.o.f(value7, "getValue(...)");
        e17.c(q3Var, (android.widget.ImageView) value7, g1Var.h(mn2.f1.f329965s));
        java.lang.Object value8 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value8, "getValue(...)");
        ((android.widget.TextView) value8).setText(string2);
    }

    public final boolean b() {
        r45.h92 h92Var;
        gk2.e eVar = this.f430938f;
        r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
        if ((dv1Var != null ? (r45.h92) dv1Var.getCustom(11) : null) == null) {
            return false;
        }
        r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
        return !(dv1Var2 != null && (h92Var = (r45.h92) dv1Var2.getCustom(11)) != null && h92Var.getInteger(0) == 0);
    }

    public final void c() {
        if (!(((mm2.f6) this.f430938f.a(mm2.f6.class)).Z != null)) {
            android.view.View h17 = h();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkCartShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkCartShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        d92.f fVar = d92.f.f227470a;
        android.view.View findViewById = h().findViewById(com.tencent.mm.R.id.fld);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        fVar.k(findViewById, 20.0f, 20.0f);
        android.view.View findViewById2 = h().findViewById(com.tencent.mm.R.id.rn_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        fVar.k(findViewById2, 20.0f, 20.0f);
        android.view.View findViewById3 = h().findViewById(com.tencent.mm.R.id.fle);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        fVar.h((android.widget.TextView) findViewById3, java.lang.Float.valueOf(12.0f));
        if (h().getVisibility() != 0) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327264s;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", mc1.c.CTRL_INDEX);
            jSONObject.put("btn_word", "购物车");
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            android.view.View h18 = h();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(h18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkCartShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(h18, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkCartShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:154|(1:156)(1:218)|157|(1:159)(1:217)|160|(3:212|213|(1:215)(18:216|163|(3:165|166|167)(2:208|(1:210))|168|169|(3:198|199|(1:201)(11:202|(1:173)|178|(1:180)(1:197)|181|(1:183)|184|(1:186)(1:196)|(1:195)(1:190)|(1:192)(1:194)|193))|171|(0)|178|(0)(0)|181|(0)|184|(0)(0)|(1:188)|195|(0)(0)|193))|162|163|(0)(0)|168|169|(0)|171|(0)|178|(0)(0)|181|(0)|184|(0)(0)|(0)|195|(0)(0)|193) */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0728, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0866 A[Catch: Exception -> 0x0861, TryCatch #3 {Exception -> 0x0861, blocks: (B:145:0x0858, B:124:0x0866, B:143:0x086b), top: B:144:0x0858 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x086b A[Catch: Exception -> 0x0861, TRY_LEAVE, TryCatch #3 {Exception -> 0x0861, blocks: (B:145:0x0858, B:124:0x0866, B:143:0x086b), top: B:144:0x0858 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06f4 A[Catch: Exception -> 0x06ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x06ed, blocks: (B:213:0x06e4, B:165:0x06f4), top: B:212:0x06e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x076d A[Catch: Exception -> 0x0768, TRY_LEAVE, TryCatch #1 {Exception -> 0x0768, blocks: (B:199:0x075f, B:173:0x076d), top: B:198:0x075f }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x075f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0711 A[Catch: Exception -> 0x0728, TryCatch #2 {Exception -> 0x0728, blocks: (B:167:0x0700, B:208:0x0711, B:210:0x0719), top: B:163:0x06f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c6  */
    /* JADX WARN: Type inference failed for: r0v166 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 2515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut2.j5.e():void");
    }

    public final void f(boolean z17) {
        java.lang.Object obj;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str;
        java.lang.String str2;
        r45.dv1 dv1Var = ((mm2.f6) this.f430938f.a(mm2.f6.class)).f329038n;
        r45.h92 h92Var = dv1Var != null ? (r45.h92) dv1Var.getCustom(11) : null;
        java.util.Iterator it = this.f430936d.P.f421885p.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            so2.j5 j5Var = (so2.j5) obj;
            if ((j5Var instanceof cm2.m0) && ((cm2.m0) j5Var).G == 1) {
                break;
            }
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = this.f430937e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        cm2.m0 m0Var = (cm2.m0) ((so2.j5) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#enterShopCustomerService ");
        sb6.append(m0Var != null ? java.lang.Long.valueOf(m0Var.f43369w) : null);
        sb6.append(", ");
        sb6.append(h92Var != null ? java.lang.Integer.valueOf(h92Var.getInteger(0)) : "null");
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        if (h92Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "#enterShopCustomerService csInfo is null. jump to msg");
            zl2.r4.N(context);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "#enterShopCustomerService " + pm0.b0.g(h92Var));
        int integer = h92Var.getInteger(0);
        if (integer == 1) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).tk(2);
            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(h92Var.getString(1), new zl2.q1(h92Var, m0Var, context));
            return;
        }
        java.lang.String str3 = "";
        if (integer == 2) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).tk(4);
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            r45.c33 c33Var = (r45.c33) h92Var.getCustom(2);
            java.lang.String str4 = (c33Var == null || (string2 = c33Var.getString(0)) == null) ? "" : string2;
            r45.c33 c33Var2 = (r45.c33) h92Var.getCustom(2);
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).ll(context, str4, (c33Var2 == null || (string = c33Var2.getString(1)) == null) ? "" : string, 1177, "");
            return;
        }
        if (integer == 3) {
            java.lang.String string3 = h92Var.getString(3);
            if (string3 == null || string3.length() == 0) {
                com.tencent.mars.xlog.Log.i("FinderLiveUtil", "invalid h5 url");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", h92Var.getString(3));
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (integer != 4 && integer != 6) {
            zl2.r4.N(context);
            return;
        }
        int integer2 = h92Var.getInteger(0);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).tk(integer2 != 4 ? 5 : 3);
        r45.u23 u23Var = (r45.u23) h92Var.getCustom(4);
        if (u23Var == null || (str = u23Var.getString(0)) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "#enterShopCustomerService type = " + integer2 + " kfUrl=" + str);
        j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
        if (zVar != null) {
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
            openIMKefuStartConversationRequest.f72272d = context;
            openIMKefuStartConversationRequest.f72273e = java.lang.System.currentTimeMillis();
            openIMKefuStartConversationRequest.f72274f = 11;
            r45.s4 s4Var = new r45.s4();
            s4Var.f385486d = str;
            r45.l05 l05Var = new r45.l05();
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            if (c1Var != null && (str2 = c1Var.f328852o) != null) {
                str3 = str2;
            }
            l05Var.f379060e = str3;
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "entityid " + l05Var.f379060e);
            s4Var.f385489g = l05Var;
            openIMKefuStartConversationRequest.f72277i = s4Var;
            openIMKefuStartConversationRequest.f72276h = j41.f0.a(openIMKefuStartConversationRequest.f72274f);
            ((l41.g2) zVar).Bi(openIMKefuStartConversationRequest);
        }
    }

    public final android.widget.ImageView g() {
        java.lang.Object value = this.f430950u.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    public final android.view.View h() {
        android.view.View findViewById = t().findViewById(com.tencent.mm.R.id.flc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    public final android.view.View i() {
        android.view.View findViewById = t().findViewById(com.tencent.mm.R.id.flm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    public final android.view.View j() {
        android.view.View findViewById = t().findViewById(com.tencent.mm.R.id.flr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    public final android.widget.TextView k() {
        android.view.View findViewById = t().findViewById(com.tencent.mm.R.id.s3q);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        d92.f fVar = d92.f.f227470a;
        kotlin.jvm.internal.o.d(textView);
        fVar.h(textView, java.lang.Float.valueOf(12.0f));
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        return (android.widget.TextView) findViewById;
    }

    public final android.view.View l() {
        android.view.View findViewById = t().findViewById(com.tencent.mm.R.id.rnb);
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.rne);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        java.lang.Float dpSize = java.lang.Float.valueOf(12.0f);
        kotlin.jvm.internal.o.g(dpSize, "dpSize");
        ((android.widget.TextView) findViewById2).setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        return findViewById;
    }

    public final android.view.View m() {
        android.view.View findViewById = t().findViewById(com.tencent.mm.R.id.flw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView n() {
        android.view.View findViewById = m().findViewById(com.tencent.mm.R.id.flx);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        d92.f fVar = d92.f.f227470a;
        kotlin.jvm.internal.o.d(weImageView);
        fVar.k(weImageView, 20.0f, 20.0f);
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
    }

    public final android.widget.TextView o() {
        android.view.View findViewById = m().findViewById(com.tencent.mm.R.id.fly);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        kotlin.jvm.internal.o.d(textView);
        java.lang.Float dpSize = java.lang.Float.valueOf(12.0f);
        kotlin.jvm.internal.o.g(dpSize, "dpSize");
        textView.setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        return (android.widget.TextView) findViewById;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        r45.c33 c33Var;
        java.lang.String string;
        r45.c33 c33Var2;
        r45.c33 c33Var3;
        r45.c33 c33Var4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        st2.h1 h1Var = this.f430936d;
        if (valueOf == null || valueOf.intValue() != com.tencent.mm.R.id.flf) {
            str = "";
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.flr) {
                if (!h1Var.w()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gotoShoppingOrder appId:");
                    gk2.e eVar = h1Var.f412335f;
                    r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
                    sb6.append((dv1Var == null || (c33Var4 = (r45.c33) dv1Var.getCustom(7)) == null) ? null : c33Var4.getString(0));
                    sb6.append(",path:");
                    r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
                    sb6.append((dv1Var2 == null || (c33Var3 = (r45.c33) dv1Var2.getCustom(7)) == null) ? null : c33Var3.getString(1));
                    com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", sb6.toString());
                    st2.o oVar = new st2.o(h1Var);
                    java.lang.String obj = com.tencent.mm.sdk.platformtools.t8.s0().toString();
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    if (r4Var.w1()) {
                        p52.c cVar = p52.h.f352016a;
                        kotlin.jvm.internal.o.g(obj, "<set-?>");
                        p52.h.f352029n = obj;
                    }
                    l81.b1 b1Var = new l81.b1();
                    r45.dv1 dv1Var3 = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
                    if (dv1Var3 == null || (c33Var2 = (r45.c33) dv1Var3.getCustom(7)) == null || (str2 = c33Var2.getString(0)) == null) {
                        str2 = "";
                    }
                    b1Var.f317014b = str2;
                    r45.dv1 dv1Var4 = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
                    if (dv1Var4 != null && (c33Var = (r45.c33) dv1Var4.getCustom(7)) != null && (string = c33Var.getString(1)) != null) {
                        str = string;
                    }
                    b1Var.f317022f = str;
                    b1Var.f317032k = 1177;
                    b1Var.f317034l = "live_list_order:" + ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0) + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).f328852o + "::" + ((mm2.c1) eVar.a(mm2.c1.class)).f328861p2 + ':' + obj + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).P3 + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).f328791d3;
                    if (!r4Var.w1()) {
                        p52.c cVar2 = p52.h.f352016a;
                        java.lang.String str3 = b1Var.f317014b;
                        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                        long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
                        ((m30.m) rVar).getClass();
                        java.lang.String q17 = b52.b.q(j17);
                        n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
                        long j18 = ((mm2.c1) eVar.a(mm2.c1.class)).f328861p2;
                        ((m30.m) rVar2).getClass();
                        cVar2.g(obj, str3, q17, "", b52.b.q(j18));
                    }
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.y4 y4Var = ml2.j0.f327583i;
                    java.lang.String sceneNote = b1Var.f317034l;
                    kotlin.jvm.internal.o.f(sceneNote, "sceneNote");
                    y4Var.getClass();
                    y4Var.f328306n = sceneNote;
                    oVar.invoke(java.lang.Boolean.FALSE, b1Var);
                }
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.flw) {
                int integer = g92.b.f269769e.k2().getInteger(4);
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LIVE_SHOPPING_SERVICE_NOTE_TIME_LONG_SYNC;
                long t17 = c17.t(u3Var, 0L);
                com.tencent.mars.xlog.Log.i(this.f430940h, "lastShowNoteTime " + t17);
                boolean b17 = b();
                if (integer == 1 || (java.lang.System.currentTimeMillis() - t17 <= 86400000 && ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.I1).getValue()).r()).intValue() != 0)) {
                    f(false);
                } else {
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    h1Var.u();
                    android.view.ViewGroup viewGroup = this.f430937e;
                    com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(viewGroup.getContext());
                    y1Var.j(com.tencent.mm.R.layout.azm);
                    com.tencent.mm.ui.bk.r0(((android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.fsz)).getPaint(), 0.8f);
                    android.view.View findViewById = y1Var.f212027f.findViewById(com.tencent.mm.R.id.fsx);
                    android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.h5n);
                    android.widget.TextView textView = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.fsz);
                    android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.obc);
                    android.widget.TextView textView3 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.f484050cu2);
                    ((android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.m3v)).setVisibility(8);
                    if (b17) {
                        textView.setText(viewGroup.getContext().getString(com.tencent.mm.R.string.f491833ee0));
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context = viewGroup.getContext();
                        java.lang.String b18 = hc2.t.b(viewGroup.getContext(), 2);
                        ((ke0.e) xVar).getClass();
                        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, b18));
                        ng5.a.a(imageView, c01.z1.r());
                    } else {
                        gk2.e eVar2 = this.f430938f;
                        int integer2 = ((mm2.c1) eVar2.a(mm2.c1.class)).I7().getInteger(2);
                        mn2.g1 g1Var = mn2.g1.f329975a;
                        if (integer2 == 3) {
                            textView.setText(viewGroup.getContext().getString(com.tencent.mm.R.string.eee));
                            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                            android.content.Context context2 = viewGroup.getContext();
                            java.lang.String b19 = hc2.t.b(viewGroup.getContext(), 1);
                            ((ke0.e) xVar2).getClass();
                            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, b19));
                            ya2.g gVar = ya2.h.f460484a;
                            android.content.Context context3 = viewGroup.getContext();
                            kotlin.jvm.internal.o.f(context3, "getContext(...)");
                            ya2.b2 b27 = gVar.b(xy2.c.e(context3));
                            str = b27 != null ? b27.getAvatarUrl() : "";
                            vo0.d a17 = g1Var.a();
                            mn2.n nVar = new mn2.n(str, null, 2, null);
                            kotlin.jvm.internal.o.d(imageView);
                            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
                        } else if (((mm2.c1) eVar2.a(mm2.c1.class)).I7().getInteger(2) == 2) {
                            textView.setText(viewGroup.getContext().getString(com.tencent.mm.R.string.eed));
                            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                            android.content.Context context4 = viewGroup.getContext();
                            java.lang.String string2 = ((mm2.c1) eVar2.a(mm2.c1.class)).I7().getString(0);
                            ((ke0.e) xVar3).getClass();
                            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context4, string2));
                            vo0.d a18 = g1Var.a();
                            mn2.n nVar2 = new mn2.n(((mm2.c1) eVar2.a(mm2.c1.class)).I7().getString(1), null, 2, null);
                            kotlin.jvm.internal.o.d(imageView);
                            a18.c(nVar2, imageView, g1Var.h(mn2.f1.f329957h));
                        } else {
                            f(false);
                        }
                    }
                    textView3.setVisibility(8);
                    ((android.widget.Button) y1Var.f212027f.findViewById(com.tencent.mm.R.id.khs)).setOnClickListener(new ut2.t4(y1Var, this));
                    ((android.widget.Button) y1Var.f212027f.findViewById(com.tencent.mm.R.id.b5i)).setOnClickListener(new ut2.u4(y1Var, this));
                    y1Var.s();
                }
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.flc) {
                if (zl2.r4.f473950a.w1()) {
                    u();
                } else {
                    com.tencent.mm.plugin.finder.live.plugin.l lVar = h1Var.f412337h;
                    if (lVar != null && lVar.x0()) {
                        com.tencent.mm.plugin.finder.live.plugin.l lVar2 = h1Var.f412337h;
                        if (lVar2 != null) {
                            com.tencent.mm.plugin.finder.live.plugin.l.s1(lVar2, "PORTRAIT_ACTION_CART_CLICKED", 0, 0, 4, null);
                        }
                    } else {
                        u();
                    }
                }
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c18;
                ml2.b4 b4Var = ml2.b4.f327264s;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("commerceAction", 1031);
                jSONObject.put("btn_word", "购物车");
                ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            }
        } else if (h1Var.j().getVisibility() == 0) {
            if (h1Var.p().getVisibility() == 0) {
                h1Var.s(true);
            } else {
                h1Var.u();
            }
        } else if (h1Var.p().getVisibility() == 0) {
            h1Var.t(true, true);
        } else {
            h1Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final android.view.View p() {
        java.lang.Object value = this.f430946q.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.ImageView q() {
        java.lang.Object value = this.f430945p.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    public final android.widget.ImageView r() {
        android.view.View findViewById = t().findViewById(com.tencent.mm.R.id.s5x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final android.view.View s() {
        java.lang.Object value = this.f430943n.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View t() {
        android.view.View normalTitleGroup = this.f430941i;
        kotlin.jvm.internal.o.f(normalTitleGroup, "normalTitleGroup");
        return normalTitleGroup;
    }

    public final void u() {
        gk2.e eVar = this.f430938f;
        bw5.x7 x7Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329041p0;
        android.view.ViewGroup viewGroup = this.f430937e;
        if (x7Var != null) {
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pq.a aVar = new pq.a(context);
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
            return;
        }
        r45.c33 c33Var = ((mm2.f6) eVar.a(mm2.f6.class)).Z;
        if (c33Var == null) {
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = c33Var.getString(0);
        b1Var.f317022f = c33Var.getString(1);
        b1Var.f317032k = 1177;
        b1Var.X = k91.b1.f305541e;
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        q4Var.l(context2, this.f430938f, b1Var, true, null);
    }
}
