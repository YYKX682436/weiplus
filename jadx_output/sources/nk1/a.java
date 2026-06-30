package nk1;

/* loaded from: classes7.dex */
public final class a implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final nk1.c f337946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r9.q f337947b;

    public a(android.content.Context context, r9.k0 k0Var, nk1.c baseDataSource, r9.q realDataSource, int i17, kotlin.jvm.internal.i iVar) {
        realDataSource = (i17 & 8) != 0 ? new r9.q(context, k0Var, baseDataSource) : realDataSource;
        kotlin.jvm.internal.o.g(baseDataSource, "baseDataSource");
        kotlin.jvm.internal.o.g(realDataSource, "realDataSource");
        this.f337946a = baseDataSource;
        this.f337947b = realDataSource;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        return this.f337947b.a(bArr, i17, i18);
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        return this.f337947b.b(nVar);
    }

    @Override // r9.k
    public void close() {
        this.f337947b.close();
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        return this.f337947b.getUri();
    }
}
