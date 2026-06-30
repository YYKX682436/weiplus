package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public final class s9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f165498d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f165499e;

    /* renamed from: f, reason: collision with root package name */
    public int f165500f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f165501g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9 f165502h;

    /* renamed from: i, reason: collision with root package name */
    public int f165503i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9 x9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f165502h = x9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$1");
        this.f165501g = obj;
        this.f165503i |= Integer.MIN_VALUE;
        java.lang.Object b17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9.b(this.f165502h, null, null, null, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$1");
        return b17;
    }
}
