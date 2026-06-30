package zn1;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f474483a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f474484b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f474485c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f474486d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f474487e;

    public z(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5) {
        this.f474483a = num;
        this.f474484b = num2;
        this.f474485c = num3;
        this.f474486d = num4;
        this.f474487e = num5;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1.z)) {
            return false;
        }
        zn1.z zVar = (zn1.z) obj;
        return kotlin.jvm.internal.o.b(this.f474483a, zVar.f474483a) && kotlin.jvm.internal.o.b(this.f474484b, zVar.f474484b) && kotlin.jvm.internal.o.b(this.f474485c, zVar.f474485c) && kotlin.jvm.internal.o.b(this.f474486d, zVar.f474486d) && kotlin.jvm.internal.o.b(this.f474487e, zVar.f474487e);
    }

    public int hashCode() {
        java.lang.Integer num = this.f474483a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f474484b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f474485c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Integer num4 = this.f474486d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.Integer num5 = this.f474487e;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "UsbDeviceInfo(vendorId=" + this.f474483a + ", productId=" + this.f474484b + ", clazz=" + this.f474485c + ", subClass=" + this.f474486d + ", protocol=" + this.f474487e + ')';
    }
}
