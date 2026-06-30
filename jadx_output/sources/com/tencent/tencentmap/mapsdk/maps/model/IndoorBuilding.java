package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class IndoorBuilding implements java.lang.Cloneable {
    private int mActiveLevelIndex;
    private java.lang.String mBuidlingId;
    private java.lang.String mBuildingName;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mLatLng;
    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> mLevels;

    public IndoorBuilding(java.lang.String str, java.lang.String str2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> list, int i17) {
        this.mBuidlingId = str;
        this.mBuildingName = str2;
        this.mLatLng = latLng;
        this.mLevels = list;
        this.mActiveLevelIndex = i17;
    }

    public final java.lang.Object clone() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = (com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding) super.clone();
        if (this.mLevels != null) {
            indoorBuilding.mLevels = new java.util.ArrayList(this.mLevels.size());
            for (int i17 = 0; i17 < this.mLevels.size(); i17++) {
                indoorBuilding.mLevels.add(new com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel(this.mLevels.get(i17).getName()));
            }
        }
        if (this.mLatLng != null) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.mLatLng;
            indoorBuilding.mLatLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude);
        }
        return indoorBuilding;
    }

    public final int getActiveLevelIndex() {
        return this.mActiveLevelIndex;
    }

    public final java.lang.String getBuidlingId() {
        return this.mBuidlingId;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getBuildingLatLng() {
        return this.mLatLng;
    }

    public final java.lang.String getBuildingName() {
        return this.mBuildingName;
    }

    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> getLevels() {
        return this.mLevels;
    }

    public final java.lang.String toString() {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> list;
        if (this.mBuidlingId == null || (list = this.mLevels) == null || list.size() <= this.mActiveLevelIndex) {
            return "";
        }
        return this.mBuidlingId + "_" + this.mLevels.get(this.mActiveLevelIndex).getName();
    }
}
