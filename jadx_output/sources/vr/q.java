package vr;

/* loaded from: classes15.dex */
public final class q implements io.flutter.plugin.platform.PlatformView {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f439420d;

    /* renamed from: e, reason: collision with root package name */
    public final int f439421e;

    /* renamed from: f, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f439422f;

    /* renamed from: g, reason: collision with root package name */
    public final vr.u f439423g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel f439424h;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(android.content.Context r8, int r9, io.flutter.plugin.common.MethodChannel r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vr.q.<init>(android.content.Context, int, io.flutter.plugin.common.MethodChannel, java.util.Map):void");
    }

    public final void a(com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel) {
        chatFooterPanel.setShowSmiley(true);
        chatFooterPanel.p(true, true);
        chatFooterPanel.o(true, true);
        chatFooterPanel.setShowStore(true);
        chatFooterPanel.setShowSearch(true);
        chatFooterPanel.setShowGame(false);
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        chatFooterPanel.setEntranceScene(0);
        chatFooterPanel.setSearchSource(0);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f439424h;
    }
}
