package j91;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f298349a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f298350b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f298351c;

    public e(java.lang.String encrypted_data, java.lang.String iv6, java.lang.String cloud_id) {
        kotlin.jvm.internal.o.g(encrypted_data, "encrypted_data");
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(cloud_id, "cloud_id");
        this.f298349a = encrypted_data;
        this.f298350b = iv6;
        this.f298351c = cloud_id;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j91.e)) {
            return false;
        }
        j91.e eVar = (j91.e) obj;
        return kotlin.jvm.internal.o.b(this.f298349a, eVar.f298349a) && kotlin.jvm.internal.o.b(this.f298350b, eVar.f298350b) && kotlin.jvm.internal.o.b(this.f298351c, eVar.f298351c);
    }

    public int hashCode() {
        return (((this.f298349a.hashCode() * 31) + this.f298350b.hashCode()) * 31) + this.f298351c.hashCode();
    }

    public java.lang.String toString() {
        return "RoomInfoResponse(encrypted_data=" + this.f298349a + ", iv=" + this.f298350b + ", cloud_id=" + this.f298351c + ')';
    }
}
