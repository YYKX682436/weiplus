package dp1;

/* loaded from: classes8.dex */
public class u implements dp1.x {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f242177d;

    /* renamed from: f, reason: collision with root package name */
    public dp1.v f242179f;

    /* renamed from: i, reason: collision with root package name */
    public int f242182i;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f242180g = java.lang.Boolean.FALSE;

    /* renamed from: h, reason: collision with root package name */
    public boolean f242181h = false;

    /* renamed from: e, reason: collision with root package name */
    public al5.g3 f242178e = new dp1.r(this);

    public u(android.app.Activity activity) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f242182i = 0;
        this.f242177d = new java.lang.ref.WeakReference(activity);
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        android.app.Activity activity2 = getActivity();
        ((ov.p0) j0Var).getClass();
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.multitask.RepairerConfigExpandSwipeSize());
        float f17 = (activity2 == null || (resources = activity2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density;
        float f18 = ((c17 <= 0 || c17 >= 100) ? 20 : c17) * f17;
        float B = (i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) / 5) - f18;
        this.f242182i = (int) java.lang.Math.min((100 * f17) + 0.5f, B > 0.0f ? B : f18);
        if (w()) {
            y();
        }
    }

    @Override // dp1.x
    public android.view.ViewGroup a() {
        android.app.Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (android.view.ViewGroup) activity.getWindow().getDecorView();
    }

    @Override // dp1.x
    public int b() {
        return -1;
    }

    @Override // dp1.x
    public boolean c() {
        return true;
    }

    @Override // dp1.x
    public boolean f() {
        return false;
    }

    @Override // dp1.x
    public void g(dp1.v vVar) {
        android.app.Activity activity = getActivity();
        boolean z17 = activity instanceof com.tencent.mm.ui.MMActivity;
        if (z17) {
            ((com.tencent.mm.ui.MMActivity) activity).getSwipeBackLayout();
        }
        if (z17) {
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            if (mMActivity.getSwipeBackLayout() != null) {
                mMActivity.getSwipeBackLayout().setSwipeBackListener(this.f242178e);
                this.f242179f = vVar;
            }
        }
    }

    @Override // dp1.x
    public android.app.Activity getActivity() {
        if (this.f242177d.get() == null) {
            return null;
        }
        return (android.app.Activity) this.f242177d.get();
    }

    @Override // dp1.x
    public android.graphics.Bitmap getBitmap() {
        return uj5.g.c(getMaskView());
    }

    @Override // dp1.x
    public android.view.View getContentView() {
        android.app.Activity activity = getActivity();
        if (!(activity instanceof com.tencent.mm.ui.MMActivity)) {
            return null;
        }
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        if (mMActivity.getSwipeBackLayout() != null) {
            return mMActivity.getSwipeBackLayout().getTargetContentView();
        }
        return null;
    }

    @Override // dp1.x
    public android.content.Intent getIntent() {
        android.app.Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return activity.getIntent();
    }

    @Override // dp1.x
    public android.view.View getMaskView() {
        android.app.Activity activity = getActivity();
        if (activity instanceof com.tencent.mm.ui.MMActivity) {
            return ((com.tencent.mm.ui.MMActivity) activity).getBodyView();
        }
        return null;
    }

    @Override // dp1.x
    public boolean h() {
        return this instanceof kd2.a0;
    }

    @Override // dp1.x
    public boolean i() {
        return this instanceof kd2.a0;
    }

    @Override // dp1.x
    public void j(dp1.w wVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallPageAdapter", "convertToTranslucent");
        db5.f.c(getActivity(), new dp1.t(this, new java.util.concurrent.atomic.AtomicInteger(0), wVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallPageAdapter", "float ball page convertActivityToTranslucent");
    }

    @Override // dp1.x
    public boolean k() {
        return this.f242181h;
    }

    @Override // dp1.x
    public void l(int i17) {
        java.lang.String str;
        try {
            ((ov.p0) ((pv.j0) i95.n0.c(pv.j0.class))).getClass();
            str = j62.e.g().f(new com.tencent.mm.repairer.config.multitask.RepairerConfigGlobalExpandEdgeSize());
            kotlin.jvm.internal.o.f(str, "getExptString(...)");
        } catch (java.lang.Exception unused) {
            str = null;
        }
        boolean z17 = false;
        if (str != null && !str.isEmpty()) {
            if (!com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN.equals(str)) {
                for (java.lang.String str2 : str.split(",")) {
                    if (!str2.trim().isEmpty()) {
                        if (java.lang.String.valueOf(i17).equals(str2.trim())) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallPageAdapter", "enable expand edgeSize. type: " + i17);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallPageAdapter", "disable expand edgeSize. type: " + i17);
                        }
                    }
                }
            }
            z17 = true;
            break;
        }
        this.f242180g = java.lang.Boolean.valueOf(z17);
    }

    @Override // dp1.x
    public android.graphics.Bitmap n() {
        return null;
    }

    @Override // dp1.x
    public int o() {
        if (a() != null) {
            return a().getHeight();
        }
        return 0;
    }

    @Override // dp1.x
    public boolean p() {
        return this instanceof kd2.a0;
    }

    @Override // dp1.x
    public void q(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallPageAdapter", "finish, withAnimation:%s", java.lang.Boolean.valueOf(z17));
        if (getIntent() != null) {
            if (z17) {
                getIntent().putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477848d6);
                getIntent().putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
            } else {
                getIntent().putExtra("MMActivity.OverrideExitAnimation", 0);
                getIntent().putExtra("MMActivity.OverrideEnterAnimation", 0);
            }
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // dp1.x
    public boolean r() {
        return true;
    }

    @Override // dp1.x
    public android.view.View s() {
        return null;
    }

    @Override // dp1.x
    public boolean t() {
        ((ov.p0) ((pv.j0) i95.n0.c(pv.j0.class))).getClass();
        return (j62.e.g().c(new com.tencent.mm.repairer.config.multitask.RepairerConfigSwipeToMultiTask()) == 0) && (getActivity() instanceof com.tencent.mm.ui.MMActivity) && ((com.tencent.mm.ui.MMActivity) getActivity()).getSwipeBackLayout() != null;
    }

    @Override // dp1.x
    public android.view.View u() {
        android.view.ViewGroup a17 = a();
        if (a17 == null || a17.getChildCount() <= 0) {
            return null;
        }
        return a17.getChildAt(0);
    }

    @Override // dp1.x
    public int v() {
        if (a() != null) {
            return a().getWidth();
        }
        return 0;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return false;
    }

    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallPageAdapter", "float ball onOverScrolled");
        if (!this.f242180g.booleanValue() || getActivity() == null || !(getActivity() instanceof com.tencent.mm.ui.MMActivity) || ((com.tencent.mm.ui.MMActivity) getActivity()).getSwipeBackLayout() == null) {
            return;
        }
        ((com.tencent.mm.ui.MMActivity) getActivity()).getSwipeBackLayout().setEdgeSizeAndInitEdgeTouched(this.f242182i);
    }
}
