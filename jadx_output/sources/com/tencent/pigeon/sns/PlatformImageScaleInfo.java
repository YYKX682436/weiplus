package com.tencent.pigeon.sns;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006%"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformImageScaleInfo;", "", "imageViewWidth", "", "imageViewHeight", "contentOffsetX", "contentOffsetY", "scale", "translationX", "translationY", "(DDDDDDD)V", "getContentOffsetX", "()D", "getContentOffsetY", "getImageViewHeight", "getImageViewWidth", "getScale", "getTranslationX", "getTranslationY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlatformImageScaleInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.sns.PlatformImageScaleInfo.Companion INSTANCE = new com.tencent.pigeon.sns.PlatformImageScaleInfo.Companion(null);
    private final double contentOffsetX;
    private final double contentOffsetY;
    private final double imageViewHeight;
    private final double imageViewWidth;
    private final double scale;
    private final double translationX;
    private final double translationY;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformImageScaleInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/sns/PlatformImageScaleInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.sns.PlatformImageScaleInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue = ((java.lang.Double) obj).doubleValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue2 = ((java.lang.Double) obj2).doubleValue();
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue3 = ((java.lang.Double) obj3).doubleValue();
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue4 = ((java.lang.Double) obj4).doubleValue();
            java.lang.Object obj5 = list.get(4);
            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue5 = ((java.lang.Double) obj5).doubleValue();
            java.lang.Object obj6 = list.get(5);
            kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue6 = ((java.lang.Double) obj6).doubleValue();
            java.lang.Object obj7 = list.get(6);
            kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.Double");
            return new com.tencent.pigeon.sns.PlatformImageScaleInfo(doubleValue, doubleValue2, doubleValue3, doubleValue4, doubleValue5, doubleValue6, ((java.lang.Double) obj7).doubleValue());
        }
    }

    public PlatformImageScaleInfo(double d17, double d18, double d19, double d27, double d28, double d29, double d37) {
        this.imageViewWidth = d17;
        this.imageViewHeight = d18;
        this.contentOffsetX = d19;
        this.contentOffsetY = d27;
        this.scale = d28;
        this.translationX = d29;
        this.translationY = d37;
    }

    /* renamed from: component1, reason: from getter */
    public final double getImageViewWidth() {
        return this.imageViewWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final double getImageViewHeight() {
        return this.imageViewHeight;
    }

    /* renamed from: component3, reason: from getter */
    public final double getContentOffsetX() {
        return this.contentOffsetX;
    }

    /* renamed from: component4, reason: from getter */
    public final double getContentOffsetY() {
        return this.contentOffsetY;
    }

    /* renamed from: component5, reason: from getter */
    public final double getScale() {
        return this.scale;
    }

    /* renamed from: component6, reason: from getter */
    public final double getTranslationX() {
        return this.translationX;
    }

    /* renamed from: component7, reason: from getter */
    public final double getTranslationY() {
        return this.translationY;
    }

    public final com.tencent.pigeon.sns.PlatformImageScaleInfo copy(double imageViewWidth, double imageViewHeight, double contentOffsetX, double contentOffsetY, double scale, double translationX, double translationY) {
        return new com.tencent.pigeon.sns.PlatformImageScaleInfo(imageViewWidth, imageViewHeight, contentOffsetX, contentOffsetY, scale, translationX, translationY);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.sns.PlatformImageScaleInfo)) {
            return false;
        }
        com.tencent.pigeon.sns.PlatformImageScaleInfo platformImageScaleInfo = (com.tencent.pigeon.sns.PlatformImageScaleInfo) other;
        return java.lang.Double.compare(this.imageViewWidth, platformImageScaleInfo.imageViewWidth) == 0 && java.lang.Double.compare(this.imageViewHeight, platformImageScaleInfo.imageViewHeight) == 0 && java.lang.Double.compare(this.contentOffsetX, platformImageScaleInfo.contentOffsetX) == 0 && java.lang.Double.compare(this.contentOffsetY, platformImageScaleInfo.contentOffsetY) == 0 && java.lang.Double.compare(this.scale, platformImageScaleInfo.scale) == 0 && java.lang.Double.compare(this.translationX, platformImageScaleInfo.translationX) == 0 && java.lang.Double.compare(this.translationY, platformImageScaleInfo.translationY) == 0;
    }

    public final double getContentOffsetX() {
        return this.contentOffsetX;
    }

    public final double getContentOffsetY() {
        return this.contentOffsetY;
    }

    public final double getImageViewHeight() {
        return this.imageViewHeight;
    }

    public final double getImageViewWidth() {
        return this.imageViewWidth;
    }

    public final double getScale() {
        return this.scale;
    }

    public final double getTranslationX() {
        return this.translationX;
    }

    public final double getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return (((((((((((java.lang.Double.hashCode(this.imageViewWidth) * 31) + java.lang.Double.hashCode(this.imageViewHeight)) * 31) + java.lang.Double.hashCode(this.contentOffsetX)) * 31) + java.lang.Double.hashCode(this.contentOffsetY)) * 31) + java.lang.Double.hashCode(this.scale)) * 31) + java.lang.Double.hashCode(this.translationX)) * 31) + java.lang.Double.hashCode(this.translationY);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Double.valueOf(this.imageViewWidth), java.lang.Double.valueOf(this.imageViewHeight), java.lang.Double.valueOf(this.contentOffsetX), java.lang.Double.valueOf(this.contentOffsetY), java.lang.Double.valueOf(this.scale), java.lang.Double.valueOf(this.translationX), java.lang.Double.valueOf(this.translationY));
    }

    public java.lang.String toString() {
        return "PlatformImageScaleInfo(imageViewWidth=" + this.imageViewWidth + ", imageViewHeight=" + this.imageViewHeight + ", contentOffsetX=" + this.contentOffsetX + ", contentOffsetY=" + this.contentOffsetY + ", scale=" + this.scale + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ')';
    }
}
