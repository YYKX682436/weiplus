package va;

/* loaded from: classes16.dex */
public final class s extends va.m {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.ref.ReferenceQueue f434204n;

    public s(va.z zVar, int i17, int i18) {
        super(zVar, i17, i18);
        this.f434204n = new java.lang.ref.ReferenceQueue();
    }

    @Override // va.m
    public void d() {
        do {
        } while (this.f434204n.poll() != null);
    }

    @Override // va.m
    public void e() {
        a(this.f434204n);
    }

    @Override // va.m
    public va.m j() {
        return this;
    }
}
