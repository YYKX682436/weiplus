package dz0;

/* loaded from: classes5.dex */
public final class f0 implements ly0.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f244838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dz0.k0 f244840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244841d;

    public f0(kotlin.jvm.internal.e0 e0Var, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, dz0.k0 k0Var, java.lang.String str) {
        this.f244838a = e0Var;
        this.f244839b = maasSdkUIC;
        this.f244840c = k0Var;
        this.f244841d = str;
    }

    @Override // ly0.o
    public void a(int i17) {
        kotlin.jvm.internal.e0 e0Var = this.f244838a;
        e0Var.f310115d += 0.25f / this.f244839b.f69798v.size();
        if (e0Var.f310115d > 0.75f) {
            e0Var.f310115d = 0.75f;
        }
        az0.e eVar = this.f244840c.f244902a;
        if (eVar != null) {
            ((mz0.w1) eVar).a(this.f244841d, e0Var.f310115d);
        }
    }

    @Override // ly0.o
    public void b() {
        kotlin.jvm.internal.e0 e0Var = this.f244838a;
        e0Var.f310115d += 0.25f / this.f244839b.f69798v.size();
        if (e0Var.f310115d > 0.5f) {
            e0Var.f310115d = 0.5f;
        }
        az0.e eVar = this.f244840c.f244902a;
        if (eVar != null) {
            ((mz0.w1) eVar).a(this.f244841d, e0Var.f310115d);
        }
    }

    @Override // ly0.o
    public void c(int i17) {
        kotlin.jvm.internal.e0 e0Var = this.f244838a;
        e0Var.f310115d += 0.25f / this.f244839b.f69798v.size();
        if (e0Var.f310115d > 0.25f) {
            e0Var.f310115d = 0.25f;
        }
        az0.e eVar = this.f244840c.f244902a;
        if (eVar != null) {
            ((mz0.w1) eVar).a(this.f244841d, e0Var.f310115d);
        }
    }

    @Override // ly0.o
    public void d(int i17) {
    }
}
