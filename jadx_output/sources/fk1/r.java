package fk1;

/* loaded from: classes8.dex */
public final class r implements com.tencent.mm.pluginsdk.ui.span.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263288a;

    public r(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263288a = wAGameRecordShareUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.w
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263288a;
        java.lang.String str2 = wAGameRecordShareUI.f90183f.f323303a;
        java.lang.String format = java.lang.String.format("https://game.weixin.qq.com/cgi-bin/h5/static/gamelife/localvideo.html?wechat_pkgid=gamelife_localvideo&wechat_immersive=1&immersivePageBgIsDark=1&tab_type=1&sub_tab_type=1&ssid=30&s_uia=1004&s_pid=2&s_cid=%s&game_tab_key=%s", java.util.Arrays.copyOf(new java.lang.Object[]{str2, str2}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.T6(wAGameRecordShareUI, format);
    }
}
