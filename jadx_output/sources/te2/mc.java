package te2;

/* loaded from: classes3.dex */
public final class mc extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter f418239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b1y;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
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
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = getActivity().getIntent().getStringExtra("KEY_SESSION_ID");
        java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
        boolean booleanExtra = getActivity().getIntent().getBooleanExtra("KEY_IF_USE_NEW_VALUE", false);
        if (longExtra == 0 || longExtra2 == 0 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e(pf5.o.TAG, "onCreate: error parameter liveId = " + longExtra + ", objectId = " + longExtra2 + ", objectNonceId = " + str + ", sessionId:" + str2);
            getActivity().finish();
            return;
        }
        this.f418239d = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter(new com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader(longExtra, longExtra2, str, 0, java.lang.Boolean.valueOf(booleanExtra)));
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity2;
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter presenter = this.f418239d;
        if (presenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback viewCallback = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback(mMActivity, presenter);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter presenter2 = this.f418239d;
        if (presenter2 != null) {
            presenter2.c(viewCallback);
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter presenter = this.f418239d;
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
