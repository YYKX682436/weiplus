package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class MarkerOptions {
    private boolean bFlat;
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDesctor;
    private boolean boDragable;
    private boolean boInfoWindowEnable;
    private boolean boVisible;
    private java.lang.String contentDescription;
    private float fAlpha;
    private float fAngle;
    private float fanchorU;
    private float fanchorV;
    private int iLevel;
    private boolean mClockwise;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[] mCollisions;
    private int mIconLooperDuration;
    private boolean mIconLooperEnable;
    private com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo mIndoorInfo;
    private float mInfowindowAnchorU;
    private float mInfowindowAnchorV;
    private int mInfowindowOffsetX;
    private int mInfowindowOffsetY;
    private boolean mIsFastLoad;
    private boolean mIsViewInfowindow;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerType mMarkerType;
    private java.lang.Object mTag;
    private java.lang.String mText;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle mTextStyle;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mlatlng;
    private java.lang.String strSnippet;
    private java.lang.String strtitle;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation thisCollisionRelation;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[] thisInfoWindowCollisions;
    private float zIndex;

    public MarkerOptions(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.strtitle = "";
        this.fAngle = 0.0f;
        this.fAlpha = 1.0f;
        this.zIndex = 0.0f;
        this.boInfoWindowEnable = true;
        this.bFlat = false;
        this.mClockwise = true;
        this.mInfowindowAnchorU = 0.5f;
        this.mInfowindowAnchorV = 1.0f;
        this.mInfowindowOffsetX = 0;
        this.mInfowindowOffsetY = 0;
        this.mIsFastLoad = true;
        this.mIsViewInfowindow = false;
        this.iLevel = 2;
        this.mIconLooperDuration = 500;
        this.mCollisions = new com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[0];
        this.thisCollisionRelation = com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.ALONE;
        this.mMarkerType = com.tencent.tencentmap.mapsdk.maps.model.MarkerType.ICON_MARKER;
        this.fanchorU = 0.5f;
        this.fanchorV = 0.5f;
        this.boVisible = true;
        this.mlatlng = latLng;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions alpha(float f17) {
        this.fAlpha = f17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions anchor(float f17, float f18) {
        this.fanchorU = f17;
        this.fanchorV = f18;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions clockwise(boolean z17) {
        this.mClockwise = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions collisionBy(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem... markerCollisionItemArr) {
        this.mCollisions = markerCollisionItemArr;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions contentDescription(java.lang.String str) {
        this.contentDescription = str;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions draggable(boolean z17) {
        this.boDragable = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions fastLoad(boolean z17) {
        this.mIsFastLoad = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions flat(boolean z17) {
        this.bFlat = z17;
        return this;
    }

    public float getAlpha() {
        return this.fAlpha;
    }

    public float getAnchorU() {
        return this.fanchorU;
    }

    public float getAnchorV() {
        return this.fanchorV;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation getCollisionRelation() {
        return this.thisCollisionRelation;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[] getCollisions() {
        return this.mCollisions;
    }

    public java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor getIcon() {
        return this.bitmapDesctor;
    }

    public int getIconLooperDuration() {
        return this.mIconLooperDuration;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo getIndoorInfo() {
        return this.mIndoorInfo;
    }

    public float getInfoWindowAnchorU() {
        return this.mInfowindowAnchorU;
    }

    public float getInfoWindowAnchorV() {
        return this.mInfowindowAnchorV;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[] getInfoWindowCollisions() {
        return this.thisInfoWindowCollisions;
    }

    public int getInfoWindowOffsetX() {
        return this.mInfowindowOffsetX;
    }

    public int getInfowindowOffsetY() {
        return this.mInfowindowOffsetY;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerType getMarkerType() {
        return this.mMarkerType;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition() {
        return this.mlatlng;
    }

    public float getRotation() {
        return this.fAngle;
    }

    public java.lang.String getSnippet() {
        return this.strSnippet;
    }

    public java.lang.Object getTag() {
        return this.mTag;
    }

    public java.lang.String getText() {
        return this.mText;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle getTextStyle() {
        return this.mTextStyle;
    }

    public java.lang.String getTitle() {
        return this.strtitle;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions icon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.bitmapDesctor = bitmapDescriptor;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions iconLooper(boolean z17) {
        this.mIconLooperEnable = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions indoorInfo(com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo indoorInfo) {
        this.mIndoorInfo = indoorInfo;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions infoWindowAnchor(float f17, float f18) {
        this.mInfowindowAnchorU = f17;
        this.mInfowindowAnchorV = f18;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions infoWindowCollisionBy(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem... markerCollisionItemArr) {
        this.thisInfoWindowCollisions = markerCollisionItemArr;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions infoWindowEnable(boolean z17) {
        this.boInfoWindowEnable = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions infoWindowOffset(int i17, int i18) {
        this.mInfowindowOffsetX = i17;
        this.mInfowindowOffsetY = i18;
        return this;
    }

    public boolean isClockwise() {
        return this.mClockwise;
    }

    public boolean isDraggable() {
        return this.boDragable;
    }

    public boolean isFastLoad() {
        return this.mIsFastLoad;
    }

    public boolean isFlat() {
        return this.bFlat;
    }

    public boolean isIconLooperEnable() {
        return this.mIconLooperEnable;
    }

    public boolean isInfoWindowEnable() {
        return this.boInfoWindowEnable;
    }

    public boolean isViewInfowindow() {
        return this.mIsViewInfowindow;
    }

    public boolean isVisible() {
        return this.boVisible;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions level(int i17) {
        if (i17 >= 0 && i17 <= 2) {
            this.iLevel = i17;
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerType(com.tencent.tencentmap.mapsdk.maps.model.MarkerType markerType) {
        if (markerType != null) {
            this.mMarkerType = markerType;
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions position(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mlatlng = latLng;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions rotation(float f17) {
        this.fAngle = f17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions setCollisionRelation(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation markerCollisionRelation) {
        this.thisCollisionRelation = markerCollisionRelation;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions snippet(java.lang.String str) {
        this.strSnippet = str;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions tag(java.lang.Object obj) {
        this.mTag = obj;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions text(java.lang.String str) {
        this.mText = str;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions textStyle(com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle markerTextStyle) {
        this.mTextStyle = markerTextStyle;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions title(java.lang.String str) {
        this.strtitle = str;
        return this;
    }

    public java.lang.String toString() {
        return "MarkerOptions{mlatlng=" + this.mlatlng + ", strtitle='" + this.strtitle + "', strSnippet='" + this.strSnippet + "', bitmapDesctor=" + this.bitmapDesctor + ", fanchorU=" + this.fanchorU + ", fanchorV=" + this.fanchorV + ", boDragable=" + this.boDragable + ", boVisible=" + this.boVisible + ", fAngle=" + this.fAngle + ", fAlpha=" + this.fAlpha + ", zIndex=" + this.zIndex + ", mTag=" + this.mTag + ", contentDescription='" + this.contentDescription + "', mIndoorInfo=" + this.mIndoorInfo + ", boInfoWindowEnable=" + this.boInfoWindowEnable + ", bFlat=" + this.bFlat + ", mClockwise=" + this.mClockwise + ", mInfowindowAnchorU=" + this.mInfowindowAnchorU + ", mInfowindowAnchorV=" + this.mInfowindowAnchorV + ", mInfowindowOffsetX=" + this.mInfowindowOffsetX + ", mInfowindowOffsetY=" + this.mInfowindowOffsetY + ", mIsFastLoad=" + this.mIsFastLoad + ", mIsViewInfowindow=" + this.mIsViewInfowindow + ", iLevel=" + this.iLevel + ", mIconLooperEnable=" + this.mIconLooperEnable + ", mIconLooperDuration=" + this.mIconLooperDuration + ", mCollisions=" + java.util.Arrays.toString(this.mCollisions) + ", thisInfoWindowCollisions=" + java.util.Arrays.toString(this.thisInfoWindowCollisions) + ", thisCollisionRelation=" + this.thisCollisionRelation + ", mMarkerType=" + this.mMarkerType + ", mText='" + this.mText + "', mTextStyle=" + this.mTextStyle + '}';
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions viewInfoWindow(boolean z17) {
        this.mIsViewInfowindow = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions visible(boolean z17) {
        this.boVisible = z17;
        return this;
    }

    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng;
        if (parcel == null || (latLng = this.mlatlng) == null) {
            return;
        }
        parcel.writeString(latLng.toString());
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions zIndex(float f17) {
        this.zIndex = f17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions iconLooper(boolean z17, int i17) {
        this.mIconLooperEnable = z17;
        this.mIconLooperDuration = i17;
        return this;
    }

    @java.lang.Deprecated
    public MarkerOptions() {
        this.strtitle = "";
        this.fAngle = 0.0f;
        this.fAlpha = 1.0f;
        this.zIndex = 0.0f;
        this.boInfoWindowEnable = true;
        this.bFlat = false;
        this.mClockwise = true;
        this.mInfowindowAnchorU = 0.5f;
        this.mInfowindowAnchorV = 1.0f;
        this.mInfowindowOffsetX = 0;
        this.mInfowindowOffsetY = 0;
        this.mIsFastLoad = true;
        this.mIsViewInfowindow = false;
        this.iLevel = 2;
        this.mIconLooperDuration = 500;
        this.mCollisions = new com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[0];
        this.thisCollisionRelation = com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.ALONE;
        this.mMarkerType = com.tencent.tencentmap.mapsdk.maps.model.MarkerType.ICON_MARKER;
        this.fanchorU = 0.5f;
        this.fanchorV = 0.5f;
        this.boVisible = true;
    }
}
