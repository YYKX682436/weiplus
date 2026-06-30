package so2;

/* loaded from: classes2.dex */
public class c0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oo2 f410286d;

    /* renamed from: e, reason: collision with root package name */
    public final ya2.b2 f410287e;

    public c0(r45.oo2 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f410286d = item;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) item.getCustom(3);
        this.f410287e = finderContact != null ? ya2.d.h(finderContact, null, false, 3, null) : null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        r45.xx0 xx0Var;
        r45.xx0 xx0Var2;
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof so2.c0)) {
            return -1;
        }
        r45.vx0 vx0Var = (r45.vx0) this.f410286d.getCustom(2);
        long j17 = 0;
        long j18 = (vx0Var == null || (xx0Var2 = (r45.xx0) vx0Var.getCustom(23)) == null) ? 0L : xx0Var2.getLong(2);
        r45.vx0 vx0Var2 = (r45.vx0) ((so2.c0) obj).f410286d.getCustom(2);
        if (vx0Var2 != null && (xx0Var = (r45.xx0) vx0Var2.getCustom(23)) != null) {
            j17 = xx0Var.getLong(2);
        }
        return j18 > j17 ? 1 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        r45.vx0 vx0Var = (r45.vx0) this.f410286d.getCustom(2);
        if (vx0Var != null) {
            return vx0Var.getLong(0);
        }
        return -1L;
    }

    @Override // in5.c
    public int h() {
        return -22;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("collection_info=");
        r45.oo2 oo2Var = this.f410286d;
        r45.vx0 vx0Var = (r45.vx0) oo2Var.getCustom(2);
        sb6.append(vx0Var != null ? vx0Var.toJSON() : null);
        sb6.append(",author_contact=");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) oo2Var.getCustom(3);
        sb6.append(finderContact != null ? finderContact.toJSON() : null);
        return sb6.toString();
    }
}
