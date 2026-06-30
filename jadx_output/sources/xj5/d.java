package xj5;

/* loaded from: classes8.dex */
public final class d extends xj5.a {

    /* renamed from: u, reason: collision with root package name */
    public final dm.s4 f454901u;

    public d(dm.s4 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f454901u = data;
    }

    @Override // xj5.a
    public int c() {
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f454901u.field_liveId;
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f454890o;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.d other = (xj5.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return (int) (this.f454901u.field_timeStamp - other.f454901u.field_timeStamp);
    }
}
