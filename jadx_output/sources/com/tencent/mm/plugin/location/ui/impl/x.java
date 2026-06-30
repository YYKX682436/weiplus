package com.tencent.mm.plugin.location.ui.impl;

@j95.b
/* loaded from: classes13.dex */
public class x extends i95.w implements ab3.g {
    public static com.tencent.mm.plugin.location_soso.api.SoSoMapView wi(android.content.Context context) {
        com.tencent.mm.plugin.location_soso.api.SoSoMapView soSoMapView;
        boolean equalsIgnoreCase = "CN".equalsIgnoreCase((java.lang.String) gm0.j1.u().c().l(274436, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.MapFactoryImp", "chinaReg:%b", java.lang.Boolean.valueOf(equalsIgnoreCase));
        boolean z17 = !equalsIgnoreCase;
        com.tencent.mars.xlog.Log.i("MicroMsg.MapFactoryImp", "isOverseasUser:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.setAgreePrivacy(true);
        if (z17) {
            com.tencent.tencentmap.mapsdk.map.TencentMapOptions tencentMapOptions = new com.tencent.tencentmap.mapsdk.map.TencentMapOptions();
            tencentMapOptions.setServiceProtocol(1, java.lang.Integer.valueOf(com.tencent.mm.R.raw.sdk_protocol));
            soSoMapView = new com.tencent.mm.plugin.location_soso.api.SoSoMapView(context, tencentMapOptions);
        } else {
            soSoMapView = new com.tencent.mm.plugin.location_soso.api.SoSoMapView(context);
        }
        soSoMapView.setId(com.tencent.mm.R.id.ghr);
        return soSoMapView;
    }
}
