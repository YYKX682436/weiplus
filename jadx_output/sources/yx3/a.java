package yx3;

/* loaded from: classes15.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.j f467887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx3.c f467888e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yx3.j jVar, vx3.c cVar) {
        super(0);
        this.f467887d = jVar;
        this.f467888e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yx3.j jVar = this.f467887d;
        m8.i0 i0Var = new m8.i0(jVar.f467908c, jVar.f467909d, new m8.c(new r9.o(true, 65536), 15000, 30000, 2500L, 5000L));
        jVar.f467911f = i0Var;
        i0Var.j(this.f467888e.f441271b);
        return jz5.f0.f302826a;
    }
}
