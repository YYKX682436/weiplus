package ey5;

/* loaded from: classes13.dex */
public class n implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener f257658d;

    public n(ey5.r rVar, com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f257658d = onIndoorStateChangeListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingDeactivated() {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f257658d;
        if (onIndoorStateChangeListener == null) {
            return false;
        }
        return onIndoorStateChangeListener.onIndoorBuildingDeactivated();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingFocused() {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f257658d;
        if (onIndoorStateChangeListener == null) {
            return false;
        }
        return onIndoorStateChangeListener.onIndoorBuildingFocused();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onIndoorLevelActivated(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding r7) {
        /*
            r6 = this;
            com.tencent.tencentmap.mapsdk.map.TencentMap$OnIndoorStateChangeListener r0 = r6.f257658d
            if (r0 != 0) goto L6
            r7 = 0
            return r7
        L6:
            r1 = 0
            if (r7 != 0) goto La
            goto L50
        La:
            java.util.List r2 = r7.getLevels()
            if (r2 != 0) goto L11
            goto L2d
        L11:
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel r4 = (com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel) r4
            if (r4 != 0) goto L2f
        L2d:
            r2 = r1
            goto L3c
        L2f:
            com.tencent.mapsdk.raster.model.IndoorLevel r5 = new com.tencent.mapsdk.raster.model.IndoorLevel
            java.lang.String r4 = r4.getName()
            r5.<init>(r4)
            r2.add(r5)
            goto L1f
        L3c:
            if (r2 != 0) goto L3f
            goto L50
        L3f:
            com.tencent.mapsdk.raster.model.IndoorBuilding r1 = new com.tencent.mapsdk.raster.model.IndoorBuilding
            java.lang.String r3 = r7.getBuidlingId()
            java.lang.String r4 = r7.getBuildingName()
            int r7 = r7.getActiveLevelIndex()
            r1.<init>(r3, r4, r2, r7)
        L50:
            boolean r7 = r0.onIndoorLevelActivated(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ey5.n.onIndoorLevelActivated(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding):boolean");
    }
}
