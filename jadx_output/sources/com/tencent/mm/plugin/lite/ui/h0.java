package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes.dex */
public class h0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI f144415e;

    public h0(com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i17) {
        this.f144415e = wxaLiteAppApiProxyUI;
        this.f144414d = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19 = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.f144319d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "startActivityForResult: %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.HashMap hashMap = m93.j.f325064x;
        int i27 = this.f144414d;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i27));
        if (pVar != null) {
            pVar.w(i17, i18, intent);
            hashMap.remove(java.lang.Integer.valueOf(i27));
        }
        this.f144415e.finish();
    }
}
