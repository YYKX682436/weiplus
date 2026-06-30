package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class l1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.assist.d9 f117207d;

    /* renamed from: e, reason: collision with root package name */
    public final yl2.g1 f117208e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.viewmodel.b1 f117209f;

    /* renamed from: g, reason: collision with root package name */
    public int f117210g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        yl2.g1 g1Var = new yl2.g1((com.tencent.mm.ui.MMFragmentActivity) activity, 0, 0L, 6, null);
        this.f117208e = g1Var;
        this.f117210g = 8;
        int intExtra = getIntent().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        long longExtra = getIntent().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0L);
        g1Var.f463009b = intExtra;
        g1Var.f463010c = longExtra;
    }

    public final void O6() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive");
        com.tencent.mm.plugin.finder.assist.d9 d9Var = this.f117207d;
        if (d9Var != null) {
            d9Var.b();
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        yl2.g1 g1Var = this.f117208e;
        zy2.zb.qd(zbVar, 4, g1Var.f463009b, g1Var.f463010c, null, 8, null);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.finder.live.viewmodel.g1(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b0b;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult,requestCode:");
        sb6.append(i17);
        sb6.append(",resultCode:");
        sb6.append(i18);
        sb6.append(",face verify result:");
        sb6.append(intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVerifyUIC", sb6.toString());
        if (i17 == 10002) {
            if (i18 == 1) {
                O6();
                return;
            }
            com.tencent.mm.plugin.finder.live.viewmodel.b1 b1Var = this.f117209f;
            if (b1Var != null) {
                com.tencent.mm.plugin.finder.live.viewmodel.b1.B5(b1Var, false, null, null, false, 0, 0L, 62, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        com.tencent.mm.plugin.finder.assist.d9 a17 = com.tencent.mm.plugin.finder.assist.a9.a(com.tencent.mm.plugin.finder.assist.d9.f102093f, getActivity(), getActivity().getResources().getString(com.tencent.mm.R.string.f9y), 1000L, null, 8, null);
        this.f117207d = a17;
        a17.a();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVerifyUIC", "prepare()");
        java.lang.String e17 = xy2.c.e(getContext());
        boolean z18 = false;
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(getActivity())) {
            z17 = true;
        } else {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
            u1Var.g(getActivity().getResources().getString(com.tencent.mm.R.string.dls));
            u1Var.n(getActivity().getResources().getString(com.tencent.mm.R.string.f490454vi));
            u1Var.l(new com.tencent.mm.plugin.finder.live.viewmodel.f1(this));
            u1Var.q(false);
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveVerifyUIC", "checkNetworkAvailable() network problem");
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveVerifyUIC", "prepare() checkNetworkAvailable failed");
            com.tencent.mm.plugin.finder.assist.d9 d9Var = this.f117207d;
            if (d9Var != null) {
                d9Var.b();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVerifyUIC", "checkAccountValid()");
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVerifyUIC", "checkAccountValid() need create finder contact.");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_GO_TO_AFTER_CREATE_SUCCESS", 1);
            intent.putExtra("key_router_to_profile", false);
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22385, 7, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            com.tencent.mm.plugin.finder.live.viewmodel.c1 c1Var = new com.tencent.mm.plugin.finder.live.viewmodel.c1(c0Var);
            com.tencent.mm.plugin.finder.live.viewmodel.d1 d1Var = new com.tencent.mm.plugin.finder.live.viewmodel.d1(this);
            com.tencent.mm.plugin.finder.live.viewmodel.e1 e1Var = new com.tencent.mm.plugin.finder.live.viewmodel.e1(c0Var, this);
            ((c61.p2) ybVar).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.INSTANCE.showCreateFinderUserDialogOnLiveWithCallback(context, 3, intent, 10002, c1Var, d1Var, e1Var);
        } else {
            z18 = true;
        }
        if (z18) {
            pf5.e.launchUI$default(this, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.k1(this, e17, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.e("Finder.FinderLiveVerifyUIC", "prepare() checkAccountValid failed");
        com.tencent.mm.plugin.finder.assist.d9 d9Var2 = this.f117207d;
        if (d9Var2 != null) {
            d9Var2.b();
        }
    }
}
