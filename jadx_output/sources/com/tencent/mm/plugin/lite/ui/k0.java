package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes.dex */
public class k0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI f144429e;

    public k0(com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i17) {
        this.f144429e = wxaLiteAppApiProxyUI;
        this.f144428d = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        m93.j.e(this.f144428d, 0, i18, intent);
        this.f144429e.finish();
    }
}
