package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes.dex */
public class l0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI f144433e;

    public l0(com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i17) {
        this.f144433e = wxaLiteAppApiProxyUI;
        this.f144432d = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19 = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.f144319d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "startActivityForResult: %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.HashMap hashMap = m93.j.H;
        int i27 = this.f144432d;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i27));
        if (pVar != null) {
            pVar.q(i17, i18, intent);
            hashMap.remove(java.lang.Integer.valueOf(i27));
        }
        this.f144433e.finish();
    }
}
