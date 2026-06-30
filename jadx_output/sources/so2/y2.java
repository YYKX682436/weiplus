package so2;

/* loaded from: classes.dex */
public final class y2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.xc5 f410724d;

    public y2(r45.xc5 prizeRecord) {
        kotlin.jvm.internal.o.g(prizeRecord, "prizeRecord");
        this.f410724d = prizeRecord;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        so2.y2 y2Var = obj instanceof so2.y2 ? (so2.y2) obj : null;
        if (y2Var == null) {
            return -1;
        }
        r45.xc5 xc5Var = y2Var.f410724d;
        java.lang.String string = xc5Var != null ? xc5Var.getString(4) : null;
        r45.xc5 xc5Var2 = this.f410724d;
        if (kotlin.jvm.internal.o.b(string, xc5Var2 != null ? xc5Var2.getString(4) : null)) {
            return 0;
        }
        return xc5Var2.getLong(1) > xc5Var.getLong(1) ? 1 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.y2.class.hashCode();
    }
}
