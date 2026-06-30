package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes.dex */
public class m0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI f144441e;

    public m0(com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i17) {
        this.f144441e = wxaLiteAppApiProxyUI;
        this.f144440d = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19 = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.f144319d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "startActivityForResult: %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.HashMap hashMap = m93.j.f325040J;
        int i27 = this.f144440d;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i27));
        if (pVar != null) {
            pVar.f(i17, i18, intent);
            hashMap.remove(java.lang.Integer.valueOf(i27));
        }
        this.f144441e.finish();
    }
}
