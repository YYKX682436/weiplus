package cr0;

/* loaded from: classes12.dex */
public final class c0 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr0.d0 f221600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(cr0.d0 d0Var, cr0.d0 d0Var2) {
        super(d0Var, d0Var2);
        this.f221600e = d0Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        cr0.d0 d0Var = (cr0.d0) this.f395485b;
        java.lang.String str = d0Var.f221604d;
        java.lang.Number number = rh.p2.a(this.f221600e.f221605e, d0Var.f221605e).f395552a;
        kotlin.jvm.internal.o.f(number, "get(...)");
        return new cr0.d0(str, number.longValue());
    }
}
