package so2;

/* loaded from: classes.dex */
public final class z2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.q94 f410731d;

    public z2(r45.q94 liveRecord) {
        kotlin.jvm.internal.o.g(liveRecord, "liveRecord");
        this.f410731d = liveRecord;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        so2.z2 z2Var = obj instanceof so2.z2 ? (so2.z2) obj : null;
        if (z2Var == null) {
            return -1;
        }
        r45.q94 q94Var = z2Var.f410731d;
        long j17 = q94Var.getLong(4);
        r45.q94 q94Var2 = this.f410731d;
        if (j17 == q94Var2.getLong(4)) {
            return 0;
        }
        return q94Var2.getInteger(2) > q94Var.getInteger(2) ? 1 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.z2.class.hashCode();
    }
}
