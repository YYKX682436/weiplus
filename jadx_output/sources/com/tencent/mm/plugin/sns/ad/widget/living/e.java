package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f163701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f163702e;

    /* renamed from: f, reason: collision with root package name */
    public int f163703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f163702e = adLivingStreamContainer;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$1");
        this.f163701d = obj;
        this.f163703f |= Integer.MIN_VALUE;
        java.lang.Object a17 = com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer.a(this.f163702e, null, null, 0, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$1");
        return a17;
    }
}
