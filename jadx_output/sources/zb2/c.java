package zb2;

/* loaded from: classes2.dex */
public final class c implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.pj2 f471259d;

    public c(r45.pj2 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f471259d = data;
    }

    @Override // in5.c
    public long getItemId() {
        if (((r45.ft4) this.f471259d.getCustom(0)) != null) {
            return r0.getInteger(0);
        }
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return r45.pj2.class.hashCode();
    }
}
