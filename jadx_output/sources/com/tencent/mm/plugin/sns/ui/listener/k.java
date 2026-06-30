package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class k implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.l f169830b;

    public k(com.tencent.mm.plugin.sns.ui.listener.l lVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f169830b = lVar;
        this.f169829a = snsInfo;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169829a;
        intent.putExtra("k_expose_msg_id", snsInfo == null ? 0L : snsInfo.field_snsId);
        intent.putExtra("k_username", snsInfo == null ? "" : snsInfo.field_userName);
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 33));
        j45.l.j(com.tencent.mm.plugin.sns.ui.listener.i.e(this.f169830b.f169835g.f169837d), "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "OpenLiteApp success");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
    }
}
