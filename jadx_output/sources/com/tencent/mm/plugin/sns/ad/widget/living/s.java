package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f163760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f163761e;

    /* renamed from: f, reason: collision with root package name */
    public int f163762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f163761e = adLivingStreamContainer;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$tryDownloadBitmap$1");
        this.f163760d = obj;
        this.f163762f |= Integer.MIN_VALUE;
        java.lang.Object e17 = com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer.e(this.f163761e, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$tryDownloadBitmap$1");
        return e17;
    }
}
