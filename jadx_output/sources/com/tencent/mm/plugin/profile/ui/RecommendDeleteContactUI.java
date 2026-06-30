package com.tencent.mm.plugin.profile.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class RecommendDeleteContactUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f153787d = jz5.h.b(new hr3.pc(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f153788e = jz5.h.b(new hr3.nc(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f153789f = jz5.h.b(new hr3.mc(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f153790g = jz5.h.b(new hr3.oc(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f153791h = jz5.h.b(new hr3.id(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f153792i = jz5.h.b(new hr3.jd(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f153793m = jz5.h.b(new hr3.hd(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f153794n = jz5.h.b(new hr3.vc(this));

    /* renamed from: o, reason: collision with root package name */
    public boolean f153795o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.LoadingTipsView f153796p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f153797q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f153798r;

    /* renamed from: s, reason: collision with root package name */
    public final xb5.b f153799s;

    /* renamed from: t, reason: collision with root package name */
    public q31.n f153800t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f153801u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f153802v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f153803w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f153804x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f153805y;

    /* renamed from: z, reason: collision with root package name */
    public final fr3.f f153806z;

    public RecommendDeleteContactUI() {
        jz5.h.b(new hr3.sc(this));
        jz5.h.b(new hr3.rc(this));
        this.f153797q = new java.util.HashSet();
        this.f153798r = new java.util.ArrayList();
        xb5.b bVar = new xb5.b();
        bVar.f453012e = new hr3.yc(this);
        bVar.f453013f = new hr3.zc(this);
        this.f153799s = bVar;
        this.f153802v = jz5.h.b(new hr3.xc(this));
        this.f153803w = jz5.h.b(new hr3.gd(this));
        this.f153804x = jz5.h.b(new hr3.dd(this));
        jz5.h.b(new hr3.wc(this));
        this.f153805y = "infrequentcontactsortpage_sessionid_" + c01.id.c();
        this.f153806z = new fr3.f(this);
    }

    public final void T6(java.util.List list) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) this.f153802v).getValue();
        kotlin.jvm.internal.o.d(list);
        arrayList.removeAll(kz5.n0.X0(list));
        androidx.appcompat.app.AppCompatActivity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = getContext().getResources().getString(com.tencent.mm.R.string.mf7);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        xb5.b bVar = this.f153799s;
        java.util.List list2 = bVar.f453011d;
        if (list2 != null) {
            kz5.h0.B(list2, new hr3.qc(list));
        }
        java.util.List list3 = bVar.f453011d;
        int size = list3 != null ? list3.size() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "dealDeleteContact() called with: userNameList = " + list + " remainSize:" + size);
        android.view.View view = this.f153801u;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "dealDeleteContact", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "dealDeleteContact", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        q31.n nVar = this.f153800t;
        if (nVar != null) {
            ((io.g0) nVar).b(bVar);
        }
        if (size <= 0 && this.f153795o) {
            U6();
        }
        Z6();
    }

    public final void U6() {
        android.view.View view = this.f153801u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "fresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "fresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        showLoading();
        this.f153805y = "infrequentcontactsortpage_sessionid_" + c01.id.c();
        this.f153806z.O6(fr3.h.f265797a);
        Z6();
    }

    public final com.tencent.mm.ui.widget.button.WeButton V6() {
        java.lang.Object value = ((jz5.n) this.f153788e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.button.WeButton) value;
    }

    public final java.lang.String W6() {
        return (java.lang.String) ((jz5.n) this.f153804x).getValue();
    }

    public final boolean X6() {
        java.util.List list = this.f153799s.f453011d;
        if (list == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.String str = ((xb5.a) obj).f453006d;
            if (true ^ (str == null || str.length() == 0)) {
                arrayList.add(obj);
            }
        }
        return arrayList.isEmpty() ^ true;
    }

    public final void Y6(boolean z17) {
        if (!z17) {
            V6().setVisibility(4);
        } else {
            V6().setVisibility(X6() ? 0 : 8);
        }
    }

    public final void Z6() {
        int i17;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) this.f153802v).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String str = (java.lang.String) next;
            kotlin.jvm.internal.o.d(str);
            if (true ^ r26.n0.N(str)) {
                arrayList2.add(next);
            }
        }
        Y6(true);
        java.util.List list = this.f153799s.f453011d;
        if (list != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((xb5.a) obj).f453008f) {
                    arrayList3.add(obj);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (!r26.n0.N(((xb5.a) next2).f453006d)) {
                    arrayList4.add(next2);
                }
            }
            i17 = arrayList4.size();
        } else {
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "freshButton() called selectedItemsCount:" + i17 + " userNameList:" + arrayList2);
        V6().setEnabled(i17 > 0);
        V6().setText(i17 > 0 ? getString(com.tencent.mm.R.string.f490367t0) + '(' + i17 + ')' : getString(com.tencent.mm.R.string.f490367t0));
    }

    public final void a7(boolean z17) {
        this.f153795o = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "updateFreshButton() called with: enabled = " + z17);
        jz5.g gVar = this.f153793m;
        jz5.g gVar2 = this.f153794n;
        if (z17) {
            java.lang.Object value = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) value).setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.Link_100));
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.widget.TextView) value2).setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, android.util.StateSet.WILD_CARD}, new int[]{getContext().getResources().getColor(com.tencent.mm.R.color.Link_120), getContext().getResources().getColor(com.tencent.mm.R.color.Link_100)}));
            return;
        }
        java.lang.Object value3 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value3).setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        java.lang.Object value4 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.f479232tk);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        ((android.widget.TextView) value4).setTextColor(color);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dvw;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.j(kz5.q1.j(kz5.q1.j(importUIComponents, hr3.z8.class), fr3.f.class), hr3.ni.class);
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "onActivityResult() called with: requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent);
        if (i18 != -1 || i17 != 1 || intent == null || (stringExtra = intent.getStringExtra("Contact_User")) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "onActivityResult: username:".concat(stringExtra));
        T6(kz5.b0.c(stringExtra));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f153806z.f265795g = (java.util.ArrayList) ((jz5.n) this.f153802v).getValue();
        this.f153796p = (com.tencent.mm.pluginsdk.ui.LoadingTipsView) findViewById(com.tencent.mm.R.id.imn);
        a7(false);
        U6();
        ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).bj();
        io.g0 g0Var = new io.g0();
        g0Var.b(this.f153799s);
        this.f153800t = g0Var;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f153801u = g0Var.a(context);
        java.lang.Object value = ((jz5.n) this.f153787d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.ViewGroup) value).addView(this.f153801u);
        a42.h hVar = a42.h.f1207a;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        float a17 = hVar.a(context2, 14.0f);
        java.lang.Object value2 = ((jz5.n) this.f153791h).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.TextView) value2).setTextSize(1, a17);
        java.lang.Object value3 = ((jz5.n) this.f153793m).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((android.widget.TextView) value3).setTextSize(1, a17);
        jz5.g gVar = this.f153792i;
        java.lang.Object value4 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.widget.TextView) value4).setText((java.lang.String) ((jz5.n) this.f153803w).getValue());
        java.lang.Object value5 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) value5).getPaint());
        java.lang.Object value6 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        ((android.widget.TextView) value6).setTextSize(1, hVar.a(context3, 22.0f));
        java.lang.Object value7 = ((jz5.n) this.f153789f).getValue();
        kotlin.jvm.internal.o.f(value7, "getValue(...)");
        ((android.view.View) value7).setOnClickListener(new hr3.ad(this));
        V6().setOnClickListener(new hr3.bd(this));
        java.lang.Object value8 = ((jz5.n) this.f153790g).getValue();
        kotlin.jvm.internal.o.f(value8, "getValue(...)");
        ((android.view.View) value8).setOnClickListener(new hr3.cd(this));
        kotlinx.coroutines.l.d(v65.m.b(this), null, null, new hr3.uc(this, null), 3, null);
    }

    public final void showLoading() {
        com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView = this.f153796p;
        if (loadingTipsView != null) {
            java.lang.String string = getString(com.tencent.mm.R.string.i_b);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            loadingTipsView.d(string);
        }
        com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView2 = this.f153796p;
        if (loadingTipsView2 == null) {
            return;
        }
        loadingTipsView2.setVisibility(0);
    }
}
