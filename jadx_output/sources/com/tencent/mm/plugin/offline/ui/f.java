package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class f implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflineAlertView f152610a;

    public f(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView) {
        this.f152610a = offlineAlertView;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f152610a.getContext(), "http://weixin.qq.com/cgi-bin/readtemplate?t=weixin_small_pay", false);
    }
}
