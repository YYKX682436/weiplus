package zb2;

/* loaded from: classes2.dex */
public final class b implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oj2 f471258d;

    public b(r45.oj2 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f471258d = data;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f471258d.getLong(0);
    }

    @Override // in5.c
    public int h() {
        return zb2.b.class.hashCode();
    }
}
