package cr0;

/* loaded from: classes12.dex */
public final class v2 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr0.w2 f221782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(cr0.w2 w2Var, cr0.w2 w2Var2) {
        super(w2Var, w2Var2);
        this.f221782e = w2Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        cr0.w2 w2Var = (cr0.w2) this.f395485b;
        java.lang.String str = w2Var.f221797d;
        cr0.w2 w2Var2 = this.f221782e;
        java.lang.Number number = rh.p2.a(w2Var2.f221798e, w2Var.f221798e).f395552a;
        kotlin.jvm.internal.o.f(number, "get(...)");
        int intValue = number.intValue();
        java.lang.Number number2 = rh.p2.a(w2Var2.f221799f, w2Var.f221799f).f395552a;
        kotlin.jvm.internal.o.f(number2, "get(...)");
        return new cr0.w2(str, intValue, number2.longValue());
    }
}
