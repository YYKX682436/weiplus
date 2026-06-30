package re5;

/* loaded from: classes12.dex */
public final class s extends lf3.o implements re5.b, kg3.d, com.tencent.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f394591d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.textview.FadeEdgeTextView f394592e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f394593f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f394594g;

    /* renamed from: h, reason: collision with root package name */
    public gg3.c f394595h;

    /* renamed from: i, reason: collision with root package name */
    public final long f394596i;

    /* renamed from: m, reason: collision with root package name */
    public final int f394597m;
    private vj5.k mStatusBarHeightCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f394596i = 340L;
        this.f394597m = com.tencent.mm.ui.zk.a(getContext(), 25);
    }

    @Override // kg3.d
    public void H2() {
        android.widget.RelativeLayout relativeLayout = this.f394591d;
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, com.tencent.mm.ui.bl.h(relativeLayout.getContext()), 0, 0);
        }
    }

    @Override // lf3.o
    public int T6() {
        return com.tencent.mm.R.layout.e5f;
    }

    public final void V6() {
        getActivity().getWindow().clearFlags(2048);
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) getActivity();
        if (mMActivity != null) {
            if (fp.e0.c() || fp.e0.i() || fp.e0.e()) {
                mMActivity.getWindow().setFlags(134218752, 134218752);
            } else {
                mMActivity.getWindow().setFlags(134217728, 134217728);
            }
            android.view.View decorView = mMActivity.getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(1028);
            androidx.appcompat.app.b supportActionBar = mMActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o();
            }
            if (android.os.Build.VERSION.SDK_INT < 30) {
                decorView.setSystemUiVisibility(0);
                decorView.setSystemUiVisibility(4102);
                return;
            }
            android.view.WindowInsetsController windowInsetsController = decorView.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.hide(android.view.WindowInsets.Type.statusBars());
                windowInsetsController.hide(android.view.WindowInsets.Type.navigationBars());
                windowInsetsController.setSystemBarsBehavior(2);
            }
        }
    }

    public final void W6() {
        com.tencent.mm.ui.MMActivity mMActivity;
        if (this.f394594g || (mMActivity = (com.tencent.mm.ui.MMActivity) getActivity()) == null) {
            return;
        }
        mMActivity.getWindow().clearFlags(201327616);
        if (android.os.Build.VERSION.SDK_INT < 30) {
            android.view.View decorView = mMActivity.getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(0);
        } else {
            android.view.WindowInsetsController insetsController = mMActivity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.show(android.view.WindowInsets.Type.statusBars() | android.view.WindowInsets.Type.navigationBars());
            }
        }
    }

    public final void X6(com.tencent.mm.ui.MMActivity mMActivity) {
        android.widget.RelativeLayout relativeLayout = this.f394591d;
        if (relativeLayout != null) {
            W6();
            oa5.b.b(relativeLayout).k(new re5.q(relativeLayout)).o(new re5.r(relativeLayout)).g(this.f394596i).l();
        }
    }

    @Override // kg3.d
    public void h4() {
        android.widget.RelativeLayout relativeLayout = this.f394591d;
        if (relativeLayout != null) {
            int f17 = i65.a.f(relativeLayout.getContext(), com.tencent.mm.R.dimen.f479731dn);
            relativeLayout.setPadding(f17, this.f394597m, f17, 0);
        }
        V6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.f394594g = newConfig.orientation == 2;
        new kg3.n(getContext(), this, false).c(newConfig);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        this.f394594g = getActivity().getResources().getConfiguration().orientation == 2;
        W6();
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) getActivity();
        if (mMActivity != null) {
            com.tencent.mm.ui.a4.f197117a.i(mMActivity);
            android.view.View w17 = mMActivity.getController().w();
            if (w17 != null) {
                w17.setPadding(0, 0, 0, 0);
            }
            mMActivity.getController().O0(true);
            mMActivity.setNavigationbarColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.a9e));
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) mMActivity.findViewById(com.tencent.mm.R.id.crd);
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setOverlayMode(true);
                actionBarOverlayLayout.requestLayout();
            }
            androidx.appcompat.app.b supportActionBar = mMActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o();
            }
            mMActivity.hideActionbarLine();
            mMActivity.hideActionBarOperationArea();
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) mMActivity.findViewById(com.tencent.mm.R.id.of9);
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                com.tencent.mm.ui.widget.textview.FadeEdgeTextView fadeEdgeTextView = (com.tencent.mm.ui.widget.textview.FadeEdgeTextView) relativeLayout.findViewById(com.tencent.mm.R.id.f482442ep);
                fadeEdgeTextView.setTextColor(fadeEdgeTextView.getResources().getColor(com.tencent.mm.R.color.by));
                com.tencent.mm.ui.bk.r0(fadeEdgeTextView.getPaint(), 0.8f);
                fadeEdgeTextView.invalidate();
                this.f394592e = fadeEdgeTextView;
                android.widget.TextView textView = (android.widget.TextView) relativeLayout.findViewById(com.tencent.mm.R.id.hbh);
                textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.by));
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                this.f394593f = textView;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) relativeLayout.findViewById(com.tencent.mm.R.id.hbe);
                weImageView.setImageResource(com.tencent.mm.R.drawable.f480725b5);
                weImageView.setIconColor(weImageView.getResources().getColor(com.tencent.mm.R.color.by));
                weImageView.setOnClickListener(new re5.l(mMActivity));
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) relativeLayout.findViewById(com.tencent.mm.R.id.hbg);
                weImageView2.setIconColor(weImageView2.getResources().getColor(com.tencent.mm.R.color.by));
                if (mMActivity.getIntent().getBooleanExtra("KEY_VIDEO_HIDE_MENU", false)) {
                    weImageView2.setVisibility(8);
                } else {
                    weImageView2.setVisibility(0);
                    weImageView2.setOnClickListener(new re5.m(this));
                }
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                vj5.n b17 = vj5.n.b(activity);
                re5.i iVar = new re5.i(this, relativeLayout);
                this.mStatusBarHeightCallback = iVar;
                b17.d(iVar);
                activity.getWindow().getDecorView().requestApplyInsets();
                vj5.o.e(activity.getWindow());
                this.f394591d = relativeLayout;
            } else {
                relativeLayout = null;
            }
            this.f394591d = relativeLayout;
        }
        com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) getActivity();
        if (mMActivity2 != null) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            X6((com.tencent.mm.ui.MMActivity) activity2);
            mMActivity2.addOnConfigurationChangedListener(this);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        o25.n1.e(getActivity());
        n3.h2.a(getActivity().getWindow(), false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) getActivity();
        if (mMActivity != null) {
            mMActivity.removeOnConfigurationChangedListener(this);
            vj5.n.b(mMActivity).f(this.mStatusBarHeightCallback);
        }
    }
}
