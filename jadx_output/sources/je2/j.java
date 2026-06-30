package je2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f299237a;

    /* renamed from: b, reason: collision with root package name */
    public r45.wq1 f299238b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f299239c;

    public j(java.lang.String id6, r45.wq1 extInfo, com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        this.f299237a = id6;
        this.f299238b = extInfo;
        this.f299239c = jumpInfo;
    }

    public final boolean a() {
        r45.k74 lite_app_info = this.f299239c.getLite_app_info();
        return lite_app_info != null && lite_app_info.getInteger(11) == 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je2.j)) {
            return false;
        }
        je2.j jVar = (je2.j) obj;
        return kotlin.jvm.internal.o.b(this.f299237a, jVar.f299237a) && kotlin.jvm.internal.o.b(this.f299238b, jVar.f299238b) && kotlin.jvm.internal.o.b(this.f299239c, jVar.f299239c);
    }

    public int hashCode() {
        return (((this.f299237a.hashCode() * 31) + this.f299238b.hashCode()) * 31) + this.f299239c.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        sb6.append(this.f299237a);
        sb6.append(',');
        sb6.append(pm0.b0.g(this.f299238b));
        sb6.append('\n');
        sb6.append(this.f299239c.getWording());
        sb6.append(",position:");
        r45.k74 lite_app_info = this.f299239c.getLite_app_info();
        sb6.append(lite_app_info != null ? java.lang.Integer.valueOf(lite_app_info.getInteger(11)) : null);
        return sb6.toString();
    }
}
