package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes13.dex */
public final class k implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.TencentMap f144835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker f144836e;

    public k(com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap, com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker) {
        this.f144835d = tencentMap;
        this.f144836e = customIndoorPicker;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        com.tencent.mm.plugin.location.ui.impl.i data = (com.tencent.mm.plugin.location.ui.impl.i) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        this.f144835d.setIndoorFloor(i17);
        super.g(itemView, data, i17);
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = this.f144836e;
        customIndoorPicker.setClickTimes(customIndoorPicker.getClickTimes() + 1);
    }
}
