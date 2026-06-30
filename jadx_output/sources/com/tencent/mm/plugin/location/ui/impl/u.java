package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes13.dex */
public class u implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.w f144902a;

    public u(com.tencent.mm.plugin.location.ui.impl.w wVar) {
        this.f144902a = wVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener
    public void onMapClick(com.tencent.mapsdk.raster.model.LatLng latLng) {
        this.f144902a.l(latLng);
    }
}
