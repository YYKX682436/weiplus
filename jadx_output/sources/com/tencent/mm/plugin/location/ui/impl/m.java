package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes13.dex */
public final class m implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker f144847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.TencentMap f144848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.g f144849c;

    public m(com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker, com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap, com.tencent.mm.plugin.location.ui.impl.g gVar) {
        this.f144847a = customIndoorPicker;
        this.f144848b = tencentMap;
        this.f144849c = gVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingDeactivated() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomIndoorPicker", "onIndoorBuildingDeactivated, lat, lng(%s)", this.f144848b.getMapCenter());
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = this.f144847a;
        customIndoorPicker.f144696m2 = 0;
        customIndoorPicker.f144697n2 = null;
        customIndoorPicker.f144698o2 = null;
        customIndoorPicker.setVisibility(8);
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingFocused() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomIndoorPicker", "onIndoorBuildingFocused");
        this.f144847a.f144696m2 = 1;
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorLevelActivated(com.tencent.mapsdk.raster.model.IndoorBuilding building) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(building, "building");
        java.util.List<com.tencent.mapsdk.raster.model.IndoorLevel> levels = building.getLevels();
        java.lang.String buidlingId = building.getBuidlingId();
        final com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = this.f144847a;
        boolean equals = buidlingId.equals(customIndoorPicker.f144697n2);
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.f144848b;
        if (!equals) {
            customIndoorPicker.f144697n2 = building.getBuidlingId();
            customIndoorPicker.getClass();
            java.util.List<com.tencent.mapsdk.raster.model.IndoorLevel> levels2 = building.getLevels();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.o.d(levels2);
            for (com.tencent.mapsdk.raster.model.IndoorLevel indoorLevel : levels2) {
                kotlin.jvm.internal.o.d(indoorLevel);
                arrayList.add(new com.tencent.mm.plugin.location.ui.impl.i(customIndoorPicker, indoorLevel));
            }
            customIndoorPicker.setAdapter(new com.tencent.mm.plugin.location.ui.impl.j(arrayList, new in5.s() { // from class: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$buildItemConverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.location.ui.impl.h(com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker.this);
                }
            }));
            if (customIndoorPicker.f144699p2 <= 20.0f) {
                customIndoorPicker.setVisibility(0);
            }
            androidx.recyclerview.widget.f2 adapter = customIndoorPicker.getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker.IndoorLevelItem>");
            ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).B = new com.tencent.mm.plugin.location.ui.impl.k(tencentMap, customIndoorPicker);
        }
        if (kotlin.jvm.internal.o.b(customIndoorPicker.f144697n2, customIndoorPicker.f144694k2) && customIndoorPicker.f144698o2 == null && (str = customIndoorPicker.f144695l2) != null) {
            customIndoorPicker.f144698o2 = str;
            tencentMap.setIndoorFloor(customIndoorPicker.f144697n2, str);
        } else if (!levels.isEmpty() && building.getActiveLevelIndex() < levels.size()) {
            customIndoorPicker.f144698o2 = levels.get(building.getActiveLevelIndex()).getName();
        }
        com.tencent.mm.plugin.location.ui.impl.g gVar = this.f144849c;
        if (gVar != null) {
            gVar.onChange();
        }
        androidx.recyclerview.widget.f2 adapter2 = customIndoorPicker.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
        customIndoorPicker.postDelayed(new com.tencent.mm.plugin.location.ui.impl.l(customIndoorPicker, building, levels), 200L);
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomIndoorPicker", "onIndoorLevelActivated: %s, poiFloor:%s, lat,lng:(%s)", building, customIndoorPicker.f144698o2, tencentMap.getMapCenter());
        return false;
    }
}
