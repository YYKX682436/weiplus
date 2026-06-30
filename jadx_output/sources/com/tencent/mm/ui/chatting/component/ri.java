package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class ri implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f199858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.si f199859b;

    public ri(com.tencent.mm.ui.chatting.component.si siVar, android.content.Intent intent) {
        this.f199859b = siVar;
        this.f199858a = intent;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.content.Intent intent2 = this.f199858a;
        intent2.removeExtra("SendAppMessageWrapper_Scene");
        if (i17 == 228) {
            com.tencent.mm.ui.chatting.component.si siVar = this.f199859b;
            if (i18 != -1) {
                com.tencent.mm.pluginsdk.model.app.m5.c(siVar.f198580d.g(), com.tencent.mm.pluginsdk.model.app.m5.a(intent2.getExtras(), 0), true, true);
                if (siVar.f198580d.g().isFinishing()) {
                    return;
                }
                siVar.f198580d.g().finish();
                return;
            }
            if (intent != null && intent.getBooleanExtra("Select_stay_in_wx", false)) {
                com.tencent.mm.pluginsdk.model.app.m5.d(false, 0);
            } else {
                if (siVar.f198580d.g().isFinishing()) {
                    return;
                }
                siVar.f198580d.g().finish();
            }
        }
    }
}
