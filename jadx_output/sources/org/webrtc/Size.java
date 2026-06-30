package org.webrtc;

/* loaded from: classes14.dex */
public class Size {
    public int height;
    public int width;

    public Size(int i17, int i18) {
        this.width = i17;
        this.height = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.webrtc.Size)) {
            return false;
        }
        org.webrtc.Size size = (org.webrtc.Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public java.lang.String toString() {
        return this.width + "x" + this.height;
    }
}
