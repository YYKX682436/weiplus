package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes.dex */
public class g0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI f144410e;

    public g0(com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i17) {
        this.f144410e = wxaLiteAppApiProxyUI;
        this.f144409d = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.HashMap hashMap = m93.j.f325062v;
        int i19 = this.f144409d;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i19));
        if (pVar != null) {
            pVar.m(0, i18, intent);
            hashMap.remove(java.lang.Integer.valueOf(i19));
        }
        this.f144410e.finish();
    }
}
