package com.tencent.tencentmap.mapsdk.map;

/* loaded from: classes13.dex */
public class TencentMapOptions {
    public static final int GL_MAP_VIEW = 0;
    public static final int MAP_RENDER_LAYER = 2;
    public static final int TEXTURE_MAP_VIEW = 1;
    private java.lang.Object mExtSurface;
    private int mExtSurfaceHeight;
    private int mExtSurfaceWidth;
    private java.lang.Object mProtocolDataDesc;
    private int mProtocolFrom;
    private java.lang.String mSubId;
    private java.lang.String mSubKey;
    private com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback onAuthResultCallback;
    private int mMapType = 0;
    private boolean enableHandDrawMap = false;
    private boolean isMutipleInfowindowEnabled = false;
    private boolean enableMSAA = false;
    private boolean enableLogger = false;

    @java.lang.Deprecated
    public com.tencent.tencentmap.mapsdk.map.TencentMapOptions enableHandDrawMap(boolean z17) {
        setHandDrawMapEnable(z17);
        return this;
    }

    public boolean enableMSAA() {
        return this.enableMSAA;
    }

    public java.lang.Object getExtSurface() {
        return this.mExtSurface;
    }

    public final int getExtSurfaceHeight() {
        return this.mExtSurfaceHeight;
    }

    public final int getExtSurfaceWidth() {
        return this.mExtSurfaceWidth;
    }

    public int getMapType() {
        return this.mMapType;
    }

    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback getOnAuthResultCallback() {
        return this.onAuthResultCallback;
    }

    public final java.lang.Object getProtocolDataDesc() {
        return this.mProtocolDataDesc;
    }

    public final int getProtocolFrom() {
        return this.mProtocolFrom;
    }

    public final java.lang.String getSubId() {
        return this.mSubId;
    }

    public final java.lang.String getSubKey() {
        return this.mSubKey;
    }

    public boolean isEnableLogger() {
        return this.enableLogger;
    }

    public boolean isHandDrawMapEnable() {
        return this.enableHandDrawMap;
    }

    public boolean isMutipleInfowindowEnabled() {
        return this.isMutipleInfowindowEnabled;
    }

    public void setEnableLogger(boolean z17) {
        this.enableLogger = z17;
    }

    public void setEnableMSAA(boolean z17) {
        this.enableMSAA = z17;
    }

    public void setExtSurface(java.lang.Object obj) {
        if (!(obj instanceof android.view.Surface) && !(obj instanceof android.graphics.SurfaceTexture) && !(obj instanceof android.view.SurfaceHolder)) {
            throw new java.lang.IllegalArgumentException("Parameter Surface should be Surface,SurfaceTexture or SurfaceHolder");
        }
        this.mExtSurface = obj;
    }

    public final void setExtSurfaceDimension(int i17, int i18) {
        this.mExtSurfaceWidth = i17;
        this.mExtSurfaceHeight = i18;
    }

    public void setHandDrawMapEnable(boolean z17) {
        this.enableHandDrawMap = z17;
    }

    public void setMapType(int i17) {
        if (i17 < 0 || i17 > 2) {
            return;
        }
        this.mMapType = i17;
    }

    public void setMutipleInfowindowEnabled(boolean z17) {
        this.isMutipleInfowindowEnabled = z17;
    }

    public void setOnAuthResultCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback onAuthResultCallback) {
        this.onAuthResultCallback = onAuthResultCallback;
    }

    public final void setServiceProtocol(int i17, java.lang.Object obj) {
        this.mProtocolFrom = i17;
        this.mProtocolDataDesc = obj;
    }

    public final void setSubInfo(java.lang.String str, java.lang.String str2) {
        this.mSubId = str2;
        this.mSubKey = str;
    }
}
