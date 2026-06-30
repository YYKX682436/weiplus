package r9;

/* loaded from: classes7.dex */
public final class r implements r9.j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f393413a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k0 f393414b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.j f393415c;

    public r(android.content.Context context, r9.k0 k0Var, r9.j jVar) {
        this.f393413a = context.getApplicationContext();
        this.f393414b = k0Var;
        this.f393415c = jVar;
    }

    @Override // r9.j
    public r9.k createDataSource() {
        return new r9.q(this.f393413a, this.f393414b, this.f393415c.createDataSource());
    }
}
