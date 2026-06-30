package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes3.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.lottery.history.g f120834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.att;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int intExtra = getActivity().getIntent().getIntExtra("KEY_LOTTERY_HISTORY_SCENE", 0);
        long longExtra = getActivity().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_LIVE_ID", 0L);
        long longExtra2 = getActivity().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0L);
        java.lang.String stringExtra = getActivity().getIntent().getStringExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getActivity().getIntent().getStringExtra("KEY_LIVE_ANCHOR_USERNAME");
        java.lang.String str = stringExtra;
        this.f120834d = new com.tencent.mm.plugin.finder.lottery.history.g(intExtra, longExtra, longExtra2, str, stringExtra2 == null ? "" : stringExtra2, getActivity().getIntent().getByteArrayExtra("KEY_LIVE_COOKIES"), getActivity().getIntent().getIntExtra("KEY_LOTTERY_HISTORY_SOURCE", 0), new com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader(intExtra, longExtra, longExtra2, str));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        com.tencent.mm.plugin.finder.lottery.history.g gVar = this.f120834d;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.lottery.history.h hVar = new com.tencent.mm.plugin.finder.lottery.history.h(mMActivity, gVar, true);
        com.tencent.mm.plugin.finder.lottery.history.g gVar2 = this.f120834d;
        if (gVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        gVar2.g(hVar);
        java.lang.String stringExtra3 = getActivity().getIntent().getStringExtra("KEY_CUSTOM_TITLE");
        java.lang.String str2 = stringExtra3 != null ? stringExtra3 : "";
        if (str2.length() > 0) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity2).setMMTitle(str2);
        } else {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity3).setMMTitle(com.tencent.mm.R.string.nuc);
        }
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        kotlin.jvm.internal.o.e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity4).setBackBtn(new com.tencent.mm.plugin.finder.lottery.history.a(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.lottery.history.g gVar = this.f120834d;
        if (gVar != null) {
            if (gVar != null) {
                gVar.onDetach();
            } else {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
        }
    }
}
