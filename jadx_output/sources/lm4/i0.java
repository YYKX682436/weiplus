package lm4;

/* loaded from: classes14.dex */
public final class i0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f319568d;

    /* renamed from: e, reason: collision with root package name */
    public int f319569e;

    /* renamed from: f, reason: collision with root package name */
    public lm4.b0 f319570f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f319571g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319572h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f319573i;

    /* renamed from: m, reason: collision with root package name */
    public int f319574m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f319575n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f319576o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f319572h = true;
        this.f319573i = "";
        this.f319575n = "TingPlayerDrawerUIC";
        this.f319576o = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void O6(android.content.Intent intent, int i17, lm4.c0 tingPlayerDrawerType) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        boolean z17;
        lm4.b0 b0Var;
        android.view.View view;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(tingPlayerDrawerType, "tingPlayerDrawerType");
        lm4.c0 c0Var = lm4.c0.f319544d;
        java.lang.String str = "";
        if (tingPlayerDrawerType != c0Var ? (stringExtra = intent.getStringExtra("Contact_User")) == null : (stringExtra = intent.getStringExtra("finder_username")) == null) {
            stringExtra = "";
        }
        this.f319573i = stringExtra;
        if (tingPlayerDrawerType != c0Var ? (stringExtra2 = intent.getStringExtra("Contact_Scene_Note")) != null : (stringExtra2 = intent.getStringExtra("key_extra_info")) != null) {
            str = stringExtra2;
        }
        int hashCode = (this.f319573i + tingPlayerDrawerType + str).hashCode();
        int i18 = this.f319569e;
        r8 = null;
        com.google.android.material.appbar.AppBarLayout appBarLayout = null;
        int i19 = com.tencent.mm.R.color.f478491c;
        if (i18 == hashCode) {
            if (tingPlayerDrawerType != lm4.c0.f319545e) {
                i19 = com.tencent.mm.R.color.f478494f;
            }
            lm4.b0 b0Var2 = this.f319570f;
            java.lang.Object headerComponent = b0Var2 != null ? b0Var2.getHeaderComponent() : null;
            mm4.e eVar = headerComponent instanceof mm4.e ? (mm4.e) headerComponent : null;
            if (eVar != null) {
                eVar.f(i19);
            }
            lm4.b0 b0Var3 = this.f319570f;
            if (b0Var3 != null) {
                b0Var3.j(-b0Var3.edgeAttached, false);
                return;
            }
            return;
        }
        lm4.c0 c0Var2 = lm4.c0.f319545e;
        int i27 = tingPlayerDrawerType == c0Var2 ? com.tencent.mm.R.color.f478491c : com.tencent.mm.R.color.f478494f;
        lm4.b0 b0Var4 = this.f319570f;
        if (b0Var4 == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(com.tencent.mm.R.id.o9m);
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            this.f319571g = frameLayout;
            float n17 = i17 > 0 ? i17 : (float) (com.tencent.mm.ui.bk.n(1.0f) * 0.7d);
            lm4.l lVar = new lm4.l();
            lVar.f319580a = n17;
            z17 = true;
            lVar.f319581b = new mm4.e(getContext(), i27, 0, 0, false, 28, null);
            android.widget.FrameLayout frameLayout2 = this.f319571g;
            kotlin.jvm.internal.o.d(frameLayout2);
            lVar.f319582c = new mm4.a(frameLayout2);
            ((java.util.HashSet) lVar.f319583d).add(new lm4.d0(this));
            android.view.View findViewById = findViewById(android.R.id.content);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (lVar.f319580a == 0.0f) {
                throw new java.lang.IllegalStateException("expandHeight should not be zero");
            }
            lm4.b0 b0Var5 = new lm4.b0(context, lVar);
            viewGroup.removeView(b0Var5);
            viewGroup.addView(b0Var5);
            this.f319570f = b0Var5;
            b0Var5.setOnDrawerDetach(new lm4.e0(this));
        } else {
            z17 = true;
            mm4.g headerComponent2 = b0Var4.getHeaderComponent();
            mm4.e eVar2 = headerComponent2 instanceof mm4.e ? (mm4.e) headerComponent2 : null;
            if (eVar2 != null) {
                eVar2.f(i27);
            }
            if (i17 > 0 && (b0Var = this.f319570f) != null) {
                b0Var.setExpandHeight(i17);
            }
        }
        intent.putExtra("key_is_auto_report", false);
        intent.putExtra("key_enter_dialog", z17);
        androidx.fragment.app.i2 beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        android.widget.FrameLayout frameLayout3 = this.f319571g;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
        com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b(tingPlayerDrawerType == c0Var ? "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI" : "com.tencent.mm.plugin.profile.ui.DialogContactInfoUI", intent, false, 4, null);
        this.f319568d = b17;
        b17.q0(new lm4.f0(this));
        lm4.b0 b0Var6 = this.f319570f;
        if (b0Var6 != null) {
            b0Var6.setContentReachTop(new lm4.g0(tingPlayerDrawerType, this));
        }
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319568d;
        kotlin.jvm.internal.o.d(vASCommonFragment);
        beginTransaction.k(com.tencent.mm.R.id.o9m, vASCommonFragment, null);
        beginTransaction.f();
        this.f319569e = hashCode;
        if (tingPlayerDrawerType == c0Var2) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f319568d;
            if (vASCommonFragment2 != null && (view = vASCommonFragment2.f211137i) != null) {
                appBarLayout = (com.google.android.material.appbar.AppBarLayout) view.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout");
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appBarLayout is null? ");
            sb6.append(appBarLayout == null ? z17 : false);
            com.tencent.mars.xlog.Log.i(this.f319575n, sb6.toString());
            if (appBarLayout != null) {
                appBarLayout.a(new lm4.h0(this));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        lm4.b0 b0Var = this.f319570f;
        if (!(b0Var != null ? b0Var.isDrawerOpen : false)) {
            return super.onBackPressed();
        }
        if (b0Var != null) {
            int i17 = com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout.f174821u;
            b0Var.j(b0Var.edgeAttached, true);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f319570f = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f319572h) {
            this.f319572h = false;
            return;
        }
        lm4.b0 b0Var = this.f319570f;
        if (b0Var != null) {
            int i17 = com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout.f174821u;
            b0Var.j(0, false);
        }
    }
}
