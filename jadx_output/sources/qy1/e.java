package qy1;

/* loaded from: classes13.dex */
public final class e extends dm.v1 {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f367724v = dm.v1.initAutoDBInfo(qy1.e.class);

    @Override // dm.v1, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f367724v;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public java.lang.String toString() {
        r45.uc4 uc4Var = new r45.uc4();
        uc4Var.parseFrom(this.field_itemInfo);
        return this.field_localItemReportId + '_' + uc4Var.f387218e.f383313d.f381603e + '_' + uc4Var.f387218e.f383314e;
    }
}
