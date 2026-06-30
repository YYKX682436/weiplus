package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes13.dex */
public class v implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.w f144906a;

    public v(com.tencent.mm.plugin.location.ui.impl.w wVar) {
        this.f144906a = wVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener
    public void onClicked(com.tencent.mapsdk.raster.model.MapPoi mapPoi) {
        this.f144906a.l(mapPoi.getPosition());
    }
}
