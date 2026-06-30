package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes.dex */
public class x0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI f144497b;

    public x0(com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i17) {
        this.f144497b = wxaLiteAppApiProxyUI;
        this.f144496a = i17;
    }

    @Override // com.tencent.mm.ui.zc
    public void a(int i17, android.content.Intent intent) {
        java.util.HashMap hashMap = m93.j.f325060t;
        int i18 = this.f144496a;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i18));
        if (pVar != null) {
            pVar.g(0, i17, intent);
            hashMap.remove(java.lang.Integer.valueOf(i18));
        }
        this.f144497b.finish();
    }
}
