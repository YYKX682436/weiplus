package so2;

/* loaded from: classes.dex */
public final class j0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.zx0 f410438d;

    public j0(r45.zx0 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f410438d = info;
    }

    public final java.lang.Long a() {
        r45.vx0 vx0Var = (r45.vx0) this.f410438d.getCustom(0);
        if (vx0Var != null) {
            return java.lang.Long.valueOf(vx0Var.getLong(0));
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        r45.vx0 vx0Var;
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof so2.j0) || (vx0Var = (r45.vx0) this.f410438d.getCustom(0)) == null) {
            return -1;
        }
        long j17 = vx0Var.getLong(0);
        r45.vx0 vx0Var2 = (r45.vx0) ((so2.j0) obj).f410438d.getCustom(0);
        return kotlin.jvm.internal.o.j(j17, vx0Var2 != null ? vx0Var2.getLong(0) : 0L);
    }

    @Override // in5.c
    public long getItemId() {
        r45.vx0 vx0Var = (r45.vx0) this.f410438d.getCustom(0);
        if (vx0Var != null) {
            return vx0Var.getLong(0);
        }
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return so2.j0.class.getName().hashCode();
    }
}
