package te2;

/* loaded from: classes3.dex */
public final class b3 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f417894d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter f417895e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f417894d = "FinderLiveChargeAnchorIncomeUIC";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488873ap4;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str = this.f417894d;
        com.tencent.mars.xlog.Log.i(str, "onCreate");
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).setSelfNavigationBarVisible(8);
        }
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
        long longExtra = getActivity().getIntent().getLongExtra("KEY_LIVE_ID", 0L);
        long longExtra2 = getActivity().getIntent().getLongExtra("KEY_OBJECT_ID", 0L);
        java.lang.String stringExtra = getActivity().getIntent().getStringExtra("KEY_OBJECT_NONCE_ID");
        java.lang.String str2 = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = getActivity().getIntent().getStringExtra("KEY_SESSION_ID");
        java.lang.String str3 = stringExtra2 != null ? stringExtra2 : "";
        boolean booleanExtra = getActivity().getIntent().getBooleanExtra("KEY_IF_USE_NEW_VALUE", false);
        if (longExtra == 0 || longExtra2 == 0 || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e(str, "onCreate: error parameter liveId = " + longExtra + ", objectId = " + longExtra2 + ", objectNonceId = " + str2 + ", sessionId:" + str3);
            getActivity().finish();
            return;
        }
        this.f417895e = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter(new com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader(longExtra, longExtra2, str2, 1, java.lang.Boolean.valueOf(booleanExtra)));
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity2;
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter presenter = this.f417895e;
        if (presenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.ViewCallback viewCallback = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.ViewCallback(mMActivity, presenter);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter presenter2 = this.f417895e;
        if (presenter2 != null) {
            presenter2.c(viewCallback);
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f417894d, "onDestroy");
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter presenter = this.f417895e;
        if (presenter != null) {
            if (presenter != null) {
                presenter.onDetach();
            } else {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
        }
    }
}
