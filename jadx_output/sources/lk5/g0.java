package lk5;

/* loaded from: classes14.dex */
public final class g0 extends com.tencent.mm.ui.ga {

    /* renamed from: y0, reason: collision with root package name */
    public android.view.MenuInflater f319033y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f319034z0;

    public g0(com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment) {
        this.f319034z0 = vASCommonFragment;
    }

    @Override // com.tencent.mm.ui.ga
    public s75.b B() {
        return new s75.b("");
    }

    @Override // com.tencent.mm.ui.ga
    public int C() {
        return this.f319034z0.getLayoutId();
    }

    @Override // com.tencent.mm.ui.ga
    public android.view.View D() {
        nk5.c cVar;
        android.view.ViewGroup viewGroup;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319034z0;
        android.view.View inflate = android.view.LayoutInflater.from(vASCommonFragment.f211121p).inflate(com.tencent.mm.R.layout.bbk, (android.view.ViewGroup) null);
        com.tencent.mm.ui.vas.VASActivity vASActivity = vASCommonFragment.f211121p;
        androidx.appcompat.app.b mActionBar = vASActivity != null ? vASActivity.getMActionBar() : null;
        lk5.e eVar = mActionBar instanceof lk5.e ? (lk5.e) mActionBar : null;
        if (eVar != null && (viewGroup = eVar.f319028b) != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.hvf);
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            android.view.ViewParent parent = frameLayout.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) parent;
            int indexOfChild = viewGroup2.indexOfChild(frameLayout);
            viewGroup2.removeView(frameLayout);
            viewGroup2.addView(viewGroup, indexOfChild, layoutParams);
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.hw_);
        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.hwa);
        lk5.f fVar = com.tencent.mm.ui.vas.VASActivity.Companion;
        com.tencent.mm.ui.vas.VASActivity vASActivity2 = vASCommonFragment.f211121p;
        java.lang.String name = vASActivity2 != null ? vASActivity2.getClass().getName() : null;
        if (name == null) {
            name = "";
        }
        fVar.getClass();
        cVar = com.tencent.mm.ui.vas.VASActivity.vasController;
        if (cVar.a(name)) {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
                frameLayout3.setLayoutParams(marginLayoutParams);
            }
        }
        vASCommonFragment.M = frameLayout2;
        vASCommonFragment.N = frameLayout3;
        vASCommonFragment.f211128w = inflate.findViewById(com.tencent.mm.R.id.f487534ow4);
        frameLayout2.addView(android.view.LayoutInflater.from(vASCommonFragment.f211121p).inflate(vASCommonFragment.getLayoutId(), (android.view.ViewGroup) null));
        vASCommonFragment.postponeEnterTransition();
        n3.m0.a(inflate, new lk5.c0(vASCommonFragment));
        return inflate;
    }

    @Override // com.tencent.mm.ui.ga
    public void E0(int i17) {
        super.E0(i17);
        ul5.k kVar = this.f208674v;
        if (kVar != null) {
            kVar.setEnd2StartBgColorByNavigationBar(i17);
        }
        android.view.View view = this.f319034z0.f211128w;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    @Override // com.tencent.mm.ui.ga
    public void I() {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319034z0;
        android.view.View view = vASCommonFragment.f211127v;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "hideStatusBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/vas/VASCommonFragment", "hideStatusBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        vASCommonFragment.L = true;
    }

    @Override // com.tencent.mm.ui.ga
    public void N0() {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319034z0;
        o.r rVar = new o.r(vASCommonFragment.f211121p);
        if (this.f319033y0 == null) {
            androidx.appcompat.app.b F = F();
            if (F != null) {
                this.f319033y0 = new n.j(F.m());
            } else {
                this.f319033y0 = new n.j(vASCommonFragment.getActivity());
            }
        }
        android.view.MenuInflater menuInflater = this.f319033y0;
        kotlin.jvm.internal.o.d(menuInflater);
        vASCommonFragment.onCreateOptionsMenu(rVar, menuInflater);
        vASCommonFragment.onPrepareOptionsMenu(rVar);
        super.g0(rVar);
    }

    @Override // com.tencent.mm.ui.ga
    public void O0(boolean z17) {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f319034z0.f211121p;
        boolean z18 = false;
        if (vASActivity != null && vASActivity.getDisableCommonAreaControl()) {
            z18 = true;
        }
        if (z18) {
            return;
        }
        super.O0(z17);
    }

    @Override // com.tencent.mm.ui.ga
    public boolean V() {
        return true;
    }

    @Override // com.tencent.mm.ui.ga
    public boolean d0() {
        this.f319034z0.getClass();
        return false;
    }

    @Override // com.tencent.mm.ui.ga
    public void f(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super.f(i17, i18, i19, onMenuItemClickListener);
    }

    @Override // com.tencent.mm.ui.ga
    public void f0() {
        this.f319034z0.getClass();
    }

    @Override // com.tencent.mm.ui.ga
    public void g(int i17, java.lang.String str, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super.g(i17, str, i18, onMenuItemClickListener);
    }

    @Override // com.tencent.mm.ui.ga
    public boolean g0(android.view.Menu menu) {
        return super.g0(menu);
    }

    @Override // com.tencent.mm.ui.ga
    public void i0() {
        this.f319034z0.getClass();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean k0(android.view.Menu menu) {
        super.k0(menu);
        return true;
    }

    @Override // com.tencent.mm.ui.ga
    public void m(android.view.View view) {
        this.f319034z0.getClass();
    }

    @Override // com.tencent.mm.ui.ga
    public android.view.View m0() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f319034z0.f211121p;
        if (vASActivity != null) {
            return vASActivity.provideCustomActivityContentView();
        }
        return null;
    }

    @Override // com.tencent.mm.ui.ga
    public void p0(int i17) {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319034z0;
        com.tencent.mm.ui.vas.VASActivity vASActivity = vASCommonFragment.f211121p;
        boolean z17 = false;
        if (vASActivity != null && vASActivity.getDisableCommonAreaControl()) {
            z17 = true;
        }
        if (!z17) {
            super.p0(i17);
        } else if (this.G != null) {
            this.O = i17;
            this.P = true;
            this.R = com.tencent.mm.ui.uk.g(i17);
            this.G.w(new android.graphics.drawable.ColorDrawable(this.O));
            P0();
        }
        ul5.k kVar = this.f208674v;
        if (kVar != null) {
            kVar.setStart2EndBgColorByActionBar(i17);
        }
        android.view.View view = vASCommonFragment.f211126u;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
        android.view.View view2 = vASCommonFragment.f211127v;
        if (view2 != null) {
            view2.setBackgroundColor(i17);
        }
    }

    @Override // com.tencent.mm.ui.ga
    public boolean s() {
        return false;
    }

    @Override // com.tencent.mm.ui.ga
    public java.lang.String v() {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319034z0;
        com.tencent.mm.ui.vas.VASActivity vASActivity = vASCommonFragment.f211121p;
        java.lang.String name = vASActivity != null ? vASActivity.getClass().getName() : null;
        return name == null ? vASCommonFragment.getClass().getName() : name;
    }

    @Override // com.tencent.mm.ui.ga
    public android.view.View w() {
        android.view.View view = this.f208638d;
        return view == null ? new android.view.View(this.f319034z0.getActivity()) : view;
    }

    @Override // com.tencent.mm.ui.ga
    public androidx.appcompat.app.AppCompatActivity x() {
        return this.f319034z0.f211121p;
    }

    @Override // com.tencent.mm.ui.ga
    public int y() {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319034z0;
        com.tencent.mm.ui.vas.VASActivity vASActivity = vASCommonFragment.f211121p;
        int _getCustomBounceId = vASActivity != null ? vASActivity._getCustomBounceId() : -1;
        if (_getCustomBounceId != -1) {
            return _getCustomBounceId;
        }
        vASCommonFragment.getClass();
        return com.tencent.mm.R.id.hw_;
    }
}
