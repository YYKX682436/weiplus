package fk1;

/* loaded from: classes8.dex */
public final class q implements com.tencent.mm.pluginsdk.ui.span.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263287a;

    public q(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263287a = wAGameRecordShareUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.w
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263287a;
        java.lang.String format = java.lang.String.format("https://game.weixin.qq.com/cgi-bin/h5/static/gamelife/homepage.html?wechat_pkgid=gamelife_homepage&wechat_immersive=1&immersivePageBgIsDark=1&immersiveUIStyle=1&ssid=30&&s_uia=1004&s_pid=3&s_cid=%s", java.util.Arrays.copyOf(new java.lang.Object[]{wAGameRecordShareUI.f90183f.f323303a}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.T6(wAGameRecordShareUI, format);
    }
}
