package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface MarkerGroup {
    void addMarker(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);

    void addMarkerById(java.lang.String str);

    void addMarkerList(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Marker> list);

    void clear();

    boolean containMarker(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);

    boolean containMarkerById(java.lang.String str);

    com.tencent.tencentmap.mapsdk.maps.model.Marker findMarkerById(java.lang.String str);

    java.lang.String getId();

    java.util.List<java.lang.String> getMarkerIdList();

    java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Marker> getMarkerList();

    boolean removeMarker(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);

    boolean removeMarkerById(java.lang.String str);

    void setMarkerGroupOnTapMapBubblesHidden(boolean z17);

    void setMarkerGroupOnTapMapInfoWindowHidden(boolean z17);

    boolean setMarkerOnTapMapBubblesHidden(com.tencent.tencentmap.mapsdk.maps.model.Marker marker, boolean z17);

    boolean setOnTapMapBubblesHiddenById(java.lang.String str, boolean z17);

    boolean updateMarkerOptionById(java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions);
}
