package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public interface TencentMapServiceProtocol extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component {
    public static final java.lang.String SERVICE_NAME_AUTHORIZATION = "authorization";
    public static final java.lang.String SERVICE_NAME_BLOCK_ROUTE_DATA = "blockroutedata";
    public static final java.lang.String SERVICE_NAME_INDOOR_DATA = "indoordata";
    public static final java.lang.String SERVICE_NAME_MAP_BEHAVIOUR = "map_behaviour";
    public static final java.lang.String SERVICE_NAME_MAP_DATA = "mapdata";
    public static final java.lang.String SERVICE_NAME_MAP_POI_DATA = "mappoidata";
    public static final java.lang.String SERVICE_NAME_MAP_STYLE = "mapstyle";
    public static final java.lang.String SERVICE_NAME_OFFLINE_MAP_DATA = "offlinemapdata";
    public static final java.lang.String SERVICE_NAME_OVERSEA_DATA = "overseadata";
    public static final java.lang.String SERVICE_NAME_PROMOTE_IMAGE_DATA = "promoteimagedata";
    public static final java.lang.String SERVICE_NAME_RTT_DATA = "rttdata";
    public static final java.lang.String SERVICE_NAME_SATELLITE_DATA = "satellitedata";
    public static final java.lang.String SERVICE_NAME_SKETCH_DATA = "sketchdata";
    public static final java.lang.String SERVICE_NAME_STATISTIC = "statistic";
    public static final java.lang.String SERVICE_NAME_TRAFFIC_EVENT = "trafficevent";

    /* loaded from: classes13.dex */
    public interface IMapService {
        void setAllow(boolean z17);

        void setUseHttps(boolean z17);

        void setUseTest(boolean z17);
    }

    com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.IMapService getMapService(java.lang.String str);
}
