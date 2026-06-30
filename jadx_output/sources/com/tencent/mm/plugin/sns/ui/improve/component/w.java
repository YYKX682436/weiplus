package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class w implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f169039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC f169041c;

    public w(long j17, java.lang.String str, com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC improveEventUIC) {
        this.f169039a = j17;
        this.f169040b = str;
        this.f169041c = improveEventUIC;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$handleFeedReport$1");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("k_expose_msg_id", this.f169039a);
        intent.putExtra("k_username", this.f169040b);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
        kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(this.f169041c.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$handleFeedReport$1");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$handleFeedReport$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.EventUIC", "OpenLiteApp success");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$handleFeedReport$1");
    }
}
