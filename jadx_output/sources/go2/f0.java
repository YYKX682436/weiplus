package go2;

/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f273973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f273975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f273976g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f273977h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(go2.a1 a1Var, java.lang.String str, android.content.Context context, boolean z17, boolean z18) {
        super(1);
        this.f273973d = a1Var;
        this.f273974e = str;
        this.f273975f = context;
        this.f273976g = z17;
        this.f273977h = z18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var;
        com.tencent.mm.ui.widget.dialog.y1 y1Var2;
        r45.xr0 xr0Var;
        r45.xr0 xr0Var2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            eo2.f.f255565a.g(this.f273974e, fVar);
        }
        if (!((fVar == null || (xr0Var2 = (r45.xr0) fVar.f70618d) == null || xr0Var2.f390352e != 1) ? false : true)) {
            if (!((fVar == null || (xr0Var = (r45.xr0) fVar.f70618d) == null || xr0Var.f390352e != 2) ? false : true)) {
                if (!this.f273976g) {
                    com.tencent.mm.ui.widget.dialog.y1 y1Var3 = this.f273973d.f273953m;
                    if ((y1Var3 != null && y1Var3.f()) && (y1Var2 = this.f273973d.f273953m) != null) {
                        y1Var2.q();
                    }
                    go2.a1 a1Var = this.f273973d;
                    a1Var.f273953m = a1Var.U6(this.f273975f, this.f273974e, 0);
                } else if (this.f273977h) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderMemberPayUIC", "doRetry");
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    go2.a1 a1Var2 = this.f273973d;
                    if (currentTimeMillis - a1Var2.f273951h > a1Var2.f273952i) {
                        a1Var2.f273951h = currentTimeMillis;
                        ((ku5.t0) ku5.t0.f312615d).k(new go2.e0(this.f273973d, this.f273975f, this.f273974e, this.f273976g), 2000L);
                    }
                }
                return jz5.f0.f302826a;
            }
        }
        go2.a1 a1Var3 = this.f273973d;
        a1Var3.f273948e = false;
        com.tencent.mm.ui.widget.dialog.y1 y1Var4 = a1Var3.f273953m;
        if ((y1Var4 != null && y1Var4.f()) && (y1Var = this.f273973d.f273953m) != null) {
            y1Var.q();
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f273973d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(activity).c(zy2.g8.class))).f417974d.M0(this.f273974e);
        go2.a1 a1Var4 = this.f273973d;
        android.content.Context context = this.f273975f;
        java.lang.String str = this.f273974e;
        r45.xr0 xr0Var3 = (r45.xr0) fVar.f70618d;
        a1Var4.f273953m = a1Var4.U6(context, str, xr0Var3 != null ? xr0Var3.f390352e : 0);
        return jz5.f0.f302826a;
    }
}
