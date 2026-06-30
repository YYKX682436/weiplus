package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class zl implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount f161833d;

    public zl(com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount settingsSelectCreateAccount) {
        this.f161833d = settingsSelectCreateAccount;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", ((r45.ub5) oVar.f70711b.f70700a).f387204d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            j45.l.n(this.f161833d.getContext(), "webview", ".ui.tools.WebViewUI", intent, 702);
        }
        return 0;
    }
}
