package xj5;

/* loaded from: classes8.dex */
public final class f extends xj5.a {

    /* renamed from: u, reason: collision with root package name */
    public final oo0.a f454902u;

    public f(oo0.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f454902u = data;
        this.f454897e = 2;
    }

    @Override // xj5.a
    public java.util.Map a() {
        return kz5.b1.e(new jz5.l("group_live_id", java.lang.Long.valueOf(((oo0.d) this.f454902u).field_liveId)));
    }

    @Override // xj5.a
    public int c() {
        return 5;
    }

    @Override // in5.c
    public long getItemId() {
        return ((oo0.d) this.f454902u).field_liveId;
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f454891p;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.f other = (xj5.f) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return (int) (((oo0.d) this.f454902u).field_timeStamp - ((oo0.d) other.f454902u).field_timeStamp);
    }
}
