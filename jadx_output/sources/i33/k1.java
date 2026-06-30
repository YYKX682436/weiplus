package i33;

/* loaded from: classes10.dex */
public final class k1 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f288209f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f288210g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f288211h;

    /* renamed from: i, reason: collision with root package name */
    public int f288212i;

    /* renamed from: m, reason: collision with root package name */
    public int f288213m;

    /* renamed from: n, reason: collision with root package name */
    public int f288214n;

    /* renamed from: o, reason: collision with root package name */
    public final long f288215o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288209f = "MicroMsg.AlbumWindowUIC";
        this.f288210g = jz5.h.b(new i33.i1(this));
        this.f288211h = new java.util.ArrayList();
        this.f288213m = 1;
        this.f288214n = 1;
        this.f288215o = 300L;
    }

    @Override // i33.c
    public void V6(com.tencent.mm.ui.q2 oldMode, com.tencent.mm.ui.q2 newMode) {
        com.tencent.mm.ui.MMActivity mMActivity;
        kotlin.jvm.internal.o.g(oldMode, "oldMode");
        kotlin.jvm.internal.o.g(newMode, "newMode");
        if (oldMode != newMode) {
            com.tencent.mars.xlog.Log.i(this.f288209f, "updateStatusBarAndNavigationBar: toType:" + newMode);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity2 = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity2 != null) {
                int ordinal = newMode.ordinal();
                long j17 = this.f288215o;
                if (ordinal == 0) {
                    if (!mMActivity2.getIntent().getBooleanExtra("is_from_emoji_ALBUM", false)) {
                        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                        mMActivity = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
                        if (mMActivity != null) {
                            mMActivity.fullScreenNoTitleBar(false, j17);
                        }
                    }
                    W6(true);
                    ul5.k bounceView = mMActivity2.getBounceView();
                    if (bounceView != null) {
                        android.view.ViewGroup.LayoutParams layoutParams = bounceView.getView().getLayoutParams();
                        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.bottomMargin = this.f288212i;
                        bounceView.getView().setLayoutParams(layoutParams2);
                        return;
                    }
                    return;
                }
                if (ordinal != 1) {
                    return;
                }
                androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                mMActivity = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
                if (mMActivity != null) {
                    mMActivity.fullScreenNoTitleBar(true, j17);
                }
                W6(false);
                ul5.k bounceView2 = mMActivity2.getBounceView();
                if (bounceView2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = bounceView2.getView().getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
                    this.f288212i = layoutParams4.bottomMargin;
                    layoutParams4.bottomMargin = 0;
                    bounceView2.getView().setLayoutParams(layoutParams4);
                }
                o23.m.f342426a.C = true;
            }
        }
    }

    public final void W6(boolean z17) {
        s23.x xVar;
        k33.b bVar;
        s23.o oVar;
        java.util.Iterator it = ((java.util.ArrayList) this.f288211h).iterator();
        while (it.hasNext()) {
            ((s23.j) ((i33.f1) it.next())).getClass();
            java.util.Set<java.util.Map.Entry> entrySet = s23.n.f402310e.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            for (java.util.Map.Entry entry : entrySet) {
                s23.x xVar2 = (s23.x) entry.getValue();
                if (((xVar2 == null || (oVar = xVar2.f402343d) == null) ? false : oVar.d()) && (xVar = (s23.x) entry.getValue()) != null && (bVar = xVar.f402357u) != null) {
                    int i17 = k33.b.f303856j;
                    if (bVar.isShowing()) {
                        int i18 = z17 ? 0 : 4;
                        android.view.View contentView = bVar.getContentView();
                        if (contentView != null) {
                            int visibility = contentView.getVisibility();
                            com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "setPopupLayoutVisibility: old=" + visibility + ", new=" + i18);
                            if (visibility != i18) {
                                android.view.View contentView2 = bVar.getContentView();
                                if (contentView2 != null) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                    arrayList.add(java.lang.Integer.valueOf(i18));
                                    java.util.Collections.reverse(arrayList);
                                    yj0.a.d(contentView2, arrayList.toArray(), "com/tencent/mm/plugin/gallery/view/AbsAutoDismissTipsPopup", "setPopupLayoutVisibility", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    contentView2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                    yj0.a.f(contentView2, "com/tencent/mm/plugin/gallery/view/AbsAutoDismissTipsPopup", "setPopupLayoutVisibility", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                if (i18 == 0) {
                                    bVar.b();
                                } else {
                                    bVar.a();
                                }
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "setPopupLayoutVisibility: had dismiss");
                    }
                }
            }
        }
        sa5.x xVar3 = sa5.x.f405373a;
        jz5.g gVar = this.f288210g;
        long j17 = this.f288215o;
        if (!z17) {
            for (i33.g1 g1Var : (java.util.List) ((jz5.n) gVar).getValue()) {
                android.view.View view = g1Var.f288194a;
                g1Var.f288195b = view.getVisibility();
                if (view.getVisibility() == 0) {
                    sa5.d.b(view, new sa5.n0(xVar3), j17, new i33.h1(this, view));
                }
            }
            return;
        }
        for (i33.g1 g1Var2 : (java.util.List) ((jz5.n) gVar).getValue()) {
            android.view.View view2 = g1Var2.f288194a;
            int visibility2 = view2.getVisibility();
            int i19 = g1Var2.f288195b;
            if (visibility2 != i19 && i19 == 0) {
                view2.getId();
                sa5.d.a(view2, new sa5.e0(xVar3), j17, i33.j1.f288205d);
            }
        }
    }

    public final int X6() {
        return this.f288213m * (com.tencent.mm.ui.bl.a(getContext()) + (com.tencent.mm.ui.b4.c(getContext()) ? 0 : com.tencent.mm.ui.bl.h(getContext())));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f353948a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            z0Var.X6(this, 1);
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        if ((activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null) != null) {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
            if (mMActivity != null) {
                androidx.appcompat.app.b supportActionBar = mMActivity.getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.o();
                }
                mMActivity.getWindow().clearFlags(1024);
                mMActivity.getWindow().addFlags(Integer.MIN_VALUE);
                android.view.View decorView = mMActivity.getWindow().getDecorView();
                kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
                if (decorView.getSystemUiVisibility() != 1280) {
                    decorView.setSystemUiVisibility(1280);
                }
                androidx.appcompat.app.b supportActionBar2 = mMActivity.getSupportActionBar();
                if (supportActionBar2 != null) {
                    supportActionBar2.L();
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((java.util.ArrayList) this.f288211h).clear();
    }
}
