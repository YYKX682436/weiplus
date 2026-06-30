package qb2;

/* loaded from: classes4.dex */
public final class y1 extends dm.c5 {

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f361314p = dm.c5.initAutoDBInfo(qb2.y1.class);

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof qb2.y1) && ((qb2.y1) obj).systemRowid == this.systemRowid;
    }

    @Override // dm.c5, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f361314p;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public int hashCode() {
        return (int) this.systemRowid;
    }
}
