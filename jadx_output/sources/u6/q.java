package u6;

/* loaded from: classes13.dex */
public final class q implements u6.g {

    /* renamed from: a, reason: collision with root package name */
    public final d7.i0 f424860a;

    public q(java.io.InputStream inputStream, x6.b bVar) {
        d7.i0 i0Var = new d7.i0(inputStream, bVar);
        this.f424860a = i0Var;
        i0Var.mark(5242880);
    }

    @Override // u6.g
    public java.lang.Object a() {
        d7.i0 i0Var = this.f424860a;
        i0Var.reset();
        return i0Var;
    }

    @Override // u6.g
    public void h() {
        this.f424860a.release();
    }
}
