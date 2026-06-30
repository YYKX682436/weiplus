package lm2;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm2.h0 f319376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f319377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.c f319378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(lm2.h0 h0Var, java.lang.String str, lm2.c cVar) {
        super(0);
        this.f319376d = h0Var;
        this.f319377e = str;
        this.f319378f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lm2.h0 h0Var = this.f319376d;
        java.lang.String str = this.f319377e;
        lm2.j0 d17 = h0Var.d(str);
        if (d17 != null) {
            lm2.h0.a(this.f319376d, "post", kz5.b0.c(this.f319378f), d17.f319411d, d17, (lm2.o) h0Var.f319397d.get(str));
        }
        return jz5.f0.f302826a;
    }
}
