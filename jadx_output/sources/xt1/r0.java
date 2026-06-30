package xt1;

/* loaded from: classes4.dex */
public class r0 extends dm.c9 {

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f456565p = dm.c9.initAutoDBInfo(xt1.r0.class);

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof xt1.r0) && this.field_cardUserId == ((xt1.r0) obj).field_cardUserId;
    }

    @Override // dm.c9, l75.f0
    public l75.e0 getDBInfo() {
        return f456565p;
    }

    public int hashCode() {
        java.lang.String str = this.field_cardUserId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
