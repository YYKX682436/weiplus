package so2;

/* loaded from: classes2.dex */
public final class a0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.cc1 f410244d;

    /* renamed from: e, reason: collision with root package name */
    public final ya2.b2 f410245e;

    /* renamed from: f, reason: collision with root package name */
    public final long f410246f;

    public a0(r45.cc1 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f410244d = item;
        this.f410246f = c01.id.c();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) item.getCustom(3);
        this.f410245e = finderContact != null ? ya2.d.h(finderContact, null, false, 3, null) : null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof so2.a0) {
            so2.a0 a0Var = (so2.a0) obj;
            if (a0Var.getItemId() == getItemId()) {
                return 0;
            }
            if (this.f410246f > a0Var.f410246f) {
                return 1;
            }
        }
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        r45.vx0 vx0Var = (r45.vx0) this.f410244d.getCustom(2);
        if (vx0Var != null) {
            return vx0Var.getLong(0);
        }
        return -1L;
    }

    @Override // in5.c
    public int h() {
        return 10002;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("time=");
        r45.cc1 cc1Var = this.f410244d;
        sb6.append(cc1Var.getLong(4));
        sb6.append(",collection_info=");
        r45.vx0 vx0Var = (r45.vx0) cc1Var.getCustom(2);
        sb6.append(vx0Var != null ? vx0Var.toJSON() : null);
        sb6.append(",author_contact=");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) cc1Var.getCustom(3);
        sb6.append(finderContact != null ? finderContact.toJSON() : null);
        return sb6.toString();
    }
}
