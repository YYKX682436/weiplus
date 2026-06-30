package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI f144404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI) {
        super(2);
        this.f144404d = wxaLiteAppSheetUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        float abs = java.lang.Math.abs(floatValue);
        float abs2 = java.lang.Math.abs(floatValue2);
        boolean z17 = true;
        boolean z18 = abs > abs2;
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = this.f144404d.f144355f;
        if (wxaLiteAppFragment.f46072y || ((z18 && wxaLiteAppFragment.f46073z) || (!z18 && !wxaLiteAppFragment.A))) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
