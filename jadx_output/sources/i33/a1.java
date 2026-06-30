package i33;

/* loaded from: classes10.dex */
public final class a1 implements f60.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i33.b1 f288158a;

    public a1(i33.b1 b1Var) {
        this.f288158a = b1Var;
    }

    @Override // f60.a
    public void a() {
        i33.b1 b1Var = this.f288158a;
        if (b1Var.f288162g.f58297h < 0 || ((java.util.ArrayList) b1Var.f288163h).size() < b1Var.f288162g.f58297h) {
            b1Var.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((java.util.ArrayList) b1Var.f288163h).add(java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
