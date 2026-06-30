package m92;

/* loaded from: classes10.dex */
public class b extends dm.v3 implements java.lang.Cloneable {
    public static final l75.e0 T1 = dm.v3.initAutoDBInfo(m92.b.class);

    public b() {
    }

    @Override // dm.v3, l75.f0
    public l75.e0 getDBInfo() {
        return T1;
    }

    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public m92.b clone() {
        m92.b bVar = new m92.b();
        bVar.convertFrom(new m92.k(convertTo(), T1, null, 4, null));
        return bVar;
    }

    public java.lang.String toString() {
        java.lang.String contentValues = convertTo().toString();
        kotlin.jvm.internal.o.f(contentValues, "toString(...)");
        return contentValues;
    }

    public final r45.nc4 u0() {
        r45.nc4 nc4Var = this.field_prepareFinder;
        return nc4Var == null ? new r45.nc4() : nc4Var;
    }

    public final boolean v0() {
        return (u0().getLong(21) & 1) != 0;
    }

    public final boolean w0() {
        return ((r45.gx0) u0().getCustom(29)) != null;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo y0() {
        return (com.tencent.mm.protocal.protobuf.FinderJumpInfo) u0().getCustom(35);
    }

    public b(java.lang.String finderUsername) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.field_username = finderUsername;
    }
}
