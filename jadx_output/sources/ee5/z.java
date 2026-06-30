package ee5;

/* loaded from: classes9.dex */
public final class z extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f252097d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.mm_compose.MMComposeView f252098e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f252099f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f252100g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f252101h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f252102i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.g0 f252103m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f252104n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f252105o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f252106p;

    /* renamed from: q, reason: collision with root package name */
    public aq.c f252107q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f252108r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f252099f = "";
        this.f252100g = "";
        this.f252102i = jz5.h.b(new ee5.p(activity));
        this.f252103m = Q6().f264724g;
        this.f252107q = aq.c.f12842d;
    }

    public final void O6() {
        this.f252104n = true;
        this.f252108r = true;
        aq.n nVar = aq.o.f12922c;
        if (nVar != null) {
            nVar.a(getActivity());
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        int i17 = ((ee5.q3) pf5.z.f353948a.a(activity).a(ee5.q3.class)).f252015p;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "onActivityResult >> currentTab: " + i17);
        if (i17 == 0 || i17 == 1 || i17 == 2) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ee5.j jVar = (ee5.j) pf5.z.f353948a.a(activity2).a(ee5.j.class);
            android.view.View view = jVar.f251930d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "openFeatureFromMediaHistory", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "openFeatureFromMediaHistory", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = jVar.f251932f;
            if (view2 != null) {
                V6(view2);
            }
        }
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        ((ee5.q3) pf5.z.f353948a.a(activity3).a(ee5.q3.class)).S6();
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        kotlin.jvm.internal.o.g(activity4, "activity");
        ee5.h0 h0Var = (ee5.h0) pf5.z.f353948a.a(activity4).a(ee5.h0.class);
        aq.c cVar = aq.c.f12843e;
        h0Var.U6(cVar);
        this.f252107q = cVar;
        U6();
    }

    public final int P6() {
        if (this.f252105o) {
            return this.f252104n ? 1 : 2;
        }
        return 3;
    }

    public final fn5.n0 Q6() {
        return (fn5.n0) this.f252102i.getValue();
    }

    public final int R6() {
        return Q6().f264731q.size();
    }

    public final boolean S6() {
        bm5.t0 t0Var = bm5.t0.f22738a;
        boolean z17 = t0Var.a() && t0Var.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "getImageQueryEntrance >> " + z17);
        return z17;
    }

    public final boolean T6() {
        boolean z17 = (c01.z1.i() & 1) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "getImageQueryFeatureState > " + z17);
        return z17;
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "initIdentifyObserver");
        pm0.v.X(new ee5.r(this));
    }

    public final void V6(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "initParentView");
        this.f252097d = parentView;
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = (com.tencent.mm.mm_compose.MMComposeView) parentView.findViewById(com.tencent.mm.R.id.gfk);
        this.f252098e = mMComposeView;
        aq.o.f12920a = true;
        if (mMComposeView != null) {
            mMComposeView.setVisibility(0);
        }
        com.tencent.mm.mm_compose.MMComposeView mMComposeView2 = this.f252098e;
        if (mMComposeView2 != null) {
            mMComposeView2.setContent(u0.j.c(-1694448054, true, new ee5.v(this)));
        }
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "postRunning");
        pm0.v.X(new ee5.s(this));
    }

    public final void X6(java.lang.String query) {
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "updateQuery >> ".concat(query));
        this.f252100g = query;
        if (this.f252105o && this.f252104n) {
            Q6().c7(query);
            if (query.length() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "startToQuery: ".concat(query));
                fn5.n0 Q6 = Q6();
                kotlin.jvm.internal.o.f(Q6, "<get-imageDataQueryModel>(...)");
                java.util.List list = fn5.n0.E;
                Q6.P6(query, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            if (i18 == -1 && intent != null) {
                boolean booleanExtra = intent.getBooleanExtra("RESULT_OPEN_FEATURE", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "onActivityResult >> " + booleanExtra);
                if (booleanExtra) {
                    O6();
                    return;
                }
                return;
            }
            boolean T6 = T6();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "onActivityResult >> deal " + T6 + ", " + this.f252104n);
            if (this.f252104n || !T6) {
                return;
            }
            O6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f252099f = stringExtra;
        this.f252104n = T6();
        boolean S6 = S6();
        this.f252105o = S6;
        if (this.f252104n && S6) {
            this.f252106p = kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), kotlinx.coroutines.q1.f310570c, null, new ee5.y(this, null), 2, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "onDestroy >> " + this.f252104n + ", " + this.f252105o + (char) 65292 + this.f252108r);
        if (!this.f252104n || !this.f252105o || !this.f252108r) {
            de5.a.f229396a.i(0);
            return;
        }
        de5.a.f229396a.i(R6());
        kotlinx.coroutines.r2 r2Var = this.f252106p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        aq.n nVar = aq.o.f12922c;
        if (nVar != null) {
            nVar.d();
        }
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Zi();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        aq.o.f12920a = true;
    }
}
