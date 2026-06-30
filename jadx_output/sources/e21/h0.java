package e21;

/* loaded from: classes11.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f246524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f246525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.g25 f246526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e21.i0 f246527g;

    public h0(e21.i0 i0Var, xg3.q0 q0Var, int i17, r45.g25 g25Var) {
        this.f246527g = i0Var;
        this.f246524d = q0Var;
        this.f246525e = i17;
        this.f246526f = g25Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        e21.l0 l0Var = this.f246527g.f246535m;
        int b17 = this.f246524d.b();
        r45.g25 g25Var = this.f246526f;
        l0Var.c(b17, this.f246525e, g25Var == null ? "" : g25Var.f374842e, g25Var != null ? g25Var.f374841d : "");
    }
}
