package cr0;

/* loaded from: classes12.dex */
public final class q extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr0.r f221719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cr0.r rVar, cr0.r rVar2) {
        super(rVar, rVar2);
        this.f221719e = rVar;
    }

    @Override // rh.o2
    public rh.d3 a() {
        cr0.r rVar = (cr0.r) this.f395485b;
        java.lang.String str = rVar.f221725d;
        cr0.r rVar2 = this.f221719e;
        java.lang.Number number = rh.p2.a(rVar2.f221726e, rVar.f221726e).f395552a;
        kotlin.jvm.internal.o.f(number, "get(...)");
        int intValue = number.intValue();
        java.lang.Number number2 = rh.p2.a(rVar2.f221727f, rVar.f221727f).f395552a;
        kotlin.jvm.internal.o.f(number2, "get(...)");
        return new cr0.r(str, intValue, number2.longValue());
    }
}
