package wo;

/* loaded from: classes12.dex */
public class h0 extends wo.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final wo.q0 f447715d;

    public h0(wo.q0 q0Var) {
        super(q0Var);
        this.f447715d = new wo.s0(258);
    }

    @Override // wo.r0
    public java.lang.String b() {
        java.lang.String a17 = this.f447715d.a("1234567890ABCDEF");
        if ("1234567890ABCDEF".equals(a17)) {
            return null;
        }
        wo.x0.a(1064, 0, 1, true);
        return a17;
    }

    @Override // wo.r0
    public void c() {
    }

    @Override // wo.r0
    public void d() {
        wo.x0.a(1064, 3, 1, true);
    }
}
