package f0;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f258273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(yz5.q qVar) {
        super(4);
        this.f258273d = qVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        f0.x $receiver = (f0.x) obj;
        ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e($receiver) ? 4 : 2;
        }
        if ((intValue & com.tencent.mm.plugin.appbrand.jsapi.a8.CTRL_INDEX) == 130) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        this.f258273d.invoke($receiver, oVar, java.lang.Integer.valueOf(intValue & 14));
        return jz5.f0.f302826a;
    }
}
