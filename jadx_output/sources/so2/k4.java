package so2;

/* loaded from: classes2.dex */
public final class k4 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.bw0 f410454d;

    /* renamed from: e, reason: collision with root package name */
    public final int f410455e;

    /* renamed from: f, reason: collision with root package name */
    public int f410456f;

    public k4(r45.bw0 info, int i17, int i18) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f410454d = info;
        this.f410455e = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        so2.k4 k4Var = obj instanceof so2.k4 ? (so2.k4) obj : null;
        return (k4Var == null || !kotlin.jvm.internal.o.b(k4Var.f410454d.getString(1), this.f410454d.getString(1))) ? -1 : 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f410455e;
    }
}
