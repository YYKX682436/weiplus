package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes.dex */
public class w0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI f144493e;

    public w0(com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i17, int i18) {
        this.f144493e = wxaLiteAppApiProxyUI;
        this.f144492d = i18;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3345) {
            java.util.HashMap hashMap = m93.j.f325058r;
            int i19 = this.f144492d;
            com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i19));
            if (pVar != null) {
                pVar.t();
                hashMap.remove(java.lang.Integer.valueOf(i19));
            }
            this.f144493e.finish();
        }
    }
}
