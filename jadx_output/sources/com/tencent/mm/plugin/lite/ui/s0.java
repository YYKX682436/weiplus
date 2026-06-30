package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes.dex */
public class s0 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI f144476b;

    public s0(com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i17) {
        this.f144476b = wxaLiteAppApiProxyUI;
        this.f144475a = i17;
    }

    @Override // r35.n3
    public void a(int i17) {
        java.util.HashMap hashMap = m93.j.f325046f;
        int i18 = this.f144475a;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i18));
        if (pVar != null) {
            pVar.d(i17);
            hashMap.remove(java.lang.Integer.valueOf(i18));
        }
        this.f144476b.finish();
    }
}
