package q9;

/* loaded from: classes15.dex */
public final class a implements q9.l {

    /* renamed from: a, reason: collision with root package name */
    public final r9.e f360839a;

    public a(r9.e eVar) {
        this.f360839a = eVar;
    }

    @Override // q9.l
    public q9.m a(d9.k0 k0Var, int[] iArr) {
        long j17 = 25000;
        return new q9.b(k0Var, iArr, this.f360839a, 800000, 10000, j17, j17, 0.75f);
    }
}
