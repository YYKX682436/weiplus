package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes13.dex */
public final class n implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker f144853a;

    public n(com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker) {
        this.f144853a = customIndoorPicker;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener
    public void onScaleViewChanged(float f17) {
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = this.f144853a;
        customIndoorPicker.f144699p2 = f17;
        if (f17 > 20.0f || customIndoorPicker.f144697n2 == null || customIndoorPicker.f144698o2 == null) {
            customIndoorPicker.setVisibility(8);
        } else {
            customIndoorPicker.setVisibility(0);
        }
    }
}
