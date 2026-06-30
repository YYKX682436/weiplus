package qs3;

/* loaded from: classes4.dex */
public final class k implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarMemberView f366356a;

    public k(com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView) {
        this.f366356a = radarMemberView;
    }

    @Override // q80.f0
    public void fail() {
        int i17 = com.tencent.mm.plugin.radar.ui.RadarMemberView.B;
        com.tencent.mars.xlog.Log.i("MicroMsg.RadarMemberView", "OpenLiteApp fail");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView = this.f366356a;
        com.tencent.mm.storage.z3 z3Var = radarMemberView.f154986u;
        intent.putExtra("k_username", z3Var != null ? z3Var.d1() : null);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
        kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{38}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(radarMemberView.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        int i17 = com.tencent.mm.plugin.radar.ui.RadarMemberView.B;
        com.tencent.mars.xlog.Log.i("MicroMsg.RadarMemberView", "OpenLiteApp success");
    }
}
