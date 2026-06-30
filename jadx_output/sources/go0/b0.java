package go0;

/* loaded from: classes14.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo0.b0 f273739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(go0.f0 f0Var, lo0.b0 b0Var) {
        super(0);
        this.f273738d = f0Var;
        this.f273739e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.a aVar;
        go0.f1 f1Var = this.f273738d.f273767p;
        if (f1Var != null) {
            lo0.b0 b0Var = this.f273739e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFilterConfig filterConfig:");
            sb6.append(b0Var != null ? b0Var.toString() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveTexEditRenderer", sb6.toString());
            if (b0Var != null) {
                f1Var.L = b0Var;
                go0.t1 t1Var = f1Var.I;
                if (t1Var != null && (aVar = t1Var.f273856c) != null) {
                    java.lang.String str = b0Var.f319972f;
                    boolean z17 = b0Var.f319968b && com.tencent.mm.vfs.w6.j(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveFilterProcessTex", "updateFilterConfig, needFilter:" + z17 + ", [" + b0Var.f319974h + ", " + str + ']');
                    if (z17) {
                        rh0.d0 d0Var = aVar.f273730f;
                        kotlin.jvm.internal.o.d(d0Var);
                        rh0.d0.a(d0Var, null, 0.0f, 2, null);
                        rh0.d0 d0Var2 = aVar.f273730f;
                        kotlin.jvm.internal.o.d(d0Var2);
                        ((p05.l4) d0Var2).h(str, (float) b0Var.f319974h);
                    } else {
                        rh0.d0 d0Var3 = aVar.f273730f;
                        kotlin.jvm.internal.o.d(d0Var3);
                        rh0.d0.a(d0Var3, null, 0.0f, 2, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
