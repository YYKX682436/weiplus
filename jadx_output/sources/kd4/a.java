package kd4;

/* loaded from: classes4.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsJumpReportEvent f306875a;

    public a(com.tencent.mm.autogen.events.SnsJumpReportEvent snsJumpReportEvent) {
        this.f306875a = snsJumpReportEvent;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1$callback$1");
        android.content.Intent intent = new android.content.Intent();
        am.dw dwVar = this.f306875a.f54821g;
        long j17 = dwVar.f6504b;
        java.lang.String str = dwVar.f6503a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineItemClickEventCenter", "expose id " + j17 + ' ' + str);
        intent.putExtra("k_expose_msg_id", j17);
        intent.putExtra("k_username", str);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
        kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        kd4.b.a();
        j45.l.j(null, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1$callback$1");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1$callback$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineItemClickEventCenter", "OpenLiteApp success");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1$callback$1");
    }
}
