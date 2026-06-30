package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class u implements dp1.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.e0 f182623d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f182624e;

    public u(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        android.content.Intent intent = new android.content.Intent();
        this.f182624e = intent;
        this.f182623d = e0Var;
        intent.putExtras(e0Var.f406657n);
    }

    @Override // dp1.x
    public android.view.ViewGroup a() {
        return d() ? (android.view.ViewGroup) getActivity().getWindow().getDecorView() : (android.view.ViewGroup) this.f182623d.f406654h.getParent();
    }

    @Override // dp1.x
    public int b() {
        return d() ? -1 : 0;
    }

    @Override // dp1.x
    public boolean c() {
        return true;
    }

    public final boolean d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useActivityEnv: ");
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182623d;
        sb6.append(((sd.u) e0Var.f406612f).f406653a.f406663d.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageFloatBallPageAdapter", sb6.toString());
        return ((sd.u) e0Var.f406612f).f406653a.f406663d.size() <= 1;
    }

    @Override // dp1.x
    public boolean f() {
        return false;
    }

    @Override // dp1.x
    public void g(dp1.v vVar) {
    }

    @Override // dp1.x
    public android.app.Activity getActivity() {
        return (android.app.Activity) this.f182623d.f406610d;
    }

    @Override // dp1.x
    public android.graphics.Bitmap getBitmap() {
        return uj5.g.c(getContentView());
    }

    @Override // dp1.x
    public android.view.View getContentView() {
        if (!d()) {
            return ((me.imid.swipebacklayout.lib.SwipeBackLayout) this.f182623d.f406654h).getTargetView();
        }
        if (((com.tencent.mm.ui.MMActivity) getActivity()).getSwipeBackLayout() != null) {
            return ((com.tencent.mm.ui.MMActivity) getActivity()).getSwipeBackLayout().getTargetContentView();
        }
        return null;
    }

    @Override // dp1.x
    public android.content.Intent getIntent() {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182623d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(e0Var.t());
        android.content.Intent intent = this.f182624e;
        if (!K0) {
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, e0Var.t());
        }
        return intent;
    }

    @Override // dp1.x
    public android.view.View getMaskView() {
        return getContentView();
    }

    @Override // dp1.x
    public boolean h() {
        return false;
    }

    @Override // dp1.x
    public boolean i() {
        return false;
    }

    @Override // dp1.x
    public void j(dp1.w wVar) {
        if (d()) {
            db5.f.c(getActivity(), new com.tencent.mm.plugin.webview.luggage.t(this, wVar));
        } else {
            ((com.tencent.mm.plugin.ball.ui.z) wVar).a(true);
        }
    }

    @Override // dp1.x
    public boolean k() {
        return false;
    }

    @Override // dp1.x
    public void l(int i17) {
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
        return false;
    }

    @Override // dp1.x
    public void q(boolean z17) {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182623d;
        if (((sd.u) e0Var.f406612f).f406653a.f(false)) {
            return;
        }
        android.app.Activity activity = (android.app.Activity) e0Var.f406610d;
        if (z17) {
            activity.getIntent().putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477848d6);
            activity.getIntent().putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
        } else {
            activity.getIntent().putExtra("MMActivity.OverrideExitAnimation", 0);
            activity.getIntent().putExtra("MMActivity.OverrideEnterAnimation", 0);
        }
        activity.finish();
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
        return (j62.e.g().c(new com.tencent.mm.repairer.config.multitask.RepairerConfigSwipeToMultiTask()) == 0) && this.f182623d.f406654h != null;
    }

    @Override // dp1.x
    public android.view.View u() {
        return null;
    }

    @Override // dp1.x
    public int v() {
        if (a() != null) {
            return a().getWidth();
        }
        return 0;
    }
}
