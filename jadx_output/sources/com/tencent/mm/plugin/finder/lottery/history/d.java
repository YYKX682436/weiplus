package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes3.dex */
public final class d extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.lottery.history.n f120836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.att;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        long longExtra = getActivity().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_LIVE_ID", 0L);
        long longExtra2 = getActivity().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0L);
        java.lang.String stringExtra = getActivity().getIntent().getStringExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID");
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        int intExtra = getActivity().getIntent().getIntExtra("KEY_SCENE", 0);
        java.lang.String stringExtra2 = getActivity().getIntent().getStringExtra("KEY_LOTTERY_ID");
        java.lang.String str2 = stringExtra2 == null ? "" : stringExtra2;
        if (longExtra == 0 || longExtra2 == 0 || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            getActivity().finish();
            return;
        }
        this.f120836d = new com.tencent.mm.plugin.finder.lottery.history.n(new com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader(str2, longExtra, longExtra2, str, intExtra));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        com.tencent.mm.plugin.finder.lottery.history.n nVar = this.f120836d;
        if (nVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.lottery.history.o oVar = new com.tencent.mm.plugin.finder.lottery.history.o(mMActivity, nVar, true);
        com.tencent.mm.plugin.finder.lottery.history.n nVar2 = this.f120836d;
        if (nVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        nVar2.g(oVar);
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_SHOW_SETTING_TITLE", false);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity2).setMMTitle(booleanExtra ? com.tencent.mm.R.string.dxo : com.tencent.mm.R.string.dxl);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity3).setBackBtn(new com.tencent.mm.plugin.finder.lottery.history.c(this));
        getActivity().findViewById(com.tencent.mm.R.id.container_layout).setBackgroundColor(getActivity().getResources().getColor(com.tencent.mm.R.color.aaw));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.lottery.history.n nVar = this.f120836d;
        if (nVar != null) {
            if (nVar != null) {
                nVar.onDetach();
            } else {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
        }
    }
}
