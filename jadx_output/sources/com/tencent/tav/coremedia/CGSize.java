package com.tencent.tav.coremedia;

/* loaded from: classes14.dex */
public class CGSize implements java.lang.Cloneable {
    public static final com.tencent.tav.coremedia.CGSize CGSizeZero = new com.tencent.tav.coremedia.CGSize(0.0f, 0.0f);
    public float height;
    public float width;

    public CGSize(float f17, float f18) {
        this.width = f17;
        this.height = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.tav.coremedia.CGSize)) {
            return false;
        }
        com.tencent.tav.coremedia.CGSize cGSize = (com.tencent.tav.coremedia.CGSize) obj;
        return cGSize.width == this.width && cGSize.height == this.height;
    }

    public java.lang.String toString() {
        return "[" + this.width + "," + this.height + "]";
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tav.coremedia.CGSize m412clone() {
        return new com.tencent.tav.coremedia.CGSize(this.width, this.height);
    }

    public CGSize() {
        this(1.0f, 1.0f);
    }
}
