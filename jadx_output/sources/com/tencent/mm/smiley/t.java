package com.tencent.mm.smiley;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f193371a;

    /* renamed from: b, reason: collision with root package name */
    public final int f193372b;

    /* renamed from: c, reason: collision with root package name */
    public final int f193373c;

    public t(java.nio.ByteBuffer buffer, int i17, int i18) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.f193371a = buffer;
        this.f193372b = i17;
        this.f193373c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.smiley.t)) {
            return false;
        }
        com.tencent.mm.smiley.t tVar = (com.tencent.mm.smiley.t) obj;
        return kotlin.jvm.internal.o.b(this.f193371a, tVar.f193371a) && this.f193372b == tVar.f193372b && this.f193373c == tVar.f193373c;
    }

    public int hashCode() {
        return (((this.f193371a.hashCode() * 31) + java.lang.Integer.hashCode(this.f193372b)) * 31) + java.lang.Integer.hashCode(this.f193373c);
    }

    public java.lang.String toString() {
        return "ImageBuffer(buffer=" + this.f193371a + ", width=" + this.f193372b + ", height=" + this.f193373c + ')';
    }
}
