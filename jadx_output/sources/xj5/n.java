package xj5;

/* loaded from: classes5.dex */
public final class n extends xj5.a {

    /* renamed from: w, reason: collision with root package name */
    public static final xj5.m f454914w = new xj5.m(null);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.storage.db f454915u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f454916v;

    public n(com.tencent.mm.storage.db record, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(record, "record");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f454915u = record;
        this.f454916v = msgInfo;
    }

    @Override // xj5.a
    public java.util.Map a() {
        return kz5.c1.m(kz5.b1.e(new jz5.l("group_msg_top_item_id", java.lang.Integer.valueOf(this.f454915u.u0()))), f454914w.a(this.f454916v));
    }

    @Override // xj5.a
    public int c() {
        return 8;
    }

    @Override // xj5.a
    public boolean d(xj5.a aVar) {
        xj5.n other = (xj5.n) aVar;
        kotlin.jvm.internal.o.g(other, "other");
        com.tencent.mm.storage.db dbVar = this.f454915u;
        int u07 = dbVar.u0();
        com.tencent.mm.storage.db dbVar2 = other.f454915u;
        return u07 == dbVar2.u0() && kotlin.jvm.internal.o.b(dbVar.t0(), dbVar2.t0());
    }

    @Override // in5.c
    public long getItemId() {
        return this.f454915u.u0();
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f454887i;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.n other = (xj5.n) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f454915u.u0() - other.f454915u.u0();
    }
}
