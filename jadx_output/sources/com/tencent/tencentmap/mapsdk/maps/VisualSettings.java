package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public interface VisualSettings {
    com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus executeVisualLayerSettings(com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction baseCommandFunction);

    void setAmbientLight(com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, float f17);

    void setSpotOrDirectionalLight(com.tencent.tencentmap.mapsdk.maps.model.LightType lightType, com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, com.tencent.tencentmap.mapsdk.maps.model.LightDirection lightDirection, float f17);
}
