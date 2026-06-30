package com.tencent.thumbplayer.api.composition;

/* loaded from: classes16.dex */
public interface ITPMediaDRMAsset extends com.tencent.thumbplayer.api.composition.ITPMediaAsset {
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_APPVER = "drm_property_app_ver";
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_COOKIE = "drm_property_cookie";
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_DRM_USEL1 = "drm_property_use_l1";
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_EXT_X_KEY = "drm_property_ext_x_key";
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_GUID = "drm_property_guid";
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_LICENSE_STANDARDIZATION = "drm_property_license_standardization";
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_LICENSE_URL = "drm_property_license_url";
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_PLATFORM = "drm_property_platform";
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_PROVISION_URL = "drm_property_provision_url";
    public static final java.lang.String TP_PLAYER_DRM_PROPERTY_SAVE_PATH = "drm_property_save_path";

    java.util.Map<java.lang.String, java.lang.String> getDrmAllProperties();

    java.lang.String getDrmPlayUrl();

    java.lang.String getDrmProperty(java.lang.String str, java.lang.String str2);

    @com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE
    int getDrmType();

    java.util.Map<java.lang.String, java.lang.String> getLicenseHttpHeaders();

    void setDrmPlayUrl(java.lang.String str);

    void setDrmProperty(java.lang.String str, java.lang.String str2);

    void setDrmType(@com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE int i17);

    void setLicenseHttpHeaders(java.util.Map<java.lang.String, java.lang.String> map);
}
