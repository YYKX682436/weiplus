package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public final class u9 implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f165551b;

    public u9(java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f165550a = str;
        this.f165551b = qVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j9 j9Var = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9.f165823e;
        j9Var.a();
        com.tencent.mars.xlog.Log.i("AdLandingQRCodeBtnCompDelegate", "onCallback() called with: errType = " + i17 + ", errNo = " + i18 + ", obj = " + obj);
        kotlinx.coroutines.q qVar = this.f165551b;
        if (i17 == 0 && i18 == 0) {
            try {
                if (obj instanceof byte[]) {
                    r45.fm3 fm3Var = new r45.fm3();
                    fm3Var.parseFrom((byte[]) obj);
                    if (kotlin.jvm.internal.o.b(this.f165550a, fm3Var.f374443f)) {
                        j9Var.a();
                        com.tencent.mars.xlog.Log.i("AdLandingQRCodeBtnCompDelegate", "request new qr image imgUrl completed " + fm3Var.f374441d);
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(fm3Var.f374441d));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
                        return;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9.f165823e.a();
                com.tencent.mars.xlog.Log.e("AdLandingQRCodeBtnCompDelegate", th6.toString());
            }
        }
        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
    }
}
