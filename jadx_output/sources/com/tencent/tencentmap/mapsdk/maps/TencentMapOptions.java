package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public final class TencentMapOptions {
    public static final int LOGO_POSITION_BOTTOM_CENTER = 4;
    public static final int LOGO_POSITION_BOTTOM_LEFT = 0;
    public static final int LOGO_POSITION_BOTTOM_RIGHT = 1;
    public static final int LOGO_POSITION_TOP_CENTER = 5;
    public static final int LOGO_POSITION_TOP_LEFT = 3;
    public static final int LOGO_POSITION_TOP_RIGHT = 2;
    public static final int SCALEVIEW_POSITION_BOTTOM_CENTER = 4;
    public static final int SCALEVIEW_POSITION_BOTTOM_LEFT = 0;
    public static final int SCALEVIEW_POSITION_BOTTOM_RIGHT = 1;
    public static final int SCALEVIEW_POSITION_TOP_CENTER = 5;
    public static final int SCALEVIEW_POSITION_TOP_LEFT = 3;
    public static final int SCALEVIEW_POSITION_TOP_RIGHT = 2;
    public static final int ZOOM_POSITION_BOTTOM_LEFT = 0;
    public static final int ZOOM_POSITION_BOTTOM_RIGHT = 1;
    public static final int ZOOM_POSITION_TOP_LEFT = 3;
    public static final int ZOOM_POSITION_TOP_RIGHT = 2;
    private java.lang.String customAssetsPath;
    private java.lang.String customLocalPath;
    private java.lang.String mCustomCacheRootPath;
    private java.lang.String mCustomUserId;
    private boolean mDisallowIntercept;
    private java.lang.Object mExtSurface;
    private int mExtSurfaceHeight;
    private int mExtSurfaceWidth;
    private com.tencent.map.tools.Callback<com.tencent.tencentmap.mapsdk.maps.TencentMap> mMapCallback;
    private com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.IMapKernel mMapKernel;
    private java.lang.String mMapKey;
    private com.tencent.tencentmap.mapsdk.maps.model.MapViewType mMapViewType;
    private android.os.Bundle mNetParams;
    private boolean mOfflineMapEnable;
    private com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback mOnAuthResultCallback;
    private com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback mOnMapLoadedCallback;
    private java.lang.Object mProtocolDataDesc;
    private int mProtocolFrom;
    private java.lang.String mSubId;
    private java.lang.String mSubKey;
    private com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle mTrafficStyle;
    private android.graphics.Typeface mUserTypeface;
    private boolean isHandDrawMapEnable = false;
    private boolean isEnableMultipleInfoWindow = false;
    private java.lang.String mSatelliteVersion = "0";
    private com.tencent.map.tools.net.AdapterType mNetAdapterType = com.tencent.map.tools.net.AdapterType.DEFAULT;
    private com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource mOverSeaSource = com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.DEFAULT;
    private float mMapFrameRate = 60.0f;
    private boolean mOpaque = true;
    private boolean mMSAA = false;
    private boolean mForceHttps = true;
    private int mMaxIconMemoryCacheSize = 30;
    private com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig mLoggerConfig = null;
    private final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting mMapUserSetting = new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting();

    /* loaded from: classes6.dex */
    public interface IMapKernel {
        java.lang.String name();
    }

    /* loaded from: classes13.dex */
    public static class MapUserSetting {
        private int mMaxScaleLevel = -1;
        private int mMinScaleLevel = -1;
        private int pendingMaxScaleLevel = -1;
        private int pendingMinScaleLevel = -1;

        public int getMaxScaleLevel() {
            return this.mMaxScaleLevel;
        }

        public int getMinScaleLevel() {
            return this.mMinScaleLevel;
        }

        public int getPendingMaxScaleLevel() {
            return this.pendingMaxScaleLevel;
        }

        public int getPendingMinScaleLevel() {
            return this.pendingMinScaleLevel;
        }

        public void setMaxZoomLevel(int i17) {
            this.mMaxScaleLevel = i17;
        }

        public void setMinZoomLevel(int i17) {
            this.mMinScaleLevel = i17;
        }

        public void setPendingMaxScaleLevel(int i17) {
            this.pendingMaxScaleLevel = i17;
        }

        public void setPendingMinScaleLevel(int i17) {
            this.pendingMinScaleLevel = i17;
        }
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions enableMSAA(boolean z17) {
        this.mMSAA = z17;
        return this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.class == obj.getClass()) {
            com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions = (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) obj;
            if (this.isHandDrawMapEnable != tencentMapOptions.isHandDrawMapEnable || this.mExtSurfaceWidth != tencentMapOptions.mExtSurfaceWidth || this.mExtSurfaceHeight != tencentMapOptions.mExtSurfaceHeight || this.isEnableMultipleInfoWindow != tencentMapOptions.isEnableMultipleInfoWindow || this.mProtocolFrom != tencentMapOptions.mProtocolFrom || this.mOfflineMapEnable != tencentMapOptions.mOfflineMapEnable || java.lang.Float.compare(tencentMapOptions.mMapFrameRate, this.mMapFrameRate) != 0 || this.mForceHttps != tencentMapOptions.mForceHttps) {
                return false;
            }
            java.lang.String str = this.customAssetsPath;
            if (str == null ? tencentMapOptions.customAssetsPath != null : !str.equals(tencentMapOptions.customAssetsPath)) {
                return false;
            }
            java.lang.String str2 = this.customLocalPath;
            if (str2 == null ? tencentMapOptions.customLocalPath != null : !str2.equals(tencentMapOptions.customLocalPath)) {
                return false;
            }
            java.lang.String str3 = this.mCustomCacheRootPath;
            if (str3 == null ? tencentMapOptions.mCustomCacheRootPath != null : !str3.equals(tencentMapOptions.mCustomCacheRootPath)) {
                return false;
            }
            java.lang.Object obj2 = this.mExtSurface;
            if (obj2 == null ? tencentMapOptions.mExtSurface != null : !obj2.equals(tencentMapOptions.mExtSurface)) {
                return false;
            }
            java.lang.String str4 = this.mSubId;
            if (str4 == null ? tencentMapOptions.mSubId != null : !str4.equals(tencentMapOptions.mSubId)) {
                return false;
            }
            java.lang.String str5 = this.mSubKey;
            if (str5 == null ? tencentMapOptions.mSubKey != null : !str5.equals(tencentMapOptions.mSubKey)) {
                return false;
            }
            java.lang.String str6 = this.mMapKey;
            if (str6 == null ? tencentMapOptions.mMapKey != null : !str6.equals(tencentMapOptions.mMapKey)) {
                return false;
            }
            if (!java.util.Arrays.equals(getDebugTags(), tencentMapOptions.getDebugTags())) {
                return false;
            }
            java.lang.String str7 = this.mSatelliteVersion;
            if (str7 == null ? tencentMapOptions.mSatelliteVersion != null : !str7.equals(tencentMapOptions.mSatelliteVersion)) {
                return false;
            }
            if (this.mMapViewType != tencentMapOptions.mMapViewType) {
                return false;
            }
            com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.IMapKernel iMapKernel = this.mMapKernel;
            if (iMapKernel == null ? tencentMapOptions.mMapKernel != null : !iMapKernel.equals(tencentMapOptions.mMapKernel)) {
                return false;
            }
            android.graphics.Typeface typeface = this.mUserTypeface;
            if (typeface == null ? tencentMapOptions.mUserTypeface != null : !typeface.equals(tencentMapOptions.mUserTypeface)) {
                return false;
            }
            java.lang.Object obj3 = this.mProtocolDataDesc;
            if (obj3 == null ? tencentMapOptions.mProtocolDataDesc != null : !obj3.equals(tencentMapOptions.mProtocolDataDesc)) {
                return false;
            }
            if (this.mNetAdapterType != tencentMapOptions.mNetAdapterType) {
                return false;
            }
            android.os.Bundle bundle = this.mNetParams;
            if (bundle == null ? tencentMapOptions.mNetParams != null : !bundle.equals(tencentMapOptions.mNetParams)) {
                return false;
            }
            java.lang.String str8 = this.mCustomUserId;
            if (str8 == null ? tencentMapOptions.mCustomUserId != null : !str8.equals(tencentMapOptions.mCustomUserId)) {
                return false;
            }
            com.tencent.map.tools.Callback<com.tencent.tencentmap.mapsdk.maps.TencentMap> callback = this.mMapCallback;
            if (callback == null ? tencentMapOptions.mMapCallback != null : !callback.equals(tencentMapOptions.mMapCallback)) {
                return false;
            }
            if (this.mOverSeaSource != tencentMapOptions.mOverSeaSource) {
                return false;
            }
            com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle trafficStyle = this.mTrafficStyle;
            com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle trafficStyle2 = tencentMapOptions.mTrafficStyle;
            if (trafficStyle != null) {
                return trafficStyle.equals(trafficStyle2);
            }
            if (trafficStyle2 == null) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String getCustomAssetsPath() {
        return this.customAssetsPath;
    }

    public final java.lang.String getCustomCacheRootPath() {
        return this.mCustomCacheRootPath;
    }

    public final java.lang.String getCustomLocalPath() {
        return this.customLocalPath;
    }

    public final java.lang.String getCustomUserId() {
        return this.mCustomUserId;
    }

    public final java.lang.String[] getDebugTags() {
        com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig loggerConfig = this.mLoggerConfig;
        if (loggerConfig != null) {
            return loggerConfig.getTags();
        }
        return null;
    }

    public final java.lang.Object getExtSurface() {
        return this.mExtSurface;
    }

    public final int getExtSurfaceHeight() {
        return this.mExtSurfaceHeight;
    }

    public final int getExtSurfaceWidth() {
        return this.mExtSurfaceWidth;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig getLoggerConfig() {
        return this.mLoggerConfig;
    }

    public final com.tencent.map.tools.Callback<com.tencent.tencentmap.mapsdk.maps.TencentMap> getMapAsyncCallback() {
        return this.mMapCallback;
    }

    public final float getMapFrameRate() {
        return this.mMapFrameRate;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.IMapKernel getMapKernel() {
        return this.mMapKernel;
    }

    public final java.lang.String getMapKey() {
        return this.mMapKey;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting getMapUserSetting() {
        return this.mMapUserSetting;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.MapViewType getMapViewType() {
        return this.mMapViewType;
    }

    public final int getMaxIconMemoryCacheSize() {
        return this.mMaxIconMemoryCacheSize;
    }

    public final com.tencent.map.tools.net.AdapterType getNetAdapterType() {
        return this.mNetAdapterType;
    }

    public final android.os.Bundle getNetParams() {
        return this.mNetParams;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback getOnAuthCallback() {
        return this.mOnAuthResultCallback;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback getOnMapLoadedCallback() {
        return this.mOnMapLoadedCallback;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource getOverSeaSource() {
        return this.mOverSeaSource;
    }

    public final java.lang.Object getProtocolDataDesc() {
        return this.mProtocolDataDesc;
    }

    public final int getProtocolFrom() {
        return this.mProtocolFrom;
    }

    public final java.lang.String getSatelliteVersion() {
        return this.mSatelliteVersion;
    }

    public final java.lang.String getSubId() {
        return this.mSubId;
    }

    public final java.lang.String getSubKey() {
        return this.mSubKey;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle getTrafficStyle() {
        return this.mTrafficStyle;
    }

    public final android.graphics.Typeface getTypeface() {
        return this.mUserTypeface;
    }

    public final int hashCode() {
        java.lang.String str = this.customAssetsPath;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.customLocalPath;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.mCustomCacheRootPath;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isHandDrawMapEnable ? 1 : 0)) * 31;
        java.lang.Object obj = this.mExtSurface;
        int hashCode4 = (((((hashCode3 + (obj != null ? obj.hashCode() : 0)) * 31) + this.mExtSurfaceWidth) * 31) + this.mExtSurfaceHeight) * 31;
        java.lang.String str4 = this.mSubId;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        java.lang.String str5 = this.mSubKey;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        java.lang.String str6 = this.mMapKey;
        int hashCode7 = (((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + (this.isEnableMultipleInfoWindow ? 1 : 0)) * 31) + java.util.Arrays.hashCode(getDebugTags())) * 31;
        java.lang.String str7 = this.mSatelliteVersion;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        com.tencent.tencentmap.mapsdk.maps.model.MapViewType mapViewType = this.mMapViewType;
        int hashCode9 = (hashCode8 + (mapViewType != null ? mapViewType.hashCode() : 0)) * 31;
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.IMapKernel iMapKernel = this.mMapKernel;
        int hashCode10 = (hashCode9 + (iMapKernel != null ? iMapKernel.hashCode() : 0)) * 31;
        android.graphics.Typeface typeface = this.mUserTypeface;
        int hashCode11 = (((hashCode10 + (typeface != null ? typeface.hashCode() : 0)) * 31) + this.mProtocolFrom) * 31;
        java.lang.Object obj2 = this.mProtocolDataDesc;
        int hashCode12 = (hashCode11 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        com.tencent.map.tools.net.AdapterType adapterType = this.mNetAdapterType;
        int hashCode13 = (hashCode12 + (adapterType != null ? adapterType.hashCode() : 0)) * 31;
        android.os.Bundle bundle = this.mNetParams;
        int hashCode14 = (hashCode13 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        java.lang.String str8 = this.mCustomUserId;
        int hashCode15 = (hashCode14 + (str8 != null ? str8.hashCode() : 0)) * 31;
        com.tencent.map.tools.Callback<com.tencent.tencentmap.mapsdk.maps.TencentMap> callback = this.mMapCallback;
        int hashCode16 = (((hashCode15 + (callback != null ? callback.hashCode() : 0)) * 31) + (this.mOfflineMapEnable ? 1 : 0)) * 31;
        com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource = this.mOverSeaSource;
        int hashCode17 = (hashCode16 + (overSeaSource != null ? overSeaSource.hashCode() : 0)) * 31;
        com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle trafficStyle = this.mTrafficStyle;
        int hashCode18 = (hashCode17 + (trafficStyle != null ? trafficStyle.hashCode() : 0)) * 31;
        float f17 = this.mMapFrameRate;
        return ((hashCode18 + (f17 != 0.0f ? java.lang.Float.floatToIntBits(f17) : 0)) * 31) + (this.mForceHttps ? 1 : 0);
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions initLogger(com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig loggerConfig) {
        this.mLoggerConfig = loggerConfig;
        return this;
    }

    public final boolean isDisallowInterceptTouchEvent() {
        return this.mDisallowIntercept;
    }

    public final boolean isForceHttps() {
        return this.mForceHttps;
    }

    public final boolean isHandDrawMapEnable() {
        return this.isHandDrawMapEnable;
    }

    public final boolean isMSAA() {
        return this.mMSAA;
    }

    public final boolean isMultipleInfoWindowEnable() {
        return this.isEnableMultipleInfoWindow;
    }

    public final boolean isOfflineMapEnable() {
        return this.mOfflineMapEnable;
    }

    public final boolean isOpaque() {
        return this.mOpaque;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions openDebugLogByTags(java.lang.String... strArr) {
        initLogger(com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.newBuilder().toFile(false).toConsole(false).level(2).tags(strArr).logCallback(null).build());
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setCustomAssetsPath(java.lang.String str) {
        this.customAssetsPath = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setCustomCacheRootPath(java.lang.String str) {
        this.mCustomCacheRootPath = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setCustomLocalPath(java.lang.String str) {
        this.customLocalPath = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setCustomUserID(java.lang.String str) {
        this.mCustomUserId = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setDisallowInterceptTouchEvent(boolean z17) {
        this.mDisallowIntercept = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setExtSurface(java.lang.Object obj) {
        if (!(obj instanceof android.view.Surface) && !(obj instanceof android.graphics.SurfaceTexture) && !(obj instanceof android.view.SurfaceHolder)) {
            throw new java.lang.IllegalArgumentException("Parameter Surface should be Surface,SurfaceTexture or SurfaceHolder");
        }
        this.mExtSurface = obj;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setExtSurfaceDimension(int i17, int i18) {
        this.mExtSurfaceWidth = i17;
        this.mExtSurfaceHeight = i18;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setForceHttps(boolean z17) {
        this.mForceHttps = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setGetMapAsync(com.tencent.map.tools.Callback<com.tencent.tencentmap.mapsdk.maps.TencentMap> callback) {
        this.mMapCallback = callback;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setHandDrawMapEnable(boolean z17) {
        this.isHandDrawMapEnable = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setMapFrameRate(float f17) {
        this.mMapFrameRate = f17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setMapKernel(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.IMapKernel iMapKernel) {
        this.mMapKernel = iMapKernel;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setMapKey(java.lang.String str) {
        this.mMapKey = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setMapViewType(com.tencent.tencentmap.mapsdk.maps.model.MapViewType mapViewType) {
        this.mMapViewType = mapViewType;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setMaxIconMemoryCacheSize(int i17) {
        this.mMaxIconMemoryCacheSize = i17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setMultipleInfoWindowEnable(boolean z17) {
        this.isEnableMultipleInfoWindow = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setNetAdapter(com.tencent.map.tools.net.AdapterType adapterType, android.os.Bundle bundle) {
        this.mNetAdapterType = adapterType;
        this.mNetParams = bundle;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setOfflineMapEnable(boolean z17) {
        this.mOfflineMapEnable = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setOnAuthCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback onAuthResultCallback) {
        this.mOnAuthResultCallback = onAuthResultCallback;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setOnMapLoadedCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.mOnMapLoadedCallback = onMapLoadedCallback;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setOpaque(boolean z17) {
        this.mOpaque = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setOverSeaSource(com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource) {
        this.mOverSeaSource = overSeaSource;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setSatelliteVersion(java.lang.String str) {
        this.mSatelliteVersion = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setServiceProtocol(int i17, java.lang.Object obj) {
        this.mProtocolFrom = i17;
        this.mProtocolDataDesc = obj;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setSubInfo(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            this.mSubKey = str.trim();
        } else {
            this.mSubKey = "";
        }
        if (str2 != null) {
            this.mSubId = str2.trim();
        } else {
            this.mSubId = "";
        }
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setTrafficStyle(com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle trafficStyle) {
        this.mTrafficStyle = trafficStyle;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions setTypeface(android.graphics.Typeface typeface) {
        setTypeface(typeface, false);
        return this;
    }

    public final java.lang.String toString() {
        return "TencentMapOptions{customAssetsPath='" + this.customAssetsPath + "', customLocalPath='" + this.customLocalPath + "', mCustomCacheRootPath='" + this.mCustomCacheRootPath + "', isHandDrawMapEnable=" + this.isHandDrawMapEnable + ", mExtSurface=" + this.mExtSurface + ", mExtSurfaceWidth=" + this.mExtSurfaceWidth + ", mExtSurfaceHeight=" + this.mExtSurfaceHeight + ", mSubId='" + this.mSubId + "', mSubKey='" + this.mSubKey + "', mMapKey='" + this.mMapKey + "', isEnableMultipleInfoWindow=" + this.isEnableMultipleInfoWindow + ", mTags=" + java.util.Arrays.toString(getDebugTags()) + ", mSatelliteVersion='" + this.mSatelliteVersion + "', mMapViewType=" + this.mMapViewType + ", mMapKernel=" + this.mMapKernel + ", mUserTypeface=" + this.mUserTypeface + ", mProtocolFrom=" + this.mProtocolFrom + ", mProtocolDataDesc=" + this.mProtocolDataDesc + ", mNetAdapterType=" + this.mNetAdapterType + ", mNetParams=" + this.mNetParams + ", mCustomUserId='" + this.mCustomUserId + "', mMapCallback=" + this.mMapCallback + ", mOfflineMapEnable=" + this.mOfflineMapEnable + ", mOverSeaSource=" + this.mOverSeaSource + ", mTrafficStyle=" + this.mTrafficStyle + ", mMapFrameRate=" + this.mMapFrameRate + ", mForceHttps=" + this.mForceHttps + ", mDisallowIntercept=" + this.mDisallowIntercept + '}';
    }

    private void setTypeface(android.graphics.Typeface typeface, boolean z17) {
        if (typeface == null) {
            return;
        }
        if (z17) {
            try {
                java.lang.reflect.Field declaredField = android.graphics.Typeface.class.getDeclaredField(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN);
                declaredField.setAccessible(true);
                declaredField.set(android.graphics.Typeface.DEFAULT, typeface);
                return;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
                return;
            }
        }
        this.mUserTypeface = typeface;
    }
}
