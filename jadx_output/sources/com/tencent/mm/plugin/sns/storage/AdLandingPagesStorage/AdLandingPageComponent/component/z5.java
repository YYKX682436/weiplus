package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public final class z5 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 implements java.io.Serializable {
    public final android.content.Context B;
    public final ab4.t0 C;
    public kotlinx.coroutines.y0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(android.content.Context context, ab4.t0 mBtnInfo, android.view.ViewGroup viewGroup) {
        super(context, mBtnInfo, viewGroup);
        kotlin.jvm.internal.o.g(mBtnInfo, "mBtnInfo");
        this.B = context;
        this.C = mBtnInfo;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
        super.L();
        kotlinx.coroutines.y0 y0Var = this.D;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
        kotlinx.coroutines.y0 y0Var = this.D;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.D = kotlinx.coroutines.z0.b();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, 0);
        java.lang.String str2 = this.C.f2892z1;
        java.lang.String str3 = str2 == null ? "" : str2;
        this.f165386t.b("jumpKefuUrl", str3);
        android.content.Context context = this.B;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
            return;
        }
        ab4.n0 u17 = u();
        java.lang.String o17 = u17 != null ? u17.o() : null;
        if (o17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageJumpKefuBtnComp", "uxinfo is null!");
            str = "";
        } else {
            str = o17;
        }
        kotlinx.coroutines.y0 y0Var2 = this.D;
        if (y0Var2 != null) {
            kotlinx.coroutines.l.d(y0Var2, null, null, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y5(context, str3, str, this, null), 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
    }
}
