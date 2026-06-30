package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class PolylineOptions {
    private static final int LINE_DEFAULT_WIDTH = 9;
    private static final int LINE_UNINITIALIZED_WIDTH = -1;

    @java.lang.Deprecated
    private static java.lang.String sDefaultArrowTexture;
    private boolean boArraw;
    private float fBorderWidth;
    private com.tencent.tencentmap.mapsdk.maps.model.Animation initAnimation;
    private boolean mGradientEnable;
    private com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo mIndoorInfo;
    private com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text mText;
    private java.util.List<java.lang.Integer> pattern;
    private static final int COLOR_DEFAULT_POLYLINE = android.graphics.Color.argb(200, 0, 163, 255);
    private static java.lang.String sDefaultColorTexture = com.tencent.mapsdk.internal.fy.f49508i;
    private boolean boIsAbove = false;
    private int[] iColors = null;
    private int[] iBorderColors = {-16711936};
    private int[] iIndexs = null;
    private int eraseColor = -7829368;
    private int lineType = 0;
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor mCustomeColorTexture = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromAsset(sDefaultColorTexture);
    private boolean mAboveMaskLayer = false;
    private boolean mIsRoad = true;
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor mArrowTexture = null;
    private boolean mClickable = true;
    private com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType colorType = com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_NONE;
    private int iLevel = 0;

    @java.lang.Deprecated
    private java.lang.String strCustomerTextName = sDefaultColorTexture;
    private int mArrowSpacing = 150;
    private float fwidth = -1.0f;
    private int iStrokeColor = COLOR_DEFAULT_POLYLINE;
    private boolean boVisible = true;
    private boolean boIsGeodes = false;
    private final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> listLatLngs = new java.util.ArrayList();
    private float alpha = 1.0f;
    private boolean lineCap = true;
    private int fIndex = 0;

    /* loaded from: classes6.dex */
    public enum ColorType {
        LINE_COLOR_NONE,
        LINE_COLOR_TEXTURE,
        LINE_COLOR_ARGB
    }

    /* loaded from: classes13.dex */
    public static final class Colors {
        public static final int DARK_BLUE = 6;
        public static final int DASHED = 33;
        public static final int GRAYBLUE = 8;
        public static final int GREEN = 4;
        public static final int GREY = 0;
        public static final int LAST_BLUE = 20;
        public static final int LIGHT_BLUE = 1;
        public static final int LIVER_RED = 9;
        public static final int MID_BLUE = 5;
        public static final int RED = 2;
        public static final int TRANSPARENT = 7;
        public static final int WHITE_BLUE = 19;
        public static final int YELLOW = 3;
    }

    /* loaded from: classes6.dex */
    public static final class LineType {
        public static final int LINE_TYPE_DOTTEDLINE = 2;
        public static final int LINE_TYPE_IMAGEINARYLINE = 1;
        public static final int LINE_TYPE_MULTICOLORLINE = 0;
    }

    /* loaded from: classes13.dex */
    public static final class SegmentText {
        private final int endIndex;
        private final int startIndex;
        private final java.lang.String text;

        public SegmentText(int i17, int i18, java.lang.String str) {
            this.startIndex = i17;
            this.endIndex = i18;
            this.text = str;
        }

        public final int getEndIndex() {
            return this.endIndex;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final java.lang.String getText() {
            return this.text;
        }
    }

    /* loaded from: classes13.dex */
    public static final class Text {
        private com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text.Builder mBuilder;
        private final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.SegmentText> mSegmentTexts;

        public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.TextPriority getPriority() {
            return this.mBuilder.priority;
        }

        public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.SegmentText> getSegmentTexts() {
            return this.mSegmentTexts;
        }

        public final int getStrokeColor() {
            return this.mBuilder.strokeColor;
        }

        public final int getTextColor() {
            return this.mBuilder.textColor;
        }

        public final int getTextSize() {
            return this.mBuilder.textSize;
        }

        public final void setPriority(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.TextPriority textPriority) {
            this.mBuilder.priority = textPriority;
        }

        public final void setStrokeColor(int i17) {
            this.mBuilder.strokeColor = i17;
        }

        public final void setTextColor(int i17) {
            this.mBuilder.textColor = i17;
        }

        public final void setTextSize(int i17) {
            this.mBuilder.textSize = i17;
        }

        private Text(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text.Builder builder) {
            this.mSegmentTexts = java.util.Collections.unmodifiableList(builder.mTexts);
            this.mBuilder = builder;
        }

        /* loaded from: classes13.dex */
        public static final class Builder {
            private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.SegmentText> mTexts = new java.util.ArrayList();
            private int textColor = -16777216;
            private int strokeColor = -1;
            private int textSize = 14;
            private com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.TextPriority priority = com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.TextPriority.HIGH;

            public Builder(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.SegmentText segmentText) {
                addSegmentText(segmentText);
            }

            public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text.Builder addAllSegmentText(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.SegmentText> list) {
                this.mTexts.addAll(list);
                return this;
            }

            public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text.Builder addSegmentText(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.SegmentText segmentText) {
                this.mTexts.add(segmentText);
                return this;
            }

            public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text build() {
                return new com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text(this);
            }

            public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text.Builder color(int i17) {
                this.textColor = i17;
                return this;
            }

            public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text.Builder priority(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.TextPriority textPriority) {
                this.priority = textPriority;
                return this;
            }

            public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text.Builder size(int i17) {
                this.textSize = i17;
                return this;
            }

            public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text.Builder strokeColor(int i17) {
                this.strokeColor = i17;
                return this;
            }

            public Builder(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.SegmentText> list) {
                addAllSegmentText(list);
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum TextPriority {
        NORMAL,
        HIGH
    }

    private com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions geodesic(boolean z17) {
        this.boIsGeodes = z17;
        return this;
    }

    @java.lang.Deprecated
    public static java.lang.String getsDefaultArrowTexture() {
        return sDefaultArrowTexture;
    }

    private boolean isGeodesic() {
        return this.boIsGeodes;
    }

    @java.lang.Deprecated
    public static void setDefaultArrowTexture(java.lang.String str) {
        sDefaultArrowTexture = str;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions aboveMaskLayer(boolean z17) {
        this.mAboveMaskLayer = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions abovePillar(boolean z17) {
        this.boIsAbove = z17;
        if (this.mIndoorInfo != null) {
            this.boIsAbove = true;
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions add(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng... latLngArr) {
        this.listLatLngs.add(latLng);
        if (latLngArr != null) {
            add(latLngArr);
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions addAll(java.lang.Iterable<com.tencent.tencentmap.mapsdk.maps.model.LatLng> iterable) {
        if (iterable != null) {
            java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next(), new com.tencent.tencentmap.mapsdk.maps.model.LatLng[0]);
            }
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions alpha(float f17) {
        this.alpha = f17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions animation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        this.initAnimation = animation;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions arrow(boolean z17) {
        this.boArraw = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions arrowSpacing(int i17) {
        this.mArrowSpacing = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions arrowTexture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.mArrowTexture = bitmapDescriptor;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions borderColor(int i17) {
        this.iBorderColors = new int[]{i17};
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions borderColors(int[] iArr) {
        this.iBorderColors = iArr;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions borderWidth(float f17) {
        if (f17 < 0.0f) {
            this.fBorderWidth = 1.0f;
        } else {
            this.fBorderWidth = f17;
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions clickable(boolean z17) {
        this.mClickable = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions color(int i17) {
        this.iStrokeColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions colorTexture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.mCustomeColorTexture = bitmapDescriptor;
        this.colorType = com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions colorType(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType colorType) {
        this.colorType = colorType;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions colors(int[] iArr, int[] iArr2) {
        this.iColors = iArr;
        this.iIndexs = iArr2;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions eraseColor(int i17) {
        this.eraseColor = i17;
        return this;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.Animation getAnimation() {
        return this.initAnimation;
    }

    public int getArrowSpacing() {
        return this.mArrowSpacing;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor getArrowTexture() {
        return this.mArrowTexture;
    }

    public int[] getBorderColors() {
        return this.iBorderColors;
    }

    public float getBorderWidth() {
        return this.fBorderWidth;
    }

    public int getColor() {
        return this.iStrokeColor;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor getColorTexture() {
        return this.mCustomeColorTexture;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType getColorType() {
        return this.colorType;
    }

    public int[][] getColors() {
        int[] iArr;
        int[] iArr2 = this.iColors;
        if (iArr2 == null || (iArr = this.iIndexs) == null) {
            return null;
        }
        int[][] iArr3 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 2, java.lang.Math.max(iArr2.length, iArr.length));
        iArr3[0] = this.iColors;
        iArr3[1] = this.iIndexs;
        return iArr3;
    }

    public int getEraseColor() {
        return this.eraseColor;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo getIndoorInfo() {
        return this.mIndoorInfo;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public boolean getLineCap() {
        return this.lineCap;
    }

    public int getLineType() {
        return this.lineType;
    }

    public java.util.List<java.lang.Integer> getPattern() {
        return this.pattern;
    }

    public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getPoints() {
        return this.listLatLngs;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text getText() {
        return this.mText;
    }

    @java.lang.Deprecated
    public java.lang.String getTextureName() {
        return this.strCustomerTextName;
    }

    public float getWidth() {
        return this.fwidth;
    }

    public int getZIndex() {
        return this.fIndex;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions gradient(boolean z17) {
        this.mGradientEnable = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions indoorInfo(com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo indoorInfo) {
        if (indoorInfo != null) {
            this.mIndoorInfo = indoorInfo;
            this.boIsAbove = true;
        }
        return this;
    }

    public boolean isAboveMaskLayer() {
        return this.mAboveMaskLayer;
    }

    public boolean isAbovePillar() {
        return this.boIsAbove;
    }

    public boolean isArrow() {
        return this.boArraw;
    }

    public boolean isClickable() {
        return this.mClickable;
    }

    public boolean isGradientEnable() {
        return this.mGradientEnable;
    }

    public boolean isRoad() {
        return this.mIsRoad;
    }

    public boolean isVisible() {
        return this.boVisible;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions latLngs(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        if (list != null) {
            this.listLatLngs.clear();
            this.listLatLngs.addAll(list);
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions level(int i17) {
        if (i17 >= 0 && i17 <= 2) {
            this.iLevel = i17;
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions lineCap(boolean z17) {
        this.lineCap = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions lineType(int i17) {
        this.lineType = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions pattern(java.util.List<java.lang.Integer> list) {
        this.pattern = list;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions road(boolean z17) {
        this.mIsRoad = z17;
        return this;
    }

    @java.lang.Deprecated
    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions setColorTexture(java.lang.String str) {
        this.strCustomerTextName = str;
        return colorTexture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromAsset(str));
    }

    @java.lang.Deprecated
    public void setColors(int[] iArr, int[] iArr2) {
        this.iColors = iArr;
        this.iIndexs = iArr2;
    }

    @java.lang.Deprecated
    public void setLatLngs(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        latLngs(list);
    }

    @java.lang.Deprecated
    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions setLineType(int i17) {
        return lineType(i17);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions text(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
        this.mText = text;
        return this;
    }

    public java.lang.String toString() {
        return "PolylineOptions{listLatLngs=" + this.listLatLngs + ", fwidth=" + this.fwidth + ", fBorderWidth=" + this.fBorderWidth + ", iStrokeColor=" + this.iStrokeColor + ", fIndex=" + this.fIndex + ", boVisible=" + this.boVisible + ", boIsGeodes=" + this.boIsGeodes + ", boArraw=" + this.boArraw + ", boIsAbove=" + this.boIsAbove + ", alpha=" + this.alpha + ", lineCap=" + this.lineCap + ", initAnimation=" + this.initAnimation + ", pattern=" + this.pattern + ", iColors=" + java.util.Arrays.toString(this.iColors) + ", iBorderColors=" + java.util.Arrays.toString(this.iBorderColors) + ", iIndexs=" + java.util.Arrays.toString(this.iIndexs) + ", eraseColor=" + this.eraseColor + ", lineType=" + this.lineType + ", mCustomeColorTexture=" + this.mCustomeColorTexture + ", mAboveMaskLayer=" + this.mAboveMaskLayer + ", mIsRoad=" + this.mIsRoad + ", mArrowTexture=" + this.mArrowTexture + ", mClickable=" + this.mClickable + ", colorType=" + this.colorType + ", mIndoorInfo=" + this.mIndoorInfo + ", iLevel=" + this.iLevel + ", mText=" + this.mText + ", strCustomerTextName='" + this.strCustomerTextName + "', mGradientEnable=" + this.mGradientEnable + ", mArrowSpacing=" + this.mArrowSpacing + '}';
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions updatePoints(java.lang.Iterable<com.tencent.tencentmap.mapsdk.maps.model.LatLng> iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (iterable != null) {
            java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        this.listLatLngs.clear();
        addAll(arrayList);
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions visible(boolean z17) {
        this.boVisible = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions width(float f17) {
        if (f17 < 0.0f) {
            this.fwidth = 9.0f;
        } else {
            if (f17 > 128.0f) {
                f17 = 128.0f;
            }
            this.fwidth = f17;
        }
        return this;
    }

    public void writeToParcel(android.os.Parcel parcel, int i17) {
        if (parcel == null) {
            return;
        }
        parcel.writeFloat(this.fwidth);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions zIndex(int i17) {
        this.fIndex = java.lang.Math.max(0, i17);
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions add(com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr) {
        if (latLngArr != null) {
            this.listLatLngs.addAll(java.util.Arrays.asList(latLngArr));
        }
        return this;
    }
}
