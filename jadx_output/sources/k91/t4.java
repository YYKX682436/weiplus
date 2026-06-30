package k91;

/* loaded from: classes7.dex */
public class t4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f305771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k91.d5 f305772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k91.c5 f305773g;

    public t4(java.lang.String str, boolean z17, k91.d5 d5Var, k91.c5 c5Var) {
        this.f305770d = str;
        this.f305771e = z17;
        this.f305772f = d5Var;
        this.f305773g = c5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        boolean z17 = this.f305771e;
        java.lang.String str = this.f305770d;
        android.util.Pair i17 = com.tencent.mm.plugin.appbrand.config.q.i(str, z17 && com.tencent.mm.plugin.appbrand.config.q.k(str), null, new k91.s4(this), pBool);
        k91.c5 c5Var = this.f305773g;
        if (c5Var != null) {
            java.lang.Object obj = i17.second;
            c5Var.a(obj == null ? k91.b5.RET_HIT_FREQUENCY_LIMIT : (((com.tencent.mm.modelbase.f) obj).f70615a == 0 && ((com.tencent.mm.modelbase.f) obj).f70616b == 0) ? pBool.value ? k91.b5.RET_UPDATED : k91.b5.RET_NO_UPDATE : k91.b5.RET_CGI_FAIL, (k91.v5) i17.first);
        }
    }
}
