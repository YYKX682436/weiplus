package com.tencent.tav.coremedia;

/* loaded from: classes14.dex */
public class CGRect implements java.lang.Cloneable {
    public final android.graphics.PointF origin;
    public final com.tencent.tav.coremedia.CGSize size;

    public CGRect(float f17, float f18, float f19, float f27) {
        this(new android.graphics.PointF(f17, f18), new com.tencent.tav.coremedia.CGSize(f19, f27));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.tencent.tav.coremedia.CGRect cGRect = (com.tencent.tav.coremedia.CGRect) obj;
        return this.origin.equals(cGRect.origin) && this.size.equals(cGRect.size);
    }

    public java.lang.String toString() {
        return "[" + this.origin + "," + this.size + "]";
    }

    public CGRect(android.graphics.PointF pointF, com.tencent.tav.coremedia.CGSize cGSize) {
        pointF = pointF == null ? new android.graphics.PointF() : pointF;
        cGSize = cGSize == null ? new com.tencent.tav.coremedia.CGSize() : cGSize;
        this.origin = pointF;
        this.size = cGSize;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tav.coremedia.CGRect m411clone() {
        android.graphics.PointF pointF = this.origin;
        float f17 = pointF.x;
        float f18 = pointF.y;
        com.tencent.tav.coremedia.CGSize cGSize = this.size;
        return new com.tencent.tav.coremedia.CGRect(f17, f18, cGSize.width, cGSize.height);
    }

    public CGRect() {
        this.origin = new android.graphics.PointF();
        this.size = new com.tencent.tav.coremedia.CGSize();
    }
}
