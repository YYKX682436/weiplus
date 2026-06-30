package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker f144841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mapsdk.raster.model.IndoorBuilding f144842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f144843f;

    public l(com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker, com.tencent.mapsdk.raster.model.IndoorBuilding indoorBuilding, java.util.List list) {
        this.f144841d = customIndoorPicker;
        this.f144842e = indoorBuilding;
        this.f144843f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int activeLevelIndex;
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = this.f144841d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = customIndoorPicker.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int t17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).t();
        com.tencent.mapsdk.raster.model.IndoorBuilding indoorBuilding = this.f144842e;
        if (t17 < indoorBuilding.getActiveLevelIndex() || indoorBuilding.getActiveLevelIndex() <= 0) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = this.f144841d.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            activeLevelIndex = (((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).x() > indoorBuilding.getActiveLevelIndex() || indoorBuilding.getActiveLevelIndex() >= this.f144843f.size() + (-1)) ? indoorBuilding.getActiveLevelIndex() : indoorBuilding.getActiveLevelIndex() + 1;
        } else {
            activeLevelIndex = indoorBuilding.getActiveLevelIndex() - 1;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(activeLevelIndex));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(customIndoorPicker, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/CustomIndoorPicker$bind$1$onIndoorLevelActivated$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        customIndoorPicker.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(customIndoorPicker, "com/tencent/mm/plugin/location/ui/impl/CustomIndoorPicker$bind$1$onIndoorLevelActivated$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
