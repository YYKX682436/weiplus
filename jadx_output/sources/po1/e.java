package po1;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final po1.g f357303a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.w f357304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f357305c;

    public e(po1.g unifyType, com.tencent.wechat.aff.affroam.w affType, int i17) {
        kotlin.jvm.internal.o.g(unifyType, "unifyType");
        kotlin.jvm.internal.o.g(affType, "affType");
        this.f357303a = unifyType;
        this.f357304b = affType;
        this.f357305c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po1.e)) {
            return false;
        }
        po1.e eVar = (po1.e) obj;
        return this.f357303a == eVar.f357303a && this.f357304b == eVar.f357304b && this.f357305c == eVar.f357305c;
    }

    public int hashCode() {
        return (((this.f357303a.hashCode() * 31) + this.f357304b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f357305c);
    }

    public java.lang.String toString() {
        return "MappingType(unifyType=" + this.f357303a + ", affType=" + this.f357304b + ", productType=" + this.f357305c + ')';
    }
}
