package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class l extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.p0 f152662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflineAlertView f152663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, at4.p0 p0Var) {
        super(false);
        this.f152663e = offlineAlertView;
        this.f152662d = p0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f152663e.a();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18930, java.lang.Integer.valueOf(this.f152662d.f13918a), 2);
    }
}
